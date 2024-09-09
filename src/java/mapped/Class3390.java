package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

public abstract class Class3390 {
   public static final Direction[] field19003 = new Direction[]{
      Direction.WEST, Direction.EAST, Direction.NORTH, Direction.SOUTH, Direction.DOWN, Direction.field673
   };
   public final Class8649 field19004;
   public final boolean field19005;
   public final float field19006;
   public final boolean field19007;
   public final SoundType field19008;
   public final float field19009;
   public final float field19010;
   public final float field19011;
   public final boolean field19012;
   public final AbstractBlock field19013;
   public ResourceLocation field19014;

   public Class3390(AbstractBlock var1) {
      this.field19004 = AbstractBlock.method26643(var1);
      this.field19005 = AbstractBlock.method26644(var1);
      this.field19014 = AbstractBlock.method26645(var1);
      this.field19006 = AbstractBlock.method26646(var1);
      this.field19007 = AbstractBlock.method26647(var1);
      this.field19008 = AbstractBlock.method26648(var1);
      this.field19009 = AbstractBlock.method26649(var1);
      this.field19010 = AbstractBlock.method26650(var1);
      this.field19011 = AbstractBlock.method26651(var1);
      this.field19012 = AbstractBlock.method26652(var1);
      this.field19013 = var1;
   }

   @Deprecated
   public void method11618(BlockState var1, Class1660 var2, BlockPos var3, int var4, int var5) {
   }

   @Deprecated
   public boolean method11494(BlockState var1, IBlockReader var2, BlockPos var3, Class1947 var4) {
      switch (Class8735.field39385[var4.ordinal()]) {
         case 1:
            return !var1.method23456(var2, var3);
         case 2:
            return var2.getFluidState(var3).method23486(FluidTags.field40469);
         case 3:
            return !var1.method23456(var2, var3);
         default:
            return false;
      }
   }

