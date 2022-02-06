package Workshop2.view;

import Workshop2.controller.Controller;
import Workshop2.model.Registry;

public class ClubMain {

    public static void main(String[] args) {
        try {
            Console console = new Console();
            console.greetings();
            Registry registry = new Registry();
            Controller controller = new Controller(registry, console);
            controller.ignition();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}