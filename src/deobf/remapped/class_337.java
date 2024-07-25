package remapped;

import java.util.EnumSet;
import java.util.Random;
import javax.annotation.Nullable;

public class class_337 extends class_1173 {
   private static String[] field_1252;
   private static final class_7821<Boolean> field_1257 = class_8073.<Boolean>method_36641(class_337.class, class_2734.field_13347);
   private static final class_7821<Integer> field_1254 = class_8073.<Integer>method_36641(class_337.class, class_2734.field_13366);
   private float field_1253;
   private float field_1256;
   private float field_1255;
   private float field_1250;
   private float field_1259;
   private class_5834 field_1258;
   private int field_1261;
   private boolean field_1251;
   public class_8285 field_1260;

   public class_337(class_6629<? extends class_337> var1, World var2) {
      super(var1, var2);
      this.field_29915 = 10;
      this.method_26895(class_1108.field_6359, 0.0F);
      this.field_29900 = new class_1008(this);
      this.field_1253 = this.field_41717.nextFloat();
      this.field_1256 = this.field_1253;
   }

   @Override
   public void method_26851() {
      class_3537 var3 = new class_3537(this, 1.0);
      this.field_1260 = new class_8285(this, 1.0, 80);
      this.field_29916.method_3485(4, new class_9868(this));
      this.field_29916.method_3485(5, var3);
      this.field_29916.method_3485(7, this.field_1260);
      this.field_29916.method_3485(8, new class_4407(this, class_704.class, 8.0F));
      this.field_29916.method_3485(8, new class_4407(this, class_337.class, 12.0F, 0.01F));
      this.field_29916.method_3485(9, new class_9691(this));
      this.field_1260.method_16800(EnumSet.<class_1891>of(class_1891.field_9564, class_1891.field_9560));
      var3.method_16800(EnumSet.<class_1891>of(class_1891.field_9564, class_1891.field_9560));
      this.field_29908.method_3485(1, new class_4138<class_5834>(this, class_5834.class, 10, true, false, new class_853(this)));
   }

   public static class_1313 method_1544() {
      return class_1173.method_5201()
         .method_5984(class_7331.field_37462, 6.0)
         .method_5984(class_7331.field_37465, 0.5)
         .method_5984(class_7331.field_37471, 16.0)
         .method_5984(class_7331.field_37468, 30.0);
   }

   @Override
   public class_1249 method_26933(World var1) {
      return new class_9811(this, var1);
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.field_41735.method_36634(field_1257, false);
      this.field_41735.method_36634(field_1254, 0);
   }

   @Override
   public boolean method_26509() {
      return true;
   }

   @Override
   public class_2780 method_26550() {
      return class_2780.field_13578;
   }

   public boolean method_1553() {
      return this.field_41735.<Boolean>method_36640(field_1257);
   }

   private void method_1543(boolean var1) {
      this.field_41735.method_36633(field_1257, var1);
   }

   public int method_1548() {
      return 80;
   }

   private void method_1545(int var1) {
      this.field_41735.method_36633(field_1254, var1);
   }

   public boolean method_1555() {
      return this.field_41735.<Integer>method_36640(field_1254) != 0;
   }

   @Nullable
   public class_5834 method_1552() {
      if (this.method_1555()) {
         if (!this.world.field_33055) {
            return this.method_17809();
         } else if (this.field_1258 == null) {
            Entity var3 = this.world.method_29534(this.field_41735.<Integer>method_36640(field_1254));
            if (!(var3 instanceof class_5834)) {
               return null;
            } else {
               this.field_1258 = (class_5834)var3;
               return this.field_1258;
            }
         } else {
            return this.field_1258;
         }
      } else {
         return null;
      }
   }

   @Override
   public void method_37191(class_7821<?> var1) {
      super.method_37191(var1);
      if (field_1254.equals(var1)) {
         this.field_1261 = 0;
         this.field_1258 = null;
      }
   }

   @Override
   public int method_26850() {
      return 160;
   }

   @Override
   public class_8461 method_26918() {
      return !this.method_37134() ? class_463.field_2269 : class_463.field_2203;
   }

   @Override
   public class_8461 method_26541(DamageSource var1) {
      return !this.method_37134() ? class_463.field_2370 : class_463.field_2899;
   }

   @Override
   public class_8461 method_26599() {
      return !this.method_37134() ? class_463.field_2558 : class_463.field_1941;
   }

   @Override
   public boolean method_37126() {
      return false;
   }

   @Override
   public float method_26425(class_7653 var1, class_6097 var2) {
      return var2.field_31200 * 0.5F;
   }

   @Override
   public float method_21376(BlockPos var1, class_4924 var2) {
      return !var2.method_28258(var1).method_22007(class_6503.field_33094) ? super.method_21376(var1, var2) : 10.0F + var2.method_22566(var1) - 0.5F;
   }

