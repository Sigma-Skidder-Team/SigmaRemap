package remapped;

import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class class_5427<T> implements class_5021<T> {
   private final class_2874<T> field_27646;
   private final class_5021<T> field_27648 = (var0, var1x) -> 0;
   private final class_95<T> field_27645;
   private final Function<CompoundNBT, T> field_27641;
   private final Function<T, CompoundNBT> field_27642;
   private final T field_27649;
   public class_2721 field_27639;
   private class_2874<T> field_27647;
   private int field_27640;
   private final ReentrantLock field_27644 = new ReentrantLock();

   public void method_24691() {
      if (this.field_27644.isLocked() && !this.field_27644.isHeldByCurrentThread()) {
         String var3 = Thread.getAllStackTraces()
            .keySet()
            .stream()
            .filter(Objects::nonNull)
            .<CharSequence>map(
               var0 -> var0.getName()
                     + ": \n\tat "
                     + Arrays.<StackTraceElement>stream(var0.getStackTrace()).<CharSequence>map(Object::toString).collect(Collectors.joining("\n\tat "))
            )
            .collect(Collectors.joining("\n"));
         class_159 var4 = new class_159("Writing into PalettedContainer from multiple threads", new IllegalStateException());
         class_6544 var5 = var4.method_639("Thread dumps");
         var5.method_29850("Thread dumps", var3);
         throw new class_3297(var4);
      } else {
         this.field_27644.lock();
      }
   }

   public void method_24687() {
      this.field_27644.unlock();
   }

   public class_5427(class_2874<T> var1, class_95<T> var2, Function<CompoundNBT, T> var3, Function<T, CompoundNBT> var4, T var5) {
      this.field_27646 = var1;
      this.field_27645 = var2;
      this.field_27641 = var3;
      this.field_27642 = var4;
      this.field_27649 = (T)var5;
      this.method_24680(4);
   }

   private static int method_24675(int var0, int var1, int var2) {
      return var1 << 8 | var2 << 4 | var0;
   }

   private void method_24680(int var1) {
      if (var1 != this.field_27640) {
         this.field_27640 = var1;
         if (this.field_27640 > 4) {
            if (this.field_27640 >= 9) {
               this.field_27647 = this.field_27646;
               this.field_27640 = class_9299.method_42820(this.field_27645.method_280());
            } else {
               this.field_27647 = new class_4371<T>(this.field_27645, this.field_27640, this, this.field_27641, this.field_27642);
            }
         } else {
            this.field_27640 = 4;
            this.field_27647 = new class_6475<T>(this.field_27645, this.field_27640, this, this.field_27641);
         }

         this.field_27647.method_13201(this.field_27649);
         this.field_27639 = new class_2721(this.field_27640, 4096);
      }
   }

   public int 哝疂玑堧蛊属(int var1, T var2) {
      this.method_24691();
      class_2721 var5 = this.field_27639;
      class_2874 var6 = this.field_27647;
      this.method_24680(var1);

      for (int var7 = 0; var7 < var5.method_12244(); var7++) {
         Object var8 = var6.method_13200(var5.method_12247(var7));
         if (var8 != null) {
            this.method_24690(var7, (T)var8);
         }
      }

      int var9 = this.field_27647.method_13201((T)var2);
      this.method_24687();
      return var9;
   }

   public T method_24677(int var1, int var2, int var3, T var4) {
      this.method_24691();
      Object var7 = this.method_24676(method_24675(var1, var2, var3), (T)var4);
      this.method_24687();
      return (T)var7;
   }

   public T method_24678(int var1, int var2, int var3, T var4) {
      return this.method_24676(method_24675(var1, var2, var3), (T)var4);
   }

   public T method_24676(int var1, T var2) {
      int var5 = this.field_27647.method_13201((T)var2);
      int var6 = this.field_27639.method_12245(var1, var5);
      Object var7 = this.field_27647.method_13200(var6);
      return (T)(var7 != null ? var7 : this.field_27649);
   }

   public void method_24690(int var1, T var2) {
      int var5 = this.field_27647.method_13201((T)var2);
      this.field_27639.method_12248(var1, var5);
   }

   public T method_24689(int var1, int var2, int var3) {
      return this.method_24688(method_24675(var1, var2, var3));
   }

   public T method_24688(int var1) {
      Object var4 = this.field_27647.method_13200(this.field_27639.method_12247(var1));
      return (T)(var4 != null ? var4 : this.field_27649);
   }

   public void method_24679(class_8248 var1) {
      this.method_24691();
      byte var4 = var1.readByte();
      if (this.field_27640 != var4) {
         this.method_24680(var4);
      }

      this.field_27647.method_13206(var1);
      var1.method_37773(this.field_27639.method_12246());
      this.method_24687();
   }

   public void method_24685(class_8248 var1) {
      this.method_24691();
      var1.writeByte(this.field_27640);
      this.field_27647.method_13202(var1);
      var1.method_37759(this.field_27639.method_12246());
      this.method_24687();
   }

   public void method_24692(class_3416 var1, long[] var2) {
      this.method_24691();
      int var5 = Math.max(4, class_9299.method_42820(var1.size()));
      if (var5 != this.field_27640) {
         this.method_24680(var5);
      }

      this.field_27647.method_13205(var1);
      int var6 = var2.length * 64 / 4096;
      if (this.field_27647 != this.field_27646) {
         if (var6 != this.field_27640) {
            class_2721 var7 = new class_2721(var6, 4096, var2);

            for (int var8 = 0; var8 < 4096; var8++) {
               this.field_27639.method_12248(var8, var7.method_12247(var8));
            }
         } else {
            System.arraycopy(var2, 0, this.field_27639.method_12246(), 0, var2.length);
         }
      } else {
         class_4371 var10 = new class_4371<T>(this.field_27645, var5, this.field_27648, this.field_27641, this.field_27642);
         var10.method_13205(var1);
         class_2721 var11 = new class_2721(var5, 4096, var2);

         for (int var9 = 0; var9 < 4096; var9++) {
            this.field_27639.method_12248(var9, this.field_27646.method_13201((T)var10.method_13200(var11.method_12247(var9))));
         }
      }

      this.method_24687();
   }

   public void method_24683(CompoundNBT var1, String var2, String var3) {
      this.method_24691();
      class_4371 var6 = new class_4371<T>(this.field_27645, this.field_27640, this.field_27648, this.field_27641, this.field_27642);
      Object var7 = this.field_27649;
      int var8 = var6.method_13201(this.field_27649);
      int[] var9 = new int[4096];

      for (int var10 = 0; var10 < 4096; var10++) {
         Object var11 = this.method_24688(var10);
         if (var11 != var7) {
            var7 = var11;
            var8 = var6.method_13201(var11);
         }

         var9[var10] = var8;
      }

      class_3416 var14 = new class_3416();
      var6.method_20371(var14);
      var1.method_25946(var2, var14);
      int var15 = Math.max(4, class_9299.method_42820(var14.size()));
      class_2721 var12 = new class_2721(var15, 4096);

      for (int var13 = 0; var13 < var9.length; var13++) {
         var12.method_12248(var13, var9[var13]);
      }

      var1.method_25962(var3, var12.method_12246());
      this.method_24687();
   }

   public int method_24682() {
      return 1 + this.field_27647.method_13204() + class_8248.method_37766(this.field_27639.method_12244()) + this.field_27639.method_12246().length * 8;
   }

   public boolean method_24686(Predicate<T> var1) {
      return this.field_27647.method_13203(var1);
   }

   public void method_24681(class_2787<T> var1) {
      Int2IntOpenHashMap var4 = new Int2IntOpenHashMap();
      this.field_27639.method_12249(var1x -> var4.put(var1x, var4.get(var1x) + 1));
      var4.int2IntEntrySet().forEach(var2 -> var1.method_12669(this.field_27647.method_13200(var2.getIntKey()), var2.getIntValue()));
   }
}
