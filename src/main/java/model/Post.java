package model;

/**
 * Created by Kyle Stainsby on 5/31/2017.
 */
public class Post {
    private String title;
    private String text;
    private String user;

    public  Post(String title, String text, String user){
        this.title = title;
        this.text = text;
        this.user = user;
    }
    public String getTitle(){
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Post post = (Post) o;

        if (title != null ? !title.equals(post.title) : post.title != null) return false;
        if (text != null ? !text.equals(post.text) : post.text != null) return false;
        return user != null ? user.equals(post.user) : post.user == null;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (text != null ? text.hashCode() : 0);
        result = 31 * result + (user != null ? user.hashCode() : 0);
        return result;
    }

    public String getText(){
        return text;
    }
    public String getUser(){
        return user;
    }


}
