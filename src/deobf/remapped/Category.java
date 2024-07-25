package remapped;

public class Category {
   public static final Category RENDER = new Category("Render");
   public static final Category PLAYER = new Category("Player");
   public static final Category COMBAT = new Category("Combat");
   public static final Category WORLD = new Category("World");
   public static final Category MISC = new Category("Misc");
   public static final Category EXPLOIT = new Category("Exploit");
   public static final Category MOVEMENT = new Category("Movement");
   public static final Category GUI = new Category("Gui");
   public static final Category ITEM = new Category("Item");
   private String categoryName;

   public Category(String name) {
      this.categoryName = name;
   }

   public String getCategoryName() {
      return this.categoryName;
   }

   @Override
   public boolean equals(Object var1) {
      return var1 instanceof Category && ((Category)var1).categoryName.equals(this.categoryName);
   }

   @Override
   public int hashCode() {
      return this.categoryName.hashCode();
   }

   @Override
   public String toString() {
      return this.categoryName;
   }
}
