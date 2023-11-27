
public class HomeTheaterTestDrive {
    
    public static void main(String[] args) {

        System.out.println("In main method");
        
        Amplifier amp = new Amplifier("Amplifier");
        Tuner tuner = new Tuner("AM/FM Tuner",amp);
        StreamingPlayer player = new StreamingPlayer("Streaming Player", amp);
        CdPlayer cd = new CdPlayer("CD Player", amp);
        Projector projector = new Projector("Projector", player);
        TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
        Screen screen = new Screen("Theatre Screen");
        PopcornPopper popper = new PopcornPopper("Popcorn popper");

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, player, projector, lights, screen, popper);


        homeTheater.watchMovie("Bahubali - The Beginning");
        homeTheater.endMovie();

    }

}
