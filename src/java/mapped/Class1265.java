package mapped;

import com.google.common.collect.Ordering;
import com.mojang.authlib.GameProfile;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.AbstractGui;
import net.minecraft.client.gui.IngameGui;
import net.minecraft.client.util.Util;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.scoreboard.ScorePlayerTeam;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.GameType;

import java.util.List;

public class Class1265 extends AbstractGui {
   private static final Ordering<Class6589> field6691 = Ordering.from(new Class3590());
   private final Minecraft field6692;
   private final IngameGui field6693;
   private ITextComponent field6694;
   private ITextComponent field6695;
   private long field6696;
   private boolean field6697;

   public Class1265(Minecraft var1, IngameGui var2) {
      this.field6692 = var1;
      this.field6693 = var2;
   }

   public ITextComponent method5917(Class6589 var1) {
      return var1.method19979() == null
         ? this.method5918(var1, ScorePlayerTeam.method28577(var1.method19976(), new StringTextComponent(var1.method19966().getName())))
         : this.method5918(var1, var1.method19979().deepCopy());
   }

   private ITextComponent method5918(Class6589 var1, IFormattableTextComponent var2) {
      return var1.method19967() != GameType.SPECTATOR ? var2 : var2.mergeStyle(TextFormatting.ITALIC);
   }

   public void method5919(boolean var1) {
      if (var1 && !this.field6697) {
         this.field6696 = Util.milliTime();
      }

      this.field6697 = var1;
   }

