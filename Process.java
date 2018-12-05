public class Process{

    People Ellen = new People("Ellen","chinese food","aquarius","singing","female", "january");
    People RebelWilson = new People("Rebel Wilson", "korean food","pisces", "dancing", "female","february");
    People LadyGaga = new People("Lady Gaga", "fast food", "aries","singing","female","march");
    People KristenStewart = new People("Kristen Steward", "japanese food", "aries", "acting","female","april");
    People Adele = new People("Adele", "fast food", "taurus", "singing", "female", "may");
    People ArianaGrande = new People("Ariana Grande", "italian food", "cancer", "singing", "female", "june");
    People SelenaGomez = new People("Selena Gomez", "italian food", "leo", "singing","female","july");
    People BlakeLively = new People("Blake Lively","korean food","virgo", "acting","female","august");
    People Beyonce = new People("Beyonce","chinese food", "virgo", "singing", "female", "september");
    People DakotaJohnson = new People("Dakota Johnson", "american food","libra","acting","female","october");
    People EmmaStone = new People("Emma Stone","american food","scorpio","acting","female","november");
    People NickiMinaj = new People("Nicki Minaj","japanese food","sagittarius","singing","female","december");

    People BradleyCooper = new People("Brady Cooper","italian food","capricorn","dancing","male","january");
    People TomHiddleston = new People("Tom Hiddleston", "chinese food","aquarius","singing","male","february");
    People JustinBiber = new People("Justin Biber","fast food","pisces","acting","male","march");
    People RobertDowneyJr = new People("Robert Downey Jr.", "japanese food","aries","dancing","male","april:");
    People DwayneJohnson = new People("Dwayne Johnson","american food","taurus","singing","male","may");
    People KanyeWest = new People("Kanye West","japanese food","cancer","acting","male","june");
    People BenedictCumberbatch = new People("Benedict Cumberbatch","chinese food","gemini","acting","male","july");
    People AndrewGarfield = new People("Andrew Garfield","korean food","leo","singing","male","august");
    People WillSmith = new People ("Will Smith","fast food","libra","acting","male","september");
    People RyanGosling = new People("Ryan Gosling","korean food","scorpio","dancing","male","october");
    People LeonardoDicaprio = new People("Leonardo Dicaprio","american food","scorpio","singing","male","november");
    People BradPitt = new People("Brad Pitt","italian food","capricorn","acting","male","december");


    People[] collection = new People[]{};

    public static String get(String[]myself){
        int count = 0;
        int temp = 0;
        Celebrity mine;
        for(int i = 0;i<collection.length;i++){
            int length = collection[i].character.length;
            String[] character = collection[i].character;
            for(int j = 0;j<length;j++ ){
                if(myself[j].equals(character[j])){
                    count++;
                }

            }
            if(count>temp){
                temp = count;
                mine = collection[i];
            }
                count = 0;
        }
        return mine;
    }
}
