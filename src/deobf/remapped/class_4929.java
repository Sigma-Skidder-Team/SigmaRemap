package remapped;

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

public class class_4929 implements class_3025 {
   private static final long field_25499 = Duration.ofMillis(100L).toNanos();
   private static final Logger field_25519 = LogManager.getLogger();
   private final List<String> field_25506 = Lists.newArrayList();
   private final LongList field_25517 = new LongArrayList();
   private final Map<String, class_4670> field_25521 = Maps.newHashMap();
   private final IntSupplier field_25518;
   private final LongSupplier field_25511;
   private final long field_25498;
   private final int field_25509;
   private String field_25512 = "";
   private boolean field_25507;
   private class_4670 field_25520;
   private final boolean field_25513;
   private boolean field_25515 = false;
   private boolean field_25514 = false;
   private static final String field_25502 = "scheduledExecutables";
   private static final String field_25508 = "tick";
   private static final String field_25501 = "sound";
   private static final int field_25503 = field_25500[5].hashCode();
   private static final int field_25516 = field_25500[6].hashCode();
   private static final int field_25510 = field_25500[11].hashCode();
   private static final class_9859 field_25504 = new class_9859(MinecraftClient.class);
   private static final class_1790 field_25505 = new class_1790(field_25504, class_2434.class);

   public class_4929(LongSupplier var1, IntSupplier var2, boolean var3) {
      this.field_25498 = var1.getAsLong();
      this.field_25511 = var1;
      this.field_25509 = var2.getAsInt();
      this.field_25518 = var2;
      this.field_25513 = var3;
   }

   @Override
   public void method_16059() {
      class_2434 var3 = (class_2434)class_7860.method_35557(MinecraftClient.method_8510(), field_25505);
      this.field_25515 = var3 != null && var3.method_11091() == this;
      this.field_25514 = this.field_25515 && class_5099.method_23418();
      if (!this.field_25507) {
         this.field_25507 = true;
         this.field_25512 = "";
         this.field_25506.clear();
         this.method_16056("root");
      } else {
         field_25519.error("Profiler tick already started - missing endTick()?");
      }
   }

   @Override
   public void method_16052() {
      if (this.field_25507) {
         this.method_16054();
         this.field_25507 = false;
         if (!this.field_25512.isEmpty()) {
            field_25519.error(
               "Profiler tick ended before path was fully popped (remainder: '{}'). Mismatched push/pop?",
               new Supplier[]{() -> class_2578.method_11738(this.field_25512)}
            );
         }
      } else {
         field_25519.error("Profiler tick already ended - missing startTick()?");
      }
   }

   @Override
   public void method_16056(String var1) {
      if (this.field_25514) {
         int var4 = var1.hashCode();
         if (var4 == field_25503 && var1.equals("scheduledExecutables")) {
            class_5099.field_26313.method_24314();
         } else if (var4 == field_25516 && var1.equals("tick") && class_3111.method_14272()) {
            class_5099.field_26313.method_24313();
            class_5099.field_26306.method_24314();
         }
      }

      if (this.field_25507) {
         if (!this.field_25512.isEmpty()) {
            this.field_25512 = this.field_25512 + '\u001e';
         }

         this.field_25512 = this.field_25512 + var1;
         this.field_25506.add(this.field_25512);
         this.field_25517.add(class_9665.method_44657());
         this.field_25520 = null;
      } else {
         field_25519.error("Cannot push '{}' to profiler if profiler tick hasn't started - missing startTick()?", var1);
      }
   }

   @Override
   public void method_16057(java.util.function.Supplier<String> var1) {
      this.method_16056((String)var1.get());
   }

   @Override
   public void method_16054() {
      if (this.field_25507) {
         if (!this.field_25517.isEmpty()) {
            long var3 = class_9665.method_44657();
            long var5 = this.field_25517.removeLong(this.field_25517.size() - 1);
            this.field_25506.remove(this.field_25506.size() - 1);
            long var7 = var3 - var5;
            class_4670 var9 = this.method_22598();
            class_4670.method_21611(var9, (class_4670.method_21608(var9) * 49L + var7) / 50L);
            class_4670.method_21612(var9, 1L);
            if (this.field_25513 && var7 > field_25499) {
               field_25519.warn(
                  "Something's taking too long! '{}' took aprox {} ms",
                  new Supplier[]{() -> class_2578.method_11738(this.field_25512), () -> (double)var7 / 1000000.0}
               );
            }

            this.field_25512 = !this.field_25506.isEmpty() ? this.field_25506.get(this.field_25506.size() - 1) : "";
            this.field_25520 = null;
         } else {
            field_25519.error("Tried to pop one too many times! Mismatched push() and pop()?");
         }
      } else {
         field_25519.error("Cannot pop from profiler if profiler tick hasn't started - missing startTick()?");
      }
   }

   @Override
   public void method_16050(String var1) {
      if (this.field_25514) {
         int var4 = var1.hashCode();
         if (var4 == field_25510 && var1.equals("sound")) {
            class_5099.field_26306.method_24313();
         }
      }

      this.method_16054();
      this.method_16056(var1);
   }

   @Override
   public void method_16051(java.util.function.Supplier<String> var1) {
      this.method_16054();
      this.method_16057(var1);
   }

   private class_4670 method_22598() {
      if (this.field_25520 == null) {
         this.field_25520 = this.field_25521.computeIfAbsent(this.field_25512, var0 -> new class_4670(null));
      }

      return this.field_25520;
   }

   @Override
   public void method_16055(String var1) {
      class_4670.method_21609(this.method_22598()).addTo(var1, 1L);
   }

   @Override
   public void method_16053(java.util.function.Supplier<String> var1) {
      class_4670.method_21609(this.method_22598()).addTo(var1.get(), 1L);
   }

   @Override
   public class_2578 method_13811() {
      return new class_5188(this.field_25521, this.field_25498, this.field_25509, this.field_25511.getAsLong(), this.field_25518.getAsInt());
   }
}
