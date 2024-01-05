package guilhermeBauer.github.splitrequestcopy.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Representa um Item.
 *
 * @author diegosneves
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Item {

    private String name;
    private Double price;
}
