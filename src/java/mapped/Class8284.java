package mapped;

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

public class Class8284 {
   private static final DynamicCommandExceptionType field35587 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("clear.failed.single", var0)
   );
   private static final DynamicCommandExceptionType field35588 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("clear.failed.multiple", var0)
   );

   public static void method28947(CommandDispatcher<Class6619> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class6099.method18839("clear").requires(var0x -> var0x.method20129(2)))
               .executes(
                  var0x -> method28948(
                        (Class6619)var0x.getSource(), Collections.<Class878>singleton(((Class6619)var0x.getSource()).method20175()), var0xx -> true, -1
                     )
               ))
            .then(
               ((RequiredArgumentBuilder)Class6099.method18840("targets", Class8700.method31353())
                     .executes(var0x -> method28948((Class6619)var0x.getSource(), Class8700.method31354(var0x, "targets"), var0xx -> true, -1)))
                  .then(
                     ((RequiredArgumentBuilder)Class6099.method18840("item", Class7584.method24822())
                           .executes(
                              var0x -> method28948(
                                    (Class6619)var0x.getSource(), Class8700.method31354(var0x, "targets"), Class7584.method24823(var0x, "item"), -1
                                 )
                           ))
                        .then(
                           Class6099.method18840("maxCount", IntegerArgumentType.integer(0))
                              .executes(
                                 var0x -> method28948(
                                       (Class6619)var0x.getSource(),
                                       Class8700.method31354(var0x, "targets"),
                                       Class7584.method24823(var0x, "item"),
                                       IntegerArgumentType.getInteger(var0x, "maxCount")
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int method28948(Class6619 var0, Collection<Class878> var1, Predicate<ItemStack> var2, int var3) throws CommandSyntaxException {
      int var6 = 0;

      for (Class878 var8 : var1) {
         var6 += var8.field4902.method4040(var2, var3, var8.field4904.method18232());
         var8.field4905.method18130();
         var8.field4904.method18106(var8.field4902);
         var8.method2773();
      }

      if (var6 != 0) {
         if (var3 != 0) {
            if (var1.size() != 1) {
               var0.method20179(new TranslationTextComponent("commands.clear.success.multiple", var6, var1.size()), true);
            } else {
               var0.method20179(new TranslationTextComponent("commands.clear.success.single", var6, ((Class878)var1.iterator().next()).getDisplayName()), true);
            }
         } else if (var1.size() != 1) {
            var0.method20179(new TranslationTextComponent("commands.clear.test.multiple", var6, var1.size()), true);
         } else {
            var0.method20179(new TranslationTextComponent("commands.clear.test.single", var6, ((Class878)var1.iterator().next()).getDisplayName()), true);
         }

         return var6;
      } else if (var1.size() != 1) {
         throw field35588.create(var1.size());
      } else {
         throw field35587.create(((Class878)var1.iterator().next()).method2941());
      }
   }
}
