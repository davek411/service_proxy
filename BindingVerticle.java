package tinkering;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import io.vertx.core.Vertx;
import io.vertx.serviceproxy.ServiceBinder;

public class BindingVerticle extends AbstractVerticle{

  private DatabaseService databaseService;

  @Override
  public void start(Promise<Void> promise) {
// Register the handler
    new ServiceBinder(vertx)
      .setAddress("serviceAddress")
      .register(DatabaseService.class, databaseService);
    promise.complete();
  }
}
