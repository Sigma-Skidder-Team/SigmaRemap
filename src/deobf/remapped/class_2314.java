package remapped;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class class_2314 implements class_5322 {
   private static String[] field_11579;
   public boolean field_11581;

   public class_2314(class_740 var1, class_8067 var2, class_9474 var3, class_3947 var4) {
      this.field_11582 = var1;
      this.field_11578 = var2;
      this.field_11580 = var3;
      this.field_11577 = var4;
   }

   @Override
   public long method_24273(class_7059 var1, long var2) throws IOException {
      long var6;
      try {
         var6 = this.field_11578.method_24273(var1, var2);
      } catch (IOException var9) {
         if (!this.field_11581) {
            this.field_11581 = true;
            this.field_11580.method_43760();
         }

         throw var9;
      }

      if (var6 == -1L) {
         if (!this.field_11581) {
            this.field_11581 = true;
            this.field_11577.close();
         }

         return -1L;
      } else {
         var1.method_32472(this.field_11577.method_18234(), var1.method_32468() - var6, var6);
         this.field_11577.method_18243();
         return var6;
      }
   }

   @Override
   public class_245 method_19192() {
      return this.field_11578.method_19192();
   }

   @Override
   public void close() throws IOException {
      if (!this.field_11581 && !class_8515.method_39198(this, 100, TimeUnit.MILLISECONDS)) {
         this.field_11581 = true;
         this.field_11580.method_43760();
      }

      this.field_11578.close();
   }
}
