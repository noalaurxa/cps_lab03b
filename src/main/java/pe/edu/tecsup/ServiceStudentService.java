package pe.edu.tecsup;

public class ServiceStudentService {
    private final StudentRepository repository;

    public StudentService() {
        this.repository = new StudentRepository();
    }

    public StudentEntity getStudent() {
        return repository.findStudent();
    }
}
