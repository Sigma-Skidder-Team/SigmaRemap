package remapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import net.minecraft.util.text.TranslationTextComponent;

public class class_60 {
   public static final DynamicCommandExceptionType field_58 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("commands.locatebiome.invalid", var0)
   );
   private static final DynamicCommandExceptionType field_59 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("commands.locatebiome.notFound", var0)
   );

   public static void method_36(CommandDispatcher<class_9155> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("locatebiome").requires(var0x -> var0x.method_40314(2)))
            .then(
               class_465.method_2236("biome", class_4195.method_19515())
                  .suggests(class_7510.field_38352)
                  .executes(var0x -> method_34((class_9155)var0x.getSource(), (Identifier)var0x.getArgument("biome", Identifier.class)))
            )
      );
   }

   private static int method_34(class_9155 var0, Identifier var1) throws CommandSyntaxException {
      class_6325 var4 = var0.method_42177()
         .method_1735()
         .<class_6325>method_28813(class_8669.field_44359)
         .method_39794(var1)
         .orElseThrow(() -> field_58.create(var1));
      class_1331 var5 = new class_1331(var0.method_42192());
      class_1331 var6 = var0.method_42198().method_29001(var4, var5, 6400, 8);
      String var7 = var1.toString();
      if (var6 != null) {
         return class_8295.method_38267(var0, var7, var5, var6, "commands.locatebiome.success");
      } else {
         throw field_59.create(var7);
      }
   }
}
