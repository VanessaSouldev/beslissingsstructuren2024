public class Main {
    public static void main(String[] args) {
        int number = 6;
        int input1 = 4;
        int input2 = 20;
        String name = "Henk";


        hello();
        positiveOrNegative(number);
        positiveOrZeroOrNegative(number);
        bartender(name);
        sum(input1, input2);


    }
    public static void hello() {
        System.out.println("Hello world!");
    }

    public static void positiveOrNegative(int number) {
        if(number > 0) {
            System.out.println("number is positive");
        }
        else {
            System.out.println("number is negative");
        }
    }

    public static void positiveOrZeroOrNegative(int number) {
        if(number > 0) {
            System.out.println("number is positive");
        }
        else if (number == 0) {
            System.out.println("This number is zero");
        }
        else {
            System.out.println("number is negative");
        }
    }

    public static void bartender(String name) {
        switch (name) {
            case "Henk":
                System.out.println("Henk drinkt graag gin & tonic");
                break;
            case "Vanessa":
                System.out.println("Vanessa drinkt graag campari soda");
                break;
            default:
                System.out.println("Wat kan ik voor je inschenken, " + name +"?");
        }


    }

    private static void sum(int input1, int input2) {
        System.out.println(input1 + " summed up by " + input2 + " adds up to " + (input1 + input2));

    }
}