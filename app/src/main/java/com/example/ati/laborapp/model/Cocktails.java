package com.example.ati.laborapp.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;




public class Cocktails   {
  
  @SerializedName("drinks")
  private List<Cocktail> drinks = new ArrayList<Cocktail>();
  

  
  /**
   **/
  public List<Cocktail> getDrinks() {
    return drinks;
  }
  public void setDrinks(List<Cocktail> drinks) {
    this.drinks = drinks;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cocktails cocktails = (Cocktails) o;
    return Objects.equals(drinks, cocktails.drinks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(drinks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cocktails {\n");
    
    sb.append("    drinks: ").append(toIndentedString(drinks)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
