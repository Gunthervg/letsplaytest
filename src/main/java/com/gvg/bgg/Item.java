package com.gvg.bgg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @author gunther
 * @since 27/11/15
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Item {

    @XmlElement(name = "name")
    private String name;

    @XmlElement(name = "thumbnail")
    private String thumbnailUrl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Item{");
        sb.append("name='").append(name).append('\'');
        sb.append(", thumbnailUrl='").append(thumbnailUrl.replaceAll("//", "")).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
