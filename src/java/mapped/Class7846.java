package mapped;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.Properties;
import java.util.Random;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class7846 {
   public static final Codec<Class7846> field33650 = RecordCodecBuilder.<Class7846>create(
         var0 -> var0.group(
                  Codec.LONG.fieldOf("seed").stable().forGetter(Class7846::method26259),
                  Codec.BOOL.fieldOf("generate_features").orElse(true).stable().forGetter(Class7846::method26260),
                  Codec.BOOL.fieldOf("bonus_chest").orElse(false).stable().forGetter(Class7846::method26261),
                  Class2350.method9256(Registry.field16068, Lifecycle.stable(), Class9459.field43951)
                     .xmap(Class9459::method36414, Function.identity())
                     .fieldOf("dimensions")
                     .forGetter(Class7846::method26264),
                  Codec.STRING.optionalFieldOf("legacy_custom_options").stable().forGetter(var0x -> var0x.field33656)
               )
               .apply(var0, var0.stable(Class7846::new))
      )
      .comapFlatMap(Class7846::method26254, Function.identity());
   private static final Logger field33651 = LogManager.getLogger();
   private final long field33652;
   private final boolean field33653;
   private final boolean field33654;
   private final Class2350<Class9459> field33655;
   private final Optional<String> field33656;

   private DataResult<Class7846> method26254() {
      Class9459 var3 = this.field33655.method9183(Class9459.field43952);
      if (var3 != null) {
         return !this.method26255() ? DataResult.success(this) : DataResult.success(this, Lifecycle.stable());
      } else {
         return DataResult.error("Overworld settings missing");
      }
   }

   private boolean method26255() {
      return Class9459.method36415(this.field33652, this.field33655);
   }

   public Class7846(long var1, boolean var3, boolean var4, Class2350<Class9459> var5) {
      this(var1, var3, var4, var5, Optional.<String>empty());
      Class9459 var8 = var5.method9183(Class9459.field43952);
      if (var8 == null) {
         throw new IllegalStateException("Overworld settings missing");
      }
   }

   private Class7846(long var1, boolean var3, boolean var4, Class2350<Class9459> var5, Optional<String> var6) {
      this.field33652 = var1;
      this.field33653 = var3;
      this.field33654 = var4;
      this.field33655 = var5;
      this.field33656 = var6;
   }

   public static Class7846 method26256(Class8904 var0) {
      Class2349 var3 = var0.<Biome>method32453(Registry.BIOME_KEY);
      int var4 = "North Carolina".hashCode();
      Class2349 var5 = var0.<Class9535>method32453(Registry.field16066);
      Class2349 var6 = var0.<Class9309>method32453(Registry.field16099);
      return new Class7846((long)var4, true, true, method26262(var5, Class9535.method36871(var5, var3, var6, (long)var4), method26258(var3, var6, (long)var4)));
   }

   public static Class7846 method26257(Registry<Class9535> var0, Registry<Biome> var1, Registry<Class9309> var2) {
      long var5 = new Random().nextLong();
      return new Class7846(var5, true, false, method26262(var0, Class9535.method36871(var0, var1, var2, var5), method26258(var1, var2, var5)));
   }

   public static Class5645 method26258(Registry<Biome> var0, Registry<Class9309> var1, long var2) {
      return new Class5645(new Class1689(var2, false, false, var0), var2, () -> var1.method9189(Class9309.field43230));
   }

   public long method26259() {
      return this.field33652;
   }

   public boolean method26260() {
      return this.field33653;
   }

   public boolean method26261() {
      return this.field33654;
   }

   public static Class2350<Class9459> method26262(Registry<Class9535> var0, Class2350<Class9459> var1, Class5646 var2) {
      Class9459 var5 = var1.method9183(Class9459.field43952);
      Supplier var6 = () -> var5 != null ? var5.method36412() : var0.method9189(Class9535.field44371);
      return method26263(var1, var6, var2);
   }

   public static Class2350<Class9459> method26263(Class2350<Class9459> var0, Supplier<Class9535> var1, Class5646 var2) {
      Class2350<Class9459> var5 = new Class2350(Registry.field16068, Lifecycle.experimental());
      var5.method9250(Class9459.field43952, new Class9459(var1, var2), Lifecycle.stable());


      for (Entry<RegistryKey<Class9459>, Class9459>var7 : var0.method9191()) {
         RegistryKey<Class9459> var8 = var7.getKey();
         if (var8 != Class9459.field43952) {
            var5.method9250(var8, var7.getValue(), var0.method9185(var7.getValue()));
         }
      }

      return var5;
   }

   public Class2350<Class9459> method26264() {
      return this.field33655;
   }

   public Class5646 method26265() {
      Class9459 var3 = this.field33655.method9183(Class9459.field43952);
      if (var3 != null) {
         return var3.method36413();
      } else {
         throw new IllegalStateException("Overworld settings missing");
      }
   }

   public ImmutableSet<RegistryKey<World>> method26266() {
      return this.method26264()
         .method9191()
         .stream()
         .<RegistryKey<World>>map(var0 -> RegistryKey.<World>method31395(Registry.field16067, var0.getKey().method31399()))
         .collect(ImmutableSet.toImmutableSet());
   }

   public boolean method26267() {
      return this.method26265() instanceof Class5647;
   }

   public boolean method26268() {
      return this.method26265() instanceof Class5648;
   }

   public boolean method26269() {
      return this.field33656.isPresent();
   }

   public Class7846 method26270() {
      return new Class7846(this.field33652, this.field33653, true, this.field33655, this.field33656);
   }

   public Class7846 method26271() {
      return new Class7846(this.field33652, !this.field33653, this.field33654, this.field33655);
   }

   public Class7846 method26272() {
      return new Class7846(this.field33652, this.field33653, !this.field33654, this.field33655);
   }

   public static Class7846 method26273(Class8904 var0, Properties var1) {
      String var4 = (String)MoreObjects.firstNonNull((String)var1.get("generator-settings"), "");
      var1.put("generator-settings", var4);
      String var5 = (String)MoreObjects.firstNonNull((String)var1.get("level-seed"), "");
      var1.put("level-seed", var5);
      String var6 = (String)var1.get("generate-structures");
      boolean var7 = var6 == null || Boolean.parseBoolean(var6);
      var1.put("generate-structures", Objects.toString(var7));
      String var8 = (String)var1.get("level-type");
      String var9 = Optional.<String>ofNullable(var8).<String>map(var0x -> var0x.toLowerCase(Locale.ROOT)).orElse("default");
      var1.put("level-type", var9);
      long var10 = new Random().nextLong();
      if (!var5.isEmpty()) {
         try {
            long var12 = Long.parseLong(var5);
            if (var12 != 0L) {
               var10 = var12;
            }
         } catch (NumberFormatException var22) {
            var10 = (long)var5.hashCode();
         }
      }

      Class2349<Class9535> var14 = var0.method32453(Registry.field16066);
      Class2349<Biome> var15 = var0.method32453(Registry.BIOME_KEY);
      Class2349<Class9309> var16 = var0.method32453(Registry.field16099);
      Class2350<Class9459> var17 = Class9535.method36871(var14, var15, var16, var10);
      switch (var9) {
         case "flat":
            JsonObject var20 = !var4.isEmpty() ? Class8963.method32800(var4) : new JsonObject();
            Dynamic<JsonElement> var21 = new Dynamic<>(JsonOps.INSTANCE, var20);
            return new Class7846(
               var10,
               var7,
               false,
               method26262(
                  var14,
                  var17,
                  new Class5648(Class9733.field45443.parse(var21).resultOrPartial(field33651::error).orElseGet(() -> Class9733.method38132(var15)))
               )
            );
         case "debug_all_block_states":
            return new Class7846(var10, var7, false, method26262(var14, var17, new Class5647(var15)));
         case "amplified":
            return new Class7846(
               var10,
               var7,
               false,
               method26262(var14, var17, new Class5645(new Class1689(var10, false, false, var15), var10, () -> var16.method9189(Class9309.field43231)))
            );
         case "largebiomes":
            return new Class7846(
               var10,
               var7,
               false,
               method26262(var14, var17, new Class5645(new Class1689(var10, false, true, var15), var10, () -> var16.method9189(Class9309.field43230)))
            );
         default:
            return new Class7846(var10, var7, false, method26262(var14, var17, method26258(var15, var16, var10)));
      }
   }

   public Class7846 method26274(boolean var1, OptionalLong var2) {
      long var5 = var2.orElse(this.field33652);
      Class2350 var7;
      if (!var2.isPresent()) {
         var7 = this.field33655;
      } else {
         var7 = new Class2350<Class9459>(Registry.field16068, Lifecycle.experimental());
         long var8 = var2.getAsLong();

         for (Entry var11 : this.field33655.method9191()) {
            RegistryKey var12 = (RegistryKey)var11.getKey();
            var7.<Class9459>method9250(
               var12,
               new Class9459(((Class9459)var11.getValue()).method36411(), ((Class9459)var11.getValue()).method36413().method17791(var8)),
               this.field33655.method9185((Class9459)var11.getValue())
            );
         }
      }

      Class7846 var13;
      if (!this.method26267()) {
         var13 = new Class7846(var5, this.method26260(), this.method26261() && !var1, var7);
      } else {
         var13 = new Class7846(var5, false, false, var7);
      }

      return var13;
   }
}
