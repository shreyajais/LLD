package LLD.Facebook.service.feed;

import LLD.Facebook.domain.Account;
import LLD.Facebook.domain.Post;

import java.util.List;

public interface FeedFetchingStrategy {
    public List<Post> getPostList(List<Account> accounts);
}
