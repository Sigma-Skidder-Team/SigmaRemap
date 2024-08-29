package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class820 extends Class798 {
   private static final ITextComponent field4473 = new TranslationTextComponent("mco.account.privacyinfo");
   private final Screen field4474;
   private Class5991 field4475 = Class5991.field26162;

   public Class820(Screen var1) {
      this.field4474 = var1;
   }

   @Override
   public void method1921() {
      Class9229.method34711(field4473.getString());
      TranslationTextComponent var3 = new TranslationTextComponent("mco.account.update");
      ITextComponent var4 = DialogTexts.field30663;
      int var5 = Math.max(this.field4568.method38821(var3), this.field4568.method38821(var4)) + 30;
      TranslationTextComponent var6 = new TranslationTextComponent("mco.account.privacy.info");
      int var7 = (int)((double)this.field4568.method38821(var6) * 1.2);
      this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 - var7 / 2, method1929(11), var7, 20, var6, var0 -> Util.getOSType().method8181("https://aka.ms/MinecraftGDPR")
         )
      );
      this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 - (var5 + 5), method1929(13), var5, 20, var3, var0 -> Util.getOSType().method8181("https://aka.ms/UpdateMojangAccount")
         )
      );
      this.<Class1206>method2455(new Class1206(this.field4564 / 2 + 5, method1929(13), var5, 20, var4, var1 -> this.field4562.displayGuiScreen(this.field4474)));
      this.field4475 = Class5991.method18584(this.field4568, field4473, (int)Math.round((double)this.field4564 * 0.9));
   }

   @Override
   public void method1923(MatrixStack var1, int var2, int var3, float var4) {
      this.method2469(var1);
      this.field4475.method18589(var1, this.field4564 / 2, 15, 15, 16777215);
      super.method1923(var1, var2, var3, var4);
   }
}
