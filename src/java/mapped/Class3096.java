package mapped;

public class Class3096 implements Class2982 {
   private static String[] field18280;
   public final Class3927 field18281;

   public Class3096(Class3927 var1) {
      this.field18281 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      short var4 = var1.<Short>method30555(BruhMotha.field22522, 0);
      if (var4 != 255) {
         Class9695 var5 = var1.<Class9695>method30555(BruhMotha.field22551, 0);
         int var6 = var5.method37962();
         short var7 = var5.method37963();
         int var8 = var5.method37964();
         switch (var4) {
            case 0:
               var7--;
               break;
            case 1:
               var7++;
               break;
            case 2:
               var8--;
               break;
            case 3:
               var8++;
               break;
            case 4:
               var6--;
               break;
            case 5:
               var6++;
         }

         Class6057 var9 = var1.method30580().<Class6057>method22438(Class6057.class);
         var9.method18747(new Class9695(var6, var7, var8));
      }
   }
}
