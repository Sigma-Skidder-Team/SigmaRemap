package mapped;

public class Class3138 implements Class2982 {
   public final Class3802 field18355;

   public Class3138(Class3802 var1) {
      this.field18355 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      short var4 = var1.<Short>method30555(BruhMotha.field22522, 0);
      short var5 = var1.<Short>method30555(BruhMotha.field22534, 0);
      short var6 = var1.<Short>method30555(BruhMotha.field22534, 1);
      Class6049 var7 = var1.method30580().<Class6049>method22438(Class6049.class);
      if (var7.method18733() != null && var7.method18733().equalsIgnoreCase("minecraft:enchanting_table") && var5 > 3 && var5 < 7) {
         short var8 = (short)(var6 >> 8);
         short var9 = (short)(var6 & 255);
         var1.method30574(var1.method30586(), new Class3010(this, var4, var5, var9)).method30570(Class6363.class);
         var1.method30558(BruhMotha.field22534, 0, (short)(var5 + 3));
         var1.method30558(BruhMotha.field22534, 1, var8);
      }
   }
}
