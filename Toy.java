public class Toy {

    private static Long idSequence = 1L;       
    public final Long id;
    String name;
    int quantity;
    int price;
    
    
    public Toy(String name, int quantity, int price) {
        this.id = idSequence++;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }


    public int getPrice() {
        return price;
    }

    
    public Long getId() {
        return id;
    }

    
    public String getName() {
        return name;
    }

    
    public int getQuantity() {
        return quantity;
    }

    public static void setIdSequence(Long idSequence) {
        Toy.idSequence = idSequence;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public void setPrice(int price) {
        this.price = price;
    }


    @Override
        public String toString() {
            return String.format(
                "\nИдентификационный номер - %d;\nНазвание - %s;\nКоличество - %d;\nЦена - %d;\n",
                this.id,            
                this.name,                
                this.quantity,
                this.price);
        }   
         
}
