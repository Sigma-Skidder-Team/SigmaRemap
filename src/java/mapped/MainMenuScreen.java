package mapped;

import com.google.common.util.concurrent.Runnables;
import net.minecraft.client.gui.AccessibilityScreen;
import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.screen.LanguageScreen;
import net.minecraft.client.gui.screen.OptionsScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.Widget;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.util.Util;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

public class MainMenuScreen extends Screen {
   private static final Logger field4703 = LogManager.getLogger();
   public static final Class7451 field4704 = new Class7451(new ResourceLocation("textures/gui/title/background/panorama"));
   private static final ResourceLocation field4705 = new ResourceLocation("textures/gui/title/background/panorama_overlay.png");
   private static final ResourceLocation field4706 = new ResourceLocation("textures/gui/accessibility.png");
   private final boolean field4707;
   private String field4708;
   private Button field4709;
   private static final ResourceLocation field4710 = new ResourceLocation("textures/gui/title/minecraft.png");
   private static final ResourceLocation field4711 = new ResourceLocation("textures/gui/title/edition.png");
   private boolean field4712;
   private Screen field4713;
   private int field4714;
   private int field4715;
   private final Class4385 field4716 = new Class4385(field4704);
   private final boolean field4717;
   private long field4718;
   private Screen field4719;

   public MainMenuScreen() {
      this(false);
   }

   public MainMenuScreen(boolean var1) {
      super(new TranslationTextComponent("narrator.screen.title"));
      this.field4717 = var1;
      this.field4707 = (double)new Random().nextFloat() < 1.0E-4;
   }

   private boolean method2594() {
      return this.mc.gameSettings.field44620 && this.field4713 != null;
   }

   @Override
   public void tick() {
      if (this.method2594()) {
         this.field4713.tick();
      }
   }

   public static CompletableFuture<Void> method2595(TextureManager var0, Executor var1) {
      return CompletableFuture.allOf(
         var0.method1078(field4710, var1), var0.method1078(field4711, var1), var0.method1078(field4705, var1), field4704.method24088(var0, var1)
      );
   }

   @Override
   public boolean isPauseScreen() {
      return false;
   }

   @Override
   public boolean method2454() {
      return false;
   }

   @Override
   public void init() {
      if (this.field4708 == null) {
         this.field4708 = this.mc.getSplashes().method990();
      }

      this.field4714 = this.fontRenderer.getStringWidth("Copyright Mojang AB. Do not distribute!");
      this.field4715 = this.width - this.field4714 - 2;
      byte var3 = 24;
      int var4 = this.height / 4 + 48;
      Button var5 = null;
      if (!this.mc.isDemo()) {
         this.method2596(var4, 24);
         if (Class9299.field42976.method20241()) {
            var5 = Class9561.method37053(this, var4, 24);
            this.<Button>addButton(var5);
         }
      } else {
         this.method2597(var4, 24);
      }

      this.<Class1243>addButton(
         new Class1243(
            this.width / 2 - 124,
            var4 + 72 + 12,
            20,
            20,
            0,
            106,
            20,
            Button.field6474,
            256,
            256,
            var1 -> this.mc.displayGuiScreen(new LanguageScreen(this, this.mc.gameSettings, this.mc.getLanguageManager())),
            new TranslationTextComponent("narrator.button.language")
         )
      );
      this.<Button>addButton(
         new Button(
            this.width / 2 - 100,
            var4 + 72 + 12,
            98,
            20,
            new TranslationTextComponent("menu.options"),
            var1 -> this.mc.displayGuiScreen(new OptionsScreen(this, this.mc.gameSettings))
         )
      );
      this.<Button>addButton(
         new Button(this.width / 2 + 2, var4 + 72 + 12, 98, 20, new TranslationTextComponent("menu.quit"), var1 -> this.mc.shutdown())
      );
      this.<Class1243>addButton(
         new Class1243(
            this.width / 2 + 104,
            var4 + 72 + 12,
            20,
            20,
            0,
            0,
            20,
            field4706,
            32,
            64,
            var1 -> this.mc.displayGuiScreen(new AccessibilityScreen(this, this.mc.gameSettings)),
            new TranslationTextComponent("narrator.button.accessibility")
         )
      );
      this.mc.setConnectedToRealms(false);
      if (this.mc.gameSettings.field44620 && !this.field4712) {
         Class810 var6 = new Class810();
         this.field4713 = var6.method2210(this);
         this.field4712 = true;
      }

      if (this.method2594()) {
         this.field4713.init(this.mc, this.width, this.height);
      }

      if (Class9299.field42978.method20214()) {
         this.field4719 = (Screen)Class9299.method35062(Class9299.field42978, this, var5);
      }
   }

