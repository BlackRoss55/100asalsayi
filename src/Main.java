//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a,i=1,b,c=1,d=1;
        System.out.println("asal sayılar");
        for(i=2;i<=100;i++){
            boolean Asal=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    Asal = false;
                    break;
                }
            }
            if(Asal){
                System.out.println(i);
            }
        }
    }
}