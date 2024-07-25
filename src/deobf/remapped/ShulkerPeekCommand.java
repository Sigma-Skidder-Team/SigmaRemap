package remapped;

import com.mentalfrostbyte.jello.commands.CommandException;

public class ShulkerPeekCommand extends Command {
   public ShulkerPeekCommand() {
      super("peek", "Preview a shulker content without opening it", "shulker");
   }

   @Override
   public void run(String var1, class_5273[] var2, class_860 var3) throws CommandException {
      if (var2.length == 0) {
         ItemStack var6 = field_18219.thePlayer.inventory.method_32403();
         if (var6.method_27960() instanceof class_6201 && ((class_6201)var6.method_27960()).method_28392() instanceof class_4314) {
            method_30370(var6);
            var3.method_3731("Now peeking shulker");
         } else {
            throw new class_2900("You must hold the shulker you want to peek into first");
         }
      } else {
         throw new class_2900();
      }
   }

   public static void method_30370(ItemStack var0) {
      CompoundNBT var3 = new CompoundNBT();
      if (var0.method_27990() != null) {
         var3 = var0.method_27990().method_25944();
      }

      class_2831 var4 = class_2831.<ItemStack>method_12872(27, new ItemStack(class_4897.field_25302));
      if (var3 != null && var3.method_25938("BlockEntityTag")) {
         CompoundNBT var5 = var3.method_25937("BlockEntityTag");
         method_30371(var5);
         if (var5.method_25938("Items")) {
            class_3037.method_13882(var5, var4);
         }
      }

      class_4657 var6 = new class_4657(var4.<ItemStack>toArray(new ItemStack[0]));
      CommandManager.method_22657(
         () -> field_18219.method_8609(
               new class_8097(new class_5104(-1, field_18219.thePlayer.inventory, var6), field_18219.thePlayer.inventory, var0.method_28008())
            )
      );
   }

   public static void method_30371(CompoundNBT var0) {
      if (var0.method_25938("Items")) {
         class_3416 var3 = var0.method_25927("Items", 10);

         for (int var4 = 0; var4 < var3.size(); var4++) {
            CompoundNBT var5 = var3.method_15764(var4);
            CompoundNBT var6 = var5.method_25937("tag");
            if (var6.method_25938("ench")) {
               class_3416 var7 = var6.method_25927("ench", 10);
               class_3416 var8 = new class_3416();

               for (int var9 = 0; var9 < var7.size(); var9++) {
                  CompoundNBT var10 = var7.method_15764(var9);
                  short var11 = var10.method_25956("lvl");
                  short var12 = var10.method_25956("id");
                  if (class_9333.field_47642 != null) {
                     String var13 = (String)class_9333.field_47642.get(var12);
                     CompoundNBT var14 = new CompoundNBT();
                     var14.method_25958("lvl", var11);
                     var14.method_25941("id", var13);
                     var8.add(var14);
                  }
               }

               var6.method_25946("Enchantments", var8);
            }
         }
      }
   }
}
