package eventstormingmodel.domain;

import eventstormingmodel.IndexerApplication;
import eventstormingmodel.domain.FileIndexed;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "FileIndex_table")
@Data
public class FileIndex {

    @Id
    private String fileIndex;

    @PostPersist
    public void onPostPersist() {
        FileIndexed fileIndexed = new FileIndexed(this);
        fileIndexed.publishAfterCommit();
    }

    public static FileIndexRepository repository() {
        FileIndexRepository fileIndexRepository = IndexerApplication.applicationContext.getBean(
            FileIndexRepository.class
        );
        return fileIndexRepository;
    }
}
