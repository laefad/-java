package com.company.Current.Pr24.Part2.Fabrics;

import com.company.Current.Pr24.Part2.ChairFabric;
import com.company.Current.Pr24.Part2.Chairs.MagicChair;

public class MagicChairFabric implements ChairFabric {
    @Override
    public MagicChair makeChair() {
        return new MagicChair();
    }
}
