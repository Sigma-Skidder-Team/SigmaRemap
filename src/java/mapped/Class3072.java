package mapped;

public class Class3072 implements Class2982 {
   private static String[] field18240;
   public final Class3897 field18241;

   public Class3072(Class3897 var1) {
      this.field18241 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      Class6051 var4 = var1.method30580().<Class6051>method22438(Class6051.class);
      Class4748 var5 = new Class4748(var4);
      Class8172 var6 = (Class8172)var1.<Class8173>method30559(var5);
      if (!var6.method28453()) {
         var1.method30560(var5, var6);
      } else {
         var1.method30587(29);
         var1.method30560(BruhMotha.field22526, var6.method28440());
         var1.method30560(BruhMotha.field22526, var6.method28441());
         Class5413 var7 = ViaVersion3.getInstance().method34424().<Class5413>method31084(Class5413.class);
         var7.method17003(var1.method30580(), var6.method28440(), var6.method28441());
      }

      var1.<byte[]>method30559(BruhMotha.field22521);
   }
}
