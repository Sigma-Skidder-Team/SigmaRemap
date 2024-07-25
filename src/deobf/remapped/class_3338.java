package remapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import net.minecraft.util.text.TranslationTextComponent;

public class class_3338 {
   private static final SimpleCommandExceptionType field_16468 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.summon.failed"));
   private static final SimpleCommandExceptionType field_16470 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.summon.failed.uuid"));
   private static final SimpleCommandExceptionType field_16469 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.summon.invalidPosition"));

   public static void method_15316(CommandDispatcher<class_9155> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("summon").requires(var0x -> var0x.method_40314(2)))
            .then(
               ((RequiredArgumentBuilder)class_465.method_2236("entity", class_2819.method_12842())
                     .suggests(class_7510.field_38354)
                     .executes(
                        var0x -> method_15315(
                              (class_9155)var0x.getSource(),
                              class_2819.method_12843(var0x, "entity"),
                              ((class_9155)var0x.getSource()).method_42192(),
                              new class_5734(),
                              true
                           )
                     ))
                  .then(
                     ((RequiredArgumentBuilder)class_465.method_2236("pos", class_1029.method_4556())
                           .executes(
                              var0x -> method_15315(
                                    (class_9155)var0x.getSource(),
                                    class_2819.method_12843(var0x, "entity"),
                                    class_1029.method_4555(var0x, "pos"),
                                    new class_5734(),
                                    true
                                 )
                           ))
                        .then(
                           class_465.method_2236("nbt", class_9646.method_44519())
                              .executes(
                                 var0x -> method_15315(
                                       (class_9155)var0x.getSource(),
                                       class_2819.method_12843(var0x, "entity"),
                                       class_1029.method_4555(var0x, "pos"),
                                       class_9646.method_44521(var0x, "nbt"),
                                       false
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int method_15315(class_9155 var0, Identifier var1, class_1343 var2, class_5734 var3, boolean var4) throws CommandSyntaxException {
      class_1331 var7 = new class_1331(var2);
      if (World.method_29593(var7)) {
         class_5734 var8 = var3.method_25944();
         var8.method_25941("id", var1.toString());
         class_6331 var9 = var0.method_42198();
         Entity var10 = class_6629.method_30455(var8, var9, var1x -> {
            var1x.method_37144(var2.field_7336, var2.field_7333, var2.field_7334, var1x.field_41701, var1x.field_41755);
            return var1x;
         });
         if (var10 != null) {
            if (var4 && var10 instanceof class_5886) {
               ((class_5886)var10)
                  .method_26864(
                     var0.method_42198(), var0.method_42198().method_43368(var10.method_37075()), class_2417.field_12028, (class_8733)null, (class_5734)null
                  );
            }

            if (var9.method_28933(var10)) {
               var0.method_42196(new TranslationTextComponent("commands.summon.success", var10.method_19839()), true);
               return 1;
            } else {
               throw field_16470.create();
            }
         } else {
            throw field_16468.create();
         }
      } else {
         throw field_16469.create();
      }
   }
}
