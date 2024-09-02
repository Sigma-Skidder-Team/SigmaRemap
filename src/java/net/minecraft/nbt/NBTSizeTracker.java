package net.minecraft.nbt;

import mapped.Class8466;

public class NBTSizeTracker {
   public static final NBTSizeTracker INFINITE = new Class8466(0L);
   private final long field36285;
   private long field36286;

   public NBTSizeTracker(long var1) {
      this.field36285 = var1;
   }

   public void method29769(long var1) {
      this.field36286 += var1 / 8L;
      if (this.field36286 > this.field36285) {
         throw new RuntimeException(
            "Tried to read NBT tag that was too big; tried to allocate: " + this.field36286 + "bytes where max allowed: " + this.field36285
         );
      }
   }
}
