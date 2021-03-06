<!--

    Licensed to the Apache Software Foundation (ASF) under one
    or more contributor license agreements.  See the NOTICE file
    distributed with this work for additional information
    regarding copyright ownership.  The ASF licenses this file
    to you under the Apache License, Version 2.0 (the
    "License"); you may not use this file except in compliance
    with the License.  You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing,
    software distributed under the License is distributed on an
    "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
    KIND, either express or implied.  See the License for the
    specific language governing permissions and limitations
    under the License.

-->

## 0.8.0 (version-0) -> version-1

* Add Struct **TSStatusType**, including code and message. Instead of using ~~TS_StatusCode~~, ~~errorCode~~ and ~~errorMessage~~.

* Rename ~~TS_Status~~ to **TSStatus**, which use **TSStatusType** to show specific success or error status, code and message.

* Use struct **TSStatus** to replace all structs with only one field `1: required TS_Status status`, including: ~~TSCloseSessionResp~~ closeSession, ~~TSCancelOperationResp~~ cancelOperation, ~~TSCloseOperationResp~~ closeOperation, ~~TSSetTimeZoneResp~~ setTimeZone.

* Add **TSBatchInsertionReq**, **TSCreateTimeseriesReq**, **TSSetStorageGroupReq** and **TSDeleteReq**.

* Change method name ~~TSExecuteStatementResp executeInsertion(1:TSInsertionReq req)~~ to **TSExecuteStatementResp insert(1:TSInsertionReq req)**, and add method **TSExecuteBatchStatementResp insertBatch(1:TSBatchInsertionReq req)** for batch inserting interface.

* Add method **TSStatus setStorageGroup(1:TSSetStorageGroupReq req)** and **TSStatus createTimeseries(1:TSCreateTimeseriesReq req)** for creating metadata interface.

* Add method **TSStatus deleteTimeseries(1:TSDeleteReq req)** for deleting timeseries.

* Change item in enum **TSProtocolVersion** from ~~TSFILE_SERVICE_PROTOCOL_V1~~ to IOTDB_SERVICE_PROTOCOL_V1.

* Add **storageGroups** in struct **TSFetchMetadataResp**. Rename ~~ColumnsList~~ to **columnsList**, ~~showTimeseriesList~~ to **timeseriesList**, ~~showStorageGroups~~ to **storageGroups**.