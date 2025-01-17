/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.aiplatform.v1beta1;

import com.google.api.HttpBody;
import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.Value;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import javax.annotation.Generated;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@Generated("by gapic-generator-java")
public class PredictionServiceClientTest {
  private static MockPredictionService mockPredictionService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private PredictionServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockPredictionService = new MockPredictionService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockPredictionService));
    mockServiceHelper.start();
  }

  @AfterClass
  public static void stopServer() {
    mockServiceHelper.stop();
  }

  @Before
  public void setUp() throws IOException {
    mockServiceHelper.reset();
    channelProvider = mockServiceHelper.createChannelProvider();
    PredictionServiceSettings settings =
        PredictionServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = PredictionServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void predictTest() throws Exception {
    PredictResponse expectedResponse =
        PredictResponse.newBuilder()
            .addAllPredictions(new ArrayList<Value>())
            .setDeployedModelId("deployedModelId-1817547906")
            .setModel(ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]").toString())
            .setModelVersionId("modelVersionId-2006125846")
            .setModelDisplayName("modelDisplayName1578770308")
            .build();
    mockPredictionService.addResponse(expectedResponse);

    EndpointName endpoint = EndpointName.of("[PROJECT]", "[LOCATION]", "[ENDPOINT]");
    List<Value> instances = new ArrayList<>();
    Value parameters = Value.newBuilder().build();

    PredictResponse actualResponse = client.predict(endpoint, instances, parameters);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockPredictionService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    PredictRequest actualRequest = ((PredictRequest) actualRequests.get(0));

    Assert.assertEquals(endpoint.toString(), actualRequest.getEndpoint());
    Assert.assertEquals(instances, actualRequest.getInstancesList());
    Assert.assertEquals(parameters, actualRequest.getParameters());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void predictExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockPredictionService.addException(exception);

    try {
      EndpointName endpoint = EndpointName.of("[PROJECT]", "[LOCATION]", "[ENDPOINT]");
      List<Value> instances = new ArrayList<>();
      Value parameters = Value.newBuilder().build();
      client.predict(endpoint, instances, parameters);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void predictTest2() throws Exception {
    PredictResponse expectedResponse =
        PredictResponse.newBuilder()
            .addAllPredictions(new ArrayList<Value>())
            .setDeployedModelId("deployedModelId-1817547906")
            .setModel(ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]").toString())
            .setModelVersionId("modelVersionId-2006125846")
            .setModelDisplayName("modelDisplayName1578770308")
            .build();
    mockPredictionService.addResponse(expectedResponse);

    String endpoint = "endpoint1741102485";
    List<Value> instances = new ArrayList<>();
    Value parameters = Value.newBuilder().build();

    PredictResponse actualResponse = client.predict(endpoint, instances, parameters);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockPredictionService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    PredictRequest actualRequest = ((PredictRequest) actualRequests.get(0));

    Assert.assertEquals(endpoint, actualRequest.getEndpoint());
    Assert.assertEquals(instances, actualRequest.getInstancesList());
    Assert.assertEquals(parameters, actualRequest.getParameters());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void predictExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockPredictionService.addException(exception);

    try {
      String endpoint = "endpoint1741102485";
      List<Value> instances = new ArrayList<>();
      Value parameters = Value.newBuilder().build();
      client.predict(endpoint, instances, parameters);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void rawPredictTest() throws Exception {
    HttpBody expectedResponse =
        HttpBody.newBuilder()
            .setContentType("contentType-389131437")
            .setData(ByteString.EMPTY)
            .addAllExtensions(new ArrayList<Any>())
            .build();
    mockPredictionService.addResponse(expectedResponse);

    EndpointName endpoint = EndpointName.of("[PROJECT]", "[LOCATION]", "[ENDPOINT]");
    HttpBody httpBody = HttpBody.newBuilder().build();

    HttpBody actualResponse = client.rawPredict(endpoint, httpBody);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockPredictionService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    RawPredictRequest actualRequest = ((RawPredictRequest) actualRequests.get(0));

    Assert.assertEquals(endpoint.toString(), actualRequest.getEndpoint());
    Assert.assertEquals(httpBody, actualRequest.getHttpBody());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void rawPredictExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockPredictionService.addException(exception);

    try {
      EndpointName endpoint = EndpointName.of("[PROJECT]", "[LOCATION]", "[ENDPOINT]");
      HttpBody httpBody = HttpBody.newBuilder().build();
      client.rawPredict(endpoint, httpBody);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void rawPredictTest2() throws Exception {
    HttpBody expectedResponse =
        HttpBody.newBuilder()
            .setContentType("contentType-389131437")
            .setData(ByteString.EMPTY)
            .addAllExtensions(new ArrayList<Any>())
            .build();
    mockPredictionService.addResponse(expectedResponse);

    String endpoint = "endpoint1741102485";
    HttpBody httpBody = HttpBody.newBuilder().build();

    HttpBody actualResponse = client.rawPredict(endpoint, httpBody);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockPredictionService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    RawPredictRequest actualRequest = ((RawPredictRequest) actualRequests.get(0));

    Assert.assertEquals(endpoint, actualRequest.getEndpoint());
    Assert.assertEquals(httpBody, actualRequest.getHttpBody());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void rawPredictExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockPredictionService.addException(exception);

    try {
      String endpoint = "endpoint1741102485";
      HttpBody httpBody = HttpBody.newBuilder().build();
      client.rawPredict(endpoint, httpBody);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void explainTest() throws Exception {
    ExplainResponse expectedResponse =
        ExplainResponse.newBuilder()
            .addAllExplanations(new ArrayList<Explanation>())
            .setDeployedModelId("deployedModelId-1817547906")
            .addAllPredictions(new ArrayList<Value>())
            .build();
    mockPredictionService.addResponse(expectedResponse);

    EndpointName endpoint = EndpointName.of("[PROJECT]", "[LOCATION]", "[ENDPOINT]");
    List<Value> instances = new ArrayList<>();
    Value parameters = Value.newBuilder().build();
    String deployedModelId = "deployedModelId-1817547906";

    ExplainResponse actualResponse =
        client.explain(endpoint, instances, parameters, deployedModelId);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockPredictionService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ExplainRequest actualRequest = ((ExplainRequest) actualRequests.get(0));

    Assert.assertEquals(endpoint.toString(), actualRequest.getEndpoint());
    Assert.assertEquals(instances, actualRequest.getInstancesList());
    Assert.assertEquals(parameters, actualRequest.getParameters());
    Assert.assertEquals(deployedModelId, actualRequest.getDeployedModelId());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void explainExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockPredictionService.addException(exception);

    try {
      EndpointName endpoint = EndpointName.of("[PROJECT]", "[LOCATION]", "[ENDPOINT]");
      List<Value> instances = new ArrayList<>();
      Value parameters = Value.newBuilder().build();
      String deployedModelId = "deployedModelId-1817547906";
      client.explain(endpoint, instances, parameters, deployedModelId);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void explainTest2() throws Exception {
    ExplainResponse expectedResponse =
        ExplainResponse.newBuilder()
            .addAllExplanations(new ArrayList<Explanation>())
            .setDeployedModelId("deployedModelId-1817547906")
            .addAllPredictions(new ArrayList<Value>())
            .build();
    mockPredictionService.addResponse(expectedResponse);

    String endpoint = "endpoint1741102485";
    List<Value> instances = new ArrayList<>();
    Value parameters = Value.newBuilder().build();
    String deployedModelId = "deployedModelId-1817547906";

    ExplainResponse actualResponse =
        client.explain(endpoint, instances, parameters, deployedModelId);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockPredictionService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ExplainRequest actualRequest = ((ExplainRequest) actualRequests.get(0));

    Assert.assertEquals(endpoint, actualRequest.getEndpoint());
    Assert.assertEquals(instances, actualRequest.getInstancesList());
    Assert.assertEquals(parameters, actualRequest.getParameters());
    Assert.assertEquals(deployedModelId, actualRequest.getDeployedModelId());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void explainExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockPredictionService.addException(exception);

    try {
      String endpoint = "endpoint1741102485";
      List<Value> instances = new ArrayList<>();
      Value parameters = Value.newBuilder().build();
      String deployedModelId = "deployedModelId-1817547906";
      client.explain(endpoint, instances, parameters, deployedModelId);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
