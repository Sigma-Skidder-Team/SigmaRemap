package mapped;

import javax.annotation.Nullable;

public class Class5911 {
   private static String[] field25720;
   private final PlayerEntity field25721;
   private final Hand field25722;
   private final BlockRayTraceResult field25723;
   private final World field25724;
   private final ItemStack field25725;

   public Class5911(PlayerEntity var1, Hand var2, BlockRayTraceResult var3) {
      this(var1.world, var1, var2, var1.getHeldItem(var2), var3);
   }

   public Class5911(World var1, PlayerEntity var2, Hand var3, ItemStack var4, BlockRayTraceResult var5) {
      this.field25721 = var2;
      this.field25722 = var3;
      this.field25723 = var5;
      this.field25725 = var4;
      this.field25724 = var1;
   }

   public final BlockRayTraceResult method18353() {
      return this.field25723;
   }

   public BlockPos method18345() {
      return this.field25723.getPos();
   }

   public Direction method18354() {
      return this.field25723.getFace();
   }

   public Vector3d method18355() {
      return this.field25723.method31419();
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

   public World method18360() {
      return this.field25724;
   }

   public Direction method18350() {
      return this.field25721 != null ? this.field25721.method3386() : Direction.NORTH;
   }

   public boolean method18351() {
      return this.field25721 != null && this.field25721.method2851();
   }

   public float method18352() {
      return this.field25721 != null ? this.field25721.field5031 : 0.0F;
   }
}
