package lab;

public class TriangleUtilities {
    public static String getRow(int numberOfStars) {
        String width = "";
        for (int i = 0; i < numberOfStars; i++){
            width = width + "*";
        }
        return width;
    }

    public static String getTriangle(int numberOfRows) {
        String number = "";
        for (int i = 1; i <= numberOfRows; i++){
            number = number + getRow(i);
            number = number + "\n";
        }
        return number;
    }


    public static String getSmallTriangle() {
        return getTriangle(4);
    }

    public static String getLargeTriangle() {
        return getTriangle(9);
    }
}

