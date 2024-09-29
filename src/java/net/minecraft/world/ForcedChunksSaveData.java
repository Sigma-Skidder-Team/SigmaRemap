package net.minecraft.world;

import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import mapped.Class7530;
import net.minecraft.nbt.CompoundNBT;

public class ForcedChunksSaveData extends Class7530 {
   private LongSet field32343 = new LongOpenHashSet();

   public ForcedChunksSaveData() {
      super("chunks");
   }

   @Override
   public void method24591(CompoundNBT var1) {
      this.field32343 = new LongOpenHashSet(var1.getLongArray("Forced"));
   }

   @Override
   public CompoundNBT method24592(CompoundNBT var1) {
      var1.method113("Forced", this.field32343.toLongArray());
      return var1;
   }

   public LongSet getChunks() {
      return this.field32343;
   }
}
