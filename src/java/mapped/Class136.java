package mapped;

public class Class136 extends Class128 {
   private static String[] field458;
   private final Class39 field459;

   public Class136(Class122[] var1, Class39 var2) {
      super(var1);
      this.field459 = var2;
   }

   @Override
   public Class7128 method368() {
      return Class8585.field38621;
   }

   @Override
   public ItemStack method371(ItemStack var1, Class7812 var2) {
      var1.method32143().method140(this.field459);
      return var1;
   }

   public static Class5876<?> method399(Class39 var0) {
      return method372(var1 -> new Class136(var1, var0));
   }

   // $VF: synthetic method
   public static Class39 method401(Class136 var0) {
      return var0.field459;
   }
}
