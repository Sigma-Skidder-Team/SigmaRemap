package remapped;

import com.mojang.serialization.Codec;

public class class_6148 extends class_5390<class_4080> {
   public class_6148(Codec<class_4080> var1) {
      super(var1);
   }

   public boolean method_28199(
      class_6541 var1, class_3498 var2, long var3, class_8679 var5, int var6, int var7, class_6325 var8, class_2034 var9, class_4080 var10
   ) {
      var5.method_39865(var3, var6, var7, 10387320);
      return var5.nextFloat() < var10.field_19859;
   }

   @Override
   public class_1329<class_4080> method_24558() {
      return class_5025::new;
   }
}
