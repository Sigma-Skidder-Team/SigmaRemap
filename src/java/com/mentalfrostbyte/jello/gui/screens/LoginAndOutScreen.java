package com.mentalfrostbyte.jello.gui.screens;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.gui.Screen;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.render.animation.Animation;
import com.mentalfrostbyte.jello.util.render.animation.Direction;
import lol.ClientColors;
import lol.Texture;
import mapped.*;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

import java.awt.*;
import java.util.ArrayList;

public class LoginAndOutScreen extends Screen {
   private int field21082 = 0;
   private int field21083 = 0;
   private boolean field21084 = true;
   private float field21085 = 0.0F;
   private float field21086 = 0.0F;
   private Texture field21087;
   private LoginScreen field21088;
   private AccountSignUpScreen field21089;
   private AlertPanel field21090;
   private UIButton field21091;
   private boolean field21092 = false;
   private Animation field21093 = new Animation(250, 250, Direction.BACKWARDS);

   public LoginAndOutScreen() {
      super("Credits");
      this.method13300(false);
      this.field21087 = ResourcesDecrypter.createScaledAndProcessedTexture2("com/mentalfrostbyte/gui/resources/background/panorama5.png", 0.075F, 8);
      this.addToList(
         this.field21088 = new LoginScreen(
            this,
            "login",
            (this.widthA - LoginScreen.heighty) / 2,
            (this.heightA - LoginScreen.widthy) / 2,
            LoginScreen.heighty,
            LoginScreen.widthy
         )
      );
      this.addToList(
         this.field21089 = new AccountSignUpScreen(
            this,
            "register",
            (this.widthA - AccountSignUpScreen.height) / 2,
            (this.heightA - AccountSignUpScreen.widthy) / 2,
            AccountSignUpScreen.height,
            AccountSignUpScreen.widthy
         )
      );
      this.method13423();
      this.addToList(
         this.field21091 = new UIButton(
            this,
            "continue",
            this.widthA / 2 - 120,
            this.heightA / 2 + 120,
            240,
            60,
            new ColorHelper(MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.5F)),
            "Continue",
            ResourceRegistry.JelloLightFont25
         )
      );
      this.field21091.setEnabled(false);
      this.field21088.method13036(var1 -> {
         this.field21092 = true;
         this.field21091.setEnabled(true);
      });
      this.field21091.doThis((var0, var1) -> Minecraft.getInstance().displayGuiScreen(new VanillaMainMenuScreen()));
   }

   public void method13422() {
      this.field21088.setEnabled(false);
      this.field21089.setEnabled(true);
   }

   public void method13423() {
      this.field21088.setEnabled(true);
      this.field21089.setEnabled(false);
   }

   public void method13424(String var1, String var2) {
      if (this.field21090 == null) {
         this.method13222(() -> {
            ArrayList<MiniAlert> var5 = new ArrayList();
            var5.add(new MiniAlert(AlertType.HEADER, var1, 45));
            String[] var6 = MultiUtilities.method17745(var2, 240, ResourceRegistry.JelloLightFont20);

            for (int var7 = 0; var7 < var6.length; var7++) {
               var5.add(new MiniAlert(AlertType.FIRSTLINE, var6[var7], var7 != var6.length - 1 ? 14 : 35));
            }

            var5.add(new MiniAlert(AlertType.BUTTON, "Ok", 55));
            this.method13233(this.field21090 = new AlertPanel(this, "modal", true, "", var5.toArray(new MiniAlert[0])));
            this.field21090.method13604(var1xx -> new Thread(() -> this.method13222(() -> {
               this.method13236(this.field21090);
               this.field21090 = null;
            })).start());
            this.field21090.method13603(true);
         });
      }
   }

   @Override
   public void draw(float var1) {
      ResourcesDecrypter.cancelIconPNG.bind();
      this.field21085 = Math.max(0.0F, Math.min(this.field21085 + 0.075F, 1.0F));
      if (this.field21092) {
         this.field21093.changeDirection(Direction.FORWARDS);
      }

      this.method13425();
      float var4 = (float)Math.sin((double) QuadraticEasing.easeOutQuad(this.field21085, 0.0F, 1.0F, 1.0F) * Math.PI / 2.0);
      if (this.field21092) {
         var4 = 1.0F
            - (float)Math.sin((Math.PI / 2) + (double) QuadraticEasing.easeInOutQuad(1.0F - this.field21093.calcPercent(), 0.0F, 1.0F, 1.0F) * (Math.PI / 2)) * 0.2F;
      }

      this.field21088.method13277(var4);
      this.field21088.method13278(var4);
      this.field21089.method13277(var4);
      this.field21089.method13278(var4);
      Rectangle var5 = RenderUtil.method11413(RenderUtil.method11414(this.field21088), this.field21088.method13273(), this.field21088.method13275());
      if (this.field21089.method13287()) {
         var5 = RenderUtil.method11413(RenderUtil.method11414(this.field21089), this.field21089.method13273(), this.field21089.method13275());
      }

      if ((double)var4 > 0.1) {
         RenderUtil.method11465(
            (int)((double)this.widthA - var5.getWidth()) / 2,
            (int)((double)this.heightA - var5.getHeight()) / 2,
            (int)var5.getWidth(),
            (int)var5.getHeight(),
            MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, 1.0F - this.field21093.calcPercent())
         );
      }

      if (this.field21092 && this.field21093.calcPercent() == 1.0F) {
         this.field21088.setEnabled(false);
      }

      if (this.field21092) {
         String username = Client.getInstance().getNetworkManager().account.username;
         String welcomeBackSign = "Welcome back";
         byte var8 = 100;
         byte var9 = 10;
         int var10 = var8 + Math.max(ResourceRegistry.JelloMediumFont40.getStringWidth(welcomeBackSign), ResourceRegistry.JelloLightFont36.getStringWidth(username)) + var9 * 10;
         int var11 = (this.widthA - var10) / 2;
         int var12 = (this.heightA - var8 * 2) / 2;
         RenderUtil.drawRect(
            0.0F,
            0.0F,
            (float)this.widthA,
            (float)this.heightA,
            MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor, 0.45F * this.field21093.calcPercent())
         );
         RenderUtil.drawImage(
            (float)(var11 + 20), (float)(var12 + 40), (float)(var8 + 30), (float)(var8 + 30), ResourcesDecrypter.sigmaPNG, this.field21093.calcPercent()
         );
         int var13 = 165;
         int var14 = 54;
         RenderUtil.drawString(ResourceRegistry.JelloMediumFont40, (float)(var11 + var13), (float)(var12 + var14), welcomeBackSign, ClientColors.LIGHT_GREYISH_BLUE.getColor);
         RenderUtil.drawString(ResourceRegistry.JelloLightFont36, (float)(var11 + var13), (float)(var12 + var14 + 45), username, ClientColors.LIGHT_GREYISH_BLUE.getColor);
      }

      GL11.glPushMatrix();
      this.field21091.draw(this.field21093.calcPercent());
      GL11.glPopMatrix();
      super.draw(1.0F - this.field21093.calcPercent());
   }

   private void method13425() {
      this.field21086 = Math.max(0.0F, Math.min(this.field21086 + 0.01F, 1.0F));
      int var3 = this.getHeightO() * -1;
      float var4 = (float)this.getWidthO() / (float)this.getWidthA() * -114.0F;
      if (this.field21084) {
         this.field21082 = (int)var4;
         this.field21083 = var3;
         this.field21084 = false;
      }

      float var5 = var4 - (float)this.field21082;
      float var6 = (float)(var3 - this.field21083);
      float var7 = (float)Math.sin((double) QuadraticEasing.easeOutQuad(this.field21086, 0.0F, 1.0F, 1.0F) * Math.PI / 2.0);
      GL11.glPushMatrix();
      GL11.glTranslatef((float)this.widthA / 2.0F, (float)this.widthA / 2.0F, 0.0F);
      GL11.glScalef(1.0F + var7 * 0.2F, 1.0F + var7 * 0.2F, 0.0F);
      GL11.glTranslatef((float)(-this.widthA) / 2.0F, (float)(-this.widthA) / 2.0F, 0.0F);
      RenderUtil.method11448(
         (float)this.field21083,
         (float)this.field21082,
         (float)(this.getWidthA() * 2),
         (float)(this.getHeightA() + 114),
         this.field21087,
         MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, this.field21085)
      );
      GL11.glPopMatrix();
      float var8 = 0.5F;
      if (var4 != (float)this.field21082) {
         this.field21082 = (int)((float)this.field21082 + var5 * var8);
      }

      if (var3 != this.field21083) {
         this.field21083 = (int)((float)this.field21083 + var6 * var8);
      }
   }

   @Override
   public void keyPressed(int var1) {
      super.keyPressed(var1);
      if (var1 == 256) {
         Minecraft.getInstance().displayGuiScreen(new VanillaMainMenuScreen());
      }
   }
}
