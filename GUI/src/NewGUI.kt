import java.awt.Image

class NewGUI {
    var imageIcon: ImageIcon = ImageIcon("./img/imageName.png") // load the image to a imageIcon
    var image: Image = imageIcon.getImage() // transform it
    var newimg: Image = image.getScaledInstance(120, 120, Image.SCALE_SMOOTH) // scale it the smooth way
    fun ImageIcon() // transform it back
}