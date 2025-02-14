package mapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.command.CommandSource;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextComponentUtils;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraft.util.text.event.ClickEvent$Action;
import net.minecraft.util.text.event.HoverEvent;

public class Class9554 {
   public static void method37005(CommandDispatcher<CommandSource> var0, boolean var1) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder) Commands.method18839("seed").requires(var1x -> !var1 || var1x.method20129(2)))
            .executes(
               var0x -> {
                  long var3 = ((CommandSource)var0x.getSource()).method20172().getSeed();
                  IFormattableTextComponent var5 = TextComponentUtils.wrapWithSquareBrackets(
                     new StringTextComponent(String.valueOf(var3))
                        .modifyStyle(
                           var2 -> var2.setFormatting(TextFormatting.GREEN)
                                 .setClickEvent(new ClickEvent(ClickEvent$Action.COPY_TO_CLIPBOARD, String.valueOf(var3)))
                                 .setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new TranslationTextComponent("chat.copy.click")))
                                 .setInsertion(String.valueOf(var3))
                        )
                  );
                  ((CommandSource)var0x.getSource()).sendFeedback(new TranslationTextComponent("commands.seed.success", var5), false);
                  return (int)var3;
               }
            )
      );
   }
}
