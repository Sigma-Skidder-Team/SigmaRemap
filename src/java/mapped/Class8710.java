package mapped;

public abstract class Class8710 {
   public final Vector3d field39316;

   public Class8710(Vector3d var1) {
      this.field39316 = var1;
   }

   public double method31418(Entity var1) {
      double var4 = this.field39316.field18048 - var1.getPosX();
      double var6 = this.field39316.field18049 - var1.getPosY();
      double var8 = this.field39316.field18050 - var1.getPosZ();
      return var4 * var4 + var6 * var6 + var8 * var8;
   }

   public abstract Class2100 method31417();

   public Vector3d method31419() {
      return this.field39316;
   }
}
