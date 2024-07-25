package remapped;

import java.io.IOException;

public class class_2883 implements class_4131 {
   public class_2883(class_1353 var1, class_4131 var2) {
      this.field_14119 = var1;
      this.field_14120 = var2;
   }

   @Override
   public void method_19191(class_7059 var1, long var2) throws IOException {
      class_189.method_830(var1.field_36433, 0L, var2);

      while (var2 > 0L) {
         long var6 = 0L;

         for (class_7332 var8 = var1.field_36430; var6 < 65536L; var8 = var8.field_37475) {
            int var9 = var1.field_36430.field_37484 - var1.field_36430.field_37477;
            var6 += (long)var9;
            if (var6 >= var2) {
               var6 = var2;
               break;
            }
         }

         boolean var15 = false;
         this.field_14119.method_6243();

         try {
            this.field_14120.method_19191(var1, var6);
            var2 -= var6;
            var15 = true;
         } catch (IOException var13) {
            throw this.field_14119.method_6250(var13);
         } finally {
            this.field_14119.method_6251(var15);
         }
      }
   }

   @Override
   public void flush() throws IOException {
      boolean var3 = false;
      this.field_14119.method_6243();

      try {
         this.field_14120.flush();
         var3 = true;
      } catch (IOException var8) {
         throw this.field_14119.method_6250(var8);
      } finally {
         this.field_14119.method_6251(var3);
      }
   }

   @Override
   public void close() throws IOException {
      boolean var3 = false;
      this.field_14119.method_6243();

      try {
         this.field_14120.close();
         var3 = true;
      } catch (IOException var8) {
         throw this.field_14119.method_6250(var8);
      } finally {
         this.field_14119.method_6251(var3);
      }
   }

   @Override
   public class_245 method_19192() {
      return this.field_14119;
   }

   @Override
   public String toString() {
      return "AsyncTimeout.sink(" + this.field_14120 + ")";
   }
}
