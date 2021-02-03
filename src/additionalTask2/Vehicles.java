package additionalTask2;

import task2.Vehicle;

public enum Vehicles {

    BMW (250000, "White"), Mercedes(300000, "Black"), Audi(180000, "Grey");

        private int price;
        private String color;

        Vehicles (int price, String color){
            this.price = price;
            this.color = color;
}

        public String getColor (){
            return color;
        }

    @Override
    public String toString() {
        return this.name() + ":\nColor: " + this.getColor() + "; Price: " + price;
    }
}
