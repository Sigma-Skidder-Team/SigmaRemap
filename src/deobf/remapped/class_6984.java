package remapped;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class class_6984 implements Closeable {
   private static final Logger field_35866 = Logger.getLogger(class_2842.class.getName());
   private final class_3947 field_35862;
   private final boolean field_35861;
   private final class_7059 field_35860;
   private int field_35865;
   private boolean field_35859;
   public final class_7858 field_35863;

   public class_6984(class_3947 var1, boolean var2) {
      this.field_35862 = var1;
      this.field_35861 = var2;
      this.field_35860 = new class_7059();
      this.field_35863 = new class_7858(this.field_35860);
      this.field_35865 = 16384;
   }

   public synchronized void method_31939() throws IOException {
      if (!this.field_35859) {
         if (this.field_35861) {
            if (field_35866.isLoggable(Level.FINE)) {
               field_35866.fine(class_8515.method_39218(">> CONNECTION %s", class_2842.field_13938.method_41900()));
            }

            this.field_35862.method_18248(class_2842.field_13938.method_41883());
            this.field_35862.flush();
         }
      } else {
         throw new IOException("closed");
      }
   }

   public synchronized void method_31957(class_5605 var1) throws IOException {
      if (!this.field_35859) {
         this.field_35865 = var1.method_25446(this.field_35865);
         if (var1.method_25451() != -1) {
            this.field_35863.method_35537(var1.method_25451());
         }

         byte var4 = 0;
         byte var5 = 4;
         byte var6 = 1;
         byte var7 = 0;
         this.method_31941(var7, var4, var5, var6);
         this.field_35862.flush();
      } else {
         throw new IOException("closed");
      }
   }

   public synchronized void method_31951(int var1, int var2, List<class_4331> var3) throws IOException {
      if (!this.field_35859) {
         this.field_35863.method_35538(var3);
         long var6 = this.field_35860.method_32468();
         int var8 = (int)Math.min((long)(this.field_35865 - 4), var6);
         byte var9 = 5;
         int var10 = var6 != (long)var8 ? 0 : 4;
         this.method_31941(var1, var8 + 4, var9, (byte)var10);
         this.field_35862.method_18235(var2 & 2147483647);
         this.field_35862.method_19191(this.field_35860, (long)var8);
         if (var6 > (long)var8) {
            this.method_31942(var1, var6 - (long)var8);
         }
      } else {
         throw new IOException("closed");
      }
   }

   public synchronized void method_31950() throws IOException {
      if (!this.field_35859) {
         this.field_35862.flush();
      } else {
         throw new IOException("closed");
      }
   }

   public synchronized void method_31940(boolean var1, int var2, int var3, List<class_4331> var4) throws IOException {
      if (!this.field_35859) {
         this.method_31944(var1, var2, var4);
      } else {
         throw new IOException("closed");
      }
   }

   public synchronized void method_31953(boolean var1, int var2, List<class_4331> var3) throws IOException {
      if (!this.field_35859) {
         this.method_31944(var1, var2, var3);
      } else {
         throw new IOException("closed");
      }
   }

   public synchronized void method_31943(int var1, List<class_4331> var2) throws IOException {
      if (!this.field_35859) {
         this.method_31944(false, var1, var2);
      } else {
         throw new IOException("closed");
      }
   }

   public synchronized void method_31949(int var1, class_1692 var2) throws IOException {
      if (!this.field_35859) {
         if (var2.field_8758 != -1) {
            byte var5 = 4;
            byte var6 = 3;
            byte var7 = 0;
            this.method_31941(var1, var5, var6, var7);
            this.field_35862.method_18235(var2.field_8758);
            this.field_35862.flush();
         } else {
            throw new IllegalArgumentException();
         }
      } else {
         throw new IOException("closed");
      }
   }

   public int method_31948() {
      return this.field_35865;
   }

   public synchronized void method_31952(boolean var1, int var2, class_7059 var3, int var4) throws IOException {
      if (!this.field_35859) {
         byte var7 = 0;
         if (var1) {
            var7 = (byte)(var7 | 1);
         }

         this.method_31946(var2, var7, var3, var4);
      } else {
         throw new IOException("closed");
      }
   }

   public void method_31946(int var1, byte var2, class_7059 var3, int var4) throws IOException {
      byte var7 = 0;
      this.method_31941(var1, var4, var7, var2);
      if (var4 > 0) {
         this.field_35862.method_19191(var3, (long)var4);
      }
   }

   public synchronized void method_31958(class_5605 var1) throws IOException {
      if (!this.field_35859) {
         int var4 = var1.method_25448() * 6;
         byte var5 = 4;
         byte var6 = 0;
         byte var7 = 0;
         this.method_31941(var7, var4, var5, var6);

         for (int var8 = 0; var8 < 10; var8++) {
            if (var1.method_25450(var8)) {
               int var9 = var8;
               if (var8 != 4) {
                  if (var8 == 7) {
                     var9 = 4;
                  }
               } else {
                  var9 = 3;
               }

               this.field_35862.method_18252(var9);
               this.field_35862.method_18235(var1.method_25453(var8));
            }
         }

         this.field_35862.flush();
      } else {
         throw new IOException("closed");
      }
   }

   public synchronized void method_31955(boolean var1, int var2, int var3) throws IOException {
      if (!this.field_35859) {
         byte var6 = 8;
         byte var7 = 6;
         int var8 = !var1 ? 0 : 1;
         byte var9 = 0;
         this.method_31941(var9, var6, var7, (byte)var8);
         this.field_35862.method_18235(var2);
         this.field_35862.method_18235(var3);
         this.field_35862.flush();
      } else {
         throw new IOException("closed");
      }
   }

   public synchronized void method_31947(int var1, class_1692 var2, byte[] var3) throws IOException {
      if (!this.field_35859) {
         if (var2.field_8758 != -1) {
            int var6 = 8 + var3.length;
            byte var7 = 7;
            byte var8 = 0;
            byte var9 = 0;
            this.method_31941(var9, var6, var7, var8);
            this.field_35862.method_18235(var1);
            this.field_35862.method_18235(var2.field_8758);
            if (var3.length > 0) {
               this.field_35862.method_18248(var3);
            }

            this.field_35862.flush();
         } else {
            throw class_2842.method_12942("errorCode.httpCode == -1");
         }
      } else {
         throw new IOException("closed");
      }
   }

   public synchronized void method_31956(int var1, long var2) throws IOException {
      if (!this.field_35859) {
         if (var2 != 0L && var2 <= 2147483647L) {
            byte var6 = 4;
            byte var7 = 8;
            byte var8 = 0;
            this.method_31941(var1, var6, var7, var8);
            this.field_35862.method_18235((int)var2);
            this.field_35862.flush();
         } else {
            throw class_2842.method_12942("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", var2);
         }
      } else {
         throw new IOException("closed");
      }
   }

   public void method_31941(int var1, int var2, byte var3, byte var4) throws IOException {
      if (field_35866.isLoggable(Level.FINE)) {
         field_35866.fine(class_2842.method_12940(false, var1, var2, var3, var4));
      }

      if (var2 <= this.field_35865) {
         if ((var1 & -2147483648) == 0) {
            method_31945(this.field_35862, var2);
            this.field_35862.method_18253(var3 & 255);
            this.field_35862.method_18253(var4 & 255);
            this.field_35862.method_18235(var1 & 2147483647);
         } else {
            throw class_2842.method_12942("reserved bit set: %s", var1);
         }
      } else {
         throw class_2842.method_12942("FRAME_SIZE_ERROR length > %d: %d", this.field_35865, var2);
      }
   }

   @Override
   public synchronized void close() throws IOException {
      this.field_35859 = true;
      this.field_35862.close();
   }

   private static void method_31945(class_3947 var0, int var1) throws IOException {
      var0.method_18253(var1 >>> 16 & 0xFF);
      var0.method_18253(var1 >>> 8 & 0xFF);
      var0.method_18253(var1 & 0xFF);
   }

   private void method_31942(int var1, long var2) throws IOException {
      while (var2 > 0L) {
         int var6 = (int)Math.min((long)this.field_35865, var2);
         var2 -= (long)var6;
         this.method_31941(var1, var6, (byte)9, (byte)(var2 != 0L ? 0 : 4));
         this.field_35862.method_19191(this.field_35860, (long)var6);
      }
   }

   public void method_31944(boolean var1, int var2, List<class_4331> var3) throws IOException {
      if (!this.field_35859) {
         this.field_35863.method_35538(var3);
         long var6 = this.field_35860.method_32468();
         int var8 = (int)Math.min((long)this.field_35865, var6);
         byte var9 = 1;
         int var10 = var6 != (long)var8 ? 0 : 4;
         if (var1) {
            var10 = (byte)(var10 | 1);
         }

         this.method_31941(var2, var8, var9, (byte)var10);
         this.field_35862.method_19191(this.field_35860, (long)var8);
         if (var6 > (long)var8) {
            this.method_31942(var2, var6 - (long)var8);
         }
      } else {
         throw new IOException("closed");
      }
   }
}
