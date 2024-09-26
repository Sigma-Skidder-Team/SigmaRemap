package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.util.Util;
import net.minecraft.network.play.client.CClientStatusPacket;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import javax.annotation.Nullable;

public class Class1305 extends Screen implements Class1306 {
   private static final ITextComponent field6899 = new TranslationTextComponent("multiplayer.downloadingStats");
   public final Screen field6900;
   private Class1280 field6901;
   private Class1282 field6902;
   private Class1277 field6903;
   private final Class8286 field6904;
   private Class1274<?> field6905;
   private boolean field6906 = true;

   public Class1305(Screen var1, Class8286 var2) {
      super(new TranslationTextComponent("gui.stats"));
      this.field6900 = var1;
      this.field6904 = var2;
   }

   @Override
   public void init() {
      this.field6906 = true;
      this.mc.getConnection().sendPacket(new CClientStatusPacket(CClientStatusPacket.State.field14278));
   }

   public void method6179() {
      this.field6901 = new Class1280(this, this.mc);
      this.field6902 = new Class1282(this, this.mc);
      this.field6903 = new Class1277(this, this.mc);
   }

   public void method6180() {
      this.<Button>addButton(
         new Button(
            this.width / 2 - 120, this.height - 52, 80, 20, new TranslationTextComponent("stat.generalButton"), var1 -> this.method6183(this.field6901)
         )
      );
      Button var3 = this.<Button>addButton(
         new Button(
            this.width / 2 - 40, this.height - 52, 80, 20, new TranslationTextComponent("stat.itemsButton"), var1 -> this.method6183(this.field6902)
         )
      );
      Button var4 = this.<Button>addButton(
         new Button(
            this.width / 2 + 40, this.height - 52, 80, 20, new TranslationTextComponent("stat.mobsButton"), var1 -> this.method6183(this.field6903)
         )
      );
      this.<Button>addButton(
         new Button(this.width / 2 - 100, this.height - 28, 200, 20, DialogTexts.field30658, var1 -> this.mc.displayGuiScreen(this.field6900))
      );
      if (this.field6902.getEventListeners().isEmpty()) {
         var3.active = false;
      }

      if (this.field6903.getEventListeners().isEmpty()) {
         var4.active = false;
      }
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      if (!this.field6906) {
         this.method6182().render(var1, var2, var3, var4);
         drawCenteredString(var1, this.fontRenderer, this.title, this.width / 2, 20, 16777215);
         super.render(var1, var2, var3, var4);
      } else {
         this.renderBackground(var1);
         drawCenteredString(var1, this.fontRenderer, field6899, this.width / 2, this.height / 2, 16777215);
         method5690(
            var1,
            this.fontRenderer,
            field6907[(int)(Util.milliTime() / 150L % (long)field6907.length)],
            this.width / 2,
            this.height / 2 + 18,
            16777215
         );
      }
   }

   @Override
   public void method6181() {
      if (this.field6906) {
         this.method6179();
         this.method6180();
         this.method6183(this.field6901);
         this.field6906 = false;
      }
   }

   @Override
   public boolean isPauseScreen() {
      return !this.field6906;
   }

   @Nullable
   public Class1274<?> method6182() {
      return this.field6905;
   }

   public void method6183(Class1274<?> var1) {
      this.children.remove(this.field6901);
      this.children.remove(this.field6902);
      this.children.remove(this.field6903);
      if (var1 != null) {
         this.children.add(0, var1);
         this.field6905 = var1;
      }
   }

   private static String method6184(Class9007<ResourceLocation> var0) {
      return "stat." + ((ResourceLocation)var0.method33276()).toString().replace(':', '.');
   }

   private int method6185(int var1) {
      return 115 + 40 * var1;
   }

   private void method6186(MatrixStack var1, int var2, int var3, Item var4) {
      this.method6187(var1, var2 + 1, var3 + 1, 0, 0);
      RenderSystem.enableRescaleNormal();
      this.field4563.method791(var4.method11742(), var2 + 2, var3 + 2);
      RenderSystem.method27868();
   }

   private void method6187(MatrixStack var1, int var2, int var3, int var4, int var5) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.mc.getTextureManager().bindTexture(field6452);
      method5697(var1, var2, var3, this.method5702(), (float)var4, (float)var5, 18, 18, 128, 128);
   }

   // $VF: synthetic method
   public static String method6192(Class9007 var0) {
      return method6184(var0);
   }

   // $VF: synthetic method
   public static Class8286 method6193(Class1305 var0) {
      return var0.field6904;
   }

   // $VF: synthetic method
   public static int method6194(Class1305 var0, int var1) {
      return var0.method6185(var1);
   }

   // $VF: synthetic method
   public static void method6195(Class1305 var0, MatrixStack var1, int var2, int var3, int var4, int var5) {
      var0.method6187(var1, var2, var3, var4, var5);
   }

   // $VF: synthetic method
   public static Class1282 method6196(Class1305 var0) {
      return var0.field6902;
   }

   // $VF: synthetic method
   public static void method6197(Class1305 var0, MatrixStack var1, int var2, int var3, Item var4) {
      var0.method6186(var1, var2, var3, var4);
   }
}
