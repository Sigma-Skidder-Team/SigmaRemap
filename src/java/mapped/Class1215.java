package mapped;

public class Class1215 extends Class1210 {
   private Class2160 field6529 = null;

   public Class1215(Class2160 var1, int var2, int var3, int var4, int var5) {
      super(var1.ordinal(), var2, var3, var4, var5, method5773(var1));
      this.field6529 = var1;
   }

   public Class2160 method5772() {
      return this.field6529;
   }

   private static String method5773(Class2160 var0) {
      String var3 = I18n.format(var0.method8877()) + ": ";
      switch (Class8340.field35860[var0.ordinal()]) {
         case 1:
            return var3 + Class842.method2574(Shaders.field40878);
         case 2:
            return var3 + Class842.method2573(Shaders.field40874);
         case 3:
            return var3 + Class842.method2573(Shaders.field40875);
         case 4:
            return var3 + Class842.method2578(Shaders.field40865);
         case 5:
            return var3 + Class842.method2578(Shaders.field40866);
         case 6:
            return var3 + Class842.method2579(Shaders.field40864);
         case 7:
            return var3 + Class842.method2573(Shaders.field40863);
         case 8:
            return var3 + Shaders.field40877.method27376();
         case 9:
            return var3 + Shaders.field40876.method27376();
         case 10:
            return var3 + Class842.method2573(Shaders.field40873);
         case 11:
            return var3 + Class842.method2573(Shaders.field40862);
         default:
            return var3 + Shaders.method32951(var0);
      }
   }

   public void method5774() {
      this.method5766(method5773(this.field6529));
   }

   @Override
   public boolean method5735(int var1) {
      return true;
   }
}