   private void method2596(int var1, int var2) {
      this.<Button>addButton(
         new Button(
            this.width / 2 - 100, var1, 200, 20, new TranslationTextComponent("menu.singleplayer"), var1x -> this.mc.displayGuiScreen(new Class1341(this))
         )
      );
      boolean var5 = true;
      Class8103 var6 = !var5
         ? (var1x, var2x, var3, var4) -> {
            if (!var1x.active) {
               this.method2461(
                  var2x,
                  this.mc.fontRenderer.method38828(new TranslationTextComponent("title.multiplayer.disabled"), Math.max(this.width / 2 - 43, 170)),
                  var3,
                  var4
               );
            }
         }
         : Button.field6512;
      this.<Button>addButton(new Button(this.width / 2 - 100, var1 + var2 * 1, 200, 20, new TranslationTextComponent("menu.multiplayer"), var1x -> {
         Object var4 = !this.mc.gameSettings.field44630 ? new Class1334(this) : new MultiplayerScreen(this);
         this.mc.displayGuiScreen((Screen)var4);
      }, var6)).active = var5;
      this.<Button>addButton(
            new Button(this.width / 2 - 100, var1 + var2 * 2, 200, 20, new TranslationTextComponent("menu.online"), var1x -> this.method2599(), var6)
         )
         .active = var5;
      if (Class9299.field42976.method20241() && this.field4566.size() > 0) {
         Widget var7 = this.field4566.get(this.field4566.size() - 1);
         var7.field6477 = this.width / 2 + 2;
         var7.method5741(98);
      }
   }

   private void method2597(int var1, int var2) {
      boolean var5 = this.method2598();
      this.<Button>addButton(new Button(this.width / 2 - 100, var1, 200, 20, new TranslationTextComponent("menu.playdemo"), var2x -> {
         if (!var5) {
            DynamicRegistriesImpl var5x = DynamicRegistries.func_239770_b_();
            this.mc.createWorld("Demo_World", MinecraftServer.field1210, var5x, DimensionGeneratorSettings.method26256(var5x));
         } else {
            this.mc.loadWorld("Demo_World");
         }
      }));
      this.field4709 = this.<Button>addButton(
         new Button(
            this.width / 2 - 100,
            var1 + var2 * 1,
            200,
            20,
            new TranslationTextComponent("menu.resetdemo"),
            var1x -> {
               SaveFormat var4 = this.mc.getSaveLoader();

               try (SaveFormat.LevelSave var5x = var4.getLevelSave("Demo_World")) {
                  Class2024 var7 = var5x.method7997();
                  if (var7 != null) {
                     this.mc
                        .displayGuiScreen(
                           new ConfirmScreen(
                              this::method2600,
                              new TranslationTextComponent("selectWorld.deleteQuestion"),
                              new TranslationTextComponent("selectWorld.deleteWarning", var7.method8644()),
                              new TranslationTextComponent("selectWorld.deleteButton"),
                              DialogTexts.GUI_CANCEL
                           )
                        );
                  }
               } catch (IOException var18) {
                  SystemToast.func_238535_a_(this.mc, "Demo_World");
                  field4703.warn("Failed to access demo world", var18);
               }
            }
         )
      );
      this.field4709.active = var5;
   }

   private boolean method2598() {
      try (SaveFormat.LevelSave var3 = this.mc.getSaveLoader().getLevelSave("Demo_World")) {
         return var3.method7997() != null;
      } catch (IOException var17) {
         SystemToast.func_238535_a_(this.mc, "Demo_World");
         field4703.warn("Failed to read demo world data", var17);
         return false;
      }
   }

