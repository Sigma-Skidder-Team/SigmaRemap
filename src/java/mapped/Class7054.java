package mapped;

import com.google.common.collect.Maps;
import java.io.DataInput;
import java.io.IOException;
import java.util.HashMap;

public final class Class7054 implements Class7052<CompoundNBT> {
   public CompoundNBT method21978(DataInput var1, int var2, Class8465 var3) throws IOException {
      var3.method29769(384L);
      if (var2 <= 512) {
         HashMap var6 = Maps.newHashMap();

         byte var7;
         while ((var7 = CompoundNBT.method147(var1, var3)) != 0) {
            String var8 = CompoundNBT.method148(var1, var3);
            var3.method29769((long)(224 + 16 * var8.length()));
            Class30 var9 = CompoundNBT.method149(Class3571.method12200(var7), var8, var1, var2 + 1, var3);
            if (var6.put(var8, var9) != null) {
               var3.method29769(288L);
            }
         }

         return new CompoundNBT(var6);
      } else {
         throw new RuntimeException("Tried to read NBT tag with too high complexity, depth > 512");
      }
   }

   @Override
   public String method21975() {
      return "COMPOUND";
   }

   @Override
   public String method21976() {
      return "TAG_Compound";
   }
}
