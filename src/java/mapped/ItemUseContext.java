package mapped;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class ItemUseContext {
   private static String[] field25720;
   private final PlayerEntity field25721;
   private final Hand field25722;
   private final BlockRayTraceResult field25723;
   private final World field25724;
   private final ItemStack field25725;

   public ItemUseContext(PlayerEntity var1, Hand var2, BlockRayTraceResult var3) {
      this(var1.world, var1, var2, var1.getHeldItem(var2), var3);
   }

   public ItemUseContext(World var1, PlayerEntity var2, Hand var3, ItemStack var4, BlockRayTraceResult var5) {
      this.field25721 = var2;
      this.field25722 = var3;
      this.field25723 = var5;
      this.field25725 = var4;
      this.field25724 = var1;
   }

   public final BlockRayTraceResult method18353() {
      return this.field25723;
   }

   public BlockPos getPos() {
      return this.field25723.getPos();
   }

   public Direction getFace() {
      return this.field25723.getFace();
   }

   public Vector3d getHitVec() {
      return this.field25723.getVec();
   }

   public boolean method18356() {
      return this.field25723.method31425();
   }

   public ItemStack method18357() {
      return this.field25725;
   }

   @Nullable
   public PlayerEntity method18358() {
      return this.field25721;
   }

   public Hand method18359() {
      return this.field25722;
   }

   public World getWorld() {
      return this.field25724;
   }

   public Direction getPlacementHorizontalFacing() {
      return this.field25721 != null ? this.field25721.getHorizontalFacing() : Direction.NORTH;
   }

   public boolean method18351() {
      return this.field25721 != null && this.field25721.method2851();
   }

   public float method18352() {
      return this.field25721 != null ? this.field25721.rotationYaw : 0.0F;
   }
}
