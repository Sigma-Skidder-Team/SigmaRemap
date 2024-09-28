package mapped;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

public class Class5910 extends Class5909 {
   private static String[] field25716;
   private final Direction field25719;

   public Class5910(World var1, BlockPos var2, Direction var3, ItemStack var4, Direction var5) {
      super(var1, (PlayerEntity)null, Hand.MAIN_HAND, var4, new BlockRayTraceResult(Vector3d.method11330(var2), var5, var2, false));
      this.field25719 = var3;
   }

   @Override
   public BlockPos method18345() {
      return this.method18353().getPos();
   }

   @Override
   public boolean method18346() {
      return this.method18360().getBlockState(this.method18353().getPos()).method23441(this);
   }

   @Override
   public boolean method18347() {
      return this.method18346();
   }

   @Override
   public Direction method18348() {
      return Direction.DOWN;
   }

   @Override
   public Direction[] method18349() {
      switch (Class8228.field35345[this.field25719.ordinal()]) {
         case 1:
         default:
            return new Direction[]{Direction.DOWN, Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST, Direction.UP};
         case 2:
            return new Direction[]{Direction.DOWN, Direction.UP, Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST};
         case 3:
            return new Direction[]{Direction.DOWN, Direction.NORTH, Direction.EAST, Direction.WEST, Direction.UP, Direction.SOUTH};
         case 4:
            return new Direction[]{Direction.DOWN, Direction.SOUTH, Direction.EAST, Direction.WEST, Direction.UP, Direction.NORTH};
         case 5:
            return new Direction[]{Direction.DOWN, Direction.WEST, Direction.SOUTH, Direction.UP, Direction.NORTH, Direction.EAST};
         case 6:
            return new Direction[]{Direction.DOWN, Direction.EAST, Direction.SOUTH, Direction.UP, Direction.NORTH, Direction.WEST};
      }
   }

   @Override
   public Direction method18350() {
      return this.field25719.getAxis() != Direction.Axis.Y ? this.field25719 : Direction.NORTH;
   }

   @Override
   public boolean method18351() {
      return false;
   }

   @Override
   public float method18352() {
      return (float)(this.field25719.method534() * 90);
   }
}
