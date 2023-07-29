package pers.zymir.basic.result;

public class Resp<T> {
  private T data;

  private Status status;

  public static Resp<Void> ok() {
    Resp<Void> resp = new Resp<>();
    resp.status = new Status(BaseBusinessStatus.SUCCESS);
    return resp;
  }

  public static <T> Resp<T> success(T data) {
    Resp<T> resp = new Resp<>();
    resp.status = new Status(BaseBusinessStatus.SUCCESS);
    resp.data = data;
    return resp;
  }

  public static Resp<Void> error() {
    Resp<Void> resp = new Resp<>();
    resp.status = new Status(BaseBusinessStatus.ERROR);
    return resp;
  }

  public static Resp<Void> error(BusinessStatus businessStatus) {
    Resp<Void> resp = new Resp<>();
    resp.status = new Status(businessStatus);
    return resp;
  }
}
