package com.company.Current.Pr24.Part2.Fabrics;

import com.company.Current.Pr24.Part2.ChairFabric;
import com.company.Current.Pr24.Part2.Chairs.ManyFunctionalChair;

public class ManyFunctionalChairFabric implements ChairFabric {

    @Override
    public ManyFunctionalChair makeChair() {
        return new ManyFunctionalChair();
    }
}
