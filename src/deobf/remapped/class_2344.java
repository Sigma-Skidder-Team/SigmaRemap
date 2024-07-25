package remapped;

import com.google.common.collect.ImmutableList;
import java.util.function.Function;

public class class_2344<T extends class_5834> extends class_1498<T> implements class_1787, class_8667 {
   private static String[] field_11700;
   public class_1549 field_11696;
   public class_1549 field_11695;
   public class_1549 field_11704;
   public class_1549 field_11705;
   public class_1549 field_11701;
   public class_1549 field_11706;
   public class_1549 field_11703;
   public class_5455 field_11702 = class_5455.field_27806;
   public class_5455 field_11698 = class_5455.field_27806;
   public boolean field_11697;
   public float field_11699;

   public class_2344(float var1) {
      this(class_3581::method_16755, var1, 0.0F, 64, 32);
   }

   public class_2344(float var1, float var2, int var3, int var4) {
      this(class_3581::method_16755, var1, var2, var3, var4);
   }

   public class_2344(Function<Identifier, class_3581> var1, float var2, float var3, int var4, int var5) {
      super(var1, true, 16.0F, 0.0F, 2.0F, 2.0F, 24.0F);
      this.field_49928 = var4;
      this.field_49927 = var5;
      this.field_11696 = new class_1549(this, 0, 0);
      this.field_11696.method_7049(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, var2);
      this.field_11696.method_7046(0.0F, 0.0F + var3, 0.0F);
      this.field_11695 = new class_1549(this, 32, 0);
      this.field_11695.method_7049(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, var2 + 0.5F);
      this.field_11695.method_7046(0.0F, 0.0F + var3, 0.0F);
      this.field_11704 = new class_1549(this, 16, 16);
      this.field_11704.method_7049(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, var2);
      this.field_11704.method_7046(0.0F, 0.0F + var3, 0.0F);
      this.field_11705 = new class_1549(this, 40, 16);
      this.field_11705.method_7049(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, var2);
      this.field_11705.method_7046(-5.0F, 2.0F + var3, 0.0F);
      this.field_11701 = new class_1549(this, 40, 16);
      this.field_11701.field_8197 = true;
      this.field_11701.method_7049(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, var2);
      this.field_11701.method_7046(5.0F, 2.0F + var3, 0.0F);
      this.field_11706 = new class_1549(this, 0, 16);
      this.field_11706.method_7049(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var2);
      this.field_11706.method_7046(-1.9F, 12.0F + var3, 0.0F);
      this.field_11703 = new class_1549(this, 0, 16);
      this.field_11703.field_8197 = true;
      this.field_11703.method_7049(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var2);
      this.field_11703.method_7046(1.9F, 12.0F + var3, 0.0F);
   }

   @Override
   public Iterable<class_1549> method_6903() {
      return ImmutableList.of(this.field_11696);
   }

   @Override
   public Iterable<class_1549> method_6902() {
      return ImmutableList.of(this.field_11704, this.field_11705, this.field_11701, this.field_11706, this.field_11703, this.field_11695);
   }

   public void method_10747(T var1, float var2, float var3, float var4) {
      this.field_11699 = var1.method_26602(var4);
      super.method_29702(var1, var2, var3, var4);
   }

