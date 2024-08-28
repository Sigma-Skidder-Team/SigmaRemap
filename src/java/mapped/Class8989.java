package mapped;

import com.mojang.serialization.Codec;

public interface Class8989<P extends Class8033> {
   Class8989<Class8034> field41001 = method33194("always_true", Class8034.field34521);
   Class8989<Class8032> field41002 = method33194("linear_pos", Class8032.field34514);
   Class8989<Class8035> field41003 = method33194("axis_aligned_linear_pos", Class8035.field34523);

   Codec<P> method33193();

   static <P extends Class8033> Class8989<P> method33194(String var0, Codec<P> var1) {
      return Registry.<Class8989<P>>method9194(Registry.field16083, var0, () -> var1);
   }
}
