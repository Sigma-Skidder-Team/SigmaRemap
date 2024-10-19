package mapped;

import net.minecraft.nbt.IntNBT;
import net.minecraft.nbt.NBTSizeTracker;
import net.minecraft.nbt.INBTType;

import java.io.DataInput;
import java.io.IOException;

public final class Class7065 implements INBTType<IntNBT> {
   public IntNBT readNBT(DataInput var1, int var2, NBTSizeTracker var3) throws IOException {
      var3.read(96L);
      return IntNBT.valueOf(var1.readInt());
   }

   @Override
   public String getName() {
      return "INT";
   }

   @Override
   public String getTagName() {
      return "TAG_Int";
   }

   @Override
   public boolean isPrimitive() {
      return true;
   }
}
