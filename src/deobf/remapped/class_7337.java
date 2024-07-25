package remapped;

import java.io.IOException;

public class class_7337 extends class_6926 {
   private String field_37526;
   private String field_37525;

   public class_7337() {
      super("Rating Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      if (this.field_19001.method_34615() != 1969517665L) {
         this.method_18110(var1);
      } else {
         super.method_18109(var1);
         long var4 = var1.method_27524(4);
         long var6 = var1.method_27524(4);
         this.field_37526 = class_504.method_2502(var1.method_27524(2));
         byte[] var8 = var1.method_27537((int)this.method_18113(var1), 0);
         this.field_37525 = new String(var8, "UTF-8");
      }
   }

   public String method_33465() {
      return this.field_37526;
   }

   public String method_33464() {
      return this.field_37525;
   }
}
