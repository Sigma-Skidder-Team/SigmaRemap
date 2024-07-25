package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.SignStyle;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import javax.annotation.Nullable;
import net.minecraft.client.AnvilConverterException;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_9663 {
   private static final Logger field_49220 = LogManager.getLogger();
   private static final DateTimeFormatter field_49216 = new DateTimeFormatterBuilder()
      .appendValue(ChronoField.YEAR, 4, 10, SignStyle.EXCEEDS_PAD)
      .appendLiteral('-')
      .appendValue(ChronoField.MONTH_OF_YEAR, 2)
      .appendLiteral('-')
      .appendValue(ChronoField.DAY_OF_MONTH, 2)
      .appendLiteral('_')
      .appendValue(ChronoField.HOUR_OF_DAY, 2)
      .appendLiteral('-')
      .appendValue(ChronoField.MINUTE_OF_HOUR, 2)
      .appendLiteral('-')
      .appendValue(ChronoField.SECOND_OF_MINUTE, 2)
      .toFormatter();
   private static final ImmutableList<String> field_49217 = ImmutableList.of(
      "RandomSeed", "generatorName", "generatorOptions", "generatorVersion", "legacy_custom_options", "MapFeatures", "BonusChest"
   );
   private final Path field_49218;
   private final Path field_49219;
   private final DataFixer field_49222;

   public class_9663(Path var1, Path var2, DataFixer var3) {
      this.field_49222 = var3;

      try {
         Files.createDirectories(Files.exists(var1) ? var1.toRealPath() : var1);
      } catch (IOException var7) {
         throw new RuntimeException(var7);
      }

      this.field_49218 = var1;
      this.field_49219 = var2;
   }

   public static class_9663 method_44628(Path var0) {
      return new class_9663(var0, var0.resolve("../backups"), class_148.method_580());
   }

   private static <T> Pair<class_2904, Lifecycle> method_44635(Dynamic<T> var0, DataFixer var1, int var2) {
      Dynamic var5 = var0.get("WorldGenSettings").orElseEmptyMap();
      UnmodifiableIterator var6 = field_49217.iterator();

      while (var6.hasNext()) {
         String var7 = (String)var6.next();
         Optional var8 = var0.get(var7).result();
         if (var8.isPresent()) {
            var5 = var5.set(var7, (Dynamic)var8.get());
         }
      }

      Dynamic var9 = var1.update(class_4002.field_19441, var5, var2, class_7665.method_34674().getWorldVersion());
      DataResult var10 = class_2904.field_14169.parse(var9);
      return Pair.of(
         var10.resultOrPartial(Util.method_44690("WorldGenSettings: ", field_49220::error))
            .orElseGet(
               () -> {
                  class_8669 var3 = (class_8669)class_5203.<class_8760>method_23878(class_8669.field_44415)
                     .codec()
                     .parse(var9)
                     .resultOrPartial(Util.method_44690("Dimension type registry: ", field_49220::error))
                     .orElseThrow(() -> new IllegalStateException("Failed to get dimension registry"));
                  class_8669 var4 = (class_8669)class_5203.<class_6325>method_23878(class_8669.field_44359)
                     .codec()
                     .parse(var9)
                     .resultOrPartial(Util.method_44690("Biome registry: ", field_49220::error))
                     .orElseThrow(() -> new IllegalStateException("Failed to get biome registry"));
                  class_8669 var5x = (class_8669)class_5203.<class_7902>method_23878(class_8669.field_44360)
                     .codec()
                     .parse(var9)
                     .resultOrPartial(Util.method_44690("Noise settings registry: ", field_49220::error))
                     .orElseThrow(() -> new IllegalStateException("Failed to get noise settings registry"));
                  return class_2904.method_13291(var3, var4, var5x);
               }
            ),
         var10.lifecycle()
      );
   }

   private static class_2805 method_44638(Dynamic<?> var0) {
      return class_2805.field_13767.parse(var0).resultOrPartial(field_49220::error).orElse(class_2805.field_13766);
   }

   public List<class_460> method_44631() throws AnvilConverterException {
      if (!Files.isDirectory(this.field_49218)) {
         throw new class_4031(new TranslationTextComponent("selectWorld.load_folder_access").getString());
      } else {
         ArrayList var3 = Lists.newArrayList();
         File[] var4 = this.field_49218.toFile().listFiles();

         for (File var8 : var4) {
            if (var8.isDirectory()) {
               boolean var9;
               try {
                  var9 = class_7532.method_34317(var8.toPath());
               } catch (Exception var11) {
                  field_49220.warn("Failed to read {} lock", var8, var11);
                  continue;
               }

               class_460 var10 = this.<class_460>method_44639(var8, this.method_44620(var8, var9));
               if (var10 != null) {
                  var3.add(var10);
               }
            }
         }

         return var3;
      }
   }

   private int method_44621() {
      return 19133;
   }

   @Nullable
   private <T> T method_44639(File var1, BiFunction<File, DataFixer, T> var2) {
      if (var1.exists()) {
         File var5 = new File(var1, "level.dat");
         if (var5.exists()) {
            Object var6 = var2.apply(var5, this.field_49222);
            if (var6 != null) {
               return (T)var6;
            }
         }

         var5 = new File(var1, "level.dat_old");
         return (T)(!var5.exists() ? null : var2.apply(var5, this.field_49222));
      } else {
         return null;
      }
   }

   @Nullable
   private static class_2805 method_44624(File var0, DataFixer var1) {
      try {
         class_5734 var4 = class_5957.method_27227(var0);
         class_5734 var5 = var4.method_25937("Data");
         var5.method_25959("Player");
         int var6 = var5.method_25939("DataVersion", 99) ? var5.method_25947("DataVersion") : -1;
         Dynamic var7 = var1.update(
            class_5397.field_27548.method_24571(), new Dynamic(class_3504.field_17178, var5), var6, class_7665.method_34674().getWorldVersion()
         );
         return var7.get("DataPacks").result().<class_2805>map(class_9663::method_44638).orElse(class_2805.field_13766);
      } catch (Exception var8) {
         field_49220.error("Exception reading {}", var0, var8);
         return null;
      }
   }

   private static BiFunction<File, DataFixer, class_5056> method_44622(DynamicOps<class_8406> var0, class_2805 var1) {
      return (var2, var3) -> {
         try {
            class_5734 var6 = class_5957.method_27227(var2);
            class_5734 var7 = var6.method_25937("Data");
            class_5734 var8 = var7.method_25939("Player", 10) ? var7.method_25937("Player") : null;
            var7.method_25959("Player");
            int var9 = var7.method_25939("DataVersion", 99) ? var7.method_25947("DataVersion") : -1;
            Dynamic var10 = var3.update(class_5397.field_27548.method_24571(), new Dynamic(var0, var7), var9, class_7665.method_34674().getWorldVersion());
            Pair var11 = method_44635(var10, var3, var9);
            class_4922 var12 = class_4922.method_22546(var10);
            class_6292 var13 = class_6292.method_28715(var10, var1);
            return class_5056.method_23310(var10, var3, var9, var8, var13, var12, (class_2904)var11.getFirst(), (Lifecycle)var11.getSecond());
         } catch (Exception var14) {
            field_49220.error("Exception reading {}", var2, var14);
            return null;
         }
      };
   }

   private BiFunction<File, DataFixer, class_460> method_44620(File var1, boolean var2) {
      return (var3, var4) -> {
         try {
            class_5734 var7 = class_5957.method_27227(var3);
            class_5734 var8 = var7.method_25937("Data");
            var8.method_25959("Player");
            int var9 = var8.method_25939("DataVersion", 99) ? var8.method_25947("DataVersion") : -1;
            Dynamic var10 = var4.update(
               class_5397.field_27548.method_24571(), new Dynamic(class_3504.field_17178, var8), var9, class_7665.method_34674().getWorldVersion()
            );
            class_4922 var11 = class_4922.method_22546(var10);
            int var12 = var11.method_22540();
            if (var12 != 19132 && var12 != 19133) {
               return null;
            } else {
               boolean var13 = var12 != this.method_44621();
               File var14 = new File(var1, "icon.png");
               class_2805 var15 = var10.get("DataPacks").result().<class_2805>map(class_9663::method_44638).orElse(class_2805.field_13766);
               class_6292 var16 = class_6292.method_28715(var10, var15);
               return new class_460(var16, var11, var1.getName(), var13, var2, var14);
            }
         } catch (Exception var17) {
            field_49220.error("Exception reading {}", var3, var17);
            return null;
         }
      };
   }

   public boolean method_44626(String var1) {
      try {
         Path var4 = this.field_49218.resolve(var1);
         Files.createDirectory(var4);
         Files.deleteIfExists(var4);
         return true;
      } catch (IOException var5) {
         return false;
      }
   }

   public boolean method_44634(String var1) {
      return Files.isDirectory(this.field_49218.resolve(var1));
   }

   public Path method_44618() {
      return this.field_49218;
   }

   public Path method_44625() {
      return this.field_49219;
   }

   public class_3676 method_44633(String var1) throws IOException {
      return new class_3676(this, var1);
   }
}
