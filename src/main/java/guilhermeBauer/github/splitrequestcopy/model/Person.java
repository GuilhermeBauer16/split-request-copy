package guilhermeBauer.github.splitrequestcopy.model;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String personName;
    private String email;
    private Boolean isBuyer = Boolean.FALSE;
    private List<Item> items = new ArrayList<>();
}
