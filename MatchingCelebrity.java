public class MatchingCelebrity{
    public static void main(String[]args){
        System.out.println("Hello! Are you excited to find your perfect celebrity match?");
        System.out.println("We will only need a few information about you, then you will find out! First, when is your date of birth?");
        String birthday = TextIO.getlnString();
        System.out.println("Ok, now a few more things... What is your favorite food?");
        String favoriteFood = TextIO.getlnString();
        System.out.println("What is your horoscope?");
        String horoscope = TextIO.getlnString();
        System.out.println("What would you like to do when you are alone... a. singing, b. dancing, c.acting... you have to pick one!");
        String hobby = TextIO.getlnString();
        System.out.println("Do you perfer a male celebrity or a female celebrity?");
        String gender = TextIO.getlnString();
        System.out.println("Ok, one last thing... you are so close to finding your perfect match! What month were you born?");
        String birthMonth= TextIO.getlnString();

        People myself = new people();
        String answer = Process.get(myself);
        System.out.println(answer + " is your best match!");

    }
}
