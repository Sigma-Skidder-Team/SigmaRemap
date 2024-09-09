package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Items;

import java.util.EnumSet;

public class Class2758<T extends Class1009 & Class1022> extends Class2595 {
   private static String[] field17303;
   private final T field17304;
   private final double field17305;
   private int field17306;
   private final float field17307;
   private int field17308 = -1;
   private int field17309;
   private boolean field17310;
   private boolean field17311;
   private int field17312 = -1;

   public Class2758(T var1, double var2, int var4, float var5) {
      this.field17304 = (T)var1;
      this.field17305 = var2;
      this.field17306 = var4;
      this.field17307 = var5 * var5;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14657, Class2240.field14658));
   }

   public void method10961(int var1) {
      this.field17306 = var1;
   }

   @Override
   public boolean method10803() {
      return this.field17304.method4232() != null ? this.method10962() : false;
   }

   public boolean method10962() {
      return this.field17304.method3092(Items.BOW);
   }

   @Override
   public boolean method10806() {
      return (this.method10803() || !this.field17304.method4230().method21664()) && this.method10962();
   }

   @Override
   public void method10804() {
      super.method10804();
      this.field17304.method4304(true);
   }

   @Override
   public void method10807() {
      super.method10807();
      this.field17304.method4304(false);
      this.field17309 = 0;
      this.field17308 = -1;
      this.field17304.resetActiveHand();
   }

   @Override
   public void method10805() {
      LivingEntity var3 = this.field17304.method4232();
      if (var3 != null) {
         double var4 = this.field17304.getDistanceNearest(var3.getPosX(), var3.getPosY(), var3.getPosZ());
         boolean var6 = this.field17304.method4231().method35460(var3);
         boolean var7 = this.field17309 > 0;
         if (var6 != var7) {
            this.field17309 = 0;
         }

         if (!var6) {
            this.field17309--;
         } else {
            this.field17309++;
         }

         if (!(var4 > (double)this.field17307) && this.field17309 >= 20) {
            this.field17304.method4230().method21666();
            this.field17312++;
         } else {
            this.field17304.method4230().method21655(var3, this.field17305);
            this.field17312 = -1;
         }

         if (this.field17312 >= 20) {
            if ((double)this.field17304.getRNG().nextFloat() < 0.3) {
               this.field17310 = !this.field17310;
            }

            if ((double)this.field17304.getRNG().nextFloat() < 0.3) {
               this.field17311 = !this.field17311;
            }

            this.field17312 = 0;
         }

         if (this.field17312 <= -1) {
            this.field17304.method4227().method28040(var3, 30.0F, 30.0F);
         } else {
            if (!(var4 > (double)(this.field17307 * 0.75F))) {
               if (var4 < (double)(this.field17307 * 0.25F)) {
                  this.field17311 = true;
               }
            } else {
               this.field17311 = false;
            }

            this.field17304.method4228().method20814(!this.field17311 ? 0.5F : -0.5F, !this.field17310 ? -0.5F : 0.5F);
            this.field17304.method4262(var3, 30.0F, 30.0F);
         }

         if (!this.field17304.isHandActive()) {
            if (--this.field17308 <= 0 && this.field17309 >= -60) {
               this.field17304.setActiveHand(Class9456.method36389(this.field17304, Items.BOW));
            }
         } else if (!var6 && this.field17309 < -60) {
            this.field17304.resetActiveHand();
         } else if (var6) {
            int var8 = this.field17304.getItemInUseMaxCount();
            if (var8 >= 20) {
               this.field17304.resetActiveHand();
               this.field17304.method4530(var3, BowItem.method11777(var8));
               this.field17308 = this.field17306;
            }
         }
      }
   }
}
