package edu.escuelaing.PicasFamas.Game;

public class PicasYFamasGame {
    private int picas;
    private int famas;
    private String number;
    public String tryNumber;
    private boolean winState = false;

    /**
     * The Constructor of the starting state of the game 
     */
    public PicasYFamasGame(){
        picas= 0;
        famas= 0;
        number= Integer.toString(randomNumberGen());
        tryNumber= "0000";
    }

    /**
     * The method that makes the random number for the game
     * @return number (afther its values have been randomized)
     */
    private int randomNumberGen(){
        int max = 9999;
		int min = 1000;
		int range = max - min;
        return  (int)(Math.random() * range) + min;
    }

    /**
     * Resets the value of picas and famas
     */
    public void picasFamasReset(){
        picas= 0;
        famas= 0;
    }

    /**
     * gets the actual value of picas
     * @return picas
     */
    public int getPicas(){
        return picas;
    }

    /**
     * gets the actual value of famas
     * @return famas
     */
    public int getFamas(){
        return famas;
    }

    /**
     * Sets the value of picas 
     * @param picas
     */
    public void setPicas(int picas) {
        this.picas = picas;
    }

    /**
     * sets the value of famas
     * @param famas
     */
    public void setFamas(int famas) {
        this.famas = famas;
    }


    /**
     * gets the ramdom number of the game
     * @return
     */
    public String getNumber(){
        return number;
    }

    /**
     * sets the ramdom number of the game
     * @param
     */
    public void setNumber(String number){
        this.number= number;
    }
    
    /**
     * Sets the value of the number to try
     * @param num
     */
    public void setTryNumber(String tryNumber){
        this.tryNumber= tryNumber;
    }

    /**
     * get the value of the actual try number
     * @return
     */
    public String getTryNumber(){
        return tryNumber;
    }

    /**
     * gets the actual value of winState
     * @return winState
     */
    public boolean isWinState(){
        return winState;
    }

    /**
     * sets the win state 
     * @param val
     */
    public void setWinState(boolean winState){
        this.winState= winState;
    }

    /**
     * checks if the player got the number, and updates the values of picas and famas
     * @param toCheckI
     */
    public void checkNumber(){  
        picasFamasReset();
        String toCheck= getTryNumber();
        for(int i=0; i< number.length(); i++){
            if (number.equals(toCheck)){
                winState= true;
                //break;
            }
            int curentPosition = toCheck.indexOf(number.charAt(i));
            if(curentPosition >=0 && curentPosition == i){
                famas++;
            }else if(curentPosition >=0 && curentPosition != i){
                picas++;
            }
        }
    }

    /**
     * Resets the state of the game for a new game
     */
    public void reset(){
        picas= 0;
        famas= 0;
        number= Integer.toString(randomNumberGen());
        tryNumber= "0000";
        winState= false;
    }
}
