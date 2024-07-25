package remapped;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class class_3159 extends class_1131 {
   private static String[] field_15690;
   public static final Codec<class_3159> field_15689 = RecordCodecBuilder.create(var0 -> method_4972(var0).apply(var0, class_3159::new));

   public class_3159(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   @Override
   public class_7027<?> method_4970() {
      return class_7027.field_36192;
   }

   @Override
   public List<class_8070> method_4966(class_6755 var1, Random var2, int var3, class_1331 var4, Set<class_1331> var5, class_9616 var6, class_1297 var7) {
      method_4969(var1, var4.method_6100());

      for (int var10 = 0; var10 < var3; var10++) {
         method_4974(var1, var2, var4.method_6082(var10), var5, var6, var7);
      }

      return ImmutableList.of(new class_8070(var4.method_6082(var3), 0, false));
   }
}
