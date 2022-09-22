package lesson1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("hospital")
@Scope("prototype")
public class Hospital implements IHospital {


    @Autowired
    @Qualifier("PatientCard")
    private IHospitalGo hospitalGo;


    @Override
    public void goArchive() {
        System.out.println("patient card search");
        hospitalGo.processing();
    }


}
