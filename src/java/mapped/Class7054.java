package mapped;

import com.google.common.collect.Maps;
import net.minecraft.nbt.NBTTypes;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.INBT;
import net.minecraft.nbt.NBTSizeTracker;

import java.io.DataInput;
import java.io.IOException;
import java.util.HashMap;

public final class Class7054 implements Class7052<CompoundNBT> {
   public CompoundNBT readNBT(DataInput var1, int var2, NBTSizeTracker var3) throws IOException {
      var3.method29769(384L);
      if (var2 <= 512) {
         HashMap var6 = Maps.newHashMap();

         byte var7;
         while ((var7 = CompoundNBT.method147(var1, var3)) != 0) {
            String var8 = CompoundNBT.method148(var1, var3);
            var3.method29769((long)(224 + 16 * var8.length()));
            INBT var9 = CompoundNBT.method149(NBTTypes.getGetTypeByID(var7), var8, var1, var2 + 1, var3);
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
