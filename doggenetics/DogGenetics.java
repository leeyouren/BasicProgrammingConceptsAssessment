package doggenetics;

import java.util.Random;
import java.util.Scanner;

public class DogGenetics {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Random myRandomizer = new Random();
        
        String dogName;
        String[] dogBreeds = {
        "St. Bernard",
        "Chihuahua",
        "Dramatic RedNosed Asian Pug",
        "Common Cur",
        "King Doberman"
        };
        int a = myRandomizer.nextInt(101);
        int b = myRandomizer.nextInt(101-a);
        int c = myRandomizer.nextInt(101-a-b);
        int d = myRandomizer.nextInt(101-a-b-c);
        int e = 100-a-b-c-d;
        
        int[] randomPercentages = {a, b, c, d, e};
       
        System.out.println("What is your dog name?");
        System.out.println("");
        
        dogName = myScanner.nextLine();
        
        for (int i=0; i<5;i++){
            System.out.println(dogName + " is " + randomPercentages[i] + "% " + dogBreeds[i] + ".");
        
        }
        System.out.println("Wow, that's QUITE the dog!");    
    }
    
}
