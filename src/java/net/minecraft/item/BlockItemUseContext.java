package net.minecraft.item;

import mapped.ItemUseContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

public class BlockItemUseContext extends ItemUseContext {
   private static String[] field25716;
   public BlockPos field25717;
   public boolean field25718 = true;

   public BlockItemUseContext(PlayerEntity var1, Hand var2, ItemStack var3, BlockRayTraceResult var4) {
      this(var1.world, var1, var2, var3, var4);
   }

   public BlockItemUseContext(ItemUseContext var1) {
      this(var1.getWorld(), var1.method18358(), var1.method18359(), var1.method18357(), var1.method18353());
   }

   public BlockItemUseContext(World var1, PlayerEntity var2, Hand var3, ItemStack var4, BlockRayTraceResult var5) {
      super(var1, var2, var3, var4, var5);
      this.field25717 = var5.getPos().offset(var5.getFace());
      this.field25718 = var1.getBlockState(var5.getPos()).method23441(this);
   }

   public static BlockItemUseContext method18344(BlockItemUseContext var0, BlockPos var1, Direction var2) {
      return new BlockItemUseContext(
         var0.getWorld(),
         var0.method18358(),
         var0.method18359(),
         var0.method18357(),
         new BlockRayTraceResult(
            new Vector3d(
               (double)var1.getX() + 0.5 + (double)var2.getXOffset() * 0.5,
               (double)var1.getY() + 0.5 + (double)var2.getYOffset() * 0.5,
               (double)var1.getZ() + 0.5 + (double)var2.getZOffset() * 0.5
            ),
            var2,
            var1,
            false
         )
      );
   }

   @Override
   public BlockPos getPos() {
      return !this.field25718 ? this.field25717 : super.getPos();
   }

   public boolean method18346() {
      return this.field25718 || this.getWorld().getBlockState(this.getPos()).method23441(this);
   }

   public boolean method18347() {
      return this.field25718;
   }

   public Direction method18348() {
      return Direction.method529(this.method18358())[0];
   }

   public Direction[] method18349() {
      Direction[] var3 = Direction.method529(this.method18358());
      if (this.field25718) {
         return var3;
      } else {
         Direction var4 = this.getFace();
         int var5 = 0;

         while (var5 < var3.length && var3[var5] != var4.getOpposite()) {
            var5++;
         }

         if (var5 > 0) {
            System.arraycopy(var3, 0, var3, 1, var5);
            var3[0] = var4.getOpposite();
         }

         return var3;
      }
   }
}
