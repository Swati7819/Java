public class RandomNumber {
    public static void main(String[] args) {
        //generating a random number

        // double a = Math.random();
        // System.out.println(a);

        //generating random number between a range
        int min= 1000, max= 9999;
        System.out.println((int)(Math.random()*(max-min+1)+min));  


    }
    
}
