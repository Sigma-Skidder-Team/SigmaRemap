package remapped;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;

public class class_6293 extends class_3089 {
   private static final List<class_3222> field_32164 = ImmutableList.of(new class_3222(EntityType.field_34265, 1, 1, 1));

   public class_6293(Codec<class_7805> var1) {
      super(var1, 0, true, true);
   }

   @Override
   public List<class_3222> method_24557() {
      return field_32164;
   }

   public boolean method_28721(
      class_6541 var1, class_3498 var2, long var3, class_8679 var5, int var6, int var7, class_6325 var8, class_2034 var9, class_7805 var10
   ) {
      int var13 = var6 >> 4;
      int var14 = var7 >> 4;
      var5.setSeed((long)(var13 ^ var14 << 4) ^ var3);
      var5.nextInt();
      return var5.nextInt(5) == 0 ? !this.method_28722(var1, var3, var5, var6, var7) : false;
   }

   private boolean method_28722(class_6541 var1, long var2, class_8679 var4, int var5, int var6) {
      class_4757 var9 = var1.method_29825().method_44376(class_5390.field_27516);
      if (var9 == null) {
         return false;
      } else {
         for (int var10 = var5 - 10; var10 <= var5 + 10; var10++) {
            for (int var11 = var6 - 10; var11 <= var6 + 10; var11++) {
               class_2034 var12 = class_5390.field_27516.method_24552(var9, var2, var4, var10, var11);
               if (var10 == var12.field_10328 && var11 == var12.field_10327) {
                  return true;
               }
            }
         }

         return false;
      }
   }
}
