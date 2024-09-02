package mapped;

import com.google.common.collect.Lists;
import net.minecraft.nbt.NBTTypes;
import net.minecraft.nbt.NBTSizeTracker;

import java.io.DataInput;
import java.io.IOException;
import java.util.ArrayList;

public final class Class7064 implements Class7052<ListNBT> {
   public ListNBT readNBT(DataInput var1, int var2, NBTSizeTracker var3) throws IOException {
      var3.method29769(296L);
      if (var2 > 512) {
         throw new RuntimeException("Tried to read NBT tag with too high complexity, depth > 512");
      } else {
         byte var6 = var1.readByte();
         int var7 = var1.readInt();
         if (var6 == 0 && var7 > 0) {
            throw new RuntimeException("Missing type on ListTag");
         } else {
            var3.method29769(32L * (long)var7);
            Class7052 var8 = NBTTypes.getGetTypeByID(var6);
            ArrayList var9 = Lists.newArrayListWithCapacity(var7);

            for (int var10 = 0; var10 < var7; var10++) {
               var9.add(var8.readNBT(var1, var2 + 1, var3));
            }

            return new ListNBT(var9, var6, null);
         }
      }
   }

   @Override
   public String method21975() {
      return "LIST";
   }

   @Override
   public String method21976() {
      return "TAG_List";
   }
}
