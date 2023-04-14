package prokos.crowd.vews;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import prokos.crowd.domain.Employee;
import prokos.crowd.repo.EmployeeRepository;

/**
 * @author Konstantin Matushenko
 */
@Route
public class MainView extends VerticalLayout {

    private final EmployeeRepository repo;
    final Grid<Employee> grid;

    @Autowired
    public MainView(EmployeeRepository repo) {
        this.repo = repo;
        this.grid = new Grid<>(Employee.class);
        add(grid);
        listCustomers("");
    }

//    private void listCustomers() {
//        grid.setItems(repo.findAll());
//    }

    private void listCustomers(String name) {
        if (name.isEmpty()) {
            grid.setItems(repo.findAll());
        }
        else {
            grid.setItems(repo.findByName(name));
        }
    }
}
