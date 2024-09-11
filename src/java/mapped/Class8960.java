package mapped;

import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import net.minecraft.util.math.BlockPos;

import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.IntSupplier;

public class Class8960 {
   private static String[] field40480;
   private final ThreadLocal<Class8676> field40481 = ThreadLocal.withInitial(() -> new Class8676());
   private final Long2ObjectLinkedOpenHashMap<int[]> field40482 = new Long2ObjectLinkedOpenHashMap(256, 0.25F);
   private final ReentrantReadWriteLock field40483 = new ReentrantReadWriteLock();

   public int method32731(BlockPos var1, IntSupplier var2) {
      int var5 = var1.getX() >> 4;
      int var6 = var1.getZ() >> 4;
      Class8676 var7 = this.field40481.get();
      if (var7.field39106 != var5 || var7.field39107 != var6) {
         var7.field39106 = var5;
         var7.field39107 = var6;
         var7.field39108 = this.method32734(var5, var6);
      }

      int var8 = var1.getX() & 15;
      int var9 = var1.getZ() & 15;
      int var10 = var9 << 4 | var8;
      int var11 = var7.field39108[var10];
      if (var11 == -1) {
         int var12 = var2.getAsInt();
         var7.field39108[var10] = var12;
         return var12;
      } else {
         return var11;
      }
   }

   public void method32732(int var1, int var2) {
      try {
         this.field40483.writeLock().lock();

         for (int var5 = -1; var5 <= 1; var5++) {
            for (int var6 = -1; var6 <= 1; var6++) {
               long var7 = ChunkPos.asLong(var1 + var5, var2 + var6);
               this.field40482.remove(var7);
            }
         }
      } finally {
         this.field40483.writeLock().unlock();
      }
   }

   public void method32733() {
      try {
         this.field40483.writeLock().lock();
         this.field40482.clear();
      } finally {
         this.field40483.writeLock().unlock();
      }
   }

   private int[] method32734(int var1, int var2) {
      long var5 = ChunkPos.asLong(var1, var2);
      this.field40483.readLock().lock();

      int[] var7;
      try {
         var7 = (int[])this.field40482.get(var5);
      } finally {
         this.field40483.readLock().unlock();
      }

      if (var7 != null) {
         return var7;
      } else {
         int[] var8 = new int[256];
         Arrays.fill(var8, -1);

         try {
            this.field40483.writeLock().lock();
            if (this.field40482.size() >= 256) {
               this.field40482.removeFirst();
            }

            this.field40482.put(var5, var8);
         } finally {
            this.field40483.writeLock().unlock();
         }

         return var8;
      }
   }
}
