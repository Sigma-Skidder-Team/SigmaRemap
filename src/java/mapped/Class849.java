package mapped;

import com.google.common.util.concurrent.Runnables;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

public class Class849 extends Screen {
   private static final Logger field4703 = LogManager.getLogger();
   public static final Class7451 field4704 = new Class7451(new ResourceLocation("textures/gui/title/background/panorama"));
   private static final ResourceLocation field4705 = new ResourceLocation("textures/gui/title/background/panorama_overlay.png");
   private static final ResourceLocation field4706 = new ResourceLocation("textures/gui/accessibility.png");
   private final boolean field4707;
   private String field4708;
   private Class1206 field4709;
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

   public Class849() {
      this(false);
   }

   public Class849(boolean var1) {
      super(new TranslationTextComponent("narrator.screen.title"));
      this.field4717 = var1;
      this.field4707 = (double)new Random().nextFloat() < 1.0E-4;
   }

   private boolean method2594() {
      return this.field4562.field1299.field44620 && this.field4713 != null;
   }

   @Override
   public void method1919() {
      if (this.method2594()) {
         this.field4713.method1919();
      }
   }

   public static CompletableFuture<Void> method2595(TextureManager var0, Executor var1) {
      return CompletableFuture.allOf(
         var0.method1078(field4710, var1), var0.method1078(field4711, var1), var0.method1078(field4705, var1), field4704.method24088(var0, var1)
      );
   }

   @Override
   public boolean method2472() {
      return false;
   }

   @Override
   public boolean method2454() {
      return false;
   }

