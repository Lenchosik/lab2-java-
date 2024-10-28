package lambdaapplication;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        //Школы
        List<School> schools = new ArrayList<>();
        schools.add(new School("МБОУСОШ №1", "Петренко А.Н.", "г.Новочеркасск ул. Московская 13", "8-951-874-65-32"));
        schools.add(new School("МБОУСОШ №12", "Васильева Ж.К.", "г.Новочеркасск ул. Пушкина 35/4", "8-905-564-67-64"));
        schools.add(new School("Лицей №16", "Гузеева А.М.", "г.Новочеркасск пер. Маяковского 26", "8-908-844-95-87"));
        schools.add(new School("МБОУСОШ №22", "Ларчук В.В.", "г.Ростов-на-Дону ул. Лермонтова 17", "8-951-456-63-88"));
        schools.add(new School("Лицей №8", "Афанасьев Н.В.", "г.Ростов-на-Дону ул. Садовая 67/3", "8-932-994-95-54"));

        //Дополнительные занятия
        List<DopLesson> dops = new ArrayList<>();
        dops.add(new DopLesson("Рисование", "Обучение базовым основам рисования", 12, 2200));
        dops.add(new DopLesson("Танцы", "Прохождение специальной программы балета", 8, 3450));
        dops.add(new DopLesson("Английский язык", "Расширение лексикона и знаний правописания", 8, 2500));
        dops.add(new DopLesson("Черчение", "Обучение базовым основам черчения", 10, 2850));
        dops.add(new DopLesson("Математика", "Обучение базовым основам алгебры", 8, 1900));
        dops.add(new DopLesson("Пение", "Развитие профессионального слуха", 4, 4500));

        //Лямбда-выражение для фильтрации школ по адресу
        System.out.println("Заведения в г.Новочеркасск:");
        filterSchools(schools, school -> school.adres.contains("Новочеркасск"));

        //Лямбда-выражение для фильтрации кружков по цене
        System.out.println("\nКружки дешевле 3000 рублей:");
        filterDopLessons(dops, dop -> dop.cost < 3000);
    }

    //Фильтрация школ - метод
    public static void filterSchools(List<School> schools, Predicate<School> condition) {
        for (School school : schools) {
            if (condition.test(school)) {
            	school.displayInfo();
                System.out.println();
            }
        }
    }

    //Фильтрация кружков - метод
    public static void filterDopLessons(List<DopLesson> dops, Predicate<DopLesson> condition) {
        for (DopLesson dop : dops) {
            if (condition.test(dop)) {
                dop.displayInfo();
                System.out.println();
            }
        }
    }
}