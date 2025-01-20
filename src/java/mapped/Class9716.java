package mapped;

import com.google.common.collect.ImmutableList;
import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.event.impl.EventRenderBlocks;
import it.unimi.dsi.fastutil.longs.Long2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.Property;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.IBlockReader;

import java.util.Collection;
import java.util.List;

public class Class9716 {
   private static String[] field45400;
   private static final ThreadLocal<Class6696> field45401 = ThreadLocal.<Class6696>withInitial(
         () -> new Class6696((BlockState) null, (BlockState) null, (Direction) null, null));
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<Class6696>> field45402 = ThreadLocal
         .<Object2ByteLinkedOpenHashMap<Class6696>>withInitial(
               () -> {
                  Class9 var2 = new Class9(200);
                  var2.defaultReturnValue((byte) 127);
                  return var2;
               });

   public static boolean method38063(BlockState var0, IBlockReader var1, BlockPos var2, Direction var3,
         Class8391 var4) {
      EventRenderBlocks var7 = new EventRenderBlocks(var0);
      Client.getInstance().eventManager.call(var7);
      if (!var7.method13971()) {
         if (!var7.isCancelled()) {
            BlockPos var8 = var2.offset(var3);
            BlockState var9 = var1.getBlockState(var8);
            if (!var9.method23495()) {
               if (!var0.method23411(var9, var3)) {
                  return !var9.isSolid() ? true : method38064(var0, var1, var2, var3, var4, var9, var8);
               } else {
                  return false;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   public static boolean method38064(BlockState var0, IBlockReader var1, BlockPos var2, Direction var3, Class8391 var4,
         BlockState var5, BlockPos var6) {
      long var9 = (long) var0.method23493() << 36 | (long) var5.method23493() << 4 | (long) var3.ordinal();
      Long2ByteLinkedOpenHashMap var11 = var4.method29439();
      byte var12 = var11.getAndMoveToFirst(var9);
      if (var12 == 0) {
         VoxelShape var13 = var0.getFaceOcclusionShape(var1, var2, var3);
         VoxelShape var14 = var5.getFaceOcclusionShape(var1, var6, var3.getOpposite());
         boolean var15 = VoxelShapes.compare(var13, var14, IBooleanFunction.ONLY_FIRST);
         if (var11.size() > 400) {
            var11.removeLastByte();
         }

         var11.putAndMoveToFirst(var9, (byte) (!var15 ? -1 : 1));
         return var15;
      } else {
         return var12 > 0;
      }
   }

   public static int method38065(Block var0) {
      return Registry.BLOCK.getId(var0);
   }

   public static Block method38066(ResourceLocation var0) {
      return Registry.BLOCK.method9193(var0) ? Registry.BLOCK.getOrDefault(var0) : null;
   }

   public static int method38067(BlockState var0) {
      Block var3 = var0.getBlock();
      StateContainer var4 = var3.getStateContainer();
      ImmutableList var5 = var4.getValidStates();
      return var5.indexOf(var0);
   }

   public static int method38068(Block var0) {
      StateContainer var3 = var0.getStateContainer();
      ImmutableList var4 = var3.getValidStates();
      return var4.size();
   }

   public static BlockState method38069(Block var0, int var1) {
      StateContainer var4 = var0.getStateContainer();
      ImmutableList var5 = var4.getValidStates();
      return var1 >= 0 && var1 < var5.size() ? (BlockState) var5.get(var1) : null;
   }

   public static List<BlockState> method38070(Block var0) {
      StateContainer var3 = var0.getStateContainer();
      return var3.getValidStates();
   }

   public static boolean method38071(BlockState var0, IBlockReader var1, BlockPos var2) {
      return var0.method23496();
   }

   public static Collection<Property<?>> method38072(BlockState var0) {
      return var0.method23461();
   }
}
