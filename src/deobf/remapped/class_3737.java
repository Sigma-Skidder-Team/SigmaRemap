package remapped;

import java.io.IOException;
import java.io.InputStream;

public final class class_3737 implements class_5322 {
   public class_3737(class_245 var1, InputStream var2) {
      this.field_18263 = var1;
      this.field_18261 = var2;
   }

   @Override
   public long method_24273(class_7059 var1, long var2) throws IOException {
      if (var2 < 0L) {
         throw new IllegalArgumentException("byteCount < 0: " + var2);
      } else if (var2 == 0L) {
         return 0L;
      } else {
         try {
            this.field_18263.method_1072();
            class_7332 var6 = var1.method_32473(1);
            int var7 = (int)Math.min(var2, (long)(8192 - var6.field_37484));
            int var8 = this.field_18261.read(var6.field_37478, var6.field_37484, var7);
            if (var8 == -1) {
               return -1L;
            } else {
               var6.field_37484 += var8;
               var1.field_36433 += (long)var8;
               return (long)var8;
            }
         } catch (AssertionError var9) {
            if (class_1259.method_5664(var9)) {
               throw new IOException(var9);
            } else {
               throw var9;
            }
         }
      }
   }

   @Override
   public void close() throws IOException {
      this.field_18261.close();
   }

   @Override
   public class_245 method_19192() {
      return this.field_18263;
   }

   @Override
   public String toString() {
      return "source(" + this.field_18261 + ")";
   }
}
