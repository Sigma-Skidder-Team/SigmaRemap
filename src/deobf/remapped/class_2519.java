package remapped;

import javax.annotation.Nullable;

public class class_2519 extends class_1173 {
   public static final class_7821<Byte> field_12483 = class_8073.<Byte>method_36641(class_2519.class, class_2734.field_13361);
   private class_5886 field_12485;
   private BlockPos field_12486;
   private boolean field_12482;
   private int field_12484;

   public class_2519(class_6629<? extends class_2519> var1, World var2) {
      super(var1, var2);
      this.field_29900 = new class_8979(this, this);
      this.field_29915 = 3;
   }

   @Override
   public void method_37226(class_7412 var1, class_1343 var2) {
      super.method_37226(var1, var2);
      this.method_37097();
   }

   @Override
   public void method_37123() {
      this.field_41731 = true;
      super.method_37123();
      this.field_41731 = false;
      this.method_37182(true);
      if (this.field_12482 && --this.field_12484 <= 0) {
         this.field_12484 = 20;
         this.attackEntityFrom(DamageSource.field_31694, 1.0F);
      }
   }

   @Override
   public void method_26851() {
      super.method_26851();
      this.field_29916.method_3485(0, new class_787(this));
      this.field_29916.method_3485(4, new class_768(this));
      this.field_29916.method_3485(8, new class_2940(this));
      this.field_29916.method_3485(9, new class_4407(this, class_704.class, 3.0F, 1.0F));
      this.field_29916.method_3485(10, new class_4407(this, class_5886.class, 8.0F));
      this.field_29908.method_3485(1, new class_8420(this, class_4040.class).method_38757());
      this.field_29908.method_3485(2, new class_5960(this, this));
      this.field_29908.method_3485(3, new class_4138<class_704>(this, class_704.class, true));
   }

   public static class_1313 method_11453() {
      return class_1173.method_5201().method_5984(class_7331.field_37468, 14.0).method_5984(class_7331.field_37462, 4.0);
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.field_41735.method_36634(field_12483, (byte)0);
   }

   @Override
   public void method_37314(CompoundNBT var1) {
      super.method_37314(var1);
      if (var1.method_25938("BoundX")) {
         this.field_12486 = new BlockPos(var1.method_25947("BoundX"), var1.method_25947("BoundY"), var1.method_25947("BoundZ"));
      }

      if (var1.method_25938("LifeTicks")) {
         this.method_11467(var1.method_25947("LifeTicks"));
      }
   }

   @Override
   public void method_37376(CompoundNBT var1) {
      super.method_37376(var1);
      if (this.field_12486 != null) {
         var1.method_25931("BoundX", this.field_12486.method_12173());
         var1.method_25931("BoundY", this.field_12486.method_12165());
         var1.method_25931("BoundZ", this.field_12486.method_12185());
      }

      if (this.field_12482) {
         var1.method_25931("LifeTicks", this.field_12484);
      }
   }

   public class_5886 method_11454() {
      return this.field_12485;
   }

   @Nullable
   public BlockPos method_11466() {
      return this.field_12486;
   }

   public void method_11470(BlockPos var1) {
      this.field_12486 = var1;
   }

   private boolean method_11459(int var1) {
      byte var4 = this.field_41735.<Byte>method_36640(field_12483);
      return (var4 & var1) != 0;
   }

   private void method_11455(int var1, boolean var2) {
      int var5 = this.field_41735.<Byte>method_36640(field_12483);
      if (!var2) {
         var5 &= ~var1;
      } else {
         var5 |= var1;
      }

      this.field_41735.method_36633(field_12483, (byte)(var5 & 0xFF));
   }

   public boolean method_11463() {
      return this.method_11459(1);
   }

   public void method_11468(boolean var1) {
      this.method_11455(1, var1);
   }

   public void method_11469(class_5886 var1) {
      this.field_12485 = var1;
   }

   public void method_11467(int var1) {
      this.field_12482 = true;
      this.field_12484 = var1;
   }

   @Override
   public class_8461 method_26918() {
      return class_463.field_2186;
   }

   @Override
   public class_8461 method_26599() {
      return class_463.field_2690;
   }

   @Override
   public class_8461 method_26541(DamageSource var1) {
      return class_463.field_2843;
   }

   @Override
   public float method_37193() {
      return 1.0F;
   }

   @Nullable
   @Override
   public class_8733 method_26864(class_1556 var1, class_9589 var2, class_2417 var3, class_8733 var4, CompoundNBT var5) {
      this.method_26870(var2);
      this.method_26893(var2);
      return super.method_26864(var1, var2, var3, var4, var5);
   }

   @Override
   public void method_26870(class_9589 var1) {
      this.method_37349(class_6943.field_35707, new ItemStack(class_4897.field_25277));
      this.method_26861(class_6943.field_35707, 0.0F);
   }
}
