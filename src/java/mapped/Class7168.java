package mapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongList;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.util.Supplier;

public class Class7168 implements Class7166 {
   private static final long field30820 = Duration.ofMillis(100L).toNanos();
   private static final Logger field30821 = LogManager.getLogger();
   private final List<String> field30822 = Lists.newArrayList();
   private final LongList field30823 = new LongArrayList();
   private final Map<String, Class6706> field30824 = Maps.newHashMap();
   private final IntSupplier field30825;
   private final LongSupplier field30826;
   private final long field30827;
   private final int field30828;
   private String field30829 = "";
   private boolean field30830;
   private Class6706 field30831;
   private final boolean field30832;
   private boolean field30833 = false;
   private boolean field30834 = false;
   private static final String field30835 = "scheduledExecutables";
   private static final String field30836 = "tick";
   private static final String field30837 = "sound";
   private static final int field30838 ="scheduledExecutables".hashCode();
   private static final int field30839 = "tick".hashCode();
   private static final int field30840 = "sound".hashCode();
   private static final Class6636 field30841 = new Class6636(Minecraft.class);
   private static final Class6633 field30842 = new Class6633(field30841, Class7684.class);

   public Class7168(LongSupplier var1, IntSupplier var2, boolean var3) {
      this.field30827 = var1.getAsLong();
      this.field30826 = var1;
      this.field30828 = var2.getAsInt();
      this.field30825 = var2;
      this.field30832 = var3;
   }

   @Override
   public void method22501() {
      Class7684 var3 = (Class7684)Class9299.method35072(Minecraft.getInstance(), field30842);
      this.field30833 = var3 != null && var3.method25294() == this;
      this.field30834 = this.field30833 && Class8578.method30660();
      if (!this.field30830) {
         this.field30830 = true;
         this.field30829 = "";
         this.field30822.clear();
         this.startSection("root");
      } else {
         field30821.error("Profiler tick already started - missing endTick()?");
      }
   }

   @Override
   public void method22502() {
      if (this.field30830) {
         this.endSection();
         this.field30830 = false;
         if (!this.field30829.isEmpty()) {
            field30821.error(
               "Profiler tick ended before path was fully popped (remainder: '{}'). Mismatched push/pop?",
               new Supplier[]{() -> Class7740.method25634(this.field30829)}
            );
         }
      } else {
         field30821.error("Profiler tick already ended - missing startTick()?");
      }
   }

   @Override
   public void startSection(String var1) {
      if (this.field30834) {
         int var4 = var1.hashCode();
         if (var4 == field30838 && var1.equals("scheduledExecutables")) {
            Class8578.field38575.method31034();
         } else if (var4 == field30839 && var1.equals("tick") && Class7944.method26797()) {
            Class8578.field38575.method31035();
            Class8578.field38574.method31034();
         }
      }

      if (this.field30830) {
         if (!this.field30829.isEmpty()) {
            this.field30829 = this.field30829 + '\u001e';
         }

         this.field30829 = this.field30829 + var1;
         this.field30822.add(this.field30829);
         this.field30823.add(Util.nanoTime());
         this.field30831 = null;
      } else {
         field30821.error("Cannot push '{}' to profiler if profiler tick hasn't started - missing startTick()?", var1);
      }
   }

   @Override
   public void method22504(java.util.function.Supplier<String> var1) {
      this.startSection((String)var1.get());
   }

   @Override
   public void endSection() {
      if (this.field30830) {
         if (!this.field30823.isEmpty()) {
            long var3 = Util.nanoTime();
            long var5 = this.field30823.removeLong(this.field30823.size() - 1);
            this.field30822.remove(this.field30822.size() - 1);
            long var7 = var3 - var5;
            Class6706 var9 = this.method22512();
            Class6706.method20443(var9, (Class6706.method20444(var9) * 49L + var7) / 50L);
            Class6706.method20445(var9, 1L);
            if (this.field30832 && var7 > field30820) {
               field30821.warn(
                  "Something's taking too long! '{}' took aprox {} ms",
                  new Supplier[]{() -> Class7740.method25634(this.field30829), () -> (double)var7 / 1000000.0}
               );
            }

            this.field30829 = !this.field30822.isEmpty() ? this.field30822.get(this.field30822.size() - 1) : "";
            this.field30831 = null;
         } else {
            field30821.error("Tried to pop one too many times! Mismatched push() and pop()?");
         }
      } else {
         field30821.error("Cannot pop from profiler if profiler tick hasn't started - missing startTick()?");
      }
   }

   @Override
   public void endStartSection(String var1) {
      if (this.field30834) {
         int var4 = var1.hashCode();
         if (var4 == field30840 && var1.equals("sound")) {
            Class8578.field38574.method31035();
         }
      }

      this.endSection();
      this.startSection(var1);
   }

   @Override
   public void method22507(java.util.function.Supplier<String> var1) {
      this.endSection();
      this.method22504(var1);
   }

   private Class6706 method22512() {
      if (this.field30831 == null) {
         this.field30831 = this.field30824.computeIfAbsent(this.field30829, var0 -> new Class6706());
      }

      return this.field30831;
   }

   @Override
   public void func_230035_c_(String var1) {
      Class6706.method20446(this.method22512()).addTo(var1, 1L);
   }

   @Override
   public void method22509(java.util.function.Supplier<String> var1) {
      Class6706.method20446(this.method22512()).addTo(var1.get(), 1L);
   }

   @Override
   public Class7740 method22511() {
      return new Class7741(this.field30824, this.field30827, this.field30828, this.field30826.getAsLong(), this.field30825.getAsInt());
   }
}
