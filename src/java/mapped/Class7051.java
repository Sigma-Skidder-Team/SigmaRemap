package mapped;

import net.minecraft.nbt.EndNBT;
import net.minecraft.nbt.NBTSizeTracker;

import java.io.DataInput;

public final class Class7051 implements Class7052<EndNBT> {
   public EndNBT readNBT(DataInput var1, int var2, NBTSizeTracker var3) {
      var3.method29769(64L);
      return EndNBT.INSTANCE;
   }

   @Override
   public String method21975() {
      return "END";
   }

   @Override
   public String method21976() {
      return "TAG_End";
   }

   @Override
   public boolean method21977() {
      return true;
   }
}
