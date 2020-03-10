package io.zipcoder;


public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        int counterUp = 0;
        int counterDown = 0;
        for (int i = startIndex; i < playList.length; i++) {
            if(!playList[i].equals(selection)){
                counterUp++;
            }

        }

        for (int i = startIndex; i < playList.length; i--) {
            if (i == -1) {
                i = playList.length - 1;
            }

            if (!playList[i].equals(selection)) {
                counterDown++;
            } else {
                i = playList.length + 1;
            }
        }

        if(counterDown>counterUp){
            return counterUp;
        }
        return counterDown;
    }
}
