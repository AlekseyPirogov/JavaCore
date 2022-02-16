package Lesson_1_Object.Ex1_ExampleCode;

    // Абстрактные классы и методы:
    // Иногда суперкласс требуется определить таким образом, чтобы обьявить в нём структуру заданной абстракции,
    // не предоставляя полную реализацию каждого метода. Определение метода voice() в классе Animal служит лишь
    // в качестве шаблона, поскольку все животные издают разные звуки, а значит нет возможности прописать

    // Нельзя создать объекты абстрактного класса, поскольку он определён не полностью. Нельзя объявить абстрактные
    // конструкторый и статические методы. Любой подкласс, производный от абстрктного класса, обязан реализовать все
    // абстрактные методы из своего суперкласса (при условии что подкласс не является сам абстрактным). При этом
    // абстркатный класс вполне может содержать конкретные реализации методов.

public abstract class _13_HomeAnimal extends _12_Animal {

    // Поле класса для хранения клички животного
    String name;

    // Иллюстрация работы ключевого слова super:
    private int privateVarHomeAnimal;
    protected int protectedVarHomeAnimal;

    // Конструктор класса по умолчанию
    public _13_HomeAnimal() {}

    // Прегруженный параметризированный конструктор класса HomeAnimal
    public _13_HomeAnimal(int privateVarHomeAnimal) {
        this.privateVarHomeAnimal = privateVarHomeAnimal;
    }

    // Параметризированнй конструктор класса
    public _13_HomeAnimal(String name) {
        this.name = name;
    }

    // Вывод информации о живтоном
    public void animalInfo() {
        System.out.println("Животное " + name + " издало звук!");
    }
}