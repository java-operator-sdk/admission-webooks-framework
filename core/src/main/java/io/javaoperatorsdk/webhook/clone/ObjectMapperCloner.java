package io.javaoperatorsdk.webhook.clone;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectMapperCloner<T> implements Cloner<T> {

  private final ObjectMapper objectMapper = new ObjectMapper();

  @Override
  @SuppressWarnings("unchecked")
  public T clone(T object) {
    if (object == null) {
      return null;
    }
    try {
      return (T) objectMapper.readValue(objectMapper.writeValueAsString(object),
          object.getClass());
    } catch (JsonProcessingException e) {
      throw new IllegalStateException(e);
    }
  }
}
