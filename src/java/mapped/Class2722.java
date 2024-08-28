package mapped;

public class Class2722 extends Class2699 {
   private static String[] field17208;
   private final Class8522 field17209;
   public final Class1100 field17210;

   public Class2722(Class1100 var1, Class1046 var2) {
      super(var2, false);
      this.field17210 = var1;
      this.field17209 = new Class8522().method30206().method30208();
   }

   @Override
   public boolean method10803() {
      return Class1100.method5282(this.field17210) != null
         && Class1100.method5282(this.field17210).method4232() != null
         && this.method10915(Class1100.method5282(this.field17210).method4232(), this.field17209);
   }

   @Override
   public void method10804() {
      this.field17210.method4233(Class1100.method5282(this.field17210).method4232());
      super.method10804();
   }
}
