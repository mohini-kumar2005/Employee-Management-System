public class Employee{
    int empId;
    String name;
    String joinDate;
    String desgCode;
    String department;
    int basic;
    int hra;
    int it;

    public Employee(int empId, String name, String joinDate, String desgCode, String department,int basic, int hra, int it)
    {
        this.empId = empId;
        this.name = name;
        this.joinDate = joinDate;
        this.desgCode = desgCode;
        this.department = department;
        this.basic = basic;
        this.hra = hra;
        this.it = it;
    }
}

