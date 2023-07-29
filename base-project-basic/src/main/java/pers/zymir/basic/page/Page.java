package pers.zymir.basic.page;

import lombok.Data;

import java.util.List;

@Data
public class Page<T> {
  private List<T> data;

  private int total;

  private int current;

  private int totalPage;
}
