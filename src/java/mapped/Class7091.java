package mapped;

import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import net.minecraft.block.*;
import net.minecraft.util.Util;
import net.minecraft.state.properties.Half;
import net.minecraft.state.properties.SlabType;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;

import java.util.Map;

public class Class7091 extends Class7092 {
   private static String[] field30517;
   public static final Codec<Class7091> field30518 = Codec.unit(() -> Class7091.field30519);
   public static final Class7091 field30519 = new Class7091();
   private final Map<Block, Block> field30520 = Util.<Map<Block, Block>>make(Maps.newHashMap(), var0 -> {
      var0.put(Blocks.COBBLESTONE, Blocks.field37130);
      var0.put(Blocks.field36526, Blocks.field37130);
      var0.put(Blocks.STONE, Blocks.field37134);
      var0.put(Blocks.field36615, Blocks.field37135);
      var0.put(Blocks.field36616, Blocks.field37135);
      var0.put(Blocks.COBBLESTONE_STAIRS, Blocks.field37131);
      var0.put(Blocks.field37018, Blocks.field37131);
      var0.put(Blocks.field37020, Blocks.field37142);
      var0.put(Blocks.STONE_BRICK_STAIRS, Blocks.field37139);
      var0.put(Blocks.field37016, Blocks.field37139);
      var0.put(Blocks.field36850, Blocks.field37133);
      var0.put(Blocks.field37032, Blocks.field37133);
      var0.put(Blocks.field36846, Blocks.field37143);
      var0.put(Blocks.field36845, Blocks.field37143);
      var0.put(Blocks.field36852, Blocks.field37138);
      var0.put(Blocks.field37030, Blocks.field37138);
      var0.put(Blocks.field37046, Blocks.field37140);
      var0.put(Blocks.field37044, Blocks.field37140);
      var0.put(Blocks.COBBLESTONE_WALL, Blocks.field37132);
      var0.put(Blocks.MOSSY_COBBLESTONE_WALL, Blocks.field37132);
      var0.put(Blocks.field36618, Blocks.field37137);
      var0.put(Blocks.field36617, Blocks.field37136);
      var0.put(Blocks.IRON_BARS, Blocks.CHAIN);
   });

   private Class7091() {
   }

   @Override
   public Class8266 method22068(IWorldReader var1, BlockPos var2, BlockPos var3, Class8266 var4, Class8266 var5, Class9463 var6) {
      Block var9 = this.field30520.get(var5.field35531.getBlock());
      if (var9 != null) {
         BlockState var10 = var5.field35531;
         BlockState var11 = var9.getDefaultState();
         if (var10.method23462(StairsBlock.FACING)) {
            var11 = var11.with(StairsBlock.FACING, var10.<Direction>get(StairsBlock.FACING));
         }

         if (var10.method23462(StairsBlock.HALF)) {
            var11 = var11.with(StairsBlock.HALF, var10.<Half>get(StairsBlock.HALF));
         }

         if (var10.method23462(SlabBlock.field18605)) {
            var11 = var11.with(SlabBlock.field18605, var10.<SlabType>get(SlabBlock.field18605));
         }

         return new Class8266(var5.field35530, var11, var5.field35532);
      } else {
         return var5;
      }
   }

   @Override
   public Class7525<?> method22069() {
      return Class7525.field32301;
   }
}
