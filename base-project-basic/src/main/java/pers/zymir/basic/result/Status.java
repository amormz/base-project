package pers.zymir.basic.result;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Status {
  private final String code;

  private final String message;

  @Setter
  private String traceId;

  public Status(BusinessStatus businessStatus) {
    this.code = businessStatus.code();
    this.message = businessStatus.message();
  }
}
