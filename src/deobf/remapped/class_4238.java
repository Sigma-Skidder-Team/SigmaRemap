package remapped;

import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;
import net.minecraft.util.text.TranslationTextComponent;

public class class_4238 {
   private static final SimpleCommandExceptionType field_20568 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.trigger.failed.unprimed")
   );
   private static final SimpleCommandExceptionType field_20569 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.trigger.failed.invalid"));

   public static void method_19767(CommandDispatcher<class_9155> var0) {
      var0.register(
         (LiteralArgumentBuilder)class_465.method_2231("trigger")
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)class_465.method_2236("objective", class_7728.method_34976())
                        .suggests((var0x, var1) -> method_19773((class_9155)var0x.getSource(), var1))
                        .executes(
                           var0x -> method_19772(
                                 (class_9155)var0x.getSource(),
                                 method_19768(((class_9155)var0x.getSource()).method_42179(), class_7728.method_34978(var0x, "objective"))
                              )
                        ))
                     .then(
                        class_465.method_2231("add")
                           .then(
                              class_465.method_2236("value", IntegerArgumentType.integer())
                                 .executes(
                                    var0x -> method_19770(
                                          (class_9155)var0x.getSource(),
                                          method_19768(((class_9155)var0x.getSource()).method_42179(), class_7728.method_34978(var0x, "objective")),
                                          IntegerArgumentType.getInteger(var0x, "value")
                                       )
                                 )
                           )
                     ))
                  .then(
                     class_465.method_2231("set")
                        .then(
                           class_465.method_2236("value", IntegerArgumentType.integer())
                              .executes(
                                 var0x -> method_19771(
                                       (class_9155)var0x.getSource(),
                                       method_19768(((class_9155)var0x.getSource()).method_42179(), class_7728.method_34978(var0x, "objective")),
                                       IntegerArgumentType.getInteger(var0x, "value")
                                    )
                              )
                        )
                  )
            )
      );
   }

   public static CompletableFuture<Suggestions> method_19773(class_9155 var0, SuggestionsBuilder var1) {
      class_8145 var4 = var0.method_42200();
      ArrayList var5 = Lists.newArrayList();
      if (var4 != null) {
         class_2917 var6 = var0.method_42177().method_1655();
         String var7 = var4.method_37206();

         for (class_4399 var9 : var6.method_4836()) {
            if (var9.method_20491() == class_6810.field_35130 && var6.method_4857(var7, var9)) {
               class_8274 var10 = var6.method_4855(var7, var9);
               if (!var10.method_38148()) {
                  var5.add(var9.method_20490());
               }
            }
         }
      }

      return class_8773.method_40319(var5, var1);
   }

   private static int method_19770(class_9155 var0, class_8274 var1, int var2) {
      var1.method_38142(var2);
      var0.method_42196(new TranslationTextComponent("commands.trigger.add.success", var1.method_38149().method_20482(), var2), true);
      return var1.method_38146();
   }

   private static int method_19771(class_9155 var0, class_8274 var1, int var2) {
      var1.method_38140(var2);
      var0.method_42196(new TranslationTextComponent("commands.trigger.set.success", var1.method_38149().method_20482(), var2), true);
      return var2;
   }

   private static int method_19772(class_9155 var0, class_8274 var1) {
      var1.method_38142(1);
      var0.method_42196(new TranslationTextComponent("commands.trigger.simple.success", var1.method_38149().method_20482()), true);
      return var1.method_38146();
   }

   private static class_8274 method_19768(class_9359 var0, class_4399 var1) throws CommandSyntaxException {
      if (var1.method_20491() == class_6810.field_35130) {
         class_1097 var4 = var0.method_3219();
         String var5 = var0.method_37206();
         if (var4.method_4857(var5, var1)) {
            class_8274 var6 = var4.method_4855(var5, var1);
            if (!var6.method_38148()) {
               var6.method_38141(true);
               return var6;
            } else {
               throw field_20568.create();
            }
         } else {
            throw field_20568.create();
         }
      } else {
         throw field_20569.create();
      }
   }
}
