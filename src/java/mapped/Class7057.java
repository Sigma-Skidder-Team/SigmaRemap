package mapped;

import net.minecraft.nbt.DoubleNBT;
import net.minecraft.nbt.NBTSizeTracker;
import net.minecraft.nbt.INBTType;

import java.io.DataInput;
import java.io.IOException;

public final class Class7057 implements INBTType<DoubleNBT> {
   public DoubleNBT readNBT(DataInput var1, int var2, NBTSizeTracker var3) throws IOException {
      var3.read(128L);
      return DoubleNBT.valueOf(var1.readDouble());
   }

   @Override
   public String getName() {
      return "DOUBLE";
   }

   @Override
   public String getTagName() {
      return "TAG_Double";
   }

   @Override
   public boolean isPrimitive() {
      return true;
   }
}
