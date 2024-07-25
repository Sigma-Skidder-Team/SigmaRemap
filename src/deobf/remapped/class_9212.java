package remapped;

import com.mojang.serialization.Codec;

public class class_9212<P extends class_7732> {
   public static final class_9212<class_6516> field_47120 = method_42550("simple_state_provider", class_6516.field_33176);
   public static final class_9212<class_6534> field_47118 = method_42550("weighted_state_provider", class_6534.field_33232);
   public static final class_9212<class_880> field_47119 = method_42550("plain_flower_provider", class_880.field_4536);
   public static final class_9212<class_5254> field_47122 = method_42550("forest_flower_provider", class_5254.field_26903);
   public static final class_9212<class_5675> field_47124 = method_42550("rotated_block_provider", class_5675.field_28762);
   private final Codec<P> field_47123;

   private static <P extends class_7732> class_9212<P> method_42550(String var0, Codec<P> var1) {
      return class_8669.<class_9212<P>>method_39791(class_8669.field_44397, var0, new class_9212<P>(var1));
   }

   private class_9212(Codec<P> var1) {
      this.field_47123 = var1;
   }

   public Codec<P> method_42552() {
      return this.field_47123;
   }
}
