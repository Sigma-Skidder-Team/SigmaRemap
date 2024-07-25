package remapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.DataResult.PartialResult;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.PointerBuffer;
import org.lwjgl.util.tinyfd.TinyFileDialogs;

public class class_668 implements class_1200, class_1463 {
   private static final Logger field_3706 = LogManager.getLogger();
   private static final ITextComponent field_3712 = new TranslationTextComponent("generator.custom");
   private static final ITextComponent field_3713 = new TranslationTextComponent("generator.amplified.info");
   private static final ITextComponent field_3714 = new TranslationTextComponent("selectWorld.mapFeatures.info");
   private class_416 field_3710 = class_416.field_1766;
   private class_9854 field_3709;
   private int field_3707;
   private class_1863 field_3704;
   private class_9521 field_3702;
   public class_9521 field_3705;
   private class_9521 field_3716;
   private class_9521 field_3715;
   private class_9521 field_3708;
   private class_7522 field_3703;
   private class_2904 field_3717;
   private Optional<class_7149> field_3701;
   private OptionalLong field_3711;

   public class_668(class_7522 var1, class_2904 var2, Optional<class_7149> var3, OptionalLong var4) {
      this.field_3703 = var1;
      this.field_3717 = var2;
      this.field_3701 = var3;
      this.field_3711 = var4;
   }

   public void method_3068(class_6577 var1, class_1893 var2, class_9854 var3) {
      this.field_3709 = var3;
      this.field_3707 = var1.field_941;
      this.field_3704 = new class_1863(this.field_3709, this.field_3707 / 2 - 100, 60, 200, 20, new TranslationTextComponent("selectWorld.enterSeed"));
      this.field_3704.method_8281(method_3063(this.field_3711));
      this.field_3704.method_8277(var1x -> this.field_3711 = this.method_3067());
      var1.<class_1863>method_1159(this.field_3704);
      int var6 = this.field_3707 / 2 - 155;
      int var7 = this.field_3707 / 2 + 5;
      this.field_3702 = var1.<class_9521>method_1186(
         new class_2549(this, var6, 100, 150, 20, new TranslationTextComponent("selectWorld.mapFeatures"), var1x -> {
            this.field_3717 = this.field_3717.method_13294();
            var1x.method_32693(250);
         })
      );
      this.field_3702.field_36677 = false;
      this.field_3716 = var1.<class_9521>method_1186(
         new class_3115(
            this,
            var7,
            100,
            150,
            20,
            new TranslationTextComponent("selectWorld.mapType"),
            var2x -> {
               while (this.field_3701.isPresent()) {
                  int var5 = class_7149.field_36824.indexOf(this.field_3701.get()) + 1;
                  if (var5 >= class_7149.field_36824.size()) {
                     var5 = 0;
                  }

                  class_7149 var6x = class_7149.field_36824.get(var5);
                  this.field_3701 = Optional.<class_7149>of(var6x);
                  this.field_3717 = var6x.method_32810(
                     this.field_3703, this.field_3717.method_13295(), this.field_3717.method_13287(), this.field_3717.method_13293()
                  );
                  if (!this.field_3717.method_13290() || class_266.method_1190()) {
                     break;
                  }
               }

               var1.method_30066();
               var2x.method_32693(250);
            }
         )
      );
      this.field_3716.field_36677 = false;
      this.field_3716.field_36675 = this.field_3701.isPresent();
      this.field_3715 = var1.<class_9521>method_1186(new class_9521(var7, 120, 150, 20, new TranslationTextComponent("selectWorld.customizeType"), var3x -> {
         class_2876 var6x = class_7149.field_36822.get(this.field_3701);
         if (var6x != null) {
            var2.method_8609(var6x.method_13214(var1, this.field_3717));
         }
      }));
      this.field_3715.field_36677 = false;
      this.field_3705 = var1.<class_9521>method_1186(
         new class_4011(this, var6, 151, 150, 20, new TranslationTextComponent("selectWorld.bonusItems"), var1x -> {
            this.field_3717 = this.field_3717.method_13282();
            var1x.method_32693(250);
         }, var1)
      );
      this.field_3705.field_36677 = false;
      this.field_3708 = var1.<class_9521>method_1186(
         new class_9521(
            var6,
            185,
            150,
            20,
            new TranslationTextComponent("selectWorld.import_worldgen_settings"),
            var3x -> {
               TranslationTextComponent var6x = new TranslationTextComponent("selectWorld.import_worldgen_settings.select_file");
               String var7x = TinyFileDialogs.tinyfd_openFileDialog(var6x.getString(), (CharSequence)null, (PointerBuffer)null, (CharSequence)null, false);
               if (var7x != null) {
                  class_7522 var8 = class_6322.method_28810();
                  class_6354 var9 = new class_6354(new class_2362(), new class_8936(var1.method_30062().toFile(), class_2541.field_12594));

                  class_6298 var11;
                  try {
                     class_341.method_1673(var9, var1.field_33532, false);
                     CompletableFuture var10 = class_6298.method_28747(var9.method_29115(), class_9019.field_46137, 2, class_9665.method_44661(), var2);
                     var2.method_34461(var10::isDone);
                     var11 = (class_6298)var10.get();
                  } catch (InterruptedException | ExecutionException var27) {
                     field_3706.error("Error loading data packs when importing world settings", var27);
                     TranslationTextComponent var12 = new TranslationTextComponent("selectWorld.import_worldgen_settings.failure");
                     StringTextComponent var13 = new StringTextComponent(var27.getMessage());
                     var2.method_8519().method_42329(class_4201.method_19556(var2, class_200.field_664, var12, var13));
                     var9.close();
                     return;
                  }

                  class_888 var30 = class_888.method_3825(JsonOps.INSTANCE, var11.method_28743(), var8);
                  JsonParser var31 = new JsonParser();

                  DataResult var32;
                  try (BufferedReader var14 = Files.newBufferedReader(Paths.get(var7x))) {
                     JsonElement var16 = var31.parse(var14);
                     var32 = class_2904.field_14169.parse(var30, var16);
                  } catch (JsonSyntaxException | IOException | JsonIOException var29) {
                     var32 = DataResult.error("Failed to parse file: " + var29.getMessage());
                  }

                  if (var32.error().isPresent()) {
                     TranslationTextComponent var33 = new TranslationTextComponent("selectWorld.import_worldgen_settings.failure");
                     String var35 = ((PartialResult)var32.error().get()).message();
                     field_3706.error("Error parsing world settings: {}", var35);
                     StringTextComponent var36 = new StringTextComponent(var35);
                     var2.method_8519().method_42329(class_4201.method_19556(var2, class_200.field_664, var33, var36));
                  }

                  var11.close();
                  Lifecycle var34 = var32.lifecycle();
                  var32.resultOrPartial(field_3706::error)
                     .ifPresent(
                        var5 -> {
                           BooleanConsumer var8x = var5x -> {
                              var2.method_8609(var1);
                              if (var5x) {
                                 this.method_3057(var8, var5);
                              }
                           };
                           if (var34 != Lifecycle.stable()) {
                              if (var34 != Lifecycle.experimental()) {
                                 var2.method_8609(
                                    new class_9640(
                                       var8x,
                                       new TranslationTextComponent("selectWorld.import_worldgen_settings.deprecated.title"),
                                       new TranslationTextComponent("selectWorld.import_worldgen_settings.deprecated.question")
                                    )
                                 );
                              } else {
                                 var2.method_8609(
                                    new class_9640(
                                       var8x,
                                       new TranslationTextComponent("selectWorld.import_worldgen_settings.experimental.title"),
                                       new TranslationTextComponent("selectWorld.import_worldgen_settings.experimental.question")
                                    )
                                 );
                              }
                           } else {
                              this.method_3057(var8, var5);
                           }
                        }
                     );
               }
            }
         )
      );
      this.field_3708.field_36677 = false;
      this.field_3710 = class_416.method_2075(var3, field_3713, this.field_3716.method_32699());
   }

