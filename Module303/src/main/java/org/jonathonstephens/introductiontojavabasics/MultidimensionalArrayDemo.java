package org.jonathonstephens.introductiontojavabasics;

public class MultidimensionalArrayDemo {
    public static void main(String[] args) {
        int rows = 5, columns = 4;  // Define the dimensions of the 2D array

        String[] studentNames = {"Takeisha LR White", "Erica Ulysse", "Md F Islam", "Brian Alex Martinez", "Yu Chen Solomon"};
        String[] courseNames = {"Java", "Python", "Data", "SQL"};
        double[][] grades = {
                {95, 98, 100, 96},
                {100, 95, 98, 100},
                {97, 100, 96, 99},
                {98, 95, 98, 95},
                {90, 100, 94, 98}};

       System.out.printf("%-31s", "[Student Name]");
       for (String courseName : courseNames) {
            System.out.printf("%-9s\t", courseName);
        }
        System.out.println();

        for (int row = 0; row < rows; row++) {

            String formattedName = String.format("%-25s", studentNames[row]);
            System.out.print(formattedName + ": \t");


            for (int column = 0; column < columns; column++) {
                System.out.printf("%8.2f\t", grades[row][column]); }
            System.out.println();
        }
    }
}


       /* int rows = 10, columns = 5;
        double[][] grades = new double[rows][columns];
        grades[0][0] = 95;
        grades[0][1] = 100;
        grades[0][2] = 97;
        grades[0][3] = 98;
        grades[0][4] = 90;

        grades[1][0] = 98;
        grades[1][1] = 95;
        grades[1][2] = 100;
        grades[1][3] = 95;
        grades[1][4] = 100;

        grades[2][0] = 100;
        grades[2][1] = 98;
        grades[2][2] = 96;
        grades[2][3] = 98;
        grades[2][4] = 94;

        grades[3][0] = 96;
        grades[3][1] = 100;
        grades[3][2] = 99;
        grades[3][3] = 95;
        grades[3][4] = 98;

        */






