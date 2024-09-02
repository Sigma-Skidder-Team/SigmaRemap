package mapped;

import net.minecraft.nbt.EndNBT;
import net.minecraft.nbt.INBT;
import net.minecraft.nbt.NBTSizeTracker;

import java.io.DataInput;
import java.io.IOException;

public interface Class7052<T extends INBT> {
   T readNBT(DataInput var1, int var2, NBTSizeTracker var3) throws IOException;

   default boolean method21977() {
      return false;
   }

   String method21975();

   String method21976();

   static Class7052<EndNBT> method21979(int var0) {
      return new Class7060(var0);
   }
}
