package remapped;

import com.mojang.serialization.Codec;

public interface class_4263<P extends class_2609> {
   class_4263<class_8781> field_20660 = method_19857("single_pool_element", class_8781.field_44941);
   class_4263<class_6556> field_20662 = method_19857("list_pool_element", class_6556.field_33418);
   class_4263<class_9089> field_20658 = method_19857("feature_pool_element", class_9089.field_46545);
   class_4263<class_2044> field_20659 = method_19857("empty_pool_element", class_2044.field_10353);
   class_4263<class_6789> field_20661 = method_19857("legacy_single_pool_element", class_6789.field_35011);

   Codec<P> method_19856();

   static <P extends class_2609> class_4263<P> method_19857(String var0, Codec<P> var1) {
      return class_8669.<class_4263<P>>method_39791(class_8669.field_44392, var0, () -> var1);
   }
}
