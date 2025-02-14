package mapped;

public class Class2488 extends IllegalArgumentException implements Class2491 {
   private static String[] field16582;
   private static final long field16583 = -6024911025449780478L;
   private final Class2513 field16584 = new Class2513(this);

   public Class2488(Class2298 var1, Object... var2) {
      this.field16584.method10500(var1, var2);
   }

   @Override
   public Class2513 method10481() {
      return this.field16584;
   }

   @Override
   public String getMessage() {
      return this.field16584.method10504();
   }

   @Override
   public String getLocalizedMessage() {
      return this.field16584.method10505();
   }
}
