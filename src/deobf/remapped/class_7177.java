package remapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import net.minecraft.util.text.TranslationTextComponent;

public class class_7177 {
   private static final SimpleCommandExceptionType field_36915 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.save.alreadyOff"));

   public static void method_32890(CommandDispatcher<class_9155> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("save-off").requires(var0x -> var0x.method_40314(4))).executes(var0x -> {
            class_9155 var3 = (class_9155)var0x.getSource();
            boolean var4 = false;

            for (class_6331 var6 : var3.method_42177().method_1719()) {
               if (var6 != null && !var6.field_32325) {
                  var6.field_32325 = true;
                  var4 = true;
               }
            }

            if (var4) {
               var3.method_42196(new TranslationTextComponent("commands.save.disabled"), true);
               return 1;
            } else {
               throw field_36915.create();
            }
         })
      );
   }
}
