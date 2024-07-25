package remapped;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.commons.lang3.mutable.MutableObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_6577 extends Screen {
   private static final Logger field_33549 = LogManager.getLogger();
   private static final ITextComponent field_33536 = new TranslationTextComponent("selectWorld.gameMode");
   private static final ITextComponent field_33534 = new TranslationTextComponent("selectWorld.enterSeed");
   private static final ITextComponent field_33528 = new TranslationTextComponent("selectWorld.seedInfo");
   private static final ITextComponent field_33519 = new TranslationTextComponent(field_33537[2]);
   private static final ITextComponent field_33541 = new TranslationTextComponent("selectWorld.resultFolder");
   private static final ITextComponent field_33546 = new TranslationTextComponent("selectWorld.allowCommands.info");
   private final Screen field_33525;
   private class_1863 field_33552;
   private String field_33529;
   private class_8026 field_33526 = class_8026.field_41090;
   private class_8026 field_33521;
   private class_423 field_33548 = class_423.field_1789;
   private class_423 field_33543 = class_423.field_1789;
   private boolean field_33540;
   private boolean field_33533;
   public boolean field_33539;
   public class_2805 field_33532;
   private Path field_33544;
   private class_6354 field_33524;
   private boolean field_33551;
   private class_9521 field_33527;
   private class_9521 field_33547;
   private class_9521 field_33520;
   private class_9521 field_33538;
   private class_9521 field_33542;
   private class_9521 field_33530;
   private class_9521 field_33535;
   private ITextComponent field_33531;
   private ITextComponent field_33545;
   private String field_33522;
   private class_291 field_33550 = new class_291();
   public final class_668 field_33523;

   public class_6577(Screen var1, class_6292 var2, class_2904 var3, Path var4, class_2805 var5, class_7522 var6) {
      this(var1, var5, new class_668(var6, var3, class_7149.method_32812(var3), OptionalLong.of(var3.method_13295())));
      this.field_33522 = var2.method_28716();
      this.field_33540 = var2.method_28719();
      this.field_33533 = true;
      this.field_33548 = var2.method_28710();
      this.field_33543 = this.field_33548;
      this.field_33550.method_1292(var2.method_28709(), (class_341)null);
      if (!var2.method_28712()) {
         if (!var2.method_28720().method_21593()) {
            if (var2.method_28720().method_21587()) {
               this.field_33526 = class_8026.field_41085;
            }
         } else {
            this.field_33526 = class_8026.field_41090;
         }
      } else {
         this.field_33526 = class_8026.field_41088;
      }

      this.field_33544 = var4;
   }

   public static class_6577 method_30058(Screen var0) {
      class_7522 var3 = class_6322.method_28810();
      return new class_6577(
         var0,
         class_2805.field_13766,
         new class_668(
            var3,
            class_2904.method_13291(
               var3.<class_8760>method_28813(class_8669.field_44415),
               var3.<class_6325>method_28813(class_8669.field_44359),
               var3.<class_7902>method_28813(class_8669.field_44360)
            ),
            Optional.<class_7149>of(class_7149.field_36826),
            OptionalLong.empty()
         )
      );
   }

   private class_6577(Screen var1, class_2805 var2, class_668 var3) {
      super(new TranslationTextComponent("selectWorld.create"));
      this.field_33525 = var1;
      this.field_33522 = class_6956.method_31803("selectWorld.newWorld");
      this.field_33532 = var2;
      this.field_33523 = var3;
   }

   @Override
   public void method_5312() {
      this.field_33552.method_8279();
      this.field_33523.method_5312();
   }

   @Override
   public void method_1163() {
      this.field_943.field_9600.method_38887(true);
      this.field_33552 = new class_1778(this, this.field_948, this.field_941 / 2 - 100, 60, 200, 20, new TranslationTextComponent("selectWorld.enterName"));
      this.field_33552.method_8281(this.field_33522);
      this.field_33552.method_8277(var1 -> {
         this.field_33522 = var1;
         this.field_33527.field_36675 = !this.field_33552.method_8246().isEmpty();
         this.method_30071();
      });
      this.field_942.add(this.field_33552);
      int var3 = this.field_941 / 2 - 155;
      int var4 = this.field_941 / 2 + 5;
      this.field_33547 = this.<class_9521>method_1186(new class_3770(this, var3, 100, 150, 20, StringTextComponent.EMPTY, var1 -> {
         switch (this.field_33526) {
            case field_41090:
               this.method_30061(class_8026.field_41088);
               break;
            case field_41088:
               this.method_30061(class_8026.field_41085);
               break;
            case field_41085:
               this.method_30061(class_8026.field_41090);
         }

         var1.method_32693(250);
      }));
      this.field_33520 = this.<class_9521>method_1186(new class_2971(this, var4, 100, 150, 20, new TranslationTextComponent("options.difficulty"), var1 -> {
         this.field_33548 = this.field_33548.method_2096();
         this.field_33543 = this.field_33548;
         var1.method_32693(250);
      }));
      this.field_33535 = this.<class_9521>method_1186(
         new class_6359(this, var3, 151, 150, 20, new TranslationTextComponent("selectWorld.allowCommands"), var1 -> {
            this.field_33533 = true;
            this.field_33540 = !this.field_33540;
            var1.method_32693(250);
         })
      );
      this.field_33530 = this.<class_9521>method_1186(
         new class_9521(var4, 151, 150, 20, new TranslationTextComponent("selectWorld.dataPacks"), var1 -> this.method_30050())
      );
      this.field_33542 = this.<class_9521>method_1186(
         new class_9521(
            var3,
            185,
            150,
            20,
            new TranslationTextComponent("selectWorld.gameRules"),
            var1 -> this.field_943.method_8609(new class_3547(this.field_33550.clone(), var1x -> {
                  this.field_943.method_8609(this);
                  var1x.ifPresent(var1xx -> this.field_33550 = var1xx);
               }))
         )
      );
      this.field_33523.method_3068(this, this.field_943, this.field_948);
      this.field_33538 = this.<class_9521>method_1186(
         new class_9521(var4, 185, 150, 20, new TranslationTextComponent("selectWorld.moreWorldOptions"), var1 -> this.method_30057())
      );
      this.field_33527 = this.<class_9521>method_1186(
         new class_9521(var3, this.field_940 - 28, 150, 20, new TranslationTextComponent("selectWorld.create"), var1 -> this.method_30065())
      );
      this.field_33527.field_36675 = !this.field_33522.isEmpty();
      this.<class_9521>method_1186(new class_9521(var4, this.field_940 - 28, 150, 20, class_1402.field_7633, var1 -> this.method_30049()));
      this.method_30066();
      this.method_41178(this.field_33552);
      this.method_30061(this.field_33526);
      this.method_30071();
   }

   private void method_30054() {
      this.field_33531 = new TranslationTextComponent("selectWorld.gameMode." + class_8026.method_36459(this.field_33526) + ".line1");
      this.field_33545 = new TranslationTextComponent("selectWorld.gameMode." + class_8026.method_36459(this.field_33526) + ".line2");
   }

   private void method_30071() {
      this.field_33529 = this.field_33552.method_8246().trim();
      if (this.field_33529.isEmpty()) {
         this.field_33529 = "World";
      }

      try {
         this.field_33529 = class_6494.method_29612(this.field_943.method_8591().method_44618(), this.field_33529, "");
      } catch (Exception var6) {
         this.field_33529 = "World";

         try {
            this.field_33529 = class_6494.method_29612(this.field_943.method_8591().method_44618(), this.field_33529, "");
         } catch (Exception var5) {
            throw new RuntimeException("Could not create save folder", var5);
         }
      }
   }

   @Override
   public void method_1162() {
      this.field_943.field_9600.method_38887(false);
   }

   private void method_30065() {
      this.field_943.method_8580(new class_6476(new TranslationTextComponent("createWorld.preparing")));
      if (this.method_30072()) {
         this.method_30051();
         class_2904 var3 = this.field_33523.method_3070(this.field_33539);
         class_6292 var5;
         if (var3.method_13290()) {
            class_291 var4 = new class_291();
            var4.<class_5850>method_1287(class_291.field_1037).method_26684(false, (class_341)null);
            var5 = new class_6292(
               this.field_33552.method_8246().trim(), GameType.SPECTATOR, false, class_423.field_1790, true, var4, class_2805.field_13766
            );
         } else {
            var5 = new class_6292(
               this.field_33552.method_8246().trim(),
               class_8026.method_36458(this.field_33526),
               this.field_33539,
               this.field_33543,
               this.field_33540 && !this.field_33539,
               this.field_33550,
               this.field_33532
            );
         }

         this.field_943.method_8518(this.field_33529, var5, this.field_33523.method_3062(), var3);
      }
   }

   private void method_30057() {
      this.method_30053(!this.field_33551);
   }

   private void method_30061(class_8026 var1) {
      if (!this.field_33533) {
         this.field_33540 = var1 == class_8026.field_41085;
      }

      if (var1 != class_8026.field_41088) {
         this.field_33539 = false;
         this.field_33535.field_36675 = true;
         this.field_33523.field_3705.field_36675 = true;
         this.field_33543 = this.field_33548;
         this.field_33520.field_36675 = true;
      } else {
         this.field_33539 = true;
         this.field_33535.field_36675 = false;
         this.field_33523.field_3705.field_36675 = false;
         this.field_33543 = class_423.field_1782;
         this.field_33520.field_36675 = false;
      }

      this.field_33526 = var1;
      this.method_30054();
   }

   public void method_30066() {
      this.method_30053(this.field_33551);
   }

   private void method_30053(boolean var1) {
      this.field_33551 = var1;
      this.field_33547.field_36677 = !this.field_33551;
      this.field_33520.field_36677 = !this.field_33551;
      if (!this.field_33523.method_3056()) {
         this.field_33547.field_36675 = true;
         if (this.field_33521 != null) {
            this.method_30061(this.field_33521);
         }

         this.field_33535.field_36677 = !this.field_33551;
         this.field_33530.field_36677 = !this.field_33551;
      } else {
         this.field_33530.field_36677 = false;
         this.field_33547.field_36675 = false;
         if (this.field_33521 == null) {
            this.field_33521 = this.field_33526;
         }

         this.method_30061(class_8026.field_41087);
         this.field_33535.field_36677 = false;
      }

      this.field_33523.method_3060(this.field_33551);
      this.field_33552.method_8270(!this.field_33551);
      if (!this.field_33551) {
         this.field_33538.method_32687(new TranslationTextComponent("selectWorld.moreWorldOptions"));
      } else {
         this.field_33538.method_32687(class_1402.field_7625);
      }

      this.field_33542.field_36677 = !this.field_33551;
   }

   @Override
   public boolean method_26946(int var1, int var2, int var3) {
      if (!super.method_26946(var1, var2, var3)) {
         if (var1 != 257 && var1 != 335) {
            return false;
         } else {
            this.method_30065();
            return true;
         }
      } else {
         return true;
      }
   }

   @Override
   public void method_1156() {
      if (!this.field_33551) {
         this.method_30049();
      } else {
         this.method_30053(false);
      }
   }

   public void method_30049() {
      this.field_943.method_8609(this.field_33525);
      this.method_30051();
   }

   private void method_30051() {
      if (this.field_33524 != null) {
         this.field_33524.close();
      }

      this.method_30052();
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      method_9788(var1, this.field_948, this.field_947, this.field_941 / 2, 20, -1);
      if (!this.field_33551) {
         method_9771(var1, this.field_948, field_33519, this.field_941 / 2 - 100, 47, -6250336);
         method_9771(
            var1,
            this.field_948,
            new StringTextComponent("").append(field_33541).appendString(" ").appendString(this.field_33529),
            this.field_941 / 2 - 100,
            85,
            -6250336
         );
         this.field_33552.method_6767(var1, var2, var3, var4);
         method_9771(var1, this.field_948, this.field_33531, this.field_941 / 2 - 150, 122, -6250336);
         method_9771(var1, this.field_948, this.field_33545, this.field_941 / 2 - 150, 134, -6250336);
         if (this.field_33535.field_36677) {
            method_9771(var1, this.field_948, field_33546, this.field_941 / 2 - 150, 172, -6250336);
         }
      } else {
         method_9771(var1, this.field_948, field_33534, this.field_941 / 2 - 100, 47, -6250336);
         method_9771(var1, this.field_948, field_33528, this.field_941 / 2 - 100, 85, -6250336);
         this.field_33523.method_6767(var1, var2, var3, var4);
      }

      super.method_6767(var1, var2, var3, var4);
   }

   @Override
   public <T extends class_5888> T method_1159(T var1) {
      return super.<T>method_1159((T)var1);
   }

   @Override
   public <T extends class_7114> T method_1186(T var1) {
      return super.<T>method_1186((T)var1);
   }

   @Nullable
   public Path method_30062() {
      if (this.field_33544 == null) {
         try {
            this.field_33544 = Files.createTempDirectory("mcworld-");
         } catch (IOException var4) {
            field_33549.warn("Failed to create temporary dir", var4);
            class_4201.method_19555(this.field_943, this.field_33529);
            this.method_30049();
         }
      }

      return this.field_33544;
   }

   private void method_30050() {
      Pair var3 = this.method_30068();
      if (var3 != null) {
         this.field_943
            .method_8609(
               new class_6707(this, (class_6354)var3.getSecond(), this::method_30064, (File)var3.getFirst(), new TranslationTextComponent("dataPack.title"))
            );
      }
   }

   private void method_30064(class_6354 var1) {
      ImmutableList var4 = ImmutableList.copyOf(var1.method_29123());
      List var5 = var1.method_29118().stream().filter(var1x -> !var4.contains(var1x)).collect(ImmutableList.toImmutableList());
      class_2805 var6 = new class_2805(var4, var5);
      if (!var4.equals(this.field_33532.method_12755())) {
         this.field_943.method_34457(() -> this.field_943.method_8609(new class_6476(new TranslationTextComponent("dataPack.validation.working"))));
         class_6298.method_28747(var1.method_29115(), class_9019.field_46137, 2, Util.getMainWorkerExecutor(), this.field_943)
            .handle(
               (var2, var3) -> {
                  if (var3 == null) {
                     this.field_943.method_34457(() -> {
                        this.field_33532 = var6;
                        this.field_33523.method_3055(var2);
                        var2.close();
                        this.field_943.method_8609(this);
                     });
                  } else {
                     field_33549.warn("Failed to validate datapack", var3);
                     this.field_943
                        .method_34457(
                           () -> this.field_943
                                 .method_8609(
                                    new class_9640(
                                       var1xx -> {
                                          if (!var1xx) {
                                             this.field_33532 = class_2805.field_13766;
                                             this.field_943.method_8609(this);
                                          } else {
                                             this.method_30050();
                                          }
                                       },
                                       new TranslationTextComponent("dataPack.validation.failed"),
                                       StringTextComponent.EMPTY,
                                       new TranslationTextComponent("dataPack.validation.back"),
                                       new TranslationTextComponent("dataPack.validation.reset")
                                    )
                                 )
                        );
                  }

                  return null;
               }
            );
      } else {
         this.field_33532 = var6;
      }
   }

   private void method_30052() {
      if (this.field_33544 != null) {
         try (Stream var3 = Files.walk(this.field_33544)) {
            var3.sorted(Comparator.reverseOrder()).forEach(var0 -> {
               try {
                  Files.delete(var0);
               } catch (IOException var4) {
                  field_33549.warn("Failed to remove temporary file {}", var0, var4);
               }
            });
         } catch (IOException var16) {
            field_33549.warn("Failed to list temporary dir {}", this.field_33544);
         }

         this.field_33544 = null;
      }
   }

   private static void method_30069(Path var0, Path var1, Path var2) {
      try {
         Util.method_44696(var0, var1, var2);
      } catch (IOException var6) {
         field_33549.warn("Failed to copy datapack file from {} to {}", var2, var1);
         throw new class_6759(var6);
      }
   }

   private boolean method_30072() {
      if (this.field_33544 != null) {
         try (
            class_3676 var3 = this.field_943.method_8591().method_44633(this.field_33529);
            Stream var5 = Files.walk(this.field_33544);
         ) {
            Path var7 = var3.method_17064(class_263.field_924);
            Files.createDirectories(var7);
            var5.filter(var1 -> !var1.equals(this.field_33544)).forEach(var2 -> method_30069(this.field_33544, var7, var2));
         } catch (IOException | class_6759 var35) {
            field_33549.warn("Failed to copy datapacks to world {}", this.field_33529, var35);
            class_4201.method_19555(this.field_943, this.field_33529);
            this.method_30049();
            return false;
         }
      }

      return true;
   }

   @Nullable
   public static Path method_30063(Path var0, MinecraftClient var1) {
      MutableObject var4 = new MutableObject();

      try (Stream var5 = Files.walk(var0)) {
         var5.filter(var1x -> !var1x.equals(var0)).forEach(var2 -> {
            Path var5x = (Path)var4.getValue();
            if (var5x == null) {
               try {
                  var5x = Files.createTempDirectory("mcworld-");
               } catch (IOException var7) {
                  field_33549.warn("Failed to create temporary dir");
                  throw new class_6759(var7);
               }

               var4.setValue(var5x);
            }

            method_30069(var0, var5x, var2);
         });
      } catch (IOException | class_6759 var18) {
         field_33549.warn("Failed to copy datapacks from world {}", var0, var18);
         class_4201.method_19555(var1, var0.toString());
         return null;
      }

      return (Path)var4.getValue();
   }

   @Nullable
   private Pair<File, class_6354> method_30068() {
      Path var3 = this.method_30062();
      if (var3 == null) {
         return null;
      } else {
         File var4 = var3.toFile();
         if (this.field_33524 == null) {
            this.field_33524 = new class_6354(new class_2362(), new class_8936(var4, class_2541.field_12597));
            this.field_33524.method_29122();
         }

         this.field_33524.method_29121(this.field_33532.method_12755());
         return Pair.of(var4, this.field_33524);
      }
   }
}
