package remapped;

import javax.annotation.Nullable;

public class class_4734 {
   private static String[] field_22942;
   private final PlayerEntity field_22940;
   private final Hand field_22941;
   private final class_9529 field_22944;
   private final World field_22939;
   private final ItemStack field_22943;

   public class_4734(PlayerEntity var1, Hand var2, class_9529 var3) {
      this(var1.world, var1, var2, var1.method_26617(var2), var3);
   }

   public class_4734(World var1, PlayerEntity var2, Hand var3, ItemStack var4, class_9529 var5) {
      this.field_22940 = var2;
      this.field_22941 = var3;
      this.field_22944 = var5;
      this.field_22943 = var4;
      this.field_22939 = var1;
   }

   public final class_9529 method_21864() {
      return this.field_22944;
   }

   public BlockPos method_21858() {
      return this.field_22944.method_43955();
   }

   public Direction method_21857() {
      return this.field_22944.method_43956();
   }

   public class_1343 method_21865() {
      return this.field_22944.method_33993();
   }

   public boolean method_21866() {
      return this.field_22944.method_43953();
   }

   public ItemStack method_21867() {
      return this.field_22943;
   }

   @Nullable
   public PlayerEntity method_21868() {
      return this.field_22940;
   }

   public Hand method_21860() {
      return this.field_22941;
   }

   public World method_21862() {
      return this.field_22939;
   }

   public Direction method_21863() {
      return this.field_22940 != null ? this.field_22940.method_37365() : Direction.field_818;
   }

   public boolean method_21859() {
      return this.field_22940 != null && this.field_22940.method_3236();
   }

   public float method_21861() {
      return this.field_22940 != null ? this.field_22940.rotationYaw : 0.0F;
   }
}
