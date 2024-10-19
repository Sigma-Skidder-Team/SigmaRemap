package mapped;

import net.minecraft.nbt.NBTSizeTracker;
import net.minecraft.nbt.INBTType;

import java.io.DataInput;
import java.io.IOException;

public final class Class7055 implements INBTType<LongNBT> {
   public LongNBT readNBT(DataInput var1, int var2, NBTSizeTracker var3) throws IOException {
      var3.read(128L);
      return LongNBT.valueOf(var1.readLong());
   }

   @Override
   public String getName() {
      return "LONG";
   }

   @Override
   public String getTagName() {
      return "TAG_Long";
   }

   @Override
   public boolean isPrimitive() {
      return true;
   }
}
