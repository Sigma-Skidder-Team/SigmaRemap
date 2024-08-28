package mapped;

public class Class3129 implements Class2982 {
   public final Class3828 field18340;

   public Class3129(Class3828 var1) {
      this.field18340 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      byte var4 = var1.<Byte>method30555(Class4750.field22518, 0);
      if (var4 == 0 || var4 == 2) {
         String var5 = var1.<String>method30559(Class4750.field22539);
         var1.method30560(Class4750.field22538, Class2980.method11394(var5));
         String var6 = var1.<String>method30559(Class4750.field22539);
         var1.method30560(Class4750.field22544, !var6.equals("integer") ? 1 : 0);
      }
   }
}
