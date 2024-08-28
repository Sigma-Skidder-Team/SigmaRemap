package mapped;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

public class Class1750 extends Class1749 {
   private static final long field9475 = -1L;
   private final Class7284 field9476;
   private long field9477;
   private boolean field9478;
   public final Class7933 field9479;

   public Class1750(Class7933 var1, Class7284 var2) {
      super(var1);
      this.field9479 = var1;
      this.field9477 = -1L;
      this.field9478 = true;
      this.field9476 = var2;
   }

   @Override
   public long method7633(Class1734 var1, long var2) throws IOException {
      if (var2 < 0L) {
         throw new IllegalArgumentException("byteCount < 0: " + var2);
      } else if (!this.field9473) {
         if (!this.field9478) {
            return -1L;
         } else {
            if (this.field9477 == 0L || this.field9477 == -1L) {
               this.method7671();
               if (!this.field9478) {
                  return -1L;
               }
            }

            long var6 = this.field9479.field34014.method7633(var1, Math.min(var2, this.field9477));
            if (var6 != -1L) {
               this.field9477 -= var6;
               return var6;
            } else {
               this.method7670(false);
               throw new ProtocolException("unexpected end of stream");
            }
         }
      } else {
         throw new IllegalStateException("closed");
      }
   }

   private void method7671() throws IOException {
      if (this.field9477 != -1L) {
         this.field9479.field34014.method7617();
      }

      try {
         this.field9477 = this.field9479.field34014.method7605();
         String var3 = this.field9479.field34014.method7617().trim();
         if (this.field9477 < 0L || !var3.isEmpty() && !var3.startsWith(";")) {
            throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.field9477 + var3 + "\"");
         }
      } catch (NumberFormatException var4) {
         throw new ProtocolException(var4.getMessage());
      }

      if (this.field9477 == 0L) {
         this.field9478 = false;
         Class8394.method29452(this.field9479.field34012.method9808(), this.field9476, this.field9479.method26677());
         this.method7670(true);
      }
   }

   @Override
   public void close() throws IOException {
      if (!this.field9473) {
         if (this.field9478 && !Class9474.method36538(this, 100, TimeUnit.MILLISECONDS)) {
            this.method7670(false);
         }

         this.field9473 = true;
      }
   }
}
