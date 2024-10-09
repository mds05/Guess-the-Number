import java.util.Random;
public class DifficultyLevel {
    public void diffNames(){
        System.out.println("A for Easy(0 to 10)");
        System.out.println("B for Medium(0 to 50)");
        System.out.println("C for Hard(0 to 100)");
    }
    public int rand(char c){
        Random ran=new Random();
        int r=0;
        if(c=='A'||c=='a'){
            r=ran.nextInt(10);
        }
        else if(c=='B'||c=='b'){
            r=ran.nextInt(50);
        }
        else if(c=='C'||c=='c'){
            r=ran.nextInt(100);
        }
        return r;
    }
}
