package remapped;

import com.mojang.serialization.Codec;

public interface class_7768<P extends class_2710> {
   class_7768<class_6771> field_39366 = method_35238("always_true", class_6771.field_34943);
   class_7768<class_9034> field_39367 = method_35238("block_match", class_9034.field_46220);
   class_7768<class_649> field_39365 = method_35238("blockstate_match", class_649.field_3624);
   class_7768<class_5893> field_39364 = method_35238("tag_match", class_5893.field_29933);
   class_7768<class_3500> field_39368 = method_35238("random_block_match", class_3500.field_17164);
   class_7768<class_4863> field_39369 = method_35238("random_blockstate_match", class_4863.field_24218);

   Codec<P> method_35239();

   static <P extends class_2710> class_7768<P> method_35238(String var0, Codec<P> var1) {
      return class_8669.<class_7768<P>>method_39791(class_8669.field_44407, var0, () -> var1);
   }
}
