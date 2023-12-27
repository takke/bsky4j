package bsky4j.api.entity.bsky.feed;

import java.util.List;

import javax.annotation.Nullable;

import bsky4j.model.bsky.feed.FeedDefsPostView;

public class FeedSearchPostsResponse {

    private List<FeedDefsPostView> posts;

    @Nullable
    private String cursor;

    @Nullable
    private Integer hitsTotal = 0;

    // region
    public List<FeedDefsPostView> getPosts() {
        return posts;
    }

    public void setPosts(List<FeedDefsPostView> posts) {
        this.posts = posts;
    }

    @Nullable
    public String getCursor() {
        return cursor;
    }

    public void setCursor(@Nullable String cursor) {
        this.cursor = cursor;
    }

    @Nullable
    public Integer getHitsTotal() {
        return hitsTotal;
    }

    public void setHitsTotal(@Nullable Integer hitsTotal) {
        this.hitsTotal = hitsTotal;
    }

    // endregion
}
