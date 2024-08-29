package mapped;

import net.minecraft.util.math.BlockPos;

import javax.annotation.Nullable;

public class Class7368 extends Class7361 {
   private static String[] field31534;
   private boolean field31535;
   private Class8238 field31536;
   private Vector3d field31537;

   public Class7368(Class1007 var1) {
      super(var1);
   }

   @Override
   public void method23360() {
      if (!this.field31535 && this.field31536 != null) {
         BlockPos var3 = this.field31519.world.method7006(Class101.field300, Class2909.field17994);
         if (!var3.method8317(this.field31519.getPositionVec(), 10.0)) {
            this.field31519.method4336().method32671(Class9598.field44896);
         }
      } else {
         this.field31535 = false;
         this.method23371();
      }
   }

   @Override
   public void method23362() {
      this.field31535 = true;
      this.field31536 = null;
      this.field31537 = null;
   }

   private void method23371() {
      int var3 = this.field31519.method4328();
      Vector3d var4 = this.field31519.method4334(1.0F);
      int var5 = this.field31519.method4329(-var4.field18048 * 40.0, 105.0, -var4.field18050 * 40.0);
      if (this.field31519.method4337() != null && this.field31519.method4337().method26125() > 0) {
         var5 %= 12;
         if (var5 < 0) {
            var5 += 12;
         }
      } else {
         var5 -= 12;
         var5 &= 7;
         var5 += 12;
      }

      this.field31536 = this.field31519.method4330(var3, var5, (Class7176)null);
      this.method23372();
   }

   private void method23372() {
      if (this.field31536 != null) {
         this.field31536.method28691();
         if (!this.field31536.method28693()) {
            BlockPos var3 = this.field31536.method28704();
            this.field31536.method28691();

            double var4;
            do {
               var4 = (double)((float)var3.getY() + this.field31519.method3013().nextFloat() * 20.0F);
            } while (var4 < (double)var3.getY());

            this.field31537 = new Vector3d((double)var3.getX(), var4, (double)var3.getZ());
         }
      }
   }

   @Nullable
   @Override
   public Vector3d method23365() {
      return this.field31537;
   }

   @Override
   public Class9598<Class7368> method23368() {
      return Class9598.field44900;
   }
}