   @Deprecated
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      return var1;
   }

   @Deprecated
   public boolean method11634(BlockState var1, BlockState var2, Direction var3) {
      return false;
   }

   @Deprecated
   public void method11506(BlockState var1, World var2, BlockPos var3, Block var4, BlockPos var5, boolean var6) {
      Class7393.method23618(var2, var3);
   }

   @Deprecated
   public void method11589(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
   }

   @Deprecated
   public void method11513(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      if (this.isTileEntityProvider() && !var1.isIn(var4.getBlock())) {
         var2.method6762(var3);
      }
   }

   @Deprecated
   public ActionResultType method11505(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      return ActionResultType.field14820;
   }

   @Deprecated
   public boolean method11647(BlockState var1, World var2, BlockPos var3, int var4, int var5) {
      return false;
   }

   @Deprecated
   public BlockRenderType method11526(BlockState var1) {
      return BlockRenderType.MODEL;
   }

   @Deprecated
   public boolean method11534(BlockState var1) {
      return false;
   }

   @Deprecated
   public boolean method11516(BlockState var1) {
      return false;
   }

   @Deprecated
   public Class2315 method11689(BlockState var1) {
      return this.field19004.method31091();
   }

   @Deprecated
   public FluidState method11498(BlockState var1) {
      return Class9479.field44064.method25049();
   }

   @Deprecated
   public boolean method11648(BlockState var1) {
      return false;
   }

   public Class2260 method11994() {
      return Class2260.field14702;
   }

   @Deprecated
   public BlockState method11500(BlockState var1, Class80 var2) {
      return var1;
   }

   @Deprecated
   public BlockState method11501(BlockState var1, Class2089 var2) {
      return var1;
   }

   @Deprecated
   public boolean method11497(BlockState var1, Class5909 var2) {
      return this.field19004.method31089() && (var2.method18357().isEmpty() || var2.method18357().getItem() != this.method11581());
   }

   @Deprecated
   public boolean method11650(BlockState var1, Fluid var2) {
      return this.field19004.method31089() || !this.field19004.method31086();
   }

   @Deprecated
   public List<ItemStack> method11697(BlockState var1, Class9464 var2) {
      ResourceLocation var5 = this.method11999();
      if (var5 != Class8793.field39533) {
         LootContext var6 = var2.method36454(Class9525.field44336, var1).method36460(Class8524.field38292);
         ServerWorld var7 = var6.method26090();
         Class7318 var8 = var7.getServer().method1411().method1058(var5);
         return var8.method23182(var6);
      } else {
         return Collections.<ItemStack>emptyList();
      }
   }

   @Deprecated
   public long method11691(BlockState var1, BlockPos var2) {
      return MathHelper.method37809(var2);
   }

   @Deprecated
   public VoxelShape method11503(BlockState var1, IBlockReader var2, BlockPos var3) {
      return var1.method23412(var2, var3);
   }

   @Deprecated
   public VoxelShape method11995(BlockState var1, IBlockReader var2, BlockPos var3) {
      return this.method11502(var1, var2, var3, ISelectionContext.method14947());
   }

   @Deprecated
   public VoxelShape method11938(BlockState var1, IBlockReader var2, BlockPos var3) {
      return VoxelShapes.method27425();
   }

   @Deprecated
   public int method11996(BlockState var1, IBlockReader var2, BlockPos var3) {
      if (!var1.method23409(var2, var3)) {
         return !var1.method23386(var2, var3) ? 1 : 0;
      } else {
         return var2.getMaxLightLevel();
      }
   }

   @Nullable
   @Deprecated
   public Class949 method11528(BlockState var1, World var2, BlockPos var3) {
      return null;
   }

   @Deprecated
   public boolean method11492(BlockState var1, Class1662 var2, BlockPos var3) {
      return true;
   }

   @Deprecated
   public float method11636(BlockState var1, IBlockReader var2, BlockPos var3) {
      return !var1.method23456(var2, var3) ? 1.0F : 0.2F;
   }

   @Deprecated
   public int method11649(BlockState var1, World var2, BlockPos var3) {
      return 0;
   }

   @Deprecated
   public VoxelShape method11483(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return VoxelShapes.method27426();
   }

   @Deprecated
   public VoxelShape method11502(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return !this.field19005 ? VoxelShapes.method27425() : var1.method23412(var2, var3);
   }

   @Deprecated
   public VoxelShape method11635(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return this.method11502(var1, var2, var3, var4);
   }

   @Deprecated
   public void method11484(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      this.method11522(var1, var2, var3, var4);
   }

   @Deprecated
   public void method11522(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
   }

   @Deprecated
   public float method11997(BlockState var1, PlayerEntity var2, IBlockReader var3, BlockPos var4) {
      float var7 = var1.method23405(var3, var4);
      if (var7 != -1.0F) {
         int var8 = !var2.method2884(var1) ? 100 : 30;
         return var2.method2883(var1) / var7 / (float)var8;
      } else {
         return 0.0F;
      }
   }

   @Deprecated
   public void method11965(BlockState var1, ServerWorld var2, BlockPos var3, ItemStack var4) {
   }

   @Deprecated
   public void method11602(BlockState var1, World var2, BlockPos var3, PlayerEntity var4) {
   }

   @Deprecated
   public int method11514(BlockState var1, IBlockReader var2, BlockPos var3, Direction var4) {
      return 0;
   }

   @Deprecated
   public void method11523(BlockState var1, World var2, BlockPos var3, Entity var4) {
   }

   @Deprecated
   public int method11515(BlockState var1, IBlockReader var2, BlockPos var3, Direction var4) {
      return 0;
   }

   public final boolean isTileEntityProvider() {
      return this instanceof Class3245;
   }

   public final ResourceLocation method11999() {
      if (this.field19014 == null) {
         ResourceLocation var3 = Registry.BLOCK.getKey(this.method11584());
         this.field19014 = new ResourceLocation(var3.getNamespace(), "blocks/" + var3.getPath());
      }

      return this.field19014;
   }

   @Deprecated
   public void method11595(World var1, BlockState var2, BlockRayTraceResult var3, ProjectileEntity var4) {
   }

   public abstract Item method11581();

   public abstract Block method11584();

   public Class7210 method12000() {
      return (Class7210) AbstractBlock.method26653(this.field19013).apply(this.method11584().method11579());
   }
}
