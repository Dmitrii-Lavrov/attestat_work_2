public class Main {

    public static void main(String[] args){                  
       
        Methods m =  new Methods();
        // Добаление в список новых игрушек
        m.add_new_toy("Робот", 22, 600);
        m.add_new_toy("Конструктор", 12, 1000);
        m.add_new_toy("Настольная игра", 15, 1300);
        m.add_new_toy("Плюшевый мишка", 19, 700);
        m.add_new_toy("Водный пистолет", 20, 1700);
        System.out.println(m.all_list); // Список всех игрушек
      
        m.choice_prize_toys(5);    // Розыгрыш 5 игрушек  
        System.out.println(m.prize_list); // Список выпавших игрушек
        m.change_price(2, 1200); // Изменение цены игрушки
        m.add_quantity(1, 10); // Добавление игрушек
        m.get_toy(); // Получение игрушки и запись  в файл
        m.get_toy(); // Получение игрушки и запись  в файл
        m.get_toy(); // Получение игрушки и запись  в файл
        System.out.println(m.prize_list); // Список выпавших игрушек
    }
}
