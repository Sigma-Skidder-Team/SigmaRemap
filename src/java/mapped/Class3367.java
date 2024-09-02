package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class Class3367 extends Class3241 {
   private static String[] field18937;
   public static final Class8552<Class104> field18938 = Class8820.field39772;

   public Class3367(AbstractBlock var1) {
      super(var1);
   }

   @Override
   public TileEntity method11646(Class1665 var1) {
      return new Class964();
   }

   @Override
   public ActionResultType method11505(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      TileEntity var9 = var2.getTileEntity(var3);
      if (!(var9 instanceof Class964)) {
         return ActionResultType.field14820;
      } else {
         return !((Class964)var9).method3933(var4) ? ActionResultType.field14820 : ActionResultType.method9002(var2.isRemote);
      }
   }

   @Override
   public void method11563(World var1, BlockPos var2, BlockState var3, LivingEntity var4, ItemStack var5) {
      if (!var1.isRemote && var4 != null) {
         TileEntity var8 = var1.getTileEntity(var2);
         if (var8 instanceof Class964) {
            ((Class964)var8).method3939(var4);
         }
      }
   }

   @Override
   public BlockRenderType method11526(BlockState var1) {
      return BlockRenderType.MODEL;
   }

   @Override
   public BlockState method11495(Class5909 var1) {
      return this.method11579().method23465(field18938, Class104.field321);
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field18938);
   }

   @Override
   public void method11506(BlockState var1, World var2, BlockPos var3, Block var4, BlockPos var5, boolean var6) {
      if (var2 instanceof ServerWorld) {
         TileEntity var9 = var2.getTileEntity(var3);
         if (var9 instanceof Class964) {
            Class964 var10 = (Class964)var9;
            boolean var11 = var2.method6780(var3);
            boolean var12 = var10.method3971();
            if (var11 && !var12) {
               var10.method3972(true);
               this.method11953((ServerWorld)var2, var10);
            } else if (!var11 && var12) {
               var10.method3972(false);
            }
         }
      }
   }

   private void method11953(ServerWorld var1, Class964 var2) {
      switch (Class8113.field34871[var2.method3950().ordinal()]) {
         case 1:
            var2.method3964(false);
            break;
         case 2:
            var2.method3967(var1, false);
            break;
         case 3:
            var2.method3969();
         case 4:
      }
   }
}
