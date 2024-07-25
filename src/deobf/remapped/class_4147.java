package remapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;
import net.minecraft.util.text.TranslationTextComponent;

public class class_4147 {
   private static final DynamicCommandExceptionType field_20179 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("clear.failed.single", var0)
   );
   private static final DynamicCommandExceptionType field_20178 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("clear.failed.multiple", var0)
   );

   public static void method_19254(CommandDispatcher<class_9155> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("clear").requires(var0x -> var0x.method_40314(2)))
               .executes(
                  var0x -> method_19255(
                        (class_9155)var0x.getSource(), Collections.<class_9359>singleton(((class_9155)var0x.getSource()).method_42179()), var0xx -> true, -1
                     )
               ))
            .then(
               ((RequiredArgumentBuilder)class_465.method_2236("targets", class_5601.method_25409())
                     .executes(var0x -> method_19255((class_9155)var0x.getSource(), class_5601.method_25412(var0x, "targets"), var0xx -> true, -1)))
                  .then(
                     ((RequiredArgumentBuilder)class_465.method_2236("item", class_2268.method_10470())
                           .executes(
                              var0x -> method_19255(
                                    (class_9155)var0x.getSource(), class_5601.method_25412(var0x, "targets"), class_2268.method_10469(var0x, "item"), -1
                                 )
                           ))
                        .then(
                           class_465.method_2236("maxCount", IntegerArgumentType.integer(0))
                              .executes(
                                 var0x -> method_19255(
                                       (class_9155)var0x.getSource(),
                                       class_5601.method_25412(var0x, "targets"),
                                       class_2268.method_10469(var0x, "item"),
                                       IntegerArgumentType.getInteger(var0x, "maxCount")
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int method_19255(class_9155 var0, Collection<class_9359> var1, Predicate<ItemStack> var2, int var3) throws CommandSyntaxException {
      int var6 = 0;

      for (class_9359 var8 : var1) {
         var6 += var8.inventory.method_32428(var2, var3, var8.field_3869.method_17103());
         var8.field_3874.method_18877();
         var8.field_3869.method_18853(var8.inventory);
         var8.method_43260();
      }

      if (var6 != 0) {
         if (var3 != 0) {
            if (var1.size() != 1) {
               var0.method_42196(new TranslationTextComponent("commands.clear.success.multiple", var6, var1.size()), true);
            } else {
               var0.method_42196(new TranslationTextComponent("commands.clear.success.single", var6, ((class_9359)var1.iterator().next()).method_19839()), true);
            }
         } else if (var1.size() != 1) {
            var0.method_42196(new TranslationTextComponent("commands.clear.test.multiple", var6, var1.size()), true);
         } else {
            var0.method_42196(new TranslationTextComponent("commands.clear.test.single", var6, ((class_9359)var1.iterator().next()).method_19839()), true);
         }

         return var6;
      } else if (var1.size() != 1) {
         throw field_20178.create(var1.size());
      } else {
         throw field_20179.create(((class_9359)var1.iterator().next()).method_45509());
      }
   }
}