   public void method_10738(T var1, float var2, float var3, float var4, float var5, float var6) {
      boolean var9 = var1.method_26422() > 4;
      boolean var10 = var1.method_37297();
      this.field_11696.field_8190 = var5 * (float) (Math.PI / 180.0);
      if (!var9) {
         if (!(this.field_11699 > 0.0F)) {
            this.field_11696.field_8191 = var6 * (float) (Math.PI / 180.0);
         } else if (!var10) {
            this.field_11696.field_8191 = this.method_10745(this.field_11699, this.field_11696.field_8191, var6 * (float) (Math.PI / 180.0));
         } else {
            this.field_11696.field_8191 = this.method_10745(this.field_11699, this.field_11696.field_8191, (float) (-Math.PI / 4));
         }
      } else {
         this.field_11696.field_8191 = (float) (-Math.PI / 4);
      }

      this.field_11704.field_8190 = 0.0F;
      this.field_11705.field_8187 = 0.0F;
      this.field_11705.field_8183 = -5.0F;
      this.field_11701.field_8187 = 0.0F;
      this.field_11701.field_8183 = 5.0F;
      float var11 = 1.0F;
      if (var9) {
         var11 = (float)var1.method_37098().method_6221();
         var11 /= 0.2F;
         var11 = var11 * var11 * var11;
      }

      if (var11 < 1.0F) {
         var11 = 1.0F;
      }

      this.field_11705.field_8191 = class_9299.method_42840(var2 * 0.6662F + (float) Math.PI) * 2.0F * var3 * 0.5F / var11;
      this.field_11701.field_8191 = class_9299.method_42840(var2 * 0.6662F) * 2.0F * var3 * 0.5F / var11;
      this.field_11705.field_8185 = 0.0F;
      this.field_11701.field_8185 = 0.0F;
      this.field_11706.field_8191 = class_9299.method_42840(var2 * 0.6662F) * 1.4F * var3 / var11;
      this.field_11703.field_8191 = class_9299.method_42840(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3 / var11;
      this.field_11706.field_8190 = 0.0F;
      this.field_11703.field_8190 = 0.0F;
      this.field_11706.field_8185 = 0.0F;
      this.field_11703.field_8185 = 0.0F;
      if (this.field_33203) {
         this.field_11705.field_8191 += (float) (-Math.PI / 5);
         this.field_11701.field_8191 += (float) (-Math.PI / 5);
         this.field_11706.field_8191 = -1.4137167F;
         this.field_11706.field_8190 = (float) (Math.PI / 10);
         this.field_11706.field_8185 = 0.07853982F;
         this.field_11703.field_8191 = -1.4137167F;
         this.field_11703.field_8190 = (float) (-Math.PI / 10);
         this.field_11703.field_8185 = -0.07853982F;
      }

      this.field_11705.field_8190 = 0.0F;
      this.field_11701.field_8190 = 0.0F;
      boolean var12 = var1.method_26432() == class_1736.field_8943;
      boolean var13 = !var12 ? this.field_11698.method_24844() : this.field_11702.method_24844();
      if (var12 == var13) {
         this.method_10737((T)var1);
         this.method_10744((T)var1);
      } else {
         this.method_10744((T)var1);
         this.method_10737((T)var1);
      }

      this.method_10739((T)var1, var4);
      if (!this.field_11697) {
         this.field_11704.field_8191 = 0.0F;
         this.field_11706.field_8187 = 0.1F;
         this.field_11703.field_8187 = 0.1F;
         this.field_11706.field_8181 = 12.0F;
         this.field_11703.field_8181 = 12.0F;
         this.field_11696.field_8181 = 0.0F;
         this.field_11704.field_8181 = 0.0F;
         this.field_11701.field_8181 = 2.0F;
         this.field_11705.field_8181 = 2.0F;
      } else {
         this.field_11704.field_8191 = 0.5F;
         this.field_11705.field_8191 += 0.4F;
         this.field_11701.field_8191 += 0.4F;
         this.field_11706.field_8187 = 4.0F;
         this.field_11703.field_8187 = 4.0F;
         this.field_11706.field_8181 = 12.2F;
         this.field_11703.field_8181 = 12.2F;
         this.field_11696.field_8181 = 4.2F;
         this.field_11704.field_8181 = 3.2F;
         this.field_11701.field_8181 = 5.2F;
         this.field_11705.field_8181 = 5.2F;
      }

      class_3191.method_14687(this.field_11705, this.field_11701, var4);
      if (this.field_11699 > 0.0F) {
         float var14 = var2 % 26.0F;
         class_1736 var15 = this.method_10743((T)var1);
         float var16 = var15 == class_1736.field_8943 && this.field_33202 > 0.0F ? 0.0F : this.field_11699;
         float var17 = var15 == class_1736.field_8940 && this.field_33202 > 0.0F ? 0.0F : this.field_11699;
         if (!(var14 < 14.0F)) {
            if (var14 >= 14.0F && var14 < 22.0F) {
               float var22 = (var14 - 14.0F) / 8.0F;
               this.field_11701.field_8191 = this.method_10745(var17, this.field_11701.field_8191, (float) (Math.PI / 2) * var22);
               this.field_11705.field_8191 = class_9299.method_42795(var16, this.field_11705.field_8191, (float) (Math.PI / 2) * var22);
               this.field_11701.field_8190 = this.method_10745(var17, this.field_11701.field_8190, (float) Math.PI);
               this.field_11705.field_8190 = class_9299.method_42795(var16, this.field_11705.field_8190, (float) Math.PI);
               this.field_11701.field_8185 = this.method_10745(var17, this.field_11701.field_8185, 5.012389F - 1.8707964F * var22);
               this.field_11705.field_8185 = class_9299.method_42795(var16, this.field_11705.field_8185, 1.2707963F + 1.8707964F * var22);
            } else if (var14 >= 22.0F && var14 < 26.0F) {
               float var18 = (var14 - 22.0F) / 4.0F;
               this.field_11701.field_8191 = this.method_10745(var17, this.field_11701.field_8191, (float) (Math.PI / 2) - (float) (Math.PI / 2) * var18);
               this.field_11705.field_8191 = class_9299.method_42795(var16, this.field_11705.field_8191, (float) (Math.PI / 2) - (float) (Math.PI / 2) * var18);
               this.field_11701.field_8190 = this.method_10745(var17, this.field_11701.field_8190, (float) Math.PI);
               this.field_11705.field_8190 = class_9299.method_42795(var16, this.field_11705.field_8190, (float) Math.PI);
               this.field_11701.field_8185 = this.method_10745(var17, this.field_11701.field_8185, (float) Math.PI);
               this.field_11705.field_8185 = class_9299.method_42795(var16, this.field_11705.field_8185, (float) Math.PI);
            }
         } else {
            this.field_11701.field_8191 = this.method_10745(var17, this.field_11701.field_8191, 0.0F);
            this.field_11705.field_8191 = class_9299.method_42795(var16, this.field_11705.field_8191, 0.0F);
            this.field_11701.field_8190 = this.method_10745(var17, this.field_11701.field_8190, (float) Math.PI);
            this.field_11705.field_8190 = class_9299.method_42795(var16, this.field_11705.field_8190, (float) Math.PI);
            this.field_11701.field_8185 = this.method_10745(
               var17, this.field_11701.field_8185, (float) Math.PI + 1.8707964F * this.method_10740(var14) / this.method_10740(14.0F)
            );
            this.field_11705.field_8185 = class_9299.method_42795(
               var16, this.field_11705.field_8185, (float) Math.PI - 1.8707964F * this.method_10740(var14) / this.method_10740(14.0F)
            );
         }

         float var23 = 0.3F;
         float var19 = 0.33333334F;
         this.field_11703.field_8191 = class_9299.method_42795(
            this.field_11699, this.field_11703.field_8191, 0.3F * class_9299.method_42840(var2 * 0.33333334F + (float) Math.PI)
         );
         this.field_11706.field_8191 = class_9299.method_42795(
            this.field_11699, this.field_11706.field_8191, 0.3F * class_9299.method_42840(var2 * 0.33333334F)
         );
      }

      if (var1 instanceof class_8145 && class_1857.field_9416.contains(var1)) {
         this.field_11705.field_8191 = this.field_11705.field_8191 * 0.5F - (float) (Math.PI * 3.0 / 10.0);
         this.field_11705.field_8190 = (float) (-Math.PI / 6);
      }

      this.field_11695.method_7034(this.field_11696);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void method_10737(T var1) {
      switch (this.field_11698) {
         case field_27806:
            this.field_11705.field_8190 = 0.0F;
            break;
         case field_27801:
            this.field_11705.field_8191 = this.field_11705.field_8191 * 0.5F - 0.9424779F;
            this.field_11705.field_8190 = (float) (-Math.PI / 6);
            break;
         case field_27802:
            this.field_11705.field_8191 = this.field_11705.field_8191 * 0.5F - (float) (Math.PI / 10);
            this.field_11705.field_8190 = 0.0F;
            break;
         case field_27807:
            this.field_11705.field_8191 = this.field_11705.field_8191 * 0.5F - (float) Math.PI;
            this.field_11705.field_8190 = 0.0F;
            break;
         case field_27803:
            this.field_11705.field_8190 = -0.1F + this.field_11696.field_8190;
            this.field_11701.field_8190 = 0.1F + this.field_11696.field_8190 + 0.4F;
            this.field_11705.field_8191 = (float) (-Math.PI / 2) + this.field_11696.field_8191;
            this.field_11701.field_8191 = (float) (-Math.PI / 2) + this.field_11696.field_8191;
            break;
         case field_27799:
            class_3191.method_14685(this.field_11705, this.field_11701, var1, true);
            break;
         case field_27804:
            class_3191.method_14689(this.field_11705, this.field_11701, this.field_11696, true);
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void method_10744(T var1) {
      switch (this.field_11702) {
         case field_27806:
            this.field_11701.field_8190 = 0.0F;
            break;
         case field_27801:
            this.field_11701.field_8191 = this.field_11701.field_8191 * 0.5F - 0.9424779F;
            this.field_11701.field_8190 = (float) (Math.PI / 6);
            break;
         case field_27802:
            this.field_11701.field_8191 = this.field_11701.field_8191 * 0.5F - (float) (Math.PI / 10);
            this.field_11701.field_8190 = 0.0F;
            break;
         case field_27807:
            this.field_11701.field_8191 = this.field_11701.field_8191 * 0.5F - (float) Math.PI;
            this.field_11701.field_8190 = 0.0F;
            break;
         case field_27803:
            this.field_11705.field_8190 = -0.1F + this.field_11696.field_8190 - 0.4F;
            this.field_11701.field_8190 = 0.1F + this.field_11696.field_8190;
            this.field_11705.field_8191 = (float) (-Math.PI / 2) + this.field_11696.field_8191;
            this.field_11701.field_8191 = (float) (-Math.PI / 2) + this.field_11696.field_8191;
            break;
         case field_27799:
            class_3191.method_14685(this.field_11705, this.field_11701, var1, false);
            break;
         case field_27804:
            class_3191.method_14689(this.field_11705, this.field_11701, this.field_11696, false);
      }
   }

   public void method_10739(T var1, float var2) {
      if (!(this.field_33202 <= 0.0F)) {
         class_1736 var5 = this.method_10743((T)var1);
         class_1549 var6 = this.method_10746(var5);
         float var7 = this.field_33202;
         this.field_11704.field_8190 = class_9299.method_42818(class_9299.method_42843(var7) * (float) (Math.PI * 2)) * 0.2F;
         if (var5 == class_1736.field_8940) {
            this.field_11704.field_8190 *= -1.0F;
         }

         this.field_11705.field_8187 = class_9299.method_42818(this.field_11704.field_8190) * 5.0F;
         this.field_11705.field_8183 = -class_9299.method_42840(this.field_11704.field_8190) * 5.0F;
         this.field_11701.field_8187 = -class_9299.method_42818(this.field_11704.field_8190) * 5.0F;
         this.field_11701.field_8183 = class_9299.method_42840(this.field_11704.field_8190) * 5.0F;
         this.field_11705.field_8190 = this.field_11705.field_8190 + this.field_11704.field_8190;
         this.field_11701.field_8190 = this.field_11701.field_8190 + this.field_11704.field_8190;
         this.field_11701.field_8191 = this.field_11701.field_8191 + this.field_11704.field_8190;
         var7 = 1.0F - this.field_33202;
         var7 *= var7;
         var7 *= var7;
         var7 = 1.0F - var7;
         float var8 = class_9299.method_42818(var7 * (float) Math.PI);
         float var9 = class_9299.method_42818(this.field_33202 * (float) Math.PI) * -(this.field_11696.field_8191 - 0.7F) * 0.75F;
         var6.field_8191 = (float)((double)var6.field_8191 - ((double)var8 * 1.2 + (double)var9));
         var6.field_8190 = var6.field_8190 + this.field_11704.field_8190 * 2.0F;
         var6.field_8185 = var6.field_8185 + class_9299.method_42818(this.field_33202 * (float) Math.PI) * -0.4F;
      }
   }

   public float method_10745(float var1, float var2, float var3) {
      float var6 = (var3 - var2) % (float) (Math.PI * 2);
      if (var6 < (float) -Math.PI) {
         var6 += (float) (Math.PI * 2);
      }

      if (var6 >= (float) Math.PI) {
         var6 -= (float) (Math.PI * 2);
      }

      return var2 + var1 * var6;
   }

   private float method_10740(float var1) {
      return -65.0F * var1 + var1 * var1;
   }

   public void method_10742(class_2344<T> var1) {
      super.method_29701(var1);
      var1.field_11702 = this.field_11702;
      var1.field_11698 = this.field_11698;
      var1.field_11697 = this.field_11697;
      var1.field_11696.method_7034(this.field_11696);
      var1.field_11695.method_7034(this.field_11695);
      var1.field_11704.method_7034(this.field_11704);
      var1.field_11705.method_7034(this.field_11705);
      var1.field_11701.method_7034(this.field_11701);
      var1.field_11706.method_7034(this.field_11706);
      var1.field_11703.method_7034(this.field_11703);
   }

   public void method_10741(boolean var1) {
      this.field_11696.field_8200 = var1;
      this.field_11695.field_8200 = var1;
      this.field_11704.field_8200 = var1;
      this.field_11705.field_8200 = var1;
      this.field_11701.field_8200 = var1;
      this.field_11706.field_8200 = var1;
      this.field_11703.field_8200 = var1;
   }

   @Override
   public void method_7948(class_1736 var1, class_7966 var2) {
      this.method_10746(var1).method_7057(var2);
   }

   public class_1549 method_10746(class_1736 var1) {
      return var1 != class_1736.field_8940 ? this.field_11705 : this.field_11701;
   }

   @Override
   public class_1549 method_39733() {
      return this.field_11696;
   }

   public class_1736 method_10743(T var1) {
      class_1736 var4 = var1.method_26432();
      return var1.field_29616 != class_2584.field_12791 ? var4.method_7745() : var4;
   }
}
