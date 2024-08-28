package mapped;

import com.mentalfrostbyte.jello.command.Command;
import com.mentalfrostbyte.jello.command.CommandException;

import com.mentalfrostbyte.jello.command.CommandManager;

public class Peek extends Command {
   public Peek() {
      super("peek", "Preview a shulker content without opening it", "shulker");
   }

   @Override
   public void run(String var1, Class8623[] var2, Class6669 var3) throws CommandException {
      if (var2.length == 0) {
         Class8848 var6 = mc.field1339.field4902.method4028();
         if (var6.method32107() instanceof Class3292 && ((Class3292)var6.method32107()).method11845() instanceof Class3241) {
            method18337(var6);
            var3.method20327("Now peeking shulker");
         } else {
            throw new CommandException("You must hold the shulker you want to peek into first");
         }
      } else {
         throw new CommandException();
      }
   }

   public static void method18337(Class8848 var0) {
      Class39 var3 = new Class39();
      if (var0.method32142() != null) {
         var3 = var0.method32142().method79();
      }

      Class25<Class8848> var4 = Class25.method68(27, new Class8848(Class8514.field37222));
      if (var3 != null && var3.method118("BlockEntityTag")) {
         Class39 var5 = var3.method130("BlockEntityTag");
         method18338(var5);
         if (var5.method118("Items")) {
            Class7920.method26567(var5, var4);
         }
      }

      Class927 var6 = new Class927(var4.toArray(new Class8848[0]));
      CommandManager.method30238(
         () -> mc.displayGuiScreen(new Class873(new Class5814(-1, mc.field1339.field4902, var6), mc.field1339.field4902, var0.method32149()))
      );
   }

   public static void method18338(Class39 var0) {
      if (var0.method118("Items")) {
         Class41 var3 = var0.method131("Items", 10);

         for (int var4 = 0; var4 < var3.size(); var4++) {
            Class39 var5 = var3.method153(var4);
            Class39 var6 = var5.method130("tag");
            if (var6.method118("ench")) {
               Class41 var7 = var6.method131("ench", 10);
               Class41 var8 = new Class41();

               for (int var9 = 0; var9 < var7.size(); var9++) {
                  Class39 var10 = var7.method153(var9);
                  short var11 = var10.method121("lvl");
                  short var12 = var10.method121("id");
                  if (Class5980.field26051 != null) {
                     String var13 = (String)Class5980.field26051.get(var12);
                     Class39 var14 = new Class39();
                     var14.method101("lvl", var11);
                     var14.method109("id", var13);
                     var8.add(var14);
                  }
               }

               var6.method99("Enchantments", var8);
            }
         }
      }
   }
}
