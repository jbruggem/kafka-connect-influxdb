/**
 * Copyright © 2017 Jeremy Custenborder (jcustenborder@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.jcustenborder.kafka.connect.influxdb;

import com.google.common.collect.ImmutableMap;

import java.util.Map;

public class InfluxDBSinkConnectorConfigTest {
  public static final String DATABASE = "test";
  public static final String URL = "http://localhost:8086/";

  public static Map<String, String> settings() {
    return ImmutableMap.of(
        InfluxDBSinkConnectorConfig.DATABASE_CONF, DATABASE,
        InfluxDBSinkConnectorConfig.URL_CONF, URL,
        InfluxDBSinkConnectorConfig.GZIP_ENABLE_CONF, "true"
    );
  }


}
