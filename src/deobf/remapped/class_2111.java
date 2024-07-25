package remapped;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Supplier;

public interface class_2111<P extends class_2103> {
   class_2111<class_2010> field_10589 = method_9881("block_ignore", class_2010.field_10192);
   class_2111<class_9098> field_10594 = method_9881("block_rot", class_9098.field_46603);
   class_2111<class_4943> field_10593 = method_9881("gravity", class_4943.field_25594);
   class_2111<class_9172> field_10582 = method_9881("jigsaw_replacement", class_9172.field_46940);
   class_2111<class_9425> field_10584 = method_9881("rule", class_9425.field_48153);
   class_2111<class_6859> field_10590 = method_9881("nop", class_6859.field_35345);
   class_2111<class_6171> field_10588 = method_9881("block_age", class_6171.field_31577);
   class_2111<class_1374> field_10587 = method_9881("blackstone_replace", class_1374.field_7458);
   class_2111<class_9146> field_10592 = method_9881("lava_submerged_block", class_9146.field_46775);
   Codec<class_2103> field_10585 = class_8669.field_44399.dispatch("processor_type", class_2103::method_9858, class_2111::method_9880);
   Codec<class_86> field_10586 = field_10585.listOf().xmap(class_86::new, class_86::method_210);
   Codec<class_86> field_10591 = Codec.either(field_10586.fieldOf("processors").codec(), field_10586)
      .xmap(var0 -> (class_86)var0.map(var0x -> var0x, var0x -> var0x), Either::left);
   Codec<Supplier<class_86>> field_10583 = class_6833.<Supplier<class_86>>method_31333(class_8669.field_44386, field_10591);

   Codec<P> method_9880();

   static <P extends class_2103> class_2111<P> method_9881(String var0, Codec<P> var1) {
      return class_8669.<class_2111<P>>method_39791(class_8669.field_44399, var0, () -> var1);
   }
}
