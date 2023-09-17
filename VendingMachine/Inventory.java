public class Inventory {
    private Product[][][] products;
    private int[][][] stock;
    public Inventory() {
        products = new Product[6][6][6];
        stock = new  int[6][6][6];

        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 6; j++){
                for (int k = 0; k < 6; k++){
                    products[0][0][k] = new Product("Takis",3.75,"150 cal", ProductCategory.SNACKS);
                    products[0][1][k] = new Product("Doritos",3.75,"200 cal", ProductCategory.SNACKS);
                    products[0][2][k] = new Product("Funyuns",3.75,"140 cal", ProductCategory.SNACKS);
                    products[0][3][k] = new Product("Lay's Classic",3.75,"160 cal", ProductCategory.SNACKS);
                    products[0][4][k] = new Product("Lay's Sour Cream",3.75,"160 cal", ProductCategory.SNACKS);
                    products[0][5][k] = new Product("Lay's Barbecue",3.75,"150 cal", ProductCategory.SNACKS);
                    products[1][0][k] = new Product("Nature Valley Protein Bar",2.99,"190 cal", ProductCategory.HEALTHY_SNACKS);
                    products[1][1][k] = new Product("Power Crunch Protein Bar",2.99,"220 cal", ProductCategory.HEALTHY_SNACKS);
                    products[1][2][k] = new Product("Clean Protein Bar",2.99,"200 cal", ProductCategory.HEALTHY_SNACKS);
                    products[1][3][k] = new Product("Quest Protein Bar",2.99,"220 cal", ProductCategory.HEALTHY_SNACKS);
                    products[1][4][k] = new Product("Quest Protein Cookie",3.99,"250 cal", ProductCategory.HEALTHY_SNACKS);
                    products[1][5][k] = new Product("Gatorade Protein Bar",2.99,"350 cal", ProductCategory.HEALTHY_SNACKS);
                    products[2][0][k] = new Product("CocaCola",2.99,"160 cal", ProductCategory.BEVERAGES);
                    products[2][1][k] = new Product("CocaCola Zero",2.99,"0 cal", ProductCategory.BEVERAGES);
                    products[2][2][k] = new Product("Sprite",2.99,"140 cal", ProductCategory.BEVERAGES);
                    products[2][3][k] = new Product("Mtn Dew",2.99,"180 cal", ProductCategory.BEVERAGES);
                    products[2][4][k] = new Product("Dr. Pepper",2.99,"160 cal", ProductCategory.BEVERAGES);
                    products[2][5][k] = new Product("Water",1.99,"0 cal", ProductCategory.BEVERAGES);
                    products[3][0][k] = new Product("Red Bull",2.99,"120 cal", ProductCategory.BEVERAGES);
                    products[3][1][k] = new Product("Celsius Mango Passion Fruit",2.99,"0 cal", ProductCategory.BEVERAGES);
                    products[3][2][k] = new Product("Celsius Peach Vibe",2.99,"0 cal", ProductCategory.BEVERAGES);
                    products[3][3][k] = new Product("Celsius Kiwi Guava",2.99,"0 cal", ProductCategory.BEVERAGES);
                    products[3][4][k] = new Product("Monster Zero",2.99,"0 cal", ProductCategory.BEVERAGES);
                    products[3][5][k] = new Product("Prime",2.99,"10 cal", ProductCategory.BEVERAGES);
                    products[4][0][k] = new Product("Nerds Gummy Clusters",2.99,"100 cal", ProductCategory.CANDY);
                    products[4][1][k] = new Product("Jolly Rancher",2.99,"120 cal", ProductCategory.CANDY);
                    products[4][2][k] = new Product("M&M",2.99,"140 cal", ProductCategory.CANDY);
                    products[4][3][k] = new Product("Snickers",2.99,"230 cal", ProductCategory.CANDY);
                    products[4][4][k] = new Product("Twix",2.99,"220 cal", ProductCategory.CANDY);
                    products[4][5][k] = new Product("StarBurst",2.99,"110 cal", ProductCategory.CANDY);
                    products[5][0][k] = new Product("Mask",3.99,"Non Food", ProductCategory.OTHER);
                    products[5][1][k] = new Product("Pen",2.99,"Non Food", ProductCategory.OTHER);
                    products[5][2][k] = new Product("Pencil",1.99,"Non Food", ProductCategory.OTHER);
                    products[5][3][k] = new Product("Covid Test",11.99,"Non Food", ProductCategory.OTHER);
                    products[5][4][k] = new Product("Cough Med",8.99,"Non Food", ProductCategory.OTHER);
                    products[5][5][k] = new Product("Socks",7.99,"Non Food", ProductCategory.OTHER);
                    stock[i][j][k] = (k == 0) ? 6 : 0;
                }
            }
        }
    }
    public Product getProduct(int row, int column, int stack){
        return products[row][column][stack];
    }
    public boolean checkValid(int row, int column, int stack) {
        return row >= 0 && row < 6 && column >= 0 && column < 6 && stack >= 0 && stack < 6 && stock[row][column][stack] > 0;
    }

    public  void decreaseStock(int row, int column, int stack){
        stock[row][column][stack]--;
    }
}
