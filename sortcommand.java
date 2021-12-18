package practice;
import java.util.Arrays;
public class sortcommand {




        public static void main (String[]args)

        {
            if (args.length == 0) {

                System.out.println("\n Gourav Atleast ek integer to enter kro.");

                System.exit(0);

            } else {

                Arrays.sort(args);

                System.out.println("\n Maximum number is : " + args[args.length - 1]);

            }

        }


    }
