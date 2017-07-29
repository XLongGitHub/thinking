package chapter10;

import chapter10.controller.*;

public class GreenHouseControls extends Controller {
    private boolean light = false;

    public class LightOn extends Event {
        LightOn(long delayTime) {
            super(delayTime);
        }

        public void action() {
            light = true;
        }

        public String toString() {
            return "Light is on";
        }
    }

    public class LightOff extends Event {
        LightOff(long delayTime) {
            super(delayTime);
        }

        public void action() {
            light = false;
        }

        public String toString() {
            return "Light is off";
        }
    }

    public class Bell extends Event {

        Bell(long delayTime) {
            super(delayTime);
        }

        public void action() {
            addEvent(new Bell(delayTime));
        }

        public String toString() {
            return "Bing!";
        }
    }

    public class Restart extends Event {
        private Event[] events;

        Restart(long delayTime, Event[] events) {
            super(delayTime);
            this.events = events;
            for (Event e : events) {
                addEvent(e);
            }
        }

        public void action() {
            for (Event e : events) {
                e.start();
                addEvent(e);
            }
            start();
            addEvent(this);
        }

        public String toString() {
            return "Restarting system";
        } 
    }
    
    public static class Terminate extends Event {
        public Terminate(long delayTime) {
            super(delayTime);
        }

        public void action() {
            System.exit(0);
        }

        public String tosString() {
            return "Terminating";
        }
    }
}