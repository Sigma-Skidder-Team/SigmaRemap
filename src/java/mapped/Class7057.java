package mapped;

import net.minecraft.nbt.NBTSizeTracker;

import java.io.DataInput;
import java.io.IOException;

public final class Class7057 implements Class7052<Class34> {
   public Class34 readNBT(DataInput var1, int var2, NBTSizeTracker var3) throws IOException {
      var3.method29769(128L);
      return Class34.method93(var1.readDouble());
   }

   @Override
   public String method21975() {
      return "DOUBLE";
   }

   @Override
   public String method21976() {
      return "TAG_Double";
   }

   @Override
   public boolean method21977() {
      return true;
   }
}
