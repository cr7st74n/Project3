public class TestPairOfDice {
    public static void main(String[] args){
        PairOfDice die = new PairOfDice();
        Die getColors = new Die();

        System.out.println("Welcome to the Dice program.! Let's roll: ");
//      Initial value of the dice
        int initialValue = (int)(Math.random()*6)+1;
        die.getAndSetDie1(initialValue);
        die.getAndSetDie2(initialValue);
        System.out.println("Sum of face values before roll : " +die.pairSum());
//      Value after roll
        die.rollDie1();
        die.rollDie2();

        System.out.println("Sum of the values after roll : " +die.pairSum());
        String ResultColors = die.Colors(getColors.randomColor(),getColors.randomColor());
        System.out.println("Colors of both dice: " +ResultColors );
    }
}
