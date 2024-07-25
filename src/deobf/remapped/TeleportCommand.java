package remapped;

import com.mentalfrostbyte.jello.commands.CommandException;
import java.util.Collections;
import java.util.List;

public class TeleportCommand extends Command {
   private class_9782 field_19500;

   public TeleportCommand() {
      super("tp", "Teleports to a player", "teleport");
      this.addArgument(new String[]{"name"});
      this.field_19500 = new class_9782();
   }

   @Override
   public void run(String var1, class_5273[] var2, class_860 var3) throws CommandException {
      if (var2.length == 0) {
         throw new class_2900();
      } else if (var2.length > 1) {
         throw new class_2900("Too many arguments");
      } else if (!field_18219.field_9632.field_41726 && class_314.method_1387()) {
         throw new class_2900("Use this command on ground");
      } else if (var2[0].method_24060().equalsIgnoreCase(field_18219.method_8502().field_6749)) {
         throw new class_2900("You can not tp to yourself");
      } else {
         this.field_19500.field_49648 = null;
         List var6 = class_314.method_1440();
         Collections.sort(var6, new TeleportCommandCompare(this));

         for (Entity var8 : var6) {
            if (var8.method_45509().getString().equalsIgnoreCase(var2[0].method_24060())) {
               this.field_19500.field_49648 = var8;
               break;
            }
         }

         if (this.field_19500.field_49648 != null) {
            this.field_19500.field_49649.method_14773();
            if (!class_314.method_1387()) {
               this.field_19500.field_49649.method_14774();
               this.field_19500.field_49646 = 2;
            } else {
               double var9 = field_18219.field_9632.method_37302();
               double var11 = field_18219.field_9632.method_37309();
               double var13 = field_18219.field_9632.method_37156();
               field_18219.method_8614().method_4813(new class_9515(var9, var11 + 0.2, var13, false));
               field_18219.method_8614().method_4813(new class_9515(var9, var11 + 0.1, var13, false));
               this.field_19500.field_49646 = 1;
               SigmaMainClass.getInstance()
                  .method_3335()
                  .method_27841(new class_8235("Teleport", "Teleporting to \"" + this.field_19500.field_49648.method_45509().getString() + "\"...", 10000));
               this.field_19500.field_49649.method_14776();
            }
         } else {
            throw new class_2900("Could not find entity with name \"" + var2[0].method_24060() + "\"");
         }
      }
   }
}
