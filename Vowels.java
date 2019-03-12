import java.util.Scanner;
public class Vowels{
    public static void main(String args[]){
        char c;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the characters :");
        c = s.next().charAt(0);
        if(c=='a' || c=='A' || c=='e' || c=='E' ||
        c=='i' || c=='I' || c=='o' || c=='O' ||
        c=='u' || c=='U')
        {
            System.out.print("The character is a Vowel");
        }
        else
        {
            System.out.print("The character is a consonant");
        }
        }
    }
