package pers.zymir.basic.page;

import lombok.Data;

@Data
public class PageRequest {

  private static final int MAX_PAGE_LENGTH = 100;

  private int pageNumber = 1;

  private int pageSize = 15;

  public void setPageSize(int pageSize) {
    this.pageSize = Math.min(MAX_PAGE_LENGTH, pageSize);
  }
}
