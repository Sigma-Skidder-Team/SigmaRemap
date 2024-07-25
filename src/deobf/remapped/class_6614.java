package remapped;

import com.mojang.serialization.Codec;

public interface class_6614<P extends class_5892> {
   class_6614<class_7607> field_34167 = method_30404("always_true", class_7607.field_38727);
   class_6614<class_3412> field_34166 = method_30404("linear_pos", class_3412.field_16802);
   class_6614<class_6653> field_34168 = method_30404("axis_aligned_linear_pos", class_6653.field_34426);

   Codec<P> method_30403();

   static <P extends class_5892> class_6614<P> method_30404(String var0, Codec<P> var1) {
      return class_8669.<class_6614<P>>method_39791(class_8669.field_44366, var0, () -> var1);
   }
}
