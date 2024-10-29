public class Cat  extends Animal{

    private String hairType;

    public Cat(String name, int age, String hairType) {
        super(name, age);
        this.hairType = hairType;
    }

    public Cat(String hairType) {
        this.hairType = hairType;
    }

    public String getHairType() {
        return hairType;
    }

    public void setHairType(String hairType) {
        this.hairType = hairType;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "hairType='" + hairType + '\'' +
                '}';
    }
}
