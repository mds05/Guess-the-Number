import java.util.*;
public class RandomGame{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Would you like to play a game with me? Press 'a' for yes and 'b' for no");
        char ch=sc.next().charAt(0);
        int ans;
        int user;
        while(true){
        if(ch=='B'||ch=='b'){
            System.out.println("Game exited.");
        }
        else if(ch=='A'||ch=='a'){
            System.out.println("Choose difficulty level:");
            DifficultyLevel d=new DifficultyLevel();
            d.diffNames();
            ch=sc.next().charAt(0);
            ans=d.rand(ch);
            System.out.println("Now guess the correct number that the computer generated");
            user=sc.nextInt();
            if(user==ans){
                System.out.println("Congratulations! Your guess is correct.");
            }
            else{
                System.out.printf("Incorrect.The computer's answer is %d\n",ans);
                System.out.println("Would you like to try again?Press 'a' for yes and 'b' for no");
                ch=sc.next().charAt(0);
                if(ch=='B'||ch=='b'){
                    System.out.println("Game exited.");
                    break;
                }
                else if(ch=='A'||ch=='a'){
                    continue;
                }
            }
        }
        else{
            System.out.println("Incorrect input. Try again");
        }
    }
    }
}