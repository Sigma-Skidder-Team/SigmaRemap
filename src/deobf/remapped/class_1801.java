package remapped;

import java.util.EnumSet;

public class class_1801<T extends MonsterEntity & class_2354 & class_3832> extends class_3599 {
   private static String[] field_9173;
   public static final class_4376 field_9172 = new class_4376(20, 40);
   private final T field_9179;
   private class_4021 field_9176 = class_4021.field_19513;
   private final double field_9175;
   private final float field_9171;
   private int field_9178;
   private int field_9177;
   private int field_9174;

   public class_1801(T var1, double var2, float var4) {
      this.field_9179 = (T)var1;
      this.field_9175 = var2;
      this.field_9171 = var4 * var4;
      this.method_16800(EnumSet.<Flag>of(Flag.MOVE, Flag.LOOK));
   }

   @Override
   public boolean method_16795() {
      return this.method_8010() && this.method_8009();
   }

   private boolean method_8009() {
      return this.field_9179.method_26443(class_4897.field_25030);
   }

   @Override
   public boolean method_16799() {
      return this.method_8010() && (this.method_16795() || !this.field_9179.method_26927().method_5591()) && this.method_8009();
   }

   private boolean method_8010() {
      return this.field_9179.getAttackTarget() != null && this.field_9179.getAttackTarget().isAlive();
   }

   @Override
   public void method_16793() {
      super.method_16793();
      this.field_9179.method_26891(false);
      this.field_9179.method_26860((LivingEntity)null);
      this.field_9178 = 0;
      if (this.field_9179.method_26554()) {
         this.field_9179.method_26529();
         this.field_9179.method_17810(false);
         class_4380.method_20412(this.field_9179.method_26576(), false);
      }
   }

   @Override
   public void method_16794() {
      LivingEntity var3 = this.field_9179.getAttackTarget();
      if (var3 != null) {
         boolean var4 = this.field_9179.method_26928().method_36736(var3);
         boolean var5 = this.field_9178 > 0;
         if (var4 != var5) {
            this.field_9178 = 0;
         }

         if (!var4) {
            this.field_9178--;
         } else {
            this.field_9178++;
         }

         double var6 = this.field_9179.method_37275(var3);
         boolean var8 = (var6 > (double)this.field_9171 || this.field_9178 < 5) && this.field_9177 == 0;
         if (!var8) {
            this.field_9174 = 0;
            this.field_9179.method_26927().method_5620();
         } else {
            this.field_9174--;
            if (this.field_9174 <= 0) {
               this.field_9179.method_26927().method_5616(var3, !this.method_8008() ? this.field_9175 * 0.5 : this.field_9175);
               this.field_9174 = field_9172.method_20387(this.field_9179.method_26594());
            }
         }

         this.field_9179.method_26865().method_17240(var3, 30.0F, 30.0F);
         if (this.field_9176 != class_4021.field_19513) {
            if (this.field_9176 != class_4021.field_19511) {
               if (this.field_9176 != class_4021.field_19510) {
                  if (this.field_9176 == class_4021.field_19514 && var4) {
                     this.field_9179.method_10805(var3, 1.0F);
                     ItemStack var9 = this.field_9179.method_26617(class_8462.method_38934(this.field_9179, class_4897.field_25030));
                     class_4380.method_20412(var9, false);
                     this.field_9176 = class_4021.field_19513;
                  }
               } else {
                  this.field_9177--;
                  if (this.field_9177 == 0) {
                     this.field_9176 = class_4021.field_19514;
                  }
               }
            } else {
               if (!this.field_9179.method_26554()) {
                  this.field_9176 = class_4021.field_19513;
               }

               int var11 = this.field_9179.method_26613();
               ItemStack var10 = this.field_9179.method_26576();
               if (var11 >= class_4380.method_20403(var10)) {
                  this.field_9179.method_26474();
                  this.field_9176 = class_4021.field_19510;
                  this.field_9177 = 20 + this.field_9179.method_26594().nextInt(20);
                  this.field_9179.method_17810(false);
               }
            }
         } else if (!var8) {
            this.field_9179.method_26462(class_8462.method_38934(this.field_9179, class_4897.field_25030));
            this.field_9176 = class_4021.field_19511;
            this.field_9179.method_17810(true);
         }
      }
   }

   private boolean method_8008() {
      return this.field_9176 == class_4021.field_19513;
   }
}