   public void method5920(MatrixStack var1, int var2, Scoreboard var3, Class8375 var4) {
      ClientPlayNetHandler var7 = this.field6692.player.connection;
      List<Class6589> var8 = field6691.sortedCopy(var7.method15790());
      int var9 = 0;
      int var10 = 0;

      for (Class6589 var12 : var8) {
         int var13 = this.field6692.fontRenderer.method38821(this.method5917(var12));
         var9 = Math.max(var9, var13);
         if (var4 != null && var4.method29342() != Class2316.field15869) {
            var13 = this.field6692.fontRenderer.getStringWidth(" " + var3.method20980(var12.method19966().getName(), var4).method36050());
            var10 = Math.max(var10, var13);
         }
      }

      var8 = var8.subList(0, Math.min(var8.size(), 80));
      int var37 = var8.size();
      int var38 = var37;

      int var40;
      for (var40 = 1; var38 > 20; var38 = (var37 + var40 - 1) / var40) {
         var40++;
      }

      boolean var14 = this.field6692.isIntegratedServerRunning() || this.field6692.getConnection().getNetworkManager().isEncrypted();
      int var15;
      if (var4 == null) {
         var15 = 0;
      } else if (var4.method29342() != Class2316.field15869) {
         var15 = var10;
      } else {
         var15 = 90;
      }

      int var16 = Math.min(var40 * ((!var14 ? 0 : 9) + var9 + var15 + 13), var2 - 50) / var40;
      int var17 = var2 / 2 - (var16 * var40 + (var40 - 1) * 5) / 2;
      int var18 = 10;
      int var19 = var16 * var40 + (var40 - 1) * 5;
      List<Class9125> var20 = null;
      if (this.field6695 != null) {
         var20 = this.field6692.fontRenderer.method38828(this.field6695, var2 - 50);

         for (Class9125 var22 : var20) {
            var19 = Math.max(var19, this.field6692.fontRenderer.method38822(var22));
         }
      }

      List<Class9125> var42 = null;
      if (this.field6694 != null) {
         var42 = this.field6692.fontRenderer.method38828(this.field6694, var2 - 50);

         for (Class9125 var23 : var42) {
            var19 = Math.max(var19, this.field6692.fontRenderer.method38822(var23));
         }
      }

      if (var20 != null) {
         method5686(var1, var2 / 2 - var19 / 2 - 1, var18 - 1, var2 / 2 + var19 / 2 + 1, var18 + var20.size() * 9, Integer.MIN_VALUE);

         for (Class9125 var46 : var20) {
            int var24 = this.field6692.fontRenderer.method38822(var46);
            this.field6692.fontRenderer.method38802(var1, var46, (float)(var2 / 2 - var24 / 2), (float)var18, -1);
            var18 += 9;
         }

         var18++;
      }

      method5686(var1, var2 / 2 - var19 / 2 - 1, var18 - 1, var2 / 2 + var19 / 2 + 1, var18 + var38 * 9, Integer.MIN_VALUE);
      int var45 = this.field6692.gameSettings.method37141(553648127);

      for (int var47 = 0; var47 < var37; var47++) {
         int var49 = var47 / var38;
         int var25 = var47 % var38;
         int var26 = var17 + var49 * var16 + var49 * 5;
         int var27 = var18 + var25 * 9;
         method5686(var1, var26, var27, var26 + var16, var27 + 8, var45);
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         RenderSystem.enableAlphaTest();
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         if (var47 < var8.size()) {
            Class6589 var28 = (Class6589)var8.get(var47);
            GameProfile var29 = var28.method19966();
            if (var14) {
               PlayerEntity var30 = this.field6692.world.method7196(var29.getId());
               boolean var31 = var30 != null
                  && var30.method2962(Class2318.field15879)
                  && ("Dinnerbone".equals(var29.getName()) || "Grumm".equals(var29.getName()));
               this.field6692.getTextureManager().bindTexture(var28.method19973());
               int var32 = 8 + (!var31 ? 0 : 8);
               int var33 = 8 * (!var31 ? 1 : -1);
               AbstractGui.method5698(var1, var26, var27, 8, 8, 8.0F, (float)var32, 8, var33, 64, 64);
               if (var30 != null && var30.method2962(Class2318.field15885)) {
                  int var34 = 8 + (!var31 ? 0 : 8);
                  int var35 = 8 * (!var31 ? 1 : -1);
                  AbstractGui.method5698(var1, var26, var27, 8, 8, 40.0F, (float)var34, 8, var35, 64, 64);
               }

               var26 += 9;
            }

            this.field6692
               .fontRenderer
               .method38803(var1, this.method5917(var28), (float)var26, (float)var27, var28.method19967() != GameType.SPECTATOR ? -1 : -1862270977);
            if (var4 != null && var28.method19967() != GameType.SPECTATOR) {
               int var52 = var26 + var9 + 1;
               int var53 = var52 + var15;
               if (var53 - var52 > 5) {
                  this.method5922(var4, var27, var29.getName(), var52, var53, var28, var1);
               }
            }

            this.method5921(var1, var16, var26 - (!var14 ? 0 : 9), var27, var28);
         }
      }

      if (var42 != null) {
         var18 = var18 + var38 * 9 + 1;
         method5686(var1, var2 / 2 - var19 / 2 - 1, var18 - 1, var2 / 2 + var19 / 2 + 1, var18 + var42.size() * 9, Integer.MIN_VALUE);

         for (Class9125 var50 : var42) {
            int var51 = this.field6692.fontRenderer.method38822(var50);
            this.field6692.fontRenderer.method38802(var1, var50, (float)(var2 / 2 - var51 / 2), (float)var18, -1);
            var18 += 9;
         }
      }
   }

   public void method5921(MatrixStack var1, int var2, int var3, int var4, Class6589 var5) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field6692.getTextureManager().bindTexture(field6453);
      boolean var8 = false;
      byte var9;
      if (var5.method19969() >= 0) {
         if (var5.method19969() >= 150) {
            if (var5.method19969() >= 300) {
               if (var5.method19969() >= 600) {
                  if (var5.method19969() >= 1000) {
                     var9 = 4;
                  } else {
                     var9 = 3;
                  }
               } else {
                  var9 = 2;
               }
            } else {
               var9 = 1;
            }
         } else {
            var9 = 0;
         }
      } else {
         var9 = 5;
      }

