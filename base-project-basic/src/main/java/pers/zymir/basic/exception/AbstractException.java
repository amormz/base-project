package pers.zymir.basic.exception;

import lombok.Getter;
import pers.zymir.basic.result.BusinessStatus;

@Getter
public abstract class AbstractException extends RuntimeException {
  private final BusinessStatus businessStatus;

  public AbstractException(BusinessStatus businessStatus) {
    super(businessStatus.message(), null);
    this.businessStatus = businessStatus;
  }

  public AbstractException(String code, String message) {
    super(message, null);
    this.businessStatus = new BusinessStatus() {
      @Override
      public String code() {
        return code;
      }

      @Override
      public String message() {
        return message;
      }
    };
  }
}
