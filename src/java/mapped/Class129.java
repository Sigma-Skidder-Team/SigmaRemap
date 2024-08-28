package mapped;

import com.google.common.collect.ImmutableSet;

import java.util.Set;

public class Class129 extends Class128 {
   private final Block field443;
   private final Set<Class8550<?>> field444;

   public Class129(Class122[] var1, Block var2, Set<Class8550<?>> var3) {
      super(var1);
      this.field443 = var2;
      this.field444 = var3;
   }

   @Override
   public Class7128 method368() {
      return Class8585.field38638;
   }

   @Override
   public Set<Class9821<?>> method355() {
      return ImmutableSet.of(Class9525.field44336);
   }

   @Override
   public Class8848 method371(Class8848 var1, Class7812 var2) {
      Class7380 var5 = var2.<Class7380>method26081(Class9525.field44336);
      if (var5 != null) {
         Class39 var6 = var1.method32143();
         Class39 var7;
         if (!var6.method119("BlockStateTag", 10)) {
            var7 = new Class39();
            var6.method99("BlockStateTag", var7);
         } else {
            var7 = var6.method130("BlockStateTag");
         }

         this.field444.stream().filter(var5::method23462).forEach(var2x -> var7.method109(var2x.method30472(), method374(var5, (Class8550<?>)var2x)));
      }

      return var1;
   }

   public static Class5880 method373(Block var0) {
      return new Class5880(var0);
   }

   private static <T extends Comparable<T>> String method374(Class7380 var0, Class8550<T> var1) {
      Comparable var4 = var0.method23463(var1);
      return var1.method30475((T)var4);
   }

   // $VF: synthetic method
   public static Block method376(Class129 var0) {
      return var0.field443;
   }

   // $VF: synthetic method
   public static Set<Class8550<?>> method377(Class129 var0) {
      return var0.field444;
   }
}
