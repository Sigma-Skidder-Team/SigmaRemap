package mapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.AbstractGui;
import net.minecraft.entity.player.ChatVisibility;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.util.Deque;
import java.util.List;

public class Class1266 extends AbstractGui {
   private static final Logger field6698 = LogManager.getLogger();
   private final Minecraft field6699;
   private final List<String> field6700 = Lists.newArrayList();
   private final List<Class9500<ITextComponent>> field6701 = Lists.newArrayList();
   private final List<Class9500<Class9125>> field6702 = Lists.newArrayList();
   private final Deque<ITextComponent> field6703 = Queues.newArrayDeque();
   private int field6704;
   private boolean field6705;
   private long field6706 = 0L;
   private int field6707 = 0;

   public Class1266(Minecraft var1) {
      this.field6699 = var1;
   }

   public void method5926(MatrixStack var1, int var2) {
      int var5 = this.method5942();
      if (this.field6707 != var5) {
         this.field6707 = var5;
         this.method5933();
      }

      if (!this.method5927()) {
         this.method5949();
         int var6 = this.method5947();
         int var7 = this.field6702.size();
         if (var7 > 0) {
            boolean var8 = false;
            if (this.method5940()) {
               var8 = true;
            }

            double var9 = this.method5944();
            int var11 = MathHelper.method37774((double)this.method5942() / var9);
            RenderSystem.pushMatrix();
            RenderSystem.translatef(2.0F, 8.0F, 0.0F);
            RenderSystem.scaled(var9, var9, 1.0);
            double var12 = this.field6699.gameSettings.field44583 * 0.9F + 0.1F;
            double var14 = this.field6699.gameSettings.field44585;
            double var16 = 9.0 * (this.field6699.gameSettings.field44584 + 1.0);
            double var18 = -8.0 * (this.field6699.gameSettings.field44584 + 1.0) + 4.0 * this.field6699.gameSettings.field44584;
            int var20 = 0;

            for (int var21 = 0; var21 + this.field6704 < this.field6702.size() && var21 < var6; var21++) {
               Class9500 var22 = this.field6702.get(var21 + this.field6704);
               if (var22 != null) {
                  int var23 = var2 - var22.method36695();
                  if (var23 < 200 || var8) {
                     double var24 = !var8 ? method5928(var23) : 1.0;
                     int var26 = (int)(255.0 * var24 * var12);
                     int var27 = (int)(255.0 * var24 * var14);
                     var20++;
                     if (var26 > 3) {
                        double var29 = (double)(-var21) * var16;
                        var1.push();
                        var1.translate(0.0, 0.0, 50.0);
                        if (this.field6699.gameSettings.field44729 == 5) {
                           var11 = this.field6699.fontRenderer.method38822((Class9125)var22.method36694()) - 2;
                        }

                        if (this.field6699.gameSettings.field44729 != 3) {
                           fill(var1, -2, (int)(var29 - var16), 0 + var11 + 4, (int)var29, var27 << 24);
                        }

                        RenderSystem.enableBlend();
                        var1.translate(0.0, 0.0, 50.0);
                        if (this.field6699.gameSettings.field44730) {
                           this.field6699
                              .fontRenderer
                              .method38802(var1, (Class9125)var22.method36694(), 0.0F, (float)((int)(var29 + var18)), 16777215 + (var26 << 24));
                        } else {
                           this.field6699
                              .fontRenderer
                              .method38804(var1, (Class9125)var22.method36694(), 0.0F, (float)((int)(var29 + var18)), 16777215 + (var26 << 24));
                        }

                        RenderSystem.disableAlphaTest();
                        RenderSystem.disableBlend();
                        var1.pop();
                     }
                  }
               }
            }

            if (!this.field6703.isEmpty()) {
               int var33 = (int)(128.0 * var12);
               int var35 = (int)(255.0 * var14);
               var1.push();
               var1.translate(0.0, 0.0, 50.0);
               fill(var1, -2, 0, var11 + 4, 9, var35 << 24);
               RenderSystem.enableBlend();
               var1.translate(0.0, 0.0, 50.0);
               this.field6699
                  .fontRenderer
                  .method38803(var1, new TranslationTextComponent("chat.queue", this.field6703.size()), 0.0F, 1.0F, 16777215 + (var33 << 24));
               var1.pop();
               RenderSystem.disableAlphaTest();
               RenderSystem.disableBlend();
            }

            if (var8) {
               int var34 = 9;
               RenderSystem.translatef(-3.0F, 0.0F, 0.0F);
               int var36 = var7 * var34 + var7;
               int var37 = var20 * var34 + var20;
               int var31 = this.field6704 * var37 / var7;
               int var32 = var37 * var37 / var36;
               if (var36 != var37) {
                  int var38 = var31 <= 0 ? 96 : 170;
                  int var39 = !this.field6705 ? 3355562 : 13382451;
                  fill(var1, 0, -var31, 2, -var31 - var32, var39 + (var38 << 24));
                  fill(var1, 2, -var31, 1, -var31 - var32, 13421772 + (var38 << 24));
               }
            }

            RenderSystem.popMatrix();
         }
      }
   }

