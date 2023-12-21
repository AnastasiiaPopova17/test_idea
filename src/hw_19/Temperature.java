package hw_19;

public class Temperature {
    public double farenheit;
    /*
    Задача 1
Создать класс Temperature (температура), содержащий метод для перевода градусов по фаренгейту в градусы
цельсия ( celsius = 5*(farenheit - 32)/9). В классе Main создать несколько обьектов класса
Temperature (значение температуры по фаренгейту должно задаваться через конструктор)
и вывести результат перевода на экран
     */
    public Temperature( double farenheit){

        this.farenheit = farenheit;
    }

    double convertationGrad(){
        double celsius;
        return ( celsius = 5*(farenheit - 32)/9);

    }
}
