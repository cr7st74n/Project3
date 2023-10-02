import java.lang.Math;
public class MyMethods {
//    1. surface
    public int surface( int width, int length,int  height){
        int result;
        result = 2*(length*width)+2*(length*height)+2*(height*width);
        return result;
    }

//    2. rightTriangle
    public double rightTriangle(double sideA, double hypotenuseB ){
        double result;
        result = Math.sqrt(Math.pow(hypotenuseB, 2)- Math.pow(sideA, 2));
        return  result;
    }
//    4. comboDie

    public String comboDie(Die parameter1, Die parameter2){
        int die1 = parameter1.roll();
        int die2 = parameter1.roll();

        String color1 = parameter1.getColor();
        String color2 = parameter2.getColor();

        String colors = color1 +"-" +color2;
        int faceVale = (die1+die2)/2;

        parameter1.setColor(colors);
        parameter2.setFaceValue(faceVale);

        return parameter1.getColor()+"," +parameter2.getFaceValue();

    }

}

