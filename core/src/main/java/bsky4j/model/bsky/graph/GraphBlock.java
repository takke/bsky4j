package bsky4j.model.bsky.graph;

import bsky4j.BlueskyTypes;
import bsky4j.model.share.RecordUnion;

/**
 * A block.
 */
public class GraphBlock implements RecordUnion {

    public static final String TYPE = BlueskyTypes.GraphBlock;

    @Override
    public String getType() {
        return TYPE;
    }

    private String subject;
    private String createdAt;

    // region
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
    // endregion
}
