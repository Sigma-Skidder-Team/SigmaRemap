package mapped;

import javax.annotation.Nullable;

public class Class8459 {
   private static String[] field36268;
   private final int field36269;
   private final int field36270;
   private final int field36271;
   private final int field36272;
   private Class8459 field36273;
   private Class8459 field36274;
   private boolean field36275;

   public Class8459(int var1, int var2, int var3, int var4) {
      this.field36269 = var1;
      this.field36270 = var2;
      this.field36271 = var3;
      this.field36272 = var4;
   }

   @Nullable
   public Class8459 method29754(Class2051 var1) {
      if (this.field36273 != null && this.field36274 != null) {
         Class8459 var8 = this.field36273.method29754(var1);
         if (var8 == null) {
            var8 = this.field36274.method29754(var1);
         }

         return var8;
      } else if (!this.field36275) {
         int var4 = var1.method8687();
         int var5 = var1.method8688();
         if (var4 > this.field36271 || var5 > this.field36272) {
            return null;
         } else if (var4 == this.field36271 && var5 == this.field36272) {
            this.field36275 = true;
            return this;
         } else {
            int var6 = this.field36271 - var4;
            int var7 = this.field36272 - var5;
            if (var6 <= var7) {
               this.field36273 = new Class8459(this.field36269, this.field36270, this.field36271, var5);
               this.field36274 = new Class8459(this.field36269, this.field36270 + var5 + 1, this.field36271, this.field36272 - var5 - 1);
            } else {
               this.field36273 = new Class8459(this.field36269, this.field36270, var4, this.field36272);
               this.field36274 = new Class8459(this.field36269 + var4 + 1, this.field36270, this.field36271 - var4 - 1, this.field36272);
            }

            return this.field36273.method29754(var1);
         }
      } else {
         return null;
      }
   }

   // $VF: synthetic method
   public static int method29755(Class8459 var0) {
      return var0.field36269;
   }

   // $VF: synthetic method
   public static int method29756(Class8459 var0) {
      return var0.field36270;
   }
}
