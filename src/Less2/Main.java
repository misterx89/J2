package Less2;

public class Main {
    static int SIZE = 4;

    public static void main(String[] args) {
        String[][] arr = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        try {
            System.out.println(sum(arr));

        } catch (MyArrayDataExcaption e) {
            e.printStackTrace();
            System.out.println("колонка " + e.getCol() + " строка " + e.getRow());
            System.out.println(arr[e.getCol()][e.getRow()]);

        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
        System.out.println("Код окончен");
    }
    static int sum(String[][] arr) throws MyArraySizeException, MyArrayDataExcaption {
        if (arr.length != SIZE) {
            throw new MyArraySizeException();
        }
        for (String[] strings : arr) {
            if (strings.length != SIZE) {
                throw new MyArraySizeException();
            }
        }
        int sum = 0;
        for (String[] strings : arr) {
            for (int j = 0; j < arr.length; j++) {
                try {
                    sum += Integer.parseInt(strings[j]);
                } catch (NumberFormatException e) {
                    //throw new MyArrayDataExcaption("Формат " + i + " " + j, i,j); //если так, то прерывается сразу при возникновении ошибки
                    e.printStackTrace(); //а если так, то проверяет весь массив и выводит сообщение

                }
            }
        }
        return sum;
    }
}
