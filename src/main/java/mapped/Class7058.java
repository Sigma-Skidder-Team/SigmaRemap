package mapped;

import net.minecraft.nbt.ByteArrayNBT;
import net.minecraft.nbt.NBTSizeTracker;
import net.minecraft.nbt.INBTType;

import java.io.DataInput;
import java.io.IOException;

public final class Class7058 implements INBTType<ByteArrayNBT> {
   public ByteArrayNBT readNBT(DataInput var1, int var2, NBTSizeTracker var3) throws IOException {
      var3.read(192L);
      int var6 = var1.readInt();
      var3.read(8L * (long)var6);
      byte[] var7 = new byte[var6];
      var1.readFully(var7);
      return new ByteArrayNBT(var7);
   }

   @Override
   public String getName() {
      return "BYTE[]";
   }

   @Override
   public String getTagName() {
      return "TAG_Byte_Array";
   }
}
