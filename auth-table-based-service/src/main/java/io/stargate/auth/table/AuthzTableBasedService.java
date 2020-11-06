/*
 * Copyright The Stargate Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.stargate.auth.table;

import io.stargate.auth.AuthorizationService;
import io.stargate.db.datastore.ResultSet;
import io.stargate.db.schema.Table;
import java.util.List;
import java.util.concurrent.Callable;

public class AuthzTableBasedService implements AuthorizationService {

  @Override
  public ResultSet authorizedDataRead(
      Callable<ResultSet> action, String token, List<String> primaryKeyValues, Table tableMetadata)
      throws Exception {
    // Cannot perform authorization with a table based token so just return
    return action.call();
  }

  @Override
  public ResultSet authorizedDataWrite(
      Callable<ResultSet> action, String token, List<String> primaryKeyValues, Table tableMetadata)
      throws Exception {
    // Cannot perform authorization with a table based token so just return
    return action.call();
  }

  @Override
  public ResultSet authorizedSchemaRead(
      Callable<ResultSet> action, String token, String keyspace, String table) throws Exception {
    // Cannot perform authorization with a table based token so just return
    return action.call();
  }

  @Override
  public ResultSet authorizedSchemaWrite(
      Callable<ResultSet> action, String token, String keyspace, String table) throws Exception {
    // Cannot perform authorization with a table based token so just return
    return action.call();
  }
}