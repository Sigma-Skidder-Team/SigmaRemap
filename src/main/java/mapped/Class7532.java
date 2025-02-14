package mapped;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.world.storage.WorldSavedData;

public class Class7532 extends WorldSavedData {
   private final Object2IntMap<String> field32336 = new Object2IntOpenHashMap();

   public Class7532() {
      super("idcounts");
      this.field32336.defaultReturnValue(-1);
   }

   @Override
   public void read(CompoundNBT compoundNBT) {
      this.field32336.clear();

      for (String var5 : compoundNBT.keySet()) {
         if (compoundNBT.contains(var5, 99)) {
            this.field32336.put(var5, compoundNBT.getInt(var5));
         }
      }
   }

   @Override
   public CompoundNBT write(CompoundNBT compoundNBT) {
      ObjectIterator var4 = this.field32336.object2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry var5 = (Entry)var4.next();
         compoundNBT.putInt((String)var5.getKey(), var5.getIntValue());
      }

      return compoundNBT;
   }

   public int method24618() {
      int var3 = this.field32336.getInt("map") + 1;
      this.field32336.put("map", var3);
      this.markDirty();
      return var3;
   }
}
