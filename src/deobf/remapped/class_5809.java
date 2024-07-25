package remapped;

import java.util.EnumSet;

public class class_5809 extends class_3599 {
   private static String[] field_29321;
   private final class_9408 field_29320;
   private PlayerEntity field_29325;
   private final World field_29324;
   private final float field_29323;
   private int field_29322;
   private final class_4931 field_29319;

   public class_5809(class_9408 var1, float var2) {
      this.field_29320 = var1;
      this.field_29324 = var1.world;
      this.field_29323 = var2;
      this.field_29319 = new class_4931().method_22607((double)var2).method_22603().method_22601().method_22609();
      this.method_16800(EnumSet.<Flag>of(Flag.LOOK));
   }

   @Override
   public boolean method_16795() {
      this.field_29325 = this.field_29324.method_25859(this.field_29319, this.field_29320);
      return this.field_29325 != null ? this.method_26302(this.field_29325) : false;
   }

   @Override
   public boolean method_16799() {
      if (this.field_29325.isAlive()) {
         return this.field_29320.method_37275(this.field_29325) > (double)(this.field_29323 * this.field_29323)
            ? false
            : this.field_29322 > 0 && this.method_26302(this.field_29325);
      } else {
         return false;
      }
   }

   @Override
   public void method_16796() {
      this.field_29320.method_43579(true);
      this.field_29322 = 40 + this.field_29320.method_26594().nextInt(40);
   }

   @Override
   public void method_16793() {
      this.field_29320.method_43579(false);
      this.field_29325 = null;
   }

   @Override
   public void method_16794() {
      this.field_29320
         .method_26865()
         .method_17231(
            this.field_29325.getPosX(), this.field_29325.method_37388(), this.field_29325.getPosZ(), 10.0F, (float)this.field_29320.method_26862()
         );
      this.field_29322--;
   }

   private boolean method_26302(PlayerEntity var1) {
      for (Hand var7 : Hand.values()) {
         ItemStack var8 = var1.method_26617(var7);
         if (this.field_29320.method_41215() && var8.method_27960() == class_4897.field_24384) {
            return true;
         }

         if (this.field_29320.method_24866(var8)) {
            return true;
         }
      }

      return false;
   }
}
