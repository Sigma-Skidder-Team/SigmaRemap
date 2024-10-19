package mapped;

import net.minecraft.nbt.EndNBT;
import net.minecraft.nbt.NBTSizeTracker;
import net.minecraft.nbt.INBTType;

import java.io.DataInput;

public final class Class7051 implements INBTType<EndNBT> {
   public EndNBT readNBT(DataInput var1, int var2, NBTSizeTracker var3) {
      var3.read(64L);
      return EndNBT.INSTANCE;
   }

   @Override
   public String getName() {
      return "END";
   }

   @Override
   public String getTagName() {
      return "TAG_End";
   }

   @Override
   public boolean isPrimitive() {
      return true;
   }
}
