package remapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.util.text.TranslationTextComponent;

public class class_9173 {
   public static void method_42280(CommandDispatcher<class_9155> var0) {
      LiteralArgumentBuilder var3 = (LiteralArgumentBuilder)class_465.method_2231("gamerule").requires(var0x -> var0x.method_40314(2));
      class_291.method_1289(new class_9360(var3));
      var0.register(var3);
   }

   private static <T extends class_9152<T>> int method_42276(CommandContext<class_9155> var0, class_7505<T> var1) {
      class_9155 var4 = (class_9155)var0.getSource();
      class_9152 var5 = var4.method_42177().method_1683().<class_9152>method_1287(var1);
      var5.method_42117(var0, "value");
      var4.method_42196(new TranslationTextComponent("commands.gamerule.set", var1.method_34215(), var5.toString()), true);
      return var5.method_42122();
   }

   private static <T extends class_9152<T>> int method_42277(class_9155 var0, class_7505<T> var1) {
      class_9152 var4 = var0.method_42177().method_1683().<class_9152>method_1287(var1);
      var0.method_42196(new TranslationTextComponent("commands.gamerule.query", var1.method_34215(), var4.toString()), false);
      return var4.method_42122();
   }
}