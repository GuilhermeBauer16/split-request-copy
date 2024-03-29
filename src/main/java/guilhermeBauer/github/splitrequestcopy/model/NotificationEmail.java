package guilhermeBauer.github.splitrequestcopy.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class NotificationEmail {
    private String email;
    private String consumerName;
    private Double total;
    private List<Item> itens;
    private String bank;
    private String link;
}
