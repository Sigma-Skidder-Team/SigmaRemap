package remapped;

import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.IntSupplier;

public class class_6530 {
   private static String[] field_33225;
   private final ThreadLocal<class_5489> field_33227 = ThreadLocal.<class_5489>withInitial(() -> new class_5489(null));
   private final Long2ObjectLinkedOpenHashMap<int[]> field_33226 = new Long2ObjectLinkedOpenHashMap(256, 0.25F);
   private final ReentrantReadWriteLock field_33224 = new ReentrantReadWriteLock();

   public int method_29721(BlockPos var1, IntSupplier var2) {
      int var5 = var1.method_12173() >> 4;
      int var6 = var1.method_12185() >> 4;
      class_5489 var7 = this.field_33227.get();
      if (var7.field_27975 != var5 || var7.field_27974 != var6) {
         var7.field_27975 = var5;
         var7.field_27974 = var6;
         var7.field_27976 = this.method_29723(var5, var6);
      }

      int var8 = var1.method_12173() & 15;
      int var9 = var1.method_12185() & 15;
      int var10 = var9 << 4 | var8;
      int var11 = var7.field_27976[var10];
      if (var11 == -1) {
         int var12 = var2.getAsInt();
         var7.field_27976[var10] = var12;
         return var12;
      } else {
         return var11;
      }
   }

   public void method_29720(int var1, int var2) {
      try {
         this.field_33224.writeLock().lock();

         for (int var5 = -1; var5 <= 1; var5++) {
            for (int var6 = -1; var6 <= 1; var6++) {
               long var7 = class_2034.method_9540(var1 + var5, var2 + var6);
               this.field_33226.remove(var7);
            }
         }
      } finally {
         this.field_33224.writeLock().unlock();
      }
   }

   public void method_29722() {
      try {
         this.field_33224.writeLock().lock();
         this.field_33226.clear();
      } finally {
         this.field_33224.writeLock().unlock();
      }
   }

   private int[] method_29723(int var1, int var2) {
      long var5 = class_2034.method_9540(var1, var2);
      this.field_33224.readLock().lock();

      int[] var7;
      try {
         var7 = (int[])this.field_33226.get(var5);
      } finally {
         this.field_33224.readLock().unlock();
      }

      if (var7 != null) {
         return var7;
      } else {
         int[] var8 = new int[256];
         Arrays.fill(var8, -1);

         try {
            this.field_33224.writeLock().lock();
            if (this.field_33226.size() >= 256) {
               this.field_33226.removeFirst();
            }

            this.field_33226.put(var5, var8);
         } finally {
            this.field_33224.writeLock().unlock();
         }

         return var8;
      }
   }
}
