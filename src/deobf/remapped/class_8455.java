package remapped;

import java.util.Locale;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public class class_8455 {
   private final MinecraftClient field_43225;
   private boolean field_43223;
   private final class_1398 field_43226 = new class_1398();
   private long field_43229 = -1L;
   private long field_43224 = -1L;
   private long field_43230 = -1L;
   private boolean field_43227;

   public class_8455(MinecraftClient var1) {
      this.field_43225 = var1;
   }

   private void method_38881(String var1, Object... var2) {
      this.field_43225
         .field_9614
         .method_13991()
         .method_18676(
            new StringTextComponent("")
               .append(new TranslationTextComponent("debug.prefix").mergeStyle(new TextFormatting[]{TextFormatting.YELLOW, TextFormatting.BOLD}))
               .appendString(" ")
               .append(new TranslationTextComponent(var1, var2))
         );
   }

   private void method_38882(String var1, Object... var2) {
      this.field_43225
         .field_9614
         .method_13991()
         .method_18676(
            new StringTextComponent("")
               .append(new TranslationTextComponent("debug.prefix").mergeStyle(new TextFormatting[]{TextFormatting.RED, TextFormatting.BOLD}))
               .appendString(" ")
               .append(new TranslationTextComponent(var1, var2))
         );
   }

   private boolean method_38886(int var1) {
      if (this.field_43229 > 0L && this.field_43229 < Util.getMeasuringTimeMs() - 100L) {
         return true;
      } else {
         switch (var1) {
            case 65:
               this.field_43225.field_9657.method_19998();
               this.method_38881("debug.reload_chunks.message");
               return true;
            case 66:
               boolean var4 = !this.field_43225.method_8587().method_28119();
               this.field_43225.method_8587().method_28122(var4);
               this.method_38881(var4 ? "debug.show_hitboxes.on" : "debug.show_hitboxes.off");
               return true;
            case 67:
               if (this.field_43225.field_9632.method_3179()) {
                  return false;
               } else {
                  class_1092 var9 = this.field_43225.field_9632.field_30532;
                  if (var9 == null) {
                     return false;
                  }

                  this.method_38881("debug.copy_location.message");
                  this.method_38891(
                     String.format(
                        Locale.ROOT,
                        "/execute in %s run tp @s %.2f %.2f %.2f %.2f %.2f",
                        this.field_43225.field_9632.field_41768.method_29545().method_25499(),
                        this.field_43225.field_9632.method_37302(),
                        this.field_43225.field_9632.method_37309(),
                        this.field_43225.field_9632.method_37156(),
                        this.field_43225.field_9632.field_41701,
                        this.field_43225.field_9632.field_41755
                     )
                  );
                  return true;
               }
            case 68:
               if (this.field_43225.field_9614 != null) {
                  this.field_43225.field_9614.method_13991().method_18690(false);
               }

               return true;
            case 70:
               class_1013.field_5250
                  .method_38567(
                     this.field_43225.field_9577,
                     class_9299.method_42827(
                        (double)(this.field_43225.field_9577.field_45537 + (Screen.method_1190() ? -1 : 1)),
                        class_1013.field_5250.method_38569(),
                        class_1013.field_5250.method_38573()
                     )
                  );
               this.method_38881("debug.cycle_renderdistance.message", this.field_43225.field_9577.field_45537);
               return true;
            case 71:
               boolean var5 = this.field_43225.field_9612.method_15557();
               this.method_38881(var5 ? "debug.chunk_boundaries.on" : "debug.chunk_boundaries.off");
               return true;
            case 72:
               this.field_43225.field_9577.field_45482 = !this.field_43225.field_9577.field_45482;
               this.method_38881(this.field_43225.field_9577.field_45482 ? "debug.advanced_tooltips.on" : "debug.advanced_tooltips.off");
               this.field_43225.field_9577.method_40873();
               return true;
            case 73:
               if (!this.field_43225.field_9632.method_3179()) {
                  this.method_38890(this.field_43225.field_9632.method_37163(2), !Screen.method_1190());
               }

               return true;
            case 76:
               MinecraftClient var6 = class_3111.method_14327();
               var6.field_9657.field_20956 = 1;
               StringTextComponent var7 = new StringTextComponent(class_6956.method_31803("of.message.loadingVisibleChunks"));
               var6.field_9614.method_13991().method_18684(var7, 201435902);
               return true;
            case 78:
               if (!this.field_43225.field_9632.method_37163(2)) {
                  this.method_38881("debug.creative_spectator.error");
               } else if (!this.field_43225.field_9632.method_37221()) {
                  this.field_43225.field_9632.method_27307("/gamemode spectator");
               } else {
                  this.field_43225.field_9632.method_27307("/gamemode " + this.field_43225.field_9647.method_42132().method_21588());
               }

               return true;
            case 79:
               if (class_3111.method_14424()) {
                  class_708 var10 = new class_708((Screen)null, class_3111.method_14310());
                  class_3111.method_14327().method_8609(var10);
               }

               return true;
            case 80:
               this.field_43225.field_9577.field_45426 = !this.field_43225.field_9577.field_45426;
               this.field_43225.field_9577.method_40873();
               this.method_38881(this.field_43225.field_9577.field_45426 ? "debug.pause_focus.on" : "debug.pause_focus.off");
               return true;
            case 81:
               this.method_38881("debug.help.message");
               class_4049 var8 = this.field_43225.field_9614.method_13991();
               var8.method_18676(new TranslationTextComponent("debug.reload_chunks.help"));
               var8.method_18676(new TranslationTextComponent("debug.show_hitboxes.help"));
               var8.method_18676(new TranslationTextComponent("debug.copy_location.help"));
               var8.method_18676(new TranslationTextComponent("debug.clear_chat.help"));
               var8.method_18676(new TranslationTextComponent("debug.cycle_renderdistance.help"));
               var8.method_18676(new TranslationTextComponent("debug.chunk_boundaries.help"));
               var8.method_18676(new TranslationTextComponent("debug.advanced_tooltips.help"));
               var8.method_18676(new TranslationTextComponent("debug.inspect.help"));
               var8.method_18676(new TranslationTextComponent("debug.creative_spectator.help"));
               var8.method_18676(new TranslationTextComponent("debug.pause_focus.help"));
               var8.method_18676(new TranslationTextComponent("debug.help.help"));
               var8.method_18676(new TranslationTextComponent("debug.reload_resourcepacks.help"));
               var8.method_18676(new TranslationTextComponent("debug.pause.help"));
               var8.method_18676(new TranslationTextComponent("debug.gamemodes.help"));
               return true;
            case 82:
               if (class_3111.method_14424()) {
                  class_6588.method_30259();
                  class_6588.method_30295();
               }

               return true;
            case 84:
               this.method_38881("debug.reload_resourcepacks.message");
               this.field_43225.method_8524();
               return true;
            case 293:
               if (!this.field_43225.field_9632.method_37163(2)) {
                  this.method_38881("debug.gamemodes.error");
               } else {
                  this.field_43225.method_8609(new class_5603());
               }

               return true;
            default:
               return false;
         }
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void method_38890(boolean var1, boolean var2) {
      class_7474 var5 = this.field_43225.field_9587;
      if (var5 != null) {
         switch (var5.method_33990()) {
            case field_7717:
               class_1331 var6 = ((class_9529)var5).method_43955();
               class_2522 var7 = this.field_43225.field_9632.field_41768.method_28262(var6);
               if (var1) {
                  if (var2) {
                     this.field_43225.field_9632.field_30532.method_4809().method_571(var6, var3 -> {
                        this.method_38880(var7, var6, var3);
                        this.method_38881("debug.inspect.server.block");
                     });
                  } else {
                     class_3757 var11 = this.field_43225.field_9632.field_41768.method_28260(var6);
                     class_5734 var12 = var11 != null ? var11.method_17396(new class_5734()) : null;
                     this.method_38880(var7, var6, var12);
                     this.method_38881("debug.inspect.client.block");
                  }
               } else {
                  this.method_38880(var7, var6, (class_5734)null);
                  this.method_38881("debug.inspect.client.block");
               }
               break;
            case field_7718:
               class_8145 var8 = ((class_5631)var5).method_25524();
               Identifier var9 = class_8669.field_44400.method_39797(var8.method_37387());
               if (var1) {
                  if (var2) {
                     this.field_43225.field_9632.field_30532.method_4809().method_572(var8.method_37145(), var3 -> {
                        this.method_38885(var9, var8.method_37245(), var3);
                        this.method_38881("debug.inspect.server.entity");
                     });
                  } else {
                     class_5734 var10 = var8.method_37258(new class_5734());
                     this.method_38885(var9, var8.method_37245(), var10);
                     this.method_38881("debug.inspect.client.entity");
                  }
               } else {
                  this.method_38885(var9, var8.method_37245(), (class_5734)null);
                  this.method_38881("debug.inspect.client.entity");
               }
         }
      }
   }

   private void method_38880(class_2522 var1, class_1331 var2, class_5734 var3) {
      if (var3 != null) {
         var3.method_25959("x");
         var3.method_25959("y");
         var3.method_25959("z");
         var3.method_25959("id");
      }

      StringBuilder var6 = new StringBuilder(class_4104.toString(var1));
      if (var3 != null) {
         var6.append(var3);
      }

      String var7 = String.format(Locale.ROOT, "/setblock %d %d %d %s", var2.method_12173(), var2.method_12165(), var2.method_12185(), var6);
      this.method_38891(var7);
   }

   private void method_38885(Identifier var1, class_1343 var2, class_5734 var3) {
      String var6;
      if (var3 == null) {
         var6 = String.format(Locale.ROOT, "/summon %s %.2f %.2f %.2f", var1.toString(), var2.field_7336, var2.field_7333, var2.field_7334);
      } else {
         var3.method_25959("UUID");
         var3.method_25959("Pos");
         var3.method_25959("Dimension");
         String var7 = var3.method_38711().getString();
         var6 = String.format(Locale.ROOT, "/summon %s %.2f %.2f %.2f %s", var1.toString(), var2.field_7336, var2.field_7333, var2.field_7334, var7);
      }

      this.method_38891(var6);
   }

   public void method_38889(long var1, int var3, int var4, int var5, int var6) {
      if (var1 == this.field_43225.method_8552().method_43181()) {
         if (SigmaMainClass.method_3328().method_3299().method_31001() != null) {
            SigmaMainClass.method_3328().method_3299().method_30992(var3, var5);
            return;
         }

         if (this.field_43225.field_9623 != null) {
            if (this.field_43225.field_9623 instanceof class_5766 && var3 == 258) {
               class_6435 var14 = new class_6435(var3, var5 == 2, null);
               SigmaMainClass.method_3328().method_3302().method_7914(var14);
               if (var14.method_29716()) {
                  return;
               }
            }
         } else if (var5 == 1 || var5 == 2) {
            class_4233.method_19731(var3);
            class_6435 var9 = new class_6435(var3, var5 == 2, null);
            SigmaMainClass.method_3328().method_3302().method_7914(var9);
            if (var9.method_29716()) {
               return;
            }
         } else if (var5 == 0) {
            class_4233.method_19733(var3);
         }

         if (this.field_43229 <= 0L) {
            if (class_9732.method_44934(MinecraftClient.getInstance().method_8552().method_43181(), 67)
               && class_9732.method_44934(MinecraftClient.getInstance().method_8552().method_43181(), 292)) {
               this.field_43227 = true;
               this.field_43229 = Util.getMeasuringTimeMs();
               this.field_43224 = Util.getMeasuringTimeMs();
               this.field_43230 = 0L;
            }
         } else if (!class_9732.method_44934(MinecraftClient.getInstance().method_8552().method_43181(), 67)
            || !class_9732.method_44934(MinecraftClient.getInstance().method_8552().method_43181(), 292)) {
            this.field_43229 = -1L;
         }

         Screen var15 = this.field_43225.field_9623;
         if (!(this.field_43225.field_9623 instanceof class_8590) || ((class_8590)var15).field_44015 <= Util.getMeasuringTimeMs() - 20L) {
            if (var5 != 1) {
               if (var5 == 0 && this.field_43225.field_9623 instanceof class_8590) {
                  ((class_8590)this.field_43225.field_9623).field_44013 = null;
               }
            } else {
               if (this.field_43225.field_9577.field_45460.method_27062(var3, var4)) {
                  this.field_43225.method_8552().method_43156();
                  this.field_43225.field_9577.field_45453 = this.field_43225.method_8552().method_43174();
                  this.field_43225.field_9577.method_40873();
                  return;
               }

               if (this.field_43225.field_9577.field_45496.method_27062(var3, var4)) {
                  if (!Screen.method_1185()) {
                  }

                  class_5523.method_25041(
                     this.field_43225.runDirectory,
                     this.field_43225.method_8552().method_43178(),
                     this.field_43225.method_8552().method_43198(),
                     this.field_43225.method_8584(),
                     var1x -> this.field_43225.execute(() -> this.field_43225.field_9614.method_13991().method_18676(var1x))
                  );
                  return;
               }
            }
         }

         boolean var10 = var15 == null || !(var15.method_41185() instanceof class_1863) || !((class_1863)var15.method_41185()).method_8275();
         if (var5 != 0 && var3 == 66 && Screen.method_1185() && var10) {
            class_1013.field_5254.method_18455(this.field_43225.field_9577, 1);
            if (var15 instanceof class_8446) {
               ((class_8446)var15).method_38845();
            }
         }

         if (var15 != null) {
            boolean[] var11 = new boolean[]{false};
            Screen.method_1181(() -> {
               if (var5 != 1 && (var5 != 2 || !this.field_43223)) {
                  if (var5 == 0) {
                     if (class_7860.field_39946.method_3596()) {
                        var11[0] = class_7860.method_35566(class_7860.field_39946, this.field_43225.field_9623, var3, var4, var6);
                        if (var11[0]) {
                           return;
                        }
                     }

                     var11[0] = var15.method_26939(var3, var4, var6);
                     if (class_7860.field_39918.method_3596() && !var11[0]) {
                        var11[0] = class_7860.method_35566(class_7860.field_39918, this.field_43225.field_9623, var3, var4, var6);
                     }
                  }
               } else {
                  if (class_7860.field_40177.method_3596()) {
                     var11[0] = class_7860.method_35566(class_7860.field_40177, this.field_43225.field_9623, var3, var4, var6);
                     if (var11[0]) {
                        return;
                     }
                  }

                  var11[0] = var15.method_26946(var3, var4, var6);
                  if (class_7860.field_39845.method_3596() && !var11[0]) {
                     var11[0] = class_7860.method_35566(class_7860.field_39845, this.field_43225.field_9623, var3, var4, var6);
                  }
               }
            }, "keyPressed event handler", var15.getClass().getCanonicalName());
            if (var11[0]) {
               return;
            }
         }

         if (this.field_43225.field_9623 == null || this.field_43225.field_9623.field_951) {
            class_3654 var16 = class_9732.method_44940(var3, var4);
            if (var5 != 0) {
               if (var3 == 293 && this.field_43225.gameRenderer != null) {
                  this.field_43225.gameRenderer.method_35948();
               }

               boolean var12 = false;
               if (this.field_43225.field_9623 == null) {
                  if (var3 == 256) {
                     boolean var13 = class_9732.method_44934(MinecraftClient.getInstance().method_8552().method_43181(), 292);
                     this.field_43225.method_8597(var13);
                  }

                  var12 = class_9732.method_44934(MinecraftClient.getInstance().method_8552().method_43181(), 292) && this.method_38886(var3);
                  this.field_43227 |= var12;
                  if (var3 == 290) {
                     this.field_43225.field_9577.field_45567 = !this.field_43225.field_9577.field_45567;
                  }
               }

               if (!var12) {
                  class_5916.method_27072(var16, true);
                  class_5916.method_27059(var16);
               } else {
                  class_5916.method_27072(var16, false);
               }

               if (this.field_43225.field_9577.field_45471 && var3 >= 48 && var3 <= 57) {
                  this.field_43225.method_8595(var3 - 48);
               }
            } else {
               class_5916.method_27072(var16, false);
               if (var3 == 292) {
                  if (!this.field_43227) {
                     this.field_43225.field_9577.field_45470 = !this.field_43225.field_9577.field_45470;
                     this.field_43225.field_9577.field_45471 = this.field_43225.field_9577.field_45470 && Screen.method_1190();
                     this.field_43225.field_9577.field_45549 = this.field_43225.field_9577.field_45470 && Screen.method_1169();
                     if (this.field_43225.field_9577.field_45470) {
                        if (this.field_43225.field_9577.field_45509) {
                           this.field_43225.field_9577.field_45549 = true;
                        }

                        if (this.field_43225.field_9577.field_45523) {
                           this.field_43225.field_9577.field_45471 = true;
                        }
                     }
                  } else {
                     this.field_43227 = false;
                  }
               }
            }
         }

         class_7860.field_39866.method_3582(var3, var4, var5, var6);
      }
   }

   private void method_38884(long var1, int var3, int var4) {
      if (var1 == this.field_43225.method_8552().method_43181()) {
         if (SigmaMainClass.method_3328().method_3299().method_31001() != null) {
            SigmaMainClass.method_3328().method_3299().method_30986(var3, var4);
            return;
         }

         Screen var7 = this.field_43225.field_9623;
         if (var7 != null && this.field_43225.method_8529() == null) {
            if (Character.charCount(var3) != 1) {
               for (char var11 : Character.toChars(var3)) {
                  Screen.method_1181(() -> {
                     if (!class_7860.field_40145.method_3596() || !class_7860.method_35566(class_7860.field_40145, this.field_43225.field_9623, var11, var4)) {
                        boolean var6 = var7.method_26938(var11, var4);
                        if (class_7860.field_39923.method_3596() && !var6) {
                           class_7860.method_35566(class_7860.field_39923, this.field_43225.field_9623, var11, var4);
                        }
                     }
                  }, "charTyped event handler", var7.getClass().getCanonicalName());
               }
            } else {
               Screen.method_1181(
                  () -> {
                     if (!class_7860.field_40145.method_3596()
                        || !class_7860.method_35566(class_7860.field_40145, this.field_43225.field_9623, (char)var3, var4)) {
                        boolean var6 = var7.method_26938((char)var3, var4);
                        if (class_7860.field_39923.method_3596() && !var6) {
                           class_7860.method_35566(class_7860.field_39923, this.field_43225.field_9623, (char)var3, var4);
                        }
                     }
                  },
                  "charTyped event handler",
                  var7.getClass().getCanonicalName()
               );
            }
         }
      }
   }

   public void method_38887(boolean var1) {
      this.field_43223 = var1;
   }

   public void method_38893(long var1) {
      class_9732.method_44942(
         var1,
         (var1x, var3, var4, var5, var6) -> this.field_43225.execute(() -> this.method_38889(var1x, var3, var4, var5, var6)),
         (var1x, var3, var4) -> this.field_43225.execute(() -> this.method_38884(var1x, var3, var4))
      );
   }

   public String method_38883() {
      return this.field_43226.method_6468(this.field_43225.method_8552().method_43181(), (var1, var2) -> {
         if (var1 != 65545) {
            this.field_43225.method_8552().method_43190(var1, var2);
         }
      });
   }

   public void method_38891(String var1) {
      this.field_43226.method_6470(this.field_43225.method_8552().method_43181(), var1);
   }

   public void method_38892() {
      if (this.field_43229 > 0L) {
         long var3 = Util.getMeasuringTimeMs();
         long var5 = 10000L - (var3 - this.field_43229);
         long var7 = var3 - this.field_43224;
         if (var5 < 0L) {
            if (Screen.method_1185()) {
               class_2075.method_9686();
            }

            throw new class_3297(new class_159("Manually triggered debug crash", new Throwable()));
         }

         if (var7 >= 1000L) {
            if (this.field_43230 != 0L) {
               this.method_38882("debug.crash.warning", class_9299.method_42816((float)var5 / 1000.0F));
            } else {
               this.method_38881("debug.crash.message");
            }

            this.field_43224 = var3;
            this.field_43230++;
         }
      }
   }
}
