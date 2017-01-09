package io.vertx.spi.cluster.ignite;

import io.vertx.core.Vertx;
import org.apache.ignite.Ignite;
import org.apache.ignite.configuration.CacheConfiguration;

/**
 * Created by g on 1/9/17.
 */
public interface cacheConfigProvider {
    CacheConfiguration getCacheConfig(String name, Ignite ignite, Vertx vertx );
}
