package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.tileentity.JigsawTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class JigsawBlock extends Block implements Class3245 {
   public static final Class8552<Class182> field18712 = Class8820.field39723;

   public JigsawBlock(AbstractBlock var1) {
      super(var1);
      this.method11578(this.field18612.method35393().method23465(field18712, Class182.field657));
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field18712);
   }

   @Override
   public BlockState method11500(BlockState var1, Class80 var2) {
      return var1.method23465(field18712, var2.method251().method510(var1.<Class182>method23463(field18712)));
   }

   @Override
   public BlockState method11501(BlockState var1, Class2089 var2) {
      return var1.method23465(field18712, var2.method8751().method510(var1.<Class182>method23463(field18712)));
   }

   @Override
   public BlockState method11495(Class5909 var1) {
      net.minecraft.util.Direction var4 = var1.method18354();
      net.minecraft.util.Direction var5;
      if (var4.getAxis() != Direction.field414) {
         var5 = net.minecraft.util.Direction.field673;
      } else {
         var5 = var1.method18350().method536();
      }

      return this.method11579().method23465(field18712, Class182.method526(var4, var5));
   }

   @Nullable
   @Override
   public TileEntity method11646(IBlockReader var1) {
      return new JigsawTileEntity();
   }

   @Override
   public ActionResultType method11505(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      TileEntity var9 = var2.getTileEntity(var3);
      if (var9 instanceof JigsawTileEntity && var4.canUseCommandBlock()) {
         var4.method2892((JigsawTileEntity)var9);
         return ActionResultType.method9002(var2.isRemote);
      } else {
         return ActionResultType.field14820;
      }
   }

   public static boolean method11674(Class8266 var0, Class8266 var1) {
      net.minecraft.util.Direction var4 = method11675(var0.field35531);
      net.minecraft.util.Direction var5 = method11675(var1.field35531);
      net.minecraft.util.Direction var6 = method11676(var0.field35531);
      net.minecraft.util.Direction var7 = method11676(var1.field35531);
      JigsawTileEntity.OrientationType var8 = JigsawTileEntity.OrientationType.method269(var0.field35532.getString("joint")).orElseGet(() -> !var4.getAxis().method324() ? JigsawTileEntity.OrientationType.ROLLABLE : JigsawTileEntity.OrientationType.ALIGNED);
      boolean var9 = var8 == JigsawTileEntity.OrientationType.ROLLABLE;
      return var4 == var5.method536() && (var9 || var6 == var7) && var0.field35532.getString("target").equals(var1.field35532.getString("name"));
   }

   public static net.minecraft.util.Direction method11675(BlockState var0) {
      return var0.<Class182>method23463(field18712).method527();
   }

   public static net.minecraft.util.Direction method11676(BlockState var0) {
      return var0.<Class182>method23463(field18712).method528();
   }
}