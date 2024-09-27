package mapped;

public class Class3105 implements Class2982 {
   private static String[] field18298;
   public final Class3947 field18299;

   public Class3105(Class3947 var1) {
      this.field18299 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      Class9695 var4 = var1.<Class9695>method30555(BruhMotha.field22551, 0);
      short var5 = var1.<Short>method30555(BruhMotha.field22522, 0);
      Class72 var6 = var1.<Class72>method30555(BruhMotha.field22555, 0);
      Class5412 var7 = ViaVersion3.getInstance().method34424().<Class5412>method31084(Class5412.class);
      int var8 = var7.method16999(var1.method30580(), var4, var6, true);
      if (var8 != -1) {
         Class6039 var9 = var1.method30580().<Class6039>method22438(Class6039.class);
         Class9344 var10 = var9.method18689(var4);
         if (var10 != null) {
            var10.method35364(var8);
         }
      }

      if (var5 == 5) {
         var1.method30578();
      }
   }
}