   private boolean method5927() {
      return this.field6699.gameSettings.chatVisibility == ChatVisibility.HIDDEN;
   }

   private static double method5928(int var0) {
      double var3 = (double)var0 / 200.0;
      var3 = 1.0 - var3;
      var3 *= 10.0;
      var3 = MathHelper.clamp(var3, 0.0, 1.0);
      return var3 * var3;
   }

   public void clearChatMessages(boolean var1) {
      this.field6703.clear();
      this.field6702.clear();
      this.field6701.clear();
      if (var1) {
         this.field6700.clear();
      }
   }

   public void sendChatMessage(ITextComponent var1) {
      this.method5931(var1, 0);
   }

   public void method5931(ITextComponent var1, int var2) {
      this.method5932(var1, var2, this.field6699.ingameGUI.method5990(), false);
      field6698.info("[CHAT] {}", var1.getString().replaceAll("\r", "\\\\r").replaceAll("\n", "\\\\n"));
   }

   private void method5932(ITextComponent var1, int var2, int var3, boolean var4) {
      if (var2 != 0) {
         this.method5941(var2);
      }

      int var7 = MathHelper.floor((double)this.method5942() / this.method5944());
      List<Class9125> var8 = Class6885.method20971(var1, var7, this.field6699.fontRenderer);
      boolean var9 = this.method5940();

      for (Class9125 var11 : var8) {
         if (var9 && this.field6704 > 0) {
            this.field6705 = true;
            this.method5937(1.0);
         }

         this.field6702.add(0, new Class9500<Class9125>(var3, var11, var2));
      }

      while (this.field6702.size() > 100) {
         this.field6702.remove(this.field6702.size() - 1);
      }

      if (!var4) {
         this.field6701.add(0, new Class9500<ITextComponent>(var3, var1, var2));

         while (this.field6701.size() > 100) {
            this.field6701.remove(this.field6701.size() - 1);
         }
      }
   }

   public void method5933() {
      this.field6702.clear();
      this.method5936();

      for (int var3 = this.field6701.size() - 1; var3 >= 0; var3--) {
         Class9500 var4 = this.field6701.get(var3);
         this.method5932((ITextComponent)var4.method36694(), var4.method36696(), var4.method36695(), true);
      }
   }

   public List<String> method5934() {
      return this.field6700;
   }

   public void method5935(String var1) {
      if (this.field6700.isEmpty() || !this.field6700.get(this.field6700.size() - 1).equals(var1)) {
         this.field6700.add(var1);
      }
   }

   public void method5936() {
      this.field6704 = 0;
      this.field6705 = false;
   }

   public void method5937(double var1) {
      this.field6704 = (int)((double)this.field6704 + var1);
      int var5 = this.field6702.size();
      if (this.field6704 > var5 - this.method5947()) {
         this.field6704 = var5 - this.method5947();
      }

      if (this.field6704 <= 0) {
         this.field6704 = 0;
         this.field6705 = false;
      }
   }

