package remapped;

import java.io.IOException;
import java.io.OutputStream;

public final class class_8977 implements class_4131 {
   public class_8977(class_245 var1, OutputStream var2) {
      this.field_45993 = var1;
      this.field_45992 = var2;
   }

   @Override
   public void method_19191(class_7059 var1, long var2) throws IOException {
      class_189.method_830(var1.field_36433, 0L, var2);

      while (var2 > 0L) {
         this.field_45993.method_1072();
         class_7332 var6 = var1.field_36430;
         int var7 = (int)Math.min(var2, (long)(var6.field_37484 - var6.field_37477));
         this.field_45992.write(var6.field_37478, var6.field_37477, var7);
         var6.field_37477 += var7;
         var2 -= (long)var7;
         var1.field_36433 -= (long)var7;
         if (var6.field_37477 == var6.field_37484) {
            var1.field_36430 = var6.method_33414();
            class_420.method_2090(var6);
         }
      }
   }

   @Override
   public void flush() throws IOException {
      this.field_45992.flush();
   }

   @Override
   public void close() throws IOException {
      this.field_45992.close();
   }

   @Override
   public class_245 method_19192() {
      return this.field_45993;
   }

   @Override
   public String toString() {
      return "sink(" + this.field_45992 + ")";
   }
}
