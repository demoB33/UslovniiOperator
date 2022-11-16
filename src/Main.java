public class Main {
    public static void main(String[] args) {
        //Пробное задание
        System.out.println("Пробное задание");
        int age = 18;
        if (age >= 18) {
            System.out.println("Можно водить");
        }
        if (age < 18) {
            System.out.println("Нельзя водить");
        }
        //Задание1
        System.out.println("Задание 1:");
        int ageFor1 = 18;
        if (ageFor1 >= 18) {
            System.out.println("Поздравляем с наступлением совершеннолетия!");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил:(");
        }
        //Задание2
        System.out.println("Задание 2:");
        int ageFor2 = 7;
        if (ageFor2 >= 7 && ageFor2 <= 17) {
            System.out.println("Ребенок ходит в школу");
        }else {
        if (ageFor2 >= 18 && ageFor2 <= 23) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }else {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
        }// Программа выводит только один ответ исходя из возраста
        //Все задания выше можно объединить, оставив только одну переменную int age, и везде заменить на if ( age.....)

        //Задание3
        System.out.println("Задание 3:");
        int enterNumbPeople = 199;
        int allPlace = 102;
        int seatPlace = 60;
        int standPlace = allPlace - seatPlace;

        if (enterNumbPeople <= 60) {
            System.out.println("Есть сидячее место из " + seatPlace);
        }else {
            if (enterNumbPeople >= 61 && enterNumbPeople <= 102) {
                System.out.println("Есть только стоячее место из " + standPlace);
            } else {
                    System.out.println("Вагон полон! Всего " + allPlace + " места");

            }
        }
        //8.Задание задание1
        System.out.println("8.Задание 1:");
        int ageAll = 25;
        boolean ageKids = ageAll >= 2 && ageAll <= 6;
        boolean ageSchoolBoi = ageAll >=7 && ageAll < 18;
        boolean ageStudent = ageAll >= 18 && ageAll <= 24;
        if (ageKids){
            System.out.println("Если возраст человека равен " + ageAll + " то ему нужно ходить в детский сад");
        } else {
            if (ageSchoolBoi){
                System.out.println("Если возраст человека равен " + ageAll + " то ему нужно ходить в школу");
            }else {
                if (ageStudent){
                    System.out.println("Если возраст человека равен " + ageAll + " то ему нужно ходить в университет");
                }else {
                    System.out.println("Если возраст человека равен " + ageAll + " то ему пора ходить на работу");
                }
            }
        }

        System.out.println("8.Задание 2:");
        int ageChildren = 14;
        if (ageChildren < 5){
            System.out.println("Если ребенку " + ageChildren + " лет ,  то ему нельзя кататься на атракционе");
        } else {
            if (ageChildren >=5 && ageChildren < 14){
                System.out.println("Если ребенку " + ageChildren + " лет, то ему можно кататься на атракционе в сопровождении взрослого");
            }else {
                System.out.println("Если ребенку " + ageChildren + " лет, то ему можно кататься без сопровождения взрослого");
            }
        }
        //8.Задание 3
        System.out.println("8.Задание 3:");
        int one = 4;
        int two = 7;
        int free = 6;
        if (one > two){
            System.out.println("Большее число " + one);
        } else {
            if (two > free){
                System.out.println("Большее число " + two);
            }else {
                System.out.println("Большее число " + free);
            }
        }





    }
}


