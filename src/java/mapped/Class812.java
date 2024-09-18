package mapped;

import com.google.common.collect.Lists;
import com.google.common.util.concurrent.RateLimiter;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.util.Util;
import net.minecraft.realms.RealmsScreen;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;

public class Class812 extends RealmsScreen {
   private static final Logger field4356 = LogManager.getLogger();
   private static final ReentrantLock field4357 = new ReentrantLock();
   private final Screen field4358;
   private final Class6120 field4359;
   private final ITextComponent field4360;
   private final RateLimiter field4361;
   private Button field4362;
   private final String field4363;
   private final Class7155 field4364;
   private volatile ITextComponent field4365;
   private volatile ITextComponent field4366 = new TranslationTextComponent("mco.download.preparing");
   private volatile String field4367;
   private volatile boolean field4368;
   private volatile boolean field4369 = true;
   private volatile boolean field4370;
   private volatile boolean field4371;
   private Long field4372;
   private Long field4373;
   private long field4374;
   private int field4375;
   private static final String[] field4376 = new String[]{"", ".", ". .", ". . ."};
   private int field4377;
   private boolean field4378;
   private final BooleanConsumer field4379;

   public Class812(Screen var1, Class6120 var2, String var3, BooleanConsumer var4) {
      this.field4379 = var4;
      this.field4358 = var1;
      this.field4363 = var3;
      this.field4359 = var2;
      this.field4364 = new Class7155(this);
      this.field4360 = new TranslationTextComponent("mco.download.title");
      this.field4361 = RateLimiter.create(0.1F);
   }

   @Override
   public void init() {
      this.mc.keyboardListener.enableRepeatEvents(true);
      this.field4362 = this.<Button>addButton(new Button(this.width / 2 - 100, this.height - 42, 200, 20, DialogTexts.GUI_CANCEL, var1 -> {
         this.field4368 = true;
         this.method2235();
      }));
      this.method2233();
   }

   private void method2233() {
      if (!this.field4370) {
         if (!this.field4378 && this.method2234(this.field4359.field27402) >= 5368709120L) {
            TranslationTextComponent var3 = new TranslationTextComponent("mco.download.confirmation.line1", Class2072.method8729(5368709120L));
            TranslationTextComponent var4 = new TranslationTextComponent("mco.download.confirmation.line2");
            this.mc.displayGuiScreen(new Class808(var1 -> {
               this.field4378 = true;
               this.mc.displayGuiScreen(this);
               this.method2240();
            }, Class2134.field13979, var3, var4, false));
         } else {
            this.method2240();
         }
      }
   }

   private long method2234(String var1) {
      Class9478 var4 = new Class9478();
      return var4.method36586(var1);
   }

   @Override
   public void tick() {
      super.tick();
      this.field4375++;
      if (this.field4366 != null && this.field4361.tryAcquire(1)) {
         List<ITextComponent> var3 = Lists.newArrayList();
         var3.add(this.field4360);
         var3.add(this.field4366);
         if (this.field4367 != null) {
            var3.add(new StringTextComponent(this.field4367 + "%"));
            var3.add(new StringTextComponent(Class2072.method8729(this.field4374) + "/s"));
         }

         if (this.field4365 != null) {
            var3.add(this.field4365);
         }

         String var4 = var3.stream().map(ITextComponent::getString).collect(Collectors.joining("\n"));
         Class9229.method34711(var4);
      }
   }

   @Override
   public boolean keyPressed(int var1, int var2, int var3) {
      if (var1 != 256) {
         return super.keyPressed(var1, var2, var3);
      } else {
         this.field4368 = true;
         this.method2235();
         return true;
      }
   }

   private void method2235() {
      if (this.field4370 && this.field4379 != null && this.field4365 == null) {
         this.field4379.accept(true);
      }

      this.mc.displayGuiScreen(this.field4358);
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.renderBackground(var1);
      drawCenteredString(var1, this.fontRenderer, this.field4360, this.width / 2, 20, 16777215);
      drawCenteredString(var1, this.fontRenderer, this.field4366, this.width / 2, 50, 16777215);
      if (this.field4369) {
         this.method2236(var1);
      }

      if (this.field4364.field30735 != 0L && !this.field4368) {
         this.method2237(var1);
         this.method2238(var1);
      }

      if (this.field4365 != null) {
         drawCenteredString(var1, this.fontRenderer, this.field4365, this.width / 2, 110, 16711680);
      }

      super.render(var1, var2, var3, var4);
   }

