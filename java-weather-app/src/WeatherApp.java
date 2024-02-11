import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class WeatherApp extends JFrame {
    // setup gui and add a title
    public WeatherApp(){
        super("Wonderland Weather App");

        // configure giu to end program's process once it has been closed
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // set the sice of the GUI in pixels
        setSize(450, 650);

        // this load the gui at the center of the screen
        setLocationRelativeTo(null);

        // make our layout manager null to manually position our component within the GUI
        setLayout(null);

        // prevent any resize of the GUI
        setResizable(false);

        addGuiComponents();



    }

    private void addGuiComponents(){
        // search field
        JTextField searchTextField =new JTextField();

        // set the location and size of our component
        searchTextField.setBounds(15, 15, 351, 45);

        // change the font style and size
        searchTextField.setFont(new Font("Dialog", Font.PLAIN, 24));

        add(searchTextField);

        //search button
        JButton searchButton = new JButton(loadImage("src/assets/search.png"));

        //change icon to hand cursor when hovering over this button
        searchButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        searchButton.setBounds(375, 13, 47, 45);
        add(searchButton);

        //weather image
        JLabel weatherConditionImage = new JLabel(loadImage("src/assets/cloudy.png"));
        weatherConditionImage.setBounds(0,125, 450, 217);
        add(weatherConditionImage);
    }

    // used to create images on GUI component
    private ImageIcon loadImage(String resourcePath){
        try{
            // read image of the file from path given
            BufferedImage image = ImageIO.read(new File(resourcePath));

            //returns an image icon so that our component and render it
            return new ImageIcon(image);
        } catch(IOException e){
            e.printStackTrace();
        }
        System.out.println("Could not find resource");
        return null;
    }
}
