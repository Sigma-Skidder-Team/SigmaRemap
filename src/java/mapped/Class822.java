package mapped;

import com.google.common.collect.Lists;
import com.google.common.util.concurrent.RateLimiter;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.realmsclient.client.RealmsClient;
import com.mojang.realmsclient.exception.RealmsServiceException;
import com.mojang.realmsclient.gui.screens.RealmsResetWorldScreen;
import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.util.Util;
import net.minecraft.realms.RealmsScreen;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream;
import org.apache.commons.compress.utils.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Stream;
import java.util.zip.GZIPOutputStream;

public class Class822 extends RealmsScreen {
   private static final Logger field4479 = LogManager.getLogger();
   private static final ReentrantLock field4480 = new ReentrantLock();
   private static final String[] field4481 = new String[]{"", ".", ". .", ". . ."};
   private static final ITextComponent field4482 = new TranslationTextComponent("mco.upload.verifying");
   private final RealmsResetWorldScreen field4483;
   private final Class2024 field4484;
   private final long field4485;
   private final int field4486;
   private final Class7424 field4487;
   private final RateLimiter field4488;
   private volatile ITextComponent[] field4489;
   private volatile ITextComponent field4490 = new TranslationTextComponent("mco.upload.preparing");
   private volatile String field4491;
   private volatile boolean field4492;
   private volatile boolean field4493;
   private volatile boolean field4494 = true;
   private volatile boolean field4495;
   private Button field4496;
   private Button field4497;
   private int field4498;
   private Long field4499;
   private Long field4500;
   private long field4501;
   private final Runnable field4502;

   public Class822(long var1, int var3, RealmsResetWorldScreen var4, Class2024 var5, Runnable var6) {
      this.field4485 = var1;
      this.field4486 = var3;
      this.field4483 = var4;
      this.field4484 = var5;
      this.field4487 = new Class7424();
      this.field4488 = RateLimiter.create(0.1F);
      this.field4502 = var6;
   }

   @Override
   public void init() {
      this.mc.keyboardListener.enableRepeatEvents(true);
      this.field4496 = this.<Button>addButton(
         new Button(this.width / 2 - 100, this.height - 42, 200, 20, DialogTexts.field30663, var1 -> this.method2361())
      );
      this.field4496.field6483 = false;
      this.field4497 = this.<Button>addButton(
         new Button(this.width / 2 - 100, this.height - 42, 200, 20, DialogTexts.GUI_CANCEL, var1 -> this.method2362())
      );
      if (!this.field4495) {
         if (this.field4483.field4400 != -1) {
            this.field4483.method2251(() -> {
               if (!this.field4495) {
                  this.field4495 = true;
                  this.mc.displayGuiScreen(this);
                  this.method2367();
               }
            });
         } else {
            this.method2367();
         }
      }
   }

   @Override
   public void onClose() {
      this.mc.keyboardListener.enableRepeatEvents(false);
   }

   private void method2361() {
      this.field4502.run();
   }

   private void method2362() {
      this.field4492 = true;
      this.mc.displayGuiScreen(this.field4483);
   }

   @Override
   public boolean keyPressed(int var1, int var2, int var3) {
      if (var1 != 256) {
         return super.keyPressed(var1, var2, var3);
      } else {
         if (!this.field4494) {
            this.method2361();
         } else {
            this.method2362();
         }

         return true;
      }
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.renderBackground(var1);
      if (!this.field4493 && this.field4487.field31909 != 0L && this.field4487.field31909 == this.field4487.field31910) {
         this.field4490 = field4482;
         this.field4497.active = false;
      }

      drawCenteredString(var1, this.fontRenderer, this.field4490, this.width / 2, 50, 16777215);
      if (this.field4494) {
         this.method2363(var1);
      }

      if (this.field4487.field31909 != 0L && !this.field4492) {
         this.method2364(var1);
         this.method2365(var1);
      }

      if (this.field4489 != null) {
         for (int var7 = 0; var7 < this.field4489.length; var7++) {
            drawCenteredString(var1, this.fontRenderer, this.field4489[var7], this.width / 2, 110 + 12 * var7, 16711680);
         }
      }

      super.render(var1, var2, var3, var4);
   }

   private void method2363(MatrixStack var1) {
      int var4 = this.fontRenderer.method38821(this.field4490);
      this.fontRenderer.method38801(var1, field4481[this.field4498 / 10 % field4481.length], (float)(this.width / 2 + var4 / 2 + 5), 50.0F, 16777215);
   }

