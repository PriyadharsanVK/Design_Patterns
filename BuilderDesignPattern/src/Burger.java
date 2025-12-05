public class Burger {
    private String size;
    private boolean egg;
    private boolean extracheese;
    private boolean mayonese;
    private boolean onion;
    private boolean lettuce;

    public String getSize() {
        return size;
    }

    public boolean isEgg() {
        return egg;
    }

    public boolean isExtracheese() {
        return extracheese;
    }

    public boolean isMayonese() {
        return mayonese;
    }

    public boolean isOnion() {
        return onion;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public Burger(BurgerBuilder builder) {
        this.size = builder.size;
        this.egg = builder.egg;
        this.extracheese = builder.extracheese;
        this.mayonese = builder.mayonese;
        this.onion = builder.onion;
        this.lettuce = builder.lettuce;
    }

    public static class BurgerBuilder{
        private String size;
        private boolean egg;
        private boolean extracheese;
        private boolean mayonese;
        private boolean onion;
        private boolean lettuce;

        public BurgerBuilder setSize(String size) {
            this.size = size;
            return this;
        }

        public BurgerBuilder setEgg(boolean egg) {
            this.egg = egg;
            return this;
        }

        public BurgerBuilder setExtracheese(boolean extracheese) {
            this.extracheese = extracheese;
            return this;
        }

        public BurgerBuilder setMayonese(boolean mayonese) {
            this.mayonese = mayonese;
            return this;
        }

        public BurgerBuilder setOnion(boolean onion) {
            this.onion = onion;
            return this;
        }

        public BurgerBuilder setLettuce(boolean lettuce) {
            this.lettuce = lettuce;
            return this;
        }

        public Burger build(){
            return new Burger(this);
        }
    }
}
