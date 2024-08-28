package mapped;

public final class Class1700 implements AutoCloseable {
   private static String[] field9259;
   private final Minecraft field9260;
   private final Class9329 field9261;

   public Class1700(Minecraft var1) {
      this.field9260 = var1;
      this.field9261 = new Class9329(Class7513::new);
   }

   public Class1815 method7329(Class9790 var1, String var2, String var3) {
      return new Class1815(this.field9260, this.field9261, var1, var2, var3);
   }

   @Override
   public void close() {
      this.field9261.method35261();
   }
}
