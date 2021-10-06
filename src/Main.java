public class Main {
    public static void main(String[] args){
        Xbox ONE = new Xbox();
        Playstation PSFive = new Playstation();
        JoystickOfXbox joystickOfXbox = new JoystickOfXbox(ONE);
        JoystickOfPlaystation joystickOfPlaystation = new JoystickOfPlaystation(PSFive);
        System.out.println(joystickOfXbox.getPrice());
        System.out.println(joystickOfPlaystation.getPrice());
    }
}
