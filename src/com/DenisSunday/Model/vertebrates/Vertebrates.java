package com.DenisSunday.Model.vertebrates;

import com.DenisSunday.Model.vertebrates.amphibians.Amphibians;
import com.DenisSunday.Model.vertebrates.birds.Birds;
import com.DenisSunday.Model.vertebrates.fishes.Fishes;
import com.DenisSunday.Model.vertebrates.mammals.Mammals;
import com.DenisSunday.Model.vertebrates.reptiles.Reptiles;

public class Vertebrates {

    public Birds birds;

    public Mammals mammals;

    public Fishes fishes;

    public Amphibians amphibians;

    public Reptiles reptiles;

    public Vertebrates(Mammals mammals) {
        this.mammals = mammals;
    }

}
