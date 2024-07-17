package LLD.Facebook.domain;

import java.util.List;

public class Account {
    String id;
    List<Account> friends; // both side mapping

    List<Post> postList;

    PrivacyType privacyType;

    AccountStatus accountStatus;

    List<Account> blockedBy;
    List<Account> blockedAccounts;

    List<Account> friendRequests;

    UsersProfile usersProfile;

    public Account(PrivacyType privacyType, List<Account> friendRequests, UsersProfile usersProfile) {
        this.friends = friends;
        this.postList = postList;
        this.privacyType = privacyType;
        this.friendRequests = friendRequests;
        this.usersProfile = usersProfile;
    }

    public List<Account> getFriends() {
        return friends;
    }

    public void addFriend(Account account) {
        getFriends().add(account);
    }

    public UsersProfile getUser() {
        return usersProfile;
    }

    public List<Account> getFriendRequests() {
        return friendRequests;
    }

    public void setFriendRequests(Account friendRequest) {
        getFriendRequests().add(friendRequest);
    }

    public List<Post> getPostList() {
        return postList;
    }

    public void setPostList(Post post) {
        getPostList().add(post);
    }
    public void removeFriendRequest(Account account){
        getFriendRequests().remove(account);
    }
}
