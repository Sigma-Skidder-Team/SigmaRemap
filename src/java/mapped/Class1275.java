package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.*;

public class Class1275 extends Class1274<Class1175> {
   private static final ResourceLocation field6801 = new ResourceLocation("textures/gui/resource_packs.png");
   private static final ITextComponent field6802 = new TranslationTextComponent("pack.incompatible");
   private static final ITextComponent field6803 = new TranslationTextComponent("pack.incompatible.confirm.title");
   private final ITextComponent field6804;

   public Class1275(Minecraft var1, int var2, int var3, ITextComponent var4) {
      super(var1, var2, var3, 32, var3 - 55 + 4, 36);
      this.field6804 = var4;
      this.field6791 = false;
      this.method6021(true, 13);
   }

   @Override
   public void method6038(MatrixStack var1, int var2, int var3, Tessellator var4) {
      IFormattableTextComponent var7 = new StringTextComponent("").append(this.field6804).mergeStyle(TextFormatting.UNDERLINE, TextFormatting.BOLD);
      this.field6782
         .fontRenderer
         .func_243248_b(
            var1,
            var7,
            (float)(var2 + this.field6785 / 2 - this.field6782.fontRenderer.method38821(var7) / 2),
            (float)Math.min(this.field6787 + 3, var3),
            16777215
         );
   }

   @Override
   public int method6022() {
      return this.field6785;
   }

   @Override
   public int method6048() {
      return this.field6789 - 6;
   }

   // $VF: synthetic method
   public static ITextComponent method6063() {
      return field6802;
   }

   // $VF: synthetic method
   public static ResourceLocation method6064() {
      return field6801;
   }

   // $VF: synthetic method
   public static ITextComponent method6065() {
      return field6803;
   }
}
