package mapped;

public enum Class1846 implements Class1845 {
   field9860;

   private static final Class1846[] field9861 = new Class1846[]{field9860};

   @Override
   public int method8088(Class6661 var1, int var2, int var3, int var4, int var5, int var6) {
      if (!Class9320.method35219(var6)
         || Class9320.method35219(var5) && Class9320.method35219(var4) && Class9320.method35219(var2) && Class9320.method35219(var3)) {
         if (!Class9320.method35219(var6)
            && (Class9320.method35219(var5) || Class9320.method35219(var2) || Class9320.method35219(var4) || Class9320.method35219(var3))
            && var1.method20312(5) == 0) {
            if (Class9320.method35219(var5)) {
               return var6 != 4 ? var5 : 4;
            }

            if (Class9320.method35219(var2)) {
               return var6 != 4 ? var2 : 4;
            }

            if (Class9320.method35219(var4)) {
               return var6 != 4 ? var4 : 4;
            }

            if (Class9320.method35219(var3)) {
               return var6 != 4 ? var3 : 4;
            }
         }

         return var6;
      } else {
         int var9 = 1;
         int var10 = 1;
         if (!Class9320.method35219(var5) && var1.method20312(var9++) == 0) {
            var10 = var5;
         }

         if (!Class9320.method35219(var4) && var1.method20312(var9++) == 0) {
            var10 = var4;
         }

         if (!Class9320.method35219(var2) && var1.method20312(var9++) == 0) {
            var10 = var2;
         }

         if (!Class9320.method35219(var3) && var1.method20312(var9++) == 0) {
            var10 = var3;
         }

         if (var1.method20312(3) != 0) {
            return var10 != 4 ? var6 : 4;
         } else {
            return var10;
         }
      }
   }
}
