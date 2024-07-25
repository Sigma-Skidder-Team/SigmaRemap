package remapped;

import com.mojang.serialization.Codec;

public class class_2463 extends class_5390<class_9507> {
   public class_2463(Codec<class_9507> var1) {
      super(var1);
   }

   public boolean method_11351(
      class_6541 var1, class_3498 var2, long var3, class_8679 var5, int var6, int var7, class_6325 var8, class_2034 var9, class_9507 var10
   ) {
      var5.method_39861(var3, var6, var7);
      double var13 = (double)var10.field_48405;
      return var5.nextDouble() < var13;
   }

   @Override
   public class_1329<class_9507> method_24558() {
      return class_2981::new;
   }
}
