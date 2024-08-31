package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;

import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class Class3356 extends Class3241 {
   private static String[] field18895;
   public static final Class8553 field18896 = Class3436.field19198;
   public static final Class8552<Class180> field18897 = Class3436.field19211;

   public Class3356(AbstractBlock var1) {
      super(var1);
      this.method11578(this.field18612.method35393().method23465(field18896, Direction.NORTH).method23465(field18897, Class180.field638));
   }

   @Nullable
   @Override
   public TileEntity method11646(Class1665 var1) {
      return null;
   }

   public static TileEntity method11929(BlockState var0, Direction var1, boolean var2, boolean var3) {
      return new Class955(var0, var1, var2, var3);
   }

   @Override
   public void method11513(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      if (!var1.method23448(var4.getBlock())) {
         TileEntity var8 = var2.getTileEntity(var3);
         if (var8 instanceof Class955) {
            ((Class955)var8).method3865();
         }
      }
   }

   @Override
   public void method11551(Class1660 var1, BlockPos var2, BlockState var3) {
      BlockPos var6 = var2.method8349(var3.<Direction>method23463(field18896).method536());
      BlockState var7 = var1.getBlockState(var6);
      if (var7.getBlock() instanceof Class3435 && var7.<Boolean>method23463(Class3435.field19202)) {
         var1.removeBlock(var6, false);
      }
   }

   @Override
   public ActionResultType method11505(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      if (!var2.isRemote && var2.getTileEntity(var3) == null) {
         var2.removeBlock(var3, false);
         return ActionResultType.field14819;
      } else {
         return ActionResultType.field14820;
      }
   }

   @Override
   public List<ItemStack> method11697(BlockState var1, Class9464 var2) {
      Class955 var5 = this.method11930(var2.method36457(), new BlockPos(var2.<Vector3d>method36458(Class9525.field44335)));
      return var5 != null ? var5.method3864().method23434(var2) : Collections.<ItemStack>emptyList();
   }

   @Override
   public VoxelShape method11483(BlockState var1, Class1665 var2, BlockPos var3, ISelectionContext var4) {
      return VoxelShapes.method27425();
   }

   @Override
   public VoxelShape method11502(BlockState var1, Class1665 var2, BlockPos var3, ISelectionContext var4) {
      Class955 var7 = this.method11930(var2, var3);
      return var7 == null ? VoxelShapes.method27425() : var7.method3866(var2, var3);
   }

   @Nullable
   private Class955 method11930(Class1665 var1, BlockPos var2) {
      TileEntity var5 = var1.getTileEntity(var2);
      return !(var5 instanceof Class955) ? null : (Class955)var5;
   }

   @Override
   public ItemStack getItem(Class1665 var1, BlockPos var2, BlockState var3) {
      return ItemStack.EMPTY;
   }

   @Override
   public BlockState method11500(BlockState var1, Class80 var2) {
      return var1.method23465(field18896, var2.method252(var1.<Direction>method23463(field18896)));
   }

   @Override
   public BlockState method11501(BlockState var1, Class2089 var2) {
      return var1.method23395(var2.method8749(var1.<Direction>method23463(field18896)));
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field18896, field18897);
   }

   @Override
   public boolean method11494(BlockState var1, Class1665 var2, BlockPos var3, Class1947 var4) {
      return false;
   }
}
