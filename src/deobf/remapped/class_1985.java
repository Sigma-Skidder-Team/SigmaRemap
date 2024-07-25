package remapped;

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class class_1985 extends class_6291 {
   private static String[] field_10056;
   public static final Codec<class_1985> field_10055 = Codec.unit(() -> class_1985.field_10057);
   public static final class_1985 field_10057 = new class_1985();

   @Override
   public class_8783<?> method_28707() {
      return class_8783.field_44947;
   }

   @Override
   public void method_28703(class_700 var1, Random var2, List<BlockPos> var3, List<BlockPos> var4, Set<BlockPos> var5, class_9616 var6) {
      var4.forEach(var5x -> {
         if (var2.nextInt(4) == 0) {
            BlockPos var8 = var5x.method_6108();
            if (class_4285.method_19908(var1, var8)) {
               this.method_9157(var1, var8, class_4196.field_20415, var5, var6);
            }
         }

         if (var2.nextInt(4) == 0) {
            BlockPos var9 = var5x.method_6090();
            if (class_4285.method_19908(var1, var9)) {
               this.method_9157(var1, var9, class_4196.field_20409, var5, var6);
            }
         }

         if (var2.nextInt(4) == 0) {
            BlockPos var10 = var5x.method_6094();
            if (class_4285.method_19908(var1, var10)) {
               this.method_9157(var1, var10, class_4196.field_20408, var5, var6);
            }
         }

         if (var2.nextInt(4) == 0) {
            BlockPos var11 = var5x.method_6073();
            if (class_4285.method_19908(var1, var11)) {
               this.method_9157(var1, var11, class_4196.field_20411, var5, var6);
            }
         }
      });
   }

   private void method_9157(class_6755 var1, BlockPos var2, class_6720 var3, Set<BlockPos> var4, class_9616 var5) {
      this.method_28705(var1, var2, var3, var4, var5);
      int var8 = 4;

      for (BlockPos var9 = var2.method_6100(); class_4285.method_19908(var1, var9) && var8 > 0; var8--) {
         this.method_28705(var1, var9, var3, var4, var5);
         var9 = var9.method_6100();
      }
   }
}
