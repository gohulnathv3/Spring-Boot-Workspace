package io.spring.springboot;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document(collection = "wikimedia_changes")
public class WikimediaData {

    @Id
    private Long id;
    private String wikiEventData;

    public WikimediaData() {
    }

    public WikimediaData(Long id, String wikiEventData) {
        this.id = id;
        this.wikiEventData = wikiEventData;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWikiEventData() {
        return wikiEventData;
    }

    public void setWikiEventData(String wikiEventData) {
        this.wikiEventData = wikiEventData;
    }
}
