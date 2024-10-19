package mapped;

import net.minecraft.nbt.FloatNBT;
import net.minecraft.nbt.NBTSizeTracker;
import net.minecraft.nbt.INBTType;

import java.io.DataInput;
import java.io.IOException;

public final class Class7056 implements INBTType<FloatNBT> {
   public FloatNBT readNBT(DataInput var1, int var2, NBTSizeTracker var3) throws IOException {
      var3.read(96L);
      return FloatNBT.valueOf(var1.readFloat());
   }

   @Override
   public String getName() {
      return "FLOAT";
   }

   @Override
   public String getTagName() {
      return "TAG_Float";
   }

   @Override
   public boolean isPrimitive() {
      return true;
   }
}
