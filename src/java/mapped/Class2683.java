package mapped;

import java.util.EnumSet;

public class Class2683 extends Class2595 {
   private static String[] field17096;
   private final Class1048 field17097;
   private boolean field17098;

   public Class2683(Class1048 var1) {
      this.field17097 = var1;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14657, Class2240.field14658));
   }

   @Override
   public boolean method10808() {
      return false;
   }

   @Override
   public boolean method10803() {
      return this.field17097.method4778() && this.field17097.method3351() >= 100;
   }

   @Override
   public boolean method10806() {
      BlockPos var3 = this.field17097.method4777();
      return !new BlockPos((double)var3.method8304(), this.field17097.getPosY(), (double)var3.method8306()).method8317(this.field17097.getPositionVec(), 4.0)
         && !this.field17098
         && this.field17097.method3351() >= 100;
   }

   @Override
   public void method10804() {
      if (this.field17097.field5024 instanceof ServerWorld) {
         ServerWorld var3 = (ServerWorld)this.field17097.field5024;
         this.field17098 = false;
         this.field17097.method4230().method21666();
         BlockPos var4 = this.field17097.method3432();
         Structure var5 = !((double)var3.field9016.nextFloat() >= 0.5) ? Structure.field18065 : Structure.field18069;
         BlockPos var6 = var3.method6943(var5, var4, 50, false);
         if (var6 != null) {
            this.field17097.method4776(var6);
         } else {
            Structure var7 = !var5.equals(Structure.field18069) ? Structure.field18069 : Structure.field18065;
            BlockPos var8 = var3.method6943(var7, var4, 50, false);
            if (var8 == null) {
               this.field17098 = true;
               return;
            }

            this.field17097.method4776(var8);
         }

         var3.method6786(this.field17097, (byte)38);
      }
   }

   @Override
   public void method10807() {
      BlockPos var3 = this.field17097.method4777();
      if (new BlockPos((double)var3.method8304(), this.field17097.getPosY(), (double)var3.method8306()).method8317(this.field17097.getPositionVec(), 4.0)
         || this.field17098) {
         this.field17097.method4779(false);
      }
   }

   @Override
   public void method10805() {
      World var3 = this.field17097.field5024;
      if (this.field17097.method4785() || this.field17097.method4230().method21664()) {
         Vector3d var4 = Vector3d.method11328(this.field17097.method4777());
         Vector3d var5 = Class8037.method27588(this.field17097, 16, 1, var4, (float) (Math.PI / 8));
         if (var5 == null) {
            var5 = Class8037.method27587(this.field17097, 8, 4, var4);
         }

         if (var5 != null) {
            BlockPos var6 = new BlockPos(var5);
            if (!var3.method6739(var6).method23486(Class8953.field40469) || !var3.method6738(var6).method23440(var3, var6, Class1947.field12615)) {
               var5 = Class8037.method27587(this.field17097, 8, 5, var4);
            }
         }

         if (var5 == null) {
            this.field17098 = true;
            return;
         }

         this.field17097
            .method4227()
            .method28042(var5.field18048, var5.field18049, var5.field18050, (float)(this.field17097.method4260() + 20), (float)this.field17097.method4259());
         this.field17097.method4230().method21654(var5.field18048, var5.field18049, var5.field18050, 1.3);
         if (var3.field9016.nextInt(80) == 0) {
            var3.method6786(this.field17097, (byte)38);
         }
      }
   }
}
