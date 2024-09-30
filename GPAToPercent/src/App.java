import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double gpa = 0.0;
        double minPercent = 0.0;
        double maxPercent = 0.0;
        System.out.print("Please enter your GPA: ");
        gpa = s.nextDouble();

        int grade = (int)(gpa * 10) ;
        switch (grade){
            case 40: 
                minPercent = 95.0;
                maxPercent = 100.0;
                break;
            case 39:
                minPercent = 94.0;
                maxPercent = 95.0;
                break;
            case 38: 
                minPercent = 93.0;
                maxPercent = 94.0;
                break;
            case 37: 
                minPercent = 92.0;
                maxPercent = 93.0;
                break;
            case 36: 
                minPercent = 91.0;
                maxPercent = 92.0;
                break;
            case 35: 
                minPercent = 90.0;
                maxPercent = 91.0;
                break;
            case 34: 
                minPercent = 89.0;
                maxPercent = 90.0;
                break;
            case 33: 
                minPercent = 88.0;
                maxPercent = 89.0;
                break;
            case 32: 
                minPercent = 87.0;
                maxPercent = 88.0;
                break;
            case 31: 
                minPercent = 86.0;
                maxPercent = 87.0;
                break;
            case 30: 
                minPercent = 85.0;
                maxPercent = 86.0;
                break;
            case 29: 
                minPercent = 84.0;
                maxPercent = 85.0;
                break;
            case 28: 
                minPercent = 83.0;
                maxPercent = 84.0;
                break;
            case 27: 
                minPercent = 82.0;
                maxPercent = 83.0;
                break;
            case 26: 
                minPercent = 81.0;
                maxPercent = 82.0;
                break;
            case 25: 
                minPercent = 80.0;
                maxPercent = 81.0;
                break;
            case 24: 
                minPercent = 79.0;
                maxPercent = 80.0;
                break;
            case 23: 
                minPercent = 78.0;
                maxPercent = 79.0;
                break;
            case 22: 
                minPercent = 77.0;
                maxPercent = 78.0;
                break;
            case 21: 
                minPercent = 76.0;
                maxPercent = 77.0;
                break;
            case 20: 
                minPercent = 75.0;
                maxPercent = 76.0;
                break;
            case 19: 
                minPercent = 74.0;
                maxPercent = 75.0;
                break;
            case 18: 
                minPercent = 73.0;
                maxPercent = 74.0;
                break;
            case 17: 
                minPercent = 72.0;
                maxPercent = 73.0;
                break;
            case 16: 
                minPercent = 71.0;
                maxPercent = 72.0;
                break;
            case 15: 
                minPercent = 70.0;
                maxPercent = 71.0;
                break;
            case 14: 
                minPercent = 69.0;
                maxPercent = 70.0;
                break;
            case 13: 
                minPercent = 68.0;
                maxPercent = 69.0;
                break;
            case 12: 
                minPercent = 67.0;
                maxPercent = 68.0;
                break;
            case 11: 
                minPercent = 66.0;
                maxPercent = 67.0;
                break;
            case 10: 
                minPercent = 65.0;
                maxPercent = 66.0;
                break;
            case 0: 
                minPercent = 0.0;
                maxPercent = 65.0;
                break;
        }
        
        System.out.println("Percent Range: From " + minPercent + " % to " + maxPercent + " %");
        // Debug Statements
        //System.out.print("Grade = ");
        //System.out.println(grade);
        //System.out.print("Percent = ");
        //System.out.println(percent);
    }
}