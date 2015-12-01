package com.gvg;

import com.google.gson.Gson;
import com.gvg.bgg.Items;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gunther
 * @since 28/11/15
 */
@RestController
public class SearchCollectionController {

    @RequestMapping(value = "/search", method = RequestMethod.GET)
//    @ResponseStatus(HttpStatus.OK)  @RequestParam("username") String username
    @ResponseBody
    public String searchCollection() {
        RestTemplate restTemplate = new RestTemplate();
        ClientHttpRequestInterceptor interceptor = new LoggingRequestInterceptor();
        List<ClientHttpRequestInterceptor> ris = new ArrayList<>();
        ris.add(interceptor);

        restTemplate.setInterceptors(ris);
        restTemplate.setRequestFactory(new BufferingClientHttpRequestFactory(new SimpleClientHttpRequestFactory()));
        Items items = restTemplate.getForObject("https://www.boardgamegeek.com/xmlapi2/collection?username=gusha", Items.class);
//        for(Item item : items.getItems()){
//            item.setThumbnailUrl(item.getThumbnailUrl().replaceAll("//", ""));
//        }
        Gson gson = new Gson();
        String json = gson.toJson(items);

        System.out.println(json);
        return json;
    }
}
