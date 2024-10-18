package com.mentalfrostbyte.jello.gui.screens;

import club.minnced.discord.rpc.DiscordRPC;
import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.gui.GuiManager;
import com.mentalfrostbyte.jello.gui.Screen;
import com.mentalfrostbyte.jello.network.NetworkManager;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.CustomGuiScreen;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.render.animation.Animation;
import com.mentalfrostbyte.jello.util.render.animation.Direction;
import com.mentalfrostbyte.jello.util.render.animation.MathHelper;
import lol.ClientColors;
import lol.Texture;
import mapped.*;
import net.minecraft.client.Minecraft;
import org.apache.commons.lang3.ArrayUtils;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Locale.Category;
import java.util.Random;

public class JelloMainMenuScreen extends Screen {
   public static long field20965 = 0L;
   private int field20966 = 0;
   private int field20967 = 0;
   private boolean field20968 = true;
   public MainmenuScreen2 field20969;
   public ChangelogScreen field20970;
   public RedeemKeyScreen field20971;
   public Animation field20972 = new Animation(200, 200, Direction.BACKWARDS);
   public Animation field20973 = new Animation(200, 200, Direction.BACKWARDS);
   private Animation field20974 = new Animation(325, 325);
   private Animation field20975 = new Animation(800, 800);
   private static Texture field20976;
   public List<Class4306> field20977 = new ArrayList<Class4306>();
   public static String[] field20978 = new String[]{
      "Goodbye.",
      "See you soon.",
      "Bye!",
      "Au revoir",
      "See you!",
      "Ciao!",
      "Adios",
      "Farewell",
      "See you later!",
      "Have a good day!",
      "See you arround.",
      "See you tomorrow!",
      "Goodbye, friend.",
      "Logging out.",
      "Signing off!",
      "Shutting down.",
      "Was good to see you!"
   };
   public static String[] field20979 = new String[]{
      "The two hardest things to say in life are hello for the first time and goodbye for the last.",
      "Don’t cry because it’s over, smile because it happened.",
      "It’s time to say goodbye, but I think goodbyes are sad and I’d much rather say hello. Hello to a new adventure.",
      "We’ll meet again, Don’t know where, don’t know when, But I know we’ll meet again, some sunny day.",
      "This is not a goodbye but a 'see you soon'.",
      "You are my hardest goodbye.",
      "Goodbyes are not forever, are not the end; it simply means I’ll miss you until we meet again.",
      "Good friends never say goodbye. They simply say \"See you soon\".",
      "Every goodbye always makes the next hello closer.",
      "Where's the good in goodbye?",
      "And I'm sorry, so sorry. But, I have to say goodbye."
   };
   public static String field20980;
   public static String field20981;
   public static float field20982;
   public AlertPanel field20983;
   public AlertPanel alertPanel;

   public JelloMainMenuScreen() {
      super("Main Screen");
      this.method13300(false);
      field20965 = System.nanoTime();
      if (field20976 == null) {
         field20976 = ResourcesDecrypter.createScaledAndProcessedTexture2("com/mentalfrostbyte/gui/resources/background/panorama5.png", 0.075F, 8);
      }

      this.field20974.changeDirection(Direction.BACKWARDS);
      this.field20975.changeDirection(Direction.BACKWARDS);
      int var3 = Minecraft.getInstance().mainWindow.getWidth() * Minecraft.getInstance().mainWindow.getHeight() / 14000;
      Random var4 = new Random();

      for (int var5 = 0; var5 < var3; var5++) {
         int var6 = var4.nextInt(Minecraft.getInstance().mainWindow.getWidth());
         int var7 = var4.nextInt(Minecraft.getInstance().mainWindow.getHeight());
         int var8 = 7 + var4.nextInt(5);
         int var9 = (1 + var4.nextInt(4)) * (!var4.nextBoolean() ? 1 : -1);
         int var10 = 1 + var4.nextInt(2);
         this.field20977.add(new Class4306(this, Integer.toString(var5), var6, var7, var8, var9, var10));
      }

      this.addToList(this.field20969 = new MainmenuScreen2(this, "main", 0, 0, this.widthA, this.heightA));
      this.addToList(this.field20970 = new ChangelogScreen(this, "changelog", 0, 0, this.widthA, this.heightA));
      this.addToList(this.field20971 = new RedeemKeyScreen(this, "redeem", 0, 0, this.widthA, this.heightA));
      this.field20970.method13296(false);
      this.field20970.method13294(true);
      this.field20971.method13296(false);
      this.field20971.method13294(true);
   }

