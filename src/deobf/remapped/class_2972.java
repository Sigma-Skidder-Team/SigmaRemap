package remapped;

import java.io.IOException;

public class class_2972 implements Packet<class_392> {
   private static String[] field_14612;
   private int field_14613;
   private int field_14614;

   public class_2972() {
   }

   public class_2972(int var1, int var2) {
      this.field_14613 = var1;
      this.field_14614 = var2;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_14613 = var1.readInt();
      this.field_14614 = var1.readInt();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.writeInt(this.field_14613);
      var1.writeInt(this.field_14614);
   }

   public void method_13582(class_392 var1) {
      var1.method_1897(this);
   }

   public int method_13579() {
      return this.field_14613;
   }

   public int method_13580() {
      return this.field_14614;
   }
}
