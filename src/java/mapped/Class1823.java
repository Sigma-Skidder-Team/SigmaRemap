package mapped;

public enum Class1823 implements Class1825 {
   field9822,
   field9823;

   private static final Class1823[] field9824 = new Class1823[]{field9822, field9823};

   private Class1823() {
   }

   @Override
   public int method8075(int var1) {
      return var1 >> 1;
   }

   @Override
   public int method8076(int var1) {
      return var1 >> 1;
   }

   @Override
   public int method8077(Class6660<?> var1, Class7899 var2, int var3, int var4) {
      int var7 = var2.method26471(this.method8075(var3), this.method8076(var4));
      var1.method20311((long)(var3 >> 1 << 1), (long)(var4 >> 1 << 1));
      int var8 = var3 & 1;
      int var9 = var4 & 1;
      if (var8 == 0 && var9 == 0) {
         return var7;
      } else {
         int var10 = var2.method26471(this.method8075(var3), this.method8076(var4 + 1));
         int var11 = var1.method20318(var7, var10);
         if (var8 == 0 && var9 == 1) {
            return var11;
         } else {
            int var12 = var2.method26471(this.method8075(var3 + 1), this.method8076(var4));
            int var13 = var1.method20318(var7, var12);
            if (var8 == 1 && var9 == 0) {
               return var13;
            } else {
               int var14 = var2.method26471(this.method8075(var3 + 1), this.method8076(var4 + 1));
               return this.method8078(var1, var7, var12, var10, var14);
            }
         }
      }
   }

   public int method8078(Class6660<?> var1, int var2, int var3, int var4, int var5) {
      if (var3 == var4 && var4 == var5) {
         return var3;
      } else if (var2 == var3 && var2 == var4) {
         return var2;
      } else if (var2 == var3 && var2 == var5) {
         return var2;
      } else if (var2 == var4 && var2 == var5) {
         return var2;
      } else if (var2 == var3 && var4 != var5) {
         return var2;
      } else if (var2 == var4 && var3 != var5) {
         return var2;
      } else if (var2 == var5 && var3 != var4) {
         return var2;
      } else if (var3 == var4 && var2 != var5) {
         return var3;
      } else if (var3 == var5 && var2 != var4) {
         return var3;
      } else {
         return var4 == var5 && var2 != var3 ? var4 : var1.method20319(var2, var3, var4, var5);
      }
   }
}