   private void method2364(MatrixStack var1) {
      double var4 = Math.min((double)this.field4487.field31909 / (double)this.field4487.field31910, 1.0);
      this.field4491 = String.format(Locale.ROOT, "%.1f", var4 * 100.0);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.disableTexture();
      double var6 = (double)(this.width / 2 - 100);
      double var8 = 0.5;
      Tessellator var10 = Tessellator.getInstance();
      BufferBuilder var11 = var10.getBuffer();
      var11.begin(7, DefaultVertexFormats.POSITION_COLOR);
      var11.pos(var6 - 0.5, 95.5, 0.0).color(217, 210, 210, 255).endVertex();
      var11.pos(var6 + 200.0 * var4 + 0.5, 95.5, 0.0).color(217, 210, 210, 255).endVertex();
      var11.pos(var6 + 200.0 * var4 + 0.5, 79.5, 0.0).color(217, 210, 210, 255).endVertex();
      var11.pos(var6 - 0.5, 79.5, 0.0).color(217, 210, 210, 255).endVertex();
      var11.pos(var6, 95.0, 0.0).color(128, 128, 128, 255).endVertex();
      var11.pos(var6 + 200.0 * var4, 95.0, 0.0).color(128, 128, 128, 255).endVertex();
      var11.pos(var6 + 200.0 * var4, 80.0, 0.0).color(128, 128, 128, 255).endVertex();
      var11.pos(var6, 80.0, 0.0).color(128, 128, 128, 255).endVertex();
      var10.draw();
      RenderSystem.enableTexture();
      method5690(var1, this.fontRenderer, this.field4491 + " %", this.width / 2, 84, 16777215);
   }

   private void method2365(MatrixStack var1) {
      if (this.field4498 % 20 != 0) {
         this.method2366(var1, this.field4501);
      } else {
         if (this.field4499 != null) {
            long var4 = Util.milliTime() - this.field4500;
            if (var4 == 0L) {
               var4 = 1L;
            }

            this.field4501 = 1000L * (this.field4487.field31909 - this.field4499) / var4;
            this.method2366(var1, this.field4501);
         }

         this.field4499 = this.field4487.field31909;
         this.field4500 = Util.milliTime();
      }
   }

   private void method2366(MatrixStack var1, long var2) {
      if (var2 > 0L) {
         int var6 = this.fontRenderer.getStringWidth(this.field4491);
         String var7 = "(" + Class2072.method8729(var2) + "/s)";
         this.fontRenderer.method38801(var1, var7, (float)(this.width / 2 + var6 / 2 + 15), 84.0F, 16777215);
      }
   }

   @Override
   public void tick() {
      super.tick();
      this.field4498++;
      if (this.field4490 != null && this.field4488.tryAcquire(1)) {
         ArrayList var3 = Lists.newArrayList();
         var3.add(this.field4490.getString());
         if (this.field4491 != null) {
            var3.add(this.field4491 + "%");
         }

         if (this.field4489 != null) {
            Stream.<ITextComponent>of(this.field4489).<String>map(ITextComponent::getString).forEach(var3::add);
         }

         Class9229.method34711(String.join(System.lineSeparator(), var3));
      }
   }

