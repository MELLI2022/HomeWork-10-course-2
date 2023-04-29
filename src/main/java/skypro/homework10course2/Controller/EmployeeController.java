package skypro.homework10course2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import skypro.homework10course2.Domane.Employee;
import skypro.homework10course2.Service.EmployeeService;

import java.util.List;
@RestController
@RequestMapping("/departments")
public class EmployeeController {
    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping("/max-wage")
    public Employee getMaxWage(@RequestParam("departmentId") Integer id){
        return service.getMaxWage(id);
    }
    @GetMapping("/min-wage")
    public Employee getMinWage(@RequestParam ("departmentId") Integer id){
        return EmployeeService.getMinWage(id);
    }
    @GetMapping("/all")
    public List<Employee> getAllInDepart(){
        return service.getAllInDepart();
    }

    @GetMapping("/departments/all")
    public List<Employee> getAllByDepart(@RequestParam ("departmentId")Integer id) {
        return service.getAllByDepart(id);
    }

}
