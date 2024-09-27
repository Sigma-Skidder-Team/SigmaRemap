package mapped;

public class Class3162 implements Class2982 {
   public final Class3795 field18400;

   public Class3162(Class3795 var1) {
      this.field18400 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      short var4 = var1.<Short>method30555(BruhMotha.field22522, 0);
      short var5 = var1.<Short>method30555(BruhMotha.field22534, 0);
      boolean var6 = var5 == 45 && var4 == 0;
      Class6049 var7 = var1.method30580().<Class6049>method22438(Class6049.class);
      if (var7.method18733() != null && var7.method18733().equals("minecraft:brewing_stand")) {
         if (var5 == 4) {
            var6 = true;
         }

         if (var5 > 4) {
            var1.method30558(BruhMotha.field22534, 0, (short)(var5 - 1));
         }
      }

      if (var6) {
         var1.method30574(22, new Class3012(this, var4, var5)).method30570(Class6363.class);
         var1.method30558(BruhMotha.field22518, 0, (byte)0);
         var1.method30558(BruhMotha.field22518, 1, (byte)0);
         var1.method30558(BruhMotha.field22534, 0, (short)-999);
      }
   }
}
