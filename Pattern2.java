
//Write a code inn java to make this pattern
// *****
// ****
// ***
// **
// *

public class Pattern2 {
    public static void main(String[] args) {
        for(int i = 5 ;i>=1; i--)
        {
            for (int j = 1; j <= i; j++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
