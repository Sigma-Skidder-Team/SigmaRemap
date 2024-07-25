package remapped;

import javax.annotation.Nullable;

public class class_2202 implements class_233 {
   private static String[] field_10923;
   private final class_1459 field_10924;
   private final PlayerEntity field_10920;
   private class_2795 field_10921 = new class_2795();
   private int field_10922;

   public class_2202(PlayerEntity var1) {
      this.field_10920 = var1;
      this.field_10924 = new class_1459(this);
   }

   @Nullable
   @Override
   public PlayerEntity method_978() {
      return this.field_10920;
   }

   @Override
   public void method_975(PlayerEntity var1) {
   }

   @Override
   public class_2795 method_974() {
      return this.field_10921;
   }

   @Override
   public void method_980(class_2795 var1) {
      this.field_10921 = var1;
   }

   @Override
   public void method_981(class_8014 var1) {
      var1.method_36358();
   }

   @Override
   public void method_979(ItemStack var1) {
   }

   @Override
   public World method_972() {
      return this.field_10920.world;
   }

   @Override
   public int method_973() {
      return this.field_10922;
   }

   @Override
   public void method_984(int var1) {
      this.field_10922 = var1;
   }

   @Override
   public boolean method_982() {
      return true;
   }

   @Override
   public SoundEvent method_976() {
      return SoundEvents.field_2635;
   }
}
