package mapped;

public class Class9003 {
   private final Class2352<Class7216> field41160 = new Class2352<Class7216>(32);

   public static Class9003 method33257(Class8396 var0) {
      Class9003 var3 = new Class9003();
      var3.method33259(
         (var0x, var1) -> var1 <= 0 ? ((Class3277)var0x.method32107()).method11800(var0x) : -1,
         Class8514.field37844,
         Class8514.field37845,
         Class8514.field37846,
         Class8514.field37847,
         Class8514.field38086
      );
      var3.method33259((var0x, var1) -> Class6406.method19509(0.5, 1.0), Blocks.field36801, Blocks.field36802);
      var3.method33259((var0x, var1) -> {
         if (var1 != 1) {
            return -1;
         } else {
            Class39 var4 = var0x.method32145("Explosion");
            int[] var5x = var4 != null && var4.method119("Colors", 11) ? var4.method128("Colors") : null;
            if (var5x != null && var5x.length != 0) {
               if (var5x.length == 1) {
                  return var5x[0];
               } else {
                  int var6 = 0;
                  int var7 = 0;
                  int var8 = 0;

                  for (int var12 : var5x) {
                     var6 += (var12 & 0xFF0000) >> 16;
                     var7 += (var12 & 0xFF00) >> 8;
                     var8 += (var12 & 0xFF) >> 0;
                  }

                  var6 /= var5x.length;
                  var7 /= var5x.length;
                  var8 /= var5x.length;
                  return var6 << 16 | var7 << 8 | var8;
               }
            } else {
               return 9079434;
            }
         }
      }, Class8514.field38069);
      var3.method33259((var0x, var1) -> var1 <= 0 ? Class9741.method38182(var0x) : -1, Class8514.field37971, Class8514.field38115, Class8514.field38118);

      for (Class3311 var5 : Class3311.method11854()) {
         var3.method33259((var1, var2) -> var5.method11852(var2), var5);
      }

      var3.method33259(
         (var1, var2) -> {
            Class7380 var5x = ((Class3292)var1.method32107()).method11845().method11579();
            return var0.method29465(var5x, (Class1663)null, (BlockPos)null, var2);
         },
         Blocks.field36395,
         Blocks.field36482,
         Blocks.field36483,
         Blocks.field36636,
         Blocks.field36446,
         Blocks.field36447,
         Blocks.field36448,
         Blocks.field36449,
         Blocks.field36450,
         Blocks.field36451,
         Blocks.field36641
      );
      var3.method33259((var0x, var1) -> var1 != 0 ? -1 : Class9741.method38182(var0x), Class8514.field38117);
      var3.method33259((var0x, var1) -> var1 != 0 ? Class3316.method11871(var0x) : -1, Class8514.field37955);
      return var3;
   }

   public int method33258(Class8848 var1, int var2) {
      Class7216 var5 = this.field41160.method9172(Class2348.field16075.method9171(var1.method32107()));
      return var5 != null ? var5.method22661(var1, var2) : -1;
   }

   public void method33259(Class7216 var1, Class3303... var2) {
      for (Class3303 var8 : var2) {
         this.field41160.method9268(var1, Class3257.method11701(var8.method11581()));
      }
   }
}
