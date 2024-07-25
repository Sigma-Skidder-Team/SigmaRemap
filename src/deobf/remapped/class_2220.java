package remapped;

import java.io.IOException;
import java.util.List;

public class class_2220 extends class_5548 {
   private static String[] field_11097;

   public class_2220(class_2695 var1, String var2, Object[] var3, int var4, List var5, boolean var6) {
      super(var2, var3);
      this.field_11100 = var1;
      this.field_11098 = var4;
      this.field_11099 = var5;
      this.field_11101 = var6;
   }

   @Override
   public void method_25227() {
      boolean var3 = this.field_11100.field_13195.method_27513(this.field_11098, this.field_11099, this.field_11101);

      try {
         if (var3) {
            this.field_11100.field_13203.method_31949(this.field_11098, class_1692.field_8762);
         }

         if (var3 || this.field_11101) {
            synchronized (this.field_11100) {
               this.field_11100.field_13194.remove(this.field_11098);
            }
         }
      } catch (IOException var7) {
      }
   }
}
