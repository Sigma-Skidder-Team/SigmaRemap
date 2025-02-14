package mapped;

import java.io.IOException;
import java.io.InputStream;

public final class Class1747 implements Class1737 {
   public final Class4916 field9468;
   public final InputStream field9469;

   public Class1747(Class4916 var1, InputStream var2) {
      this.field9468 = var1;
      this.field9469 = var2;
   }

   @Override
   public long method7633(Class1734 var1, long var2) throws IOException {
      if (var2 < 0L) {
         throw new IllegalArgumentException("byteCount < 0: " + var2);
      } else if (var2 == 0L) {
         return 0L;
      } else {
         try {
            this.field9468.method15217();
            Class9174 var6 = var1.method7632(1);
            int var7 = (int)Math.min(var2, (long)(8192 - var6.field42123));
            int var8 = this.field9469.read(var6.field42121, var6.field42123, var7);
            if (var8 == -1) {
               return -1L;
            } else {
               var6.field42123 += var8;
               var1.field9423 += (long)var8;
               return (long)var8;
            }
         } catch (AssertionError var9) {
            if (Class7001.method21711(var9)) {
               throw new IOException(var9);
            } else {
               throw var9;
            }
         }
      }
   }

   @Override
   public void close() throws IOException {
      this.field9469.close();
   }

   @Override
   public Class4916 method7541() {
      return this.field9468;
   }

   @Override
   public String toString() {
      return "source(" + this.field9469 + ")";
   }
}
