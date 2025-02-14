package net.minecraft.world.lighting;

import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import net.minecraft.world.chunk.NibbleArray;

import javax.annotation.Nullable;

public abstract class LightDataMap<M extends LightDataMap<M>> {
   private final long[] field32565 = new long[2];
   private final NibbleArray[] field32566 = new NibbleArray[2];
   private boolean field32567;
   public final Long2ObjectOpenHashMap<NibbleArray> field32568;

   public LightDataMap(Long2ObjectOpenHashMap<NibbleArray> var1) {
      this.field32568 = var1;
      this.method24834();
      this.field32567 = true;
   }

   public abstract M method24828();

   public void method24829(long var1) {
      this.field32568.put(var1, this.field32568.get(var1).method20676());
      this.method24834();
   }

   public boolean method24830(long var1) {
      return this.field32568.containsKey(var1);
   }

   @Nullable
   public NibbleArray method24831(long var1) {
      if (this.field32567) {
         for (int var5 = 0; var5 < 2; ++var5) {
            if (var1 == this.field32565[var5]) {
               return this.field32566[var5];
            }
         }
      }

      NibbleArray var7 = this.field32568.get(var1);
      if (var7 == null) {
         return null;
      } else {
         if (this.field32567) {
            for (int var6 = 1; var6 > 0; --var6) {
               this.field32565[var6] = this.field32565[var6 - 1];
               this.field32566[var6] = this.field32566[var6 - 1];
            }

            this.field32565[0] = var1;
            this.field32566[0] = var7;
         }

         return var7;
      }
   }

   @Nullable
   public NibbleArray method24832(long var1) {
      return this.field32568.remove(var1);
   }

   public void setArray(long var1, NibbleArray var3) {
      this.field32568.put(var1, var3);
   }

   public void method24834() {
      for (int var3 = 0; var3 < 2; ++var3) {
         this.field32565[var3] = Long.MAX_VALUE;
         this.field32566[var3] = null;
      }
   }

   public void method24835() {
      this.field32567 = false;
   }
}
