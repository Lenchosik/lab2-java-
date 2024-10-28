package lambdaapplication;

class School {
    String name;
    String director;
    String adres;
    String telephone;

    public School(String name, String director, String adres, String telephone) {
        this.name = name;
        this.director = director;
        this.adres = adres;
        this.telephone = telephone;
    }

    public void displayInfo() {
        System.out.println("Название заведения: " + name);
        System.out.println("Директор: " + director);
        System.out.println("Адрес: " + adres);
        System.out.println("номер телефона: " + telephone);
    }
}