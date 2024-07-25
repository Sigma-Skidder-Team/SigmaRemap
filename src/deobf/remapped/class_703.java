package remapped;

import java.io.IOException;

public class class_703 implements Packet<class_1243> {
   private static String[] field_3838;
   private ItemStack field_3836;
   private boolean field_3837;
   private int field_3839;

   public class_703() {
   }

   public class_703(ItemStack var1, boolean var2, int var3) {
      this.field_3836 = var1.method_27973();
      this.field_3837 = var2;
      this.field_3839 = var3;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_3836 = var1.method_37755();
      this.field_3837 = var1.readBoolean();
      this.field_3839 = var1.method_37778();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37764(this.field_3836);
      var1.writeBoolean(this.field_3837);
      var1.method_37743(this.field_3839);
   }

   public void method_3144(class_1243 var1) {
      var1.method_5561(this);
   }

   public ItemStack method_3145() {
      return this.field_3836;
   }

   public boolean method_3142() {
      return this.field_3837;
   }

   public int method_3143() {
      return this.field_3839;
   }
}
