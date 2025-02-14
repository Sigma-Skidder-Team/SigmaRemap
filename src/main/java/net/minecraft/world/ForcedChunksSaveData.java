package net.minecraft.world;

import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import net.minecraft.world.storage.WorldSavedData;
import net.minecraft.nbt.CompoundNBT;

public class ForcedChunksSaveData extends WorldSavedData {
   private LongSet field32343 = new LongOpenHashSet();

   public ForcedChunksSaveData() {
      super("chunks");
   }

   @Override
   public void read(CompoundNBT compoundNBT) {
      this.field32343 = new LongOpenHashSet(compoundNBT.getLongArray("Forced"));
   }

   @Override
   public CompoundNBT write(CompoundNBT compoundNBT) {
      compoundNBT.putLongArray("Forced", this.field32343.toLongArray());
      return compoundNBT;
   }

   public LongSet getChunks() {
      return this.field32343;
   }
}
