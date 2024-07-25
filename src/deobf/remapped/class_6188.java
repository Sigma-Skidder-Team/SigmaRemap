package remapped;

import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextComponentUtils;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraft.util.text.event.ClickEvent$class_47;
import net.minecraft.util.text.event.HoverEvent;
import net.minecraft.util.text.event.HoverEvent$class_48;

public class class_6188 extends DamageSource {
   public class_6188() {
      super("badRespawnPoint");
      this.method_28366();
      this.method_28377();
   }

   @Override
   public ITextComponent method_28362(class_5834 var1) {
      IFormattableTextComponent var4 = TextComponentUtils.wrapWithSquareBrackets(new TranslationTextComponent("death.attack.badRespawnPoint.link"))
         .modifyStyle(
            var0 -> var0.setClickEvent(new ClickEvent(ClickEvent$class_47.OPEN_URL, "https://bugs.mojang.com/browse/MCPE-28723"))
                  .setHoverEvent(new HoverEvent(HoverEvent$class_48.SHOW_TEXT, new StringTextComponent("MCPE-28723")))
         );
      return new TranslationTextComponent("death.attack.badRespawnPoint.message", var1.method_19839(), var4);
   }
}
