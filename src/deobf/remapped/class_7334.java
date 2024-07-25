package remapped;

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
import net.minecraft.util.text.event.ClickEvent$class_47;
import net.minecraft.util.text.event.HoverEvent;
import net.minecraft.util.text.event.HoverEvent$class_48;

public class class_7334 {
   private static final Style field_37488 = Style.EMPTY
      .setHoverEvent(new HoverEvent(HoverEvent$class_48.SHOW_TEXT, new TranslationTextComponent("chat.type.team.hover")))
      .setClickEvent(new ClickEvent(ClickEvent$class_47.SUGGEST_COMMAND, "/teammsg "));
   private static final SimpleCommandExceptionType field_37489 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.teammsg.failed.noteam"));

   public static void method_33424(CommandDispatcher<class_9155> var0) {
      LiteralCommandNode var3 = var0.register(
         (LiteralArgumentBuilder)class_465.method_2231("teammsg")
            .then(
               class_465.method_2236("message", class_1282.method_5728())
                  .executes(var0x -> method_33425((class_9155)var0x.getSource(), class_1282.method_5729(var0x, "message")))
            )
      );
      var0.register((LiteralArgumentBuilder)class_465.method_2231("tm").redirect(var3));
   }

   private static int method_33425(class_9155 var0, ITextComponent var1) throws CommandSyntaxException {
      Entity var4 = var0.method_42178();
      class_3903 var5 = (class_3903)var4.method_37095();
      if (var5 != null) {
         IFormattableTextComponent var6 = var5.method_18069().mergeStyle(field_37488);
         List var7 = var0.method_42177().method_1600().method_39951();

         for (class_9359 var9 : var7) {
            if (var9 != var4) {
               if (var9.method_37095() == var5) {
                  var9.method_26286(new TranslationTextComponent("chat.type.team.text", var6, var0.method_42189(), var1), var4.method_37328());
               }
            } else {
               var9.method_26286(new TranslationTextComponent("chat.type.team.sent", var6, var0.method_42189(), var1), var4.method_37328());
            }
         }

         return var7.size();
      } else {
         throw field_37489.create();
      }
   }
}
