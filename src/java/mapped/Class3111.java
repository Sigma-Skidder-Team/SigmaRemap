package mapped;

public class Class3111 implements Class2982 {
   private static String[] field18309;
   public final Class4042 field18310;

   public Class3111(Class4042 var1) {
      this.field18310 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      int var4 = var1.<Integer>method30561(BruhMotha.field22544);

      for (int var5 = 0; var5 < var4; var5++) {
         byte var6 = var1.<Byte>method30559(BruhMotha.field22518);
         int var7 = (var6 & 240) >> 4;
         var1.method30560(BruhMotha.field22544, var7);
         var1.<Byte>method30561(BruhMotha.field22518);
         var1.<Byte>method30561(BruhMotha.field22518);
         byte var8 = (byte)(var6 & 15);
         var1.method30560(BruhMotha.field22518, var8);
         var1.method30560(BruhMotha.field22558, null);
      }
   }
}
