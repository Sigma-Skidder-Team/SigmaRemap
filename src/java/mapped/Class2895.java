package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.util.math.MathHelper;

public class Class2895<T extends MobEntity> extends Class2894<T> {
   private static String[] field17927;
   public final Class7219 field17928;
   public final Class7219 field17929;
   private final Class7219 field17930;
   private final Class7219 field17931;
   private final Class7219 field17932;
   private final Class7219 field17933;

   public Class2895(float var1, int var2, int var3) {
      super(var1, false);
      this.field17604 = var2;
      this.field17605 = var3;
      this.field17434 = new Class7219(this, 16, 16);
      this.field17434.method22675(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, var1);
      this.field17432 = new Class7219(this);
      this.field17432.method22671(0, 0).method22675(-5.0F, -8.0F, -4.0F, 10.0F, 8.0F, 8.0F, var1);
      this.field17432.method22671(31, 1).method22675(-2.0F, -4.0F, -5.0F, 4.0F, 4.0F, 1.0F, var1);
      this.field17432.method22671(2, 4).method22675(2.0F, -2.0F, -5.0F, 1.0F, 2.0F, 1.0F, var1);
      this.field17432.method22671(2, 0).method22675(-3.0F, -2.0F, -5.0F, 1.0F, 2.0F, 1.0F, var1);
      this.field17928 = new Class7219(this);
      this.field17928.method22679(4.5F, -6.0F, 0.0F);
      this.field17928.method22671(51, 6).method22675(0.0F, 0.0F, -2.0F, 1.0F, 5.0F, 4.0F, var1);
      this.field17432.method22670(this.field17928);
      this.field17929 = new Class7219(this);
      this.field17929.method22679(-4.5F, -6.0F, 0.0F);
      this.field17929.method22671(39, 6).method22675(-1.0F, 0.0F, -2.0F, 1.0F, 5.0F, 4.0F, var1);
      this.field17432.method22670(this.field17929);
      this.field17433 = new Class7219(this);
      this.field17930 = this.field17434.method22668();
      this.field17931 = this.field17432.method22668();
      this.field17932 = this.field17436.method22668();
      this.field17933 = this.field17436.method22668();
   }

   public void method10998(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.field17434.method22669(this.field17930);
      this.field17432.method22669(this.field17931);
      this.field17436.method22669(this.field17932);
      this.field17435.method22669(this.field17933);
      super.method10998((T)var1, var2, var3, var4, var5, var6);
      float var9 = (float) (Math.PI / 6);
      float var10 = var4 * 0.1F + var2 * 0.5F;
      float var11 = 0.08F + var3 * 0.4F;
      this.field17928.field31037 = (float) (-Math.PI / 6) - MathHelper.cos(var10 * 1.2F) * var11;
      this.field17929.field31037 = (float) (Math.PI / 6) + MathHelper.cos(var10) * var11;
      if (!(var1 instanceof Class1035)) {
         if (var1.getType() == EntityType.field41110) {
            Class7972.method27109(this.field17436, this.field17435, var1.method4307(), this.field17600, var4);
         }
      } else {
         Class1035 var12 = (Class1035)var1;
         Class2172 var13 = var12.method4622();
         if (var13 != Class2172.field14263) {
            if (var13 == Class2172.field14259 && this.field17600 == 0.0F) {
               this.method11211((T)var1);
            } else if (var13 != Class2172.field14260) {
               if (var13 != Class2172.field14261) {
                  if (var13 == Class2172.field14262) {
                     this.field17432.field31035 = 0.5F;
                     this.field17432.field31036 = 0.0F;
                     if (!var1.method4306()) {
                        this.field17436.field31036 = 0.5F;
                        this.field17436.field31035 = -0.9F;
                     } else {
                        this.field17435.field31036 = -0.5F;
                        this.field17435.field31035 = -0.9F;
                     }
                  }
               } else {
                  Class7972.method27106(this.field17435, this.field17436, var1, !var1.method4306());
               }
            } else {
               Class7972.method27105(this.field17435, this.field17436, this.field17432, !var1.method4306());
            }
         } else {
            float var14 = var4 / 60.0F;
            this.field17929.field31037 = (float) (Math.PI / 6) + (float) (Math.PI / 180.0) * MathHelper.sin(var14 * 30.0F) * 10.0F;
            this.field17928.field31037 = (float) (-Math.PI / 6) - (float) (Math.PI / 180.0) * MathHelper.cos(var14 * 30.0F) * 10.0F;
            this.field17432.field31032 = MathHelper.sin(var14 * 10.0F);
            this.field17432.field31033 = MathHelper.sin(var14 * 40.0F) + 0.4F;
            this.field17435.field31037 = (float) (Math.PI / 180.0) * (70.0F + MathHelper.cos(var14 * 40.0F) * 10.0F);
            this.field17436.field31037 = this.field17435.field31037 * -1.0F;
            this.field17435.field31033 = MathHelper.sin(var14 * 40.0F) * 0.5F + 1.5F;
            this.field17436.field31033 = MathHelper.sin(var14 * 40.0F) * 0.5F + 1.5F;
            this.field17434.field31033 = MathHelper.sin(var14 * 40.0F) * 0.35F;
         }
      }

      this.field17921.method22669(this.field17438);
      this.field17922.method22669(this.field17437);
      this.field17919.method22669(this.field17436);
      this.field17920.method22669(this.field17435);
      this.field17923.method22669(this.field17434);
      this.field17433.method22669(this.field17432);
   }

   public void method11005(T var1, float var2) {
      if (this.field17600 > 0.0F && var1 instanceof Class1034 && ((Class1034)var1).method4622() == Class2172.field14259) {
         Class7972.method27107(this.field17435, this.field17436, var1, this.field17600, var2);
      } else {
         super.method11005((T)var1, var2);
      }
   }

   private void method11211(T var1) {
      if (!var1.method4306()) {
         this.field17435.field31035 = -1.8F;
      } else {
         this.field17436.field31035 = -1.8F;
      }
   }
}
