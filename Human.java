public class People{

    String name ;
    String favoriteFood;
    String starSign;
    String hobby;
    String sex;
    String birthMonth;

    String[] character = new String[]{name,favoriteFood,starSign,hobby,sex,birthMonth};

    People(String name,String favoriteFood, String starSign, String hobby, String sex,String birthMonth){
        this.name = name;
        this.favoriteFood = favoriteFood;
        this.starSign = starSign;
        this.hobby = hobby;
        this.sex = sex;
        this.birthMonth = birthMonth;
    }

}
