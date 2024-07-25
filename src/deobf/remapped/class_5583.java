package remapped;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class class_5583 extends class_8990 {
   private static final class_8137 field_28348 = class_8137.method_37019(class_4897.field_24814, class_4897.field_25201);
   private static final class_7821<Integer> field_28345 = class_8073.<Integer>method_36641(class_5583.class, class_2734.field_13366);
   private static final class_7821<Boolean> field_28344 = class_8073.<Boolean>method_36641(class_5583.class, class_2734.field_13347);
   private static final class_7821<Boolean> field_28356 = class_8073.<Boolean>method_36641(class_5583.class, class_2734.field_13347);
   private static final class_7821<Integer> field_28349 = class_8073.<Integer>method_36641(class_5583.class, class_2734.field_13366);
   public static final Map<Integer, Identifier> field_28352 = Util.<Map<Integer, Identifier>>method_44659(Maps.newHashMap(), var0 -> {
      var0.put(0, new Identifier("textures/entity/cat/tabby.png"));
      var0.put(1, new Identifier("textures/entity/cat/black.png"));
      var0.put(2, new Identifier("textures/entity/cat/red.png"));
      var0.put(3, new Identifier("textures/entity/cat/siamese.png"));
      var0.put(4, new Identifier("textures/entity/cat/british_shorthair.png"));
      var0.put(5, new Identifier("textures/entity/cat/calico.png"));
      var0.put(6, new Identifier("textures/entity/cat/persian.png"));
      var0.put(7, new Identifier("textures/entity/cat/ragdoll.png"));
      var0.put(8, new Identifier("textures/entity/cat/white.png"));
      var0.put(9, new Identifier("textures/entity/cat/jellie.png"));
      var0.put(10, new Identifier("textures/entity/cat/all_black.png"));
   });
   private class_4204<class_704> field_28353;
   private class_7228 field_28350;
   private float field_28343;
   private float field_28347;
   private float field_28351;
   private float field_28355;
   private float field_28354;
   private float field_28357;

   public class_5583(EntityType<? extends class_5583> var1, World var2) {
      super(var1, var2);
   }

   public Identifier method_25352() {
      return field_28352.getOrDefault(this.method_25353(), field_28352.get(0));
   }

   @Override
   public void registerGoals() {
      this.field_28350 = new class_6099(this, 0.6, field_28348, true);
      this.field_29916.method_3485(1, new class_787(this));
      this.field_29916.method_3485(1, new class_8453(this));
      this.field_29916.method_3485(2, new class_5973(this));
      this.field_29916.method_3485(3, this.field_28350);
      this.field_29916.method_3485(5, new class_1163(this, 1.1, 8));
      this.field_29916.method_3485(6, new class_5591(this, 1.0, 10.0F, 5.0F, false));
      this.field_29916.method_3485(7, new class_4073(this, 0.8));
      this.field_29916.method_3485(8, new class_1937(this, 0.3F));
      this.field_29916.method_3485(9, new class_7037(this));
      this.field_29916.method_3485(10, new class_9513(this, 0.8));
      this.field_29916.method_3485(11, new class_2889(this, 0.8, 1.0000001E-5F));
      this.field_29916.method_3485(12, new class_4407(this, class_704.class, 10.0F));
      this.field_29908.method_3485(1, new class_5327<class_7272>(this, class_7272.class, false, (Predicate<class_5834>)null));
      this.field_29908.method_3485(1, new class_5327<class_3845>(this, class_3845.class, false, class_3845.field_18768));
   }

   public int method_25353() {
      return this.field_41735.<Integer>method_36640(field_28345);
   }

   public void method_25356(int var1) {
      if (var1 < 0 || var1 >= 11) {
         var1 = this.field_41717.nextInt(10);
      }

      this.field_41735.method_36633(field_28345, var1);
   }

   public void method_25358(boolean var1) {
      this.field_41735.method_36633(field_28344, var1);
   }

   public boolean method_25365() {
      return this.field_41735.<Boolean>method_36640(field_28344);
   }

   public void method_25355(boolean var1) {
      this.field_41735.method_36633(field_28356, var1);
   }

   public boolean method_25366() {
      return this.field_41735.<Boolean>method_36640(field_28356);
   }

   public class_9077 method_25360() {
      return class_9077.method_41789(this.field_41735.<Integer>method_36640(field_28349));
   }

   public void method_25351(class_9077 var1) {
      this.field_41735.method_36633(field_28349, var1.method_41794());
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.field_41735.method_36634(field_28345, 1);
      this.field_41735.method_36634(field_28344, false);
      this.field_41735.method_36634(field_28356, false);
      this.field_41735.method_36634(field_28349, class_9077.field_46494.method_41794());
   }

   @Override
   public void method_37376(CompoundNBT var1) {
      super.method_37376(var1);
      var1.method_25931("CatType", this.method_25353());
      var1.method_25921("CollarColor", (byte)this.method_25360().method_41794());
   }

   @Override
   public void method_37314(CompoundNBT var1) {
      super.method_37314(var1);
      this.method_25356(var1.method_25947("CatType"));
      if (var1.contains("CollarColor", 99)) {
         this.method_25351(class_9077.method_41789(var1.method_25947("CollarColor")));
      }
   }

   @Override
   public void method_26919() {
      if (!this.method_26905().method_12877()) {
         this.method_37356(class_7653.field_38885);
         this.method_37140(false);
      } else {
         double var3 = this.method_26905().method_12880();
         if (var3 != 0.6) {
            if (var3 != 1.33) {
               this.method_37356(class_7653.field_38885);
               this.method_37140(false);
            } else {
               this.method_37356(class_7653.field_38885);
               this.method_37140(true);
            }
         } else {
            this.method_37356(class_7653.field_38881);
            this.method_37140(false);
         }
      }
   }

   @Nullable
   @Override
   public class_8461 method_26918() {
      if (!this.method_41215()) {
         return class_463.field_1960;
      } else if (!this.method_24875()) {
         return this.field_41717.nextInt(4) != 0 ? class_463.field_2851 : class_463.field_2849;
      } else {
         return class_463.field_2118;
      }
   }

   @Override
   public int method_26850() {
      return 120;
   }

   public void method_25363() {
      this.method_37155(class_463.field_2414, this.method_26439(), this.method_26547());
   }

   @Override
   public class_8461 method_26541(DamageSource var1) {
      return class_463.field_2548;
   }

   @Override
   public class_8461 method_26599() {
      return class_463.field_2857;
   }

   public static class_1313 method_25354() {
      return class_5886.method_26846()
         .method_5984(class_7331.field_37468, 10.0)
         .method_5984(class_7331.field_37465, 0.3F)
         .method_5984(class_7331.field_37462, 3.0);
   }

   @Override
   public boolean method_37270(float var1, float var2) {
      return false;
   }

   @Override
   public void method_24867(class_704 var1, ItemStack var2) {
      if (this.method_24866(var2)) {
         this.method_37155(class_463.field_2578, 1.0F, 1.0F);
      }

      super.method_24867(var1, var2);
   }

   private float method_25359() {
      return (float)this.method_26575(class_7331.field_37462);
   }

   @Override
   public boolean method_26442(Entity var1) {
      return var1.attackEntityFrom(DamageSource.method_28345(this), this.method_25359());
   }

   @Override
   public void method_37123() {
      super.method_37123();
      if (this.field_28350 != null && this.field_28350.method_33089() && !this.method_41215() && this.field_41697 % 100 == 0) {
         this.method_37155(class_463.field_2677, 1.0F, 1.0F);
      }

      this.method_25368();
   }

   private void method_25368() {
      if ((this.method_25365() || this.method_25366()) && this.field_41697 % 5 == 0) {
         this.method_37155(class_463.field_2118, 0.6F + 0.4F * (this.field_41717.nextFloat() - this.field_41717.nextFloat()), 1.0F);
      }

      this.method_25357();
      this.method_25364();
   }

   private void method_25357() {
      this.field_28347 = this.field_28343;
      this.field_28355 = this.field_28351;
      if (!this.method_25365()) {
         this.field_28343 = Math.max(0.0F, this.field_28343 - 0.22F);
         this.field_28351 = Math.max(0.0F, this.field_28351 - 0.13F);
      } else {
         this.field_28343 = Math.min(1.0F, this.field_28343 + 0.15F);
         this.field_28351 = Math.min(1.0F, this.field_28351 + 0.08F);
      }
   }

   private void method_25364() {
      this.field_28357 = this.field_28354;
      if (!this.method_25366()) {
         this.field_28354 = Math.max(0.0F, this.field_28354 - 0.13F);
      } else {
         this.field_28354 = Math.min(1.0F, this.field_28354 + 0.1F);
      }
   }

   public float method_25362(float var1) {
      return class_9299.method_42795(var1, this.field_28347, this.field_28343);
   }

   public float method_25361(float var1) {
      return class_9299.method_42795(var1, this.field_28355, this.field_28351);
   }

   public float method_25367(float var1) {
      return class_9299.method_42795(var1, this.field_28357, this.field_28354);
   }

   public class_5583 method_25369(class_6331 var1, class_1899 var2) {
      class_5583 var5 = EntityType.field_34249.method_30484(var1);
      if (var2 instanceof class_5583) {
         if (!this.field_41717.nextBoolean()) {
            var5.method_25356(((class_5583)var2).method_25353());
         } else {
            var5.method_25356(this.method_25353());
         }

         if (this.method_41215()) {
            var5.method_41218(this.method_41211());
            var5.method_41217(true);
            if (!this.field_41717.nextBoolean()) {
               var5.method_25351(((class_5583)var2).method_25360());
            } else {
               var5.method_25351(this.method_25360());
            }
         }
      }

      return var5;
   }

   @Override
   public boolean method_24873(class_5467 var1) {
      if (this.method_41215()) {
         if (!(var1 instanceof class_5583)) {
            return false;
         } else {
            class_5583 var4 = (class_5583)var1;
            return var4.method_41215() && super.method_24873(var1);
         }
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public class_8733 method_26864(class_1556 var1, class_9589 var2, class_2417 var3, class_8733 var4, CompoundNBT var5) {
      var4 = super.method_26864(var1, var2, var3, var4, var5);
      if (!(var1.method_13576() > 0.9F)) {
         this.method_25356(this.field_41717.nextInt(10));
      } else {
         this.method_25356(this.field_41717.nextInt(11));
      }

      class_6331 var8 = var1.method_7066();
      if (var8 instanceof class_6331 && var8.method_28991().method_9525(this.method_37075(), true, class_5390.field_27515).method_14731()) {
         this.method_25356(10);
         this.method_26883();
      }

      return var4;
   }

   @Override
   public class_6910 method_26857(class_704 var1, Hand var2) {
      ItemStack var5 = var1.method_26617(var2);
      class_2451 var6 = var5.method_27960();
      if (!this.world.field_33055) {
         if (!this.method_41215()) {
            if (this.method_24866(var5)) {
               this.method_24867(var1, var5);
               if (this.field_41717.nextInt(3) != 0) {
                  this.world.method_29587(this, (byte)6);
               } else {
                  this.method_41212(var1);
                  this.method_41208(true);
                  this.world.method_29587(this, (byte)7);
               }

               this.method_26883();
               return class_6910.field_35518;
            }
         } else if (this.method_41206(var1)) {
            if (!(var6 instanceof class_239)) {
               if (var6.method_11247() && this.method_24866(var5) && this.method_26551() < this.method_26465()) {
                  this.method_24867(var1, var5);
                  this.heal((float)var6.method_11227().method_38406());
                  return class_6910.field_35518;
               }

               class_6910 var9 = super.method_26857(var1, var2);
               if (!var9.method_31662() || this.method_26449()) {
                  this.method_41208(!this.method_41216());
               }

               return var9;
            }

            class_9077 var7 = ((class_239)var6).method_1015();
            if (var7 != this.method_25360()) {
               this.method_25351(var7);
               if (!var1.playerAbilities.isCreativeMode) {
                  var5.method_27970(1);
               }

               this.method_26883();
               return class_6910.field_35518;
            }
         }

         class_6910 var8 = super.method_26857(var1, var2);
         if (var8.method_31662()) {
            this.method_26883();
         }

         return var8;
      } else if (this.method_41215() && this.method_41206(var1)) {
         return class_6910.field_35520;
      } else {
         return this.method_24866(var5) && (this.method_26551() < this.method_26465() || !this.method_41215())
            ? class_6910.field_35520
            : class_6910.field_35521;
      }
   }

   @Override
   public boolean method_24866(ItemStack var1) {
      return field_28348.test(var1);
   }

   @Override
   public float method_26425(class_7653 var1, class_6097 var2) {
      return var2.field_31200 * 0.5F;
   }

   @Override
   public boolean method_26911(double var1) {
      return !this.method_41215() && this.field_41697 > 2400;
   }

   @Override
   public void method_41210() {
      if (this.field_28353 == null) {
         this.field_28353 = new class_4204<class_704>(this, class_704.class, 16.0F, 0.8, 1.33);
      }

      this.field_29916.method_3488(this.field_28353);
      if (!this.method_41215()) {
         this.field_29916.method_3485(4, this.field_28353);
      }
   }
}
