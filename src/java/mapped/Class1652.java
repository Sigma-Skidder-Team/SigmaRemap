package mapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.*;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Function;

public class Class1652<R> implements AutoCloseable {
   private static final Logger field8979 = LogManager.getLogger();
   private final Class1707 field8980;
   private final Long2ObjectMap<Optional<R>> field8981 = new Long2ObjectOpenHashMap();
   private final LongLinkedOpenHashSet field8982 = new LongLinkedOpenHashSet();
   private final Function<Runnable, Codec<R>> field8983;
   private final Function<Runnable, R> field8984;
   private final DataFixer field8985;
   private final Class2108 field8986;

   public Class1652(File var1, Function<Runnable, Codec<R>> var2, Function<Runnable, R> var3, DataFixer var4, Class2108 var5, boolean var6) {
      this.field8983 = var2;
      this.field8984 = var3;
      this.field8985 = var4;
      this.field8986 = var5;
      this.field8980 = new Class1707(var1, var6, var1.getName());
   }

   public void method6641(BooleanSupplier var1) {
      while (!this.field8982.isEmpty() && var1.getAsBoolean()) {
         Class7481 var4 = Class2002.method8393(this.field8982.firstLong()).method8423();
         this.method6649(var4);
      }
   }

   @Nullable
   public Optional<R> method6642(long var1) {
      return (Optional<R>)this.field8981.get(var1);
   }

   public Optional<R> method6643(long var1) {
      Class2002 var5 = Class2002.method8393(var1);
      if (!this.method6644(var5)) {
         Optional var6 = this.method6642(var1);
         if (var6 == null) {
            this.method6646(var5.method8423());
            var6 = this.method6642(var1);
            if (var6 != null) {
               return var6;
            } else {
               throw (IllegalStateException) Util.method38516(new IllegalStateException());
            }
         } else {
            return var6;
         }
      } else {
         return Optional.<R>empty();
      }
   }

   public boolean method6644(Class2002 var1) {
      return World.method6721(Class2002.method8406(var1.method8411()));
   }

   public R method6645(long var1) {
      Optional<R> var5 = this.method6643(var1);
      if (!var5.isPresent()) {
         R var6 = this.field8984.apply(() -> this.method6652(var1));
         this.field8981.put(var1, Optional.of(var6));
         return (R)var6;
      } else {
         return (R)var5.get();
      }
   }

   private void method6646(Class7481 var1) {
      this.method6648(var1, NBTDynamicOps.INSTANCE, this.method6647(var1));
   }

   @Nullable
   private CompoundNBT method6647(Class7481 var1) {
      try {
         return this.field8980.method7412(var1);
      } catch (IOException var5) {
         field8979.error("Error reading chunk {} data from disk", var1, var5);
         return null;
      }
   }

   private <T> void method6648(Class7481 var1, DynamicOps<T> var2, T var3) {
      if (var3 != null) {
         Dynamic<T> var6 = new Dynamic<>(var2, var3);
         int var7 = method6653(var6);
         int var8 = SharedConstants.getVersion().getWorldVersion();
         boolean var9 = var7 != var8;
         Dynamic<T> var10 = this.field8985.update(this.field8986.method8778(), var6, var7, var8);
         OptionalDynamic<T> var11 = var10.get("Sections");

         for (int var12 = 0; var12 < 16; var12++) {
            long var13 = Class2002.method8391(var1, var12).method8425();
            Optional<R> var15 = var11.get(Integer.toString(var12))
               .result()
               .flatMap(var3x -> this.field8983.apply(() -> this.method6652(var13)).parse(var3x).resultOrPartial(field8979::error));
            this.field8981.put(var13, var15);
            var15.ifPresent(var4 -> {
               this.method6651(var13);
               if (var9) {
                  this.method6652(var13);
               }
            });
         }
      } else {
         for (int var16 = 0; var16 < 16; var16++) {
            this.field8981.put(Class2002.method8391(var1, var16).method8425(), Optional.empty());
         }
      }
   }

   private void method6649(Class7481 var1) {
      Dynamic var4 = this.method6650(var1, NBTDynamicOps.INSTANCE);
      Class30 var5 = (Class30)var4.getValue();
      if (!(var5 instanceof CompoundNBT)) {
         field8979.error("Expected compound tag, got {}", var5);
      } else {
         this.field8980.method7411(var1, (CompoundNBT)var5);
      }
   }

   private <T> Dynamic<T> method6650(Class7481 var1, DynamicOps<T> var2) {
      Map<T, T> var5 = Maps.newHashMap();

      for (int var6 = 0; var6 < 16; var6++) {
         long var7 = Class2002.method8391(var1, var6).method8425();
         this.field8982.remove(var7);
         Optional<R> var9 = this.field8981.get(var7);
         if (var9 != null && var9.isPresent()) {
            DataResult<T> var10 = this.field8983.apply(() -> this.method6652(var7)).encodeStart(var2, var9.get());
            String var11 = Integer.toString(var6);
            var10.resultOrPartial(field8979::error).ifPresent(var3 -> var5.put(var2.createString(var11), var3));
         }
      }

      return new Dynamic<>(
         var2,
         var2.createMap(
            ImmutableMap.of(
               var2.createString("Sections"), var2.createMap(var5), var2.createString("DataVersion"), var2.createInt(SharedConstants.getVersion().getWorldVersion())
            )
         )
      );
   }

   public void method6651(long var1) {
   }

   public void method6652(long var1) {
      Optional var5 = (Optional)this.field8981.get(var1);
      if (var5 != null && var5.isPresent()) {
         this.field8982.add(var1);
      } else {
         field8979.warn("No data for position: {}", Class2002.method8393(var1));
      }
   }

   private static int method6653(Dynamic<?> var0) {
      return var0.get("DataVersion").asInt(1945);
   }

   public void method6654(Class7481 var1) {
      if (!this.field8982.isEmpty()) {
         for (int var4 = 0; var4 < 16; var4++) {
            long var5 = Class2002.method8391(var1, var4).method8425();
            if (this.field8982.contains(var5)) {
               this.method6649(var1);
               return;
            }
         }
      }
   }

   @Override
   public void close() throws IOException {
      this.field8980.close();
   }
}
