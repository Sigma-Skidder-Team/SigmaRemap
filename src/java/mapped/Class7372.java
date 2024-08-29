package mapped;

import javax.annotation.Nullable;

public class Class7372 extends Class7361 {
   private static String[] field31549;
   private static final Class8522 field31550 = new Class8522().method30203(128.0);
   private Class8238 field31551;
   private Vector3d field31552;

   public Class7372(Class1007 var1) {
      super(var1);
   }

   @Override
   public Class9598<Class7372> method23368() {
      return Class9598.field44898;
   }

   @Override
   public void method23362() {
      this.field31551 = null;
      this.field31552 = null;
   }

   @Override
   public void method23360() {
      double var3 = this.field31552 != null
         ? this.field31552.method11343(this.field31519.getPosX(), this.field31519.getPosY(), this.field31519.getPosZ())
         : 0.0;
      if (var3 < 100.0 || var3 > 22500.0 || this.field31519.field5037 || this.field31519.field5038) {
         this.method23377();
      }
   }

   @Nullable
   @Override
   public Vector3d method23365() {
      return this.field31552;
   }

   private void method23377() {
      if (this.field31551 == null || this.field31551.method28693()) {
         int var3 = this.field31519.method4328();
         BlockPos var4 = this.field31519.world.method7006(Class101.field300, Class2909.field17994);
         PlayerEntity var5 = this.field31519.world.method7190(field31550, (double)var4.getX(), (double)var4.getY(), (double)var4.getZ());
         int var6;
         if (var5 == null) {
            var6 = this.field31519.method4329(40.0, (double)var4.getY(), 0.0);
         } else {
            Vector3d var7 = new Vector3d(var5.getPosX(), 0.0, var5.getPosZ()).method11333();
            var6 = this.field31519.method4329(-var7.field18048 * 40.0, 105.0, -var7.field18050 * 40.0);
         }

         Class7176 var8 = new Class7176(var4.getX(), var4.getY(), var4.getZ());
         this.field31551 = this.field31519.method4330(var3, var6, var8);
         if (this.field31551 != null) {
            this.field31551.method28691();
         }
      }

      this.method23378();
      if (this.field31551 != null && this.field31551.method28693()) {
         this.field31519.method4336().method32671(Class9598.field44899);
      }
   }

   private void method23378() {
      if (this.field31551 != null && !this.field31551.method28693()) {
         BlockPos var3 = this.field31551.method28704();
         this.field31551.method28691();
         double var4 = (double)var3.getX();
         double var6 = (double)var3.getZ();

         double var8;
         do {
            var8 = (double)((float)var3.getY() + this.field31519.method3013().nextFloat() * 20.0F);
         } while (var8 < (double)var3.getY());

         this.field31552 = new Vector3d(var4, var8, var6);
      }
   }
}
