package QuestionsPractice.Questions.Question83;

import java.util.Scanner;

public class square extends shape {
    Scanner input = new Scanner(System.in);
    double width;
    double height;

    @Override
    public void calculateArea() {

        System.out.print("Enter width: ");
        width = input.nextDouble();

        System.out.print("Enter height: ");
        height = input.nextDouble();
        double area = width * height;
        System.out.printf("Area of square is %.2f\n" , area);
    }
}
