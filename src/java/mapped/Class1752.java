package mapped;

import java.io.IOException;

public class Class1752 extends Class1749 {
   private boolean field9482;
   public final Class7933 field9483;

   public Class1752(Class7933 var1) {
      super(var1);
      this.field9483 = var1;
   }

   @Override
   public long method7633(Class1734 var1, long var2) throws IOException {
      if (var2 >= 0L) {
         if (!this.field9473) {
            if (!this.field9482) {
               long var6 = this.field9483.field34014.method7633(var1, var2);
               if (var6 != -1L) {
                  return var6;
               } else {
                  this.field9482 = true;
                  this.method7670(true);
                  return -1L;
               }
            } else {
               return -1L;
            }
         } else {
            throw new IllegalStateException("closed");
         }
      } else {
         throw new IllegalArgumentException("byteCount < 0: " + var2);
      }
   }

   @Override
   public void close() throws IOException {
      if (!this.field9473) {
         if (!this.field9482) {
            this.method7670(false);
         }

         this.field9473 = true;
      }
   }
}
