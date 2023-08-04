package eventstormingmodel.domain;

import eventstormingmodel.domain.*;
import eventstormingmodel.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class FileStatusDisplayed extends AbstractEvent {

    public FileStatusDisplayed(FileStatus aggregate) {
        super(aggregate);
    }

    public FileStatusDisplayed() {
        super();
    }
}
