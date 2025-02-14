package mapped;

import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.world.storage.WorldSavedData;

public class Class7533 extends WorldSavedData {
   private LongSet field32337 = new LongOpenHashSet();
   private LongSet field32338 = new LongOpenHashSet();

   public Class7533(String var1) {
      super(var1);
   }

   @Override
   public void read(CompoundNBT compoundNBT) {
      this.field32337 = new LongOpenHashSet(compoundNBT.getLongArray("All"));
      this.field32338 = new LongOpenHashSet(compoundNBT.getLongArray("Remaining"));
   }

   @Override
   public CompoundNBT write(CompoundNBT compoundNBT) {
      compoundNBT.putLongArray("All", this.field32337.toLongArray());
      compoundNBT.putLongArray("Remaining", this.field32338.toLongArray());
      return compoundNBT;
   }

   public void method24619(long var1) {
      this.field32337.add(var1);
      this.field32338.add(var1);
   }

   public boolean method24620(long var1) {
      return this.field32337.contains(var1);
   }

   public boolean method24621(long var1) {
      return this.field32338.contains(var1);
   }

   public void method24622(long var1) {
      this.field32338.remove(var1);
   }

   public LongSet method24623() {
      return this.field32337;
   }
}
