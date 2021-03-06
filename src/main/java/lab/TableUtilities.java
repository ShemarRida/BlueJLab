package lab;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String table = "";
        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= 5; j++){
                table = table + String.format("%3d |", j*i);
            }
            table = table + "\n";
        }
        return table;
    }

    public static String getLargeMultiplicationTable() {
        String table = "";
        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= 10; j++){
                table = table + String.format("%3d |", j*i);
            }
            table = table + "\n";
        }
        return table;
    }

   public static String getMultiplicationTable(int tableSize) {
        String table = "";
        for (int i = 1; i <= tableSize; i++){
            for (int j = 1; j <= tableSize; j++){
                table = table + String.format("%3d |", j*i);
            }
            table = table + "\n";
        }
        return table;
    }
}


