package cn.dumboj.create;

import reactor.core.publisher.Mono;
import reactor.core.publisher.MonoSink;

public class MonoPublish {
    public static void main(String[] args) {
        Mono<Object> empty = Mono.empty();
        Mono<String> one_thing = Mono.just("one thing");
    }
}
