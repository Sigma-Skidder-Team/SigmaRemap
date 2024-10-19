package mapped;

import net.minecraft.nbt.NBTSizeTracker;
import net.minecraft.nbt.INBTType;

import java.io.DataInput;
import java.io.IOException;

public final class Class7063 implements INBTType<ByteNBT> {
   public ByteNBT readNBT(DataInput var1, int var2, NBTSizeTracker var3) throws IOException {
      var3.read(72L);
      return ByteNBT.valueOf(var1.readByte());
   }

   @Override
   public String getName() {
      return "BYTE";
   }

   @Override
   public String getTagName() {
      return "TAG_Byte";
   }

   @Override
   public boolean isPrimitive() {
      return true;
   }
}
