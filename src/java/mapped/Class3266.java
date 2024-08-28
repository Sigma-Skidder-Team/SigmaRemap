package mapped;

public class Class3266 extends Class3257 {
   private static String[] field18759;
   private final Class2283 field18760;

   public Class3266(Class2283 var1, Class5643 var2) {
      super(var2.method17776(var1.method9010()));
      this.field18760 = var1;
   }

   public Class2283 method11783() {
      return this.field18760;
   }

   @Override
   public int method11736() {
      return this.field18760.method9014();
   }

   @Override
   public boolean method11699(Class8848 var1, Class8848 var2) {
      return this.field18760.method9015().test(var2) || super.method11699(var1, var2);
   }
}
