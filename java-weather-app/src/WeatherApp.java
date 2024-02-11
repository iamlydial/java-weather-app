import javax.swing.*;

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

    }
}
