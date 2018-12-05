public static void recommendation(String a, String b){

         if (a.equals( "korean food")){
           System.out.println("Since you and " +b+ " both like Korean food,");
           System.out.println("We recommend you guys to go to:");
           System.out.println("1. Woori");
           System.out.println("2. Kaju Tofu House");
           System.out.println("3. Kimchipapi Kitchen");
       } else if (a.equals("chinese food")){
           System.out.println("Since you and " +b+ " both like Chinese food,");
           System.out.println("We recommend you guys to go to: ");
           System.out.println("1. Asia Wok");
           System.out.println("2. Mulan Taiwanese Restaurant");
           System.out.println("3. Jin's Sichuan House");
       } else if (a.equals( "american food")){
           System.out.println("Since you and " +b+ " both like American food,");
           System.out.println("We recommend you guys to go to: ");
           System.out.println("1. Bistro 781");
           System.out.println("2. The Gaff");
           System.out.println("3. Brewer's Tap & Table");
       } else if (a.equals("italian food")){
           System.out.println("Since you and " +b+ " both like Italian food,");
           System.out.println("We recommend you guys to go to: ");
           System.out.println("1. Fiorella's");
           System.out.println("2. Charcoal Guido's");
           System.out.println("3. Osteria Posto");
       } else if (a.equals( "fast food")){
           System.out.println("Since you and " +b+ " both like Fast food,");
           System.out.println("We recommend you guys to go to: ");
           System.out.println("1. Five Guys");
           System.out.println("2. McDonalds");
           System.out.println("3. Wendy's");
         } else {
           System.out.println("Since you and " +b+ " both like Japanese food,");
           System.out.println("We recommend you guys to go to: ");
           System.out.println("1. Hakata Ramen & Sushi");
           System.out.println("2. UMI fine Japanese & Asian Cuisine");
         }
       }
}
