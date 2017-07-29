package chapter10;
import chapter10.controller.*;

public class GreenHouseController {
    public static void main(String[] args) {
        GreenHouseControls gc = new GreenHouseControls();

        gc.addEvent(gc.new Bell(1000));

        Event[] events = {
            gc.new LightOn(200),
            gc.new LightOff(200)
        };

//        gc.addEvent(gc.new Restart(2000, events));

        if (args.length == 1) {
            gc.addEvent(
                new GreenHouseControls.Terminate(20)
            );
        }
        gc.run();
    }
}