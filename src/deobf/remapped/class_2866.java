package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_2866 extends class_7875 {
   private static final Logger field_14039 = LogManager.getLogger();
   private static final Identifier field_14027 = new Identifier("realms", "textures/gui/realms/on_icon.png");
   private static final Identifier field_14028 = new Identifier("realms", "textures/gui/realms/off_icon.png");
   private static final Identifier field_14040 = new Identifier("realms", "textures/gui/realms/expired_icon.png");
   private static final Identifier field_14047 = new Identifier("realms", "textures/gui/realms/expires_soon_icon.png");
   private static final ITextComponent field_14032 = new TranslationTextComponent("mco.configure.worlds.title");
   private static final ITextComponent field_14041 = new TranslationTextComponent("mco.configure.world.title");
   private static final ITextComponent field_14029 = new TranslationTextComponent("mco.configure.current.minigame").appendString(": ");
   private static final ITextComponent field_14033 = new TranslationTextComponent("mco.selectServer.expired");
   private static final ITextComponent field_14046 = new TranslationTextComponent("mco.selectServer.expires.soon");
   private static final ITextComponent field_14021 = new TranslationTextComponent("mco.selectServer.expires.day");
   private static final ITextComponent field_14038 = new TranslationTextComponent("mco.selectServer.open");
   private static final ITextComponent field_14025 = new TranslationTextComponent("mco.selectServer.closed");
   private ITextComponent field_14018;
   private final class_7039 field_14042;
   private class_7675 field_14024;
   private final long field_14022;
   private int field_14031;
   private int field_14037;
   private class_9521 field_14026;
   private class_9521 field_14023;
   private class_9521 field_14043;
   private class_9521 field_14035;
   private class_9521 field_14036;
   private class_9521 field_14019;
   private class_9521 field_14030;
   private boolean field_14045;
   private int field_14020;
   private int field_14034;

   public class_2866(class_7039 var1, long var2) {
      this.field_14042 = var1;
      this.field_14022 = var2;
   }

   @Override
   public void method_1163() {
      if (this.field_14024 == null) {
         this.method_13159(this.field_14022);
      }

      this.field_14031 = this.field_941 / 2 - 187;
      this.field_14037 = this.field_941 / 2 + 190;
      this.field_943.field_9600.method_38887(true);
      this.field_14026 = this.<class_9521>method_1186(
         new class_9521(
            this.method_13144(0, 3),
            method_4819(0),
            100,
            20,
            new TranslationTextComponent("mco.configure.world.buttons.players"),
            var1 -> this.field_943.method_8609(new class_1980(this, this.field_14024))
         )
      );
      this.field_14023 = this.<class_9521>method_1186(
         new class_9521(
            this.method_13144(1, 3),
            method_4819(0),
            100,
            20,
            new TranslationTextComponent("mco.configure.world.buttons.settings"),
            var1 -> this.field_943.method_8609(new class_5292(this, this.field_14024.clone()))
         )
      );
      this.field_14043 = this.<class_9521>method_1186(
         new class_9521(
            this.method_13144(2, 3),
            method_4819(0),
            100,
            20,
            new TranslationTextComponent("mco.configure.world.buttons.subscription"),
            var1 -> this.field_943.method_8609(new class_7409(this, this.field_14024.clone(), this.field_14042))
         )
      );

      for (int var3 = 1; var3 < 5; var3++) {
         this.method_13147(var3);
      }

      this.field_14030 = this.<class_9521>method_1186(
         new class_9521(
            this.method_13152(0), method_4819(13) - 5, 100, 20, new TranslationTextComponent("mco.configure.world.buttons.switchminigame"), var1 -> {
               class_1991 var4 = new class_1991(this, class_8840.field_45209);
               var4.method_9187(new TranslationTextComponent("mco.template.title.minigame"));
               this.field_943.method_8609(var4);
            }
         )
      );
      this.field_14035 = this.<class_9521>method_1186(
         new class_9521(
            this.method_13152(0),
            method_4819(13) - 5,
            90,
            20,
            new TranslationTextComponent("mco.configure.world.buttons.options"),
            var1 -> this.field_943
                  .method_8609(
                     new class_2977(
                        this,
                        this.field_14024.field_39013.get(this.field_14024.field_39007).clone(),
                        this.field_14024.field_39015,
                        this.field_14024.field_39007
                     )
                  )
         )
      );
      this.field_14036 = this.<class_9521>method_1186(
         new class_9521(
            this.method_13152(1),
            method_4819(13) - 5,
            90,
            20,
            new TranslationTextComponent("mco.configure.world.backup"),
            var1 -> this.field_943.method_8609(new class_4908(this, this.field_14024.clone(), this.field_14024.field_39007))
         )
      );
      this.field_14019 = this.<class_9521>method_1186(
         new class_9521(
            this.method_13152(2),
            method_4819(13) - 5,
            90,
            20,
            new TranslationTextComponent("mco.configure.world.buttons.resetworld"),
            var1 -> this.field_943
                  .method_8609(
                     new class_5824(
                        this,
                        this.field_14024.clone(),
                        () -> this.field_943.method_8609(this.method_13136()),
                        () -> this.field_943.method_8609(this.method_13136())
                     )
                  )
         )
      );
      this.<class_9521>method_1186(new class_9521(this.field_14037 - 80 + 8, method_4819(13) - 5, 70, 20, class_1402.field_7632, var1 -> this.method_13160()));
      this.field_14036.field_36675 = true;
      if (this.field_14024 != null) {
         this.method_13162();
         if (!this.method_13154()) {
            this.method_13141();
         } else {
            this.method_13149();
         }
      } else {
         this.method_13141();
         this.method_13149();
         this.field_14026.field_36675 = false;
         this.field_14023.field_36675 = false;
         this.field_14043.field_36675 = false;
      }
   }

   private void method_13147(int var1) {
      int var4 = this.method_13138(var1);
      int var5 = method_4819(5) + 5;
      class_7319 var6 = new class_7319(var4, var5, 80, 80, () -> this.field_14024, var1x -> this.field_14018 = var1x, var1, var2 -> {
         class_5333 var5x = ((class_7319)var2).method_33370();
         if (var5x != null) {
            switch (var5x.field_27208) {
               case field_37891:
                  break;
               case field_37893:
                  this.method_13156(this.field_14024);
                  break;
               case field_37895:
                  if (var5x.field_27213) {
                     this.method_13155();
                  } else if (var5x.field_27209) {
                     this.method_13153(var1, this.field_14024);
                  } else {
                     this.method_13137(var1, this.field_14024);
                  }
                  break;
               default:
                  throw new IllegalStateException("Unknown action " + var5x.field_27208);
            }
         }
      });
      this.<class_7319>method_1186(var6);
   }

   private int method_13152(int var1) {
      return this.field_14031 + var1 * 95;
   }

   private int method_13144(int var1, int var2) {
      return this.field_941 / 2 - (var2 * 105 - 5) / 2 + var1 * 105;
   }

   @Override
   public void method_5312() {
      super.method_5312();
      this.field_14020++;
      this.field_14034--;
      if (this.field_14034 < 0) {
         this.field_14034 = 0;
      }
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.field_14018 = null;
      this.method_1183(var1);
      method_9788(var1, this.field_948, field_14032, this.field_941 / 2, method_4819(4), 16777215);
      super.method_6767(var1, var2, var3, var4);
      if (this.field_14024 != null) {
         String var7 = this.field_14024.method_34772();
         int var8 = this.field_948.method_45395(var7);
         int var9 = this.field_14024.field_39004 != class_6804.field_35064 ? 8388479 : 10526880;
         int var10 = this.field_948.method_45379(field_14041);
         method_9788(var1, this.field_948, field_14041, this.field_941 / 2, 12, 16777215);
         method_9787(var1, this.field_948, var7, this.field_941 / 2, 24, var9);
         int var11 = Math.min(this.method_13144(2, 3) + 80 - 11, this.field_941 / 2 + var8 / 2 + var10 / 2 + 10);
         this.method_13139(var1, var11, 7, var2, var3);
         if (this.method_13154()) {
            this.field_948
               .method_45378(
                  var1,
                  field_14029.deepCopy().appendString(this.field_14024.method_34783()),
                  (float)(this.field_14031 + 80 + 20 + 10),
                  (float)method_4819(13),
                  16777215
               );
         }

         if (this.field_14018 != null) {
            this.method_13161(var1, this.field_14018, var2, var3);
         }
      } else {
         method_9788(var1, this.field_948, field_14041, this.field_941 / 2, 17, 16777215);
      }
   }

   private int method_13138(int var1) {
      return this.field_14031 + (var1 - 1) * 98;
   }

   @Override
   public void method_1162() {
      this.field_943.field_9600.method_38887(false);
   }

   @Override
   public boolean method_26946(int var1, int var2, int var3) {
      if (var1 != 256) {
         return super.method_26946(var1, var2, var3);
      } else {
         this.method_13160();
         return true;
      }
   }

   private void method_13160() {
      if (this.field_14045) {
         this.field_14042.method_32314();
      }

      this.field_943.method_8609(this.field_14042);
   }

   private void method_13159(long var1) {
      new Thread(() -> {
         class_176 var5 = class_176.method_777();

         try {
            this.field_14024 = var5.method_770(var1);
            this.method_13162();
            if (this.method_13154()) {
               this.method_13143(this.field_14030);
            } else {
               this.method_13143(this.field_14035);
               this.method_13143(this.field_14036);
               this.method_13143(this.field_14019);
            }
         } catch (class_3900 var7) {
            field_14039.error("Couldn't get own world");
            this.field_943.execute(() -> this.field_943.method_8609(new class_9306(ITextComponent.func_244388_a(var7.getMessage()), this.field_14042)));
         }
      }).start();
   }

   private void method_13162() {
      this.field_14026.field_36675 = !this.field_14024.field_39020;
      this.field_14023.field_36675 = !this.field_14024.field_39020;
      this.field_14043.field_36675 = true;
      this.field_14030.field_36675 = !this.field_14024.field_39020;
      this.field_14035.field_36675 = !this.field_14024.field_39020;
      this.field_14019.field_36675 = !this.field_14024.field_39020;
   }

   private void method_13156(class_7675 var1) {
      if (this.field_14024.field_39004 != class_6804.field_35061) {
         this.method_13142(true, new class_2866(this.field_14042.method_32264(), this.field_14022));
      } else {
         this.field_14042.method_32260(var1, new class_2866(this.field_14042.method_32264(), this.field_14022));
      }
   }

   private void method_13155() {
      class_1991 var3 = new class_1991(this, class_8840.field_45209);
      var3.method_9187(new TranslationTextComponent("mco.template.title.minigame"));
      var3.method_9190(new TranslationTextComponent("mco.minigame.world.info.line1"), new TranslationTextComponent("mco.minigame.world.info.line2"));
      this.field_943.method_8609(var3);
   }

   private void method_13137(int var1, class_7675 var2) {
      TranslationTextComponent var5 = new TranslationTextComponent("mco.configure.world.slot.switch.question.line1");
      TranslationTextComponent var6 = new TranslationTextComponent("mco.configure.world.slot.switch.question.line2");
      this.field_943
         .method_8609(
            new class_2238(
               var3 -> {
                  if (!var3) {
                     this.field_943.method_8609(this);
                  } else {
                     this.field_943
                        .method_8609(
                           new class_1065(this.field_14042, new class_9007(var2.field_39016, var1, () -> this.field_943.method_8609(this.method_13136())))
                        );
                  }
               },
               class_1542.field_8150,
               var5,
               var6,
               true
            )
         );
   }

   private void method_13153(int var1, class_7675 var2) {
      TranslationTextComponent var5 = new TranslationTextComponent("mco.configure.world.slot.switch.question.line1");
      TranslationTextComponent var6 = new TranslationTextComponent("mco.configure.world.slot.switch.question.line2");
      this.field_943
         .method_8609(
            new class_2238(
               var3 -> {
                  if (!var3) {
                     this.field_943.method_8609(this);
                  } else {
                     class_5824 var6x = new class_5824(
                        this,
                        var2,
                        new TranslationTextComponent("mco.configure.world.switch.slot"),
                        new TranslationTextComponent("mco.configure.world.switch.slot.subtitle"),
                        10526880,
                        class_1402.field_7633,
                        () -> this.field_943.method_8609(this.method_13136()),
                        () -> this.field_943.method_8609(this.method_13136())
                     );
                     var6x.method_26369(var1);
                     var6x.method_26362(new TranslationTextComponent("mco.create.world.reset.title"));
                     this.field_943.method_8609(var6x);
                  }
               },
               class_1542.field_8150,
               var5,
               var6,
               true
            )
         );
   }

   public void method_13161(class_7966 var1, ITextComponent var2, int var3, int var4) {
      int var7 = var3 + 12;
      int var8 = var4 - 12;
      int var9 = this.field_948.method_45379(var2);
      if (var7 + var9 + 3 > this.field_14037) {
         var7 = var7 - var9 - 20;
      }

      this.method_9772(var1, var7 - 3, var8 - 3, var7 + var9 + 3, var8 + 8 + 3, -1073741824, -1073741824);
      this.field_948.method_45392(var1, var2, (float)var7, (float)var8, 16777215);
   }

   private void method_13139(class_7966 var1, int var2, int var3, int var4, int var5) {
      if (!this.field_14024.field_39020) {
         if (this.field_14024.field_39004 != class_6804.field_35064) {
            if (this.field_14024.field_39004 == class_6804.field_35061) {
               if (this.field_14024.field_39008 >= 7) {
                  this.method_13146(var1, var2, var3, var4, var5);
               } else {
                  this.method_13158(var1, var2, var3, var4, var5, this.field_14024.field_39008);
               }
            }
         } else {
            this.method_13140(var1, var2, var3, var4, var5);
         }
      } else {
         this.method_13148(var1, var2, var3, var4, var5);
      }
   }

   private void method_13148(class_7966 var1, int var2, int var3, int var4, int var5) {
      this.field_943.getTextureManager().bindTexture(field_14040);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      AbstractGui.method_9778(var1, var2, var3, 0.0F, 0.0F, 10, 28, 10, 28);
      if (var4 >= var2 && var4 <= var2 + 9 && var5 >= var3 && var5 <= var3 + 27) {
         this.field_14018 = field_14033;
      }
   }

   private void method_13158(class_7966 var1, int var2, int var3, int var4, int var5, int var6) {
      this.field_943.getTextureManager().bindTexture(field_14047);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      if (this.field_14020 % 20 >= 10) {
         AbstractGui.method_9778(var1, var2, var3, 10.0F, 0.0F, 10, 28, 20, 28);
      } else {
         AbstractGui.method_9778(var1, var2, var3, 0.0F, 0.0F, 10, 28, 20, 28);
      }

      if (var4 >= var2 && var4 <= var2 + 9 && var5 >= var3 && var5 <= var3 + 27) {
         if (var6 > 0) {
            if (var6 != 1) {
               this.field_14018 = new TranslationTextComponent("mco.selectServer.expires.days", var6);
            } else {
               this.field_14018 = field_14021;
            }
         } else {
            this.field_14018 = field_14046;
         }
      }
   }

   private void method_13146(class_7966 var1, int var2, int var3, int var4, int var5) {
      this.field_943.getTextureManager().bindTexture(field_14027);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      AbstractGui.method_9778(var1, var2, var3, 0.0F, 0.0F, 10, 28, 10, 28);
      if (var4 >= var2 && var4 <= var2 + 9 && var5 >= var3 && var5 <= var3 + 27) {
         this.field_14018 = field_14038;
      }
   }

   private void method_13140(class_7966 var1, int var2, int var3, int var4, int var5) {
      this.field_943.getTextureManager().bindTexture(field_14028);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      AbstractGui.method_9778(var1, var2, var3, 0.0F, 0.0F, 10, 28, 10, 28);
      if (var4 >= var2 && var4 <= var2 + 9 && var5 >= var3 && var5 <= var3 + 27) {
         this.field_14018 = field_14025;
      }
   }

   private boolean method_13154() {
      return this.field_14024 != null && this.field_14024.field_39015 == class_8840.field_45209;
   }

   private void method_13149() {
      this.method_13150(this.field_14035);
      this.method_13150(this.field_14036);
      this.method_13150(this.field_14019);
   }

   private void method_13150(class_9521 var1) {
      var1.field_36677 = false;
      this.field_942.remove(var1);
      this.field_950.remove(var1);
   }

   private void method_13143(class_9521 var1) {
      var1.field_36677 = true;
      this.<class_9521>method_1186(var1);
   }

   private void method_13141() {
      this.method_13150(this.field_14030);
   }

   public void method_13157(class_6768 var1) {
      class_6768 var4 = this.field_14024.field_39013.get(this.field_14024.field_39007);
      var1.field_34928 = var4.field_34928;
      var1.field_34926 = var4.field_34926;
      class_176 var5 = class_176.method_777();

      try {
         var5.method_792(this.field_14024.field_39016, this.field_14024.field_39007, var1);
         this.field_14024.field_39013.put(this.field_14024.field_39007, var1);
      } catch (class_3900 var7) {
         field_14039.error("Couldn't save slot settings");
         this.field_943.method_8609(new class_9306(var7, this));
         return;
      }

      this.field_943.method_8609(this);
   }

   public void method_13163(String var1, String var2) {
      String var5 = var2.trim().isEmpty() ? null : var2;
      class_176 var6 = class_176.method_777();

      try {
         var6.method_769(this.field_14024.field_39016, var1, var5);
         this.field_14024.method_34778(var1);
         this.field_14024.method_34774(var5);
      } catch (class_3900 var8) {
         field_14039.error("Couldn't save settings");
         this.field_943.method_8609(new class_9306(var8, this));
         return;
      }

      this.field_943.method_8609(this);
   }

   public void method_13142(boolean var1, Screen var2) {
      this.field_943.method_8609(new class_1065(var2, new class_5894(this.field_14024, this, this.field_14042, var1)));
   }

   public void method_13145(Screen var1) {
      this.field_943.method_8609(new class_1065(var1, new class_7093(this.field_14024, this)));
   }

   public void method_13151() {
      this.field_14045 = true;
   }

   @Override
   public void method_35633(class_2496 var1) {
      if (var1 != null && class_8422.field_43079 == var1.field_12419) {
         this.field_943.method_8609(new class_1065(this.field_14042, new class_4991(this.field_14024.field_39016, var1, this.method_13136())));
      }
   }

   public class_2866 method_13136() {
      return new class_2866(this.field_14042, this.field_14022);
   }
}
