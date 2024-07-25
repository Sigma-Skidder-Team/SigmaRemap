package remapped;

import com.google.common.collect.Maps;
import java.io.DataInput;
import java.io.IOException;
import java.util.HashMap;

public final class class_2782 implements class_3265<CompoundNBT> {
   public CompoundNBT method_12652(DataInput var1, int var2, class_4694 var3) throws IOException {
      var3.method_21668(384L);
      if (var2 <= 512) {
         HashMap var6 = Maps.newHashMap();

         byte var7;
         while ((var7 = CompoundNBT.method_25966(var1, var3)) != 0) {
            String var8 = CompoundNBT.method_25971(var1, var3);
            var3.method_21668((long)(224 + 16 * var8.length()));
            class_8406 var9 = CompoundNBT.method_25945(class_81.method_172(var7), var8, var1, var2 + 1, var3);
            if (var6.put(var8, var9) != null) {
               var3.method_21668(288L);
            }
         }

         return new CompoundNBT(var6);
      } else {
         throw new RuntimeException("Tried to read NBT tag with too high complexity, depth > 512");
      }
   }

   @Override
   public String method_14892() {
      return "COMPOUND";
   }

   @Override
   public String method_14888() {
      return "TAG_Compound";
   }
}
