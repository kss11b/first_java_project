package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kyle Stainsby on 5/31/2017.
 */
public class SimplePostDAO implements PostDAO{

    private List<Post> userposts;

    public SimplePostDAO(){
        userposts = new ArrayList<>();
    }

    @Override
    public boolean add(Post userpost){
        return userposts.add(userpost);
    }

    @Override
    public List<Post> findAll() {
        return new ArrayList<>(userposts);
    }
}
