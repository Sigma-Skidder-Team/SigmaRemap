package remapped;

import com.mentalfrostbyte.jello.commands.CommandException;

public class SelfDamageCommand extends Command {
   public SelfDamageCommand() {
      super("damage", "Damages you", "dmg");
      this.addArgument(new String[]{"hearts"});
   }

   @Override
   public void run(String var1, class_5273[] var2, class_860 var3) throws CommandException {
      if (var2.length == 0) {
         throw new class_2900();
      } else if (var2.length > 1) {
         throw new class_2900("Too many arguments");
      } else if (var2[0].method_24063() != class_1451.field_7814) {
         throw new class_2900("Invalid heart damage amount \"" + var2[0].method_24060() + "\"");
      } else {
         for (int var6 = 0; (double)var6 < 80.0 + 40.0 * (var2[0].method_24062() - 0.5); var6++) {
            field_18219.method_8614()
               .method_4813(
                  new class_9515(
                     field_18219.field_9632.method_37302(), field_18219.field_9632.method_37309() + 0.06, field_18219.field_9632.method_37156(), false
                  )
               );
            field_18219.method_8614()
               .method_4813(
                  new class_9515(field_18219.field_9632.method_37302(), field_18219.field_9632.method_37309(), field_18219.field_9632.method_37156(), false)
               );
         }

         field_18219.method_8614()
            .method_4813(
               new class_9515(field_18219.field_9632.method_37302(), field_18219.field_9632.method_37309(), field_18219.field_9632.method_37156(), false)
            );
         field_18219.method_8614()
            .method_4813(
               new class_9515(field_18219.field_9632.method_37302(), field_18219.field_9632.method_37309() + 0.02, field_18219.field_9632.method_37156(), false)
            );
         var3.method_3731("Sent damage packets");
      }
   }
}
