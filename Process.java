public Class Process{

    Celebrity one = new Celebrity();

    Celebrity[] collection = new Celebrity[]{};

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
