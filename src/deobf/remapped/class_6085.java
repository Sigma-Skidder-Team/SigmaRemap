package remapped;

import com.google.common.collect.Iterables;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.ParsedCommandNode;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Map;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_6085 {
   private static final SimpleCommandExceptionType field_31140 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.help.failed"));

   public static void method_27863(CommandDispatcher<class_9155> var0) {
      var0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("help").executes(var1 -> {
         Map var4 = var0.getSmartUsage(var0.getRoot(), var1.getSource());

         for (String var6 : var4.values()) {
            ((class_9155)var1.getSource()).method_42196(new StringTextComponent("/" + var6), false);
         }

         return var4.size();
      })).then(class_465.method_2236("command", StringArgumentType.greedyString()).executes(var1 -> {
         ParseResults var4 = var0.parse(StringArgumentType.getString(var1, "command"), var1.getSource());
         if (var4.getContext().getNodes().isEmpty()) {
            throw field_31140.create();
         } else {
            Map var5 = var0.getSmartUsage(((ParsedCommandNode)Iterables.getLast(var4.getContext().getNodes())).getNode(), var1.getSource());

            for (String var7 : var5.values()) {
               ((class_9155)var1.getSource()).method_42196(new StringTextComponent("/" + var4.getReader().getString() + " " + var7), false);
            }

            return var5.size();
         }
      })));
   }
}
