package ru.geekbrains.Artjom_Islyamov;

public class Person {
    public static void main(String[] args) {
        Employee testEmployee = new Employee("Петров Иван Иванович", "Директор дирекции",
                "iIP@yandex.ru", 892594792051L, 100000, 45);
        testEmployee.showInfo();//проверка
        Employee[] persArray = new Employee[5];

        persArray[0] = new Employee("Степанов Евгений Валентинович", "Директор департамента",
                "StepByStep@icloud.com", 892594792051L, 254030, 39);
        persArray[1] = new Employee("Иванов Дмитрий Феофанович", "старший инженер",
                "IvanFeoFun@mail.ru", 891564792051L, 90000, 42);
        persArray[2] = new Employee("Казаков Владимир Викторович", "Менеджер проектов",
                "pupsik@yandex.ru", 890784762011L, 80000, 47);
        persArray[3] = new Employee("Железнов Андрей Владимирович", "Генеральный директор",
                "IronMan@yandex.ru", 892594792051L, 200000, 30);
        persArray[4] = new Employee("Конаков Василий Сергеевич", "оператор ЧПУ",
                "KonyaK@yandex.ru", 837594772851L, 70000, 38);

        for (Employee first : persArray) {
            if (first.getAge() > 40) {
                first.showInfo();
            }

        }
    }
}
