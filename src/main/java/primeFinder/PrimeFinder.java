package primeFinder;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PrimeFinder {

    public void findPrimes(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime end = now.plusMinutes(1);
        int maxPrime = 2;
        for(int i = 2; LocalDateTime.now().isBefore(end); i++){

            boolean isPrime = false;
            LocalDateTime displayInterval = now.plusSeconds(1);
            for(int j = 3; j < i; j++) {
                if(i%j==0) {
                    break;
                }
                int temp = i;
                --temp;
                if(j == temp){
                    isPrime = true;
                }
            }
            if(i> maxPrime && isPrime == true){
                maxPrime = i;
            }
            int abs = Math.abs(now.getSecond() - displayInterval.getSecond());
            if(abs>=1){
                System.out.println(maxPrime);
            }
        }
        System.out.println(maxPrime);
    }
}