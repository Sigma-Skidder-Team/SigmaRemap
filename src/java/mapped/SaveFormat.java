package mapped;

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
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SaveFormat {
   private static final Logger field45713 = LogManager.getLogger();
   private static final DateTimeFormatter field45714 = new DateTimeFormatterBuilder()
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
   private static final ImmutableList<String> field45715 = ImmutableList.of(
      "RandomSeed", "generatorName", "generatorOptions", "generatorVersion", "legacy_custom_options", "MapFeatures", "BonusChest"
   );
   private final Path field45716;
   private final Path field45717;
   private final DataFixer field45718;

   public SaveFormat(Path var1, Path var2, DataFixer var3) {
      this.field45718 = var3;

      try {
         Files.createDirectories(Files.exists(var1) ? var1.toRealPath() : var1);
      } catch (IOException var7) {
         throw new RuntimeException(var7);
      }

      this.field45716 = var1;
      this.field45717 = var2;
   }

   public static SaveFormat method38455(Path var0) {
      return new SaveFormat(var0, var0.resolve("../backups"), Class4497.method14181());
   }

   private static <T> Pair<Class7846, Lifecycle> method38456(Dynamic<T> var0, DataFixer var1, int var2) {
      Dynamic<T> var5 = var0.get("WorldGenSettings").orElseEmptyMap();
      UnmodifiableIterator var6 = field45715.iterator();

      while (var6.hasNext()) {
         String var7 = (String)var6.next();
         Optional var8 = var0.get(var7).result();
         if (var8.isPresent()) {
            var5 = var5.set(var7, (Dynamic)var8.get());
         }
      }

      Dynamic<T> var9 = var1.update(Class8239.field35400, var5, var2, SharedConstants.method34773().getWorldVersion());
      DataResult<Class7846> var10 = Class7846.field33650.parse(var9);
      return Pair.of(
         var10.resultOrPartial(Util.method38529("WorldGenSettings: ", field45713::error))
            .orElseGet(
               () -> {
                  Class2348<Class9535> var3 = Class8611.<Class9535>method30859(Class2348.field16066)
                     .codec()
                     .parse(var9)
                     .resultOrPartial(Util.method38529("Dimension type registry: ", field45713::error))
                     .orElseThrow(() -> new IllegalStateException("Failed to get dimension registry"));
                  Class2348<Class8907> var4 = Class8611.method30859(Class2348.field16106)
                     .codec()
                     .parse(var9)
                     .resultOrPartial(Util.method38529("Biome registry: ", field45713::error))
                     .orElseThrow(() -> new IllegalStateException("Failed to get biome registry"));
                  Class2348<Class9309> var5x = Class8611.method30859(Class2348.field16099)
                     .codec()
                     .parse(var9)
                     .resultOrPartial(Util.method38529("Noise settings registry: ", field45713::error))
                     .orElseThrow(() -> new IllegalStateException("Failed to get noise settings registry"));
                  return Class7846.method26257(var3, var4, var5x);
               }
            ),
         var10.lifecycle()
      );
   }

   private static Class7818 method38457(Dynamic<?> var0) {
      return Class7818.field33532.parse(var0).resultOrPartial(field45713::error).orElse(Class7818.field33531);
   }

   public List<Class2024> method38458() throws Class2428 {
      if (!Files.isDirectory(this.field45716)) {
         throw new Class2428(new TranslationTextComponent("selectWorld.load_folder_access").getString());
      } else {
         ArrayList var3 = Lists.newArrayList();
         File[] var4 = this.field45716.toFile().listFiles();

         for (File var8 : var4) {
            if (var8.isDirectory()) {
               boolean var9;
               try {
                  var9 = Class1697.method7301(var8.toPath());
               } catch (Exception var11) {
                  field45713.warn("Failed to read {} lock", var8, var11);
                  continue;
               }

               Class2024 var10 = this.<Class2024>method38460(var8, this.method38463(var8, var9));
               if (var10 != null) {
                  var3.add(var10);
               }
            }
         }

         return var3;
      }
   }

   private int method38459() {
      return 19133;
   }

   @Nullable
   private <T> T method38460(File var1, BiFunction<File, DataFixer, T> var2) {
      if (var1.exists()) {
         File var5 = new File(var1, "level.dat");
         if (var5.exists()) {
            Object var6 = var2.apply(var5, this.field45718);
            if (var6 != null) {
               return (T)var6;
            }
         }

         var5 = new File(var1, "level.dat_old");
         return (T)(!var5.exists() ? null : var2.apply(var5, this.field45718));
      } else {
         return null;
      }
   }

   @Nullable
   private static Class7818 method38461(File var0, DataFixer var1) {
      try {
         Class39 var4 = Class8799.method31765(var0);
         Class39 var5 = var4.method130("Data");
         var5.method133("Player");
         int var6 = var5.method119("DataVersion", 99) ? var5.method122("DataVersion") : -1;
         Dynamic<Class30> var7 = var1.update(Class2108.field13748.method8778(), new Dynamic(Class8063.field34602, var5), var6, SharedConstants.method34773().getWorldVersion());
         return var7.get("DataPacks").result().map(SaveFormat::method38457).orElse(Class7818.field33531);
      } catch (Exception var8) {
         field45713.error("Exception reading {}", var0, var8);
         return null;
      }
   }

   private static BiFunction<File, DataFixer, Class6610> method38462(DynamicOps<Class30> var0, Class7818 var1) {
      return (var2, var3) -> {
         try {
            Class39 var6 = Class8799.method31765(var2);
            Class39 var7 = var6.method130("Data");
            Class39 var8 = var7.method119("Player", 10) ? var7.method130("Player") : null;
            var7.method133("Player");
            int var9 = var7.method119("DataVersion", 99) ? var7.method122("DataVersion") : -1;
            Dynamic var10 = var3.update(Class2108.field13748.method8778(), new Dynamic(var0, var7), var9, SharedConstants.method34773().getWorldVersion());
            Pair var11 = method38456(var10, var3, var9);
            Class8519 var12 = Class8519.method30181(var10);
            Class8898 var13 = Class8898.method32425(var10, var1);
            return Class6610.method20079(var10, var3, var9, var8, var13, var12, (Class7846)var11.getFirst(), (Lifecycle)var11.getSecond());
         } catch (Exception var14) {
            field45713.error("Exception reading {}", var2, var14);
            return null;
         }
      };
   }

   private BiFunction<File, DataFixer, Class2024> method38463(File var1, boolean var2) {
      return (var3, var4) -> {
         try {
            Class39 var7 = Class8799.method31765(var3);
            Class39 var8 = var7.method130("Data");
            var8.method133("Player");
            int var9 = var8.method119("DataVersion", 99) ? var8.method122("DataVersion") : -1;
            Dynamic<Class30> var10 = var4.update(
               Class2108.field13748.method8778(), new Dynamic(Class8063.field34602, var8), var9, SharedConstants.method34773().getWorldVersion()
            );
            Class8519 var11 = Class8519.method30181(var10);
            int var12 = var11.method30182();
            if (var12 != 19132 && var12 != 19133) {
               return null;
            } else {
               boolean var13 = var12 != this.method38459();
               File var14 = new File(var1, "icon.png");
               Class7818 var15 = var10.get("DataPacks").result().map(SaveFormat::method38457).orElse(Class7818.field33531);
               Class8898 var16 = Class8898.method32425(var10, var15);
               return new Class2024(var16, var11, var1.getName(), var13, var2, var14);
            }
         } catch (Exception var17) {
            field45713.error("Exception reading {}", var3, var17);
            return null;
         }
      };
   }

   public boolean method38464(String var1) {
      try {
         Path var4 = this.field45716.resolve(var1);
         Files.createDirectory(var4);
         Files.deleteIfExists(var4);
         return true;
      } catch (IOException var5) {
         return false;
      }
   }

   public boolean method38465(String var1) {
      return Files.isDirectory(this.field45716.resolve(var1));
   }

   public Path method38466() {
      return this.field45716;
   }

   public Path method38467() {
      return this.field45717;
   }

   public Class1814 method38468(String var1) throws IOException {
      return new Class1814(this, var1);
   }

   // $VF: synthetic method
   public static Path method38475(SaveFormat var0) {
      return var0.field45716;
   }

   // $VF: synthetic method
   public static DataFixer method38476(SaveFormat var0) {
      return var0.field45718;
   }

   // $VF: synthetic method
   public static int method38477(SaveFormat var0) {
      return var0.method38459();
   }

   // $VF: synthetic method
   public static BiFunction method38478(SaveFormat var0, File var1, boolean var2) {
      return var0.method38463(var1, var2);
   }

   // $VF: synthetic method
   public static Object method38479(SaveFormat var0, File var1, BiFunction var2) {
      return var0.method38460(var1, var2);
   }

   // $VF: synthetic method
   public static BiFunction method38480(DynamicOps var0, Class7818 var1) {
      return method38462(var0, var1);
   }

   // $VF: synthetic method
   public static Logger method38481() {
      return field45713;
   }

   // $VF: synthetic method
   public static DateTimeFormatter method38482() {
      return field45714;
   }

   // $VF: synthetic method
   public static Class7818 method38483(File var0, DataFixer var1) {
      return method38461(var0, var1);
   }
}
