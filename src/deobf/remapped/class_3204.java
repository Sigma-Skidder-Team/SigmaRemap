package remapped;

import javax.annotation.Nullable;

public class class_3204 extends class_1595 {
   private static String[] field_16001;

   public class_3204(EntityType<? extends class_3204> var1, World var2) {
      super(var1, var2);
      this.method_26895(class_1108.field_6360, 8.0F);
   }

   @Override
   public void method_26851() {
      this.field_29908.method_3485(3, new class_4138<class_6993>(this, class_6993.class, true));
      super.method_26851();
   }

   @Override
   public class_8461 method_26918() {
      return class_463.field_2657;
   }

   @Override
   public class_8461 method_26541(DamageSource var1) {
      return class_463.field_2508;
   }

   @Override
   public class_8461 method_26599() {
      return class_463.field_2274;
   }

   @Override
   public class_8461 method_7150() {
      return class_463.field_2863;
   }

   @Override
   public void method_26614(DamageSource var1, int var2, boolean var3) {
      super.method_26614(var1, var2, var3);
      Entity var6 = var1.method_28372();
      if (var6 instanceof class_9490) {
         class_9490 var7 = (class_9490)var6;
         if (var7.method_43837()) {
            var7.method_43832();
            this.method_37312(class_4897.field_24563);
         }
      }
   }

   @Override
   public void method_26870(class_9589 var1) {
      this.method_37349(class_6943.field_35707, new ItemStack(class_4897.field_25247));
   }

   @Override
   public void method_26893(class_9589 var1) {
   }

   @Nullable
   @Override
   public class_8733 method_26864(class_1556 var1, class_9589 var2, class_2417 var3, class_8733 var4, CompoundNBT var5) {
      class_8733 var8 = super.method_26864(var1, var2, var3, var4, var5);
      this.method_26561(class_7331.field_37462).method_45006(4.0);
      this.method_7153();
      return var8;
   }

   @Override
   public float method_26425(class_7653 var1, class_6097 var2) {
      return 2.1F;
   }

   @Override
   public boolean method_26442(Entity var1) {
      if (super.method_26442(var1)) {
         if (var1 instanceof class_5834) {
            ((class_5834)var1).method_26558(new class_2250(Effects.field_19725, 200));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public class_6749 method_7152(ItemStack var1, float var2) {
      class_6749 var5 = super.method_7152(var1, var2);
      var5.method_37178(100);
      return var5;
   }

   @Override
   public boolean method_26495(class_2250 var1) {
      return var1.method_10339() != Effects.field_19725 ? super.method_26495(var1) : false;
   }
}
