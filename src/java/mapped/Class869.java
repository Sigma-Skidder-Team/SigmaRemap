package mapped;

import net.minecraft.client.gui.DialogTexts;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class869 extends Class870 implements Class867<Class5818> {
   private final Class5818 field4817;
   private final Class876 field4818 = new Class1121(this);

   public Class869(Class5818 var1, PlayerInventory var2, ITextComponent var3) {
      this.field4817 = var1;
   }

   public Class5818 method2628() {
      return this.field4817;
   }

   @Override
   public void method1921() {
      super.method1921();
      this.field4817.method18127(this.field4818);
   }

   @Override
   public void method1945() {
      this.field4562.player.method2772();
      super.method1945();
   }

   @Override
   public void onClose() {
      super.onClose();
      this.field4817.method18128(this.field4818);
   }

   @Override
   public void method2679() {
      if (!this.field4562.player.method2935()) {
         super.method2679();
      } else {
         this.<Class1206>method2455(
            new Class1206(this.field4564 / 2 - 100, 196, 98, 20, DialogTexts.field30658, var1 -> this.field4562.displayGuiScreen((Screen)null))
         );
         this.<Class1206>method2455(
            new Class1206(this.field4564 / 2 + 2, 196, 98, 20, new TranslationTextComponent("lectern.take_book"), var1 -> this.method2683(3))
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
      this.field4562.playerController.method23146(this.field4817.field25471, var1);
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
   public static void method2688(Class869 var0) {
      var0.method2684();
   }

   // $VF: synthetic method
   public static void method2689(Class869 var0) {
      var0.method2685();
   }
}
