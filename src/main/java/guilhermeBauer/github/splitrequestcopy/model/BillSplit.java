package guilhermeBauer.github.splitrequestcopy.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

/**
 * Representa um modelo de divisão de fatura.
 *
 * <p>Esta classe é usada principalmente para manter um registro da divisão de contas aplicada a várias faturas.
 * Ela mantém uma lista de objetos {@link InvoiceDTO} que representam faturas individuais e um valor total a ser pago.
 *
 * @author diegosneves
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class BillSplit {

    private List<InviteDTO> invoices = new ArrayList<>();

    private Double totalPayable;

}
