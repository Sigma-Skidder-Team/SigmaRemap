package remapped;

import com.mojang.serialization.Codec;

public class class_7027<P extends class_1131> {
   public static final class_7027<class_3159> field_36192 = method_32059("straight_trunk_placer", class_3159.field_15689);
   public static final class_7027<class_4422> field_36193 = method_32059("forking_trunk_placer", class_4422.field_21615);
   public static final class_7027<class_3239> field_36189 = method_32059("giant_trunk_placer", class_3239.field_16107);
   public static final class_7027<class_6817> field_36196 = method_32059("mega_jungle_trunk_placer", class_6817.field_35158);
   public static final class_7027<class_9125> field_36194 = method_32059("dark_oak_trunk_placer", class_9125.field_46686);
   public static final class_7027<class_6153> field_36191 = method_32059("fancy_trunk_placer", class_6153.field_31522);
   private final Codec<P> field_36190;

   private static <P extends class_1131> class_7027<P> method_32059(String var0, Codec<P> var1) {
      return class_8669.<class_7027<P>>method_39791(class_8669.field_44432, var0, new class_7027<P>(var1));
   }

   private class_7027(Codec<P> var1) {
      this.field_36190 = var1;
   }

   public Codec<P> method_32060() {
      return this.field_36190;
   }
}
