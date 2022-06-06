package com.company;

import com.company.Enums.Colors;
import com.company.classes.Engines.BicycleDrive;
import com.company.classes.Engines.CombustionEngine;
import com.company.classes.Engines.ElectricEngine;
import com.company.classes.Vehicles.*;
import com.company.classes.interfaces.*;

public class Main {

    public static void main(String[] args) {
        Sedan sedan1 = new Sedan(Colors.RED, "xs100", "sedan", 100, 600,600, new CombustionEngine("st1",3,1,100));
        Bus bus1 = new Bus(Colors.RED, "BLUE", "xs100", 50,20,700, new CombustionEngine("st1",3,1,100));
        Tram tram1 = new Tram(Colors.RED, "xs100", "tram", 12,5,100, new ElectricEngine("st2",3,1,100));
        DeliveryVan deliveryVan1 = new DeliveryVan(Colors.RED, "xs100", "delivery van", 90, 50,600, new CombustionEngine("st1",3,1,100));
        FloatPlane floatPlane1 = new FloatPlane(Colors.RED, "xs100", "float plane", 300,100,600, new CombustionEngine("st1",3,1,100));
        JetFighter jetFighter1 = new JetFighter(Colors.RED, "xs100", "jet plane", 2000,150,1000, new CombustionEngine("st1",3,1,100) );
        Bulldozer bulldozer1 = new Bulldozer( Colors.RED, "xs100", "bulldozer", 13,10,1100, new CombustionEngine("st1",3,1,100));
        Motorbike motobike1 = new Motorbike(Colors.RED, "xs100", "motobike", 90, 20,50,new CombustionEngine("st1",3,1,100));
        Bicycle bicycle1 = new Bicycle(Colors.RED, "xs100", "bike", 20, 100,200,new BicycleDrive("st3",3,1,100));
        Helicopter helicopter1 = new Helicopter(Colors.RED, "xs100", "helicopter", 90, 50,600, new CombustionEngine("st1",3,1,100));
        CarAmfibia carAmfibia1 = new CarAmfibia(Colors.RED, "xs100", "car amphibia", 200, 50,600,new CombustionEngine("st1",3,1,100));


        Sedan sedan2 = new Sedan(Colors.BLUE, "xs100", "sedan", 90,50, 600, new CombustionEngine("st1",3,1,100));
        Bus bus2 = new Bus(Colors.BLUE, "xs100", "bus", 55,50, 600, new CombustionEngine("st1",3,1,100));
        Tram tram2 = new Tram(Colors.BLUE, "xs100", "tram", 16,100,600, new ElectricEngine("st2",3,1,100));
        DeliveryVan deliveryVan2 = new DeliveryVan(Colors.BLUE, "xs100", "delivery van", 60, 50,600, new CombustionEngine("st1",3,1,100));
        FloatPlane floatPlane2 = new FloatPlane(Colors.BLUE, "xs100", "float plane", 302,50,600, new CombustionEngine("st1",3,1,100));
        JetFighter jetFighter2 = new JetFighter(Colors.BLUE, "xs100", "jet plane", 2000, 50,600, new CombustionEngine("st1",3,1,100));
        Bulldozer bulldozer2 = new Bulldozer( Colors.BLUE, "xs100", "bulldozer", 20, 50,600, new CombustionEngine("st1",3,1,100));
        Motorbike motobike2 = new Motorbike(Colors.BLUE, "xs100", "motobike", 90, 600,500, new CombustionEngine("st1",3,1,100));
        Bicycle bicycle2 = new Bicycle(Colors.BLUE, "xs100", "bike", 31, 100,100,new BicycleDrive("st3",3,1,100));
        Helicopter helicopter2 = new Helicopter(Colors.BLUE, "xs100", "helicopter", 86, 10, 600, new CombustionEngine("st1",3,1,100));
        CarAmfibia carAmfibia2 = new CarAmfibia(Colors.BLUE, "xs100", "car amphibia", 202,600,1000, new CombustionEngine("st1",3,1,100));

        Object[] tab1 = {sedan1,bus1,tram1,deliveryVan1,floatPlane1,jetFighter1,bulldozer1,motobike1,bicycle1,helicopter1,carAmfibia1,sedan2,bus2,tram2,deliveryVan2,floatPlane2,jetFighter2,bulldozer2,motobike2,bicycle2,helicopter2,carAmfibia2};
        Object[] tab2 = {sedan1,bus1,tram1,deliveryVan1,floatPlane1,jetFighter1,bulldozer1,motobike1,bicycle1,helicopter1,carAmfibia1,sedan2,bus2,tram2,deliveryVan2,floatPlane2,jetFighter2,bulldozer2,motobike2,bicycle2,helicopter2,carAmfibia2};
        Object[] tab3 = {sedan1,bus1,tram1,deliveryVan1,jetFighter1,bulldozer1,motobike1,carAmfibia1,sedan2,bus2,tram2,deliveryVan2,jetFighter2,bulldozer2,motobike2,carAmfibia2};
        Object[] tab4 = {floatPlane1,jetFighter1,helicopter1,floatPlane2,jetFighter2,helicopter2};
        Object[] tab5 = {floatPlane1,carAmfibia1,floatPlane2,carAmfibia2};
        Object[] tab6 = {sedan1,bus1,tram1,deliveryVan1,floatPlane1,jetFighter1,bulldozer1,motobike1,helicopter1,carAmfibia1,sedan2,bus2,deliveryVan2,floatPlane2,jetFighter2,bulldozer2,motobike2,helicopter2,carAmfibia2};
        Object[] tab7 = {bulldozer1,bulldozer2};
        for(Object Object : tab1)
        {
            if(Object instanceof Vehicle cVehicle)
            {
                cVehicle.buyVehicle();
                cVehicle.getClassName();

            }

            System.out.println("\nNEXT OBJ");
        }
        for(Object Object : tab2)
        {
            if(Object instanceof Vehicle cVehicleObject&&Object instanceof Engine cEngine)
            {
                cVehicleObject.buyVehicle();
                cVehicleObject.getClassName();
                cEngine.turnOnEngine();
            }

            System.out.println("\nNEXT OBJ");
        }
        for(Object Object : tab3)
        {
            if(Object instanceof Vehicle cVehicle&&Object instanceof Ground cGround)
            {
                cVehicle.buyVehicle();
                cVehicle.getClassName();
                cGround.drive(10);

            }

            System.out.println("\nNEXT OBJ");
        }
        int i = 0;
        while(i<tab4.length)
        {
            if(tab4[i] instanceof Vehicle cVehicleObject&&tab4[i] instanceof Air cAir)
            {
                cVehicleObject.buyVehicle();
                cAir.fly(10,100);
                cAir.land();
            }
            System.out.println("\nNEXT OBJ");
            i++;
        }
        i=0;
        while(i<tab5.length)
        {
            if(tab4[i] instanceof Vehicle cVehicleObject&&tab4[i] instanceof Water cWater)
            {
                cVehicleObject.buyVehicle();
                cWater.swim(10);

            }
            System.out.println("\nNEXT OBJ");
            i++;
        }
        i=0;
        while(i<tab6.length)
        {
            if(tab4[i] instanceof Vehicle cVehicleObject&&tab4[i] instanceof Fuel cFuel)
            {
                cVehicleObject.buyVehicle();
                cFuel.fillFuel(10);

            }
            System.out.println("\nNEXT OBJ");
            i++;
        }
        i=0;
        while(i<tab7.length)
        {
            if(tab4[i] instanceof Vehicle cVehicleObject&&tab4[i] instanceof Work cWork)
            {
                cVehicleObject.buyVehicle();
                cWork.groundwork(10);

            }
            System.out.println("\nNEXT OBJ");
            i++;
        }
        i=0;
    }
}
