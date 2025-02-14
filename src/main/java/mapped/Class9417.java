package mapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Map.Entry;

import net.minecraft.command.CommandSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.TextComponentUtils;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraft.util.text.event.ClickEvent$Action;
import net.minecraft.util.text.event.HoverEvent;

public class Class9417 {
   private static final SimpleCommandExceptionType field43678 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.locate.failed"));

   public static void method36131(CommandDispatcher<CommandSource> var0) {
      LiteralArgumentBuilder var3 = (LiteralArgumentBuilder) Commands.method18839("locate").requires(var0x -> var0x.method20129(2));

      for (Entry var5 : Structure.field_236365_a_.entrySet()) {
         var3 = (LiteralArgumentBuilder)var3.then(
            Commands.method18839((String)var5.getKey()).executes(var1 -> method36132((CommandSource)var1.getSource(), (Structure<?>)var5.getValue()))
         );
      }

      var0.register(var3);
   }

   private static int method36132(CommandSource var0, Structure<?> var1) throws CommandSyntaxException {
      BlockPos var4 = new BlockPos(var0.method20171());
      BlockPos var5 = var0.method20172().method6943(var1, var4, 100, false);
      if (var5 != null) {
         return method36133(var0, var1.method11373(), var4, var5, "commands.locate.success");
      } else {
         throw field43678.create();
      }
   }

   public static int method36133(CommandSource var0, String var1, BlockPos var2, BlockPos var3, String var4) {
      int var7 = MathHelper.floor(method36134(var2.getX(), var2.getZ(), var3.getX(), var3.getZ()));
      IFormattableTextComponent var8 = TextComponentUtils.wrapWithSquareBrackets(
            new TranslationTextComponent("chat.coordinates", var3.getX(), "~", var3.getZ())
         )
         .modifyStyle(
            var1x -> var1x.setFormatting(TextFormatting.GREEN)
                  .setClickEvent(new ClickEvent(ClickEvent$Action.SUGGEST_COMMAND, "/tp @s " + var3.getX() + " ~ " + var3.getZ()))
                  .setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new TranslationTextComponent("chat.coordinates.tooltip")))
         );
      var0.sendFeedback(new TranslationTextComponent(var4, var1, var8, var7), false);
      return var7;
   }

   private static float method36134(int var0, int var1, int var2, int var3) {
      int var6 = var2 - var0;
      int var7 = var3 - var1;
      return MathHelper.sqrt((float)(var6 * var6 + var7 * var7));
   }
}
