package mapped;

import javax.annotation.Nullable;
import java.util.UUID;

public abstract class Class882 extends Entity {
   private UUID field5093;
   private int field5094;
   private boolean field5095;

   public Class882(Class8992<? extends Class882> var1, World var2) {
      super(var1, var2);
   }

   public void method3459(Entity var1) {
      if (var1 != null) {
         this.field5093 = var1.getUniqueID();
         this.field5094 = var1.method3205();
      }
   }

   @Nullable
   public Entity method3460() {
      if (this.field5093 != null && this.field5024 instanceof ServerWorld) {
         return ((ServerWorld)this.field5024).method6942(this.field5093);
      } else {
         return this.field5094 == 0 ? null : this.field5024.method6774(this.field5094);
      }
   }

   @Override
   public void method2724(Class39 var1) {
      if (this.field5093 != null) {
         var1.method104("Owner", this.field5093);
      }

      if (this.field5095) {
         var1.method115("LeftOwner", true);
      }
   }

   @Override
   public void method2723(Class39 var1) {
      if (var1.method106("Owner")) {
         this.field5093 = var1.method105("Owner");
      }

      this.field5095 = var1.method132("LeftOwner");
   }

   @Override
   public void tick() {
      if (!this.field5095) {
         this.field5095 = this.method3461();
      }

      super.tick();
   }

   private boolean method3461() {
      Entity var3 = this.method3460();
      if (var3 != null) {
         for (Entity var5 : this.field5024
            .method6770(this, this.method3389().method19661(this.method3433()).method19664(1.0), var0 -> !var0.method2800() && var0.method3139())) {
            if (var5.method3415() == var3.method3415()) {
               return false;
            }
         }
      }

      return true;
   }

   public void method3462(double var1, double var3, double var5, float var7, float var8) {
      Vector3d var11 = new Vector3d(var1, var3, var5)
         .method11333()
         .method11339(
            this.field5054.nextGaussian() * 0.0075F * (double)var8,
            this.field5054.nextGaussian() * 0.0075F * (double)var8,
            this.field5054.nextGaussian() * 0.0075F * (double)var8
         )
         .method11344((double)var7);
      this.method3434(var11);
      float var12 = MathHelper.method37766(method3234(var11));
      this.field5031 = (float)(MathHelper.method37814(var11.field18048, var11.field18050) * 180.0F / (float)Math.PI);
      this.field5032 = (float)(MathHelper.method37814(var11.field18049, (double)var12) * 180.0F / (float)Math.PI);
      this.field5033 = this.field5031;
      this.field5034 = this.field5032;
   }

   public void method3463(Entity var1, float var2, float var3, float var4, float var5, float var6) {
      float var9 = -MathHelper.method37763(var3 * (float) (Math.PI / 180.0)) * MathHelper.method37764(var2 * (float) (Math.PI / 180.0));
      float var10 = -MathHelper.method37763((var2 + var4) * (float) (Math.PI / 180.0));
      float var11 = MathHelper.method37764(var3 * (float) (Math.PI / 180.0)) * MathHelper.method37764(var2 * (float) (Math.PI / 180.0));
      this.method3462((double)var9, (double)var10, (double)var11, var5, var6);
      Vector3d var12 = var1.method3433();
      this.method3434(this.method3433().method11339(var12.field18048, !var1.method3226() ? var12.field18049 : 0.0, var12.field18050));
   }

   public void method3464(Class8710 var1) {
      Class2100 var4 = var1.method31417();
      if (var4 != Class2100.field13691) {
         if (var4 == Class2100.field13690) {
            this.method3466((Class8711)var1);
         }
      } else {
         this.method3465((Class8709)var1);
      }
   }

   public void method3465(Class8709 var1) {
   }

   public void method3466(Class8711 var1) {
      Class7380 var4 = this.field5024.method6738(var1.method31423());
      var4.method23453(this.field5024, var4, var1, this);
   }

   @Override
   public void method3325(double var1, double var3, double var5) {
      this.method3435(var1, var3, var5);
      if (this.field5034 == 0.0F && this.field5033 == 0.0F) {
         float var9 = MathHelper.method37766(var1 * var1 + var5 * var5);
         this.field5032 = (float)(MathHelper.method37814(var3, (double)var9) * 180.0F / (float)Math.PI);
         this.field5031 = (float)(MathHelper.method37814(var1, var5) * 180.0F / (float)Math.PI);
         this.field5034 = this.field5032;
         this.field5033 = this.field5031;
         this.method3273(this.getPosX(), this.getPosY(), this.getPosZ(), this.field5031, this.field5032);
      }
   }

   public boolean method3467(Entity var1) {
      if (!var1.method2800() && var1.method3066() && var1.method3139()) {
         Entity var4 = this.method3460();
         return var4 == null || this.field5095 || !var4.method3416(var1);
      } else {
         return false;
      }
   }

   public void method3468() {
      Vector3d var3 = this.method3433();
      float var4 = MathHelper.method37766(method3234(var3));
      this.field5032 = method3469(this.field5034, (float)(MathHelper.method37814(var3.field18049, (double)var4) * 180.0F / (float)Math.PI));
      this.field5031 = method3469(this.field5033, (float)(MathHelper.method37814(var3.field18048, var3.field18050) * 180.0F / (float)Math.PI));
   }

   public static float method3469(float var0, float var1) {
      while (var1 - var0 < -180.0F) {
         var0 -= 360.0F;
      }

      while (var1 - var0 >= 180.0F) {
         var0 += 360.0F;
      }

      return MathHelper.method37821(0.2F, var0, var1);
   }
}
