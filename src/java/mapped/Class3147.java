package mapped;

public class Class3147 implements Class2982 {
   public final Class3951 field18371;

   public Class3147(Class3951 var1) {
      this.field18371 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      Class6047 var4 = var1.method30580().<Class6047>method22438(Class6047.class);
      Class4824 var5 = new Class4824(var4);
      Class8173 var6 = var1.<Class8173>method30561(var5);

      for (int var7 = 0; var7 < var6.method28446().length; var7++) {
         Class8225 var8 = var6.method28446()[var7];
         if (var8 != null) {
            for (int var9 = 0; var9 < 16; var9++) {
               for (int var10 = 0; var10 < 16; var10++) {
                  for (int var11 = 0; var11 < 16; var11++) {
                     int var12 = var8.method28624(var11, var9, var10);
                     if (var12 == 26) {
                        Class72 var13 = new Class72("");
                        var13.<Class66>method236(new Class66("color", 14));
                        var13.<Class66>method236(new Class66("x", var11 + (var6.method28440() << 4)));
                        var13.<Class66>method236(new Class66("y", var9 + (var7 << 4)));
                        var13.<Class66>method236(new Class66("z", var10 + (var6.method28441() << 4)));
                        var13.<Class71>method236(new Class71("id", "minecraft:bed"));
                        var6.method28451().add(var13);
                     }
                  }
               }
            }
         }
      }
   }
}
