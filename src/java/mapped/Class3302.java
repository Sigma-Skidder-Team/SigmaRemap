package mapped;

public class Class3302 extends Class3292 {
   private static String[] field18808;

   public Class3302(Class3209 var1, Class5643 var2) {
      super(var1, var2);
   }

   @Override
   public Class2274 method11707(Class5911 var1) {
      return Class2274.field14820;
   }

   @Override
   public Class6794<Class8848> method11700(Class1655 var1, PlayerEntity var2, Class79 var3) {
      Class8711 var6 = method11735(var1, var2, Class1985.field12963);
      Class8711 var7 = var6.method31422(var6.method31423().method8311());
      Class2274 var8 = super.method11707(new Class5911(var2, var3, var7));
      return new Class6794<Class8848>(var8, var2.method3094(var3));
   }
}
