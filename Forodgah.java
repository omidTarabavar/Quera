import java.util.ArrayList;
import java.util.Scanner;

public class Forodgah {
    public static class Plane{
        int status;
        String id;
        public Plane(int status,String id){
            this.status = status;
            this.id = id;
        }
    }
    static Scanner keyboard = new Scanner(System.in);
    static String[] bounds;
    static ArrayList<Plane> planes = new ArrayList<>();
    static void takeOff(String idOfPlane){
        Plane plane = findPlane(idOfPlane);
        if(plane != null){
            switch (plane.status){
                case 3:{
                    System.out.println("YOU ARE LANDING NOW");
                    break;
                }
                case 2:{
                    System.out.println("YOU ARE TAKING OFF");
                    break;
                }
                case 1:{
                    if(isFullBound()){
                        System.out.println("NO FREE BOUND");
                    }else {
                        plane.status = 2;
                        for(int i = 0 ; i < bounds.length;i++){
                            if(bounds[i] == null){
                                bounds[i] = plane.id;
                                break;
                            }
                        }
                    }
                }
            }
        }else {
            System.out.println("YOU ARE NOT HERE");
        }
    }
    static void landing(String idOfPlane){
        Plane plane = findPlane(idOfPlane);
        if(plane != null){
            switch (plane.status){
                case 1:{
                    System.out.println("YOU ARE HERE");
                    break;
                }
                case 2:{
                    System.out.println("YOU ARE TAKING OFF");
                    break;
                }
                case 3:{
                    System.out.println("YOU ARE LANDING NOW");
                    break;
                }
            }
        }else {
            if(isFullBound()){
                System.out.println("NO FREE BOUND");
            }else {
                Plane newPlane = new Plane(3,idOfPlane);
                for(int i = bounds.length-1;i>=0;i--){
                    if(bounds[i] == null){
                        bounds[i] = newPlane.id;
                        break;
                    }
                }
                planes.add(newPlane);
            }
        }
    }
    static void planeStatus(String id){
        Plane plane = findPlane(id);
        if(plane != null){
            System.out.println(plane.status);
        }else {
            System.out.println(4);
        }
    }
    static void boundStatus(int numberOfBound){
        String id = bounds[numberOfBound-1];
        if(id ==null){
            System.out.println("FREE");
        }else {
            System.out.println(id);
        }
    }
    static boolean isFullBound(){
        for(String bound:bounds){
            if(bound == null){
                return false;
            }
        }
        return true;
    }
    static Plane findPlane(String id){
        for(Plane plane:planes){
            if(plane.id.equals(id)){
                return plane;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int numberOfPlanes = keyboard.nextInt();
        int numberOfBounds = keyboard.nextInt();
        bounds = new String[numberOfBounds];
        for(int i = 0 ; i < numberOfPlanes;i++){
            String planeId = keyboard.next();
            planes.add(new Plane(1,planeId));
        }
        int numberOfInstructions = keyboard.nextInt();
        for(int i = 0 ; i < numberOfInstructions;i++){
            String instruction = keyboard.next();
            if(instruction.equals("TAKE-OFF")){
                String id = keyboard.next();
                takeOff(id);
            }else if(instruction.equals("LANDING")){
                String id = keyboard.next();
                landing(id);
            }else if(instruction.equals("PLANE-STATUS")){
                String id = keyboard.next();
                planeStatus(id);
            }else if(instruction.equals("BAND-STATUS")){
                int boundNumber = keyboard.nextInt();
                boundStatus(boundNumber);
            }
        }
    }
}
