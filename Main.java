//Демонстрация обобщенного класса
public class Main {
    public static void main(String[] args) {
        //Get<int> strob = new Gen<int>(53) --> простой тип = ошибка
        // iOb = strOb --> Ошибка
        Gen<Integer> iob; //Создание ссылки на объект тира Gen<Integer>

        iob = new Gen<Integer>(88); //Создание экземпляра типа Gen<Integer>

        //Отобразить тип данных, используемых в объекте iob
        iob.showType();

        //Получить значение из объекта iob
        int v = iob.getob();
        System.out.println("значение: " + v);
        System.out.println();

        //Создать объект типа Gen для строк
        Gen<String> strob = new Gen<String>("Тестирование сообщений");

        //Получить тип данныхб в объекте strOb
        strob.showType();

        //Получить значение из объекта strob
        String str = strob.getob();
        System.out.println("значение: " + str);

    }
}

class Gen<T> { // T - обобщенный тип
    T ob; // объект типа Т

    //Передать коструткору ссылку на объект типа Т
    Gen(T o) {
        ob = o;



    }
    //Вернуть объект ob из метода
    T getob() {
        return ob;
    }

    //Отобразить тип Т
    void showType() {
        System.out.println("Тип Т - это " + ob.getClass().getName());
    }
}
         
