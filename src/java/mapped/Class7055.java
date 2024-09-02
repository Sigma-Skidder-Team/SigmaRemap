package mapped;

import net.minecraft.nbt.NBTSizeTracker;

import java.io.DataInput;
import java.io.IOException;

public final class Class7055 implements Class7052<Class35> {
   public Class35 readNBT(DataInput var1, int var2, NBTSizeTracker var3) throws IOException {
      var3.method29769(128L);
      return Class35.method94(var1.readLong());
   }

   @Override
   public String method21975() {
      return "LONG";
   }

   @Override
   public String method21976() {
      return "TAG_Long";
   }

   @Override
   public boolean method21977() {
      return true;
   }
}
