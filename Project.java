
public class Project {
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee(1001, "Ashish", "01/04/2009", "RAD", "Engineering", 20000, 8000, 3000),
            new Employee(1002, "Sushma", "23/08/2012", "PM", "Project", 300000, 12000, 9000),
            new Employee(1003, "Rahul", "12/11/2008", "k", "Accounting", 10000, 8000, 1000),
            new Employee(1004, "Chahat", "29/01/2013", "g", "Front Desk", 12000, 6000, 2000),
            new Employee(1005, "Ranjan", "16/07/2005", "m", "Engineering", 50000, 10000, 5000),
            new Employee(1006, "Manufacturing", "01/01/2000", "m", "Manufacturing", 29000, 9000, 4400),
            new Employee(1007, "Tanmay", "12/06/2006", "c", "PM", 29000, 9000, 4500)
        };
        
        if(args.length == 0)
        {
            System.out.println("Please provide an Employee Id");
            return;
        }
        int empIdToSearch = Integer.parseInt(args[0]);
        boolean found = false;

        for(Employee emp : employees)
        {
            if(emp.empId == empIdToSearch)
            {
                found = true;

                int da = getDAForDesignation(emp.desgCode);
                int salary = emp.basic + emp.hra + da - emp.it;

                System.out.println("Emp No.\tEmp Name\tDepartment\tDesignation\tSalary");
                System.out.printf("%d\t%s\t%s\t\t\t%s\t\t\t%d\t\t\n", emp.empId, emp.name, emp.department, getDesignation(emp.desgCode), salary);
                break;
            }
        }

        if(!found)
        {
            System.out.println("Employee id not found with empId:"+ empIdToSearch);
        }
}

public static String getDesignation(String desgCode)
{
    switch (desgCode.toLowerCase())
    {
        case "e":
            return "Engineer";
        case "c":
            return "Consultant";
        case "k":
            return "CLerk";
        case "g":
            return "Receptionist";
        case "m":
            return "Manager";
        case "pm":
            return "Project Manager";
        default:
            return "unknown";                        
    }
}

public static int getDAForDesignation(String desgCode)
{
    switch(desgCode.toLowerCase()) {
        case "e":
            return 20000;
        case "c":
            return 320000;
        case "k":
            return 12000;
        case "g":
            return 15000;
        case "m":
            return 40000;
        case "pm":
            return 25000;
        default:
            return 0; 
    }
}
}
