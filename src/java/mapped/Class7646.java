package mapped;

import com.mojang.serialization.Codec;

public class Class7646<P extends Class7617> {
   public static final Class7646<Class7616> field32820 = method25117("two_layers_feature_size", Class7616.field32668);
   public static final Class7646<Class7618> field32821 = method25117("three_layers_feature_size", Class7618.field32674);
   private final Codec<P> field32822;

   private static <P extends Class7617> Class7646<P> method25117(String var0, Codec<P> var1) {
      return Class2348.<Class7646<P>>method9194(Class2348.field16134, var0, new Class7646<P>(var1));
   }

   private Class7646(Codec<P> var1) {
      this.field32822 = var1;
   }

   public Codec<P> method25118() {
      return this.field32822;
   }
}
