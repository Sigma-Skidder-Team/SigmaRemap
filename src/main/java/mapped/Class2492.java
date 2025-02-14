package mapped;

public class Class2492 extends ArithmeticException implements Class2491 {
   private static String[] field16590;
   private static final long field16591 = -6024911025449780478L;
   private final Class2513 field16592 = new Class2513(this);

   public Class2492() {
      this.field16592.method10500(Class2297.field15670);
   }

   public Class2492(Class2298 var1, Object... var2) {
      this.field16592.method10500(var1, var2);
   }

   @Override
   public Class2513 method10481() {
      return this.field16592;
   }

   @Override
   public String getMessage() {
      return this.field16592.method10504();
   }

   @Override
   public String getLocalizedMessage() {
      return this.field16592.method10505();
   }
}
