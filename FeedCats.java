package ru.geekbrains.lesson7;
/*
1. Расширить задачу про котов и тарелки с едой.
2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
 (например, в миске 10 еды, а кот пытается покушать 15-20).
3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать
 (хватило еды), сытость = true.
4. Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт
 (это сделано для упрощения логики программы).
5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию
 о сытости котов в консоль.
6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
*/

public class FeedCats {

    private static int TIME = 0;

    public static void main(String[] args) {

        Cat[] cat = new Cat[3];
        cat[0] = new Cat("Кетчер ", 150, 4);
        cat[1] = new Cat("Мурзик ", 100, 3);
        cat[2] = new Cat("Барсик ", 50, 2);
        Plate plate = new Plate(700);
        System.out.println("В доме три кота: " + cat[0].getName() + ", " + cat[1].getName() + " и "
                + cat[2].getName() + ", которые хотят есть каждые " + cat[0].getSatietyTime() + ", "
                + cat[1].getSatietyTime() + " и " + cat[2].getSatietyTime() + " часа соответственно.");
        System.out.println("У котов хороший аппетит. Сейчас в миске " + plate.getFood() + " грамм кошачьего корма. " +
                "Посмотрим, насколько хватит корма; сейчас коты направляются к миске.");

        do {
            for (Cat i : cat) {

                //если кот голоден
                if (i.getSatiety() == 0) {

                    //если в миске не хватает еды, чтобы накормить кота, она будет добавлена
                    if (!plate.checkFood(i.getAppetite())) {
                        plate.increaseFood();
                    }

                    //кот ест
                    i.eat(plate);
                    System.out.println("Кот " + i.getName() + " съел " + i.getAppetite() +
                            " граммов корма и проголодается через " + (i.getSatiety()) + " часа(ов)");
                }

                //декрементация показателя сытости
                i.setSatiety(i.getSatiety() - 1);
            }
            System.out.println("\nС момента начала кормежки прошел(ло) " + TIME + " час(а). В миске осталось " + plate.getFood() +
                    " граммов корма.");
            TIME++;

        } while (TIME <= 12);
    }

}
