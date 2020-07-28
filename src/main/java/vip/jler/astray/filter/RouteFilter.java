package vip.jler.astray.filter;

import io.vertx.ext.web.RoutingContext;
import org.jboss.logging.Logger;

public class RouteFilter {

  private static final Logger LOG = Logger.getLogger(RouteFilter.class);

  /**
   * 请求日志
   * @param rc RoutingContext
   */
  @io.quarkus.vertx.web.RouteFilter(100)
  void loggingFilter(RoutingContext rc) {
    final String method = rc.request().method().name();
    final String path = rc.request().path();
    final String address = rc.request().remoteAddress().toString();
    LOG.infof("Request %s %s from IP %s", method, path, address);
    rc.next();
  }
}
