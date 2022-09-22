package lesson1;


import org.springframework.stereotype.Component;

@Component("PatientCard")
public class PatientCard implements IHospitalGo{


    @Override
    public void processing() {
        System.out.println("patient card found");
    }
}
