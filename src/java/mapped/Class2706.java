package mapped;

public class Class2706 extends Class2704 {
   private static String[] field17178;
   private final Class1097 field17184;

   public Class2706(Class1097 var1, Class<?>... var2) {
      super(var1, var2);
      this.field17184 = var1;
   }

   @Override
   public boolean method10806() {
      if (!Class1097.method5239(this.field17184) && !Class1097.method5240(this.field17184)) {
         return super.method10806();
      } else {
         this.field17184.method4233((Class880)null);
         return false;
      }
   }

   @Override
   public void method10920(Class1006 var1, Class880 var2) {
      if (var1 instanceof Class1097 && ((Class1097)var1).method4307()) {
         var1.method4233(var2);
      }
   }
}