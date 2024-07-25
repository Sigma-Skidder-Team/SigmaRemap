package remapped;

import java.util.Random;
import javax.annotation.Nullable;

public class class_3573 implements class_4904 {
   private static String[] field_17491;
   private final ItemStack field_17490;
   private final int field_17493;
   private final int field_17494;
   private final ItemStack field_17487;
   private final int field_17488;
   private final int field_17489;
   private final int field_17495;
   private final float field_17492;

   public class_3573(class_8525 var1, int var2, class_2451 var3, int var4, int var5, int var6) {
      this(var1, var2, 1, var3, var4, var5, var6);
   }

   public class_3573(class_8525 var1, int var2, int var3, class_2451 var4, int var5, int var6, int var7) {
      this.field_17490 = new ItemStack(var1);
      this.field_17493 = var2;
      this.field_17494 = var3;
      this.field_17487 = new ItemStack(var4);
      this.field_17488 = var5;
      this.field_17489 = var6;
      this.field_17495 = var7;
      this.field_17492 = 0.05F;
   }

   @Nullable
   @Override
   public class_8014 method_22451(Entity var1, Random var2) {
      return new class_8014(
         new ItemStack(class_4897.field_24997, this.field_17494),
         new ItemStack(this.field_17490.method_27960(), this.field_17493),
         new ItemStack(this.field_17487.method_27960(), this.field_17488),
         this.field_17489,
         this.field_17495,
         this.field_17492
      );
   }
}
