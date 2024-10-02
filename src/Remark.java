public class Remark extends Uber{
    String Remark;
    {
        Remark = "very Good";
    }
  

    @Override
    public void TotalSalary(){
        super.TotalSalary();
        System.out.println(Remark);
    }

}
