package remapped;

public class class_1111 {
   private static String[] field_6373;
   private static final int field_6371 = 327670;
   private final byte[] field_6375;
   private final class_2473 field_6369;
   private long field_6370;
   private long field_6372;
   private boolean field_6374;

   public class_1111(class_2473 var1) {
      this.field_6369 = var1;
      this.field_6375 = new byte[327670];
      this.field_6370 = 0L;
      this.field_6372 = 0L;
      this.field_6374 = true;
   }

   public void method_4917() {
      this.field_6374 = false;
   }

   public boolean method_4916() {
      return this.field_6374;
   }

   public int method_4914() {
      return (int)(this.field_6372 - this.field_6370);
   }

   public int method_4921() {
      return 327670 - this.method_4914();
   }

   private int method_4915() {
      return (int)(this.field_6370 % 327670L);
   }

   private int method_4920() {
      return (int)(this.field_6372 % 327670L);
   }

   public int method_4922(byte[] var1) {
      return this.method_4923(var1, 0, var1.length);
   }

   public int method_4923(byte[] var1, int var2, int var3) {
      if (!this.method_4916()) {
         if (this.method_4914() <= 0) {
            return -1;
         }

         var3 = Math.min(var3, this.method_4914());
      }

      synchronized (this) {
         if (this.field_6369 != null && this.method_4914() < var3) {
            this.field_6369.method_11368();
         }

         var3 = Math.min(this.method_4914(), var3);
         int var7 = var3;

         while (var7 > 0) {
            while (this.method_4914() == 0) {
               try {
                  this.wait();
               } catch (InterruptedException var11) {
               }
            }

            int var8 = Math.min(this.method_4914(), var7);

            while (var8 > 0) {
               int var9 = Math.min(var8, 327670 - this.method_4915());
               System.arraycopy(this.field_6375, this.method_4915(), var1, var2, var9);
               this.field_6370 += (long)var9;
               var2 += var9;
               var8 -= var9;
               var7 -= var9;
            }

            this.notifyAll();
         }

         return var3;
      }
   }

   public int method_4918(byte[] var1) {
      return this.method_4919(var1, 0, var1.length);
   }

   public int method_4919(byte[] var1, int var2, int var3) {
      synchronized (this) {
         int var7 = var3;

         while (var7 > 0) {
            while (this.method_4921() == 0) {
               try {
                  this.wait();
               } catch (InterruptedException var11) {
               }
            }

            int var8 = Math.min(this.method_4921(), var7);

            while (var8 > 0) {
               int var9 = Math.min(var8, 327670 - this.method_4920());
               System.arraycopy(var1, var2, this.field_6375, this.method_4920(), var9);
               this.field_6372 += (long)var9;
               var2 += var9;
               var8 -= var9;
               var7 -= var9;
            }

            this.notifyAll();
         }

         return var3;
      }
   }
}
