package mapped;

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

import net.minecraft.client.util.Util;
import net.minecraft.util.math.BlockPos;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.util.Supplier;

public class Class8377 {
   private static final Logger field35948 = LogManager.getLogger();
   private final Short2ObjectMap<Class9343> field35949 = new Short2ObjectOpenHashMap();
   private final Map<Class4913, Set<Class9343>> field35950 = Maps.newHashMap();
   private final Runnable field35951;
   private boolean field35952;

   public static Codec<Class8377> method29350(Runnable var0) {
      return RecordCodecBuilder.<Class8377>create(
            var1 -> var1.group(
                     RecordCodecBuilder.point(var0),
                     Codec.BOOL.optionalFieldOf("Valid", false).forGetter(var0xx -> var0xx.field35952),
                     Class9343.method35350(var0).listOf().fieldOf("Records").forGetter(var0xx -> ImmutableList.copyOf(var0xx.field35949.values()))
                  )
                  .apply(var1, Class8377::new)
         )
         .orElseGet(Util.func_240982_a_("Failed to read POI section: ", field35948::error), () -> new Class8377(var0, false, ImmutableList.of()));
   }

   public Class8377(Runnable var1) {
      this(var1, true, ImmutableList.of());
   }

   private Class8377(Runnable var1, boolean var2, List<Class9343> var3) {
      this.field35951 = var1;
      this.field35952 = var2;
      var3.forEach(this::method29353);
   }

   public Stream<Class9343> method29351(Predicate<Class4913> var1, Class2093 var2) {
      return this.field35950
         .entrySet()
         .stream()
         .filter(var1x -> var1.test(var1x.getKey()))
         .<Class9343>flatMap(var0 -> var0.getValue().stream())
         .filter(var2.method8754());
   }

   public void method29352(BlockPos var1, Class4913 var2) {
      if (this.method29353(new Class9343(var1, var2, this.field35951))) {
         field35948.debug("Added POI of type {} @ {}", new Supplier[]{() -> var2, () -> var1});
         this.field35951.run();
      }
   }

   private boolean method29353(Class9343 var1) {
      BlockPos var4 = var1.method35355();
      Class4913 var5 = var1.method35356();
      short var6 = Class2002.method8398(var4);
      Class9343 var7 = (Class9343)this.field35949.get(var6);
      if (var7 == null) {
         this.field35949.put(var6, var1);
         this.field35950.computeIfAbsent(var5, var0 -> Sets.newHashSet()).add(var1);
         return true;
      } else if (!var5.equals(var7.method35356())) {
         throw (IllegalStateException) Util.pauseDevMode(new IllegalStateException("POI data mismatch: already registered at " + var4));
      } else {
         return false;
      }
   }

   public void method29354(BlockPos var1) {
      Class9343 var4 = (Class9343)this.field35949.remove(Class2002.method8398(var1));
      if (var4 != null) {
         this.field35950.get(var4.method35356()).remove(var4);
         field35948.debug("Removed POI of type {} @ {}", new Supplier[]{var4::method35356, var4::method35355});
         this.field35951.run();
      } else {
         field35948.error("POI data mismatch: never registered at " + var1);
      }
   }

   public boolean method29355(BlockPos var1) {
      Class9343 var4 = (Class9343)this.field35949.get(Class2002.method8398(var1));
      if (var4 != null) {
         boolean var5 = var4.method35352();
         this.field35951.run();
         return var5;
      } else {
         throw (IllegalStateException) Util.pauseDevMode(new IllegalStateException("POI never registered at " + var1));
      }
   }

   public boolean method29356(BlockPos var1, Predicate<Class4913> var2) {
      short var5 = Class2002.method8398(var1);
      Class9343 var6 = (Class9343)this.field35949.get(var5);
      return var6 != null && var2.test(var6.method35356());
   }

   public Optional<Class4913> method29357(BlockPos var1) {
      short var4 = Class2002.method8398(var1);
      Class9343 var5 = (Class9343)this.field35949.get(var4);
      return var5 == null ? Optional.<Class4913>empty() : Optional.<Class4913>of(var5.method35356());
   }

   public void method29358(Consumer<BiConsumer<BlockPos, Class4913>> var1) {
      if (!this.field35952) {
         Short2ObjectOpenHashMap var4 = new Short2ObjectOpenHashMap(this.field35949);
         this.method29359();
         var1.accept((var2, var3) -> {
            short var6 = Class2002.method8398(var2);
            Class9343 var7 = (Class9343)var4.computeIfAbsent(var6, var3x -> new Class9343(var2, var3, this.field35951));
            this.method29353(var7);
         });
         this.field35952 = true;
         this.field35951.run();
      }
   }

   private void method29359() {
      this.field35949.clear();
      this.field35950.clear();
   }

   public boolean method29360() {
      return this.field35952;
   }
}
