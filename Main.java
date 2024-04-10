package ghhk2;

public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();

        Experience employee1 = new Experience(1, "Hoan", 2005, 123456789, "hoannh.23ite@vku.udn.vn", "Experience", 0, 5, "Java");
        Fresher employee2 = new Fresher(2, "Huy", 2005, 987654321, "Huyndh.23ite@vku.udn.vn", "Fresher", 0, 20200630, 3, "VKU");
        Intern employee3 = new Intern(3, "Quang", 2005, 456789123, "Quangnn.23ite@vku.udn.vn", "Intern", 0, "Computer Science", "Spring 2024", "VKU");

        manager.addEmployee(employee1);
        manager.addEmployee(employee2);
        manager.addEmployee(employee3);

        System.out.println("Tất cả nhân viên:");
        manager.showAllEmployees();
        System.out.println();

        Experience newEmployee1 = new Experience(1, "Hoan", 2005, 123456789, "hoannh.23ite@vku.udn.vn", "Experience", 0, 6, "Java, SQL");
        manager.updateEmployee(0, newEmployee1);

        System.out.println("Nhân viên đã cập nhật:");
        manager.showAllEmployees();
        System.out.println();

        manager.deleteEmployee(1);

        System.out.println("Nhân viên còn lại:");
        manager.showAllEmployees();
        System.out.println();
    }
}