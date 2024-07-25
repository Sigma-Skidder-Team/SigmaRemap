package remapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Map.Entry;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.TextComponentUtils;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraft.util.text.event.ClickEvent$class_47;
import net.minecraft.util.text.event.HoverEvent;
import net.minecraft.util.text.event.HoverEvent$class_48;

public class class_8295 {
   private static final SimpleCommandExceptionType field_42501 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.locate.failed"));

   public static void method_38266(CommandDispatcher<class_9155> var0) {
      LiteralArgumentBuilder var3 = (LiteralArgumentBuilder)class_465.method_2231("locate").requires(var0x -> var0x.method_40314(2));

      for (Entry var5 : class_5390.field_27500.entrySet()) {
         var3 = (LiteralArgumentBuilder)var3.then(
            class_465.method_2231((String)var5.getKey()).executes(var1 -> method_38269((class_9155)var1.getSource(), (class_5390<?>)var5.getValue()))
         );
      }

      var0.register(var3);
   }

   private static int method_38269(class_9155 var0, class_5390<?> var1) throws CommandSyntaxException {
      BlockPos var4 = new BlockPos(var0.method_42192());
      BlockPos var5 = var0.method_42198().method_29000(var1, var4, 100, false);
      if (var5 != null) {
         return method_38267(var0, var1.method_24556(), var4, var5, "commands.locate.success");
      } else {
         throw field_42501.create();
      }
   }

   public static int method_38267(class_9155 var0, String var1, BlockPos var2, BlockPos var3, String var4) {
      int var7 = MathHelper.floor(method_38270(var2.getX(), var2.method_12185(), var3.getX(), var3.method_12185()));
      IFormattableTextComponent var8 = TextComponentUtils.wrapWithSquareBrackets(
            new TranslationTextComponent("chat.coordinates", var3.getX(), "~", var3.method_12185())
         )
         .modifyStyle(
            var1x -> var1x.setFormatting(TextFormatting.GREEN)
                  .setClickEvent(new ClickEvent(ClickEvent$class_47.SUGGEST_COMMAND, "/tp @s " + var3.getX() + " ~ " + var3.method_12185()))
                  .setHoverEvent(new HoverEvent(HoverEvent$class_48.SHOW_TEXT, new TranslationTextComponent("chat.coordinates.tooltip")))
         );
      var0.method_42196(new TranslationTextComponent(var4, var1, var8, var7), false);
      return var7;
   }

   private static float method_38270(int var0, int var1, int var2, int var3) {
      int var6 = var2 - var0;
      int var7 = var3 - var1;
      return MathHelper.sqrt((float)(var6 * var6 + var7 * var7));
   }
}
