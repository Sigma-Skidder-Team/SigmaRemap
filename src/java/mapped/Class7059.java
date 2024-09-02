package mapped;

import net.minecraft.nbt.NBTSizeTracker;

import java.io.DataInput;
import java.io.IOException;

public final class Class7059 implements Class7052<Class37> {
   public Class37 readNBT(DataInput var1, int var2, NBTSizeTracker var3) throws IOException {
      var3.method29769(80L);
      return Class37.method96(var1.readShort());
   }

   @Override
   public String method21975() {
      return "SHORT";
   }

   @Override
   public String method21976() {
      return "TAG_Short";
   }

   @Override
   public boolean method21977() {
      return true;
   }
}
