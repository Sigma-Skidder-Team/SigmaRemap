package mapped;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public final class Class9298 {
   private static String[] field42746;
   private static final int field42747 = 4096;
   private static final int field42748 = 16384;
   private final Class1734 field42749;
   private final boolean field42750;
   private int field42751 = Integer.MAX_VALUE;
   private boolean field42752;
   public int field42753;
   public int field42754;
   public Class8350[] field42755 = new Class8350[8];
   public int field42756 = this.field42755.length - 1;
   public int field42757 = 0;
   public int field42758 = 0;

   public Class9298(Class1734 var1) {
      this(4096, true, var1);
   }

   public Class9298(int var1, boolean var2, Class1734 var3) {
      this.field42753 = var1;
      this.field42754 = var1;
      this.field42750 = var2;
      this.field42749 = var3;
   }

   private void method35047() {
      Arrays.fill(this.field42755, null);
      this.field42756 = this.field42755.length - 1;
      this.field42757 = 0;
      this.field42758 = 0;
   }

   private int method35048(int var1) {
      int var4 = 0;
      if (var1 > 0) {
         for (int var5 = this.field42755.length - 1; var5 >= this.field42756 && var1 > 0; var5--) {
            var1 -= this.field42755[var5].field35888;
            this.field42758 = this.field42758 - this.field42755[var5].field35888;
            this.field42757--;
            var4++;
         }

         System.arraycopy(this.field42755, this.field42756 + 1, this.field42755, this.field42756 + 1 + var4, this.field42757);
         Arrays.fill(this.field42755, this.field42756 + 1, this.field42756 + 1 + var4, null);
         this.field42756 += var4;
      }

      return var4;
   }

   private void method35049(Class8350 var1) {
      int var4 = var1.field35888;
      if (var4 <= this.field42754) {
         int var5 = this.field42758 + var4 - this.field42754;
         this.method35048(var5);
         if (this.field42757 + 1 > this.field42755.length) {
            Class8350[] var6 = new Class8350[this.field42755.length * 2];
            System.arraycopy(this.field42755, 0, var6, this.field42755.length, this.field42755.length);
            this.field42756 = this.field42755.length - 1;
            this.field42755 = var6;
         }

         int var7 = this.field42756--;
         this.field42755[var7] = var1;
         this.field42757++;
         this.field42758 += var4;
      } else {
         this.method35047();
      }
   }

   public void method35050(List<Class8350> var1) throws IOException {
      if (this.field42752) {
         if (this.field42751 < this.field42754) {
            this.method35051(this.field42751, 31, 32);
         }

         this.field42752 = false;
         this.field42751 = Integer.MAX_VALUE;
         this.method35051(this.field42754, 31, 32);
      }

      int var4 = 0;

      for (int var5 = var1.size(); var4 < var5; var4++) {
         Class8350 var6 = (Class8350)var1.get(var4);
         Class2003 var7 = var6.field35886.method8453();
         Class2003 var8 = var6.field35887;
         int var9 = -1;
         int var10 = -1;
         Integer var11 = Class9739.field45481.get(var7);
         if (var11 != null) {
            var10 = var11 + 1;
            if (var10 > 1 && var10 < 8) {
               if (!Class9474.method36534(Class9739.field45480[var10 - 1].field35887, var8)) {
                  if (Class9474.method36534(Class9739.field45480[var10].field35887, var8)) {
                     var9 = var10 + 1;
                  }
               } else {
                  var9 = var10;
               }
            }
         }

         if (var9 == -1) {
            int var12 = this.field42756 + 1;

            for (int var13 = this.field42755.length; var12 < var13; var12++) {
               if (Class9474.method36534(this.field42755[var12].field35886, var7)) {
                  if (Class9474.method36534(this.field42755[var12].field35887, var8)) {
                     var9 = var12 - this.field42756 + Class9739.field45480.length;
                     break;
                  }

                  if (var10 == -1) {
                     var10 = var12 - this.field42756 + Class9739.field45480.length;
                  }
               }
            }
         }

         if (var9 == -1) {
            if (var10 != -1) {
               if (var7.method8466(Class8350.field35880) && !Class8350.field35885.equals(var7)) {
                  this.method35051(var10, 15, 0);
                  this.method35052(var8);
               } else {
                  this.method35051(var10, 63, 64);
                  this.method35052(var8);
                  this.method35049(var6);
               }
            } else {
               this.field42749.method7570(64);
               this.method35052(var7);
               this.method35052(var8);
               this.method35049(var6);
            }
         } else {
            this.method35051(var9, 127, 128);
         }
      }
   }

   public void method35051(int var1, int var2, int var3) {
      if (var1 < var2) {
         this.field42749.method7570(var3 | var1);
      } else {
         this.field42749.method7570(var3 | var2);

         for (var1 -= var2; var1 >= 128; var1 >>>= 7) {
            int var6 = var1 & 127;
            this.field42749.method7570(var6 | 128);
         }

         this.field42749.method7570(var1);
      }
   }

   public void method35052(Class2003 var1) throws IOException {
      if (this.field42750 && Class6985.method21600().method21602(var1) < var1.method8458()) {
         Class1734 var4 = new Class1734();
         Class6985.method21600().method21601(var1, var4);
         Class2003 var5 = var4.method7606();
         this.method35051(var5.method8458(), 127, 128);
         this.field42749.method7562(var5);
      } else {
         this.method35051(var1.method8458(), 127, 0);
         this.field42749.method7562(var1);
      }
   }

   public void method35053(int var1) {
      this.field42753 = var1;
      int var4 = Math.min(var1, 16384);
      if (this.field42754 != var4) {
         if (var4 < this.field42754) {
            this.field42751 = Math.min(this.field42751, var4);
         }

         this.field42752 = true;
         this.field42754 = var4;
         this.method35054();
      }
   }

   private void method35054() {
      if (this.field42754 < this.field42758) {
         if (this.field42754 != 0) {
            this.method35048(this.field42758 - this.field42754);
         } else {
            this.method35047();
         }
      }
   }
}