      this.method5703(this.method5702() + 100);
      this.blit(var1, var3 + var2 - 11, var4, 0, 176 + var9 * 8, 10, 8);
      this.method5703(this.method5702() - 100);
   }

   private void method5922(Class8375 var1, int var2, String var3, int var4, int var5, Class6589 var6, MatrixStack var7) {
      int var10 = var1.method29335().method20980(var3, var1).method36050();
      if (var1.method29342() != Class2316.field15869) {
         String var11 = TextFormatting.YELLOW + "" + var10;
         this.field6692.fontRenderer.drawStringWithShadow(var7, var11, (float)(var5 - this.field6692.fontRenderer.getStringWidth(var11)), (float)var2, 16777215);
      } else {
         this.field6692.getTextureManager().bindTexture(field6453);
         long var12 = Util.milliTime();
         if (this.field6696 == var6.method19988()) {
            if (var10 >= var6.method19980()) {
               if (var10 > var6.method19980()) {
                  var6.method19985(var12);
                  var6.method19987((long)(this.field6693.method5990() + 10));
               }
            } else {
               var6.method19985(var12);
               var6.method19987((long)(this.field6693.method5990() + 20));
            }
         }

         if (var12 - var6.method19984() > 1000L || this.field6696 != var6.method19988()) {
            var6.method19981(var10);
            var6.method19983(var10);
            var6.method19985(var12);
         }

         var6.method19989(this.field6696);
         var6.method19981(var10);
         int var14 = MathHelper.ceil((float)Math.max(var10, var6.method19982()) / 2.0F);
         int var15 = Math.max(MathHelper.ceil((float)(var10 / 2)), Math.max(MathHelper.ceil((float)(var6.method19982() / 2)), 10));
         boolean var16 = var6.method19986() > (long)this.field6693.method5990() && (var6.method19986() - (long)this.field6693.method5990()) / 3L % 2L == 1L;
         if (var14 > 0) {
            int var17 = MathHelper.method37767(Math.min((float)(var5 - var4 - 4) / (float)var15, 9.0F));
            if (var17 <= 3) {
               float var18 = MathHelper.clamp((float)var10 / 20.0F, 0.0F, 1.0F);
               int var19 = (int)((1.0F - var18) * 255.0F) << 16 | (int)(var18 * 255.0F) << 8;
               String var20 = "" + (float)var10 / 2.0F;
               if (var5 - this.field6692.fontRenderer.getStringWidth(var20 + "hp") >= var4) {
                  var20 = var20 + "hp";
               }

               this.field6692
                  .fontRenderer
                  .drawStringWithShadow(var7, var20, (float)((var5 + var4) / 2 - this.field6692.fontRenderer.getStringWidth(var20) / 2), (float)var2, var19);
            } else {
               for (int var21 = var14; var21 < var15; var21++) {
                  this.blit(var7, var4 + var21 * var17, var2, !var16 ? 16 : 25, 0, 9, 9);
               }

               for (int var22 = 0; var22 < var14; var22++) {
                  this.blit(var7, var4 + var22 * var17, var2, !var16 ? 16 : 25, 0, 9, 9);
                  if (var16) {
                     if (var22 * 2 + 1 < var6.method19982()) {
                        this.blit(var7, var4 + var22 * var17, var2, 70, 0, 9, 9);
                     }

                     if (var22 * 2 + 1 == var6.method19982()) {
                        this.blit(var7, var4 + var22 * var17, var2, 79, 0, 9, 9);
                     }
                  }

                  if (var22 * 2 + 1 < var10) {
                     this.blit(var7, var4 + var22 * var17, var2, var22 < 10 ? 52 : 160, 0, 9, 9);
                  }

                  if (var22 * 2 + 1 == var10) {
                     this.blit(var7, var4 + var22 * var17, var2, var22 < 10 ? 61 : 169, 0, 9, 9);
                  }
               }
            }
         }
      }
   }

   public void method5923(ITextComponent var1) {
      this.field6694 = var1;
   }

   public void method5924(ITextComponent var1) {
      this.field6695 = var1;
   }

   public void method5925() {
      this.field6695 = null;
      this.field6694 = null;
   }
}
