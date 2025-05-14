package QuestionsPractice.Questions.Question83;


import java.util.Scanner;

public class circle extends shape {
    Scanner input = new Scanner(System.in);
    double radius;

    @Override
    public void calculateArea() {
        System.out.print("Enter the radius of the circle: ");
        radius = input.nextDouble();
        double area = (Math.PI * radius * radius);

        System.out.printf("The area of a circle is  %.2f\n", area);
    }
}
