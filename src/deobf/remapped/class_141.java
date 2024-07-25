package remapped;

import javax.annotation.Nullable;

public class class_141 extends class_5521 {
   private static String[] field_409;

   public class_141(EntityType<? extends class_141> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public SoundEvent method_26918() {
      super.method_26918();
      return SoundEvents.field_1969;
   }

   @Override
   public SoundEvent method_19056() {
      super.method_19056();
      return SoundEvents.field_2742;
   }

   @Override
   public SoundEvent method_26599() {
      super.method_26599();
      return SoundEvents.field_2108;
   }

   @Nullable
   @Override
   public SoundEvent method_19083() {
      return SoundEvents.field_2164;
   }

   @Override
   public SoundEvent method_26541(DamageSource var1) {
      super.method_26541(var1);
      return SoundEvents.field_2897;
   }

   @Override
   public boolean method_24873(class_5467 var1) {
      if (var1 != this) {
         return !(var1 instanceof class_141) && !(var1 instanceof class_3551) ? false : this.method_19058() && ((class_4109)var1).method_19058();
      } else {
         return false;
      }
   }

   @Override
   public class_1899 method_8638(class_6331 var1, class_1899 var2) {
      EntityType var5 = !(var2 instanceof class_3551) ? EntityType.field_34248 : EntityType.field_34218;
      class_4109 var6 = (class_4109)var5.method_30484(var1);
      this.method_19055(var2, var6);
      return var6;
   }
}
