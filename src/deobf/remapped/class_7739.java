package remapped;

import com.mojang.serialization.Codec;

public class class_7739<P extends class_502> {
   public static final class_7739<class_6725> field_39242 = method_35033("simple_block_placer", class_6725.field_34732);
   public static final class_7739<class_9138> field_39245 = method_35033("double_plant_placer", class_9138.field_46736);
   public static final class_7739<class_5072> field_39243 = method_35033("column_placer", class_5072.field_26208);
   private final Codec<P> field_39244;

   private static <P extends class_502> class_7739<P> method_35033(String var0, Codec<P> var1) {
      return class_8669.<class_7739<P>>method_39791(class_8669.field_44410, var0, new class_7739<P>(var1));
   }

   private class_7739(Codec<P> var1) {
      this.field_39244 = var1;
   }

   public Codec<P> method_35034() {
      return this.field_39244;
   }
}
