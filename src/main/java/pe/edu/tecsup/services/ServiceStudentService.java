package pe.edu.tecsup.services;

public class ServiceStudentService {
    private final StudentRepository repository;

    public StudentService() {
        this.repository = new StudentRepository();
    }

    public StudentEntity getStudent() {
        return repository.findStudent();
    }
}



