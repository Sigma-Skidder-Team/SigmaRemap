package mapped;

public class Class3001 implements Class2982 {
   public final Class3876 field18126;

   public Class3001(Class3876 var1) {
      this.field18126 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      String var4 = var1.<String>method30555(Class4750.field22539, 0);
      if (var4.equals("minecraft:brewing_stand")) {
         var1.method30558(Class4750.field22522, 1, (short)(var1.<Short>method30555(Class4750.field22522, 1) + 1));
      }
   }
}
