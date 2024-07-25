package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_815 extends class_1094 {
   private static final ITextComponent field_4327 = new TranslationTextComponent("mco.account.privacyinfo");
   private final class_266 field_4329;
   private class_416 field_4330 = class_416.field_1766;

   public class_815(class_266 var1) {
      this.field_4329 = var1;
   }

   @Override
   public void method_1163() {
      class_7567.method_34410(field_4327.getString());
      TranslationTextComponent var3 = new TranslationTextComponent("mco.account.update");
      ITextComponent var4 = class_1402.field_7632;
      int var5 = Math.max(this.field_948.method_45379(var3), this.field_948.method_45379(var4)) + 30;
      TranslationTextComponent var6 = new TranslationTextComponent("mco.account.privacy.info");
      int var7 = (int)((double)this.field_948.method_45379(var6) * 1.2);
      this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 - var7 / 2, method_4819(11), var7, 20, var6, var0 -> Util.getOperatingSystem().method_37581("https://aka.ms/MinecraftGDPR")
         )
      );
      this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 - (var5 + 5),
            method_4819(13),
            var5,
            20,
            var3,
            var0 -> Util.getOperatingSystem().method_37581("https://aka.ms/UpdateMojangAccount")
         )
      );
      this.<class_9521>method_1186(new class_9521(this.field_941 / 2 + 5, method_4819(13), var5, 20, var4, var1 -> this.field_943.method_8609(this.field_4329)));
      this.field_4330 = class_416.method_2075(this.field_948, field_4327, (int)Math.round((double)this.field_941 * 0.9));
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      this.field_4330.method_2071(var1, this.field_941 / 2, 15, 15, 16777215);
      super.method_6767(var1, var2, var3, var4);
   }
}
