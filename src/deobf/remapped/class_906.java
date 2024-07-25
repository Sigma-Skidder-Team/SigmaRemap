package remapped;

import java.io.IOException;
import java.util.List;

public class class_906 extends class_5548 {
   private static String[] field_4644;

   public class_906(class_2695 var1, String var2, Object[] var3, int var4, List var5) {
      super(var2, var3);
      this.field_4642 = var1;
      this.field_4645 = var4;
      this.field_4643 = var5;
   }

   @Override
   public void method_25227() {
      boolean var3 = this.field_4642.field_13195.method_27514(this.field_4645, this.field_4643);

      try {
         if (var3) {
            this.field_4642.field_13203.method_31949(this.field_4645, class_1692.field_8762);
            synchronized (this.field_4642) {
               this.field_4642.field_13194.remove(this.field_4645);
            }
         }
      } catch (IOException var7) {
      }
   }
}
