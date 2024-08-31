package mapped;

public class Class2659 extends Class2595 {
   private static String[] field17011;
   private final Class1037 field17012;
   private final double field17013;
   private final int field17014;
   private boolean field17015;

   public Class2659(Class1037 var1, double var2, int var4) {
      this.field17012 = var1;
      this.field17013 = var2;
      this.field17014 = var4;
   }

   @Override
   public boolean method10803() {
      return !this.field17012.world.method6740() && this.field17012.method3250() && this.field17012.getPosY() < (double)(this.field17014 - 2);
   }

   @Override
   public boolean method10806() {
      return this.method10803() && !this.field17015;
   }

   @Override
   public void method10805() {
      if (this.field17012.getPosY() < (double)(this.field17014 - 1) && (this.field17012.method4230().method21664() || this.field17012.method4648())) {
         Vector3d var3 = Class8037.method27587(
            this.field17012, 4, 8, new Vector3d(this.field17012.getPosX(), (double)(this.field17014 - 1), this.field17012.getPosZ())
         );
         if (var3 == null) {
            this.field17015 = true;
            return;
         }

         this.field17012.method4230().method21654(var3.x, var3.y, var3.z, this.field17013);
      }
   }

   @Override
   public void method10804() {
      this.field17012.method4649(true);
      this.field17015 = false;
   }

   @Override
   public void method10807() {
      this.field17012.method4649(false);
   }
}
