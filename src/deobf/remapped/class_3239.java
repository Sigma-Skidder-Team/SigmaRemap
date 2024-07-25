package remapped;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class class_3239 extends class_1131 {
   private static String[] field_16106;
   public static final Codec<class_3239> field_16107 = RecordCodecBuilder.create(var0 -> method_4972(var0).apply(var0, class_3239::new));

   public class_3239(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   @Override
   public class_7027<?> method_4970() {
      return class_7027.field_36189;
   }

   @Override
   public List<class_8070> method_4966(class_6755 var1, Random var2, int var3, class_1331 var4, Set<class_1331> var5, class_9616 var6, class_1297 var7) {
      class_1331 var10 = var4.method_6100();
      method_4969(var1, var10);
      method_4969(var1, var10.method_6090());
      method_4969(var1, var10.method_6073());
      method_4969(var1, var10.method_6073().method_6090());
      class_2921 var11 = new class_2921();

      for (int var12 = 0; var12 < var3; var12++) {
         method_14837(var1, var2, var11, var5, var6, var7, var4, 0, var12, 0);
         if (var12 < var3 - 1) {
            method_14837(var1, var2, var11, var5, var6, var7, var4, 1, var12, 0);
            method_14837(var1, var2, var11, var5, var6, var7, var4, 1, var12, 1);
            method_14837(var1, var2, var11, var5, var6, var7, var4, 0, var12, 1);
         }
      }

      return ImmutableList.of(new class_8070(var4.method_6082(var3), 0, true));
   }

   private static void method_14837(
      class_6755 var0, Random var1, class_2921 var2, Set<class_1331> var3, class_9616 var4, class_1297 var5, class_1331 var6, int var7, int var8, int var9
   ) {
      var2.method_13360(var6, var7, var8, var9);
      method_4968(var0, var1, var2, var3, var4, var5);
   }
}
