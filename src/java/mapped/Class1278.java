package mapped;

import net.minecraft.client.Minecraft;

public class Class1278 extends Class1274<Class1172> {
   private static String[] field6818;
   public final Class803 field6819;

   public Class1278(Class803 var1, Minecraft var2) {
      super(var2, var1.field4564, var1.field4565, 32, var1.field4565 - 64, 36);
      this.field6819 = var1;
      this.method6020(false);
      if (Class803.method1955(var1).field27415 != null) {
         Class803.method1955(var1).field27415.forEach((var1x, var2x) -> {
            Class803 var10003 = this.field6819;
            this.field6819.getClass();
            this.method6030(new Class1172(var10003, var1x, var2x));
         });
      }
   }
}
