package net.minecraft.client.gui.screen.inventory;

import mapped.Class1121;
import mapped.Class5818;
import mapped.Class7502;
import mapped.Class870;
import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.IHasContainer;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.IContainerListener;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class LecternScreen extends Class870 implements IHasContainer<Class5818> {
   private final Class5818 field4817;
   private final IContainerListener field4818 = new Class1121(this);

   public LecternScreen(Class5818 var1, PlayerInventory var2, ITextComponent var3) {
      this.field4817 = var1;
   }

   public Class5818 getContainer() {
      return this.field4817;
   }

   @Override
   public void init() {
      super.init();
      this.field4817.addListener(this.field4818);
   }

   @Override
   public void method1945() {
      this.mc.player.method2772();
      super.method1945();
   }

   @Override
   public void onClose() {
      super.onClose();
      this.field4817.removeListener(this.field4818);
   }

   @Override
   public void method2679() {
      if (!this.mc.player.method2935()) {
         super.method2679();
      } else {
         this.<Button>addButton(
            new Button(this.width / 2 - 100, 196, 98, 20, DialogTexts.DONE, var1 -> this.mc.displayGuiScreen((Screen)null))
         );
         this.<Button>addButton(
            new Button(this.width / 2 + 2, 196, 98, 20, new TranslationTextComponent("lectern.take_book"), var1 -> this.method2683(3))
         );
      }
   }

   @Override
   public void method2680() {
      this.method2683(1);
   }

   @Override
   public void method2681() {
      this.method2683(2);
   }

   @Override
   public boolean method2682(int var1) {
      if (var1 == this.field4817.method18173()) {
         return false;
      } else {
         this.method2683(100 + var1);
         return true;
      }
   }

   private void method2683(int var1) {
      this.mc.playerController.sendEnchantPacket(this.field4817.windowId, var1);
   }

   @Override
   public boolean isPauseScreen() {
      return false;
   }

   private void method2684() {
      ItemStack var3 = this.field4817.method18172();
      this.method2690(Class7502.method24462(var3));
   }

   private void method2685() {
      this.method2691(this.field4817.method18173());
   }

   // $VF: synthetic method
   public static void method2688(LecternScreen var0) {
      var0.method2684();
   }

   // $VF: synthetic method
   public static void method2689(LecternScreen var0) {
      var0.method2685();
   }
}