   public void method13340() {
      this.field20972.changeDirection(Direction.BACKWARDS);
      this.field20970.method13296(false);
      this.field20971.method13296(false);
      this.field20971.method13292(false);
      this.field20971.method13294(true);
   }

   public void method13341() {
      this.field20972.changeDirection(Direction.FORWARDS);
      this.field20973.changeDirection(Direction.FORWARDS);
   }

   public void animateIn() {
      this.field20972.changeDirection(Direction.FORWARDS);
      this.field20970.method13296(true);
   }

   public void method13343() {
      this.field20972.changeDirection(Direction.FORWARDS);
      this.field20971.method13296(true);
      this.field20971.method13292(true);
      this.field20971.method13294(false);
   }

   @Override
   public void method13028(int var1, int var2) {
      for (CustomGuiScreen var6 : this.field20977) {
         var6.method13028(var1, var2);
      }

      super.method13028(var1, var2);
   }

   @Override
   public void draw(float var1) {
      float var4 = MathHelper.calculateTransition(this.field20972.calcPercent(), 0.0F, 1.0F, 1.0F);
      if (this.field20972.getDirection() == Direction.BACKWARDS) {
         var4 = MathHelper.calculateBackwardTransition(this.field20972.calcPercent(), 0.0F, 1.0F, 1.0F);
      }

      float var5 = 0.07F * var4;
      this.field20969.method13279(1.0F - var5, 1.0F - var5);
      this.field20969.method13296(this.field20972.calcPercent() == 0.0F);
      long var6 = System.nanoTime() - field20965;
      field20982 = Math.min(10.0F, Math.max(0.0F, (float)var6 / 1.810361E7F / 2.0F));
      field20965 = System.nanoTime();
      int var8 = -this.getHeightO();
      float var9 = (float)this.getWidthO() / (float)this.getWidthA() * -114.0F;
      if (this.field20968) {
         this.field20966 = (int)var9;
         this.field20967 = var8;
         this.field20968 = false;
      }

      float var10 = var9 - (float)this.field20966;
      float var11 = (float)(var8 - this.field20967);
      if (Minecraft.getInstance().loadingGui != null) {
         if (var9 != (float)this.field20966) {
            this.field20966 = (int)((float)this.field20966 + var10 * field20982);
         }

         if (var8 != this.field20967) {
            this.field20967 = (int)((float)this.field20967 + var11 * field20982);
         }
      } else {
         this.field20974.changeDirection(Direction.FORWARDS);
         this.field20975.changeDirection(Direction.FORWARDS);
         float var12 = 0.5F - (float)this.field20967 / (float) Minecraft.getInstance().mainWindow.getWidth() * -1.0F;
         float var13 = 1.0F - this.field20974.calcPercent();
         float var14 = 1.0F - this.field20975.calcPercent();
         float var15 = var14 * var14;
         if (!Client.getInstance().method19930()) {
            var15 = 0.0F;
         }

         float var16 = (float)this.getWidthA() / 1920.0F;
         int var17 = (int)(600.0F * var16);
         int var18 = (int)(450.0F * var16);
         byte var19 = 0;
         RenderUtil.method11455(
            (float)this.field20967 - (float)var17 * var12,
            (float)this.field20966,
            (float)(this.getWidthA() * 2 + var17),
            (float)(this.getHeightA() + 114),
            ResourcesDecrypter.backgroundPNG
         );
         RenderUtil.method11455(
            (float)this.field20967 - (float)var18 * var12,
            (float)this.field20966,
            (float)(this.getWidthA() * 2 + var18),
            (float)(this.getHeightA() + 114),
            ResourcesDecrypter.middlePNG
         );

         for (CustomGuiScreen var21 : this.field20977) {
            GL11.glPushMatrix();
            var21.draw(var1);
            GL11.glPopMatrix();
         }

         RenderUtil.method11455(
            (float)this.field20967 - (float)var19 * var12,
            (float)this.field20966,
            (float)(this.getWidthA() * 2 + var19),
            (float)(this.getHeightA() + 114),
            ResourcesDecrypter.foregroundPNG
         );
         Texture var26 = ResourcesDecrypter.logoLargePNG;
         int var28 = var26.getImageWidth();
         int var22 = var26.getImageHeight();
         if (GuiManager.portalScaleFactor > 1.0F) {
            var26 = ResourcesDecrypter.logoLarge2xPNG;
         }

         RenderUtil.method11450(
            (float)this.field20967,
            (float)(this.field20966 - 50),
            (float)(this.getWidthA() * 2),
            (float)(this.getHeightA() + 200),
            field20976,
            MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, var4),
            false
         );
         RenderUtil.renderBackgroundBox(
            0.0F, 0.0F, (float)this.getWidthA(), (float)this.getHeightA(), MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor, var4 * 0.3F)
         );

