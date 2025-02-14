package net.minecraft.world.lighting;

import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import mapped.Long2ByteOpenHashMap;
import mapped.LongLinkedOpenHashSet;
import net.minecraft.util.math.MathHelper;

import java.util.function.LongConsumer;
import java.util.function.LongPredicate;

public abstract class LevelBasedGraph {
   private final int levelCount;
   private final it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet[] updatesByLevel;
   private final Long2ByteMap propagationLevels;
   private int minLevelToUpdate;
   private volatile boolean needsUpdate;

   protected LevelBasedGraph(int var1, int var2, int var3) {
      if (var1 >= 254) {
         throw new IllegalArgumentException("Level count must be < 254.");
      } else {
         this.levelCount = var1;
         this.updatesByLevel = new it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet[var1];

         for (int var6 = 0; var6 < var1; var6++) {
            this.updatesByLevel[var6] = new LongLinkedOpenHashSet(this, var2, 0.5F, var2);
         }

         this.propagationLevels = new Long2ByteOpenHashMap(this, var3, 0.5F, var3);
         this.propagationLevels.defaultReturnValue((byte)-1);
         this.minLevelToUpdate = var1;
      }
   }

   private int minLevel(int var1, int var2) {
      int var5 = var1;
      if (var1 > var2) {
         var5 = var2;
      }

      if (var5 > this.levelCount - 1) {
         var5 = this.levelCount - 1;
      }

      return var5;
   }

   private void updateMinLevel(int var1) {
      int var4 = this.minLevelToUpdate;
      this.minLevelToUpdate = var1;

      for (int var5 = var4 + 1; var5 < var1; var5++) {
         if (!this.updatesByLevel[var5].isEmpty()) {
            this.minLevelToUpdate = var5;
            break;
         }
      }
   }

   protected void cancelUpdate(long var1) {
      int var5 = this.propagationLevels.get(var1) & 255;
      if (var5 != 255) {
         int var6 = this.getLevel(var1);
         int var7 = this.minLevel(var6, var5);
         this.removeToUpdate(var1, var7, this.levelCount, true);
         this.needsUpdate = this.minLevelToUpdate < this.levelCount;
      }
   }

   public void func_227465_a_(LongPredicate var1) {
      LongArrayList var4 = new LongArrayList();
      this.propagationLevels.keySet().forEach((long var2) -> {
         if (var1.test(var2)) {
            var4.add(var2);
         }
      });
      var4.forEach((LongConsumer) this::cancelUpdate);
   }

   private void removeToUpdate(long var1, int var3, int var4, boolean var5) {
      if (var5) {
         this.propagationLevels.remove(var1);
      }

      this.updatesByLevel[var3].remove(var1);
      if (this.updatesByLevel[var3].isEmpty() && this.minLevelToUpdate == var3) {
         this.updateMinLevel(var4);
      }
   }

   private void addToUpdate(long var1, int var3, int var4) {
      this.propagationLevels.put(var1, (byte)var3);
      this.updatesByLevel[var4].add(var1);
      if (this.minLevelToUpdate > var4) {
         this.minLevelToUpdate = var4;
      }
   }

   protected void scheduleUpdate(long var1) {
      this.scheduleUpdate(var1, var1, this.levelCount - 1, false);
   }

   public void scheduleUpdate(long var1, long var3, int var5, boolean var6) {
      this.propagateLevel(var1, var3, var5, this.getLevel(var3), this.propagationLevels.get(var3) & 255, var6);
      this.needsUpdate = this.minLevelToUpdate < this.levelCount;
   }

   private void propagateLevel(long var1, long var3, int var5, int var6, int var7, boolean var8) {
      if (!this.isRoot(var3)) {
         var5 = MathHelper.clamp(var5, 0, this.levelCount - 1);
         var6 = MathHelper.clamp(var6, 0, this.levelCount - 1);
         boolean var11;
         if (var7 != 255) {
            var11 = false;
         } else {
            var11 = true;
            var7 = var6;
         }

         int var12;
         if (!var8) {
            var12 = MathHelper.clamp(this.computeLevel(var3, var1, var5), 0, this.levelCount - 1);
         } else {
            var12 = Math.min(var7, var5);
         }

         int var13 = this.minLevel(var6, var7);
         if (var6 == var12) {
            if (!var11) {
               this.removeToUpdate(var3, var13, this.levelCount, true);
            }
         } else {
            int var14 = this.minLevel(var6, var12);
            if (var13 != var14 && !var11) {
               this.removeToUpdate(var3, var13, var14, false);
            }

            this.addToUpdate(var3, var12, var14);
         }
      }
   }

   protected final void propagateLevel(long var1, long var3, int var5, boolean var6) {
      int var9 = this.propagationLevels.get(var3) & 255;
      int var10 = MathHelper.clamp(this.getEdgeLevel(var1, var3, var5), 0, this.levelCount - 1);
      if (!var6) {
         int var11;
         boolean var12;
         if (var9 != 255) {
            var11 = var9;
            var12 = false;
         } else {
            var12 = true;
            var11 = MathHelper.clamp(this.getLevel(var3), 0, this.levelCount - 1);
         }

         if (var10 == var11) {
            this.propagateLevel(var1, var3, this.levelCount - 1, !var12 ? this.getLevel(var3) : var11, var9, false);
         }
      } else {
         this.propagateLevel(var1, var3, var10, this.getLevel(var3), var9, true);
      }
   }

   protected final boolean needsUpdate() {
      return this.needsUpdate;
   }

   protected final int processUpdates(int var1) {
      if (this.minLevelToUpdate >= this.levelCount) {
         return var1;
      } else {
         while (this.minLevelToUpdate < this.levelCount && var1 > 0) {
            var1--;
            it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet var4 = this.updatesByLevel[this.minLevelToUpdate];
            long var5 = var4.removeFirstLong();
            int var7 = MathHelper.clamp(this.getLevel(var5), 0, this.levelCount - 1);
            if (var4.isEmpty()) {
               this.updateMinLevel(this.levelCount);
            }

            if (this.propagationLevels.containsKey(var5)) {
               int var8 = this.propagationLevels.remove(var5) & 255;
               if (var8 >= var7) {
                  if (var8 > var7) {
                     this.addToUpdate(var5, var8, this.minLevel(this.levelCount - 1, var8));
                     this.setLevel(var5, this.levelCount - 1);
                     this.notifyNeighbors(var5, var7, false);
                  }
               } else {
                  this.setLevel(var5, var8);
                  this.notifyNeighbors(var5, var8, true);
               }
            }
         }

         this.needsUpdate = this.minLevelToUpdate < this.levelCount;
         return var1;
      }
   }

   public int func_227467_c_() {
      return this.propagationLevels.size();
   }

   protected abstract boolean isRoot(long var1);

   protected abstract int computeLevel(long var1, long var3, int var5);

   protected abstract void notifyNeighbors(long var1, int var3, boolean var4);

   protected abstract int getLevel(long var1);

   protected abstract void setLevel(long var1, int var3);

   protected abstract int getEdgeLevel(long var1, long var3, int var5);
}
