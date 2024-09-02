package mapped;

import com.google.common.collect.ImmutableSet;
import net.minecraft.util.math.vector.Vector3d;

import java.util.Set;

public class Class153 implements ILootCondition {
   private static String[] field501;
   private final Class9539 field502;

   public Class153(Class9539 var1) {
      this.field502 = var1;
   }

   @Override
   public Class7130 method354() {
      return Class8582.field38606;
   }

   @Override
   public Set<Class9821<?>> method355() {
      return ImmutableSet.of(Class9525.field44335, Class9525.field44332);
   }

   public boolean test(LootContext var1) {
      Class8654 var4 = var1.<Class8654>method26081(Class9525.field44332);
      Vector3d var5 = var1.<Vector3d>method26081(Class9525.field44335);
      return var5 != null && var4 != null && this.field502.method36912(var1.method26090(), var5, var4);
   }

   public static Class7519 method462(Class9714 var0) {
      return () -> new Class153(var0.method38060());
   }

   // $VF: synthetic method
   public static Class9539 method464(Class153 var0) {
      return var0.field502;
   }
}
