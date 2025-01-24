// for an input n = 3 output should be 

// 1112
// 3222
// 3334

public class LogicQuestion {
    public static void main(String[] args) {
        int n = 3;
        int count =1;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                for(int j=1;j<=4;j++){
                    if(j==4){
                        System.out.print(count+1);
                    }else{
                        System.out.print(count);
                    }
                }
            }else{
                for(int j=1;j<=4;j++){
                    if(j==1){
                        System.out.print(count+1);
                    }else{
                    System.out.print(count);
                        
                    }
                }
            }
            count++;
            System.out.println();
        }
    }
}

