package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextProperties;
import net.minecraft.util.text.TranslationTextComponent;

public class class_2713 extends class_1280<class_6600> {
   private static final Identifier field_13264 = new Identifier("textures/gui/container/anvil.png");
   private static final ITextComponent field_13263 = new TranslationTextComponent("container.repair.expensive");
   private class_1863 field_13261;

   public class_2713(class_6600 var1, class_7051 var2, ITextComponent var3) {
      super(var1, var2, var3, field_13264);
      this.field_10959 = 60;
   }

   @Override
   public void method_5312() {
      super.method_5312();
      this.field_13261.method_8279();
   }

   @Override
   public void method_5724() {
      this.field_943.field_9600.method_38887(true);
      int var3 = (this.field_941 - this.field_10981) / 2;
      int var4 = (this.field_940 - this.field_10973) / 2;
      this.field_13261 = new class_1863(this.field_948, var3 + 62, var4 + 24, 103, 12, new TranslationTextComponent("container.repair"));
      this.field_13261.method_8269(false);
      this.field_13261.method_8250(-1);
      this.field_13261.method_8249(-1);
      this.field_13261.method_8258(false);
      this.field_13261.method_8255(35);
      this.field_13261.method_8277(this::method_12215);
      this.field_942.add(this.field_13261);
      this.method_41178(this.field_13261);
   }

   @Override
   public void method_1191(MinecraftClient var1, int var2, int var3) {
      String var6 = this.field_13261.method_8246();
      this.method_1164(var1, var2, var3);
      this.field_13261.method_8281(var6);
   }

   @Override
   public void method_1162() {
      super.method_1162();
      this.field_943.field_9600.method_38887(false);
   }

   @Override
   public boolean method_26946(int var1, int var2, int var3) {
      if (var1 == 256) {
         this.field_943.thePlayer.method_3207();
      }

      return !this.field_13261.method_26946(var1, var2, var3) && !this.field_13261.method_8275() ? super.method_26946(var1, var2, var3) : true;
   }

   private void method_12215(String var1) {
      if (!var1.isEmpty()) {
         String var4 = var1;
         class_7934 var5 = this.field_10956.method_18878(0);
         if (var5 != null && var5.method_35884() && !var5.method_35898().method_28018() && var1.equals(var5.method_35898().method_28008().getString())) {
            var4 = "";
         }

         this.field_10956.method_30384(var4);
         this.field_943.thePlayer.field_30532.method_4813(new class_5912(var4));
      }
   }

   @Override
   public void method_10221(class_7966 var1, int var2, int var3) {
      RenderSystem.disableBlend();
      super.method_10221(var1, var2, var3);
      int var6 = this.field_10956.method_30385();
      if (var6 > 0) {
         int var7 = 8453920;
         Object var8;
         if (var6 >= 40 && !this.field_943.thePlayer.field_3876.isCreativeMode) {
            var8 = field_13263;
            var7 = 16736352;
         } else if (this.field_10956.method_18878(2).method_35884()) {
            var8 = new TranslationTextComponent("container.repair.cost", var6);
            if (!this.field_10956.method_18878(2).method_35895(this.field_10967.field_36409)) {
               var7 = 16736352;
            }
         } else {
            var8 = null;
         }

         if (var8 != null) {
            int var9 = this.field_10981 - 8 - this.field_948.method_45379((ITextProperties)var8) - 2;
            byte var10 = 69;
            method_9774(var1, var9 - 2, 67, this.field_10981 - 8, 79, 1325400064);
            this.field_948.method_45392(var1, (ITextComponent)var8, (float)var9, 69.0F, var7);
         }
      }
   }

   @Override
   public void method_5725(class_7966 var1, int var2, int var3, float var4) {
      this.field_13261.method_6767(var1, var2, var3, var4);
   }

   @Override
   public void method_348(class_4088 var1, int var2, ItemStack var3) {
      if (var2 == 0) {
         this.field_13261.method_8281(!var3.method_28022() ? var3.method_28008().getString() : "");
         this.field_13261.method_8265(!var3.method_28022());
         this.method_41180(this.field_13261);
      }
   }
}
