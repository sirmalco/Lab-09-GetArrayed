import java.util.Random;
import  java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int total=0;
        int userNum1=0;
        int userNum2=0;
        int count=0;
        boolean show = true;

        Scanner in = new Scanner(System.in);
        int[] dataPoints = new int[100];
        Random random = new Random();

        for (int i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i] = random.nextInt(100) + 1;
        }

        /*

        for (int value : dataPoints)
        {
            System.out.print(value + " | ");
        }

        for(int i = 0; i< dataPoints.length; i++)
        {
            total += dataPoints[i];
        }
        System.out.println("The average of all the data points is: " + total/100);

        System.out.println("Enter an int between 1-100: ");

        userNum1= in.nextInt();

        for(int i = 0; i< dataPoints.length; i++)
        {

            if(dataPoints[i] == userNum1)
            {
                count++;
            }
        }
        System.out.println("Your number appears " + count + " time(s)");

        System.out.println("Enter an int between 1-100: ");

        userNum2 = in.nextInt();

        for(int i = 0; i< dataPoints.length; i++)
        {
            if(dataPoints[i] == userNum2)
            {
                System.out.println("The int: " + userNum2 + " appears first at index: " + i);
                show = false;
                break;
            }
        }
        if(show)
        {
            System.out.println("Your in does not show up in the array");
        }

        int min = dataPoints[0];
        int max = dataPoints[0];

        for (int i = 1; i < dataPoints.length; i++)
        {
            if (dataPoints[i] < min)
            {
                min = dataPoints[i];
            }
            if (dataPoints[i] > max)
            {
                max = dataPoints[i];
            }
        }

        System.out.println("The minimum value in the array is: " + min);
        System.out.println("The maximum value in the array is: " + max);
        */

        System.out.println("The average of the generated dataPoints is: " + getAverage(dataPoints));
    }
    public static double getAverage(int values[])
    {
        double[] dataPoints = new double[100];
        Random random = new Random();
        double sum = 0;

        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = 1.0 + (99.0 * random.nextDouble());
        }

        for (double value : dataPoints) {
            sum += value;
        }
        return sum / dataPoints.length;
    }

}
