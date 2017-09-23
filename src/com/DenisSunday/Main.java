package com.DenisSunday;

import com.DenisSunday.Model.Animal;
import com.DenisSunday.Model.vertebrates.Vertebrates;
import com.DenisSunday.Model.vertebrates.mammals.Mammals;

public class Main {

    // Спроектировать зоопарк
    // (Животные:рыбы, земноводные, птицы, рептили,млекопитающие; ...)
    // использовать Интерфейсы, абстрактные классы и необходимые модификаторы доступа


    public static void main(String[] args) {

        Mammals mammals = new Mammals();
        mammals.setDolphin("Дельфин");

        Vertebrates vertebrates = new Vertebrates(mammals);
        Animal animal = new Animal(vertebrates);

        animal.vertebrates.mammals.Dolphin();

        animal.vertebrates.mammals.setDolphin("атлвыым");

        animal.vertebrates.mammals.Dolphin();

    }

}
