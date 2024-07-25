package remapped;

import java.io.IOException;

public class class_4548 implements class_6310<class_392> {
   private static String[] field_22170;
   public int field_22169;
   public int field_22171;
   public int field_22168;
   public int field_22167;

   public class_4548() {
   }

   public class_4548(class_8145 var1) {
      this(var1.method_37145(), var1.method_37098());
   }

   public class_4548(int var1, class_1343 var2) {
      this.field_22169 = var1;
      double var5 = 3.9;
      double var7 = class_9299.method_42827(var2.field_7336, -3.9, 3.9);
      double var9 = class_9299.method_42827(var2.field_7333, -3.9, 3.9);
      double var11 = class_9299.method_42827(var2.field_7334, -3.9, 3.9);
      this.field_22171 = (int)(var7 * 8000.0);
      this.field_22168 = (int)(var9 * 8000.0);
      this.field_22167 = (int)(var11 * 8000.0);
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_22169 = var1.method_37778();
      this.field_22171 = var1.readShort();
      this.field_22168 = var1.readShort();
      this.field_22167 = var1.readShort();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37743(this.field_22169);
      var1.writeShort(this.field_22171);
      var1.writeShort(this.field_22168);
      var1.writeShort(this.field_22167);
   }

   public void method_21096(class_392 var1) {
      var1.method_1936(this);
   }

   public int method_21093() {
      return this.field_22169;
   }

   public int method_21094() {
      return this.field_22171;
   }

   public int method_21095() {
      return this.field_22168;
   }

   public int method_21091() {
      return this.field_22167;
   }
}
