package io.stargate.auth.jwt;

import io.stargate.db.schema.Column.Kind;
import io.stargate.db.schema.Column.Type;
import io.stargate.db.schema.ImmutableColumn;
import io.stargate.db.schema.ImmutableTable;
import io.stargate.db.schema.Table;

public class SampleTable {

  public static Table SHOPPING_CART =
      ImmutableTable.builder()
          .keyspace("store")
          .name("shopping_cart")
          .addColumns(
              ImmutableColumn.builder()
                  .keyspace("store")
                  .table("shopping_cart")
                  .name("userid")
                  .type(Type.Text)
                  .kind(Kind.PartitionKey)
                  .build(),
              ImmutableColumn.builder()
                  .keyspace("store")
                  .table("shopping_cart")
                  .name("item_count")
                  .type(Type.Int)
                  .kind(Kind.Regular)
                  .build(),
              ImmutableColumn.builder()
                  .keyspace("store")
                  .table("shopping_cart")
                  .name("last_update_timestamp")
                  .type(Type.Timestamp)
                  .kind(Kind.Regular)
                  .build())
          .build();

  public static Table SHOPPING_CART_NON_TEXT_PK =
      ImmutableTable.builder()
          .keyspace("store")
          .name("shopping_cart")
          .addColumns(
              ImmutableColumn.builder()
                  .keyspace("store")
                  .table("shopping_cart")
                  .name("userid")
                  .type(Type.Text)
                  .kind(Kind.PartitionKey)
                  .build(),
              ImmutableColumn.builder()
                  .keyspace("store")
                  .table("shopping_cart")
                  .name("item_count")
                  .type(Type.Int)
                  .kind(Kind.PartitionKey)
                  .build(),
              ImmutableColumn.builder()
                  .keyspace("store")
                  .table("shopping_cart")
                  .name("last_update_timestamp")
                  .type(Type.Timestamp)
                  .kind(Kind.Regular)
                  .build())
          .build();
}
