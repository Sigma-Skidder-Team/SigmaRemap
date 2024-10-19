package mapped;

import net.minecraft.nbt.NBTSizeTracker;
import net.minecraft.nbt.INBTType;
import net.minecraft.nbt.StringNBT;

import java.io.DataInput;
import java.io.IOException;

public final class Class7062 implements INBTType<StringNBT> {
   public StringNBT readNBT(DataInput var1, int var2, NBTSizeTracker var3) throws IOException {
      var3.read(288L);
      String var6 = var1.readUTF();
      var3.read((long)(16 * var6.length()));
      return StringNBT.valueOf(var6);
   }

   @Override
   public String getName() {
      return "STRING";
   }

   @Override
   public String getTagName() {
      return "TAG_String";
   }

   @Override
   public boolean isPrimitive() {
      return true;
   }
}
