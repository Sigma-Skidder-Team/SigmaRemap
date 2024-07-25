package remapped;

import java.io.IOException;

public class class_2708 implements class_6310<class_392> {
   private static String[] field_13253;
   private int field_13254;
   private int field_13255;

   public class_2708() {
   }

   public class_2708(Entity var1, Entity var2) {
      this.field_13254 = var1.method_37145();
      this.field_13255 = var2 == null ? 0 : var2.method_37145();
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_13254 = var1.readInt();
      this.field_13255 = var1.readInt();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.writeInt(this.field_13254);
      var1.writeInt(this.field_13255);
   }

   public void method_12205(class_392 var1) {
      var1.method_1910(this);
   }

   public int method_12206() {
      return this.field_13254;
   }

   public int method_12204() {
      return this.field_13255;
   }
}
