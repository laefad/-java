package com.company.Current.Pr24.Part2;

import com.company.Current.Pr24.Part2.Chairs.MagicChair;
import com.company.Current.Pr24.Part2.Chairs.VictorianChair;
import com.company.Current.Pr24.Part2.Fabrics.MagicChairFabric;
import com.company.Current.Pr24.Part2.Fabrics.ManyFunctionalChairFabric;
import com.company.Current.Pr24.Part2.Fabrics.VictorianChairFabric;

public class Client {

    public Chair ch;

    public void sit() {
        ch.use();
    }

    Client(Chair ch)
    {
        this.ch = ch;
    }

    public static void main(String[] args) {
        ChairFabric f1 = new MagicChairFabric();
        ChairFabric f2 = new VictorianChairFabric();
        ChairFabric f3 = new ManyFunctionalChairFabric();

        Client c1 = new Client(f1.makeChair());
        Client c2 = new Client(f2.makeChair());
        Client c3 = new Client(f3.makeChair());

        c1.sit();
        c2.sit();
        c3.sit();
    }
}
