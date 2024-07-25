package remapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import net.minecraft.util.text.TranslationTextComponent;

public class class_959 {
   private static final DynamicCommandExceptionType field_4928 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("commands.enchant.failed.entity", var0)
   );
   private static final DynamicCommandExceptionType field_4927 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("commands.enchant.failed.itemless", var0)
   );
   private static final DynamicCommandExceptionType field_4930 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("commands.enchant.failed.incompatible", var0)
   );
   private static final Dynamic2CommandExceptionType field_4931 = new Dynamic2CommandExceptionType(
      (var0, var1) -> new TranslationTextComponent("commands.enchant.failed.level", var0, var1)
   );
   private static final SimpleCommandExceptionType field_4926 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.enchant.failed"));

   public static void method_4224(CommandDispatcher<class_9155> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("enchant").requires(var0x -> var0x.method_40314(2)))
            .then(
               class_465.method_2236("targets", class_5601.method_25407())
                  .then(
                     ((RequiredArgumentBuilder)class_465.method_2236("enchantment", class_8755.method_40199())
                           .executes(
                              var0x -> method_4222(
                                    (class_9155)var0x.getSource(), class_5601.method_25410(var0x, "targets"), class_8755.method_40198(var0x, "enchantment"), 1
                                 )
                           ))
                        .then(
                           class_465.method_2236("level", IntegerArgumentType.integer(0))
                              .executes(
                                 var0x -> method_4222(
                                       (class_9155)var0x.getSource(),
                                       class_5601.method_25410(var0x, "targets"),
                                       class_8755.method_40198(var0x, "enchantment"),
                                       IntegerArgumentType.getInteger(var0x, "level")
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int method_4222(class_9155 var0, Collection<? extends Entity> var1, class_4382 var2, int var3) throws CommandSyntaxException {
      if (var3 > var2.method_20417()) {
         throw field_4931.create(var3, var2.method_20417());
      } else {
         int var6 = 0;

         for (Entity var8 : var1) {
            if (!(var8 instanceof LivingEntity)) {
               if (var1.size() == 1) {
                  throw field_4928.create(var8.method_45509().getString());
               }
            } else {
               LivingEntity var9 = (LivingEntity)var8;
               ItemStack var10 = var9.method_26446();
               if (var10.method_28022()) {
                  if (var1.size() == 1) {
                     throw field_4927.create(var9.method_45509().getString());
                  }
               } else if (var2.method_20430(var10) && class_2931.method_13428(class_2931.method_13402(var10).keySet(), var2)) {
                  var10.method_28031(var2, var3);
                  var6++;
               } else if (var1.size() == 1) {
                  throw field_4930.create(var10.method_27960().method_11249(var10).getString());
               }
            }
         }

         if (var6 != 0) {
            if (var1.size() != 1) {
               var0.method_42196(new TranslationTextComponent("commands.enchant.success.multiple", var2.method_20423(var3), var1.size()), true);
            } else {
               var0.method_42196(
                  new TranslationTextComponent("commands.enchant.success.single", var2.method_20423(var3), ((Entity)var1.iterator().next()).method_19839()),
                  true
               );
            }

            return var6;
         } else {
            throw field_4926.create();
         }
      }
   }
}