   private void method2236(MatrixStack var1) {
      int var4 = this.fontRenderer.method38821(this.field4366);
      if (this.field4375 % 10 == 0) {
         this.field4377++;
      }

      this.fontRenderer.method38801(var1, field4376[this.field4377 % field4376.length], (float)(this.width / 2 + var4 / 2 + 5), 50.0F, 16777215);
   }

   private void method2237(MatrixStack var1) {
      double var4 = Math.min((double)this.field4364.field30735 / (double)this.field4364.field30736, 1.0);
      this.field4367 = String.format(Locale.ROOT, "%.1f", var4 * 100.0);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.disableTexture();
      Tessellator var6 = Tessellator.getInstance();
      BufferBuilder var7 = var6.getBuffer();
      var7.begin(7, DefaultVertexFormats.POSITION_COLOR);
      double var8 = (double)(this.width / 2 - 100);
      double var10 = 0.5;
      var7.pos(var8 - 0.5, 95.5, 0.0).color(217, 210, 210, 255).endVertex();
      var7.pos(var8 + 200.0 * var4 + 0.5, 95.5, 0.0).color(217, 210, 210, 255).endVertex();
      var7.pos(var8 + 200.0 * var4 + 0.5, 79.5, 0.0).color(217, 210, 210, 255).endVertex();
      var7.pos(var8 - 0.5, 79.5, 0.0).color(217, 210, 210, 255).endVertex();
      var7.pos(var8, 95.0, 0.0).color(128, 128, 128, 255).endVertex();
      var7.pos(var8 + 200.0 * var4, 95.0, 0.0).color(128, 128, 128, 255).endVertex();
      var7.pos(var8 + 200.0 * var4, 80.0, 0.0).color(128, 128, 128, 255).endVertex();
      var7.pos(var8, 80.0, 0.0).color(128, 128, 128, 255).endVertex();
      var6.draw();
      RenderSystem.enableTexture();
      method5690(var1, this.fontRenderer, this.field4367 + " %", this.width / 2, 84, 16777215);
   }

   private void method2238(MatrixStack var1) {
      if (this.field4375 % 20 != 0) {
         this.method2239(var1, this.field4374);
      } else {
         if (this.field4372 != null) {
            long var4 = Util.milliTime() - this.field4373;
            if (var4 == 0L) {
               var4 = 1L;
            }

            this.field4374 = 1000L * (this.field4364.field30735 - this.field4372) / var4;
            this.method2239(var1, this.field4374);
         }

         this.field4372 = this.field4364.field30735;
         this.field4373 = Util.milliTime();
      }
   }

   private void method2239(MatrixStack var1, long var2) {
      if (var2 > 0L) {
         int var6 = this.fontRenderer.getStringWidth(this.field4367);
         String var7 = "(" + Class2072.method8729(var2) + "/s)";
         this.fontRenderer.method38801(var1, var7, (float)(this.width / 2 + var6 / 2 + 15), 84.0F, 16777215);
      }
   }

   private void method2240() {
      new Thread(() -> {
         try {
            if (!field4357.tryLock(1L, TimeUnit.SECONDS)) {
               this.field4366 = new TranslationTextComponent("mco.download.failed");
            } else if (this.field4368) {
               this.method2241();
            } else {
               this.field4366 = new TranslationTextComponent("mco.download.downloading", this.field4363);
               Class9478 var3 = new Class9478();
               var3.method36586(this.field4359.field27402);
               var3.method36587(this.field4359, this.field4363, this.field4364, this.mc.getSaveLoader());

               while (!var3.method36589()) {
                  if (var3.method36590()) {
                     var3.method36588();
                     this.field4365 = new TranslationTextComponent("mco.download.failed");
                     this.field4362.setMessage(DialogTexts.field30658);
                     return;
                  }

                  if (var3.method36591()) {
                     if (!this.field4371) {
                        this.field4366 = new TranslationTextComponent("mco.download.extracting");
                     }

                     this.field4371 = true;
                  }

                  if (this.field4368) {
                     var3.method36588();
                     this.method2241();
                     return;
                  }
               }

               this.field4370 = true;
               this.field4366 = new TranslationTextComponent("mco.download.done");
               this.field4362.setMessage(DialogTexts.field30658);
            }
         } catch (InterruptedException var11) {
            field4356.error("Could not acquire upload lock");
         } catch (Exception var12) {
            this.field4365 = new TranslationTextComponent("mco.download.failed");
            var12.printStackTrace();
         } finally {
            if (!field4357.isHeldByCurrentThread()) {
               return;
            } else {
               field4357.unlock();
               this.field4369 = false;
               this.field4370 = true;
            }
         }
      }).start();
   }

   private void method2241() {
      this.field4366 = new TranslationTextComponent("mco.download.cancelled");
   }
}
