package chapter9;

public class Employee extends Person {

    private String employeeId;
    private String title;

    public String getEmployeeId (){/*metoda care returneaza employeeId*/
        return employeeId;
    }
    public void setEmployeeId(String employeeId) {/*metoda care face din employeeId o variabila globala*/
        this.employeeId = employeeId;
    }
    public String getTitle() {/*metoda care returneaza title*/
        return title;
    }
    public void setTitle(String title) {/*metoda care face din title o variabila globala*/
        this.title = title;
    }


}
