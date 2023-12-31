package com.bookstore.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "books")
public class Book {

  @Id
  private int id;
  private String name;
  private String description;
  private String author;
  private double price;
  private int stock;
}
