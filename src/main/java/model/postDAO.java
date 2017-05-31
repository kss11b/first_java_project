package model;

/**
 * Created by Kyle Stainsby on 5/31/2017.
 */
public interface postDAO {
    boolean add(post, userpost);
    List<post> findAll();

}
