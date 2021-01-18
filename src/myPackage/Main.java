package myPackage;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.setName("Dang Xuan Thao");
        emp.setIndex(null);

        Index index = new Index();
        index.setStreet("Lac Long Quan");

        emp.setIndex(index);

        System.out.println(emp.getName());

        System.out.println(emp.getIndex().getStreet());
    }
}
