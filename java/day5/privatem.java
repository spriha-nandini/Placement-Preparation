package day5;
public class privatem {
    private String model;
    public String getModel(){
        return model;
    }
    
    public void setModel(String model){
        this.model=model;
    } 
}
class Model{
    public static void main(String[] args){
        privatem p=new privatem();
        p.setModel("range rover");
        System.out.print("car model: "+p.getModel());
    }
}
