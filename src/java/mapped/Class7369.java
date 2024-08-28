package mapped;

import javax.annotation.Nullable;

public class Class7369 extends Class7361 {
   private static String[] field31538;
   private static final Class8522 field31539 = new Class8522().method30203(64.0);
   private Class8238 field31540;
   private Vector3d field31541;
   private boolean field31542;

   public Class7369(Class1007 var1) {
      super(var1);
   }

   @Override
   public Class9598<Class7369> method23368() {
      return Class9598.field44896;
   }

   @Override
   public void method23360() {
      double var3 = this.field31541 != null
         ? this.field31541.method11343(this.field31519.getPosX(), this.field31519.getPosY(), this.field31519.getPosZ())
         : 0.0;
      if (var3 < 100.0 || var3 > 22500.0 || this.field31519.field5037 || this.field31519.field5038) {
         this.method23373();
      }
   }

   @Override
   public void method23362() {
      this.field31540 = null;
      this.field31541 = null;
   }

   @Nullable
   @Override
   public Vector3d method23365() {
      return this.field31541;
   }

   private void method23373() {
      if (this.field31540 != null && this.field31540.method28693()) {
         BlockPos var3 = this.field31519.field5024.method7006(Class101.field300, new BlockPos(Class2909.field17994));
         int var4 = this.field31519.method4337() != null ? this.field31519.method4337().method26125() : 0;
         if (this.field31519.method3013().nextInt(var4 + 3) == 0) {
            this.field31519.method4336().method32671(Class9598.field44898);
            return;
         }

         double var5 = 64.0;
         PlayerEntity var7 = this.field31519.field5024.method7190(field31539, (double)var3.method8304(), (double)var3.getY(), (double)var3.method8306());
         if (var7 != null) {
            var5 = var3.method8319(var7.method3431(), true) / 512.0;
         }

         if (var7 != null
            && !var7.field4919.field29606
            && (this.field31519.method3013().nextInt(Class9679.method37772((int)var5) + 2) == 0 || this.field31519.method3013().nextInt(var4 + 2) == 0)) {
            this.method23374(var7);
            return;
         }
      }

      if (this.field31540 == null || this.field31540.method28693()) {
         int var8 = this.field31519.method4328();
         int var9 = var8;
         if (this.field31519.method3013().nextInt(8) == 0) {
            this.field31542 = !this.field31542;
            var9 = var8 + 6;
         }

         if (!this.field31542) {
            var9--;
         } else {
            var9++;
         }

         if (this.field31519.method4337() != null && this.field31519.method4337().method26125() >= 0) {
            var9 %= 12;
            if (var9 < 0) {
               var9 += 12;
            }
         } else {
            var9 -= 12;
            var9 &= 7;
            var9 += 12;
         }

         this.field31540 = this.field31519.method4330(var8, var9, (Class7176)null);
         if (this.field31540 != null) {
            this.field31540.method28691();
         }
      }

      this.method23375();
   }

   private void method23374(PlayerEntity var1) {
      this.field31519.method4336().method32671(Class9598.field44897);
      this.field31519.method4336().<Class7374>method32673(Class9598.field44897).method23381(var1);
   }

   private void method23375() {
      if (this.field31540 != null && !this.field31540.method28693()) {
         BlockPos var3 = this.field31540.method28704();
         this.field31540.method28691();
         double var4 = (double)var3.method8304();
         double var6 = (double)var3.method8306();

         double var8;
         do {
            var8 = (double)((float)var3.getY() + this.field31519.method3013().nextFloat() * 20.0F);
         } while (var8 < (double)var3.getY());

         this.field31541 = new Vector3d(var4, var8, var6);
      }
   }

   @Override
   public void method23361(Class1001 var1, BlockPos var2, Class8654 var3, PlayerEntity var4) {
      if (var4 != null && !var4.field4919.field29606) {
         this.method23374(var4);
      }
   }
}