   @Override
   public void method1921() {
      if (this.field4708 == null) {
         this.field4708 = this.field4562.method1576().method990();
      }

      this.field4714 = this.field4568.method38820("Copyright Mojang AB. Do not distribute!");
      this.field4715 = this.field4564 - this.field4714 - 2;
      byte var3 = 24;
      int var4 = this.field4565 / 4 + 48;
      Class1206 var5 = null;
      if (!this.field4562.method1513()) {
         this.method2596(var4, 24);
         if (Class9299.field42976.method20241()) {
            var5 = Class9561.method37053(this, var4, 24);
            this.<Class1206>method2455(var5);
         }
      } else {
         this.method2597(var4, 24);
      }

      this.<Class1243>method2455(
         new Class1243(
            this.field4564 / 2 - 124,
            var4 + 72 + 12,
            20,
            20,
            0,
            106,
            20,
            Class1206.field6474,
            256,
            256,
            var1 -> this.field4562.displayGuiScreen(new Class1136(this, this.field4562.field1299, this.field4562.method1541())),
            new TranslationTextComponent("narrator.button.language")
         )
      );
      this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 - 100,
            var4 + 72 + 12,
            98,
            20,
            new TranslationTextComponent("menu.options"),
            var1 -> this.field4562.displayGuiScreen(new Class1129(this, this.field4562.field1299))
         )
      );
      this.<Class1206>method2455(
         new Class1206(this.field4564 / 2 + 2, var4 + 72 + 12, 98, 20, new TranslationTextComponent("menu.quit"), var1 -> this.field4562.method1487())
      );
      this.<Class1243>method2455(
         new Class1243(
            this.field4564 / 2 + 104,
            var4 + 72 + 12,
            20,
            20,
            0,
            0,
            20,
            field4706,
            32,
            64,
            var1 -> this.field4562.displayGuiScreen(new Class1142(this, this.field4562.field1299)),
            new TranslationTextComponent("narrator.button.accessibility")
         )
      );
      this.field4562.method1560(false);
      if (this.field4562.field1299.field44620 && !this.field4712) {
         Class810 var6 = new Class810();
         this.field4713 = var6.method2210(this);
         this.field4712 = true;
      }

      if (this.method2594()) {
         this.field4713.method2467(this.field4562, this.field4564, this.field4565);
      }

      if (Class9299.field42978.method20214()) {
         this.field4719 = (Screen)Class9299.method35062(Class9299.field42978, this, var5);
      }
   }

   private void method2596(int var1, int var2) {
      this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 - 100, var1, 200, 20, new TranslationTextComponent("menu.singleplayer"), var1x -> this.field4562.displayGuiScreen(new Class1341(this))
         )
      );
      boolean var5 = true;
      Class8103 var6 = !var5
         ? (var1x, var2x, var3, var4) -> {
            if (!var1x.field6482) {
               this.method2461(
                  var2x,
                  this.field4562.field1294.method38828(new TranslationTextComponent("title.multiplayer.disabled"), Math.max(this.field4564 / 2 - 43, 170)),
                  var3,
                  var4
               );
            }
         }
         : Class1206.field6512;
      this.<Class1206>method2455(new Class1206(this.field4564 / 2 - 100, var1 + var2 * 1, 200, 20, new TranslationTextComponent("menu.multiplayer"), var1x -> {
         Object var4 = !this.field4562.field1299.field44630 ? new Class1334(this) : new Class1316(this);
         this.field4562.displayGuiScreen((Screen)var4);
      }, var6)).field6482 = var5;
      this.<Class1206>method2455(
            new Class1206(this.field4564 / 2 - 100, var1 + var2 * 2, 200, 20, new TranslationTextComponent("menu.online"), var1x -> this.method2599(), var6)
         )
         .field6482 = var5;
      if (Class9299.field42976.method20241() && this.field4566.size() > 0) {
         Class1197 var7 = this.field4566.get(this.field4566.size() - 1);
         var7.field6477 = this.field4564 / 2 + 2;
         var7.method5741(98);
      }
   }

   private void method2597(int var1, int var2) {
      boolean var5 = this.method2598();
      this.<Class1206>method2455(new Class1206(this.field4564 / 2 - 100, var1, 200, 20, new TranslationTextComponent("menu.playdemo"), var2x -> {
         if (!var5) {
            Class8905 var5x = Class8904.method32457();
            this.field4562.method1500("Demo_World", Class314.field1210, var5x, Class7846.method26256(var5x));
         } else {
            this.field4562.method1499("Demo_World");
         }
      }));
      this.field4709 = this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 - 100,
            var1 + var2 * 1,
            200,
            20,
            new TranslationTextComponent("menu.resetdemo"),
            var1x -> {
               Class9774 var4 = this.field4562.method1472();

               try (Class1814 var5x = var4.method38468("Demo_World")) {
                  Class2024 var7 = var5x.method7997();
                  if (var7 != null) {
                     this.field4562
                        .displayGuiScreen(
                           new Class829(
                              this::method2600,
                              new TranslationTextComponent("selectWorld.deleteQuestion"),
                              new TranslationTextComponent("selectWorld.deleteWarning", var7.method8644()),
                              new TranslationTextComponent("selectWorld.deleteButton"),
                              Class7127.field30659
                           )
                        );
                  }
               } catch (IOException var18) {
                  Class7603.method24908(this.field4562, "Demo_World");
                  field4703.warn("Failed to access demo world", var18);
               }
            }
         )
      );
      this.field4709.field6482 = var5;
   }

   private boolean method2598() {
      try (Class1814 var3 = this.field4562.method1472().method38468("Demo_World")) {
         return var3.method7997() != null;
      } catch (IOException var17) {
         Class7603.method24908(this.field4562, "Demo_World");
         field4703.warn("Failed to read demo world data", var17);
         return false;
      }
   }

   private void method2599() {
      Class810 var3 = new Class810();
      var3.method2209(this);
   }

   @Override
   public void method1923(Class9332 var1, int var2, int var3, float var4) {
      if (this.field4718 == 0L && this.field4717) {
         this.field4718 = Util.method38487();
      }

      float var7 = !this.field4717 ? 1.0F : (float)(Util.method38487() - this.field4718) / 1000.0F;
      Class7414.method23710();
      method5686(var1, 0, 0, this.field4564, this.field4565, -1);
      this.field4716.method13754(var4, MathHelper.method37777(var7, 0.0F, 1.0F));
      short var8 = 274;
      int var9 = this.field4564 / 2 - 137;
      byte var10 = 30;
      this.field4562.getTextureManager().bindTexture(field4705);
      RenderSystem.enableBlend();
      RenderSystem.method27834(Class2339.field15997, Class1981.field12932);
      RenderSystem.method27889(1.0F, 1.0F, 1.0F, !this.field4717 ? 1.0F : (float) MathHelper.method37773(MathHelper.method37777(var7, 0.0F, 1.0F)));
      method5698(var1, 0, 0, this.field4564, this.field4565, 0.0F, 0.0F, 16, 128, 16, 128);
      float var11 = !this.field4717 ? 1.0F : MathHelper.method37777(var7 - 1.0F, 0.0F, 1.0F);
      int var12 = MathHelper.method37773(var11 * 255.0F) << 24;
      if ((var12 & -67108864) != 0) {
         this.field4562.getTextureManager().bindTexture(field4710);
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

         this.field4562.getTextureManager().bindTexture(field4711);
         method5699(var1, var9 + 88, 67, 0.0F, 0.0F, 98, 14, 128, 16);
         if (Class9299.field42893.method20214()) {
            Class9299.method35055(Class9299.field42893, this, var1, this.field4568, this.field4564, this.field4565);
         }

         if (this.field4708 != null) {
            RenderSystem.pushMatrix();
            RenderSystem.translatef((float)(this.field4564 / 2 + 90), 70.0F, 0.0F);
            RenderSystem.method27883(-20.0F, 0.0F, 0.0F, 1.0F);
            float var13 = 1.8F
               - MathHelper.method37771(MathHelper.method37763((float)(Util.method38487() % 1000L) / 1000.0F * (float) (Math.PI * 2)) * 0.1F);
            var13 = var13 * 100.0F / (float)(this.field4568.method38820(this.field4708) + 32);
            RenderSystem.scalef(var13, var13, var13);
            method5690(var1, this.field4568, this.field4708, 0, -8, 16776960 | var12);
            RenderSystem.popMatrix();
         }

         String var17 = "Minecraft " + SharedConstants.method34773().getName();
         if (!this.field4562.method1513()) {
            var17 = var17 + (!"release".equalsIgnoreCase(this.field4562.method1466()) ? "/" + this.field4562.method1466() : "");
         } else {
            var17 = var17 + " Demo";
         }

         if (this.field4562.method1457()) {
            var17 = var17 + Class9088.method33883("menu.modded");
         }

         if (!Class9299.field42762.method20245()) {
            method5692(var1, this.field4568, var17, 2, this.field4565 - 10, 16777215 | var12);
         } else {
            if (Class9299.field42764.method20214()) {
               BiConsumer<Integer, String> var14 = (var3x, var4x) -> method5692(var1, this.field4568, var4x, 2, this.field4565 - (10 + var3x * 10), 16777215 | var12);
               Class9299.method35062(Class9299.field42764, true, true, var14);
            }

            if (Class9299.field42765.method20214()) {
               BiConsumer<Integer, String> var19 = (var3x, var4x) -> method5692(
                     var1,
                     this.field4568,
                     var4x,
                     this.field4564 - this.field4568.method38820(var4x),
                     this.field4565 - (10 + (var3x + 1) * 10),
                     16777215 | var12
                  );
               Class9299.method35062(Class9299.field42765, var19);
            }
         }

         method5692(var1, this.field4568, "Copyright Mojang AB. Do not distribute!", this.field4715, this.field4565 - 10, 16777215 | var12);
         if (var2 > this.field4715 && var2 < this.field4715 + this.field4714 && var3 > this.field4565 - 10 && var3 < this.field4565) {
            method5686(var1, this.field4715, this.field4565 - 1, this.field4715 + this.field4714, this.field4565, 16777215 | var12);
         }

         for (Class1197 var15 : this.field4566) {
            var15.method5742(var11);
         }

         super.method1923(var1, var2, var3, var4);
         if (this.method2594() && var11 >= 1.0F) {
            this.field4713.method1923(var1, var2, var3, var4);
         }
      }

      if (this.field4719 != null) {
         this.field4719.method1923(var1, var2, var3, var4);
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
               && var3 > (double)(this.field4565 - 10)
               && var3 < (double)this.field4565) {
               this.field4562.displayGuiScreen(new Class1342(false, Runnables.doNothing()));
            }

            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public void method1931() {
      if (this.field4713 != null) {
         this.field4713.method1931();
      }
   }

   private void method2600(boolean var1) {
      if (var1) {
         try (Class1814 var4 = this.field4562.method1472().method38468("Demo_World")) {
            var4.method8003();
         } catch (IOException var17) {
            Class7603.method24909(this.field4562, "Demo_World");
            field4703.warn("Failed to delete demo world", var17);
         }
      }

      this.field4562.displayGuiScreen(this);
   }
}
