package remapped;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;

public class class_5202 extends class_5390<class_1941> {
   private static final List<class_3222> field_26743 = ImmutableList.of(new class_3222(class_6629.field_34307, 1, 2, 4));

   public class_5202(Codec<class_1941> var1) {
      super(var1);
   }

   @Override
   public boolean method_24544() {
      return false;
   }

   public boolean method_23876(
      class_6541 var1, class_3498 var2, long var3, class_8679 var5, int var6, int var7, class_6325 var8, class_2034 var9, class_1941 var10
   ) {
      for (class_6325 var14 : var2.method_16087(var6 * 16 + 9, var1.method_29816(), var7 * 16 + 9, 16)) {
         if (!var14.method_28875().method_9458(this)) {
            return false;
         }
      }

      for (class_6325 var16 : var2.method_16087(var6 * 16 + 9, var1.method_29816(), var7 * 16 + 9, 29)) {
         if (var16.method_28887() != class_8862.field_45309 && var16.method_28887() != class_8862.field_45297) {
            return false;
         }
      }

      return true;
   }

   @Override
   public class_1329<class_1941> method_24558() {
      return class_801::new;
   }

   @Override
   public List<class_3222> method_24557() {
      return field_26743;
   }
}
