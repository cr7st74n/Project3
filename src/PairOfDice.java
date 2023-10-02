public class PairOfDice {
    Die die1 = new Die();
    Die die2 = new Die();
    public int getAndSetDie1(int dieValue){
        die1.setFaceValue(dieValue);
        return die1.getFaceValue();
    }
    public int getAndSetDie2(int dieValue){
        die2.setFaceValue(dieValue);
        return die2.getFaceValue();
    }

    public void rollDie1(){
        die1.roll();
    }
    public void rollDie2(){
        die2.roll();
    }
    public String Colors(String color1, String color2){
        die1.setColor(color1);
        die2.setColor(color2);
        String pairColors = die1.getColor()+","+die2.getColor();
        return pairColors;
    }

    public int pairSum(){
        return die1.getFaceValue()+die2.getFaceValue();
    }



}
