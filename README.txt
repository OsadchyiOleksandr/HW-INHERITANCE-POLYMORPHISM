В проєкті має бути реалізовано функціонал розрахунку та виведення інформації про базову вартість товару та вартість,
з урахуванням вартості доставки. Базова вартість товару дорівнює добутку кількості (шт.) та ціни (EUR).
Вартість з урахуванням доставки дорівнює сумі базової вартості та вартості доставки (EUR). Виведення має бути таким:

Product: abc, quota is 5 pcs., price is EUR 2.5.
Cost is EUR 12.5.
Product: abc, quota is 5 pcs., price is EUR 2.5.
Cost is EUR 19.5.


1) Cтворіть проект ProductCost на локальній машині через IntelliJ IDEA (IDE).

(2) Структура проекту має бути такою:

(3) Функціонал класу Product

package app;

// Клас-модель товару
public class Product {

  String name;
  int quota;
  double price;

  public Product(String name, int quota, double price) {
    this.name = name;
    this.quota = quota;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public int getQuota() {
    return quota;
  }

  public double getPrice() {
    return price;
  }

  @Override
  public String toString() {
    return "Product: " + name +
        ", quota is " + quota + " " +
        Constants.MEASURE +
        ", price is " + Constants.CURRENCY +
        " " + price + ".";
  }
}

(4) Функціонал класу Constants

package app;

public final class Constants {

  public final static String CURRENCY = "EUR";
  public final static String MEASURE = "pcs.";
}


(5) Функціонал класу Main

package app;

public class Main {

  public static void main(String[] args) {
    // Отримуємо вхідні дані
    String[] data = getData();
    // Формуємо об'єкт з вхідних даних
    Product product = new Product(data[0],
        Integer.parseInt(data[1]),
        Double.parseDouble(data[2]));
    // Розраховуємо базову вартість товару
    CalcCostBase costBase = new CalcCostBase();
    double baseCost = costBase.calcCost(product);
    // Розраховуємо вартість товару, з урахуванням доставки
    CalcCostDelivery costDelivery = new CalcCostDelivery();
    double deliveryCost = costDelivery.calcCost(product);
    // Формуємо виведення
    String baseOutput = product + "\nCost is " +
        Constants.CURRENCY + " " + baseCost + ".";
    String deliveryOutput = product + "\nCost is " +
        Constants.CURRENCY + " " + deliveryCost + ".";
    // Виводимо результат
    getOutput(baseOutput);
    getOutput(deliveryOutput);
  }

  // Набір вхідних даних
  public static String[] getData() {
    return new String[] {"abc", "5", "2.5"};
  }

  public static void getOutput(String output) {
    System.out.println(output);
  }
}

(6) Доопрацюйте функціонал класу CalcCostBase

package app;

// Клас розрахунку базової вартості товару
// ЗАВДАННЯ: Виправити код класу.
public class CalcCostBase {

  // Базовий розрахунок вартості товару
  public double calcCost(Product product) {
    return .getQuota() * product.;
  }
}

(7) Доопрацюйте функціонал класу CalcCostDelivery

package app;

// Клас розрахунку вартості товару,
// враховуючи вартість доставки
// ЗАВДАННЯ: Виправити код класу.
// Клас успадковує клас CalcCostBase.
public class CalcCostDelivery {

 // Вартість доставки
 private final static double deliveryPrice ;

 // Розрахунок вартості товару,
 // з урахуванням вартості доставки
 @Override
 public double calcCost(Product product) {
  return product. product.getPrice()
    + deliveryPrice;
 }
}

(8) Залийте виконаний проект на свій GitHub репозиторій, посилання на який зазначте в LMS.