package LLD.Facebook.service;

import LLD.Facebook.domain.Account;
import LLD.Facebook.domain.Post;
import LLD.Facebook.domain.UsersProfile;
import LLD.Facebook.service.feed.FeedFetchingStrategy;

import java.util.List;

public class AccountManager {

    PostController postController;

    Account userAccount;

    public void sendFriendRequest(Account accountToRequestFriend){
        accountToRequestFriend.setFriendRequests(userAccount);
    }

    public void acceptFriendRequest(Account friendRequestAccount){
        userAccount.setFriendRequests(friendRequestAccount);
    }

    public void createAndSharePost(String imageOrDocumentUrl, String text){
        Post post = postController.createAPost(imageOrDocumentUrl, text);
        postController.sharePost(post, userAccount);
    }

    public List<Post> fetchFeed(FeedFetchingStrategy feedFetchingStrategy){
        List<Account> connections = userAccount.getFriends();
        return feedFetchingStrategy.getPostList(connections);
    }

    public void postComment(Post post, String text, UsersProfile user){
        postController.postComment(post, text, user);
    }

    public void rejectFriendRequest(Account account){
        userAccount.removeFriendRequest(account);
    }
}
