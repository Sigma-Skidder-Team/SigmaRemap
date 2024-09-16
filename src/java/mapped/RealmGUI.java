package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.realmsclient.client.RealmsClient;
import com.mojang.realmsclient.dto.RealmsServer;
import com.mojang.realmsclient.exception.RealmsServiceException;
import net.minecraft.client.gui.AbstractGui;
import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.realms.RealmsLabel;
import net.minecraft.realms.RealmsScreen;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RealmGUI extends RealmsScreen {
   private static final Logger field4517 = LogManager.getLogger();
   private static final ResourceLocation field4518 = new ResourceLocation("realms", "textures/gui/realms/op_icon.png");
   private static final ResourceLocation field4519 = new ResourceLocation("realms", "textures/gui/realms/user_icon.png");
   private static final ResourceLocation field4520 = new ResourceLocation("realms", "textures/gui/realms/cross_player_icon.png");
   private static final ResourceLocation field4521 = new ResourceLocation("minecraft", "textures/gui/options_background.png");
   private static final ITextComponent field4522 = new TranslationTextComponent("mco.configure.world.invites.normal.tooltip");
   private static final ITextComponent field4523 = new TranslationTextComponent("mco.configure.world.invites.ops.tooltip");
   private static final ITextComponent field4524 = new TranslationTextComponent("mco.configure.world.invites.remove.tooltip");
   private static final ITextComponent field4525 = new TranslationTextComponent("mco.configure.world.invited");
   private ITextComponent field4526;
   private final Class815 field4527;
   private final RealmsServer field4528;
   private Class1290 field4529;
   private int field4530;
   private int field4531;
   private int field4532;
   private Button field4533;
   private Button field4534;
   private int field4535 = -1;
   private String field4536;
   private int field4537 = -1;
   private boolean field4538;
   private RealmsLabel field4539;
   private Class2162 field4540 = Class2162.field14182;

   public RealmGUI(Class815 var1, RealmsServer var2) {
      this.field4527 = var1;
      this.field4528 = var2;
   }

   @Override
   public void init() {
      this.field4530 = this.width / 2 - 160;
      this.field4531 = 150;
      this.field4532 = this.width / 2 + 12;
      this.mc.keyboardListener.enableRepeatEvents(true);
      this.field4529 = new Class1290(this);
      this.field4529.method6035(this.field4530);
      this.<Class1290>addListener(this.field4529);

      for (Class6114 var4 : this.field4528.field27450) {
         this.field4529.method6116(var4);
      }

      this.<Button>addButton(
         new Button(
            this.field4532,
            method1929(1),
            this.field4531 + 10,
            20,
            new TranslationTextComponent("mco.configure.world.buttons.invite"),
            var1 -> this.mc.displayGuiScreen(new Class805(this.field4527, this, this.field4528))
         )
      );
      this.field4533 = this.<Button>addButton(
         new Button(
            this.field4532,
            method1929(7),
            this.field4531 + 10,
            20,
            new TranslationTextComponent("mco.configure.world.invites.remove.tooltip"),
            var1 -> this.method2414(this.field4537)
         )
      );
      this.field4534 = this.<Button>addButton(
         new Button(
            this.field4532, method1929(9), this.field4531 + 10, 20, new TranslationTextComponent("mco.configure.world.invites.ops.tooltip"), var1 -> {
               if (!this.field4528.field27450.get(this.field4537).method18879()) {
                  this.method2411(this.field4537);
               } else {
                  this.method2412(this.field4537);
               }
            }
         )
      );
      this.<Button>addButton(
         new Button(
            this.field4532 + this.field4531 / 2 + 2, method1929(12), this.field4531 / 2 + 10 - 2, 20, DialogTexts.field30663, var1 -> this.method2410()
         )
      );
      this.field4539 = this.<RealmsLabel>addListener(
         new RealmsLabel(new TranslationTextComponent("mco.configure.world.players.title"), this.width / 2, 17, 16777215)
      );
      this.func_231411_u_();
      this.method2408();
   }

   private void method2408() {
      this.field4533.field6483 = this.method2409(this.field4537);
      this.field4534.field6483 = this.method2409(this.field4537);
   }

   private boolean method2409(int var1) {
      return var1 != -1;
   }

   @Override
   public void onClose() {
      this.mc.keyboardListener.enableRepeatEvents(false);
   }

   @Override
   public boolean keyPressed(int var1, int var2, int var3) {
      if (var1 != 256) {
         return super.keyPressed(var1, var2, var3);
      } else {
         this.method2410();
         return true;
      }
   }

   private void method2410() {
      if (!this.field4538) {
         this.mc.displayGuiScreen(this.field4527);
      } else {
         this.mc.displayGuiScreen(this.field4527.method2298());
      }
   }

   private void method2411(int var1) {
      this.method2408();
      RealmsClient var4 = RealmsClient.method14543();
      String var5 = this.field4528.field27450.get(var1).method18877();

      try {
         this.method2413(var4.method14565(this.field4528.field27443, var5));
      } catch (RealmsServiceException var7) {
         field4517.error("Couldn't op the user");
      }
   }

   private void method2412(int var1) {
      this.method2408();
      RealmsClient var4 = RealmsClient.method14543();
      String var5 = this.field4528.field27450.get(var1).method18877();

      try {
         this.method2413(var4.method14566(this.field4528.field27443, var5));
      } catch (RealmsServiceException var7) {
         field4517.error("Couldn't deop the user");
      }
   }

   private void method2413(Class6123 var1) {
      for (Class6114 var5 : this.field4528.field27450) {
         var5.method18880(var1.field27416.contains(var5.method18875()));
      }
   }

   private void method2414(int var1) {
      this.method2408();
      if (var1 >= 0 && var1 < this.field4528.field27450.size()) {
         Class6114 var4 = this.field4528.field27450.get(var1);
         this.field4536 = var4.method18877();
         this.field4535 = var1;
         Class802 var5 = new Class802(
            var1x -> {
               if (var1x) {
                  RealmsClient var4x = RealmsClient.method14543();

                  try {
                     var4x.method14555(this.field4528.field27443, this.field4536);
                  } catch (RealmsServiceException var6) {
                     field4517.error("Couldn't uninvite user");
                  }

                  this.method2415(this.field4535);
                  this.field4537 = -1;
                  this.method2408();
               }

               this.field4538 = true;
               this.mc.displayGuiScreen(this);
            },
            new StringTextComponent("Question"),
            new TranslationTextComponent("mco.configure.world.uninvite.question").appendString(" '").appendString(var4.method18875()).appendString("' ?")
         );
         this.mc.displayGuiScreen(var5);
      }
   }

   private void method2415(int var1) {
      this.field4528.field27450.remove(var1);
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.field4526 = null;
      this.field4540 = Class2162.field14182;
      this.renderBackground(var1);
      if (this.field4529 != null) {
         this.field4529.render(var1, var2, var3, var4);
      }

      int var7 = method1929(12) + 20;
      Tessellator var8 = Tessellator.getInstance();
      BufferBuilder var9 = var8.getBuffer();
      this.mc.getTextureManager().bindTexture(field4521);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      float var10 = 32.0F;
      var9.begin(7, DefaultVertexFormats.field43346);
      var9.pos(0.0, (double)this.height, 0.0)
         .tex(0.0F, (float)(this.height - var7) / 32.0F + 0.0F)
         .color(64, 64, 64, 255)
         .endVertex();
      var9.pos((double)this.width, (double)this.height, 0.0)
         .tex((float)this.width / 32.0F, (float)(this.height - var7) / 32.0F + 0.0F)
         .color(64, 64, 64, 255)
         .endVertex();
      var9.pos((double)this.width, (double)var7, 0.0).tex((float)this.width / 32.0F, 0.0F).color(64, 64, 64, 255).endVertex();
      var9.pos(0.0, (double)var7, 0.0).tex(0.0F, 0.0F).color(64, 64, 64, 255).endVertex();
      var8.draw();
      this.field4539.func_239560_a_(this, var1);
      if (this.field4528 != null && this.field4528.field27450 != null) {
         this.fontRenderer
            .func_243248_b(
               var1,
               new StringTextComponent("")
                  .append(field4525)
                  .appendString(" (")
                  .appendString(Integer.toString(this.field4528.field27450.size()))
                  .appendString(")"),
               (float)this.field4530,
               (float)method1929(0),
               10526880
            );
      } else {
         this.fontRenderer.func_243248_b(var1, field4525, (float)this.field4530, (float)method1929(0), 10526880);
      }

      super.render(var1, var2, var3, var4);
      if (this.field4528 != null) {
         this.method2416(var1, this.field4526, var2, var3);
      }
   }

   public void method2416(MatrixStack var1, ITextComponent var2, int var3, int var4) {
      if (var2 != null) {
         int var7 = var3 + 12;
         int var8 = var4 - 12;
         int var9 = this.fontRenderer.method38821(var2);
         this.method5688(var1, var7 - 3, var8 - 3, var7 + var9 + 3, var8 + 8 + 3, -1073741824, -1073741824);
         this.fontRenderer.method38803(var1, var2, (float)var7, (float)var8, 16777215);
      }
   }

   private void method2417(MatrixStack var1, int var2, int var3, int var4, int var5) {
      boolean var8 = var4 >= var2 && var4 <= var2 + 9 && var5 >= var3 && var5 <= var3 + 9 && var5 < method1929(12) + 20 && var5 > method1929(1);
      this.mc.getTextureManager().bindTexture(field4520);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      float var9 = !var8 ? 0.0F : 7.0F;
      AbstractGui.method5699(var1, var2, var3, 0.0F, var9, 8, 7, 8, 14);
      if (var8) {
         this.field4526 = field4524;
         this.field4540 = Class2162.field14181;
      }
   }

   private void method2418(MatrixStack var1, int var2, int var3, int var4, int var5) {
      boolean var8 = var4 >= var2 && var4 <= var2 + 9 && var5 >= var3 && var5 <= var3 + 9 && var5 < method1929(12) + 20 && var5 > method1929(1);
      this.mc.getTextureManager().bindTexture(field4518);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      float var9 = !var8 ? 0.0F : 8.0F;
      AbstractGui.method5699(var1, var2, var3, 0.0F, var9, 8, 8, 8, 16);
      if (var8) {
         this.field4526 = field4523;
         this.field4540 = Class2162.field14180;
      }
   }

   private void method2419(MatrixStack var1, int var2, int var3, int var4, int var5) {
      boolean var8 = var4 >= var2 && var4 <= var2 + 9 && var5 >= var3 && var5 <= var3 + 9 && var5 < method1929(12) + 20 && var5 > method1929(1);
      this.mc.getTextureManager().bindTexture(field4519);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      float var9 = !var8 ? 0.0F : 8.0F;
      AbstractGui.method5699(var1, var2, var3, 0.0F, var9, 8, 8, 8, 16);
      if (var8) {
         this.field4526 = field4522;
         this.field4540 = Class2162.field14180;
      }
   }

   // $VF: synthetic method
   public static int method2425(RealmGUI var0) {
      return var0.field4530;
   }

   // $VF: synthetic method
   public static FontRenderer method2426(RealmGUI var0) {
      return var0.fontRenderer;
   }

   // $VF: synthetic method
   public static int method2427(RealmGUI var0) {
      return var0.field4531;
   }

   // $VF: synthetic method
   public static void method2428(RealmGUI var0, MatrixStack var1, int var2, int var3, int var4, int var5) {
      var0.method2418(var1, var2, var3, var4, var5);
   }

   // $VF: synthetic method
   public static void method2429(RealmGUI var0, MatrixStack var1, int var2, int var3, int var4, int var5) {
      var0.method2419(var1, var2, var3, var4, var5);
   }

   // $VF: synthetic method
   public static void method2430(RealmGUI var0, MatrixStack var1, int var2, int var3, int var4, int var5) {
      var0.method2417(var1, var2, var3, var4, var5);
   }

   // $VF: synthetic method
   public static int method2431(int var0) {
      return method1929(var0);
   }

   // $VF: synthetic method
   public static int method2432(int var0) {
      return method1929(var0);
   }

   // $VF: synthetic method
   public static int method2433(int var0) {
      return method1929(var0);
   }

   // $VF: synthetic method
   public static RealmsServer method2434(RealmGUI var0) {
      return var0.field4528;
   }

   // $VF: synthetic method
   public static Class2162 method2435(RealmGUI var0) {
      return var0.field4540;
   }

   // $VF: synthetic method
   public static void method2436(RealmGUI var0, int var1) {
      var0.method2412(var1);
   }

   // $VF: synthetic method
   public static void method2437(RealmGUI var0, int var1) {
      var0.method2411(var1);
   }

   // $VF: synthetic method
   public static void method2438(RealmGUI var0, int var1) {
      var0.method2414(var1);
   }

   // $VF: synthetic method
   public static int method2439(RealmGUI var0, int var1) {
      return var0.field4537 = var1;
   }

   // $VF: synthetic method
   public static void method2440(RealmGUI var0) {
      var0.method2408();
   }
}
