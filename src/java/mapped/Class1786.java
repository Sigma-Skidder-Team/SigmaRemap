package mapped;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class Class1786 implements Closeable {
   private static final Logger field9630 = Logger.getLogger(Class7825.class.getName());
   private final Class1733 field9631;
   private final boolean field9632;
   private final Class1734 field9633;
   private int field9634;
   private boolean field9635;
   public final Class9298 field9636;

   public Class1786(Class1733 var1, boolean var2) {
      this.field9631 = var1;
      this.field9632 = var2;
      this.field9633 = new Class1734();
      this.field9636 = new Class9298(this.field9633);
      this.field9634 = 16384;
   }

   public synchronized void method7767() throws IOException {
      if (!this.field9635) {
         if (this.field9632) {
            if (field9630.isLoggable(Level.FINE)) {
               field9630.fine(Class9474.method36559(">> CONNECTION %s", Class7825.field33580.method8449()));
            }

            this.field9631.method7561(Class7825.field33580.method8459());
            this.field9631.flush();
         }
      } else {
         throw new IOException("closed");
      }
   }

   public synchronized void method7768(Class8702 var1) throws IOException {
      if (!this.field9635) {
         this.field9634 = var1.method31383(this.field9634);
         if (var1.method31380() != -1) {
            this.field9636.method35053(var1.method31380());
         }

         byte var5 = 4;
         byte var6 = 1;
         this.method7782(0, 0, var5, var6);
         this.field9631.flush();
      } else {
         throw new IOException("closed");
      }
   }

   public synchronized void method7769(int var1, int var2, List<Header> var3) throws IOException {
      if (!this.field9635) {
         this.field9636.method35050(var3);
         long var6 = this.field9633.method7582();
         int var8 = (int)Math.min((long)(this.field9634 - 4), var6);
         byte var9 = 5;
         byte var10 = (byte) (var6 != (long)var8 ? 0 : 4);
         this.method7782(var1, var8 + 4, var9, var10);
         this.field9631.method7573(var2 & 2147483647);
         this.field9631.method7540(this.field9633, (long)var8);
         if (var6 > (long)var8) {
            this.method7784(var1, var6 - (long)var8);
         }
      } else {
         throw new IOException("closed");
      }
   }

   public synchronized void method7770() throws IOException {
      if (!this.field9635) {
         this.field9631.flush();
      } else {
         throw new IOException("closed");
      }
   }

   public synchronized void method7771(boolean var1, int var2, int var3, List<Header> var4) throws IOException {
      if (!this.field9635) {
         this.method7785(var1, var2, var4);
      } else {
         throw new IOException("closed");
      }
   }

   public synchronized void method7772(boolean var1, int var2, List<Header> var3) throws IOException {
      if (!this.field9635) {
         this.method7785(var1, var2, var3);
      } else {
         throw new IOException("closed");
      }
   }

   public synchronized void method7773(int var1, List<Header> var2) throws IOException {
      if (!this.field9635) {
         this.method7785(false, var1, var2);
      } else {
         throw new IOException("closed");
      }
   }

   public synchronized void method7774(int var1, Class2077 var2) throws IOException {
      if (!this.field9635) {
         if (var2.field13533 != -1) {
            byte var6 = 3;
            byte var7 = 0;
            this.method7782(var1, 4, var6, var7);
            this.field9631.method7573(var2.field13533);
            this.field9631.flush();
         } else {
            throw new IllegalArgumentException();
         }
      } else {
         throw new IOException("closed");
      }
   }

   public int method7775() {
      return this.field9634;
   }

   public synchronized void method7776(boolean var1, int var2, Class1734 var3, int var4) throws IOException {
      if (!this.field9635) {
         byte var7 = 0;
         if (var1) {
            var7 = (byte)(var7 | 1);
         }

         this.method7777(var2, var7, var3, var4);
      } else {
         throw new IOException("closed");
      }
   }

   public void method7777(int var1, byte var2, Class1734 var3, int var4) throws IOException {
      byte var7 = 0;
      this.method7782(var1, var4, var7, var2);
      if (var4 > 0) {
         this.field9631.method7540(var3, (long)var4);
      }
   }

   public synchronized void method7778(Class8702 var1) throws IOException {
      if (!this.field9635) {
         int var4 = var1.method31379() * 6;
         byte var5 = 4;
         byte var6 = 0;
         byte var7 = 0;
         this.method7782(var7, var4, var5, var6);

         for (int var8 = 0; var8 < 10; var8++) {
            if (var1.method31377(var8)) {
               int var9 = var8;
               if (var8 != 4) {
                  if (var8 == 7) {
                     var9 = 4;
                  }
               } else {
                  var9 = 3;
               }

               this.field9631.method7571(var9);
               this.field9631.method7573(var1.method31378(var8));
            }
         }

         this.field9631.flush();
      } else {
         throw new IOException("closed");
      }
   }

   public synchronized void method7779(boolean var1, int var2, int var3) throws IOException {
      if (!this.field9635) {
         byte var6 = 8;
         byte var7 = 6;
         int var8 = !var1 ? 0 : 1;
         byte var9 = 0;
         this.method7782(var9, var6, var7, (byte)var8);
         this.field9631.method7573(var2);
         this.field9631.method7573(var3);
         this.field9631.flush();
      } else {
         throw new IOException("closed");
      }
   }

   public synchronized void method7780(int var1, Class2077 var2, byte[] var3) throws IOException {
      if (!this.field9635) {
         if (var2.field13533 != -1) {
            int var6 = 8 + var3.length;
            byte var7 = 7;
            byte var8 = 0;
            byte var9 = 0;
            this.method7782(var9, var6, var7, var8);
            this.field9631.method7573(var1);
            this.field9631.method7573(var2.field13533);
            if (var3.length > 0) {
               this.field9631.method7561(var3);
            }

            this.field9631.flush();
         } else {
            throw Class7825.method26192("errorCode.httpCode == -1");
         }
      } else {
         throw new IOException("closed");
      }
   }

   public synchronized void method7781(int var1, long var2) throws IOException {
      if (!this.field9635) {
         if (var2 != 0L && var2 <= 2147483647L) {
            byte var6 = 4;
            byte var7 = 8;
            byte var8 = 0;
            this.method7782(var1, var6, var7, var8);
            this.field9631.method7573((int)var2);
            this.field9631.flush();
         } else {
            throw Class7825.method26192("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", var2);
         }
      } else {
         throw new IOException("closed");
      }
   }

   public void method7782(int var1, int var2, byte var3, byte var4) throws IOException {
      if (field9630.isLoggable(Level.FINE)) {
         field9630.fine(Class7825.method26194(false, var1, var2, var3, var4));
      }

      if (var2 <= this.field9634) {
         if ((var1 & -2147483648) == 0) {
            method7783(this.field9631, var2);
            this.field9631.method7570(var3 & 255);
            this.field9631.method7570(var4 & 255);
            this.field9631.method7573(var1 & 2147483647);
         } else {
            throw Class7825.method26192("reserved bit set: %s", var1);
         }
      } else {
         throw Class7825.method26192("FRAME_SIZE_ERROR length > %d: %d", this.field9634, var2);
      }
   }

   @Override
   public synchronized void close() throws IOException {
      this.field9635 = true;
      this.field9631.close();
   }

   private static void method7783(Class1733 var0, int var1) throws IOException {
      var0.method7570(var1 >>> 16 & 0xFF);
      var0.method7570(var1 >>> 8 & 0xFF);
      var0.method7570(var1 & 0xFF);
   }

   private void method7784(int var1, long var2) throws IOException {
      while (var2 > 0L) {
         int var6 = (int)Math.min((long)this.field9634, var2);
         var2 -= (long)var6;
         this.method7782(var1, var6, (byte)9, (byte)(var2 != 0L ? 0 : 4));
         this.field9631.method7540(this.field9633, (long)var6);
      }
   }

   public void method7785(boolean var1, int var2, List<Header> var3) throws IOException {
      if (!this.field9635) {
         this.field9636.method35050(var3);
         long var6 = this.field9633.method7582();
         int var8 = (int)Math.min((long)this.field9634, var6);
         byte var9 = 1;
         int var10 = var6 != (long)var8 ? 0 : 4;
         if (var1) {
            var10 = (byte)(var10 | 1);
         }

         this.method7782(var2, var8, var9, (byte)var10);
         this.field9631.method7540(this.field9633, (long)var8);
         if (var6 > (long)var8) {
            this.method7784(var2, var6 - (long)var8);
         }
      } else {
         throw new IOException("closed");
      }
   }
}
