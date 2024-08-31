package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;

public abstract class Class3350 extends Class3241 {
   public static final Class8553 field18875 = Class3198.field18484;
   public static final Class8551 field18876 = Class8820.field39699;

   public Class3350(AbstractBlock var1) {
      super(var1);
      this.method11578(this.field18612.method35393().method23465(field18875, Direction.NORTH).method23465(field18876, Boolean.valueOf(false)));
   }

   @Override
   public ActionResultType method11505(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      if (!var2.isRemote) {
         this.method11918(var2, var3, var4);
         return ActionResultType.field14819;
      } else {
         return ActionResultType.field14818;
      }
   }

   public abstract void method11918(World var1, BlockPos var2, PlayerEntity var3);

   @Override
   public BlockState method11495(Class5909 var1) {
      return this.method11579().method23465(field18875, var1.method18350().method536());
   }

   @Override
   public void method11563(World var1, BlockPos var2, BlockState var3, LivingEntity var4, ItemStack var5) {
      if (var5.method32152()) {
         TileEntity var8 = var1.getTileEntity(var2);
         if (var8 instanceof Class924) {
            ((Class924)var8).method3695(var5.method32149());
         }
      }
   }

   @Override
   public void method11513(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      if (!var1.method23448(var4.getBlock())) {
         TileEntity var8 = var2.getTileEntity(var3);
         if (var8 instanceof Class924) {
            Class7236.method22721(var2, var3, (Class924)var8);
            ((Class924)var8).method3657(var2, Vector3d.method11328(var3));
            var2.updateComparatorOutputLevel(var3, this);
         }

         super.method11513(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public boolean method11648(BlockState var1) {
      return true;
   }

   @Override
   public int method11649(BlockState var1, World var2, BlockPos var3) {
      return Class5812.method18151(var2.getTileEntity(var3));
   }

   @Override
   public BlockRenderType method11526(BlockState var1) {
      return BlockRenderType.MODEL;
   }

   @Override
   public BlockState method11500(BlockState var1, Class80 var2) {
      return var1.method23465(field18875, var2.method252(var1.<Direction>method23463(field18875)));
   }

   @Override
   public BlockState method11501(BlockState var1, Class2089 var2) {
      return var1.method23395(var2.method8749(var1.<Direction>method23463(field18875)));
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field18875, field18876);
   }
}
