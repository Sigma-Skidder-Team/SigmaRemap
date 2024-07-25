package remapped;

import com.mojang.serialization.Codec;

public class class_389<P extends class_2062> {
   public static final class_389<class_2540> field_1581 = method_1886("blob_foliage_placer", class_2540.field_12592);
   public static final class_389<class_9809> field_1584 = method_1886("spruce_foliage_placer", class_9809.field_49727);
   public static final class_389<class_1003> field_1580 = method_1886("pine_foliage_placer", class_1003.field_5169);
   public static final class_389<class_7901> field_1583 = method_1886("acacia_foliage_placer", class_7901.field_40398);
   public static final class_389<class_3561> field_1587 = method_1886("bush_foliage_placer", class_3561.field_17441);
   public static final class_389<class_4687> field_1589 = method_1886("fancy_foliage_placer", class_4687.field_22820);
   public static final class_389<class_3953> field_1588 = method_1886("jungle_foliage_placer", class_3953.field_19175);
   public static final class_389<class_4434> field_1586 = method_1886("mega_pine_foliage_placer", class_4434.field_21643);
   public static final class_389<class_8352> field_1582 = method_1886("dark_oak_foliage_placer", class_8352.field_42767);
   private final Codec<P> field_1579;

   private static <P extends class_2062> class_389<P> method_1886(String var0, Codec<P> var1) {
      return class_8669.<class_389<P>>method_39791(class_8669.field_44394, var0, new class_389<P>(var1));
   }

   private class_389(Codec<P> var1) {
      this.field_1579 = var1;
   }

   public Codec<P> method_1885() {
      return this.field_1579;
   }
}
