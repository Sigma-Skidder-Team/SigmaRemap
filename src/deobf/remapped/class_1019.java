package remapped;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;

public class class_1019 extends class_5390<class_1941> {
   private static final List<class_3222> field_5333 = ImmutableList.of(
      new class_3222(class_6629.field_34301, 10, 2, 3),
      new class_3222(class_6629.field_34234, 5, 4, 4),
      new class_3222(class_6629.field_34317, 8, 5, 5),
      new class_3222(class_6629.field_34241, 2, 5, 5),
      new class_3222(class_6629.field_34295, 3, 4, 4)
   );

   public class_1019(Codec<class_1941> var1) {
      super(var1);
   }

   public boolean method_4508(
      class_6541 var1, class_3498 var2, long var3, class_8679 var5, int var6, int var7, class_6325 var8, class_2034 var9, class_1941 var10
   ) {
      return var5.nextInt(5) < 2;
   }

   @Override
   public class_1329<class_1941> method_24558() {
      return class_8798::new;
   }

   @Override
   public List<class_3222> method_24557() {
      return field_5333;
   }
}
