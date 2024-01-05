package guilhermeBauer.github.splitrequestcopy.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa uma {@link Invoice Nota Fiscal}.
 *
 * @author diegosneves
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class Invoice {

    private String customerName;
    private String email;
    private Boolean isBuyer = Boolean.FALSE;
    private List<Item> items = new ArrayList<>();
    private Double totalPayable;
    private Double percentageConsumedTotalBill;
    private String paymentLink;
}
