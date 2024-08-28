package mapped;

public class Class4692 extends Class4689 {
   private static String[] field22276;

   public Class4692(Class4688[] var1, Class122[] var2) {
      super(var1, var2);
   }

   @Override
   public Class7131 method14694() {
      return Class8695.field39246;
   }

   @Override
   public Class4693 method14710(Class4693[] var1) {
      switch (var1.length) {
         case 0:
            return field22278;
         case 1:
            return var1[0];
         case 2:
            Class4693 var4 = var1[0];
            Class4693 var5 = var1[1];
            return (var2, var3) -> {
               var4.method14697(var2, var3);
               var5.method14697(var2, var3);
               return true;
            };
         default:
            return (var1x, var2) -> {
               for (Class4693 var8 : var1) {
                  var8.method14697(var1x, var2);
               }

               return true;
            };
      }
   }
}
