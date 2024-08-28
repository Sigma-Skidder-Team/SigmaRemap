package mapped;

import javax.annotation.Nullable;

public final class Class9174 {
   private static String[] field42118;
   public static final int field42119 = 8192;
   public static final int field42120 = 1024;
   public final byte[] field42121;
   public int field42122;
   public int field42123;
   public boolean field42124;
   public boolean field42125;
   public Class9174 field42126;
   public Class9174 field42127;

   public Class9174() {
      this.field42121 = new byte[8192];
      this.field42125 = true;
      this.field42124 = false;
   }

   public Class9174(Class9174 var1) {
      this(var1.field42121, var1.field42122, var1.field42123);
      var1.field42124 = true;
   }

   public Class9174(byte[] var1, int var2, int var3) {
      this.field42121 = var1;
      this.field42122 = var2;
      this.field42123 = var3;
      this.field42125 = false;
      this.field42124 = true;
   }

   @Nullable
   public Class9174 method34280() {
      Class9174 var3 = this.field42126 == this ? null : this.field42126;
      this.field42127.field42126 = this.field42126;
      this.field42126.field42127 = this.field42127;
      this.field42126 = null;
      this.field42127 = null;
      return var3;
   }

   public Class9174 method34281(Class9174 var1) {
      var1.field42127 = this;
      var1.field42126 = this.field42126;
      this.field42126.field42127 = var1;
      this.field42126 = var1;
      return var1;
   }

   public Class9174 method34282(int var1) {
      if (var1 > 0 && var1 <= this.field42123 - this.field42122) {
         Class9174 var4;
         if (var1 < 1024) {
            var4 = Class5996.method18607();
            System.arraycopy(this.field42121, this.field42122, var4.field42121, 0, var1);
         } else {
            var4 = new Class9174(this);
         }

         var4.field42123 = var4.field42122 + var1;
         this.field42122 += var1;
         this.field42127.method34281(var4);
         return var4;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void method34283() {
      if (this.field42127 != this) {
         if (this.field42127.field42125) {
            int var3 = this.field42123 - this.field42122;
            int var4 = 8192 - this.field42127.field42123 + (!this.field42127.field42124 ? this.field42127.field42122 : 0);
            if (var3 <= var4) {
               this.method34284(this.field42127, var3);
               this.method34280();
               Class5996.method18608(this);
            }
         }
      } else {
         throw new IllegalStateException();
      }
   }

   public void method34284(Class9174 var1, int var2) {
      if (var1.field42125) {
         if (var1.field42123 + var2 > 8192) {
            if (var1.field42124) {
               throw new IllegalArgumentException();
            }

            if (var1.field42123 + var2 - var1.field42122 > 8192) {
               throw new IllegalArgumentException();
            }

            System.arraycopy(var1.field42121, var1.field42122, var1.field42121, 0, var1.field42123 - var1.field42122);
            var1.field42123 = var1.field42123 - var1.field42122;
            var1.field42122 = 0;
         }

         System.arraycopy(this.field42121, this.field42122, var1.field42121, var1.field42123, var2);
         var1.field42123 += var2;
         this.field42122 += var2;
      } else {
         throw new IllegalArgumentException();
      }
   }
}
