package bsky4j.api.entity.bsky.feed;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Nullable;

import bsky4j.api.entity.share.AuthRequest;
import bsky4j.api.entity.share.MapRequest;

public class FeedSearchPostsRequest extends AuthRequest implements MapRequest {

    FeedSearchPostsRequest(String accessJwt) {
        super(accessJwt);
    }

    @Nullable
    private String q;
    @Nullable
    private Integer limit;
    @Nullable
    private String cursor;

    @Override
    public Map<String, Object> toMap() {
        HashMap<String, Object> map = new HashMap<>();
        addParam(map, "q", getQ());
        addParam(map, "limit", getLimit());
        addParam(map, "cursor", getCursor());
        return map;
    }

    // region
    public static Builder builder() {
        return new Builder();
    }

    @Nullable
    public String getQ() {
        return q;
    }

    @Nullable
    public Integer getLimit() {
        return limit;
    }

    @Nullable
    public String getCursor() {
        return cursor;
    }

    public static final class Builder {
        private String q;
        private Integer limit;
        private String cursor;
        private String accessJwt;

        private Builder() {
        }

        public Builder q(String q) {
            this.q = q;
            return this;
        }

        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public Builder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public Builder accessJwt(String accessJwt) {
            this.accessJwt = accessJwt;
            return this;
        }

        public FeedSearchPostsRequest build() {
            FeedSearchPostsRequest request = new FeedSearchPostsRequest(accessJwt);
            request.cursor = this.cursor;
            request.q = this.q;
            request.limit = this.limit;
            return request;
        }
    }
}