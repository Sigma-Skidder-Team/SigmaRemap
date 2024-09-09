package mapped;

public class Class2743 extends Class2736 {
   private static String[] field17257;
   private final Class1088 field17270;

   public Class2743(Class1088 var1, double var2, int var4) {
      super(var1, var2, var4);
      this.field17270 = var1;
   }

   @Override
   public boolean method10803() {
      return !this.field17258.isInWater() && !Class1088.method5058(this.field17270) && !this.field17270.method5045() ? super.method10803() : false;
   }
}
