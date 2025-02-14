package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.realmsclient.RealmsMainScreen;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.realms.RealmsLabel;
import net.minecraft.realms.RealmsScreen;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RealmsScreenReal extends RealmsScreen {
   private static final Logger LOGGER = LogManager.getLogger();
   private static final ResourceLocation ACCEPT_ICON = new ResourceLocation("realms", "textures/gui/realms/accept_icon.png");
   private static final ResourceLocation REJECT_ICON = new ResourceLocation("realms", "textures/gui/realms/reject_icon.png");
   private static final ITextComponent NO_PENDING_INVITES = new TranslationTextComponent("mco.invites.nopending");
   private static final ITextComponent ACCEPT_INVITE =  new TranslationTextComponent("mco.invites.button.accept");
   private static final ITextComponent REJECT_INVITE = new TranslationTextComponent("mco.invites.button.reject");
   private final Screen screen;
   private ITextComponent textComponent;
   private boolean field4511;
   private Class1292 class1292;
   private RealmsLabel label;
   private int field4514 = -1;
   private Button acceptInviteButton;
   private Button rejectInviteButton;

   public RealmsScreenReal(Screen var1) {
      this.screen = var1;
   }

   @Override
   public void init() {
      this.mc.keyboardListener.enableRepeatEvents(true);
      this.class1292 = new Class1292(this);
      new Class376(this, "Realms-pending-invitations-fetcher").start();
      this.<Class1292>addListener(this.class1292);
      this.acceptInviteButton = this.<Button>addButton(
         new Button(this.width / 2 - 174, this.height - 32, 100, 20, new TranslationTextComponent("mco.invites.button.accept"), var1 -> {
            this.method2380(this.field4514);
            this.field4514 = -1;
            this.method2382();
         })
      );
      this.<Button>addButton(
         new Button(
            this.width / 2 - 50, this.height - 32, 100, 20, DialogTexts.DONE, var1 -> this.mc.displayGuiScreen(new RealmsMainScreen(this.screen))
         )
      );
      this.rejectInviteButton = this.<Button>addButton(
         new Button(this.width / 2 + 74, this.height - 32, 100, 20, new TranslationTextComponent("mco.invites.button.reject"), btn -> {
            this.method2379(this.field4514);
            this.field4514 = -1;
            this.method2382();
         })
      );
      this.label = new RealmsLabel(new TranslationTextComponent("mco.invites.title"), this.width / 2, 12, 16777215);
      this.<RealmsLabel>addListener(this.label);
      this.func_231411_u_();
      this.method2382();
   }

   @Override
   public boolean keyPressed(int var1, int var2, int var3) {
      if (var1 != 256) {
         return super.keyPressed(var1, var2, var3);
      } else {
         this.mc.displayGuiScreen(new RealmsMainScreen(this.screen));
         return true;
      }
   }

   private void method2378(int var1) {
      this.class1292.method6123(var1);
   }

   private void method2379(int var1) {
      if (var1 < this.class1292.method6031()) {
         new Class389(this, "Realms-reject-invitation", var1).start();
      }
   }

   private void method2380(int var1) {
      if (var1 < this.class1292.method6031()) {
         new Class382(this, "Realms-accept-invitation", var1).start();
      }
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.textComponent = null;
      this.renderBackground(var1);
      this.class1292.render(var1, var2, var3, var4);
      this.label.func_239560_a_(this, var1);
      if (this.textComponent != null) {
         this.method2381(var1, this.textComponent, var2, var3);
      }

      if (this.class1292.method6031() == 0 && this.field4511) {
         drawCenteredString(var1, this.font, NO_PENDING_INVITES, this.width / 2, this.height / 2 - 20, 16777215);
      }

      super.render(var1, var2, var3, var4);
   }

   public void method2381(MatrixStack var1, ITextComponent var2, int var3, int var4) {
      if (var2 != null) {
         int var7 = var3 + 12;
         int var8 = var4 - 12;
         int var9 = this.font.method38821(var2);
         this.method5688(var1, var7 - 3, var8 - 3, var7 + var9 + 3, var8 + 8 + 3, -1073741824, -1073741824);
         this.font.method38803(var1, var2, (float)var7, (float)var8, 16777215);
      }
   }

   private void method2382() {
      this.acceptInviteButton.visible = this.method2383(this.field4514);
      this.rejectInviteButton.visible = this.method2383(this.field4514);
   }

   private boolean method2383(int var1) {
      return var1 != -1;
   }

   // $VF: synthetic method
   public static Minecraft method2387(RealmsScreenReal var0) {
      return var0.mc;
   }

   // $VF: synthetic method
   public static Logger method2388() {
      return LOGGER;
   }

   // $VF: synthetic method
   public static boolean method2389(RealmsScreenReal var0, boolean var1) {
      return var0.field4511 = var1;
   }

   // $VF: synthetic method
   public static Class1292 method2390(RealmsScreenReal var0) {
      return var0.class1292;
   }

   // $VF: synthetic method
   public static Minecraft method2391(RealmsScreenReal var0) {
      return var0.mc;
   }

   // $VF: synthetic method
   public static void method2392(RealmsScreenReal var0, int var1) {
      var0.method2378(var1);
   }

   // $VF: synthetic method
   public static Minecraft method2393(RealmsScreenReal var0) {
      return var0.mc;
   }

   // $VF: synthetic method
   public static FontRenderer method2394(RealmsScreenReal var0) {
      return var0.font;
   }

   // $VF: synthetic method
   public static FontRenderer method2395(RealmsScreenReal var0) {
      return var0.font;
   }

   // $VF: synthetic method
   public static FontRenderer method2396(RealmsScreenReal var0) {
      return var0.font;
   }

   // $VF: synthetic method
   public static ResourceLocation method2397() {
      return ACCEPT_ICON;
   }

   // $VF: synthetic method
   public static Minecraft method2398(RealmsScreenReal var0) {
      return var0.mc;
   }

   // $VF: synthetic method
   public static ITextComponent method2399(RealmsScreenReal var0, ITextComponent var1) {
      return var0.textComponent = var1;
   }

   // $VF: synthetic method
   public static ITextComponent method2400() {
      return ACCEPT_INVITE;
   }

   // $VF: synthetic method
   public static void method2401(RealmsScreenReal var0, int var1) {
      var0.method2380(var1);
   }

   // $VF: synthetic method
   public static ResourceLocation method2402() {
      return REJECT_ICON;
   }

   // $VF: synthetic method
   public static Minecraft method2403(RealmsScreenReal var0) {
      return var0.mc;
   }

   // $VF: synthetic method
   public static ITextComponent method2404() {
      return REJECT_INVITE;
   }

   // $VF: synthetic method
   public static void method2405(RealmsScreenReal var0, int var1) {
      var0.method2379(var1);
   }

   // $VF: synthetic method
   public static int method2406(RealmsScreenReal var0, int var1) {
      return var0.field4514 = var1;
   }

   // $VF: synthetic method
   public static void method2407(RealmsScreenReal var0) {
      var0.method2382();
   }
}
