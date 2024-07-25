package remapped;

import java.io.IOException;

public class class_3605 implements class_6310<class_392> {
   private static String[] field_17622;
   private float field_17623;
   private int field_17624;
   private float field_17625;

   public class_3605() {
   }

   public class_3605(float var1, int var2, float var3) {
      this.field_17623 = var1;
      this.field_17624 = var2;
      this.field_17625 = var3;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_17623 = var1.readFloat();
      this.field_17624 = var1.method_37778();
      this.field_17625 = var1.readFloat();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.writeFloat(this.field_17623);
      var1.method_37743(this.field_17624);
      var1.writeFloat(this.field_17625);
   }

   public void method_16825(class_392 var1) {
      var1.method_1968(this);
   }

   public float method_16823() {
      return this.field_17623;
   }

   public int method_16824() {
      return this.field_17624;
   }

   public float method_16821() {
      return this.field_17625;
   }
}
