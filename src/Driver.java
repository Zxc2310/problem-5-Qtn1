public class Driver {
    int DriverID;
    String DriverName;
    String DriverAddress;
    String DriverEmail;
    String DriverPhone;
    String Location;
    int HoursWorked;
    int DistanceTravelled;
    int NumberOfClientsPicked;

    {
        DriverID = 102;
        DriverName = "Abdurahman";
        DriverAddress = "Zana";
        DriverEmail = "abdurahman@gmail.com";
        DriverPhone = "+25678423508";
        Location = "Kampala";
        HoursWorked = 87;
        DistanceTravelled = 258;
        NumberOfClientsPicked = 150;
    }
    public void DriverInfo(){
        System.out.println("Driver ID: " + " " + DriverID);
        System.out.println("Driver Name: " + " " + DriverName);
        System.out.println("Driver Address: " + " " + DriverAddress);
        System.out.println("Driver Email: " + " " + DriverEmail);
        System.out.println("Driver Phone: " + " " + DriverPhone);
        System.out.println("Location: " + " " + Location);
        System.out.println("Hours Worked: " + " " + HoursWorked);
        System.out.println("Distance Travelled: " + " " + DistanceTravelled);
        System.out.println("Number of Clients: " + " " + NumberOfClientsPicked);
    }

    public void Cal(){
        int Salary = (DistanceTravelled + NumberOfClientsPicked)*3000;
        System.out.println("Salary: " + " " + Salary);
    }


}
