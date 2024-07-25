package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

public class class_9425 extends class_2103 {
   public static final Codec<class_9425> field_48153 = class_2958.field_14447.listOf().fieldOf("rules").xmap(class_9425::new, var0 -> var0.field_48152).codec();
   private final ImmutableList<class_2958> field_48152;

   public class_9425(List<? extends class_2958> var1) {
      this.field_48152 = ImmutableList.copyOf(var1);
   }

   @Nullable
   @Override
   public class_4099 method_9859(class_4924 var1, BlockPos var2, BlockPos var3, class_4099 var4, class_4099 var5, class_8478 var6) {
      Random var9 = new Random(MathHelper.getPositionRandom(var5.field_19965));
      class_2522 var10 = var1.method_28262(var5.field_19965);
      UnmodifiableIterator var11 = this.field_48152.iterator();

      while (var11.hasNext()) {
         class_2958 var12 = (class_2958)var11.next();
         if (var12.method_13531(var5.field_19967, var10, var4.field_19965, var5.field_19965, var3, var9)) {
            return new class_4099(var5.field_19965, var12.method_13533(), var12.method_13530());
         }
      }

      return var5;
   }

   @Override
   public class_2111<?> method_9858() {
      return class_2111.field_10584;
   }
}
