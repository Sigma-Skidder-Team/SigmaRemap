package mapped;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.UUID;

public class Class905 extends Class882 {
   private Entity field5163;
   private Direction field5164;
   private int field5165;
   private double field5166;
   private double field5167;
   private double field5168;
   private UUID field5169;

   public Class905(Class8992<? extends Class905> var1, World var2) {
      super(var1, var2);
      this.field5052 = true;
   }

   public Class905(World var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this(Class8992.field41076, var1);
      this.method3273(var2, var4, var6, this.field5031, this.field5032);
      this.method3435(var8, var10, var12);
   }

   public Class905(World var1, Class880 var2, Entity var3, Class113 var4) {
      this(Class8992.field41076, var1);
      this.method3459(var2);
      BlockPos var7 = var2.method3432();
      double var8 = (double)var7.method8304() + 0.5;
      double var10 = (double)var7.getY() + 0.5;
      double var12 = (double)var7.method8306() + 0.5;
      this.method3273(var8, var10, var12, this.field5031, this.field5032);
      this.field5163 = var3;
      this.field5164 = Direction.field673;
      this.method3548(var4);
   }

   @Override
   public Class2266 method2864() {
      return Class2266.field14733;
   }

   @Override
   public void method2724(Class39 var1) {
      super.method2724(var1);
      if (this.field5163 != null) {
         var1.method104("Target", this.field5163.getUniqueID());
      }

      if (this.field5164 != null) {
         var1.method102("Dir", this.field5164.method533());
      }

      var1.method102("Steps", this.field5165);
      var1.method108("TXD", this.field5166);
      var1.method108("TYD", this.field5167);
      var1.method108("TZD", this.field5168);
   }

   @Override
   public void method2723(Class39 var1) {
      super.method2723(var1);
      this.field5165 = var1.method122("Steps");
      this.field5166 = var1.method125("TXD");
      this.field5167 = var1.method125("TYD");
      this.field5168 = var1.method125("TZD");
      if (var1.method119("Dir", 99)) {
         this.field5164 = Direction.method546(var1.method122("Dir"));
      }

      if (var1.method106("Target")) {
         this.field5169 = var1.method105("Target");
      }
   }

   @Override
   public void method2850() {
   }

   private void method3547(Direction var1) {
      this.field5164 = var1;
   }

   private void method3548(Class113 var1) {
      double var4 = 0.5;
      BlockPos var6;
      if (this.field5163 != null) {
         var4 = (double)this.field5163.method3430() * 0.5;
         var6 = new BlockPos(this.field5163.getPosX(), this.field5163.getPosY() + var4, this.field5163.getPosZ());
      } else {
         var6 = this.method3432().method8313();
      }

      double var7 = (double)var6.method8304() + 0.5;
      double var9 = (double)var6.getY() + var4;
      double var11 = (double)var6.method8306() + 0.5;
      Direction var13 = null;
      if (!var6.method8317(this.getPositionVec(), 2.0)) {
         BlockPos var22 = this.method3432();
         ArrayList var23 = Lists.newArrayList();
         if (var1 != Class113.field413) {
            if (var22.method8304() < var6.method8304() && this.field5024.method7007(var22.method8347())) {
               var23.add(Direction.EAST);
            } else if (var22.method8304() > var6.method8304() && this.field5024.method7007(var22.method8345())) {
               var23.add(Direction.WEST);
            }
         }

         if (var1 != Class113.field414) {
            if (var22.getY() < var6.getY() && this.field5024.method7007(var22.method8311())) {
               var23.add(Direction.field673);
            } else if (var22.getY() > var6.getY() && this.field5024.method7007(var22.method8313())) {
               var23.add(Direction.field672);
            }
         }

         if (var1 != Class113.field415) {
            if (var22.method8306() < var6.method8306() && this.field5024.method7007(var22.method8343())) {
               var23.add(Direction.SOUTH);
            } else if (var22.method8306() > var6.method8306() && this.field5024.method7007(var22.method8341())) {
               var23.add(Direction.NORTH);
            }
         }

         var13 = Direction.method552(this.field5054);
         if (!var23.isEmpty()) {
            var13 = (Direction)var23.get(this.field5054.nextInt(var23.size()));
         } else {
            for (int var24 = 5; !this.field5024.method7007(var22.method8349(var13)) && var24 > 0; var24--) {
               var13 = Direction.method552(this.field5054);
            }
         }

         var7 = this.getPosX() + (double)var13.method539();
         var9 = this.getPosY() + (double)var13.method540();
         var11 = this.getPosZ() + (double)var13.method541();
      }

      this.method3547(var13);
      double var14 = var7 - this.getPosX();
      double var16 = var9 - this.getPosY();
      double var18 = var11 - this.getPosZ();
      double var20 = (double) MathHelper.method37766(var14 * var14 + var16 * var16 + var18 * var18);
      if (var20 != 0.0) {
         this.field5166 = var14 / var20 * 0.15;
         this.field5167 = var16 / var20 * 0.15;
         this.field5168 = var18 / var20 * 0.15;
      } else {
         this.field5166 = 0.0;
         this.field5167 = 0.0;
         this.field5168 = 0.0;
      }

      this.field5078 = true;
      this.field5165 = 10 + this.field5054.nextInt(5) * 10;
   }

