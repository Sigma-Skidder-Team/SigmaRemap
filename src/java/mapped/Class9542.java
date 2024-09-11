package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.util.registry.Registry;

public class Class9542<P extends Class7139> {
   public static final Class9542<Class7143> field44428 = method36923("trunk_vine", Class7143.field30705);
   public static final Class9542<Class7140> field44429 = method36923("leave_vine", Class7140.field30698);
   public static final Class9542<Class7138> field44430 = method36923("cocoa", Class7138.field30694);
   public static final Class9542<Class7141> field44431 = method36923("beehive", Class7141.field30700);
   public static final Class9542<Class7142> field44432 = method36923("alter_ground", Class7142.field30702);
   private final Codec<P> field44433;

   private static <P extends Class7139> Class9542<P> method36923(String var0, Codec<P> var1) {
      return Registry.<Class9542<P>>method9194(Registry.field16133, var0, new Class9542<P>(var1));
   }

   private Class9542(Codec<P> var1) {
      this.field44433 = var1;
   }

   public Codec<P> method36924() {
      return this.field44433;
   }
}
