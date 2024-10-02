public class Uber extends Driver{
    int UberID;
    int DriverID;
    String Email;

    {
        UberID = 104;
        DriverID = 102;
        Email = "uberugx@gmail.com";
    }


    public void UberInfo(){
        System.out.println("Uber ID: " + " " + UberID);
        System.out.println("Driver Name: " + " " + DriverID);
        System.out.println("Email: " + " " + Email);
    }
    @Override
    public void Cal(){
        super.Cal();
    }
    public void TotalSalary(){
        int TotalSalary = ((HoursWorked + DistanceTravelled + NumberOfClientsPicked)*5000);
        System.out.println("Total Salary: " + " " + TotalSalary);
    }

}
