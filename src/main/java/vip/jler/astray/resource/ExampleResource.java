package vip.jler.astray.resource;

import io.quarkus.vertx.web.Route;
import io.quarkus.vertx.web.RouteBase;
import io.vertx.core.http.HttpMethod;
import io.vertx.reactivex.ext.web.RoutingContext;

/**
 * @author jler
 */
@RouteBase(path = "e")
public class ExampleResource {

  @Route(path = "/hello", methods = HttpMethod.GET)
  void hello(RoutingContext rc) {
    rc.response().end("hello");
  }

}
