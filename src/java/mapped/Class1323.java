package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.biome.Biome;

import java.util.Objects;
import java.util.function.Consumer;

public class Class1323 extends Screen {
   private static final ITextComponent field6993 = new TranslationTextComponent("createWorld.customize.buffet.biome");
   private final Screen field6994;
   private final Consumer<Biome> field6995;
   private final MutableRegistry<Biome> field6996;
   private Class1283 field6997;
   private Biome field6998;
   private Button field6999;

   public Class1323(Screen var1, DynamicRegistries var2, Consumer<Biome> var3, Biome var4) {
      super(new TranslationTextComponent("createWorld.customize.buffet.title"));
      this.field6994 = var1;
      this.field6995 = var3;
      this.field6998 = var4;
      this.field6996 = var2.<Biome>getRegistry(Registry.BIOME_KEY);
   }

   @Override
   public void method1945() {
      this.mc.displayGuiScreen(this.field6994);
   }

   @Override
   public void init() {
      this.mc.keyboardListener.enableRepeatEvents(true);
      this.field6997 = new Class1283(this);
      this.children.add(this.field6997);
      this.field6999 = this.<Button>addButton(new Button(this.width / 2 - 155, this.height - 28, 150, 20, DialogTexts.field30658, var1 -> {
         this.field6995.accept(this.field6998);
         this.mc.displayGuiScreen(this.field6994);
      }));
      this.<Button>addButton(
         new Button(this.width / 2 + 5, this.height - 28, 150, 20, DialogTexts.GUI_CANCEL, var1 -> this.mc.displayGuiScreen(this.field6994))
      );
      this.field6997
         .method6024(
            this.field6997.getEventListeners().stream().filter(var1 -> Objects.equals(Class1176.method5602(var1), this.field6998)).findFirst().orElse((Class1176)null)
         );
   }

   private void method6287() {
      this.field6999.active = this.field6997.getSelected() != null;
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.method2471(0);
      this.field6997.render(var1, var2, var3, var4);
      drawCenteredString(var1, this.fontRenderer, this.title, this.width / 2, 8, 16777215);
      drawCenteredString(var1, this.fontRenderer, field6993, this.width / 2, 28, 10526880);
      super.render(var1, var2, var3, var4);
   }

   // $VF: synthetic method
   public static MutableRegistry<Biome> method6291(Class1323 var0) {
      return var0.field6996;
   }

   // $VF: synthetic method
   public static Biome method6292(Class1323 var0, Biome var1) {
      return var0.field6998 = var1;
   }

   // $VF: synthetic method
   public static void method6293(Class1323 var0) {
      var0.method6287();
   }
}