   private void method2367() {
      this.field4495 = true;
      new Thread(
            () -> {
               File var3 = null;
               RealmsClient var4 = RealmsClient.method14543();
               long var5 = this.field4485;

               try {
                  if (!field4480.tryLock(1L, TimeUnit.SECONDS)) {
                     this.field4490 = new TranslationTextComponent("mco.upload.close.failure");
                  } else {
                     label344: {
                        Class6133 var7 = null;

                        for (int var8 = 0; var8 < 20; var8++) {
                           try {
                              if (this.field4492) {
                                 this.method2369();
                              }

                              var7 = var4.method14577(var5, Class8510.method30149(var5));
                              if (var7 != null) {
                                 break;
                              }
                           } catch (Class2436 ignored) {

                           }
                        }

                        if (var7 == null) {
                           this.field4490 = new TranslationTextComponent("mco.upload.close.failure");
                        } else {
                           Class8510.method30151(var5, var7.method18932());
                           if (!var7.method18934()) {
                              this.field4490 = new TranslationTextComponent("mco.upload.close.failure");
                           } else if (this.field4492) {
                              this.method2369();
                           } else {
                              File var29 = new File(this.mc.gameDir.getAbsolutePath(), "saves");
                              var3 = this.method2371(new File(var29, this.field4484.method8643()));
                              if (this.field4492) {
                                 this.method2369();
                              } else if (this.method2370(var3)) {
                                 this.field4490 = new TranslationTextComponent("mco.upload.uploading", this.field4484.method8644());
                                 Class9696 var9 = new Class9696(
                                    var3, this.field4485, this.field4486, var7, this.mc.getSession(), SharedConstants.getVersion().getName(), this.field4487
                                 );
                                 var9.method37965(var3x -> {
                                    if (var3x.field38749 >= 200 && var3x.field38749 < 300) {
                                       this.field4493 = true;
                                       this.field4490 = new TranslationTextComponent("mco.upload.done");
                                       this.field4496.setMessage(DialogTexts.field30658);
                                       Class8510.method30150(var5);
                                    } else if (var3x.field38749 == 400 && var3x.field38750 != null) {
                                       this.method2368(new TranslationTextComponent("mco.upload.failed", var3x.field38750));
                                    } else {
                                       this.method2368(new TranslationTextComponent("mco.upload.failed", var3x.field38749));
                                    }
                                 });

                                 while (!var9.method37974()) {
                                    if (this.field4492) {
                                       var9.method37966();
                                       this.method2369();
                                    }
                                 }
                              } else {
                                 long var11 = var3.length();
                                 Class2072 var13 = Class2072.method8727(var11);
                                 Class2072 var14 = Class2072.method8727(5368709120L);
                                 if (Class2072.method8730(var11, var13).equals(Class2072.method8730(5368709120L, var14)) && var13 != Class2072.field13498) {
                                    Class2072 var15 = Class2072.values()[var13.ordinal() - 1];
                                    this.method2368(
                                       new TranslationTextComponent("mco.upload.size.failure.line1", this.field4484.method8644()),
                                       new TranslationTextComponent(
                                          "mco.upload.size.failure.line2", Class2072.method8730(var11, var15), Class2072.method8730(5368709120L, var15)
                                       )
                                    );
                                 } else {
                                    this.method2368(
                                       new TranslationTextComponent("mco.upload.size.failure.line1", this.field4484.method8644()),
                                       new TranslationTextComponent(
                                          "mco.upload.size.failure.line2", Class2072.method8730(var11, var13), Class2072.method8730(5368709120L, var14)
                                       )
                                    );
                                 }
                              }
                           }
                        }
                     }
                  }
               } catch (IOException var25) {
                  this.method2368(new TranslationTextComponent("mco.upload.failed", var25.getMessage()));
               } catch (RealmsServiceException var26) {
                  this.method2368(new TranslationTextComponent("mco.upload.failed", var26.toString()));
               } catch (InterruptedException var27) {
                  field4479.error("Could not acquire upload lock");
               } finally {
                  this.field4493 = true;
                  if (field4480.isHeldByCurrentThread()) {
                     field4480.unlock();
                     this.field4494 = false;
                     this.field4496.field6483 = true;
                     this.field4497.field6483 = false;
                     if (var3 != null) {
                        field4479.debug("Deleting file " + var3.getAbsolutePath());
                        var3.delete();
                     }
                  }

                  return;
               }
            }
         )
         .start();
   }

   private void method2368(ITextComponent... var1) {
      this.field4489 = var1;
   }

   private void method2369() {
      this.field4490 = new TranslationTextComponent("mco.upload.cancelled");
      field4479.debug("Upload was cancelled");
   }

   private boolean method2370(File var1) {
      return var1.length() < 5368709120L;
   }

   private File method2371(File var1) throws IOException {
      TarArchiveOutputStream var4 = null;

      File var6;
      try {
         File var5 = File.createTempFile("realms-upload-file", ".tar.gz");
         var4 = new TarArchiveOutputStream(new GZIPOutputStream(new FileOutputStream(var5)));
         var4.setLongFileMode(3);
         this.method2372(var4, var1.getAbsolutePath(), "world", true);
         var4.finish();
         var6 = var5;
      } finally {
         if (var4 != null) {
            var4.close();
         }
      }

      return var6;
   }

   private void method2372(TarArchiveOutputStream var1, String var2, String var3, boolean var4) throws IOException {
      if (!this.field4492) {
         File var7 = new File(var2);
         String var8 = !var4 ? var3 + var7.getName() : var3;
         TarArchiveEntry var9 = new TarArchiveEntry(var7, var8);
         var1.putArchiveEntry(var9);
         if (!var7.isFile()) {
            var1.closeArchiveEntry();
            File[] var10 = var7.listFiles();
            if (var10 != null) {
               for (File var14 : var10) {
                  this.method2372(var1, var14.getAbsolutePath(), var8 + "/", false);
               }
            }
         } else {
            IOUtils.copy(new FileInputStream(var7), var1);
            var1.closeArchiveEntry();
         }
      }
   }
}
