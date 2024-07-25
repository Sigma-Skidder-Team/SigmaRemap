package remapped;

import com.mojang.serialization.Codec;

public class class_2356<P extends class_8294> {
   public static final class_2356<class_2318> field_11831 = method_10808("two_layers_feature_size", class_2318.field_11610);
   public static final class_2356<class_9630> field_11833 = method_10808("three_layers_feature_size", class_9630.field_49046);
   private final Codec<P> field_11830;

   private static <P extends class_8294> class_2356<P> method_10808(String var0, Codec<P> var1) {
      return class_8669.<class_2356<P>>method_39791(class_8669.field_44390, var0, new class_2356<P>(var1));
   }

   private class_2356(Codec<P> var1) {
      this.field_11830 = var1;
   }

   public Codec<P> method_10807() {
      return this.field_11830;
   }
}
