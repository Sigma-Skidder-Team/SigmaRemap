package mapped;

import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import net.minecraft.client.util.Util;
import net.minecraft.util.math.BlockPos;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntSupplier;

public class Class195 extends Class196 implements AutoCloseable {
   private static final Logger field734 = LogManager.getLogger();
   private final Class322<Runnable> field735;
   private final ObjectList<Pair<Class2044, Runnable>> field736 = new ObjectArrayList();
   private final Class1649 field737;
   private final Class321<Class6875<Runnable>> field738;
   private volatile int field739 = 5;
   private final AtomicBoolean field740 = new AtomicBoolean();

   public Class195(Class1704 var1, Class1649 var2, boolean var3, Class322<Runnable> var4, Class321<Class6875<Runnable>> var5) {
      super(var1, true, var3);
      this.field737 = var2;
      this.field738 = var5;
      this.field735 = var4;
   }

   @Override
   public void close() {
   }

   @Override
   public int method600(int var1, boolean var2, boolean var3) {
      throw (UnsupportedOperationException) Util.method38516(new UnsupportedOperationException("Ran authomatically on a different thread!"));
   }

   @Override
   public void method601(BlockPos var1, int var2) {
      throw (UnsupportedOperationException) Util.method38516(new UnsupportedOperationException("Ran authomatically on a different thread!"));
   }

   @Override
   public void checkBlock(BlockPos var1) {
      BlockPos var4 = var1.toImmutable();
      this.method607(
         var1.getX() >> 4, var1.getZ() >> 4, Class2044.field13350, Util.method38515(() -> super.checkBlock(var4), () -> "checkBlock " + var4)
      );
   }

   public void method603(Class7481 var1) {
      this.method608(var1.field32174, var1.field32175, () -> 0, Class2044.field13349, Util.method38515(() -> {
         super.method609(var1, false);
         super.method605(var1, false);

         for (int var4 = -1; var4 < 17; var4++) {
            super.method606(Class1977.field12882, Class2002.method8391(var1, var4), (Class6785)null, true);
            super.method606(Class1977.field12881, Class2002.method8391(var1, var4), (Class6785)null, true);
         }

         for (int var5 = 0; var5 < 16; var5++) {
            super.method604(Class2002.method8391(var1, var5), true);
         }
      }, () -> "updateChunkStatus " + var1 + " " + true));
   }

   @Override
   public void method604(Class2002 var1, boolean var2) {
      this.method608(
         var1.method8410(),
         var1.method8412(),
         () -> 0,
         Class2044.field13349,
         Util.method38515(() -> super.method604(var1, var2), () -> "updateSectionStatus " + var1 + " " + var2)
      );
   }

   @Override
   public void method605(Class7481 var1, boolean var2) {
      this.method607(
         var1.field32174,
         var1.field32175,
         Class2044.field13349,
         Util.method38515(() -> super.method605(var1, var2), () -> "enableLight " + var1 + " " + var2)
      );
   }

   @Override
   public void method606(Class1977 var1, Class2002 var2, Class6785 var3, boolean var4) {
      this.method608(
         var2.method8410(),
         var2.method8412(),
         () -> 0,
         Class2044.field13349,
         Util.method38515(() -> super.method606(var1, var2, var3, var4), () -> "queueData " + var2)
      );
   }

   private void method607(int var1, int var2, Class2044 var3, Runnable var4) {
      this.method608(var1, var2, this.field737.method6540(Class7481.method24353(var1, var2)), var3, var4);
   }

   private void method608(int var1, int var2, IntSupplier var3, Class2044 var4, Runnable var5) {
      this.field738.method1641(Class1812.method7960(() -> {
         this.field736.add(Pair.of(var4, var5));
         if (this.field736.size() >= this.field739) {
            this.method612();
         }
      }, Class7481.method24353(var1, var2), var3));
   }

   @Override
   public void method609(Class7481 var1, boolean var2) {
      this.method608(
         var1.field32174, var1.field32175, () -> 0, Class2044.field13349, Util.method38515(() -> super.method609(var1, var2), () -> "retainData " + var1)
      );
   }

   public CompletableFuture<IChunk> method610(IChunk var1, boolean var2) {
      Class7481 var5 = var1.method7072();
      var1.method7096(false);
      this.method607(var5.field32174, var5.field32175, Class2044.field13349, Util.method38515(() -> {
         Class7038[] var6 = var1.method7067();

         for (int var7 = 0; var7 < 16; var7++) {
            Class7038 var8 = var6[var7];
            if (!Class7038.method21859(var8)) {
               super.method604(Class2002.method8391(var5, var7), false);
            }
         }

         super.method605(var5, true);
         if (!var2) {
            var1.method7088().forEach(var2xx -> super.method601(var2xx, var1.method7032(var2xx)));
         }

         this.field737.method6555(var5);
      }, () -> "lightChunk " + var5 + " " + var2));
      return CompletableFuture.<IChunk>supplyAsync(() -> {
         var1.method7096(true);
         super.method609(var5, false);
         return var1;
      }, var2x -> this.method607(var5.field32174, var5.field32175, Class2044.field13350, var2x));
   }

   public void method611() {
      if ((!this.field736.isEmpty() || super.method637()) && this.field740.compareAndSet(false, true)) {
         this.field735.method1641(() -> {
            this.method612();
            this.field740.set(false);
         });
      }
   }

   private void method612() {
      int var3 = Math.min(this.field736.size(), this.field739);
      ObjectListIterator<Pair<Class2044, Runnable>> var4 = this.field736.iterator();

      int var5;
      for (var5 = 0; var4.hasNext() && var5 < var3; ++var5) {
         Pair<Class2044, Runnable> var6 = var4.next();
         if (var6.getFirst() == Class2044.field13349) {
            var6.getSecond().run();
         }
      }

      var4.back(var5);
      super.method600(Integer.MAX_VALUE, true, true);

      for (int var8 = 0; var4.hasNext() && var8 < var3; ++var8) {
         Pair<Class2044, Runnable> var7 = var4.next();
         if (var7.getFirst() == Class2044.field13350) {
            var7.getSecond().run();
         }

         var4.remove();
      }
   }

   public void method613(int var1) {
      this.field739 = var1;
   }
}
