package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Supplier;

public class class_7805 implements class_6157 {
   public static final Codec<class_7805> field_39518 = RecordCodecBuilder.create(
      var0 -> var0.group(
               class_8115.field_41595.fieldOf("start_pool").forGetter(class_7805::method_35385),
               Codec.intRange(0, 7).fieldOf("size").forGetter(class_7805::method_35387)
            )
            .apply(var0, class_7805::new)
   );
   private final Supplier<class_8115> field_39516;
   private final int field_39517;

   public class_7805(Supplier<class_8115> var1, int var2) {
      this.field_39516 = var1;
      this.field_39517 = var2;
   }

   public int method_35387() {
      return this.field_39517;
   }

   public Supplier<class_8115> method_35385() {
      return this.field_39516;
   }
}
