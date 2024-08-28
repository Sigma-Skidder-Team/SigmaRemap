package mapped;

public class Class135 extends Class128 {
   private static String[] field456;
   private final Class12 field457;

   public Class135(Class122[] var1, Class12 var2) {
      super(var1);
      this.field457 = var2;
   }

   @Override
   public Class7128 method368() {
      return Class8585.field38631;
   }

   @Override
   public ItemStack method371(ItemStack var1, Class7812 var2) {
      int var5 = this.field457.applyAsInt(var1.method32179());
      var1.method32180(var5);
      return var1;
   }

   public static Class5876<?> method396(Class12 var0) {
      return method372(var1 -> new Class135(var1, var0));
   }

   // $VF: synthetic method
   public static Class12 method398(Class135 var0) {
      return var0.field457;
   }
}
