package day16;

public class EnumRunner {

    public static void main(String[] args) {
        Level oyun=Level.LOW;

        switch(oyun){
            case LOW:
                System.out.println("Kolay bir oyun");
                break;
            case MEDIUM:
                System.out.println("Orta seviyede bir oyun ");
                break;
            case HIGH:
                System.out.println("Zor bir oyun");
                break;
        }
    }
}

