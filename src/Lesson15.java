public class Lesson15 {
    public static void main(String[] args) {

        //Quiz task
        String inputString = "Aa kiu, I swd skieo 236587. GH kui: sieo?? 25.33";

        //Positive scenario
        //All the chars that do NOT belong to:
        //a-z, A-Z, 0-9, SPACE

        int counter = 0; //Outside of loop to retrieve within every iteration

        for (int i = 0; i < inputString.length(); i++) {
            char characterToCheck = inputString.charAt(i); //Goes through every item
            char[] charArray = {characterToCheck};

            String stringToCheck = new String(charArray); //transforms array to string
            if (stringToCheck.matches("[^a-zA-Z0-9\\s]")){ // ^ - except
                counter++;
                System.out.println(String.format("Character %s is matching the REGEX", stringToCheck));
            }

        }
        //prints result when loop is done
        System.out.println(String.format("There were %d occurrences", counter));


        //Negative scenario

        for (int i = 0; i < inputString.length(); i++) {
            char characterToCheck = inputString.charAt(i); //Goes through every item
            char[] charArray = {characterToCheck};

            String stringToCheck = new String(charArray); //transforms array to string
            if (stringToCheck.matches("[\\.\\,\\:\\?]")){ // ^ - except
                counter++;
                System.out.println(String.format("%s character is matching the REGEX", stringToCheck));
            }

        }


    }
}
