//********************************************************************
//  Die.java       Author: Lewis/Loftus
//
//  Represents one die (singular of dice) with faces showing values
//  between 1 and 6.
//********************************************************************
import java.util.Random;
import java.util.random.*;

public class Die
{
   Random rand = new Random();
   private final int MAX = 6;  // maximum face value

   private int faceValue;  // current value showing on the die

   private String color;

   String[] colors = {"red","blue","orange", "purple", "yellow", "black","green", "white", "brown"};

   public String randomColor(){
      color = colors[rand.nextInt(colors.length)];
      return color;
   }

   public String getColor(){
      return color;
   }
   public void setColor(String InputColor){
      color = InputColor;
   }

   //-----------------------------------------------------------------
   //  Constructor: Sets the initial face value.
   //-----------------------------------------------------------------
   public Die()
   {
      faceValue = 1;
   }

   //-----------------------------------------------------------------
   //  Rolls the die and returns the result.
   //-----------------------------------------------------------------
   public int roll()
   {
      faceValue = (int)(Math.random() * MAX) + 1;

      return faceValue;
   }

   //-----------------------------------------------------------------
   //  Face value mutator.
   //-----------------------------------------------------------------
   public void setFaceValue (int value)
   {
      faceValue = value;
   }

   //-----------------------------------------------------------------
   //  Face value accessor.
   //-----------------------------------------------------------------
   public int getFaceValue()
   {
      return faceValue;
   }

   //-----------------------------------------------------------------
   //  Returns a string representation of this die.
   //-----------------------------------------------------------------
   public String toString()
   {
      String result = Integer.toString(faceValue);

      return result;
   }
}
