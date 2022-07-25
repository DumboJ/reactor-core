package cn.dumboj.create;

import reactor.core.publisher.Flux;

import java.util.Arrays;

public class FluxPublish {
    public static void main(String[] args) {
//        Flux对象的工厂方法
        Flux<String> just = Flux.just("A", "B", "C");
        Flux<Integer> range = Flux.range(1, 10);
        Flux.fromIterable(Arrays.asList(args));
    }
}
