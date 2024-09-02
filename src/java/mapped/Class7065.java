package mapped;

import net.minecraft.nbt.NBTSizeTracker;

import java.io.DataInput;
import java.io.IOException;

public final class Class7065 implements Class7052<Class36> {
   public Class36 readNBT(DataInput var1, int var2, NBTSizeTracker var3) throws IOException {
      var3.method29769(96L);
      return Class36.method95(var1.readInt());
   }

   @Override
   public String method21975() {
      return "INT";
   }

   @Override
   public String method21976() {
      return "TAG_Int";
   }

   @Override
   public boolean method21977() {
      return true;
   }
}
