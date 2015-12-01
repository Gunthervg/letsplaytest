package com.gvg;

import com.gvg.bgg.Items;
import org.junit.Test;

import javax.xml.bind.JAXB;
import java.io.StringReader;

/**
 * @author gunther
 * @since 1/12/15
 */
public class CollectionUnmarshalTest {

    private static final String response = "<items totalitems=\"28\" termsofuse=\"http://boardgamegeek.com/xmlapi/termsofuse\" pubdate=\"Thu, 26 Nov 2015 20:52:35 +0000\">\n" +
            "  <item objecttype=\"thing\" objectid=\"167400\" subtype=\"boardgame\" collid=\"30664355\">\n" +
            "    <name sortindex=\"1\">Ashes: Rise of the Phoenixborn</name>\n" +
            "    <yearpublished>2015</yearpublished>\n" +
            "    <image>//cf.geekdo-images.com/images/pic2479679.jpg</image>\n" +
            "    <thumbnail>//cf.geekdo-images.com/images/pic2479679_t.jpg</thumbnail>\n" +
            "    <status own=\"1\" prevowned=\"0\" fortrade=\"0\" want=\"0\" wanttoplay=\"0\" wanttobuy=\"0\" wishlist=\"0\" preordered=\"0\" lastmodified=\"2015-10-11 16:46:02\" />\n" +
            "    <numplays>0</numplays>\n" +
            "  </item>\n" +
            "  <item objecttype=\"thing\" objectid=\"181876\" subtype=\"boardgame\" collid=\"30797777\">\n" +
            "    <name sortindex=\"1\">Ashes: Rise of the Phoenixborn – Dimona Odinstar Promo</name>\n" +
            "    <yearpublished>2015</yearpublished>\n" +
            "    <image>//cf.geekdo-images.com/images/pic2626795.jpg</image>\n" +
            "    <thumbnail>//cf.geekdo-images.com/images/pic2626795_t.jpg</thumbnail>\n" +
            "    <status own=\"1\" prevowned=\"0\" fortrade=\"0\" want=\"0\" wanttoplay=\"0\" wanttobuy=\"0\" wishlist=\"0\" preordered=\"0\" lastmodified=\"2015-10-17 14:34:12\" />\n" +
            "    <numplays>0</numplays>\n" +
            "  </item>\n" +
            "</items>";

    @Test
    public void testName() throws Exception {
        Items items = JAXB.unmarshal(new StringReader(response), Items.class);
        System.out.println(items);

    }
}
