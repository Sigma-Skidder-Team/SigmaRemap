package mapped;

public class Class3067 implements Class2982 {
   private static String[] field18233;
   public final Class3944 field18234;

   public Class3067(Class3944 var1) {
      this.field18234 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      short var4 = var1.<Short>method30559(BruhMotha.field22534);
      if (var4 != 0) {
         Class8563 var5 = new Class8563(60, null, var1.method30580());
         var5.method30560(BruhMotha.field22544, var1.<Integer>method30555(BruhMotha.field22544, 0));
         var5.method30560(BruhMotha.field22544, 0);
         var5.method30560(BruhMotha.field22561, new Class9738(var4, (byte)1, (short)0, null));

         try {
            var5.method30568(Class6363.class, true, true);
         } catch (Exception var7) {
            var7.printStackTrace();
         }
      }
   }
}
