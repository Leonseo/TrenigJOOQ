class  NumericFns<T> {
    T num;


    NumericFns(T n) {
        num = n
    }
    double reciprocal() {
        return 1 / num.doubleValue(); // --> Ошибка!!!
    }
    double fraction() {
        return num.doubleValue() - num.intValue(); //  --> Ошибка!!!
    }
}
//Решение
//<Т extends суперкласс>
//class NumericFns<T extends NumЬer>
