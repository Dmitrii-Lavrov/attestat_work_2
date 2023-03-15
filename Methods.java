import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Methods {

  public List<Toy> all_list = new ArrayList<>();
  public List<Toy> prize_list = new ArrayList<>();

  public void add_new_toy(String name, int quantity, int price) {
    Toy toy = new Toy(name, quantity, price);
    all_list.add(toy);
    System.out.println(toy);
  }

  public void add_quantity(int id, int quantity) {
    for (int i = 0; i < all_list.size(); i++) {
      if (id == all_list.get(i).getId()) {
        all_list.get(i).setQuantity(all_list.get(i).getQuantity() + quantity);
      }
    }
  }

  public void change_price(int id, int price) {
    for (int i = 0; i < all_list.size(); i++) {
      if (id == all_list.get(i).getId()) {
        all_list.get(i).setPrice(price);
      }
    }
  }

  
  public void choice_prize_toys(int count) {
    while (prize_list.size() < count) {
      int id = (int) (Math.random() * 10);
      for (int i = 0; i < all_list.size(); i++) {
        if (id == all_list.get(i).getId()) {
          prize_list.add(new Toy(all_list.get(i).getName(), 1, all_list.get(i).getPrice()));
          all_list.get(i).setQuantity(all_list.get(i).getQuantity() - 1);
          if (all_list.get(i).getQuantity() == 0) {
            all_list.remove(i);
            break;
          }
        }
      }
    }
  }



  public void get_toy() {    
      String text = String.format(
        "Идентификационный номер - %d; Название - %s; Количество - %d; Цена - %d;",
        prize_list.get(0).getId(),           
        prize_list.get(0).getName(),                
        prize_list.get(0).getQuantity(),
        prize_list.get(0).getPrice()); 
      try (FileWriter fw = new FileWriter("file.txt", true)) {
        fw.append(text);
        fw.append("\n");

      } catch (IOException e) {
        e.printStackTrace();
      }
      prize_list.remove(0);
     
  }

}
