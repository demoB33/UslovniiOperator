public class Main {
    public static void main(String[] args) {
        //Пробное задание
        System.out.println("Пробное задание");
        int age = 16;
        if (age >= 18) {
            System.out.println("Можно водить");}
        if (age < 18) {
            System.out.println("Нельзя водить");
        }
        //Задание1
        System.out.println("Задание 1:");
        int ageFor1 = 18;
        if (ageFor1 >= 18){
            System.out.println("Поздравляем с наступлением совершеннолетия!");
        }
        if (ageFor1 < 18){
            System.out.println("Возраст совершеннолетия ещё не наступил:(");
        }
        //Задание2
        System.out.println("Задание 2:");
        int ageFor2 = 23;
        if (ageFor2 >= 7 && ageFor2 <=17){
            System.out.println("Ребенок ходит в школу");
        }
        if (ageFor2 >= 18 && ageFor2 <=23){
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        if (ageFor2 >=24){
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }// Программа выводит только один ответ исходя из возраста
        //Все задания выше можно объединить, оставив только одну переменную int age, и везде заменить на if ( age.....)

        //Задание3
        System.out.println("Задание 3:");
        int enterNumbPeople = 103;
        int allPlace = 102;
        int seatPlace = 60;
        int standPlace = allPlace - seatPlace;
        if (enterNumbPeople >= 103){
            System.out.println("Вагон полон! Всего " + allPlace + " места");
        }
        if (enterNumbPeople <= 60){
            System.out.println("Есть сидячее место из " + seatPlace);
        }
        if (enterNumbPeople >=61 && enterNumbPeople <=102){
            System.out.println("Есть только стоячее место из " + standPlace);
        }
    }


}