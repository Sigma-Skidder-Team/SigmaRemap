package mapped;

import net.minecraft.nbt.EndNBT;
import net.minecraft.nbt.NBTSizeTracker;

import java.io.DataInput;
import java.io.IOException;

public final class Class7060 implements Class7052<EndNBT> {
   public final int field30442;

   public Class7060(int var1) {
      this.field30442 = var1;
   }

   public EndNBT readNBT(DataInput var1, int var2, NBTSizeTracker var3) throws IOException {
      throw new IllegalArgumentException("Invalid tag id: " + this.field30442);
   }

   @Override
   public String method21975() {
      return "INVALID[" + this.field30442 + "]";
   }

   @Override
   public String method21976() {
      return "UNKNOWN_" + this.field30442;
   }
}
