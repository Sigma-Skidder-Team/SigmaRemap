package remapped;

import java.io.IOException;

public class class_653 extends class_1237 {
   private static String[] field_3635;
   private int field_3636;
   private boolean field_3634;
   private String field_3633;

   @Override
   public void method_5498(class_6041 var1) throws IOException {
      int var4 = (int)var1.method_27524(2);
      this.field_3636 = var4 >> 6 & 1023;
      this.field_3634 = (var4 >> 5 & 1) == 1;
      if (this.field_3634) {
         this.field_3633 = var1.method_27533(this.field_6828 - 2);
      }

      this.method_5493(var1);
   }

   public int method_2984() {
      return this.field_3636;
   }

   public boolean method_2983() {
      return this.field_3634;
   }

   public String method_2985() {
      return this.field_3633;
   }
}
