package remapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import net.minecraft.util.text.TranslationTextComponent;

public class class_5842 {
   private static final DynamicCommandExceptionType field_29692 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("commands.difficulty.failure", var0)
   );

   public static void method_26649(CommandDispatcher<class_9155> var0) {
      LiteralArgumentBuilder var3 = class_465.method_2231("difficulty");

      for (class_423 var7 : class_423.values()) {
         var3.then(class_465.method_2231(var7.method_2098()).executes(var1 -> method_26647((class_9155)var1.getSource(), var7)));
      }

      var0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)var3.requires(var0x -> var0x.method_40314(2))).executes(var0x -> {
         class_423 var3x = ((class_9155)var0x.getSource()).method_42198().method_43370();
         ((class_9155)var0x.getSource()).method_42196(new TranslationTextComponent("commands.difficulty.query", var3x.method_2101()), false);
         return var3x.method_2097();
      }));
   }

   public static int method_26647(class_9155 var0, class_423 var1) throws CommandSyntaxException {
      class_341 var4 = var0.method_42177();
      if (var4.method_1601().method_8661() != var1) {
         var4.method_1753(var1, true);
         var0.method_42196(new TranslationTextComponent("commands.difficulty.success", var1.method_2101()), true);
         return 0;
      } else {
         throw field_29692.create(var1.method_2098());
      }
   }
}
