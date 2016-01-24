package liqp.render;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by marek on 23.01.16.
 */
public class RenderingContext {


  public Map<String, Object> contextMap = new HashMap<>();
  private RenderingContext parentContext;


  public RenderingContext() {
  }


  public RenderingContext(Map<String, Object> contextMap) {
    this.contextMap = contextMap;
  }

  public RenderingContext put(String key, Object value) {
    contextMap.put(key, value);
    return this;
  }


  public RenderingContext get(String key) {
    throw new RuntimeException("Not implemented yet");
  }


  public Object remove(String key) {
    return contextMap.remove(key);
  }


  public String getString(String key) {
    return contextMap.get(key).toString();
  }


  public Object getObject(String key) {
    return contextMap.get(key);
  }


  public Object value() {
    throw new RuntimeException("Not implemented yet");
  }
}

