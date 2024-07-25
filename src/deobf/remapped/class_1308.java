package remapped;

import java.io.IOException;
import java.util.Random;

public final class class_1308 {
   public final boolean field_7231;
   public final Random field_7232;
   public final class_3947 field_7229;
   public boolean field_7233;
   public final class_7059 field_7230 = new class_7059();
   public final class_5326 field_7226 = new class_5326(this);
   public boolean field_7234;
   public final byte[] field_7227;
   public final byte[] field_7225;

   public class_1308(boolean var1, class_3947 var2, Random var3) {
      if (var2 != null) {
         if (var3 != null) {
            this.field_7231 = var1;
            this.field_7229 = var2;
            this.field_7232 = var3;
            this.field_7227 = !var1 ? null : new byte[4];
            this.field_7225 = !var1 ? null : new byte[8192];
         } else {
            throw new NullPointerException("random == null");
         }
      } else {
         throw new NullPointerException("sink == null");
      }
   }

   public void method_5958(class_9091 var1) throws IOException {
      synchronized (this) {
         this.method_5955(9, var1);
      }
   }

   public void method_5959(class_9091 var1) throws IOException {
      synchronized (this) {
         this.method_5955(10, var1);
      }
   }

   public void method_5956(int var1, class_9091 var2) throws IOException {
      class_9091 var5 = class_9091.field_46557;
      if (var1 != 0 || var2 != null) {
         if (var1 != 0) {
            class_9294.method_42768(var1);
         }

         class_7059 var6 = new class_7059();
         var6.method_32493(var1);
         if (var2 != null) {
            var6.method_32487(var2);
         }

         var5 = var6.method_36586();
      }

      synchronized (this) {
         try {
            this.method_5955(8, var5);
         } finally {
            this.field_7233 = true;
         }
      }
   }

   private void method_5955(int var1, class_9091 var2) throws IOException {
      assert Thread.holdsLock(this);

      if (!this.field_7233) {
         int var5 = var2.method_41902();
         if ((long)var5 <= 125L) {
            int var6 = 128 | var1;
            this.field_7229.method_18253(var6);
            if (!this.field_7231) {
               this.field_7229.method_18253(var5);
               this.field_7229.method_18247(var2);
            } else {
               int var7 = var5 | 128;
               this.field_7229.method_18253(var7);
               this.field_7232.nextBytes(this.field_7227);
               this.field_7229.method_18248(this.field_7227);
               byte[] var8 = var2.method_41883();
               class_9294.method_42771(var8, (long)var8.length, this.field_7227, 0L);
               this.field_7229.method_18248(var8);
            }

            this.field_7229.flush();
         } else {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
         }
      } else {
         throw new IOException("closed");
      }
   }

   public class_4131 method_5957(int var1, long var2) {
      if (!this.field_7234) {
         this.field_7234 = true;
         this.field_7226.field_27175 = var1;
         this.field_7226.field_27176 = var2;
         this.field_7226.field_27171 = true;
         this.field_7226.field_27173 = false;
         return this.field_7226;
      } else {
         throw new IllegalStateException("Another message writer is active. Did you call close()?");
      }
   }

   public void method_5954(int var1, long var2, boolean var4, boolean var5) throws IOException {
      assert Thread.holdsLock(this);

      if (!this.field_7233) {
         int var8 = !var4 ? 0 : var1;
         if (var5) {
            var8 |= 128;
         }

         this.field_7229.method_18253(var8);
         int var9 = 0;
         if (this.field_7231) {
            var9 |= 128;
         }

         if (var2 > 125L) {
            if (var2 > 65535L) {
               var9 |= 127;
               this.field_7229.method_18253(var9);
               this.field_7229.method_18236(var2);
            } else {
               var9 |= 126;
               this.field_7229.method_18253(var9);
               this.field_7229.method_18252((int)var2);
            }
         } else {
            var9 |= (int)var2;
            this.field_7229.method_18253(var9);
         }

         if (!this.field_7231) {
            this.field_7229.method_19191(this.field_7230, var2);
         } else {
            this.field_7232.nextBytes(this.field_7227);
            this.field_7229.method_18248(this.field_7227);
            long var10 = 0L;

            while (var10 < var2) {
               int var12 = (int)Math.min(var2, (long)this.field_7225.length);
               int var13 = this.field_7230.method_36578(this.field_7225, 0, var12);
               if (var13 == -1) {
                  throw new AssertionError();
               }

               class_9294.method_42771(this.field_7225, (long)var13, this.field_7227, var10);
               this.field_7229.method_18249(this.field_7225, 0, var13);
               var10 += (long)var13;
            }
         }

         this.field_7229.method_18233();
      } else {
         throw new IOException("closed");
      }
   }
}
