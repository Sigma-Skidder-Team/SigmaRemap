package mapped;

import java.util.List;

public class Class906 extends Entity {
   private static String[] field5170;
   private int field5171;
   public long field5172;
   private int field5173;
   private boolean field5174;
   private Class878 field5175;

   public Class906(Class8992<? extends Class906> var1, World var2) {
      super(var1, var2);
      this.field5077 = true;
      this.field5171 = 2;
      this.field5172 = this.field5054.nextLong();
      this.field5173 = this.field5054.nextInt(3) + 1;
   }

   public void method3549(boolean var1) {
      this.field5174 = var1;
   }

   @Override
   public Class2266 method2864() {
      return Class2266.field14731;
   }

   public void method3550(Class878 var1) {
      this.field5175 = var1;
   }

   @Override
   public void tick() {
      super.tick();
      if (this.field5171 == 2) {
         Class2197 var3 = this.field5024.method6997();
         if (var3 == Class2197.field14353 || var3 == Class2197.field14354) {
            this.method3551(4);
         }

         this.field5024
            .method6743(
               (PlayerEntity)null,
               this.getPosX(),
               this.getPosY(),
               this.getPosZ(),
               Class6067.field26732,
               Class2266.field14731,
               10000.0F,
               0.8F + this.field5054.nextFloat() * 0.2F
            );
         this.field5024
            .method6743(
               (PlayerEntity)null,
               this.getPosX(),
               this.getPosY(),
               this.getPosZ(),
               Class6067.field26731,
               Class2266.field14731,
               2.0F,
               0.5F + this.field5054.nextFloat() * 0.2F
            );
      }

      this.field5171--;
      if (this.field5171 < 0) {
         if (this.field5173 != 0) {
            if (this.field5171 < -this.field5054.nextInt(10)) {
               this.field5173--;
               this.field5171 = 1;
               this.field5172 = this.field5054.nextLong();
               this.method3551(0);
            }
         } else {
            this.method2904();
         }
      }

      if (this.field5171 >= 0) {
         if (this.field5024 instanceof ServerWorld) {
            if (!this.field5174) {
               double var4 = 3.0;
               List<Entity> var6 = this.field5024
                  .method6770(
                     this,
                     new Class6488(
                        this.getPosX() - 3.0,
                        this.getPosY() - 3.0,
                        this.getPosZ() - 3.0,
                        this.getPosX() + 3.0,
                        this.getPosY() + 6.0 + 3.0,
                        this.getPosZ() + 3.0
                     ),
                     Entity::method3066
                  );

               for (Entity var8 : var6) {
                  var8.method3353((ServerWorld)this.field5024, this);
               }

               if (this.field5175 != null) {
                  CriteriaTriggers.field44495.method15099(this.field5175, var6);
               }
            }
         } else {
            this.field5024.method6809(2);
         }
      }
   }

   private void method3551(int var1) {
      if (!this.field5174 && !this.field5024.field9020 && this.field5024.method6789().method17135(Class5462.field24223)) {
         BlockPos var4 = this.method3432();
         Class7380 var5 = Class3397.method12009(this.field5024, var4);
         if (this.field5024.method6738(var4).method23393() && var5.method23443(this.field5024, var4)) {
            this.field5024.method6730(var4, var5);
         }

         for (int var6 = 0; var6 < var1; var6++) {
            BlockPos var7 = var4.method8336(this.field5054.nextInt(3) - 1, this.field5054.nextInt(3) - 1, this.field5054.nextInt(3) - 1);
            var5 = Class3397.method12009(this.field5024, var7);
            if (this.field5024.method6738(var7).method23393() && var5.method23443(this.field5024, var7)) {
               this.field5024.method6730(var7, var5);
            }
         }
      }
   }

   @Override
   public boolean method3291(double var1) {
      double var5 = 64.0 * method3377();
      return var1 < var5 * var5;
   }

   @Override
   public void method2850() {
   }

   @Override
   public void method2723(Class39 var1) {
   }

   @Override
   public void method2724(Class39 var1) {
   }

   @Override
   public Packet<?> method2835() {
      return new Class5487(this);
   }
}
