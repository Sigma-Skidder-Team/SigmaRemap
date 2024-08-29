package mapped;

public class ItemColors {
   private final Class2352<Class7216> field41160 = new Class2352<Class7216>(32);

   public static ItemColors init(BlockColors var0) {
      ItemColors var3 = new ItemColors();
      var3.method33259(
         (var0x, var1) -> var1 <= 0 ? ((Class3277)var0x.getItem()).method11800(var0x) : -1,
         Items.field37844,
         Items.field37845,
         Items.field37846,
         Items.field37847,
         Items.field38086
      );
      var3.method33259((var0x, var1) -> Class6406.method19509(0.5, 1.0), Blocks.TALL_GRASS, Blocks.field36802);
      var3.method33259((var0x, var1) -> {
         if (var1 != 1) {
            return -1;
         } else {
            CompoundNBT var4 = var0x.method32145("Explosion");
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
      }, Items.field38069);
      var3.method33259((var0x, var1) -> var1 <= 0 ? Class9741.method38182(var0x) : -1, Items.field37971, Items.field38115, Items.field38118);

      for (SpawnEggItem var5 : SpawnEggItem.method11854()) {
         var3.method33259((var1, var2) -> var5.method11852(var2), var5);
      }

      var3.method33259(
         (var1, var2) -> {
            BlockState var5x = ((Class3292)var1.getItem()).method11845().method11579();
            return var0.method29465(var5x, (Class1663)null, (BlockPos)null, var2);
         },
         Blocks.field36395,
         Blocks.GRASS,
         Blocks.FERN,
         Blocks.VINE,
         Blocks.field36446,
         Blocks.field36447,
         Blocks.field36448,
         Blocks.field36449,
         Blocks.field36450,
         Blocks.field36451,
         Blocks.LILY_PAD
      );
      var3.method33259((var0x, var1) -> var1 != 0 ? -1 : Class9741.method38182(var0x), Items.field38117);
      var3.method33259((var0x, var1) -> var1 != 0 ? Class3316.method11871(var0x) : -1, Items.field37955);
      return var3;
   }

   public int method33258(ItemStack var1, int var2) {
      Class7216 var5 = this.field41160.method9172(Registry.ITEM.method9171(var1.getItem()));
      return var5 != null ? var5.method22661(var1, var2) : -1;
   }

   public void method33259(Class7216 var1, Class3303... var2) {
      for (Class3303 var8 : var2) {
         this.field41160.method9268(var1, Item.method11701(var8.method11581()));
      }
   }
}
