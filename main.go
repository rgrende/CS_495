package main

//GO imports
import (
	"fyne.io/fyne/v2"
	"fyne.io/fyne/v2/app"
	"fyne.io/fyne/v2/canvas"
	"fyne.io/fyne/v2/container"
	"fyne.io/fyne/v2/theme"
	"fyne.io/fyne/v2/widget"
	"golang.org/x/crypto/bcrypt"
	"log"
	"os"
)

//file as a string
type Image struct {
	File string
}

//main function
func main() {
	//initializing variable for user input password
	var password string

	//create new window
	a := app.New()
	a.Settings().SetTheme(theme.DarkTheme())

	w := a.NewWindow("Password Hasher")
	w.Resize(fyne.NewSize(800, 400))
	theme.ForegroundColor()

	enter := widget.NewLabel("Enter a Password to Hash:")
	newPass := widget.NewLabel("")
	input := widget.NewEntry()
	img := canvas.NewImageFromFile("us_map.png")
	img.FillMode = canvas.ImageFillOriginal

	//adding all to the window
	w.SetContent(container.NewVBox(
		img,
		enter,
		input,
		//hash password
		widget.NewButton("Encrypt", func() {
			hashedPass, err := bcrypt.GenerateFromPassword([]byte(password), bcrypt.DefaultCost)
			if err != nil { //throws an error
				panic(err)
			}
			newPass.SetText("Hashed Password: " + string(hashedPass))
			err = bcrypt.CompareHashAndPassword(hashedPass, []byte(password))
			log.Println("New Password:", input.Text)
		}),
		//show hashed password
		newPass,
		widget.NewButton("Exit Code", func() {
			os.Exit(1)
		}),
	))
	//show and run window
	w.ShowAndRun()
}
