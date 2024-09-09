package mapped;

public class Class2769 extends Class2595 {
   private static String[] field17346;
   private final Class1097 field17347;

   public Class2769(Class1097 var1) {
      this.field17347 = var1;
   }

   @Override
   public boolean method10803() {
      if (this.field17347.isChild() && this.field17347.method5230()) {
         return this.field17347.method5213() && Class1097.method5232(this.field17347).nextInt(500) == 1
            ? true
            : Class1097.method5233(this.field17347).nextInt(6000) == 1;
      } else {
         return false;
      }
   }

   @Override
   public boolean method10806() {
      return false;
   }

   @Override
   public void method10804() {
      this.field17347.method5197(true);
   }
}
