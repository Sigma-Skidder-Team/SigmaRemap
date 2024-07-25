package remapped;

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class class_7391 extends class_6291 {
   public static final Codec<class_7391> field_37744 = class_7732.field_39221.fieldOf("provider").xmap(class_7391::new, var0 -> var0.field_37745).codec();
   private final class_7732 field_37745;

   public class_7391(class_7732 var1) {
      this.field_37745 = var1;
   }

   @Override
   public class_8783<?> method_28707() {
      return class_8783.field_44948;
   }

   @Override
   public void method_28703(class_700 var1, Random var2, List<BlockPos> var3, List<BlockPos> var4, Set<BlockPos> var5, class_9616 var6) {
      int var9 = ((BlockPos)var3.get(0)).getY();
      var3.stream().filter(var1x -> var1x.getY() == var9).forEach(var3x -> {
         this.method_33670(var1, var2, var3x.method_6108().method_6094());
         this.method_33670(var1, var2, var3x.method_6091(2).method_6094());
         this.method_33670(var1, var2, var3x.method_6108().method_6074(2));
         this.method_33670(var1, var2, var3x.method_6091(2).method_6074(2));

         for (int var6x = 0; var6x < 5; var6x++) {
            int var7 = var2.nextInt(64);
            int var8 = var7 % 8;
            int var9x = var7 / 8;
            if (var8 == 0 || var8 == 7 || var9x == 0 || var9x == 7) {
               this.method_33670(var1, var2, var3x.method_6104(-3 + var8, 0, -3 + var9x));
            }
         }
      });
   }

   private void method_33670(class_6755 var1, Random var2, BlockPos var3) {
      for (int var6 = -2; var6 <= 2; var6++) {
         for (int var7 = -2; var7 <= 2; var7++) {
            if (Math.abs(var6) != 2 || Math.abs(var7) != 2) {
               this.method_33671(var1, var2, var3.method_6104(var6, 0, var7));
            }
         }
      }
   }

   private void method_33671(class_6755 var1, Random var2, BlockPos var3) {
      for (int var6 = 2; var6 >= -3; var6--) {
         BlockPos var7 = var3.method_6082(var6);
         if (class_4285.method_19912(var1, var7)) {
            var1.method_7513(var7, this.field_37745.method_35002(var2, var3), 19);
            break;
         }

         if (!class_4285.method_19908(var1, var7) && var6 < 0) {
            break;
         }
      }
   }
}
