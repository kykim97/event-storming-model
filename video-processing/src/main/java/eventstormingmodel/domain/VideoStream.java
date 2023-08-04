package eventstormingmodel.domain;

import eventstormingmodel.VideoProcessingApplication;
import eventstormingmodel.domain.VideoStreamProcessed;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "VideoStream_table")
@Data
public class VideoStream {

    @Id
    private String videoStreamUrl;

    @PostPersist
    public void onPostPersist() {
        VideoStreamProcessed videoStreamProcessed = new VideoStreamProcessed(
            this
        );
        videoStreamProcessed.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static VideoStreamRepository repository() {
        VideoStreamRepository videoStreamRepository = VideoProcessingApplication.applicationContext.getBean(
            VideoStreamRepository.class
        );
        return videoStreamRepository;
    }
}
