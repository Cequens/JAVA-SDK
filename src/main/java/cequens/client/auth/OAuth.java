package cequens.client.auth;

import cequens.client.Pair;

import java.util.Map;
import java.util.List;

@javax.annotation.Generated(value = "class cequens.codegen.languages.JavaClient", date = "2016-10-17T15:46:18.842+02:00")
public class OAuth implements Authentication {
  private String accessToken;

  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  @Override
  public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams) {
    if (accessToken != null) {
      headerParams.put("Authorization", "Bearer " + accessToken);
    }
  }
}
