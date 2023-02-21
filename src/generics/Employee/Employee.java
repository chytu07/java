import java.util.Arrays;
import static java.util.Comparator.*;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.*;

public class Employee {
    public static final Employee DEFAULT_EMPLOYEE = new Employee(0, "No Name");

    private int id;
    private String name;

    // ... constructors ...

    public Employee() {
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // ... getters and setters ...
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return name;
    }

    // ... equals and hashCode overrides

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Peter Gibbons"),
                new Employee(2, "Samir Nagheenanajar"),
                new Employee(3, "Michael Bolton"),
                new Employee(4, "Milton Waddams"));

//// Anonymous inner class implementation of Comparator<Employee>
//        Employee maxId = employees.stream()
//                .max(new Comparator<Employee>() {
//                    @Override
//                    public int compare(Employee e1, Employee e2) {
//                        return e1.getId() - e2.getId();
//                    }
//                }).orElse(Employee.DEFAULT_EMPLOYEE);
//
//// Anonymous inner class implementation of Comparator<Object>
//        Employee maxName = employees.stream()
//                .max(new Comparator<Object>() {
//                    @Override
//                    public int compare(Object o1, Object o2) {
//                        return o1.toString().compareTo(o2.toString());
//                    }
//                }).orElse(Employee.DEFAULT_EMPLOYEE);
//
//        System.out.println(maxId);   // Milton Waddams
//        System.out.println(maxName); // Samir Naga..., er, Naga...,
//        //    um, na ganna be working here anymore
        
//        //idiomatic approach
//        Employee maxId = employees.stream()
//                .max(Comparator.comparingInt(Employee::getId)).orElse(Employee.DEFAULT_EMPLOYEE);
//        Employee maxName = employees.stream()
//                .max(Comparator.comparing(Object::toString)).orElse(Employee.DEFAULT_EMPLOYEE);
//
//        System.out.println(maxId);    // same results
//        System.out.println(maxName);  //   as before

        //Mapping a List<Employee> to a List<String>
//        List<String> names = employees.stream()
//                .map(Employee::getName)
//                .collect(Collectors.toList());  // Collectors.toList() statically imported
//
//// Also legal would be:
//        List<String> strings = employees.stream()
//                .map(Object::toString)
//                .collect(Collectors.toList());
//        
//        System.out.println(names+" "+strings);

        //Sorting Map elements by key and printing

// Add employees to a map using id as key
        Map<Integer, Employee> employeeMap = employees.stream()
                .collect(toMap(Employee::getId, Function.identity()));

//// Sort employees by id and print them
//        System.out.println("Sorted by key:");
//        employeeMap.entrySet().stream()
//                .sorted(Map.Entry.comparingByKey())
//                .forEach(entry -> {
//                    System.out.println(entry.getKey() + ": " + entry.getValue());
//                });


//// Sort employees by name and print them (DOES NOT COMPILE)
//        employeeMap.entrySet().stream()
//                .sorted(Map.Entry.comparingByValue())
//                .forEach(entry -> {
//                    System.out.println(entry.getKey() + ": " + entry.getValue());
//                });

        // Sort employees by name and print them
        System.out.println("Sorted by name:");
        employeeMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(comparing(Employee::getName)))
                .forEach(entry -> {
                    System.out.println(entry.getKey() + ": " + entry.getValue());
                });

    }
    

}