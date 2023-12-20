package bsky4j.model.bsky.embed;

/**
 * @see EmbedRecordViewRecord
 * @see EmbedRecordViewNotFound
 * @see EmbedRecordViewBlocked
 * @see bsky4j.model.bsky.feed.FeedDefsGeneratorView
 */
public interface EmbedRecordViewUnion {
    String getType();
}
