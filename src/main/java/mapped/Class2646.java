package mapped;

public class Class2646 extends Class2645 {
   private static String[] field16985;
   public final Class1025 field16988;

   public Class2646(Class1025 var1, AbstractRaiderEntity var2) {
      super(var2, false);
      this.field16988 = var1;
   }

   @Override
   public boolean method10803() {
      return super.method10803() && this.field16988.method4552();
   }
}
