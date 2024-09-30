package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.impl.EventBlockCollision;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.ICollisionReader;

import java.util.Objects;
import java.util.Spliterators.AbstractSpliterator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class Class8181 extends AbstractSpliterator<VoxelShape> {
   private static String[] field35185;
   private final Entity field35186;
   private final AxisAlignedBB field35187;
   private final ISelectionContext field35188;
   private final Class8893 field35189;
   private final BlockPos.Mutable field35190;
   private final VoxelShape field35191;
   private final ICollisionReader field35192;
   private boolean field35193;
   private final BiPredicate<BlockState, BlockPos> field35194;

   public Class8181(ICollisionReader var1, Entity var2, AxisAlignedBB var3) {
      this(var1, var2, var3, (var0, var1x) -> true);
   }

   public Class8181(ICollisionReader var1, Entity var2, AxisAlignedBB var3, BiPredicate<BlockState, BlockPos> var4) {
      super(Long.MAX_VALUE, 1280);
      this.field35188 = var2 != null ? ISelectionContext.forEntity(var2) : ISelectionContext.method14947();
      this.field35190 = new BlockPos.Mutable();
      this.field35191 = VoxelShapes.create(var3);
      this.field35192 = var1;
      this.field35193 = var2 != null;
      this.field35186 = var2;
      this.field35187 = var3;
      this.field35194 = var4;
      int var7 = MathHelper.floor(var3.minX - 1.0E-7) - 1;
      int var8 = MathHelper.floor(var3.maxX + 1.0E-7) + 1;
      int var9 = MathHelper.floor(var3.minY - 1.0E-7) - 1;
      int var10 = MathHelper.floor(var3.maxY + 1.0E-7) + 1;
      int var11 = MathHelper.floor(var3.minZ - 1.0E-7) - 1;
      int var12 = MathHelper.floor(var3.maxZ + 1.0E-7) + 1;
      this.field35189 = new Class8893(var7, var9, var11, var8, var10, var12);
   }

   @Override
   public boolean tryAdvance(Consumer<? super VoxelShape> var1) {
      return this.field35193 && this.method28475(var1) || this.method28473(var1);
   }

   public boolean method28473(Consumer<? super VoxelShape> var1) {
      while (this.field35189.method32365()) {
         int var4 = this.field35189.method32366();
         int var5 = this.field35189.method32367();
         int var6 = this.field35189.method32368();
         int var7 = this.field35189.method32369();
         if (var7 != 3) {
            IBlockReader var8 = this.method28474(var4, var6);
            if (var8 != null) {
               this.field35190.setPos(var4, var5, var6);
               BlockState var9 = var8.getBlockState(this.field35190);
               if (this.field35194.test(var9, this.field35190) && (var7 != 1 || var9.method23390()) && (var7 != 2 || var9.isIn(Blocks.MOVING_PISTON))) {
                  VoxelShape var10 = var9.getCollisionShape(this.field35192, this.field35190, this.field35188);
                  if (this.field35186 instanceof PlayerEntity) {
                     EventBlockCollision var11 = new EventBlockCollision(this.field35190, var10);
                     Client.getInstance().getEventManager().call(var11);
                     var10 = var11.getVoxelShape();
                     if (var11.isCancelled()) {
                        return false;
                     }
                  }

                  if (var10 != VoxelShapes.method27426()) {
                     VoxelShape var12 = var10.withOffset((double)var4, (double)var5, (double)var6);
                     if (VoxelShapes.compare(var12, this.field35191, IBooleanFunction.AND)) {
                        var1.accept(var12);
                        return true;
                     }
                  } else if (this.field35187.method19671((double)var4, (double)var5, (double)var6, (double)var4 + 1.0, (double)var5 + 1.0, (double)var6 + 1.0)) {
                     var1.accept(var10.withOffset((double)var4, (double)var5, (double)var6));
                     return true;
                  }
               }
            }
         }
      }

      return false;
   }

   @Nullable
   private IBlockReader method28474(int var1, int var2) {
      int var5 = var1 >> 4;
      int var6 = var2 >> 4;
      return this.field35192.getBlockReader(var5, var6);
   }

   public boolean method28475(Consumer<? super VoxelShape> var1) {
      Objects.<Entity>requireNonNull(this.field35186);
      this.field35193 = false;
      WorldBorder var4 = this.field35192.getWorldBorder();
      AxisAlignedBB var5 = this.field35186.getBoundingBox();
      if (!method28478(var4, var5)) {
         VoxelShape var6 = var4.getShape();
         if (!method28477(var6, var5) && method28476(var6, var5)) {
            var1.accept(var6);
            return true;
         }
      }

      return false;
   }

   private static boolean method28476(VoxelShape var0, AxisAlignedBB var1) {
      return VoxelShapes.compare(var0, VoxelShapes.create(var1.method19664(1.0E-7)), IBooleanFunction.AND);
   }

   private static boolean method28477(VoxelShape var0, AxisAlignedBB var1) {
      return VoxelShapes.compare(var0, VoxelShapes.create(var1.shrink(1.0E-7)), IBooleanFunction.AND);
   }

   public static boolean method28478(WorldBorder var0, AxisAlignedBB var1) {
      double var4 = (double) MathHelper.floor(var0.method24530());
      double var6 = (double) MathHelper.floor(var0.method24531());
      double var8 = (double) MathHelper.method37774(var0.method24532());
      double var10 = (double) MathHelper.method37774(var0.method24533());
      return var1.minX > var4
         && var1.minX < var8
         && var1.minZ > var6
         && var1.minZ < var10
         && var1.maxX > var4
         && var1.maxX < var8
         && var1.maxZ > var6
         && var1.maxZ < var10;
   }
}
