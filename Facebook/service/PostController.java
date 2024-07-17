package LLD.Facebook.service;

import LLD.Facebook.domain.Account;
import LLD.Facebook.domain.Comment;
import LLD.Facebook.domain.Post;
import LLD.Facebook.domain.UsersProfile;

public class PostController {

    public Post createAPost(String imageOrDocumentUrl, String text){
        return new Post(imageOrDocumentUrl, text);
    }

    public void sharePost(Post post, Account account){
        account.setPostList(post);
    }

    public void likePost(Post post){
        post.increaseLike();
    }

    public void postComment(Post post, String text, UsersProfile user){
        post.setComments(new Comment(text, user));
    }


}
