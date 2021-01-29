package manager;

import domain.Post;

public class PostManager {


    Post[] post = new Post[10];

    public Post[] search(int ownerId, String domain, String query, int ownersOnly, int count, int offSet, int extended, int fields){
        return null;
    }

    public void delete(int ownerId, int postId){

    }

    public static void main(String[] args) {

        PostManager postManager = new PostManager();
        postManager.search();
        postManager.delete(3);

    }

}
