package stmall.domain;

import java.util.*;
import lombok.Data;
import stmall.infra.AbstractEvent;

@Data
public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private Long productId;
    private String productName;
    private Long userId;
    private Long orderId;
    private Integer qty;
    private String address;
    private String status;
}
