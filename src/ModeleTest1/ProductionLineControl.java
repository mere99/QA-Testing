package ModeleTest1;

import java.util.Map;
import java.util.Objects;

//singleton
public class ProductionLineControl implements IProductionLineControl{
private static ProductionLineControl instance = new ProductionLineControl();
public static synchronized ProductionLineControl getInstance(){
    return instance;
}
private Angajat angCurent;
private LineState state;
private int speed;

    @Override
    public void startLine(String employeeId) throws Exception {
        if(this.state==LineState.DESCHISA){
            throw new IllegalArgumentException("alta linie e deja deschisa de "+this.angCurent.getIdAngajat());
        }
        System.out.println("angajatul "+ employeeId+" a inceput linia de prod");
        this.state=LineState.DESCHISA;
        this.angCurent=new Angajat(employeeId);
    }

    @Override
    public void stopLine(String employeeId) throws Exception {
      if(!Objects.equals(this.angCurent.getIdAngajat(), employeeId)){
          System.out.println("nu pot inchide linia altui angajat!");
      }
    }

    @Override
    public void setWorkingSpeed(String employeeId, int speed) throws Exception {

    }

    @Override
    public void setOperatingMode(String employeeId, String mode) throws Exception {

    }

    @Override
    public void addTechnologicalStep(String employeeId, String step) throws Exception {

    }
}
