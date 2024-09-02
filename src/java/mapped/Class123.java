package mapped;

import com.google.common.collect.ImmutableSet;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.vector.Vector3d;

import java.util.Set;

public class Class123 implements ILootCondition {
   private static String[] field433;
   private final Class6671 field434;
   private final Class2063 field435;

   public Class123(Class6671 var1, Class2063 var2) {
      this.field434 = var1;
      this.field435 = var2;
   }

   @Override
   public Class7130 method354() {
      return Class8582.field38599;
   }

   @Override
   public Set<Class9821<?>> method355() {
      return ImmutableSet.of(Class9525.field44335, this.field435.method8717());
   }

   public boolean test(LootContext var1) {
      Entity var4 = var1.method26081(this.field435.method8717());
      Vector3d var5 = var1.<Vector3d>method26081(Class9525.field44335);
      return this.field434.method20329(var1.method26090(), var5, var4);
   }

   public static Class7519 method356(Class2063 var0) {
      return method357(var0, Class7552.method24700());
   }

   public static Class7519 method357(Class2063 var0, Class7552 var1) {
      return () -> new Class123(var1.method24717(), var0);
   }

   public static Class7519 method358(Class2063 var0, Class6671 var1) {
      return () -> new Class123(var1, var0);
   }

   // $VF: synthetic method
   public static Class6671 method361(Class123 var0) {
      return var0.field434;
   }

   // $VF: synthetic method
   public static Class2063 method362(Class123 var0) {
      return var0.field435;
   }
}
