package guilhermeBauer.github.splitrequestcopy.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class InviteDTO {

    private String customerName;
    private List<Item> itens = new ArrayList<>();
    private Double totalPayable;
    private String paymentLink;
}
