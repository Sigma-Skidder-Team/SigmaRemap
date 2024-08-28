package mapped;

public class Class4691 extends Class4689 {
   private static String[] field22275;

   public Class4691(Class4688[] var1, Class122[] var2) {
      super(var1, var2);
   }

   @Override
   public Class7131 method14694() {
      return Class8695.field39245;
   }

   @Override
   public Class4693 method14710(Class4693[] var1) {
      switch (var1.length) {
         case 0:
            return field22278;
         case 1:
            return var1[0];
         case 2:
            return var1[0].method14717(var1[1]);
         default:
            return (var1x, var2) -> {
               for (Class4693 var8 : var1) {
                  if (!var8.method14697(var1x, var2)) {
                     return false;
                  }
               }

               return true;
            };
      }
   }
}
