package remapped;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;

public class class_2664 extends class_5390<class_1941> {
   private static final List<class_3222> field_13106 = ImmutableList.of(new class_3222(class_6629.field_34220, 1, 1, 1));
   private static final List<class_3222> field_13107 = ImmutableList.of(new class_3222(class_6629.field_34249, 1, 1, 1));

   public class_2664(Codec<class_1941> var1) {
      super(var1);
   }

   @Override
   public class_1329<class_1941> method_24558() {
      return class_9372::new;
   }

   @Override
   public List<class_3222> method_24557() {
      return field_13106;
   }

   @Override
   public List<class_3222> method_24550() {
      return field_13107;
   }
}
