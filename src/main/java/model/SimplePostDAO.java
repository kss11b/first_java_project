package model;

/**
 * Created by Kyle Stainsby on 5/31/2017.
 */
public class SimplePostDAO implements postDAO{

    private List<post> userposts;

    public SimplePostsDAO(){
        userposts = new ArrayList<>();
    }

    @Override
    public boolean add() {
        return userposts.add(post);
    }

    @Override
    public List<post> findAll() {
        return new ArrayList<>(userposts);
    }
}