   @Override
   public void method3447() {
      if (this.field5024.method6997() == Class2197.field14351) {
         this.method2904();
      }
   }

   @Override
   public void tick() {
      super.tick();
      if (!this.field5024.field9020) {
         if (this.field5163 == null && this.field5169 != null) {
            this.field5163 = ((ServerWorld)this.field5024).method6942(this.field5169);
            if (this.field5163 == null) {
               this.field5169 = null;
            }
         }

         if (this.field5163 == null || !this.field5163.method3066() || this.field5163 instanceof PlayerEntity && ((PlayerEntity)this.field5163).method2800()) {
            if (!this.method3247()) {
               this.method3434(this.method3433().method11339(0.0, -0.04, 0.0));
            }
         } else {
            this.field5166 = MathHelper.method37778(this.field5166 * 1.025, -1.0, 1.0);
            this.field5167 = MathHelper.method37778(this.field5167 * 1.025, -1.0, 1.0);
            this.field5168 = MathHelper.method37778(this.field5168 * 1.025, -1.0, 1.0);
            Vector3d var3 = this.method3433();
            this.method3434(
               var3.method11339((this.field5166 - var3.field18048) * 0.2, (this.field5167 - var3.field18049) * 0.2, (this.field5168 - var3.field18050) * 0.2)
            );
         }

         Class8710 var7 = Class9456.method36385(this, this::method3467);
         if (var7.method31417() != Class2100.field13689) {
            this.method3464(var7);
         }
      }

      this.method3240();
      Vector3d var8 = this.method3433();
      this.method3215(this.getPosX() + var8.field18048, this.getPosY() + var8.field18049, this.getPosZ() + var8.field18050);
      Class9456.method36388(this, 0.5F);
      if (!this.field5024.field9020) {
         if (this.field5163 != null && !this.field5163.field5041) {
            if (this.field5165 > 0) {
               this.field5165--;
               if (this.field5165 == 0) {
                  this.method3548(this.field5164 != null ? this.field5164.method544() : null);
               }
            }

            if (this.field5164 != null) {
               BlockPos var4 = this.method3432();
               Class113 var5 = this.field5164.method544();
               if (!this.field5024.method6765(var4.method8349(this.field5164), this)) {
                  BlockPos var6 = this.field5163.method3432();
                  if (var5 == Class113.field413 && var4.method8304() == var6.method8304()
                     || var5 == Class113.field415 && var4.method8306() == var6.method8306()
                     || var5 == Class113.field414 && var4.getY() == var6.getY()) {
                     this.method3548(var5);
                  }
               } else {
                  this.method3548(var5);
               }
            }
         }
      } else {
         this.field5024
            .method6746(
               Class7940.field34067,
               this.getPosX() - var8.field18048,
               this.getPosY() - var8.field18049 + 0.15,
               this.getPosZ() - var8.field18050,
               0.0,
               0.0,
               0.0
            );
      }
   }

   @Override
   public boolean method3467(Entity var1) {
      return super.method3467(var1) && !var1.field5052;
   }

   @Override
   public boolean method3327() {
      return false;
   }

   @Override
   public boolean method3291(double var1) {
      return var1 < 16384.0;
   }

   @Override
   public float method3267() {
      return 1.0F;
   }

   @Override
   public void method3465(Class8709 var1) {
      super.method3465(var1);
      Entity var4 = var1.method31416();
      Entity var5 = this.method3460();
      Class880 var6 = !(var5 instanceof Class880) ? null : (Class880)var5;
      boolean var7 = var4.method2741(Class8654.method31116(this, var6).method31130(), 4.0F);
      if (var7) {
         this.method3399(var6, var4);
         if (var4 instanceof Class880) {
            ((Class880)var4).method3035(new Class2023(Class8254.field35491, 200));
         }
      }
   }

   @Override
   public void method3466(Class8711 var1) {
      super.method3466(var1);
      ((ServerWorld)this.field5024).method6939(Class7940.field34070, this.getPosX(), this.getPosY(), this.getPosZ(), 2, 0.2, 0.2, 0.2, 0.0);
      this.method2863(Class6067.field27046, 1.0F, 1.0F);
   }

   @Override
   public void method3464(Class8710 var1) {
      super.method3464(var1);
      this.method2904();
   }

   @Override
   public boolean method3139() {
      return true;
   }

   @Override
   public boolean method2741(Class8654 var1, float var2) {
      if (!this.field5024.field9020) {
         this.method2863(Class6067.field27047, 1.0F, 1.0F);
         ((ServerWorld)this.field5024).method6939(Class7940.field34054, this.getPosX(), this.getPosY(), this.getPosZ(), 15, 0.2, 0.2, 0.2, 0.0);
         this.method2904();
      }

      return true;
   }

   @Override
   public Packet<?> method2835() {
      return new Class5487(this);
   }
}