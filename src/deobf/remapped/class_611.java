package remapped;

import com.mojang.serialization.Codec;

public class class_611 implements class_9793, class_6157 {
   public static final Codec<class_611> field_3487 = class_3461.method_15933(-10, 128, 128)
      .fieldOf("count")
      .xmap(class_611::new, class_611::method_2873)
      .codec();
   private final class_3461 field_3488;

   public class_611(int var1) {
      this.field_3488 = class_3461.method_15935(var1);
   }

   public class_611(class_3461 var1) {
      this.field_3488 = var1;
   }

   public class_3461 method_2873() {
      return this.field_3488;
   }
}
