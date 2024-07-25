package remapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextComponentUtils;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraft.util.text.event.ClickEvent$class_47;
import net.minecraft.util.text.event.HoverEvent;
import net.minecraft.util.text.event.HoverEvent$class_48;

public class class_8819 {
   public static void method_40505(CommandDispatcher<class_9155> var0, boolean var1) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("seed").requires(var1x -> !var1 || var1x.method_40314(2)))
            .executes(
               var0x -> {
                  long var3 = ((class_9155)var0x.getSource()).method_42198().method_3133();
                  IFormattableTextComponent var5 = TextComponentUtils.wrapWithSquareBrackets(
                     new StringTextComponent(String.valueOf(var3))
                        .modifyStyle(
                           var2 -> var2.setFormatting(TextFormatting.GREEN)
                                 .setClickEvent(new ClickEvent(ClickEvent$class_47.COPY_TO_CLIPBOARD, String.valueOf(var3)))
                                 .setHoverEvent(new HoverEvent(HoverEvent$class_48.SHOW_TEXT, new TranslationTextComponent("chat.copy.click")))
                                 .setInsertion(String.valueOf(var3))
                        )
                  );
                  ((class_9155)var0x.getSource()).method_42196(new TranslationTextComponent("commands.seed.success", var5), false);
                  return (int)var3;
               }
            )
      );
   }
}
