package eventstormingmodel.domain;

import eventstormingmodel.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "videoStreams",
    path = "videoStreams"
)
public interface VideoStreamRepository
    extends PagingAndSortingRepository<VideoStream, String> {}
