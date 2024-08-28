package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class1235 extends Class1234 {
   private final Class2266 field6583;

   public Class1235(Minecraft var1, int var2, int var3, Class2266 var4, int var5) {
      super(var1.gameSettings, var2, var3, var5, 20, (double)var1.gameSettings.method37147(var4));
      this.field6583 = var4;
      this.method5813();
   }

   @Override
   public void method5813() {
      Object var3 = (float)this.field6584 != (float)this.method5729(false)
         ? new StringTextComponent((int)(this.field6584 * 100.0) + "%")
         : Class7127.field30657;
      this.method5743(new TranslationTextComponent("soundCategory." + this.field6583.method8995()).appendString(": ").append((ITextComponent)var3));
   }

   @Override
   public void method5812() {
      this.field6582.method37148(this.field6583, (float)this.field6584);
      this.field6582.method37146();
   }
}
