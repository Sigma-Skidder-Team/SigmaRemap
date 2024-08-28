package mapped;

import com.google.common.collect.Maps;
import java.util.Map;

public class Class3460 extends Block {
   private static String[] field19288;
   private static final Map<Block, Block> field19289 = Maps.newHashMap();
   public static final Class6408 field19290 = Block.method11539(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final Block field19291;

   public Class3460(Block var1, Class7929 var2) {
      super(var2);
      this.field19291 = var1;
      field19289.put(var1, this);
   }

   @Override
   public Class6408 method11483(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return field19290;
   }

   @Override
   public Class1855 method11526(Class7380 var1) {
      return Class1855.field9887;
   }

   @Override
   public Class2274 method11505(Class7380 var1, Class1655 var2, BlockPos var3, PlayerEntity var4, Class79 var5, Class8711 var6) {
      Class8848 var9 = var4.method3094(var5);
      Class3257 var10 = var9.method32107();
      Block var11 = !(var10 instanceof Class3292) ? Blocks.AIR : field19289.getOrDefault(((Class3292)var10).method11845(), Blocks.AIR);
      boolean var12 = var11 == Blocks.AIR;
      boolean var13 = this.field19291 == Blocks.AIR;
      if (var12 == var13) {
         return Class2274.field14819;
      } else {
         if (!var13) {
            Class8848 var14 = new Class8848(this.field19291);
            if (!var9.method32105()) {
               if (!var4.method2945(var14)) {
                  var4.method2882(var14, false);
               }
            } else {
               var4.method3095(var5, var14);
            }

            var2.method6725(var3, Blocks.field36668.method11579(), 3);
         } else {
            var2.method6725(var3, var11.method11579(), 3);
            var4.method2911(Class8876.field40154);
            if (!var4.field4919.field29609) {
               var9.method32182(1);
            }
         }

         return Class2274.method9002(var2.field9020);
      }
   }

   @Override
   public Class8848 method11569(Class1665 var1, BlockPos var2, Class7380 var3) {
      return this.field19291 != Blocks.AIR ? new Class8848(this.field19291) : super.method11569(var1, var2, var3);
   }

   @Override
   public Class7380 method11491(Class7380 var1, Direction var2, Class7380 var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      return var2 == Direction.field672 && !var1.method23443(var4, var5)
         ? Blocks.AIR.method11579()
         : super.method11491(var1, var2, var3, var4, var5, var6);
   }

   public Block method12137() {
      return this.field19291;
   }

   @Override
   public boolean method11494(Class7380 var1, Class1665 var2, BlockPos var3, Class1947 var4) {
      return false;
   }
}
