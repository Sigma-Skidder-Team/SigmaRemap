package remapped;

import com.mentalfrostbyte.jello.commands.CommandException;

public class PanicCommand extends Command {
   public PanicCommand() {
      super("panic", "Disable all modules");
   }

   @Override
   public void run(String var1, class_5273[] var2, class_860 var3) throws CommandException {
      if (var2.length > 0) {
         throw new class_2900("Too many arguments");
      } else {
         class_986 var6 = SigmaMainClass.method_3328().method_3298().method_848();
         if (var6.method_4299("Panic")) {
            int var7 = var6.method_4305().size();

            for (int var8 = 0; var8 < var7; var8++) {
               class_1675 var9 = var6.method_4305().get(var8);
               if (var9.field_8677.equals("Panic")) {
                  var6.method_4303(var9);
                  var8--;
                  var7--;
               }
            }
         }

         class_1675 var10 = new class_1675("Panic", new class_1293());
         var6.method_4298(var10);
         var6.method_4300(var10);
         var3.method_3731("All modules disabled.");
      }
   }
}