   public boolean method5938(double var1, double var3) {
      if (this.method5940() && !this.field6699.gameSettings.hideGUI && !this.method5927() && !this.field6703.isEmpty()) {
         double var7 = var1 - 2.0;
         double var9 = (double)this.field6699.getMainWindow().getScaledHeight() - var3 - 40.0;
         if (var7 <= (double) MathHelper.floor((double)this.method5942() / this.method5944())
            && var9 < 0.0
            && var9 > (double) MathHelper.floor(-9.0 * this.method5944())) {
            this.sendChatMessage(this.field6703.remove());
            this.field6706 = System.currentTimeMillis();
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Nullable
   public Style method5939(double var1, double var3) {
      if (this.method5940() && !this.field6699.gameSettings.hideGUI && !this.method5927()) {
         double var7 = var1 - 2.0;
         double var9 = (double)this.field6699.getMainWindow().getScaledHeight() - var3 - 40.0;
         var7 = (double) MathHelper.floor(var7 / this.method5944());
         var9 = (double) MathHelper.floor(var9 / (this.method5944() * (this.field6699.gameSettings.field44584 + 1.0)));
         if (!(var7 < 0.0) && !(var9 < 0.0)) {
            int var11 = Math.min(this.method5947(), this.field6702.size());
            if (var7 <= (double) MathHelper.floor((double)this.method5942() / this.method5944()) && var9 < (double)(9 * var11 + var11)) {
               int var12 = (int)(var9 / 9.0 + (double)this.field6704);
               if (var12 >= 0 && var12 < this.field6702.size()) {
                  Class9500 var13 = this.field6702.get(var12);
                  return this.field6699.fontRenderer.method38830().func_243239_a((Class9125)var13.method36694(), (int)var7);
               }
            }

            return null;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private boolean method5940() {
      return this.field6699.currentScreen instanceof ChatScreen;
   }

   public void method5941(int var1) {
      this.field6702.removeIf(var1x -> var1x.method36696() == var1);
      this.field6701.removeIf(var1x -> var1x.method36696() == var1);
   }

   public int method5942() {
      int var3 = method5945(this.field6699.gameSettings.field44596);
      MainWindow var4 = Minecraft.getInstance().getMainWindow();
      int var5 = (int)((double)(var4.getFramebufferWidth() - 3) / var4.getGuiScaleFactor());
      return MathHelper.clamp(var3, 0, var5);
   }

   public int method5943() {
      return method5946(
         (!this.method5940() ? this.field6699.gameSettings.field44597 : this.field6699.gameSettings.field44598) / (this.field6699.gameSettings.field44584 + 1.0)
      );
   }

   public double method5944() {
      return this.field6699.gameSettings.field44595;
   }

   public static int method5945(double var0) {
      return MathHelper.floor(var0 * 280.0 + 40.0);
   }

   public static int method5946(double var0) {
      return MathHelper.floor(var0 * 160.0 + 20.0);
   }

   public int method5947() {
      return this.method5943() / 9;
   }

   private long method5948() {
      return (long)(this.field6699.gameSettings.field44599 * 1000.0);
   }

   private void method5949() {
      if (!this.field6703.isEmpty()) {
         long var3 = System.currentTimeMillis();
         if (var3 - this.field6706 >= this.method5948()) {
            this.sendChatMessage(this.field6703.remove());
            this.field6706 = var3;
         }
      }
   }

   public void method5950(ITextComponent var1) {
      if (!(this.field6699.gameSettings.field44599 <= 0.0)) {
         long var4 = System.currentTimeMillis();
         if (var4 - this.field6706 < this.method5948()) {
            this.field6703.add(var1);
         } else {
            this.sendChatMessage(var1);
            this.field6706 = var4;
         }
      } else {
         this.sendChatMessage(var1);
      }
   }
}
