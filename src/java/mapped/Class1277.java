package mapped;

public class Class1277 extends Class1274<Class1169> {
   private static String[] field6816;
   public final Class1305 field6817;

   public Class1277(Class1305 var1, Minecraft var2) {
      super(var2, var1.field4564, var1.field4565, 32, var1.field4565 - 64, 36);
      this.field6817 = var1;

      for (Class8992 var6 : Registry.field16074) {
         if (Class1305.method6193(var1).method28961(Class8876.field40102.method172(var6)) > 0
            || Class1305.method6193(var1).method28961(Class8876.field40103.method172(var6)) > 0) {
            this.method6030(new Class1169(this, var6));
         }
      }
   }

   @Override
   public void method6039(MatrixStack var1) {
      this.field6817.method2469(var1);
   }
}
