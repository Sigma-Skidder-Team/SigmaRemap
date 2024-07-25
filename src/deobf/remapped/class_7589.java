package remapped;

public class class_7589 implements Runnable {
   private static String[] field_38654;

   public class_7589(class_9543 var1, class_1331 var2, int var3) {
      this.field_38653 = var1;
      this.field_38655 = var2;
      this.field_38652 = var3;
   }

   @Override
   public void run() {
      class_9529 var3 = new class_9529(NCPBlockFly.method_27625(this.field_38655, Direction.field_817), Direction.field_817, this.field_38655, false);
      int var4 = class_9543.method_44032().field_9632.field_3853.field_36404;
      class_9543.method_44029().field_9632.field_3853.field_36404 = this.field_38652;
      class_9543.method_44019().field_9647.method_42129();
      class_9543.method_44024()
         .field_9647
         .method_42147(class_9543.method_44014().field_9632, class_9543.method_44016().field_9601, class_2584.field_12791, var3);
      class_9543.method_44026().field_9632.method_26597(class_2584.field_12791);
      class_9543.method_44034().field_9632.field_3853.field_36404 = var4;
   }
}
