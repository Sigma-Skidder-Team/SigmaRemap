package remapped;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableSet;
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

public class class_2904 {
   public static final Codec<class_2904> field_14169 = RecordCodecBuilder.create(
         var0 -> var0.group(
                  Codec.LONG.fieldOf("seed").stable().forGetter(class_2904::method_13295),
                  Codec.BOOL.fieldOf("generate_features").orElse(true).stable().forGetter(class_2904::method_13287),
                  Codec.BOOL.fieldOf("bonus_chest").orElse(false).stable().forGetter(class_2904::method_13293),
                  class_5383.<class_8472>method_24530(class_8669.field_44420, Lifecycle.stable(), class_8472.field_43409)
                     .xmap(class_8472::method_38997, Function.identity())
                     .fieldOf("dimensions")
                     .forGetter(class_2904::method_13296),
                  Codec.STRING.optionalFieldOf("legacy_custom_options").stable().forGetter(var0x -> var0x.field_14171)
               )
               .apply(var0, var0.stable(class_2904::new))
      )
      .comapFlatMap(class_2904::method_13302, Function.identity());
   private static final Logger field_14175 = LogManager.getLogger();
   private final long field_14172;
   private final boolean field_14170;
   private final boolean field_14176;
   private final class_5383<class_8472> field_14174;
   private final Optional<String> field_14171;

   private DataResult<class_2904> method_13302() {
      class_8472 var3 = this.field_14174.method_39799(class_8472.field_43412);
      if (var3 != null) {
         return !this.method_13298() ? DataResult.success(this) : DataResult.success(this, Lifecycle.stable());
      } else {
         return DataResult.error("Overworld settings missing");
      }
   }

   private boolean method_13298() {
      return class_8472.method_38993(this.field_14172, this.field_14174);
   }

   public class_2904(long var1, boolean var3, boolean var4, class_5383<class_8472> var5) {
      this(var1, var3, var4, var5, Optional.<String>empty());
      class_8472 var8 = var5.method_39799(class_8472.field_43412);
      if (var8 == null) {
         throw new IllegalStateException("Overworld settings missing");
      }
   }

   private class_2904(long var1, boolean var3, boolean var4, class_5383<class_8472> var5, Optional<String> var6) {
      this.field_14172 = var1;
      this.field_14170 = var3;
      this.field_14176 = var4;
      this.field_14174 = var5;
      this.field_14171 = var6;
   }

   public static class_2904 method_13303(class_6322 var0) {
      class_6433 var3 = var0.<class_6325>method_28813(class_8669.field_44359);
      int var4 = "North Carolina".hashCode();
      class_6433 var5 = var0.<class_8760>method_28813(class_8669.field_44415);
      class_6433 var6 = var0.<class_7902>method_28813(class_8669.field_44360);
      return new class_2904(
         (long)var4, true, true, method_13292(var5, class_8760.method_40218(var5, var3, var6, (long)var4), method_13283(var3, var6, (long)var4))
      );
   }

   public static class_2904 method_13291(class_8669<class_8760> var0, class_8669<class_6325> var1, class_8669<class_7902> var2) {
      long var5 = new Random().nextLong();
      return new class_2904(var5, true, false, method_13292(var0, class_8760.method_40218(var0, var1, var2, var5), method_13283(var1, var2, var5)));
   }

   public static class_322 method_13283(class_8669<class_6325> var0, class_8669<class_7902> var1, long var2) {
      return new class_322(new class_3925(var2, false, false, var0), var2, () -> var1.method_39807(class_7902.field_40411));
   }

   public long method_13295() {
      return this.field_14172;
   }

   public boolean method_13287() {
      return this.field_14170;
   }

   public boolean method_13293() {
      return this.field_14176;
   }

   public static class_5383<class_8472> method_13292(class_8669<class_8760> var0, class_5383<class_8472> var1, class_6541 var2) {
      class_8472 var5 = var1.method_39799(class_8472.field_43412);
      Supplier var6 = () -> var5 != null ? var5.method_38995() : var0.method_39807(class_8760.field_44833);
      return method_13284(var1, var6, var2);
   }

