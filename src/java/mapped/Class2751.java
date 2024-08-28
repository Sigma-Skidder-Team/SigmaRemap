package mapped;

public class Class2751 extends Class2747 {
   private static String[] field17280;

   public Class2751(Class1088 var1, double var2) {
      super(var1, var2);
   }

   @Override
   public boolean method10803() {
      if (this.field17281.method3014() == null && !this.field17281.method3327()) {
         return false;
      } else {
         BlockPos var3 = this.method10957(this.field17281.field5024, this.field17281, 7, 4);
         if (var3 == null) {
            return this.method10955();
         } else {
            this.field17283 = (double)var3.method8304();
            this.field17284 = (double)var3.getY();
            this.field17285 = (double)var3.method8306();
            return true;
         }
      }
   }
}
