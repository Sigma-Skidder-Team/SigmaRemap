package mapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;

import net.minecraft.command.CommandSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.text.TranslationTextComponent;

public class Class8909 {
   public static void method32551(CommandDispatcher<CommandSource> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder) Commands.method18839("give").requires(var0x -> var0x.method20129(2)))
            .then(
               Commands.method18840("targets", Class8700.method31353())
                  .then(
                     ((RequiredArgumentBuilder) Commands.method18840("item", Class8722.method31481())
                           .executes(
                              var0x -> method32552(
                                    (CommandSource)var0x.getSource(), Class8722.method31482(var0x, "item"), Class8700.method31354(var0x, "targets"), 1
                                 )
                           ))
                        .then(
                           Commands.method18840("count", IntegerArgumentType.integer(1))
                              .executes(
                                 var0x -> method32552(
                                       (CommandSource)var0x.getSource(),
                                       Class8722.method31482(var0x, "item"),
                                       Class8700.method31354(var0x, "targets"),
                                       IntegerArgumentType.getInteger(var0x, "count")
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int method32552(CommandSource var0, Class176 var1, Collection<ServerPlayerEntity> var2, int var3) throws CommandSyntaxException {
      for (ServerPlayerEntity var7 : var2) {
         int var8 = var3;

         while (var8 > 0) {
            int var9 = Math.min(var1.method502().getMaxStackSize(), var8);
            var8 -= var9;
            ItemStack var10 = var1.method503(var9, false);
            boolean var11 = var7.inventory.method4045(var10);
            if (var11 && var10.isEmpty()) {
               var10.setCount(1);
               ItemEntity var13 = var7.dropItem(var10, false);
               if (var13 != null) {
                  var13.method4137();
               }

               var7.world
                  .playSound(
                     (PlayerEntity)null,
                     var7.getPosX(),
                     var7.getPosY(),
                     var7.getPosZ(),
                     SoundEvents.field26714,
                     SoundCategory.field14735,
                     0.2F,
                     ((var7.getRNG().nextFloat() - var7.getRNG().nextFloat()) * 0.7F + 1.0F) * 2.0F
                  );
               var7.container.detectAndSendChanges();
            } else {
               ItemEntity var12 = var7.dropItem(var10, false);
               if (var12 != null) {
                  var12.method4132();
                  var12.method4127(var7.getUniqueID());
               }
            }
         }
      }

      if (var2.size() != 1) {
         var0.sendFeedback(new TranslationTextComponent("commands.give.success.single", var3, var1.method503(var3, false).method32173(), var2.size()), true);
      } else {
         var0.sendFeedback(
            new TranslationTextComponent(
               "commands.give.success.single", var3, var1.method503(var3, false).method32173(), ((ServerPlayerEntity)var2.iterator().next()).getDisplayName()
            ),
            true
         );
      }

      return var2.size();
   }
}
