package remapped;

import java.io.IOException;

public class class_3296 extends class_5535 {
   private String[] field_16312;

   public class_3296() {
      super("3GPP Keywords Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      this.method_25141(var1);
      int var4 = var1.method_27531();
      this.field_16312 = new String[var4];

      for (int var5 = 0; var5 < var4; var5++) {
         int var6 = var1.method_27531();
         this.field_16312[var5] = var1.method_27538(var6);
      }
   }

   public String[] method_15117() {
      return this.field_16312;
   }
}
