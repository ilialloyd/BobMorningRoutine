import java.sql.Time;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {


    public static double time = 8.15;

    public static void ring(){
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Alarm is ringing!! It is " + df.format(time));
        System.out.println(" 1. Wake up!       2.Snooze");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ring();
        int button =  scan.nextInt();
            int[] arrbutton = {1};
            if (button == 2 ) {
                Alarm.snooze();

                time+=0.15;
            }
        System.out.println();
        ring();
         button =  scan.nextInt();

        if (button == 2 ) {
                Alarm.snoozeattempt2();
                time+=0.15;

            }
        ring();
         button =  scan.nextInt();

            if (button == 1) {
                Alarm.wakinUp();
            }

//        if (button == 1) {
//            Alarm.wakinUp();
//        }

    }



    class Action {
        public static void wake_up() {

            Dog.haww();
            Toaster.toast();
            CoffeeMaker.steams();
            RadioShack.radioWP();
        }

        public static void snooze1() {

            System.out.println("Alarm snoozed for 15 min");
            CoffeeMaker.delay();
            Toaster.hold();
            Dog.bring();
        }

        public static void snooze2() {
            System.out.println("Alarm snoozed for 15 min");
            CoffeeMaker.delay();
            Toaster.hold();
        }


    }

    class Alarm {
        public static void snooze() {
            Action.snooze1();

        }

        public static void snoozeattempt2() {
            Action.snooze2();
        }

        public static void wakinUp() {
            Action.wake_up();

        }

    }



    public void snooze() {
        System.out.println("Alarm is snoozed for 15 minute");
    }


    class BobsAction {
        public void snooze() {
            System.out.println("Delay 10 min");
        }
    }

    class Toaster {
        public static void toast() {
            System.out.println("Toast is toasted!");
        }

        public static void hold() {
            System.out.println("Hold the toast. Bob's snoozing");
        }


    }

    class CoffeeMaker {
        public static void steams() {
            System.out.println("Coffee is steams");
        }

        public static void delay() {
            System.out.println("Coffee is delayed for 15 min...");
        }

    }

    class Dog {
        public static void bring() {
            System.out.println("Dog Sam brings newspaper silently...");
        }

        public static void haww() {
            System.out.println("Dog jumping and barking");
        }

    }

    class RadioShack {
        public static void radioWP() {
            System.out.println("Paper is awaits you");
        }
    }


}