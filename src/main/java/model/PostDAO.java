package model;

import java.util.List;

/**
 * Created by Kyle Stainsby on 5/31/2017.
 */
public interface PostDAO {
    boolean add(Post userpost);
    List<Post> findAll();

}
