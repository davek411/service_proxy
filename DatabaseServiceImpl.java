package tinkering;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;

public class DatabaseServiceImpl implements DatabaseService {
  private final Vertx vertx;

  public DatabaseServiceImpl(Vertx vertx) {
    this.vertx = vertx;
  }
//  @Override
//  public void save(String collection, JsonObject document)
//  {
//    vertx.eventBus().send("serviceAddress", new JsonObject()
//        .put("action", "save")
//        .put("collection", collection)
//        .put("document", document));
//
//  }
  @Override
  public void save(){
    System.out.println("Hello!");
  }
}
