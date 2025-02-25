# bsky4j

[![](https://jitpack.io/v/uakihir0/bsky4j.svg)](https://jitpack.io/#uakihir0/bsky4j)

Java client library for the [Bluesky](https://blueskyweb.xyz/)/ATProtocol API. This can compile with [google/j2objc]() to Objective-C library. (for iOS and Mac OS) 

## How to use

It is available with jitpack.io.

```
allprojects {
  repositories {
    maven { url 'https://jitpack.io' }
  }
}

dependencies {
  compile 'com.github.uakihir0:bsky4j:x.y.z'
}
```

### CreateSession 

```java
Response<ServerCreateSessionResponse> response = BlueskyFactory
        .getInstance(Service.BSKY_SOCIAL.getUri())
        .server().createSession(
                ServerCreateSessionRequest.builder()
                        .identifier("HANDLE")
                        .password("PASSWORD")
                        .build()
        );

String accessJwt = response.get().getAccessJwt();
```

### SendFeed

```java
Response<FeedPostResponse> response = BlueskyFactory
        .getInstance(Service.BSKY_SOCIAL.getUri())
        .feed().post(
                FeedPostRequest.builder()
                        .accessJwt(accessJwt)
                        .text("Hello World!!")
                        .build()
        );
```

### PLC Directory

```java
Response<DIDDetails> response = PLCDirectoryFactory
        .getInstance().getDIDDetails(did);

System.out.println(response.get().getAlsoKnownAs().get(0));
```

## Author

* [@uakihir0.com](https://bsky.app/profile/uakihir0.com)
* [Twitter:@uakihir0](https://twitter.com/uakihir0)


## License

This software is released under the MIT License, see LICENSE.txt.
