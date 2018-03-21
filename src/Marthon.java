/*
 * Created by Mohamed Khalefa
 * MIT open course ware
 *
 * introduction to programming in java
 *
 * assighnment #3   Marathon
 *
 * */


import sun.security.util.Length;

public class Marthon {

    public static int findFastest(int[] times)

    {

        int fastestTime = times[0];

        int indexOfFastest = 0;

        int counter = 1;

        int time = 0;


        while (counter < times.length)

        {

            time = times[counter];


            if (time < fastestTime)

            {

                fastestTime = time;

                indexOfFastest = counter;

            }


            counter += 1;

        }


        return indexOfFastest;

    }

// This method takes an integer array as an input.

    // The method will use the findFastest() method to

    // find the fastest time. The method will then search the

    // input array for the second fastest time and return that index.

    public static int findSecondFastest(int[] times)

    {

        int indexOfSecondFastest = 0;

        int secondFastestTime = times[0];

        int indexOfFastest = findFastest(times);


        int counter = 1;

        int time = 0;


        while (counter < times.length)

        {

            if (counter == indexOfFastest)

            {

                counter += 1;

                continue;

            }


            time = times[counter];


            if (time < secondFastestTime)

            {

                secondFastestTime = time;

                indexOfSecondFastest = counter;

            }


            counter += 1;

        }


        return indexOfSecondFastest;

    }


    public static void main(String[] args) {

        String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aron", "Kate"};
        int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265};

        for (int loopNames = 0; loopNames < names.length; loopNames++) {

            System.out.println(names[loopNames] + "\tfinished at " + times[loopNames] + " Minutes ");
        }
        int indexOfFastest = findFastest(times);


        System.out.println("The fastest person was " + names[indexOfFastest] + " with a time of " + times[indexOfFastest] + " minutes.");


        int indexOfSecondFastest = findSecondFastest(times);


        System.out.println("The second fastest person was " + names[indexOfSecondFastest] + " with a time of " + times[indexOfSecondFastest] + " minutes.");


    }
}




