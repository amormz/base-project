package pers.zymir.basic.result;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum BaseBusinessStatus implements BusinessStatus {
  SUCCESS("200", "success"),
  ERROR("500", "system error");

  private final String code;

  private final String message;

  @Override
  public String code() {
    return null;
  }

  @Override
  public String message() {
    return null;
  }
}
