package me.kodysimpson;

public class Main {

    public static void main(String[] args) {

        //If Statements to Conditionally Branch your Code

        //An if statement is a statement in code that executes a condition, and
        //if that condition is true it will run the block of code in the branch.

        //If statements are one of a couple of "Control Flow" statements available
        //in the Java language. Controlling the flow of your program is the concept
        //of your code dynamically taking a different
        //route and running differently depending on the conditions of the program, say
        //some number you got from input or anything.

        //Anatomy of an If Statement
        //If the condition within the parenthesis evals to true, the code in the brackets
        //or the "branch" will run.
        //if (condition){
            //code
        //}

        int myAge = 20;
        int requiredAge = 20;
        //This is an if statement that checks to see if the age is equal to the required age
        if (myAge == requiredAge){
            System.out.println("Wow, you are really cool.");
        }

        //An if statement with an else statement on the end
        if (myAge == requiredAge){
            System.out.println("Wow, you are really cool.");
        }else{ //if the condition above is false, the else statement will run
            System.out.println("You suck.");
        }

        //If Statements with Multiple Conditions
        if (myAge < 18){
            System.out.println("You are a minor.");
        }else if (myAge >= 18 && myAge < 70){
            System.out.println("You are an adult.");
        }else if (myAge >= 70 && myAge < 100){
            System.out.println("Wow, you are getting old.");
        }else{ //if myAge >= 100, only runs if the above conditions are not met
            System.out.println("You are still alive?!?! That is impressive.");
        }

        //Nested If-Statements
        //When you put one if statement within another, that is known as nesting. Just like a Russian nesting doll.
        // The more nesting you do, the more complex your program can get.
        if (myAge < 18){ //if myAge is less than 18
            System.out.println("You are a minor.");
        }else if (myAge >= 18 && myAge < 70){ //if myAge is greater than or equal to 18 and less than 70
            System.out.println("You are an adult.");
            if (myAge == 20){ //if myAge is equal to 20
                System.out.println("You are 20.");
            }
        }

        //////////////////////////////////////////////////////////
        //Single Line If Statements for concise code
        //////////////////////////////////////////////////////////

        //If the code within the if statement is only one line long, you don't need the brackets
        if(1 + 1 == 2)
            System.out.println("1 + 1 = 2");
        else
            System.out.println("1 + 1 != 2");

        //More examples
        if(1 + 1 == 2)
            System.out.println("1 + 1 = 2");
        else if(1 + 1 == 3)
            System.out.println("1 + 1 = 3");
        else
            System.out.println("1 + 1 != 2 or 3");

        //A nested example
        if(1 + 1 == 2)
            if(1 + 1 != 3) System.out.println("1 + 1 != 3");
        else if(1 + 1 == 4) System.out.println("1 + 1 = 4");
        else System.out.println("1 + 1 != 2 or 3 or 4");

    }

}
