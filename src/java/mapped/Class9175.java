package mapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.List;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraft.util.text.event.ClickEvent$Action;
import net.minecraft.util.text.event.HoverEvent;
import net.minecraft.util.text.event.HoverEvent$Action;

public class Class9175 {
   private static final Style field42128 = Style.EMPTY
      .setHoverEvent(new HoverEvent(HoverEvent$Action.SHOW_TEXT, new TranslationTextComponent("chat.type.team.hover")))
      .setClickEvent(new ClickEvent(ClickEvent$Action.SUGGEST_COMMAND, "/teammsg "));
   private static final SimpleCommandExceptionType field42129 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.teammsg.failed.noteam"));

   public static void method34285(CommandDispatcher<Class6619> var0) {
      LiteralCommandNode var3 = var0.register(
         (LiteralArgumentBuilder)Class6099.method18839("teammsg")
            .then(
               Class6099.method18840("message", Class7026.method21755())
                  .executes(var0x -> method34286((Class6619)var0x.getSource(), Class7026.method21756(var0x, "message")))
            )
      );
      var0.register((LiteralArgumentBuilder)Class6099.method18839("tm").redirect(var3));
   }

   private static int method34286(Class6619 var0, ITextComponent var1) throws CommandSyntaxException {
      Entity var4 = var0.method20174();
      Class8218 var5 = (Class8218)var4.method3344();
      if (var5 != null) {
         IFormattableTextComponent var6 = var5.method28569().mergeStyle(field42128);
         List<Class878> var7 = var0.method20177().method1367().method19488();

         for (Class878 var9 : var7) {
            if (var9 != var4) {
               if (var9.method3344() == var5) {
                  var9.method1328(new TranslationTextComponent("chat.type.team.text", var6, var0.method20169(), var1), var4.method3375());
               }
            } else {
               var9.method1328(new TranslationTextComponent("chat.type.team.sent", var6, var0.method20169(), var1), var4.method3375());
            }
         }

         return var7.size();
      } else {
         throw field42129.create();
      }
   }
}
