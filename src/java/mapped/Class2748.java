package mapped;

public class Class2748 extends Class2747 {
   private static String[] field17280;
   private final Class1097 field17287;

   public Class2748(Class1097 var1, double var2) {
      super(var1, var2);
      this.field17287 = var1;
   }

   @Override
   public boolean method10803() {
      if (this.field17287.method3327()) {
         BlockPos var3 = this.method10957(this.field17281.field5024, this.field17281, 5, 4);
         if (var3 == null) {
            return this.method10955();
         } else {
            this.field17283 = (double)var3.method8304();
            this.field17284 = (double)var3.getY();
            this.field17285 = (double)var3.method8306();
            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean method10806() {
      if (!this.field17287.method5189()) {
         return super.method10806();
      } else {
         this.field17287.method4230().method21666();
         return false;
      }
   }
}
