import java.util.Scanner;

class PartyAfiliations {
    void main() {
        Scanner in = new Scanner(System.in);

        String partyAfil = "";

       IO.print("Enter your Party Affiliation [D R I]: ");
       partyAfil = in.nextLine();

        /*
       switch(partyAfil)
       {
           case "D":
               IO.println("You get a Democratic Donkey");
               return;
           case "R":
               IO.println("You get a Republican Elephant");
               return;
           case "I":
               IO.println("You get a Independent Person");
               return;
           default:
               IO.println("I don't know what party that is. " + partyAfil);
       }
        */

        if (partyAfil.equalsIgnoreCase("D")) {
            IO.println("You get a Democratic Donkey");
        }
        else if (partyAfil.equalsIgnoreCase("R") ) {
            IO.println("You get a Republican Elephant");
        }
        else if (partyAfil.equalsIgnoreCase("I") ) {
            IO.println("You get a Independent Person");
        }
        else
                IO.println("I don't know what party that is. " + partyAfil);


    }
}