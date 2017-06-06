package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kyle Stainsby on 5/31/2017.
 */
public class SimplePostDAO implements postDAO{

    private List<post> userposts;

    public SimplePostDAO(){
        userposts = new ArrayList<>();
    }

    @Override
    public boolean add(post userpost){
        return userposts.add(userpost);
    }

    @Override
    public List<post> findAll() {
        return new ArrayList<>(userposts);
    }
}
