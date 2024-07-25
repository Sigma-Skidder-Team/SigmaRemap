package remapped;

import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.Nullable;

public class class_9405 extends class_5467 implements class_8190, class_9378 {
   private static String[] field_48086;
   private static final class_7821<Boolean> field_48088 = class_8073.<Boolean>method_36641(class_9405.class, class_2734.field_13347);
   private static final class_7821<Integer> field_48089 = class_8073.<Integer>method_36641(class_9405.class, class_2734.field_13366);
   private static final class_8137 field_48085 = class_8137.method_37019(class_4897.field_25136, class_4897.field_25273, class_4897.field_24362);
   private final class_686 field_48087 = new class_686(this.field_41735, field_48089, field_48088);

   public class_9405(class_6629<? extends class_9405> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public void method_26851() {
      this.field_29916.method_3485(0, new class_787(this));
      this.field_29916.method_3485(1, new class_518(this, 1.25));
      this.field_29916.method_3485(3, new class_9513(this, 1.0));
      this.field_29916.method_3485(4, new class_7228(this, 1.2, class_8137.method_37019(class_4897.field_25186), false));
      this.field_29916.method_3485(4, new class_7228(this, 1.2, false, field_48085));
      this.field_29916.method_3485(5, new class_8676(this, 1.1));
      this.field_29916.method_3485(6, new class_2889(this, 1.0));
      this.field_29916.method_3485(7, new class_4407(this, class_704.class, 6.0F));
      this.field_29916.method_3485(8, new class_9691(this));
   }

   public static class_1313 method_43571() {
      return class_5886.method_26846().method_5984(class_7331.field_37468, 10.0).method_5984(class_7331.field_37465, 0.25);
   }

   @Nullable
   @Override
   public Entity method_37259() {
      return !this.method_37114().isEmpty() ? this.method_37114().get(0) : null;
   }

   @Override
   public boolean method_26863() {
      Entity var3 = this.method_37259();
      if (!(var3 instanceof class_704)) {
         return false;
      } else {
         class_704 var4 = (class_704)var3;
         return var4.method_26446().method_27960() == class_4897.field_25186 || var4.method_26568().method_27960() == class_4897.field_25186;
      }
   }

   @Override
   public void method_37191(class_7821<?> var1) {
      if (field_48089.equals(var1) && this.world.field_33055) {
         this.field_48087.method_3108();
      }

      super.method_37191(var1);
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.field_41735.method_36634(field_48088, false);
      this.field_41735.method_36634(field_48089, 0);
   }

   @Override
   public void method_37376(CompoundNBT var1) {
      super.method_37376(var1);
      this.field_48087.method_3111(var1);
   }

   @Override
   public void method_37314(CompoundNBT var1) {
      super.method_37314(var1);
      this.field_48087.method_3106(var1);
   }

   @Override
   public class_8461 method_26918() {
      return class_463.field_1944;
   }

   @Override
   public class_8461 method_26541(DamageSource var1) {
      return class_463.field_2061;
   }

   @Override
   public class_8461 method_26599() {
      return class_463.field_1993;
   }

   @Override
   public void method_37207(BlockPos var1, class_2522 var2) {
      this.method_37155(class_463.field_2788, 0.15F, 1.0F);
   }

   @Override
   public class_6910 method_26857(class_704 var1, Hand var2) {
      boolean var5 = this.method_24866(var1.method_26617(var2));
      if (!var5 && this.method_43357() && !this.method_37151() && !var1.method_3236()) {
         if (!this.world.field_33055) {
            var1.method_37353(this);
         }

         return class_6910.method_31659(this.world.field_33055);
      } else {
         class_6910 var6 = super.method_26857(var1, var2);
         if (var6.method_31662()) {
            return var6;
         } else {
            ItemStack var7 = var1.method_26617(var2);
            return var7.method_27960() != class_4897.field_24836 ? class_6910.field_35521 : var7.method_28000(var1, this, var2);
         }
      }
   }

   @Override
   public boolean method_43356() {
      return this.method_37330() && !this.method_26449();
   }

   @Override
   public void method_26522() {
      super.method_26522();
      if (this.method_43357()) {
         this.method_37312(class_4897.field_24836);
      }
   }

   @Override
   public boolean method_43357() {
      return this.field_48087.method_3110();
   }

   @Override
   public void method_43358(class_562 var1) {
      this.field_48087.method_3112(true);
      if (var1 != null) {
         this.world.method_29540((class_704)null, this, class_463.field_1931, var1, 0.5F, 1.0F);
      }
   }

   @Override
   public class_1343 method_37282(class_5834 var1) {
      Direction var4 = this.method_37235();
      if (var4.method_1029() == class_9249.field_47216) {
         return super.method_37282(var1);
      } else {
         int[][] var5 = class_160.method_645(var4);
         BlockPos var6 = this.method_37075();
         class_2921 var7 = new class_2921();
         UnmodifiableIterator var8 = var1.method_26454().iterator();

         while (var8.hasNext()) {
            class_7653 var9 = (class_7653)var8.next();
            class_4092 var10 = var1.method_26549(var9);

            for (int[] var14 : var5) {
               var7.method_13362(var6.method_12173() + var14[0], var6.method_12165(), var6.method_12185() + var14[1]);
               double var15 = this.world.method_28259(var7);
               if (class_160.method_648(var15)) {
                  class_1343 var17 = class_1343.method_6219(var7, var15);
                  if (class_160.method_647(this.world, var1, var10.method_18920(var17))) {
                     var1.method_37356(var9);
                     return var17;
                  }
               }
            }
         }

         return super.method_37282(var1);
      }
   }

   @Override
   public void method_37384(class_6331 var1, class_900 var2) {
      if (var1.method_43370() == class_423.field_1790) {
         super.method_37384(var1, var2);
      } else {
         class_1918 var5 = class_6629.field_34234.method_30484(var1);
         var5.method_37349(class_6943.field_35707, new ItemStack(class_4897.field_25057));
         var5.method_37144(this.method_37302(), this.method_37309(), this.method_37156(), this.rotationYaw, this.rotationPitch);
         var5.method_26888(this.method_26859());
         var5.method_26910(this.method_26449());
         if (this.method_45507()) {
            var5.method_37303(this.method_45508());
            var5.method_37319(this.method_37135());
         }

         var5.method_26883();
         var1.method_7509(var5);
         this.method_37204();
      }
   }

   @Override
   public void method_26431(class_1343 var1) {
      this.method_37517(this, this.field_48087, var1);
   }

   @Override
   public float method_37516() {
      return (float)this.method_26575(class_7331.field_37465) * 0.225F;
   }

   @Override
   public void method_37519(class_1343 var1) {
      super.method_26431(var1);
   }

   @Override
   public boolean method_37518() {
      return this.field_48087.method_3109(this.method_26594());
   }

   public class_9405 method_43572(class_6331 var1, class_1899 var2) {
      return class_6629.field_34252.method_30484(var1);
   }

   @Override
   public boolean method_24866(ItemStack var1) {
      return field_48085.test(var1);
   }

   @Override
   public class_1343 method_37323() {
      return new class_1343(0.0, (double)(0.6F * this.method_37277()), (double)(this.method_37086() * 0.4F));
   }
}
