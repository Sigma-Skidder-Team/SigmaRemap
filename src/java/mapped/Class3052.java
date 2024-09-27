package mapped;

public class Class3052 implements Class2982 {
   private static String[] field18210;
   public final Class3799 field18211;

   public Class3052(Class3799 var1) {
      this.field18211 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      Class7161 var4 = var1.method30580();
      int var5 = (int)Math.floor((double)var1.<Float>method30555(BruhMotha.field22532, 0).floatValue());
      int var6 = (int)Math.floor((double)var1.<Float>method30555(BruhMotha.field22532, 1).floatValue());
      int var7 = (int)Math.floor((double)var1.<Float>method30555(BruhMotha.field22532, 2).floatValue());
      int var8 = var1.<Integer>method30555(BruhMotha.field22526, 0);
      Class9695[] var9 = new Class9695[var8];

      for (int var10 = 0; var10 < var8; var10++) {
         Class9695 var11 = new Class9695(
            var5 + var1.<Byte>method30561(BruhMotha.field22518),
            (short)(var6 + var1.<Byte>method30561(BruhMotha.field22518)),
            var7 + var1.<Byte>method30561(BruhMotha.field22518)
         );
         var9[var10] = var11;
         Class9322.method35225(var4, var11.method37962(), var11.method37963(), var11.method37964(), 0);
      }

      var1.method30568(Class6380.class, true, true);
      var1.method30578();

      for (int var12 = 0; var12 < var8; var12++) {
         Class9322.method35222(var4, var9[var12]);
      }
   }
}
