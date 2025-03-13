import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    double[] array = new double[5];
    array[0] = 2.4;
    array[1] = 3.2;
    array[2] = 6.34;
    array[4] = 9.6;
    array[4] = 7.2;
    System.out.println(sumArray(array));

  }


  public static double sumArray(double[] arr)
  {
    double sum = 0.0;
    for (int i = 0; i < arr.length; i++)
    {
      sum += arr[i];
    }
    return sum;
  }

  public static double averageLength(String[] arr)
  {
    double sum = 0.0;
    for (int i = 0; i < arr.length; i++)
    {
      sum += arr[i].length();
    }
    return sum / arr.length;
  }

  public static int arrayMax(int[] arr)
  {
    int max = arr[0];
    for (int i = 0; i < arr.length; i++)
    {
      if (arr[i]> max)
      {
        max = arr[i];
      }
    }
    return max;
  }

  public static boolean linearSearch(String[] arr, String target)
  {
    for (int i = 0; i < arr.length; i++)
    {
      if (target.equals(arr[i]))
      {
        return true;
      }
    }
    return false;
  }
}
