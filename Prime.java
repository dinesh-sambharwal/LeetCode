public class Prime {
    static void printPrime(int a, int b){
        for (int i = a+1; i < b; i++){
            if(i < 2){
                continue;
            } else{
                int j = 2;
                boolean isPrime = true;
                while(j < i){
                    if(i%j==0){
                        isPrime = false;
                        break;
                    }
                    j++;
                }
                if(isPrime){
                    System.out.print(i+" ");
                }
            }
        }
    }
    public static void main(String[] args){
        printPrime(2,99);
    }
}