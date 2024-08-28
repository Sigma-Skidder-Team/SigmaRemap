package mapped;

import java.io.IOException;
import java.util.logging.Level;

public final class Class1745 implements Class1737 {
   private final Class1735 field9458;
   public int field9459;
   public byte field9460;
   public int field9461;
   public int field9462;
   public short field9463;

   public Class1745(Class1735 var1) {
      this.field9458 = var1;
   }

   @Override
   public long method7633(Class1734 var1, long var2) throws IOException {
      while (this.field9462 == 0) {
         this.field9458.method7627((long)this.field9463);
         this.field9463 = 0;
         if ((this.field9460 & 4) != 0) {
            return -1L;
         }

         this.method7669();
      }

      long var6 = this.field9458.method7633(var1, Math.min(var2, (long)this.field9462));
      if (var6 != -1L) {
         this.field9462 = (int)((long)this.field9462 - var6);
         return var6;
      } else {
         return -1L;
      }
   }

   @Override
   public Class4916 method7541() {
      return this.field9458.method7541();
   }

   @Override
   public void close() throws IOException {
   }

   private void method7669() throws IOException {
      int var3 = this.field9461;
      this.field9459 = this.field9462 = Class1791.method7826(this.field9458);
      byte var4 = (byte)(this.field9458.method7596() & 255);
      this.field9460 = (byte)(this.field9458.method7596() & 255);
      if (Class1791.field9659.isLoggable(Level.FINE)) {
         Class1791.field9659.fine(Class7825.method26194(true, this.field9461, this.field9459, var4, this.field9460));
      }

      this.field9461 = this.field9458.method7599() & 2147483647;
      if (var4 == 9) {
         if (this.field9461 != var3) {
            throw Class7825.method26193("TYPE_CONTINUATION streamId changed");
         }
      } else {
         throw Class7825.method26193("%s != TYPE_CONTINUATION", var4);
      }
   }
}
