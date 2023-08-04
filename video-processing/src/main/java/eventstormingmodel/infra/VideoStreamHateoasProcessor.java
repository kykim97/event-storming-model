package eventstormingmodel.infra;

import eventstormingmodel.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class VideoStreamHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<VideoStream>> {

    @Override
    public EntityModel<VideoStream> process(EntityModel<VideoStream> model) {
        return model;
    }
}