         for (CustomGuiScreen var24 : this.method13241()) {
            if (var24.method13287()) {
               GL11.glPushMatrix();
               if (var24 instanceof ChangelogScreen) {
                  if (var4 > 0.0F) {
                     var24.draw(var1);
                  }
               } else {
                  var24.draw(var1 * (1.0F - var4));
               }

               GL11.glPopMatrix();
            }
         }

         if (var14 > 0.0F && Client.getInstance().method19930()) {
            CustomResourceLoadProgressGui.method6015(var13, 1.0F);
            Client.getInstance().method19931(false);
         }

         field20982 *= 0.7F;
         field20982 = Math.min(field20982, 1.0F);
         if (!this.field20968 && (var14 == 0.0F || this.field20966 != 0 || this.field20967 != 0)) {
            if (var9 != (float)this.field20966) {
               this.field20966 = (int)((float)this.field20966 + var10 * field20982);
            }

            if (var8 != this.field20967) {
               this.field20967 = (int)((float)this.field20967 + var11 * field20982);
            }
         }

         if (this.field20973.getDirection() == Direction.FORWARDS) {
            RenderUtil.method11440(
               ResourceRegistry.JelloMediumFont50,
               (float)(this.widthA / 2),
               (float)(this.heightA / 2 - 30),
               field20980,
               MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, this.field20973.calcPercent()),
               Class2218.field14492,
               Class2218.field14492
            );
            RenderUtil.method11440(
               ResourceRegistry.JelloLightFont18,
               (float)(this.widthA / 2),
               (float)(this.heightA / 2 + 30),
               "\"" + field20981 + "\"",
               MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, this.field20973.calcPercent() * 0.5F),
               Class2218.field14492,
               Class2218.field14492
            );
         }
      }
   }

   @Override
   public void keyPressed(int var1) {
      super.keyPressed(var1);
      if (var1 == 256) {
         this.method13340();
      }
   }

   public void warnAgora() {
      if (this.field20983 == null) {
         this.method13222(() -> {
            List<MiniAlert> var3 = new ArrayList<>();
            var3.add(new MiniAlert(AlertType.HEADER, "Agora", 45));
            var3.add(new MiniAlert(AlertType.FIRSTLINE, "Agora is not yet available...", 35));
            var3.add(new MiniAlert(AlertType.BUTTON, "Ok", 55));
            this.method13233(this.field20983 = new AlertPanel(this, "music", true, "Dependencies.", var3.toArray(new MiniAlert[0])));
            this.field20983.method13604(var1 -> new Thread(() -> {
                this.method13222(() -> {
                   this.method13236(this.field20983);
                   this.field20983 = null;
                });
            }).start());
            this.field20983.method13603(true);
         });
      }
   }

   public void logout() {
      if (this.alertPanel == null) {
         this.method13222(() -> {
            ArrayList<MiniAlert> alert = new ArrayList<>();
            alert.add(new MiniAlert(AlertType.HEADER, "Logout", 45));
            alert.add(new MiniAlert(AlertType.FIRSTLINE, "Are you sure?", 35));
            alert.add(new MiniAlert(AlertType.BUTTON, "Yes", 55));
            this.method13233(this.alertPanel = new AlertPanel(this, "music", true, "Dependencies.", alert.toArray(new MiniAlert[0])));
            this.alertPanel.method13604(var1 -> new Thread(() -> {
                this.method13222(() -> {
                   this.method13236(this.alertPanel);
                   this.alertPanel = null;

                   NetworkManager.premium = false;
                   Client.getInstance().getDRPC().smallImageKey = null;
                   Client.getInstance().getDRPC().smallImageText = null;
                   DiscordRPC.INSTANCE.Discord_UpdatePresence(Client.getInstance().getDRPC());
                });
            }).start());
            this.alertPanel.method13603(true);
         });
      }
   }

   static {
      Locale var4 = Locale.getDefault(Category.DISPLAY);
      if (var4 == Locale.FRANCE || var4 == Locale.FRENCH) {
         field20979 = (String[])ArrayUtils.addAll(
            field20979, new String[]{"Mon salut jamais dans la fuite, avant d'm'éteindre, faut m'débrancher", "Prêt à partir pour mon honneur"}
         );
      }

      field20980 = field20978[new Random().nextInt(field20978.length)];
      field20981 = field20979[new Random().nextInt(field20979.length)];
   }
}
