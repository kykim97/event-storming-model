package eventstormingmodel.domain;

import eventstormingmodel.domain.*;
import eventstormingmodel.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class VideoStreamProcessed extends AbstractEvent {

    public VideoStreamProcessed(VideoStream aggregate) {
        super(aggregate);
    }

    public VideoStreamProcessed() {
        super();
    }
}
