public class SimpGen {
    public static void main(String[] args) {
        //Get<int> strob = new Gen<int>(53) --> простой тип = ошибка
        // iOb = strOb --> Ошибка
        TwoGen<Integer, String> tgobj = new TwoGen<Integer,String>(88, "Обобщение"); //Создание ссылки на объект тира Gen<Integer>


        //Отобразить тип данных, используемых в объекте iob
        tgobj.showType();

        //Получить значение из объекта iob
        int v = tgobj.getob1();

        System.out.println("значение: " + v);
        System.out.println();

        //Получить значение из объекта strob
        String str = tgobj.getob2();
        System.out.println("значение: " + str);

    }
}

class TwoGen<T, V> { // T - обобщенный тип
    T ob1; // объект типа Т
    V ob2;

    //Передать коструткору ссылку на объект типа Т
    TwoGen(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;



    }
    //Вернуть объект ob из метода
    T getob1() {
        return ob1;
    }
    V getob2() {
        return ob2;
    }

    //Отобразить тип Т и V
    void showType() {
        System.out.println("Тип Т - это " + ob1.getClass().getName());
        System.out.println("Тип V - это " + ob2.getClass().getName());
    }
}

