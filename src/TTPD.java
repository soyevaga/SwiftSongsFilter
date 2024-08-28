public class TTPD {
    //begins in 1, index 0 unused
    String[] lyrics;
    String[] titles;
    String album;
    int tracksNumber;

    public TTPD() {
        tracksNumber = 31;
        lyrics = new String[tracksNumber+1];
        album = "The Tortured Poets Department";
        titles = new String[]{"", "Fortnight", "The Tortured Poets Department", "My Boy Only Breaks His Favorite Toys",
                "Down Bad", "So Long, London", "But Daddy I Love Him", "Fresh Out The Slammer", "Florida!!!",
                "Guilty as Sin?", "Who's Afraid of Little Old Me?", "I Can Fix Him (No Really I Can)", "loml",
                "I Can Do It With a Broken Heart", "The Smallest Man Who Ever Lived", "The Alchemy", "Clara Bow",
                "The Black Dog", "imgonnagetyouback", "The Albatross", "Chloe or Sam or Sophia or Marcus",
                "How Did It End?", "So High School", "I Hate It Here", "thanK you aIMee", "I Look in People's Windows",
                "The Prophecy", "Cassandra", "Peter", "The Bolter", "Robin", "The Manuscript"
        };
        lyrics[1] = "";

        //Everything in lowercase
        for(int j = 1; j <= tracksNumber; j++){
            lyrics[j]=lyrics[j].toLowerCase();
        }
    }

    public void search(String str, String[] solution){
        boolean ttpdbool = false;
        for(int i = 1; i<=this.tracksNumber; i++){
            if(this.lyrics[i].contains(str)){
                if(ttpdbool){
                    solution[1]+= ", "+this.titles[i];
                    solution[0]+= ", "+i;
                }else{
                    ttpdbool= true;
                    solution[1]+= this.album+ ": "+this.titles[i];
                    solution[0]+= this.album+ ": "+ i;
                }
            }
        }
        solution[0]+="\n";
        solution[1]+="\n";
    }
}
