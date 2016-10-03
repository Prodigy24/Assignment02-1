

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author coulh9904
 */
public class A2Q1 {

    public int DigitalNum(int N) {

        if (N >= 0 && N <= 9) {
            return N;
        }
        //Records the final digit of 'N'
        int R = N % 10;
        //Removes that final digit for another go around
        int D = N / 10;
        //Recall the method, and save the remainder as 'R'
        return DigitalNum(D) + (R);

    }

    public int DigitalRoot(int N) {
        //Check to ensure N is one digit.
        if (N >= 0 && N <= 9) {
            //If it isn't, return N.
            return N;
        }
        //If it is a single digit, send it back to main.
        return DigitalRoot(DigitalNum(N));
    }

    public int Triangle(int N) {
        //If N is 0 or 1, the return would be itself. Thus, base case
        if (N == 0 || N == 1) {
            return N;
        }
        //If it's greater than 1, add the number below N and restart Triangle. Will run until it goes down to base case.
        return N + Triangle(N - 1);

    }

    public int Hailstone(int N) {
        //Base case, stop the sequence at one to a void an infinite loop
        System.out.println(N);
        if (N == 1) {
            return N;
        }
        //Check to see if the integer is even, and acquire the next number in the sequence accordingly
        if (N % 2 == 0) {
            return Hailstone(N / 2);
        } else {
            return Hailstone(3 * N + 1);
        }

    }

    public String BinaryConvert(int N) {
        //Create a string (BinarySave) to run the 1s and 0s.
        String BinaryS = new String();
        //If N mod 2 is 0, we'll need to add a 0 to the string
        if (N % 2 == 0) {
            BinaryS = BinaryS + "0";
        //If N mod 2 is 1, give the string a 1!
        } else if (N % 2 == 1) {
            BinaryS = BinaryS + "1";
        }
        //Once again we'll need to stop at 1 to avoid an infinite loop. Base caseeeee
        if (N <= 1) {
            return BinaryS;
        }
        //Loop it!
        return BinaryConvert(N / 2) + BinaryS;
    }   

    

    public String Convert(int B, int N) {
        //Everyone's favourite base case
        if (N == 1) {
            return "1";
        } else if (N == 0){
            return "";
        }
        //This string will come to hold the converted numbers (>=10)
        String CNum = "";
        
        //If the number turns out to be less than 10, make it s string
        if (N % B < 10) {
            int ans = N % B;
            CNum = String.valueOf (ans);
        // if >= 10, convert it to a number
        } else if (N % B == 10) {
            CNum = "A";
        } else if (N % B == 11) {
            CNum = "B";
        } else if (N % B == 12) {
            CNum = "C";
        } else if (N % B == 13) {
            CNum = "D";
        } else if (N % B == 14) {
            CNum = "E";
        } else if (N % B == 15) {
            CNum = "F";
        } else if (N % B == 16) {
            CNum = "G";
        } else if (N % B == 17) {
            CNum = "H";
    } else if (N % B == 18) {
            CNum = "I";
    } else if (N % B == 19) {
            CNum = "J";
    } else if (N % B == 20) {
            CNum = "K";
        }
        N = N / B;
        //Restart the loop
        return Convert(B , N) + CNum;
        
    }

    public boolean IsPalindrome(String S, int Length) {
        //Uses StringBuilder to run the character count commands
        StringBuilder sBuilder = new StringBuilder(S);
        //Base case me! If the code runs through to this point, the String is palindrome and thus returns true.
        if (S.length() == 1 || S.length() == 0) {
            return true;
        }
        //Counts and checks characters from the front and back of the string
        if (sBuilder.charAt(0) == sBuilder.charAt(Length - 1)) {
            sBuilder.deleteCharAt(Length - 1);
            sBuilder.deleteCharAt(0);
            return IsPalindrome(sBuilder.toString(), Length - 2);
            //If the SBuilder finds they are palindrome, it runs through and the base case will take over and return a true
        } else {
            //If the SBuilder finds that it doesn't match, returns false
            return false;
        }
    }
/**
 * @param args the command line arguments
 */
public static void main(String[] args) {
        // TODO code application logic here
        //Long ago, the four nations lived together in harmony, then, everything changed when the fire nation attacked. Only the avatar, master of all four elements, could stop them. But when the world needed him most, he vanished. A hundred years passed and my brother and I discovered the new Avatar - an Air Bender names Aang. Altjhough his airbending skill were great, he has a lot to learn before he's ready to save anyone.. but I believe, Aang can save the world.
        //Test Question 1
        A2Q1 Test = new A2Q1();
        int Q1 = Test.DigitalNum(345355454);
        System.out.println("Question 1 - " +Q1);
        //Test Question 2
        int Q2 = Test.DigitalRoot(345355454);
        System.out.println("Question 2 - " +Q2);
        //Test Question 3
        int Q3 = Test.Triangle(12);
        System.out.println("Question 3 - " +Q3);
        //Test Question 4
        int Q4 = Test.Hailstone(5);
        System.out.println("Question 4 - " +Q4);
        //Test Question 5
        String Q5 = Test.BinaryConvert(1000);
        System.out.println("Question 5 - " +Q5);
        //Test Question 6
        String Q6 = Test.Convert(16, 1000);
        System.out.println("Question 6 - " + Q6);
        //Test Question 7
        System.out.println("Q7: " + Test.IsPalindrome("radar", 5));
    }
}
