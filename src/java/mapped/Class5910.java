package mapped;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

public class Class5910 extends Class5909 {
   private static String[] field25716;
   private final net.minecraft.util.Direction field25719;

   public Class5910(World var1, BlockPos var2, net.minecraft.util.Direction var3, ItemStack var4, net.minecraft.util.Direction var5) {
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
   public net.minecraft.util.Direction method18348() {
      return net.minecraft.util.Direction.DOWN;
   }

   @Override
   public net.minecraft.util.Direction[] method18349() {
      switch (Class8228.field35345[this.field25719.ordinal()]) {
         case 1:
         default:
            return new net.minecraft.util.Direction[]{net.minecraft.util.Direction.DOWN, net.minecraft.util.Direction.NORTH, net.minecraft.util.Direction.EAST, net.minecraft.util.Direction.SOUTH, net.minecraft.util.Direction.WEST, net.minecraft.util.Direction.field673};
         case 2:
            return new net.minecraft.util.Direction[]{net.minecraft.util.Direction.DOWN, net.minecraft.util.Direction.field673, net.minecraft.util.Direction.NORTH, net.minecraft.util.Direction.EAST, net.minecraft.util.Direction.SOUTH, net.minecraft.util.Direction.WEST};
         case 3:
            return new net.minecraft.util.Direction[]{net.minecraft.util.Direction.DOWN, net.minecraft.util.Direction.NORTH, net.minecraft.util.Direction.EAST, net.minecraft.util.Direction.WEST, net.minecraft.util.Direction.field673, net.minecraft.util.Direction.SOUTH};
         case 4:
            return new net.minecraft.util.Direction[]{net.minecraft.util.Direction.DOWN, net.minecraft.util.Direction.SOUTH, net.minecraft.util.Direction.EAST, net.minecraft.util.Direction.WEST, net.minecraft.util.Direction.field673, net.minecraft.util.Direction.NORTH};
         case 5:
            return new net.minecraft.util.Direction[]{net.minecraft.util.Direction.DOWN, net.minecraft.util.Direction.WEST, net.minecraft.util.Direction.SOUTH, net.minecraft.util.Direction.field673, net.minecraft.util.Direction.NORTH, net.minecraft.util.Direction.EAST};
         case 6:
            return new net.minecraft.util.Direction[]{net.minecraft.util.Direction.DOWN, net.minecraft.util.Direction.EAST, net.minecraft.util.Direction.SOUTH, net.minecraft.util.Direction.field673, net.minecraft.util.Direction.NORTH, net.minecraft.util.Direction.WEST};
      }
   }

   @Override
   public net.minecraft.util.Direction method18350() {
      return this.field25719.getAxis() != Direction.Y ? this.field25719 : net.minecraft.util.Direction.NORTH;
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
