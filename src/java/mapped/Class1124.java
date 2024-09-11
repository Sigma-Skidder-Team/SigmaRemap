package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.client.CRenameItemPacket;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextProperties;
import net.minecraft.util.text.TranslationTextComponent;

public class Class1124 extends Class875<Class5824> {
   private static final ResourceLocation field6158 = new ResourceLocation("textures/gui/container/anvil.png");
   private static final ITextComponent field6159 = new TranslationTextComponent("container.repair.expensive");
   private TextFieldWidget field6160;

   public Class1124(Class5824 var1, PlayerInventory var2, ITextComponent var3) {
      super(var1, var2, var3, field6158);
      this.field4723 = 60;
   }

   @Override
   public void tick() {
      super.tick();
      this.field6160.method5633();
   }

   @Override
   public void method2716() {
      this.mc.keyboardListener.enableRepeatEvents(true);
      int var3 = (this.width - this.xSize) / 2;
      int var4 = (this.height - this.ySize) / 2;
      this.field6160 = new TextFieldWidget(this.fontRenderer, var3 + 62, var4 + 24, 103, 12, new TranslationTextComponent("container.repair"));
      this.field6160.method5669(false);
      this.field6160.method5662(-1);
      this.field6160.method5663(-1);
      this.field6160.method5661(false);
      this.field6160.method5657(35);
      this.field6160.method5631(this::method5420);
      this.field4561.add(this.field6160);
      this.setFocusedDefault(this.field6160);
   }

   @Override
   public void resize(Minecraft var1, int var2, int var3) {
      String var6 = this.field6160.getText();
      this.init(var1, var2, var3);
      this.field6160.method5635(var6);
   }

   @Override
   public void onClose() {
      super.onClose();
      this.mc.keyboardListener.enableRepeatEvents(false);
   }

   @Override
   public boolean keyPressed(int var1, int var2, int var3) {
      if (var1 == 256) {
         this.mc.player.method2772();
      }

      return !this.field6160.keyPressed(var1, var2, var3) && !this.field6160.method5653() ? super.keyPressed(var1, var2, var3) : true;
   }

   private void method5420(String var1) {
      if (!var1.isEmpty()) {
         String var4 = var1;
         Slot var5 = this.field4727.getSlot(0);
         if (var5 != null && var5.getHasStack() && !var5.getStack().method32152() && var1.equals(var5.getStack().method32149().getString())) {
            var4 = "";
         }

         this.field4727.method18197(var4);
         this.mc.player.connection.sendPacket(new CRenameItemPacket(var4));
      }
   }

   @Override
   public void method2617(MatrixStack var1, int var2, int var3) {
      RenderSystem.disableBlend();
      super.method2617(var1, var2, var3);
      int var6 = this.field4727.method18198();
      if (var6 > 0) {
         int var7 = 8453920;
         Object var8;
         if (var6 >= 40 && !this.mc.player.abilities.isCreativeMode) {
            var8 = field6159;
            var7 = 16736352;
         } else if (this.field4727.getSlot(2).getHasStack()) {
            var8 = new TranslationTextComponent("container.repair.cost", var6);
            if (!this.field4727.getSlot(2).canTakeStack(this.field4728.field5444)) {
               var7 = 16736352;
            }
         } else {
            var8 = null;
         }

         if (var8 != null) {
            int var9 = this.xSize - 8 - this.fontRenderer.method38821((ITextProperties)var8) - 2;
            byte var10 = 69;
            method5686(var1, var9 - 2, 67, this.xSize - 8, 79, 1325400064);
            this.fontRenderer.method38803(var1, (ITextComponent)var8, (float)var9, 69.0F, var7);
         }
      }
   }

   @Override
   public void method2717(MatrixStack var1, int var2, int var3, float var4) {
      this.field6160.render(var1, var2, var3, var4);
   }

   @Override
   public void method2720(Container var1, int var2, ItemStack var3) {
      if (var2 == 0) {
         this.field6160.method5635(!var3.isEmpty() ? var3.method32149().getString() : "");
         this.field6160.method5666(!var3.isEmpty());
         this.setListener(this.field6160);
      }
   }
}
