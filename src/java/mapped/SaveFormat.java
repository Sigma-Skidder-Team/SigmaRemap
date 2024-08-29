package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.SignStyle;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.zip.ZipOutputStream;
import javax.annotation.Nullable;

import net.minecraft.client.util.Util;
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
      return new SaveFormat(var0, var0.resolve("../backups"), DataFixesManager.getDataFixer());
   }

   private static <T> Pair<DimensionGeneratorSettings, Lifecycle> method38456(Dynamic<T> var0, DataFixer var1, int var2) {
      Dynamic<T> var5 = var0.get("WorldGenSettings").orElseEmptyMap();
      UnmodifiableIterator var6 = field45715.iterator();

      while (var6.hasNext()) {
         String var7 = (String)var6.next();
         Optional var8 = var0.get(var7).result();
         if (var8.isPresent()) {
            var5 = var5.set(var7, (Dynamic)var8.get());
         }
      }

      Dynamic<T> var9 = var1.update(Class8239.field35400, var5, var2, SharedConstants.getVersion().getWorldVersion());
      DataResult<DimensionGeneratorSettings> var10 = DimensionGeneratorSettings.field_236201_a_.parse(var9);
      return Pair.of(
         var10.resultOrPartial(Util.func_240982_a_("WorldGenSettings: ", field45713::error))
            .orElseGet(
               () -> {
                  Registry<DimensionType> var3 = Class8611.<DimensionType>method30859(Registry.DIMENSION_TYPE_KEY)
                     .codec()
                     .parse(var9)
                     .resultOrPartial(Util.func_240982_a_("Dimension type registry: ", field45713::error))
                     .orElseThrow(() -> new IllegalStateException("Failed to get dimension registry"));
                  Registry<Biome> var4 = Class8611.method30859(Registry.BIOME_KEY)
                     .codec()
                     .parse(var9)
                     .resultOrPartial(Util.func_240982_a_("Biome registry: ", field45713::error))
                     .orElseThrow(() -> new IllegalStateException("Failed to get biome registry"));
                  Registry<DimensionSettings> var5x = Class8611.method30859(Registry.field16099)
                     .codec()
                     .parse(var9)
                     .resultOrPartial(Util.func_240982_a_("Noise settings registry: ", field45713::error))
                     .orElseThrow(() -> new IllegalStateException("Failed to get noise settings registry"));
                  return DimensionGeneratorSettings.method26257(var3, var4, var5x);
               }
            ),
         var10.lifecycle()
      );
   }

   private static DatapackCodec method38457(Dynamic<?> var0) {
      return DatapackCodec.field33532.parse(var0).resultOrPartial(field45713::error).orElse(DatapackCodec.field33531);
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
   private static DatapackCodec method38461(File var0, DataFixer var1) {
      try {
         CompoundNBT var4 = Class8799.method31765(var0);
         CompoundNBT var5 = var4.getCompound("Data");
         var5.method133("Player");
         int var6 = var5.method119("DataVersion", 99) ? var5.method122("DataVersion") : -1;
         Dynamic<Class30> var7 = var1.update(Class2108.field13748.method8778(), new Dynamic(NBTDynamicOps.INSTANCE, var5), var6, SharedConstants.getVersion().getWorldVersion());
         return var7.get("DataPacks").result().map(SaveFormat::method38457).orElse(DatapackCodec.field33531);
      } catch (Exception var8) {
         field45713.error("Exception reading {}", var0, var8);
         return null;
      }
   }

   private static BiFunction<File, DataFixer, ServerWorldInfo> method38462(DynamicOps<Class30> var0, DatapackCodec var1) {
      return (var2, var3) -> {
         try {
            CompoundNBT var6 = Class8799.method31765(var2);
            CompoundNBT var7 = var6.getCompound("Data");
            CompoundNBT var8 = var7.method119("Player", 10) ? var7.getCompound("Player") : null;
            var7.method133("Player");
            int var9 = var7.method119("DataVersion", 99) ? var7.method122("DataVersion") : -1;
            Dynamic var10 = var3.update(Class2108.field13748.method8778(), new Dynamic(var0, var7), var9, SharedConstants.getVersion().getWorldVersion());
            Pair var11 = method38456(var10, var3, var9);
            Class8519 var12 = Class8519.method30181(var10);
            WorldSettings var13 = WorldSettings.method32425(var10, var1);
            return ServerWorldInfo.method20079(var10, var3, var9, var8, var13, var12, (DimensionGeneratorSettings)var11.getFirst(), (Lifecycle)var11.getSecond());
         } catch (Exception var14) {
            field45713.error("Exception reading {}", var2, var14);
            return null;
         }
      };
   }

   private BiFunction<File, DataFixer, Class2024> method38463(File var1, boolean var2) {
      return (var3, var4) -> {
         try {
            CompoundNBT var7 = Class8799.method31765(var3);
            CompoundNBT var8 = var7.getCompound("Data");
            var8.method133("Player");
            int var9 = var8.method119("DataVersion", 99) ? var8.method122("DataVersion") : -1;
            Dynamic<Class30> var10 = var4.update(
               Class2108.field13748.method8778(), new Dynamic(NBTDynamicOps.INSTANCE, var8), var9, SharedConstants.getVersion().getWorldVersion()
            );
            Class8519 var11 = Class8519.method30181(var10);
            int var12 = var11.method30182();
            if (var12 != 19132 && var12 != 19133) {
               return null;
            } else {
               boolean var13 = var12 != this.method38459();
               File var14 = new File(var1, "icon.png");
               DatapackCodec var15 = var10.get("DataPacks").result().map(SaveFormat::method38457).orElse(DatapackCodec.field33531);
               WorldSettings var16 = WorldSettings.method32425(var10, var15);
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

   public LevelSave getLevelSave(String var1) throws IOException {
      return new LevelSave(this, var1);
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
   public static BiFunction method38480(DynamicOps var0, DatapackCodec var1) {
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
   public static DatapackCodec method38483(File var0, DataFixer var1) {
      return method38461(var0, var1);
   }

   public static class LevelSave implements AutoCloseable {
      private final Class1697 field9779;
      private final Path field9780;
      private final String field9781;
      private final Map<FolderName, Path> field9782;
      public final SaveFormat field9783;

      public LevelSave(SaveFormat var1, String var2) throws IOException {
         this.field9783 = var1;
         this.field9782 = Maps.newHashMap();
         this.field9781 = var2;
         this.field9780 = method38475(var1).resolve(var2);
         this.field9779 = Class1697.method7299(this.field9780);
      }

      public String method7990() {
         return this.field9781;
      }

      public Path resolveFilePath(FolderName var1) {
         return this.field9782.computeIfAbsent(var1, var1x -> this.field9780.resolve(var1x.method15910()));
      }

      public File method7992(RegistryKey<World> var1) {
         return DimensionType.getDimensionFolder(var1, this.field9780.toFile());
      }

      private void method7993() {
         if (!this.field9779.method7300()) {
            throw new IllegalStateException("Lock is no longer valid");
         }
      }

      public Class8716 method7994() {
         this.method7993();
         return new Class8716(this, method38476(this.field9783));
      }

      public boolean method7995() {
         Class2024 var3 = this.method7997();
         return var3 != null && var3.method8652().method30182() != method38477(this.field9783);
      }

      public boolean method7996(Class1339 var1) {
         this.method7993();
         return Class9251.method34798(this, var1);
      }

      @Nullable
      public Class2024 method7997() {
         this.method7993();
         return (Class2024) method38479(this.field9783, this.field9780.toFile(), method38478(this.field9783, this.field9780.toFile(), false));
      }

      @Nullable
      public IServerConfiguration readServerConfiguration(DynamicOps<Class30> var1, DatapackCodec var2) {
         this.method7993();
         return (IServerConfiguration) method38479(this.field9783, this.field9780.toFile(), method38480(var1, var2));
      }

      @Nullable
      public DatapackCodec readDatapackCodec() {
         this.method7993();
         return (DatapackCodec) method38479(this.field9783, this.field9780.toFile(), (var0, var1) -> method38483((File) var0, (DataFixer) var1));
      }

      public void saveLevel(DynamicRegistries var1, IServerConfiguration var2) {
         this.method8001(var1, var2, null);
      }

      public void method8001(DynamicRegistries var1, IServerConfiguration var2, CompoundNBT var3) {
         File var6 = this.field9780.toFile();
         CompoundNBT var7 = var2.method20080(var1, var3);
         CompoundNBT var8 = new CompoundNBT();
         var8.put("Data", var7);

         try {
            File var9 = File.createTempFile("level", ".dat", var6);
            Class8799.method31767(var8, var9);
            File var10 = new File(var6, "level.dat_old");
            File var11 = new File(var6, "level.dat");
            Util.method38526(var11, var9, var10);
         } catch (Exception var12) {
            method38481().error("Failed to save level {}", var6, var12);
         }
      }

      public File method8002() {
         this.method7993();
         return this.field9780.resolve("icon.png").toFile();
      }

      public void deleteSave() throws IOException {
         this.method7993();
         Path var3 = this.field9780.resolve("session.lock");

         for (int var4 = 1; var4 <= 5; var4++) {
            method38481().info("Attempt {}...", var4);

            try {
               Files.walkFileTree(this.field9780, new Class7376(this, var3));
               break;
            } catch (IOException var8) {
               if (var4 >= 5) {
                  throw var8;
               }

               method38481().warn("Failed to delete {}", this.field9780, var8);

               try {
                  Thread.sleep(500L);
               } catch (InterruptedException var7) {
               }
            }
         }
      }

      public void method8004(String var1) throws IOException {
         this.method7993();
         File var4 = new File(method38475(this.field9783).toFile(), this.field9781);
         if (var4.exists()) {
            File var5 = new File(var4, "level.dat");
            if (var5.exists()) {
               CompoundNBT var6 = Class8799.method31765(var5);
               CompoundNBT var7 = var6.getCompound("Data");
               var7.method109("LevelName", var1);
               Class8799.method31767(var6, var5);
            }
         }
      }

      public long method8005() throws IOException {
         this.method7993();
         String var3 = LocalDateTime.now().format(method38482()) + "_" + this.field9781;
         Path var4 = this.field9783.method38467();

         try {
            Files.createDirectories(Files.exists(var4) ? var4.toRealPath() : var4);
         } catch (IOException var18) {
            throw new RuntimeException(var18);
         }

         Path var5 = var4.resolve(Class8950.method32695(var4, var3, ".zip"));

         try (ZipOutputStream var6 = new ZipOutputStream(new BufferedOutputStream(Files.newOutputStream(var5)))) {
            Path var8 = Paths.get(this.field9781);
            Files.walkFileTree(this.field9780, new Class7375(this, var8, var6));
         }

         return Files.size(var5);
      }

      @Override
      public void close() throws IOException {
         this.field9779.close();
      }

      // $VF: synthetic method
      public static Path method8008(LevelSave var0) {
         return var0.field9780;
      }

      // $VF: synthetic method
      public static Class1697 method8009(LevelSave var0) {
         return var0.field9779;
      }
   }
}
