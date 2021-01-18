package myPackage;

public class Person {
    private String name;
    private Index index; // (HAS-A) su dung Bien cho 1 class khac;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Index getIndex() {
        return index;
    }

    public void setIndex(Index index) {
        this.index = index;
    }
}
