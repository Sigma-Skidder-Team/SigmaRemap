package mapped;

import net.minecraft.nbt.NBTSizeTracker;
import net.minecraft.nbt.INBTType;
import net.minecraft.nbt.ShortNBT;

import java.io.DataInput;
import java.io.IOException;

public final class Class7059 implements INBTType<ShortNBT> {
   public ShortNBT readNBT(DataInput var1, int var2, NBTSizeTracker var3) throws IOException {
      var3.read(80L);
      return ShortNBT.valueOf(var1.readShort());
   }

   @Override
   public String getName() {
      return "SHORT";
   }

   @Override
   public String getTagName() {
      return "TAG_Short";
   }

   @Override
   public boolean isPrimitive() {
      return true;
   }
}
