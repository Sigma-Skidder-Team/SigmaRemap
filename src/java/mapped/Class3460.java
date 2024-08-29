package mapped;

import com.google.common.collect.Maps;
import java.util.Map;

public class Class3460 extends Block {
   private static String[] field19288;
   private static final Map<Block, Block> field19289 = Maps.newHashMap();
   public static final Class6408 field19290 = Block.method11539(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final Block field19291;

   public Class3460(Block var1, AbstractBlock var2) {
      super(var2);
      this.field19291 = var1;
      field19289.put(var1, this);
   }

   @Override
   public Class6408 method11483(BlockState var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return field19290;
   }

   @Override
   public BlockRenderType method11526(BlockState var1) {
      return BlockRenderType.MODEL;
   }

   @Override
   public ActionResultType method11505(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      ItemStack var9 = var4.getHeldItem(var5);
      Item var10 = var9.getItem();
      Block var11 = !(var10 instanceof Class3292) ? Blocks.AIR : field19289.getOrDefault(((Class3292)var10).method11845(), Blocks.AIR);
      boolean var12 = var11 == Blocks.AIR;
      boolean var13 = this.field19291 == Blocks.AIR;
      if (var12 == var13) {
         return ActionResultType.field14819;
      } else {
         if (!var13) {
            ItemStack var14 = new ItemStack(this.field19291);
            if (!var9.isEmpty()) {
               if (!var4.method2945(var14)) {
                  var4.method2882(var14, false);
               }
            } else {
               var4.method3095(var5, var14);
            }

            var2.method6725(var3, Blocks.FLOWER_POT.method11579(), 3);
         } else {
            var2.method6725(var3, var11.method11579(), 3);
            var4.method2911(Class8876.field40154);
            if (!var4.abilities.isCreativeMode) {
               var9.method32182(1);
            }
         }

         return ActionResultType.method9002(var2.field9020);
      }
   }

   @Override
   public ItemStack getItem(Class1665 var1, BlockPos var2, BlockState var3) {
      return this.field19291 != Blocks.AIR ? new ItemStack(this.field19291) : super.getItem(var1, var2, var3);
   }

   @Override
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      return var2 == Direction.DOWN && !var1.method23443(var4, var5)
         ? Blocks.AIR.method11579()
         : super.method11491(var1, var2, var3, var4, var5, var6);
   }

   public Block method12137() {
      return this.field19291;
   }

   @Override
   public boolean method11494(BlockState var1, Class1665 var2, BlockPos var3, Class1947 var4) {
      return false;
   }
}
