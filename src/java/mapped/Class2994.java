package mapped;

public class Class2994 implements Class2982 {
   private static String[] field18114;
   public final Class3835 field18115;

   public Class2994(Class3835 var1) {
      this.field18115 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      int var4 = var1.<Integer>method30555(BruhMotha.field22544, 0);
      byte var5 = var1.<Byte>method30555(BruhMotha.field22518, 0);
      Class1866 var6 = Class8753.method31579(var5, true);
      if (var6 != null) {
         if (var6.method8127(Class1866.field10056)) {
            int var7 = var1.<Integer>method30555(BruhMotha.field22526, 0);
            var1.method30558(BruhMotha.field22526, 0, this.field18115.field20048.method19376().method18528(var7));
         }

         var1.method30580().<Class6054>method22438(Class6054.class).method18666(var4, var6);
      }
   }
}
