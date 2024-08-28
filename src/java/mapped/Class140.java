package mapped;

public class Class140 extends Class128 {
   private static String[] field469;
   private final Class6870 field470;

   public Class140(Class122[] var1, Class6870 var2) {
      super(var1);
      this.field470 = var2;
   }

   @Override
   public Class7128 method368() {
      return Class8585.field38618;
   }

   @Override
   public Class8848 method371(Class8848 var1, Class7812 var2) {
      var1.method32180(this.field470.method20914(var2.method26088()));
      return var1;
   }

   public static Class5876<?> method420(Class6870 var0) {
      return method372(var1 -> new Class140(var1, var0));
   }

   // $VF: synthetic method
   public static Class6870 method422(Class140 var0) {
      return var0.field470;
   }
}