   private void method2599() {
      Class810 var3 = new Class810();
      var3.method2209(this);
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      if (this.field4718 == 0L && this.field4717) {
         this.field4718 = Util.milliTime();
      }

      float var7 = !this.field4717 ? 1.0F : (float)(Util.milliTime() - this.field4718) / 1000.0F;
      Class7414.method23710();
      method5686(var1, 0, 0, this.width, this.height, -1);
      this.field4716.method13754(var4, MathHelper.method37777(var7, 0.0F, 1.0F));
      short var8 = 274;
      int var9 = this.width / 2 - 137;
      byte var10 = 30;
      this.mc.getTextureManager().bindTexture(field4705);
      RenderSystem.enableBlend();
      RenderSystem.method27834(Class2339.field15997, Class1981.field12932);
      RenderSystem.method27889(1.0F, 1.0F, 1.0F, !this.field4717 ? 1.0F : (float) MathHelper.method37773(MathHelper.method37777(var7, 0.0F, 1.0F)));
      method5698(var1, 0, 0, this.width, this.height, 0.0F, 0.0F, 16, 128, 16, 128);
      float var11 = !this.field4717 ? 1.0F : MathHelper.method37777(var7 - 1.0F, 0.0F, 1.0F);
      int var12 = MathHelper.method37773(var11 * 255.0F) << 24;
      if ((var12 & -67108864) != 0) {
         this.mc.getTextureManager().bindTexture(field4710);
         RenderSystem.method27889(1.0F, 1.0F, 1.0F, var11);
         if (!this.field4707) {
            this.method5694(var9, 30, (var2x, var3x) -> {
               this.method5696(var1, var2x + 0, var3x, 0, 0, 155, 44);
               this.method5696(var1, var2x + 155, var3x, 0, 45, 155, 44);
            });
         } else {
            this.method5694(var9, 30, (var2x, var3x) -> {
               this.method5696(var1, var2x + 0, var3x, 0, 0, 99, 44);
               this.method5696(var1, var2x + 99, var3x, 129, 0, 27, 44);
               this.method5696(var1, var2x + 99 + 26, var3x, 126, 0, 3, 44);
               this.method5696(var1, var2x + 99 + 26 + 3, var3x, 99, 0, 26, 44);
               this.method5696(var1, var2x + 155, var3x, 0, 45, 155, 44);
            });
         }

         this.mc.getTextureManager().bindTexture(field4711);
         method5699(var1, var9 + 88, 67, 0.0F, 0.0F, 98, 14, 128, 16);
         if (Class9299.field42893.method20214()) {
            Class9299.method35055(Class9299.field42893, this, var1, this.fontRenderer, this.width, this.height);
         }

         if (this.field4708 != null) {
            RenderSystem.pushMatrix();
            RenderSystem.translatef((float)(this.width / 2 + 90), 70.0F, 0.0F);
            RenderSystem.method27883(-20.0F, 0.0F, 0.0F, 1.0F);
            float var13 = 1.8F
               - MathHelper.method37771(MathHelper.sin((float)(Util.milliTime() % 1000L) / 1000.0F * (float) (Math.PI * 2)) * 0.1F);
            var13 = var13 * 100.0F / (float)(this.fontRenderer.getStringWidth(this.field4708) + 32);
            RenderSystem.scalef(var13, var13, var13);
            method5690(var1, this.fontRenderer, this.field4708, 0, -8, 16776960 | var12);
            RenderSystem.popMatrix();
         }

         String var17 = "Minecraft " + SharedConstants.getVersion().getName();
         if (!this.mc.isDemo()) {
            var17 = var17 + (!"release".equalsIgnoreCase(this.mc.getVersionType()) ? "/" + this.mc.getVersionType() : "");
         } else {
            var17 = var17 + " Demo";
         }

         if (this.mc.isModdedClient()) {
            var17 = var17 + I18n.format("menu.modded");
         }

         if (!Class9299.field42762.method20245()) {
            drawString(var1, this.fontRenderer, var17, 2, this.height - 10, 16777215 | var12);
         } else {
            if (Class9299.field42764.method20214()) {
               BiConsumer<Integer, String> var14 = (var3x, var4x) -> drawString(var1, this.fontRenderer, var4x, 2, this.height - (10 + var3x * 10), 16777215 | var12);
               Class9299.method35062(Class9299.field42764, true, true, var14);
            }

            if (Class9299.field42765.method20214()) {
               BiConsumer<Integer, String> var19 = (var3x, var4x) -> drawString(
                     var1,
                     this.fontRenderer,
                     var4x,
                     this.width - this.fontRenderer.getStringWidth(var4x),
                     this.height - (10 + (var3x + 1) * 10),
                     16777215 | var12
                  );
               Class9299.method35062(Class9299.field42765, var19);
            }
         }

         drawString(var1, this.fontRenderer, "Copyright Mojang AB. Do not distribute!", this.field4715, this.height - 10, 16777215 | var12);
         if (var2 > this.field4715 && var2 < this.field4715 + this.field4714 && var3 > this.height - 10 && var3 < this.height) {
            method5686(var1, this.field4715, this.height - 1, this.field4715 + this.field4714, this.height, 16777215 | var12);
         }

         for (Widget var15 : this.field4566) {
            var15.method5742(var11);
         }

         super.render(var1, var2, var3, var4);
         if (this.method2594() && var11 >= 1.0F) {
            this.field4713.render(var1, var2, var3, var4);
         }
      }

      if (this.field4719 != null) {
         this.field4719.render(var1, var2, var3, var4);
      }
   }

   @Override
   public boolean method1958(double var1, double var3, int var5) {
      if (!super.method1958(var1, var3, var5)) {
         if (this.method2594() && this.field4713.method1958(var1, var3, var5)) {
            return true;
         } else {
            if (var1 > (double)this.field4715
               && var1 < (double)(this.field4715 + this.field4714)
               && var3 > (double)(this.height - 10)
               && var3 < (double)this.height) {
               this.mc.displayGuiScreen(new WinGameScreen(false, Runnables.doNothing()));
            }

            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public void onClose() {
      if (this.field4713 != null) {
         this.field4713.onClose();
      }
   }

   private void method2600(boolean var1) {
      if (var1) {
         try (SaveFormat.LevelSave var4 = this.mc.getSaveLoader().getLevelSave("Demo_World")) {
            var4.deleteSave();
         } catch (IOException var17) {
            SystemToast.func_238538_b_(this.mc, "Demo_World");
            field4703.warn("Failed to delete demo world", var17);
         }
      }

      this.mc.displayGuiScreen(this);
   }
}