   private void method_3057(class_7522 var1, class_2904 var2) {
      this.field_3703 = var1;
      this.field_3717 = var2;
      this.field_3701 = class_7149.method_32812(var2);
      this.field_3711 = OptionalLong.of(var2.method_13295());
      this.field_3704.method_8281(method_3063(this.field_3711));
      this.field_3716.field_36675 = this.field_3701.isPresent();
   }

   @Override
   public void method_5312() {
      this.field_3704.method_8279();
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      if (this.field_3702.field_36677) {
         this.field_3709.method_45392(var1, field_3714, (float)(this.field_3707 / 2 - 150), 122.0F, -6250336);
      }

      this.field_3704.method_6767(var1, var2, var3, var4);
      if (this.field_3701.equals(Optional.<class_7149>of(class_7149.field_36818))) {
         this.field_3710.method_2074(var1, this.field_3716.field_36670 + 2, this.field_3716.field_36674 + 22, 9, 10526880);
      }
   }

   public void method_3065(class_2904 var1) {
      this.field_3717 = var1;
   }

   private static String method_3063(OptionalLong var0) {
      return !var0.isPresent() ? "" : Long.toString(var0.getAsLong());
   }

   private static OptionalLong method_3066(String var0) {
      try {
         return OptionalLong.of(Long.parseLong(var0));
      } catch (NumberFormatException var4) {
         return OptionalLong.empty();
      }
   }

   public class_2904 method_3070(boolean var1) {
      OptionalLong var4 = this.method_3067();
      return this.field_3717.method_13289(var1, var4);
   }

   private OptionalLong method_3067() {
      String var3 = this.field_3704.method_8246();
      OptionalLong var5;
      if (!StringUtils.isEmpty(var3)) {
         OptionalLong var4 = method_3066(var3);
         if (var4.isPresent() && var4.getAsLong() != 0L) {
            var5 = var4;
         } else {
            var5 = OptionalLong.of((long)var3.hashCode());
         }
      } else {
         var5 = OptionalLong.empty();
      }

      return var5;
   }

   public boolean method_3056() {
      return this.field_3717.method_13290();
   }

   public void method_3060(boolean var1) {
      this.field_3716.field_36677 = var1;
      if (!this.field_3717.method_13290()) {
         this.field_3702.field_36677 = var1;
         this.field_3705.field_36677 = var1;
         this.field_3715.field_36677 = var1 && class_7149.field_36822.containsKey(this.field_3701);
         this.field_3708.field_36677 = var1;
      } else {
         this.field_3702.field_36677 = false;
         this.field_3705.field_36677 = false;
         this.field_3715.field_36677 = false;
         this.field_3708.field_36677 = false;
      }

      this.field_3704.method_8270(var1);
   }

   public class_7522 method_3062() {
      return this.field_3703;
   }

   public void method_3055(class_6298 var1) {
      class_7522 var4 = class_6322.method_28810();
      class_8876 var5 = class_8876.method_40843(JsonOps.INSTANCE, this.field_3703);
      class_888 var6 = class_888.method_3825(JsonOps.INSTANCE, var1.method_28743(), var4);
      DataResult var7 = class_2904.field_14169.encodeStart(var5, this.field_3717).flatMap(var1x -> class_2904.field_14169.parse(var6, var1x));
      var7.resultOrPartial(class_9665.method_44690("Error parsing worldgen settings after loading data packs: ", field_3706::error)).ifPresent(var2 -> {
         this.field_3717 = var2;
         this.field_3703 = var4;
      });
   }
}
