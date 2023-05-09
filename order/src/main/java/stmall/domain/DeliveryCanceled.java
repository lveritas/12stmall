package stmall.domain;

import java.util.*;
import lombok.*;
import stmall.domain.*;
import stmall.infra.AbstractEvent;

@Data
@ToString
public class DeliveryCanceled extends AbstractEvent {

    private Long id;
    private Long productId;
    private String productName;
    private Long userId;
    private Long orderId;
    private Integer qty;
    private String address;
    private String status;
}
