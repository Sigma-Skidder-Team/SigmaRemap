package mapped;

import com.google.common.hash.Hashing;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.AbstractGui;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.Util;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.*;
import org.apache.commons.lang3.Validate;

import java.net.UnknownHostException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Class1157 extends Class1156 {
   private final MultiplayerScreen field6296;
   private final Minecraft field6297;
   private final ServerData field6298;
   private final ResourceLocation field6299;
   private String field6300;
   private Class291 field6301;
   private long field6302;
   public final Class1279 field6303;

   public Class1157(Class1279 var1, MultiplayerScreen var2, ServerData var3) {
      this.field6303 = var1;
      this.field6296 = var2;
      this.field6298 = var3;
      this.field6297 = Minecraft.getInstance();
      this.field6299 = new ResourceLocation("servers/" + Hashing.sha1().hashUnencodedChars(var3.field33189) + "/icon");
      this.field6301 = (Class291)this.field6297.getTextureManager().getTexture(this.field6299);
   }

   @Override
   public void method5544(MatrixStack var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      if (!this.field6298.field33195) {
         this.field6298.field33195 = true;
         this.field6298.field33192 = -2L;
         this.field6298.field33191 = StringTextComponent.EMPTY;
         this.field6298.field33190 = StringTextComponent.EMPTY;
         Class1279.method6085().submit(() -> {
            try {
               this.field6296.method6240().method34003(this.field6298, () -> this.field6297.execute(this::method5546));
            } catch (UnknownHostException var4x) {
               this.field6298.field33192 = -1L;
               this.field6298.field33191 = Class1279.method6094();
            } catch (Exception var5x) {
               this.field6298.field33192 = -1L;
               this.field6298.field33191 = Class1279.method6095();
            }
         });
      }

      boolean var13 = this.field6298.field33193 != SharedConstants.getVersion().getProtocolVersion();
      this.field6297.fontRenderer.method38801(var1, this.field6298.field33188, (float)(var4 + 32 + 3), (float)(var3 + 1), 16777215);
      List var14 = this.field6297.fontRenderer.method38828(this.field6298.field33191, var5 - 32 - 2);

      for (int var15 = 0; var15 < Math.min(var14.size(), 2); var15++) {
         this.field6297.fontRenderer.method38804(var1, (Class9125)var14.get(var15), (float)(var4 + 32 + 3), (float)(var3 + 12 + 9 * var15), 8421504);
      }

      Object var26 = !var13 ? this.field6298.field33190 : this.field6298.field33194.deepCopy().mergeStyle(TextFormatting.RED);
      int var16 = this.field6297.fontRenderer.method38821((ITextProperties)var26);
      this.field6297.fontRenderer.func_243248_b(var1, (ITextComponent)var26, (float)(var4 + var5 - var16 - 15 - 2), (float)(var3 + 1), 8421504);
      int var17 = 0;
      int var18;
      Object var19;
      List var20;
      if (!var13) {
         if (this.field6298.field33195 && this.field6298.field33192 != -2L) {
            if (this.field6298.field33192 >= 0L) {
               if (this.field6298.field33192 >= 150L) {
                  if (this.field6298.field33192 >= 300L) {
                     if (this.field6298.field33192 >= 600L) {
                        if (this.field6298.field33192 >= 1000L) {
                           var18 = 4;
                        } else {
                           var18 = 3;
                        }
                     } else {
                        var18 = 2;
                     }
                  } else {
                     var18 = 1;
                  }
               } else {
                  var18 = 0;
               }
            } else {
               var18 = 5;
            }

            if (this.field6298.field33192 >= 0L) {
               var19 = new TranslationTextComponent("multiplayer.status.ping", this.field6298.field33192);
               var20 = this.field6298.field33196;
            } else {
               var19 = Class1279.method6087();
               var20 = Collections.emptyList();
            }
         } else {
            var17 = 1;
            var18 = (int)(Util.milliTime() / 100L + (long)(var2 * 2) & 7L);
            if (var18 > 4) {
               var18 = 8 - var18;
            }

            var19 = Class1279.method6088();
            var20 = Collections.emptyList();
         }
      } else {
         var18 = 5;
         var19 = Class1279.method6086();
         var20 = this.field6298.field33196;
      }

      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field6297.getTextureManager().bindTexture(AbstractGui.field6453);
      AbstractGui.method5699(var1, var4 + var5 - 15, var3, (float)(var17 * 10), (float)(176 + var18 * 8), 10, 8, 256, 256);
      String var21 = this.field6298.method25580();
      if (!Objects.equals(var21, this.field6300)) {
         if (!this.method5549(var21)) {
            this.field6298.method25581((String)null);
            this.method5546();
         } else {
            this.field6300 = var21;
         }
      }

      if (this.field6301 == null) {
         this.method5547(var1, var4, var3, Class1279.method6089());
      } else {
         this.method5547(var1, var4, var3, this.field6299);
      }

      int var22 = var7 - var4;
      int var23 = var8 - var3;
      if (var22 >= var5 - 15 && var22 <= var5 - 5 && var23 >= 0 && var23 <= 8) {
         this.field6296.method6241(Collections.<ITextComponent>singletonList((ITextComponent)var19));
      } else if (var22 >= var5 - var16 - 15 - 2 && var22 <= var5 - 15 - 2 && var23 >= 0 && var23 <= 8) {
         this.field6296.method6241(var20);
      }

      if (this.field6297.gameSettings.touchscreen || var9) {
         this.field6297.getTextureManager().bindTexture(Class1279.method6090());
         AbstractGui.method5686(var1, var4, var3, var4 + 32, var3 + 32, -1601138544);
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         int var24 = var7 - var4;
         int var25 = var8 - var3;
         if (this.method5548()) {
            if (var24 < 32 && var24 > 16) {
               AbstractGui.method5699(var1, var4, var3, 0.0F, 32.0F, 32, 32, 256, 256);
            } else {
               AbstractGui.method5699(var1, var4, var3, 0.0F, 0.0F, 32, 32, 256, 256);
            }
         }

         if (var2 > 0) {
            if (var24 < 16 && var25 < 16) {
               AbstractGui.method5699(var1, var4, var3, 96.0F, 32.0F, 32, 32, 256, 256);
            } else {
               AbstractGui.method5699(var1, var4, var3, 96.0F, 0.0F, 32, 32, 256, 256);
            }
         }

         if (var2 < this.field6296.method6242().method27099() - 1) {
            if (var24 < 16 && var25 > 16) {
               AbstractGui.method5699(var1, var4, var3, 64.0F, 32.0F, 32, 32, 256, 256);
            } else {
               AbstractGui.method5699(var1, var4, var3, 64.0F, 0.0F, 32, 32, 256, 256);
            }
         }
      }
   }

   public void method5546() {
      this.field6296.method6242().method27095();
   }

   public void method5547(MatrixStack var1, int var2, int var3, ResourceLocation var4) {
      this.field6297.getTextureManager().bindTexture(var4);
      RenderSystem.enableBlend();
      AbstractGui.method5699(var1, var2, var3, 0.0F, 0.0F, 32, 32, 32, 32);
      RenderSystem.disableBlend();
   }

   private boolean method5548() {
      return true;
   }

   private boolean method5549(String var1) {
      if (var1 == null) {
         this.field6297.getTextureManager().method1081(this.field6299);
         if (this.field6301 != null && this.field6301.method1141() != null) {
            this.field6301.method1141().close();
         }

         this.field6301 = null;
      } else {
         try {
            Class1806 var4 = Class1806.method7909(var1);
            Validate.validState(var4.method7886() == 64, "Must be 64 pixels wide", new Object[0]);
            Validate.validState(var4.method7887() == 64, "Must be 64 pixels high", new Object[0]);
            if (this.field6301 == null) {
               this.field6301 = new Class291(var4);
            } else {
               this.field6301.method1142(var4);
               this.field6301.method1140();
            }

            this.field6297.getTextureManager().method1073(this.field6299, this.field6301);
         } catch (Throwable var5) {
            Class1279.method6091().error("Invalid icon for server {} ({})", this.field6298.field33188, this.field6298.field33189, var5);
            return false;
         }
      }

      return true;
   }

   @Override
   public boolean keyPressed(int var1, int var2, int var3) {
      if (Screen.method2476()) {
         Class1279 var6 = this.field6296.field6949;
         int var7 = var6.method2468().indexOf(this);
         if (var1 == 264 && var7 < this.field6296.method6242().method27099() - 1 || var1 == 265 && var7 > 0) {
            this.method5550(var7, var1 != 264 ? var7 - 1 : var7 + 1);
            return true;
         }
      }

      return super.keyPressed(var1, var2, var3);
   }

   private void method5550(int var1, int var2) {
      this.field6296.method6242().method27100(var1, var2);
      this.field6296.field6949.method6081(this.field6296.method6242());
      Class1156 var5 = this.field6296.field6949.method2468().get(var2);
      this.field6296.field6949.method6024(var5);
      Class1279.method6092(this.field6303, var5);
   }

   @Override
   public boolean method1958(double var1, double var3, int var5) {
      double var8 = var1 - (double)this.field6303.method6053();
      double var10 = var3 - (double)Class1279.method6093(this.field6303, this.field6303.method2468().indexOf(this));
      if (var8 <= 32.0) {
         if (var8 < 32.0 && var8 > 16.0 && this.method5548()) {
            this.field6296.method6238(this);
            this.field6296.method6236();
            return true;
         }

         int var12 = this.field6296.field6949.method2468().indexOf(this);
         if (var8 < 16.0 && var10 < 16.0 && var12 > 0) {
            this.method5550(var12, var12 - 1);
            return true;
         }

         if (var8 < 16.0 && var10 > 16.0 && var12 < this.field6296.method6242().method27099() - 1) {
            this.method5550(var12, var12 + 1);
            return true;
         }
      }

      this.field6296.method6238(this);
      if (Util.milliTime() - this.field6302 < 250L) {
         this.field6296.method6236();
      }

      this.field6302 = Util.milliTime();
      return false;
   }

   public ServerData method5551() {
      return this.field6298;
   }

   // $VF: synthetic method
   public static ServerData method5554(Class1157 var0) {
      return var0.field6298;
   }
}
