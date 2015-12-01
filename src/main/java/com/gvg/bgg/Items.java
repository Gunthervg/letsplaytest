package com.gvg.bgg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Collection;

/**
 * @author gunther
 * @since 27/11/15
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "items")
public class Items {

    @XmlAttribute
    private String totalitems;

    @XmlElement(name = "item")
    private Collection<Item> items;

    public String getTotalitems() {
        return totalitems;
    }

    public void setTotalitems(String totalitems) {
        this.totalitems = totalitems;
    }

    public Collection<Item> getItems() {
        return items;
    }

    public void setItems(Collection<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Items{");
        sb.append("totalitems='").append(totalitems).append('\'');
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
