package com.company.Current.Pr24.Part2.Fabrics;

import com.company.Current.Pr24.Part2.ChairFabric;
import com.company.Current.Pr24.Part2.Chairs.VictorianChair;

public class VictorianChairFabric implements ChairFabric {
    @Override
    public VictorianChair makeChair() {
        return new VictorianChair();
    }
}