   public static class_5383<class_8472> method_13284(class_5383<class_8472> var0, Supplier<class_8760> var1, class_6541 var2) {
      class_5383 var5 = new class_5383<class_8472>(class_8669.field_44420, Lifecycle.experimental());
      var5.<class_8472>method_29381(class_8472.field_43412, new class_8472(var1, var2), Lifecycle.stable());

      for (Entry var7 : var0.method_39808()) {
         class_5621 var8 = (class_5621)var7.getKey();
         if (var8 != class_8472.field_43412) {
            var5.<Object>method_29381(var8, var7.getValue(), var0.method_39813(var7.getValue()));
         }
      }

      return var5;
   }

   public class_5383<class_8472> method_13296() {
      return this.field_14174;
   }

   public class_6541 method_13300() {
      class_8472 var3 = this.field_14174.method_39799(class_8472.field_43412);
      if (var3 != null) {
         return var3.method_38996();
      } else {
         throw new IllegalStateException("Overworld settings missing");
      }
   }

   public ImmutableSet<class_5621<World>> method_13297() {
      return this.method_13296()
         .method_39808()
         .stream()
         .<class_5621<World>>map(var0 -> class_5621.<World>method_25497(class_8669.field_44372, var0.getKey().method_25499()))
         .collect(ImmutableSet.toImmutableSet());
   }

   public boolean method_13290() {
      return this.method_13300() instanceof class_8510;
   }

   public boolean method_13288() {
      return this.method_13300() instanceof class_6463;
   }

   public boolean method_13301() {
      return this.field_14171.isPresent();
   }

   public class_2904 method_13285() {
      return new class_2904(this.field_14172, this.field_14170, true, this.field_14174, this.field_14171);
   }

   public class_2904 method_13294() {
      return new class_2904(this.field_14172, !this.field_14170, this.field_14176, this.field_14174);
   }

   public class_2904 method_13282() {
      return new class_2904(this.field_14172, this.field_14170, !this.field_14176, this.field_14174);
   }

   public static class_2904 method_13299(class_6322 var0, Properties var1) {
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

      class_6433 var14 = var0.<class_8760>method_28813(class_8669.field_44415);
      class_6433 var15 = var0.<class_6325>method_28813(class_8669.field_44359);
      class_6433 var16 = var0.<class_7902>method_28813(class_8669.field_44360);
      class_5383 var17 = class_8760.method_40218(var14, var15, var16, var10);
      switch (var9) {
         case "flat":
            JsonObject var20 = !var4.isEmpty() ? class_6539.method_29807(var4) : new JsonObject();
            Dynamic var21 = new Dynamic(JsonOps.INSTANCE, var20);
            return new class_2904(
               var10,
               var7,
               false,
               method_13292(
                  var14,
                  var17,
                  new class_6463(class_9512.field_48429.parse(var21).resultOrPartial(field_14175::error).orElseGet(() -> class_9512.method_43900(var15)))
               )
            );
         case "debug_all_block_states":
            return new class_2904(var10, var7, false, method_13292(var14, var17, new class_8510(var15)));
         case "amplified":
            return new class_2904(
               var10,
               var7,
               false,
               method_13292(var14, var17, new class_322(new class_3925(var10, false, false, var15), var10, () -> var16.method_39807(class_7902.field_40407)))
            );
         case "largebiomes":
            return new class_2904(
               var10,
               var7,
               false,
               method_13292(var14, var17, new class_322(new class_3925(var10, false, true, var15), var10, () -> var16.method_39807(class_7902.field_40411)))
            );
         default:
            return new class_2904(var10, var7, false, method_13292(var14, var17, method_13283(var15, var16, var10)));
      }
   }

   public class_2904 method_13289(boolean var1, OptionalLong var2) {
      long var5 = var2.orElse(this.field_14172);
      class_5383 var7;
      if (!var2.isPresent()) {
         var7 = this.field_14174;
      } else {
         var7 = new class_5383<class_8472>(class_8669.field_44420, Lifecycle.experimental());
         long var8 = var2.getAsLong();

         for (Entry var11 : this.field_14174.method_39808()) {
            class_5621 var12 = (class_5621)var11.getKey();
            var7.<class_8472>method_29381(
               var12,
               new class_8472(((class_8472)var11.getValue()).method_38992(), ((class_8472)var11.getValue()).method_38996().method_29828(var8)),
               this.field_14174.method_39813((class_8472)var11.getValue())
            );
         }
      }

      class_2904 var13;
      if (!this.method_13290()) {
         var13 = new class_2904(var5, this.method_13287(), this.method_13293() && !var1, var7);
      } else {
         var13 = new class_2904(var5, false, false, var7);
      }

      return var13;
   }
}
