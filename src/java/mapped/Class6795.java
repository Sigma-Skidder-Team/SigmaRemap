package mapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

import net.minecraft.command.CommandSource;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TranslationTextComponent;

public class Class6795 {
   private static final DynamicCommandExceptionType field29598 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("commands.enchant.failed.entity", var0)
   );
   private static final DynamicCommandExceptionType field29599 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("commands.enchant.failed.itemless", var0)
   );
   private static final DynamicCommandExceptionType field29600 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("commands.enchant.failed.incompatible", var0)
   );
   private static final Dynamic2CommandExceptionType field29601 = new Dynamic2CommandExceptionType(
      (var0, var1) -> new TranslationTextComponent("commands.enchant.failed.level", var0, var1)
   );
   private static final SimpleCommandExceptionType field29602 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.enchant.failed"));

   public static void method20701(CommandDispatcher<CommandSource> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)Class6099.method18839("enchant").requires(var0x -> var0x.method20129(2)))
            .then(
               Class6099.method18840("targets", Class8700.method31347())
                  .then(
                     ((RequiredArgumentBuilder)Class6099.method18840("enchantment", Class9534.method36862())
                           .executes(
                              var0x -> method20702(
                                    (CommandSource)var0x.getSource(), Class8700.method31348(var0x, "targets"), Class9534.method36863(var0x, "enchantment"), 1
                                 )
                           ))
                        .then(
                           Class6099.method18840("level", IntegerArgumentType.integer(0))
                              .executes(
                                 var0x -> method20702(
                                       (CommandSource)var0x.getSource(),
                                       Class8700.method31348(var0x, "targets"),
                                       Class9534.method36863(var0x, "enchantment"),
                                       IntegerArgumentType.getInteger(var0x, "level")
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int method20702(CommandSource var0, Collection<? extends Entity> var1, Enchantment var2, int var3) throws CommandSyntaxException {
      if (var3 > var2.method18809()) {
         throw field29601.create(var3, var2.method18809());
      } else {
         int var6 = 0;

         for (Entity var8 : var1) {
            if (!(var8 instanceof LivingEntity)) {
               if (var1.size() == 1) {
                  throw field29598.create(var8.getName().getString());
               }
            } else {
               LivingEntity var9 = (LivingEntity)var8;
               ItemStack var10 = var9.getHeldItemMainhand();
               if (var10.isEmpty()) {
                  if (var1.size() == 1) {
                     throw field29599.create(var9.getName().getString());
                  }
               } else if (var2.method18821(var10) && EnchantmentHelper.method26345(EnchantmentHelper.method26312(var10).keySet(), var2)) {
                  var10.method32162(var2, var3);
                  var6++;
               } else if (var1.size() == 1) {
                  throw field29600.create(var10.getItem().method11731(var10).getString());
               }
            }
         }

         if (var6 != 0) {
            if (var1.size() != 1) {
               var0.method20179(new TranslationTextComponent("commands.enchant.success.multiple", var2.method18820(var3), var1.size()), true);
            } else {
               var0.method20179(
                  new TranslationTextComponent("commands.enchant.success.single", var2.method18820(var3), ((Entity)var1.iterator().next()).getDisplayName()),
                  true
               );
            }

            return var6;
         } else {
            throw field29602.create();
         }
      }
   }
}
