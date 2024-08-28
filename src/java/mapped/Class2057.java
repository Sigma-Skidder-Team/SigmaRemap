package mapped;

public class Class2057 implements Class2051 {
   private static String[] field13401;
   private final int field13402;
   private final int field13403;
   private final int field13404;
   private final int field13405;
   private final Class1806 field13406;

   public Class2057(int var1, int var2, int var3, int var4, Class1806 var5) {
      this.field13402 = var3;
      this.field13403 = var4;
      this.field13404 = var1;
      this.field13405 = var2;
      this.field13406 = var5;
   }

   @Override
   public float method8690() {
      return 2.0F;
   }

   @Override
   public int method8687() {
      return this.field13402;
   }

   @Override
   public int method8688() {
      return this.field13403;
   }

   @Override
   public float method8689() {
      return (float)(this.field13402 / 2 + 1);
   }

   @Override
   public void method8691(int var1, int var2) {
      this.field13406.method7894(0, var1, var2, this.field13404, this.field13405, this.field13402, this.field13403, false, false);
   }

   @Override
   public boolean method8692() {
      return this.field13406.method7888().method8973() > 1;
   }

   @Override
   public float method8702() {
      return 0.5F;
   }

   @Override
   public float method8701() {
      return 0.5F;
   }
}