   @Override
   public void method_26606() {
      if (this.method_37330()) {
         if (this.world.field_33055) {
            this.field_1256 = this.field_1253;
            if (this.method_37285()) {
               if (!this.method_1553()) {
                  this.field_1255 = this.field_1255 + (0.125F - this.field_1255) * 0.2F;
               } else if (!(this.field_1255 < 0.5F)) {
                  this.field_1255 = this.field_1255 + (0.5F - this.field_1255) * 0.1F;
               } else {
                  this.field_1255 = 4.0F;
               }
            } else {
               this.field_1255 = 2.0F;
               class_1343 var3 = this.method_37098();
               if (var3.field_7333 > 0.0 && this.field_1251 && !this.method_37378()) {
                  this.world
                     .method_29527(this.getPosX(), this.method_37309(), this.getPosZ(), this.method_1554(), this.method_37197(), 1.0F, 1.0F, false);
               }

               this.field_1251 = var3.field_7333 < 0.0 && this.world.method_29518(this.method_37075().method_6100(), this);
            }

            this.field_1253 = this.field_1253 + this.field_1255;
            this.field_1259 = this.field_1250;
            if (this.method_37134()) {
               if (!this.method_1553()) {
                  this.field_1250 = this.field_1250 + (1.0F - this.field_1250) * 0.06F;
               } else {
                  this.field_1250 = this.field_1250 + (0.0F - this.field_1250) * 0.25F;
               }
            } else {
               this.field_1250 = this.field_41717.nextFloat();
            }

            if (this.method_1553() && this.method_37285()) {
               class_1343 var17 = this.method_37307(0.0F);

               for (int var4 = 0; var4 < 2; var4++) {
                  this.world
                     .method_43361(
                        class_3090.field_15340,
                        this.method_37361(0.5) - var17.field_7336 * 1.5,
                        this.method_37255() - var17.field_7333 * 1.5,
                        this.method_37383(0.5) - var17.field_7334 * 1.5,
                        0.0,
                        0.0,
                        0.0
                     );
               }
            }

            if (this.method_1555()) {
               if (this.field_1261 < this.method_1548()) {
                  this.field_1261++;
               }

               class_5834 var18 = this.method_1552();
               if (var18 != null) {
                  this.method_26865().method_17240(var18, 90.0F, 90.0F);
                  this.method_26865().method_17234();
                  double var5 = (double)this.method_1546(0.0F);
                  double var7 = var18.getPosX() - this.getPosX();
                  double var9 = var18.method_37080(0.5) - this.method_37388();
                  double var11 = var18.getPosZ() - this.getPosZ();
                  double var13 = Math.sqrt(var7 * var7 + var9 * var9 + var11 * var11);
                  var7 /= var13;
                  var9 /= var13;
                  var11 /= var13;
                  double var15 = this.field_41717.nextDouble();

                  while (var15 < var13) {
                     var15 += 1.8 - var5 + this.field_41717.nextDouble() * (1.7 - var5);
                     this.world
                        .method_43361(
                           class_3090.field_15340,
                           this.getPosX() + var7 * var15,
                           this.method_37388() + var9 * var15,
                           this.getPosZ() + var11 * var15,
                           0.0,
                           0.0,
                           0.0
                        );
                  }
               }
            }
         }

         if (!this.method_37134()) {
            if (this.onGround) {
               this.method_37215(
                  this.method_37098()
                     .method_6214(
                        (double)((this.field_41717.nextFloat() * 2.0F - 1.0F) * 0.4F), 0.5, (double)((this.field_41717.nextFloat() * 2.0F - 1.0F) * 0.4F)
                     )
               );
               this.rotationYaw = this.field_41717.nextFloat() * 360.0F;
               this.onGround = false;
               this.field_41763 = true;
            }
         } else {
            this.method_37192(300);
         }

         if (this.method_1555()) {
            this.rotationYaw = this.field_29618;
         }
      }

      super.method_26606();
   }

   public class_8461 method_1554() {
      return class_463.field_2546;
   }

   public float method_1547(float var1) {
      return class_9299.method_42795(var1, this.field_1256, this.field_1253);
   }

   public float method_1549(float var1) {
      return class_9299.method_42795(var1, this.field_1259, this.field_1250);
   }

   public float method_1546(float var1) {
      return ((float)this.field_1261 + var1) / (float)this.method_1548();
   }

   @Override
   public boolean method_26855(class_4924 var1) {
      return var1.method_6677(this);
   }

   public static boolean method_1551(class_6629<? extends class_337> var0, class_9379 var1, class_2417 var2, BlockPos var3, Random var4) {
      return (var4.nextInt(20) == 0 || !var1.method_22568(var3))
         && var1.method_43370() != class_423.field_1790
         && (var2 == class_2417.field_12024 || var1.method_28258(var3).method_22007(class_6503.field_33094));
   }

   @Override
   public boolean attackEntityFrom(DamageSource var1, float var2) {
      if (!this.method_1553() && !var1.method_28352() && var1.method_28353() instanceof class_5834) {
         class_5834 var5 = (class_5834)var1.method_28353();
         if (!var1.method_28367()) {
            var5.attackEntityFrom(DamageSource.method_28364(this), 2.0F);
         }
      }

      if (this.field_1260 != null) {
         this.field_1260.method_38234();
      }

      return super.attackEntityFrom(var1, var2);
   }

   @Override
   public int method_26862() {
      return 180;
   }

   @Override
   public void method_26431(class_1343 var1) {
      if (this.method_26530() && this.method_37285()) {
         this.method_37092(0.1F, var1);
         this.method_37226(class_7412.field_37839, this.method_37098());
         this.method_37215(this.method_37098().method_6209(0.9));
         if (!this.method_1553() && this.method_17809() == null) {
            this.method_37215(this.method_37098().method_6214(0.0, -0.005, 0.0));
         }
      } else {
         super.method_26431(var1);
      }
   }
}
