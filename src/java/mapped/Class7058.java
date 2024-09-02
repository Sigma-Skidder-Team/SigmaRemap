package mapped;

import net.minecraft.nbt.ByteArrayNBT;
import net.minecraft.nbt.NBTSizeTracker;

import java.io.DataInput;
import java.io.IOException;

public final class Class7058 implements Class7052<ByteArrayNBT> {
   public ByteArrayNBT readNBT(DataInput var1, int var2, NBTSizeTracker var3) throws IOException {
      var3.method29769(192L);
      int var6 = var1.readInt();
      var3.method29769(8L * (long)var6);
      byte[] var7 = new byte[var6];
      var1.readFully(var7);
      return new ByteArrayNBT(var7);
   }

   @Override
   public String method21975() {
      return "BYTE[]";
   }

   @Override
   public String method21976() {
      return "TAG_Byte_Array";
   }
}
