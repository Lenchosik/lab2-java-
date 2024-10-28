package lambdaapplication;

class DopLesson {
    String name;
    String theme;
    int kids;
    int cost;

    public DopLesson(String name, String theme, int kids, int cost) {
        this.name = name;
        this.theme = theme;
        this.kids = kids;
        this.cost = cost;
    }

    public void displayInfo() {
        System.out.println("Название кружка: " + name);
        System.out.println("Вид деятельности: " + theme);
        System.out.println("Количество детей: " + kids);
        System.out.println("Стоимость в месяц: " + cost);
    }
}