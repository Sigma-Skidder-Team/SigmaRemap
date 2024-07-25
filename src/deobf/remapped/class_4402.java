package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.util.Supplier;

public class class_4402 {
   private static final Logger field_21547 = LogManager.getLogger();
   private final Short2ObjectMap<class_8009> field_21544 = new Short2ObjectOpenHashMap();
   private final Map<class_236, Set<class_8009>> field_21549 = Maps.newHashMap();
   private final Runnable field_21545;
   private boolean field_21548;

   public static Codec<class_4402> method_20519(Runnable var0) {
      return RecordCodecBuilder.create(
            var1 -> var1.group(
                     RecordCodecBuilder.point(var0),
                     Codec.BOOL.optionalFieldOf("Valid", false).forGetter(var0xx -> var0xx.field_21548),
                     class_8009.method_36338(var0).listOf().fieldOf("Records").forGetter(var0xx -> ImmutableList.copyOf(var0xx.field_21544.values()))
                  )
                  .apply(var1, class_4402::new)
         )
         .orElseGet(Util.method_44690("Failed to read POI section: ", field_21547::error), () -> new class_4402(var0, false, ImmutableList.of()));
   }

   public class_4402(Runnable var1) {
      this(var1, true, ImmutableList.of());
   }

   private class_4402(Runnable var1, boolean var2, List<class_8009> var3) {
      this.field_21545 = var1;
      this.field_21548 = var2;
      var3.forEach(this::method_20517);
   }

   public Stream<class_8009> method_20511(Predicate<class_236> var1, class_8122 var2) {
      return this.field_21549
         .entrySet()
         .stream()
         .filter(var1x -> var1.test(var1x.getKey()))
         .<class_8009>flatMap(var0 -> var0.getValue().stream())
         .filter(var2.method_36962());
   }

   public void method_20516(class_1331 var1, class_236 var2) {
      if (this.method_20517(new class_8009(var1, var2, this.field_21545))) {
         field_21547.debug("Added POI of type {} @ {}", new Supplier[]{() -> var2, () -> var1});
         this.field_21545.run();
      }
   }

   private boolean method_20517(class_8009 var1) {
      class_1331 var4 = var1.method_36337();
      class_236 var5 = var1.method_36341();
      short var6 = class_6979.method_31909(var4);
      class_8009 var7 = (class_8009)this.field_21544.get(var6);
      if (var7 == null) {
         this.field_21544.put(var6, var1);
         this.field_21549.computeIfAbsent(var5, var0 -> Sets.newHashSet()).add(var1);
         return true;
      } else if (!var5.equals(var7.method_36341())) {
         throw (IllegalStateException) Util.method_44658(new IllegalStateException("POI data mismatch: already registered at " + var4));
      } else {
         return false;
      }
   }

   public void method_20510(class_1331 var1) {
      class_8009 var4 = (class_8009)this.field_21544.remove(class_6979.method_31909(var1));
      if (var4 != null) {
         this.field_21549.get(var4.method_36341()).remove(var4);
         field_21547.debug("Removed POI of type {} @ {}", new Supplier[]{var4::method_36341, var4::method_36337});
         this.field_21545.run();
      } else {
         field_21547.error("POI data mismatch: never registered at " + var1);
      }
   }

   public boolean method_20512(class_1331 var1) {
      class_8009 var4 = (class_8009)this.field_21544.get(class_6979.method_31909(var1));
      if (var4 != null) {
         boolean var5 = var4.method_36342();
         this.field_21545.run();
         return var5;
      } else {
         throw (IllegalStateException) Util.method_44658(new IllegalStateException("POI never registered at " + var1));
      }
   }

   public boolean method_20514(class_1331 var1, Predicate<class_236> var2) {
      short var5 = class_6979.method_31909(var1);
      class_8009 var6 = (class_8009)this.field_21544.get(var5);
      return var6 != null && var2.test(var6.method_36341());
   }

   public Optional<class_236> method_20515(class_1331 var1) {
      short var4 = class_6979.method_31909(var1);
      class_8009 var5 = (class_8009)this.field_21544.get(var4);
      return var5 == null ? Optional.<class_236>empty() : Optional.<class_236>of(var5.method_36341());
   }

   public void method_20513(Consumer<BiConsumer<class_1331, class_236>> var1) {
      if (!this.field_21548) {
         Short2ObjectOpenHashMap var4 = new Short2ObjectOpenHashMap(this.field_21544);
         this.method_20509();
         var1.accept((var2, var3) -> {
            short var6 = class_6979.method_31909(var2);
            class_8009 var7 = (class_8009)var4.computeIfAbsent(var6, var3x -> new class_8009(var2, var3, this.field_21545));
            this.method_20517(var7);
         });
         this.field_21548 = true;
         this.field_21545.run();
      }
   }

   private void method_20509() {
      this.field_21544.clear();
      this.field_21549.clear();
   }

   public boolean method_20520() {
      return this.field_21548;
   }
}
