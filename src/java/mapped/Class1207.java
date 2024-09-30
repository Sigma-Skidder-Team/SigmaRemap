package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.gui.screen.inventory.MerchantScreen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.StringTextComponent;

public class Class1207 extends Button {
   private static String[] field6515;
   public final int field6516;
   public final MerchantScreen field6517;

   public Class1207(MerchantScreen var1, int var2, int var3, int var4, Class7192 var5) {
      super(var2, var3, 89, 20, StringTextComponent.EMPTY, var5);
      this.field6517 = var1;
      this.field6516 = var4;
      this.field6483 = false;
   }

   public int method5765() {
      return this.field6516;
   }

   @Override
   public void method5738(MatrixStack var1, int var2, int var3) {
      if (this.field6481 && this.field6517.field4727.method18217().size() > this.field6516 + MerchantScreen.method2668(this.field6517)) {
         if (var2 >= this.field6477 + 20) {
            if (var2 < this.field6477 + 50 && var2 > this.field6477 + 30) {
               ItemStack var7 = this.field6517.field4727.method18217().get(this.field6516 + MerchantScreen.method2668(this.field6517)).method35367();
               if (!var7.isEmpty()) {
                  MerchantScreen.method2670(this.field6517, var1, var7, var2, var3);
               }
            } else if (var2 > this.field6477 + 65) {
               ItemStack var6 = this.field6517.field4727.method18217().get(this.field6516 + MerchantScreen.method2668(this.field6517)).method35368();
               MerchantScreen.method2671(this.field6517, var1, var6, var2, var3);
            }
         } else {
            ItemStack var8 = this.field6517.field4727.method18217().get(this.field6516 + MerchantScreen.method2668(this.field6517)).method35366();
            MerchantScreen.method2669(this.field6517, var1, var8, var2, var3);
         }
      }
   }
}
