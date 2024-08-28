package mapped;

import com.google.common.collect.Lists;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class Class959 extends Class944 implements Class935 {
   private static final Block[] field5381 = new Block[]{Blocks.field36767, Blocks.field36768, Blocks.field36776, Blocks.field36769};
   public int field5382;
   private float field5383;
   private boolean field5384;
   private boolean field5385;
   private final List<BlockPos> field5386 = Lists.newArrayList();
   private Class880 field5387;
   private UUID field5388;
   private long field5389;

   public Class959() {
      this(Class4387.field21445);
   }

   public Class959(Class4387<?> var1) {
      super(var1);
   }

   @Override
   public void method3645(Class7380 var1, Class39 var2) {
      super.method3645(var1, var2);
      if (!var2.method106("Target")) {
         this.field5388 = null;
      } else {
         this.field5388 = var2.method105("Target");
      }
   }

   @Override
   public Class39 method3646(Class39 var1) {
      super.method3646(var1);
      if (this.field5387 != null) {
         var1.method104("Target", this.field5387.getUniqueID());
      }

      return var1;
   }

   @Nullable
   @Override
   public Class5610 method3776() {
      return new Class5610(this.field5325, 5, this.method3777());
   }

   @Override
   public Class39 method3777() {
      return this.method3646(new Class39());
   }

   @Override
   public void method3647() {
      this.field5382++;
      long var3 = this.field5324.method6783();
      if (var3 % 40L == 0L) {
         this.method3905(this.method3896());
         if (!this.field5324.field9020 && this.method3903()) {
            this.method3897();
            this.method3898();
         }
      }

      if (var3 % 80L == 0L && this.method3903()) {
         this.method3908(Class6067.field26468);
      }

      if (var3 > this.field5389 && this.method3903()) {
         this.field5389 = var3 + 60L + (long)this.field5324.method6814().nextInt(40);
         this.method3908(Class6067.field26469);
      }

      if (this.field5324.field9020) {
         this.method3899();
         this.method3902();
         if (this.method3903()) {
            this.field5383++;
         }
      }
   }

   private boolean method3896() {
      this.field5386.clear();

      for (int var3 = -1; var3 <= 1; var3++) {
         for (int var4 = -1; var4 <= 1; var4++) {
            for (int var5 = -1; var5 <= 1; var5++) {
               BlockPos var6 = this.field5325.method8336(var3, var4, var5);
               if (!this.field5324.method7013(var6)) {
                  return false;
               }
            }
         }
      }

      for (int var15 = -2; var15 <= 2; var15++) {
         for (int var16 = -2; var16 <= 2; var16++) {
            for (int var17 = -2; var17 <= 2; var17++) {
               int var18 = Math.abs(var15);
               int var7 = Math.abs(var16);
               int var8 = Math.abs(var17);
               if ((var18 > 1 || var7 > 1 || var8 > 1)
                  && (var15 == 0 && (var7 == 2 || var8 == 2) || var16 == 0 && (var18 == 2 || var8 == 2) || var17 == 0 && (var18 == 2 || var7 == 2))) {
                  BlockPos var9 = this.field5325.method8336(var15, var16, var17);
                  Class7380 var10 = this.field5324.method6738(var9);

                  for (Block var14 : field5381) {
                     if (var10.method23448(var14)) {
                        this.field5386.add(var9);
                     }
                  }
               }
            }
         }
      }

      this.method3906(this.field5386.size() >= 42);
      return this.field5386.size() >= 16;
   }

   private void method3897() {
      int var3 = this.field5386.size();
      int var4 = var3 / 7 * 16;
      int var5 = this.field5325.method8304();
      int var6 = this.field5325.getY();
      int var7 = this.field5325.method8306();
      Class6488 var8 = new Class6488((double)var5, (double)var6, (double)var7, (double)(var5 + 1), (double)(var6 + 1), (double)(var7 + 1))
         .method19664((double)var4)
         .method19662(0.0, (double)this.field5324.method7034(), 0.0);
      List<PlayerEntity> var9 = this.field5324.<PlayerEntity>method7182(PlayerEntity.class, var8);
      if (!var9.isEmpty()) {
         for (PlayerEntity var11 : var9) {
            if (this.field5325.method8316(var11.method3432(), (double)var4) && var11.method3253()) {
               var11.method3035(new Class2023(Class8254.field35495, 260, 0, true, true));
            }
         }
      }
   }

   private void method3898() {
      Class880 var3 = this.field5387;
      int var4 = this.field5386.size();
      if (var4 >= 42) {
         if (this.field5387 == null && this.field5388 != null) {
            this.field5387 = this.method3901();
            this.field5388 = null;
         } else if (this.field5387 != null) {
            if (!this.field5387.method3066() || !this.field5325.method8316(this.field5387.method3432(), 8.0)) {
               this.field5387 = null;
            }
         } else {
            List var5 = this.field5324.<Class880>method6772(Class880.class, this.method3900(), var0 -> var0 instanceof Class1008 && var0.method3253());
            if (!var5.isEmpty()) {
               this.field5387 = (Class880)var5.get(this.field5324.field9016.nextInt(var5.size()));
            }
         }
      } else {
         this.field5387 = null;
      }

      if (this.field5387 != null) {
         this.field5324
            .method6743(
               (PlayerEntity)null,
               this.field5387.getPosX(),
               this.field5387.getPosY(),
               this.field5387.getPosZ(),
               Class6067.field26470,
               Class2266.field14732,
               1.0F,
               1.0F
            );
         this.field5387.method2741(Class8654.field39006, 4.0F);
      }

      if (var3 != this.field5387) {
         Class7380 var6 = this.method3775();
         this.field5324.method6731(this.field5325, var6, var6, 2);
      }
   }

   private void method3899() {
      if (this.field5388 != null) {
         if (this.field5387 == null || !this.field5387.getUniqueID().equals(this.field5388)) {
            this.field5387 = this.method3901();
            if (this.field5387 == null) {
               this.field5388 = null;
            }
         }
      } else {
         this.field5387 = null;
      }
   }

   private Class6488 method3900() {
      int var3 = this.field5325.method8304();
      int var4 = this.field5325.getY();
      int var5 = this.field5325.method8306();
      return new Class6488((double)var3, (double)var4, (double)var5, (double)(var3 + 1), (double)(var4 + 1), (double)(var5 + 1)).method19664(8.0);
   }

   @Nullable
   private Class880 method3901() {
      List var3 = this.field5324.<Class880>method6772(Class880.class, this.method3900(), var1 -> var1.getUniqueID().equals(this.field5388));
      return var3.size() != 1 ? null : (Class880)var3.get(0);
   }

   private void method3902() {
      Random var3 = this.field5324.field9016;
      double var4 = (double)(MathHelper.method37763((float)(this.field5382 + 35) * 0.1F) / 2.0F + 0.5F);
      var4 = (var4 * var4 + var4) * 0.3F;
      Vector3d var6 = new Vector3d(
         (double)this.field5325.method8304() + 0.5, (double)this.field5325.getY() + 1.5 + var4, (double)this.field5325.method8306() + 0.5
      );

      for (BlockPos var8 : this.field5386) {
         if (var3.nextInt(50) == 0) {
            float var9 = -0.5F + var3.nextFloat();
            float var10 = -2.0F + var3.nextFloat();
            float var11 = -0.5F + var3.nextFloat();
            BlockPos var12 = var8.method8338(this.field5325);
            Vector3d var13 = new Vector3d((double)var9, (double)var10, (double)var11)
               .method11339((double)var12.method8304(), (double)var12.getY(), (double)var12.method8306());
            this.field5324
               .method6746(Class7940.field34104, var6.field18048, var6.field18049, var6.field18050, var13.field18048, var13.field18049, var13.field18050);
         }
      }

      if (this.field5387 != null) {
         Vector3d var15 = new Vector3d(this.field5387.getPosX(), this.field5387.method3442(), this.field5387.getPosZ());
         float var16 = (-0.5F + var3.nextFloat()) * (3.0F + this.field5387.method3429());
         float var17 = -1.0F + var3.nextFloat() * this.field5387.method3430();
         float var18 = (-0.5F + var3.nextFloat()) * (3.0F + this.field5387.method3429());
         Vector3d var19 = new Vector3d((double)var16, (double)var17, (double)var18);
         this.field5324
            .method6746(Class7940.field34104, var15.field18048, var15.field18049, var15.field18050, var19.field18048, var19.field18049, var19.field18050);
      }
   }

   public boolean method3903() {
      return this.field5384;
   }

   public boolean method3904() {
      return this.field5385;
   }

   private void method3905(boolean var1) {
      if (var1 != this.field5384) {
         this.method3908(!var1 ? Class6067.field26471 : Class6067.field26467);
      }

      this.field5384 = var1;
   }

   private void method3906(boolean var1) {
      this.field5385 = var1;
   }

   public float method3907(float var1) {
      return (this.field5383 + var1) * -0.0375F;
   }

   public void method3908(Class9455 var1) {
      this.field5324.method6742((PlayerEntity)null, this.field5325, var1, Class2266.field14732, 1.0F, 1.0F);
   }
}