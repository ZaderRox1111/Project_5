package p5_package;

public class PolyMultiplierClass_II_S4
   {

      // The overall goal of the project is to multiply different sets of polynomials
      
      //Create constants we need and instantiate the conIO class
      //Display title
      //Get what degree form the user wants
      //Check if it is not in the bounds
      //If in the bounds, use the degree form to get the right amount of coefficients
      //Do the necessary calculations
      //Either display the final result or the error message
      //End the program
      
      //Create constants like title width and double dash and two endlines
      private static final char DOUBLE_DASH = '=';
      private static final int TITLE_WIDTH = 32;
      private static final int TWO_ENDLINES = 2;
      
      //Instantiate the conIO class
      private static Console_IO_Class conIO = new Console_IO_Class();
            
      public static void main(String[] args)
         {
            // TODO Auto-generated method stub

            //Create variables, coefficients, multipliers
            int coef_A, coef_B, coef_C, coef_D, coef_E, coef_F;
            int mult_1, mult_2, mult_3, mult_4, mult_5;
            int degreeForm;
            boolean notWithinBounds = false;
            
            //Display title
             //Method: printString, printEndline, printChars
            conIO.printString("Polynomial Calculator, Part Deux");
            conIO.printEndline();
            conIO.printChars(TITLE_WIDTH, DOUBLE_DASH);
            conIO.printEndlines(TWO_ENDLINES);
            
            //Display the purpose of the program, and what the degree forms are
             //Method: printString, printEndline
            conIO.printString("Multiplies a first degree polynomial");
            conIO.printEndline();
            conIO.printString("by a first degree form: ( ax + b ) * ( cx + d )");
            conIO.printEndline();
            conIO.printString("or by a second degree form: ( ax + b ) * ( cx^2 + dx + e )");
            conIO.printEndline();
            conIO.printString("or by a third degree form: ( ax + b ) * ( cx^3 + dx^2 + ex + f )");
            conIO.printEndline();
            conIO.printString("depending on user selection.");
            conIO.printEndlines(TWO_ENDLINES);
            
            //Ask what degree form is going to be used
             //Method: promptForInt
            degreeForm = conIO.promptForInt("Enter Degree Form (1-3): ");
            
            //Check if the input is within the bounds 1-3
            //If not, skip over all other steps and set the notWithinBounds flag
            if (degreeForm > 3 || degreeForm < 1) 
            {
               notWithinBounds = true;
               
               //display an error message
               conIO.printEndline();
               conIO.printString("Incorrect number of polynomial degrees entered - Program Aborted");
               conIO.printEndline();
            } 
            
            else 
            {
               
               if (degreeForm == 1) 
               {
                //If it is within the bounds use the degree form to determine which calculation to do and how many coefficients to get
                  //If it is 1, get 4 coefficients from the user
                    //Method: promptForInt
                  coef_A = conIO.promptForInt("Enter coefficient a: ");  
                  coef_B = conIO.promptForInt("Enter coefficient b: ");
                  coef_C = conIO.promptForInt("Enter coefficient c: ");
                  coef_D = conIO.promptForInt("Enter coefficient d: ");
                  
                   //Do the calculations
                    //a*c = multiplier1
                    //a*d+c*b = multiplier2
                    //b*d = multiplier3
                  mult_1 = coef_A * coef_C;
                  mult_2 = coef_A * coef_D + coef_C * coef_B;
                  mult_3 = coef_B * coef_D;
                  
                   //Display final result using the multipliers
                    //Method: printString, printInt
                  conIO.printEndline();
                  conIO.printString("Result:");
                  conIO.printEndline();
                  conIO.printString("( ");
                  conIO.printInt(coef_A);
                  conIO.printString("x + ");
                  conIO.printInt(coef_B);
                  conIO.printString(" )*( ");
                  conIO.printInt(coef_C);
                  conIO.printString("x + ");
                  conIO.printInt(coef_D);
                  conIO.printString(" ) = ");
                  conIO.printInt(mult_1);
                  conIO.printString("x^2 + ");
                  conIO.printInt(mult_2);
                  conIO.printString("x + ");
                  conIO.printInt(mult_3);
                  conIO.printEndline();
               }
               
               else if (degreeForm == 2)
               {
                //Otherwise if it is 2, get 5 coefficients from the user
                  //Method: promptForInt
                  coef_A = conIO.promptForInt("Enter coefficient a: ");  
                  coef_B = conIO.promptForInt("Enter coefficient b: ");
                  coef_C = conIO.promptForInt("Enter coefficient c: ");
                  coef_D = conIO.promptForInt("Enter coefficient d: ");
                  coef_E = conIO.promptForInt("Enter coefficient e: ");
                  
                 //Do the calculations
                  //a*c = multiplier1
                  //a*d+c*b = multiplier2
                  //b*d+a*e = multiplier3
                  //b*e = multiplier4
                  mult_1 = coef_A * coef_C;
                  mult_2 = coef_A * coef_D + coef_C * coef_B;
                  mult_3 = coef_B * coef_D + coef_A * coef_E;
                  mult_4 = coef_B * coef_E;
                  
                 //Display final result using the multipliers
                  //Method: printString, printInt
                  conIO.printEndline();
                  conIO.printString("Result:");
                  conIO.printEndline();
                  conIO.printString("( ");
                  conIO.printInt(coef_A);
                  conIO.printString("x + ");
                  conIO.printInt(coef_B);
                  conIO.printString(" )*( ");
                  conIO.printInt(coef_C);
                  conIO.printString("x + ");
                  conIO.printInt(coef_D);
                  conIO.printString(" ) = ");
                  conIO.printInt(mult_1);
                  conIO.printString("x^3 + ");
                  conIO.printInt(mult_2);
                  conIO.printString("x^2 + ");
                  conIO.printInt(mult_3);
                  conIO.printString("x + ");
                  conIO.printInt(mult_4);
                  conIO.printEndline();
               }
               
               else if (degreeForm == 3)
               {
                //Otherwise If it is 3, get 6 coefficients from the user
                  //Method: promptForInt
                  coef_A = conIO.promptForInt("Enter coefficient a: ");  
                  coef_B = conIO.promptForInt("Enter coefficient b: ");
                  coef_C = conIO.promptForInt("Enter coefficient c: ");
                  coef_D = conIO.promptForInt("Enter coefficient d: ");
                  coef_E = conIO.promptForInt("Enter coefficient e: ");
                  coef_F = conIO.promptForInt("Enter coefficient f: ");
                  
                 //Do the calculations
                  //a*c = multiplier1
                  //a*d+c*b = multiplier2
                  //b*d+a*e = multiplier3
                  //b*e+a*f = multiplier4
                  //b*f = multiplier5
                  mult_1 = coef_A * coef_C;
                  mult_2 = coef_A * coef_D + coef_C * coef_B;
                  mult_3 = coef_B * coef_D + coef_A * coef_E;
                  mult_4 = coef_B * coef_E + coef_A * coef_F;
                  mult_5 = coef_B * coef_F;
                  
                 //Display final result using the multipliers
                  //Method: printString, printInt
                  conIO.printEndline();
                  conIO.printString("Result:");
                  conIO.printEndline();
                  conIO.printString("( ");
                  conIO.printInt(coef_A);
                  conIO.printString("x + ");
                  conIO.printInt(coef_B);
                  conIO.printString(" )*( ");
                  conIO.printInt(coef_C);
                  conIO.printString("x + ");
                  conIO.printInt(coef_D);
                  conIO.printString(" ) = ");
                  conIO.printInt(mult_1);
                  conIO.printString("x^4 + ");
                  conIO.printInt(mult_2);
                  conIO.printString("x^3 + ");
                  conIO.printInt(mult_3);
                  conIO.printString("x^2 + ");
                  conIO.printInt(mult_4);
                  conIO.printString("x + ");
                  conIO.printInt(mult_5);
                  conIO.printEndline();
               }
            
            }
            
            //End Program
            conIO.printEndline();
            conIO.printString("End Program");
            
         }

   }
