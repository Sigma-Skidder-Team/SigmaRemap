package remapped;

import java.util.EnumSet;

public class class_768 extends class_3599 {
   private static String[] field_4157;

   public class_768(class_2519 var1) {
      this.field_4156 = var1;
      this.method_16800(EnumSet.<Flag>of(Flag.MOVE));
   }

   @Override
   public boolean method_16795() {
      return this.field_4156.method_17809() != null
            && !this.field_4156.method_26905().method_12877()
            && class_2519.method_11465(this.field_4156).nextInt(7) == 0
         ? this.field_4156.method_37275(this.field_4156.method_17809()) > 4.0
         : false;
   }

   @Override
   public boolean method_16799() {
      return this.field_4156.method_26905().method_12877()
         && this.field_4156.method_11463()
         && this.field_4156.method_17809() != null
         && this.field_4156.method_17809().method_37330();
   }

   @Override
   public void method_16796() {
      LivingEntity var3 = this.field_4156.method_17809();
      class_1343 var4 = var3.method_37335(1.0F);
      class_2519.method_11458(this.field_4156).method_12879(var4.field_7336, var4.field_7333, var4.field_7334, 1.0);
      this.field_4156.method_11468(true);
      this.field_4156.method_37155(SoundEvents.field_2683, 1.0F, 1.0F);
   }

   @Override
   public void method_16793() {
      this.field_4156.method_11468(false);
   }

   @Override
   public void method_16794() {
      LivingEntity var3 = this.field_4156.method_17809();
      if (!this.field_4156.method_37241().method_18909(var3.getBoundingBox())) {
         double var4 = this.field_4156.method_37275(var3);
         if (var4 < 9.0) {
            class_1343 var6 = var3.method_37335(1.0F);
            class_2519.method_11462(this.field_4156).method_12879(var6.field_7336, var6.field_7333, var6.field_7334, 1.0);
         }
      } else {
         this.field_4156.method_26442(var3);
         this.field_4156.method_11468(false);
      }
   }
}
