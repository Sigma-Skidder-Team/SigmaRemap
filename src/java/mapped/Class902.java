package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;

public class Class902 extends Class901 {
   private static String[] field5144;
   private static final DataParameter<Boolean> field5145 = EntityDataManager.<Boolean>method35441(Class902.class, Class7784.field33398);

   public Class902(EntityType<? extends Class902> var1, World var2) {
      super(var1, var2);
   }

   public Class902(World var1, Class880 var2, double var3, double var5, double var7) {
      super(EntityType.field41104, var2, var3, var5, var7, var1);
   }

   public Class902(World var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(EntityType.field41104, var2, var4, var6, var8, var10, var12, var1);
   }

   @Override
   public float method3531() {
      return !this.method3532() ? super.method3531() : 0.73F;
   }

   @Override
   public boolean method3327() {
      return false;
   }

   @Override
   public float method3368(Class7782 var1, Class1665 var2, BlockPos var3, BlockState var4, FluidState var5, float var6) {
      return this.method3532() && Class1079.method5002(var4) ? Math.min(0.8F, var6) : var6;
   }

   @Override
   public void method3465(EntityRayTraceResult var1) {
      super.method3465(var1);
      if (!this.world.isRemote) {
         Entity var4 = var1.getEntity();
         Entity var5 = this.method3460();
         boolean var6;
         if (!(var5 instanceof Class880)) {
            var6 = var4.method2741(Class8654.field39006, 5.0F);
         } else {
            Class880 var7 = (Class880)var5;
            var6 = var4.method2741(Class8654.method31122(this, var7), 8.0F);
            if (var6) {
               if (!var4.isAlive()) {
                  var7.method3041(5.0F);
               } else {
                  this.method3399(var7, var4);
               }
            }
         }

         if (var6 && var4 instanceof Class880) {
            byte var8 = 0;
            if (this.world.method6997() != Class2197.field14353) {
               if (this.world.method6997() == Class2197.field14354) {
                  var8 = 40;
               }
            } else {
               var8 = 10;
            }

            if (var8 > 0) {
               ((Class880)var4).method3035(new Class2023(Effects.WITHER, 20 * var8, 1));
            }
         }
      }
   }

   @Override
   public void method3464(RayTraceResult var1) {
      super.method3464(var1);
      if (!this.world.isRemote) {
         Class2141 var4 = !this.world.method6789().method17135(Class5462.field24224) ? Class2141.field14014 : Class2141.field14016;
         this.world.method6756(this, this.getPosX(), this.getPosY(), this.getPosZ(), 1.0F, false, var4);
         this.method2904();
      }
   }

   @Override
   public boolean method3139() {
      return false;
   }

   @Override
   public boolean method2741(Class8654 var1, float var2) {
      return false;
   }

   @Override
   public void registerData() {
      this.dataManager.register(field5145, false);
   }

   public boolean method3532() {
      return this.dataManager.<Boolean>method35445(field5145);
   }

   public void method3533(boolean var1) {
      this.dataManager.method35446(field5145, var1);
   }

   @Override
   public boolean method3529() {
      return false;
   }
}
