package io.javaoperatorsdk.webhook.conversion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.fabric8.kubernetes.api.model.HasMetadata;
import io.fabric8.kubernetes.api.model.apiextensions.v1.ConversionReview;
import io.javaoperatorsdk.webhook.conversion.mapper.CustomResourceV1Mapper;
import io.javaoperatorsdk.webhook.conversion.mapper.CustomResourceV2Mapper;
import io.javaoperatorsdk.webhook.conversion.mapper.CustomResourceV3Mapper;

public class ConversionControllerTest {

  public static final String DEFAULT_ADDITIONAL_VALUE = "defaultAdditionalValue";
  public static final String DEFAULT_THIRD_VALUE = "defaultThirdValue";

  ConversionController controller = new ConversionController();

  @BeforeEach
  void setup() {
    controller.registerMapper(new CustomResourceV1Mapper());
    controller.registerMapper(new CustomResourceV2Mapper());
    controller.registerMapper(new CustomResourceV3Mapper());
  }

  @Test
  void handlesSimpleConversion() {

  }

  @Test
  void convertsVariousVersionsInSingleRequest() {

  }

  ConversionReview createRequest(HasMetadata... resources) {

    return null;
  }

}
