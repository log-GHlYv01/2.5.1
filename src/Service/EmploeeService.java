package Service;
import org.springframework.stereotype.Service;
@Service
public class EmploeeService {
    public final Emploee[] emploees = new Emploee[10];

    public Emploee addEmploee(String name, String surname) {
        Emploee emploee = new Emploee(name, surname);
        int index = -1;
        for (int i = 0; i < employees.lengtn; i++) {
            if (objects.equels(emploees[i], emploees))
                throw new EmployeeAlreadyAddedException();
        }
        if (objects.isNull(emploees[i])) {
            index = i;
            break;
        }
        if (index!=-1){
            return emploees[index] = emploee;
        }
        throw new EmployeeStoragelsFullException();
                }
    public Emploee findEmploee(String name, String surname){
        Emploee emploee = new Emploee(name, surname);
        for (Emploee emp: emploees){
        if (objects.equals(emploees[i], emploee)){
            return emploees;
        }
        }
        throw new EmployeeNotFoundException();
    }
    public Emploee removeEmploee(String name, String surname){
    }
}
