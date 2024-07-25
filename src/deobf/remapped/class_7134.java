package remapped;

import com.mojang.serialization.Codec;

public class class_7134 extends class_5390<class_1941> {
   public class_7134(Codec<class_1941> var1) {
      super(var1);
   }

   @Override
   public boolean method_24544() {
      return false;
   }

   public boolean method_32773(
      class_6541 var1, class_3498 var2, long var3, class_8679 var5, int var6, int var7, class_6325 var8, class_2034 var9, class_1941 var10
   ) {
      for (class_6325 var14 : var2.method_16087(var6 * 16 + 9, var1.method_29816(), var7 * 16 + 9, 32)) {
         if (!var14.method_28875().method_9458(this)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public class_1329<class_1941> method_24558() {
      return class_1061::new;
   }
}
