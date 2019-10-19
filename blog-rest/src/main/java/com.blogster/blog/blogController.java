package com.blogster.blog;

import com.blogster.entity.BlogPost;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class blogController {

    @GetMapping("blogs/{bloggerId}")
    public BlogPost getBlogs(@PathVariable("bloggerId") Long bloggerId){

        BlogPost blogPost = new BlogPost();

        blogPost.setHeadLine("En Blogg");
        blogPost.setPost("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut " +
                "labore et dolore magna aliqua. Viverra maecenas accumsan lacus vel facilisis volutpat est velit egestas. " +
                "Quam viverra orci sagittis eu volutpat odio. Suspendisse faucibus interdum posuere lorem. Eu mi bibendum" +
                "neque egestas congue quisque egestas diam. Gravida neque convallis a cras. Pellentesque elit eget gravida " +
                "cum. Maecenas pharetra convallis posuere morbi leo urna molestie at elementum. Nisl purus in mollis nunc " +
                "sed id semper risus in. Malesuada fames ac turpis egestas sed tempus urna et pharetra. In ornare quam viverra " +
                "orci sagittis. Libero volutpat sed cras ornare arcu dui. Nulla at volutpat diam ut venenatis tellus. At elementum " +
                "eu facilisis sed odio morbi quis commodo odio. Sed egestas egestas fringilla phasellus faucibus. Morbi tristique " +
                "senectus et netus et. Duis convallis convallis tellus id interdum velit laoreet id donec. Vitae justo eget magna " +
                "fermentum iaculis eu non. Vitae nunc sed velit dignissim sodales ut eu sem. Diam phasellus vestibulum lorem sed " +
                "risus ultricies tristique nulla.\n" +
                "\n" +
                "Magnis dis parturient montes nascetur ridiculus mus mauris vitae. Tellus integer feugiat scelerisque varius morbi enim. " +
                "Risus quis varius quam quisque id diam. Adipiscing tristique risus nec feugiat. Consectetur adipiscing elit duis tristique " +
                "sollicitudin nibh. At tellus at urna condimentum mattis pellentesque id. Porttitor lacus luctus accumsan tortor posuere ac " +
                "ut consequat semper. Egestas congue quisque egestas diam. Amet nisl suscipit adipiscing bibendum. Sit amet consectetur " +
                "adipiscing elit duis tristique.\n" +
                "\n" +
                "Nec feugiat in fermentum posuere urna nec. Eget nullam non nisi est sit amet. Nunc mi ipsum faucibus vitae aliquet nec " +
                "ullamcorper sit. Sit amet cursus sit amet. Sit amet facilisis magna etiam tempor orci. Vitae congue mauris rhoncus aenean " +
                "vel. Duis at tellus at urna condimentum mattis pellentesque id nibh. Amet purus gravida quis blandit turpis cursus in. " +
                "Molestie ac feugiat sed lectus vestibulum mattis ullamcorper velit sed. Commodo sed egestas egestas fringilla. Mattis rhoncus " +
                "urna neque viverra justo nec. Eget gravida cum sociis natoque penatibus et magnis dis parturient.\n" +
                "\n" +
                "Ultrices vitae auctor eu augue ut lectus arcu bibendum at. Sed libero enim sed faucibus. Dignissim cras tincidunt lobortis " +
                "feugiat vivamus at augue. In nulla posuere sollicitudin aliquam ultrices sagittis orci. At erat pellentesque adipiscing commodo " +
                "elit at imperdiet. A lacus vestibulum sed arcu non odio. Facilisis sed odio morbi quis commodo odio. Enim nec dui nunc mattis " +
                "enim ut tellus elementum sagittis. Nec sagittis aliquam malesuada bibendum arcu vitae elementum. Iaculis eu non diam phasellus " +
                "vestibulum. Amet tellus cras adipiscing enim eu turpis egestas pretium. At augue eget arcu dictum varius duis at consectetur lorem. " +
                "Nisi lacus sed viverra tellus in hac. Imperdiet proin fermentum leo vel orci porta non pulvinar. Ac turpis egestas integer eget " +
                "aliquet nibh praesent. Dis parturient montes nascetur ridiculus. Purus non enim praesent elementum. Nunc faucibus a pellentesque " +
                "sit amet porttitor eget dolor morbi.\n" +
                "\n" +
                "Tellus cras adipiscing enim eu turpis. Tristique et egestas quis ipsum suspendisse. Tincidunt tortor aliquam nulla facilisi cras. " +
                "Eget nullam non nisi est sit amet facilisis magna etiam. At auctor urna nunc id cursus metus aliquam. Est pellentesque elit ullamcorper " +
                "dignissim cras tincidunt lobortis. Sit amet consectetur adipiscing elit duis tristique sollicitudin. Consectetur lorem donec massa " +
                "sapien. At quis risus sed vulputate. Enim sit amet venenatis urna. Nunc non blandit massa enim. Ultricies integer quis auctor elit " +
                "sed vulputate mi. Morbi leo urna molestie at elementum eu facilisis sed odio. Amet purus gravida quis blandit turpis cursus in hac. " +
                "Dui nunc mattis enim ut tellus elementum sagittis vitae. Cursus risus at ultrices mi tempus imperdiet nulla malesuada. Tincidunt dui " +
                "ut ornare lectus.");
        return blogPost;
    }
}
