package mapped;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

public class Class1751 extends Class1749 {
   private long field9480;
   public final Class7933 field9481;

   public Class1751(Class7933 var1, long var2) throws IOException {
      super(var1);
      this.field9481 = var1;
      this.field9480 = var2;
      if (this.field9480 == 0L) {
         this.method7670(true);
      }
   }

   @Override
   public long method7633(Class1734 var1, long var2) throws IOException {
      if (var2 >= 0L) {
         if (!this.field9473) {
            if (this.field9480 != 0L) {
               long var6 = this.field9481.field34014.method7633(var1, Math.min(this.field9480, var2));
               if (var6 != -1L) {
                  this.field9480 -= var6;
                  if (this.field9480 == 0L) {
                     this.method7670(true);
                  }

                  return var6;
               } else {
                  this.method7670(false);
                  throw new ProtocolException("unexpected end of stream");
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
         if (this.field9480 != 0L && !Class9474.method36538(this, 100, TimeUnit.MILLISECONDS)) {
            this.method7670(false);
         }

         this.field9473 = true;
      }
   }
}
