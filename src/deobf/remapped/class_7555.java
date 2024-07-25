package remapped;

import com.google.common.collect.Lists;
import java.io.DataInput;
import java.io.IOException;
import java.util.ArrayList;

public final class class_7555 implements class_3265<class_3416> {
   public class_3416 method_34386(DataInput var1, int var2, class_4694 var3) throws IOException {
      var3.method_21668(296L);
      if (var2 > 512) {
         throw new RuntimeException("Tried to read NBT tag with too high complexity, depth > 512");
      } else {
         byte var6 = var1.readByte();
         int var7 = var1.readInt();
         if (var6 == 0 && var7 > 0) {
            throw new RuntimeException("Missing type on ListTag");
         } else {
            var3.method_21668(32L * (long)var7);
            class_3265 var8 = class_81.method_172(var6);
            ArrayList var9 = Lists.newArrayListWithCapacity(var7);

            for (int var10 = 0; var10 < var7; var10++) {
               var9.add(var8.method_14890(var1, var2 + 1, var3));
            }

            return new class_3416(var9, var6, null);
         }
      }
   }

   @Override
   public String method_14892() {
      return "LIST";
   }

   @Override
   public String method_14888() {
      return "TAG_List";
   }
}
