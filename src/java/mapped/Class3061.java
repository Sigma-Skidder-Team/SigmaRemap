package mapped;

public class Class3061 implements Class2982 {
   public final Class3768 field18226;

   public Class3061(Class3768 var1) {
      this.field18226 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      Class6049 var4 = var1.method30580().<Class6049>method22438(Class6049.class);
      short var5 = var1.<Short>method30555(Class4750.field22534, 0);
      if (var4.method18733() != null && var4.method18733().equals("minecraft:brewing_stand") && var5 >= 4) {
         var1.method30558(Class4750.field22534, 0, (short)(var5 + 1));
      }
   }
}
