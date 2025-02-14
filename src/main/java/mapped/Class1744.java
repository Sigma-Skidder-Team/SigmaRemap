package mapped;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Class1744 implements Class1737 {
   private static String[] field9452;
   public boolean field9453;
   public final Class1735 field9454;
   public final Class6441 field9455;
   public final Class1733 field9456;
   public final Class6174 field9457;

   public Class1744(Class6174 var1, Class1735 var2, Class6441 var3, Class1733 var4) {
      this.field9457 = var1;
      this.field9454 = var2;
      this.field9455 = var3;
      this.field9456 = var4;
   }

   @Override
   public long method7633(Class1734 var1, long var2) throws IOException {
      long var6;
      try {
         var6 = this.field9454.method7633(var1, var2);
      } catch (IOException var9) {
         if (!this.field9453) {
            this.field9453 = true;
            this.field9455.method19553();
         }

         throw var9;
      }

      if (var6 == -1L) {
         if (!this.field9453) {
            this.field9453 = true;
            this.field9456.close();
         }

         return -1L;
      } else {
         var1.method7589(this.field9456.method7559(), var1.method7582() - var6, var6);
         this.field9456.method7580();
         return var6;
      }
   }

   @Override
   public Class4916 method7541() {
      return this.field9454.method7541();
   }

   @Override
   public void close() throws IOException {
      if (!this.field9453 && !Class9474.method36538(this, 100, TimeUnit.MILLISECONDS)) {
         this.field9453 = true;
         this.field9455.method19553();
      }

      this.field9454.close();
   }
}
