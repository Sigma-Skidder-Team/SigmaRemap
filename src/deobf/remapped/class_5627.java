package remapped;

import com.mentalfrostbyte.jello.commands.CommandException;
import java.util.Collections;

public class class_5627 extends class_3720 {
   public class_5627() {
      super("vclip", "Vertical clip through blocks", "vc");
      this.method_17259(new String[]{"offset"});
   }

   @Override
   public void run(String var1, class_5273[] var2, class_860 var3) throws CommandException {
      if (var2.length != 0) {
         if (var2.length <= 1) {
            if (var2[0].method_24063() != class_1451.field_7814) {
               throw new class_2900("Invalid vertical distance \"" + var2[0].method_24060() + "\"");
            } else {
               field_18219.method_8614()
                  .method_1894(
                     new class_509(
                        field_18219.field_9632.method_37302(),
                        field_18219.field_9632.method_37309() + var2[0].method_24062(),
                        field_18219.field_9632.method_37156(),
                        field_18219.field_9632.field_41701,
                        field_18219.field_9632.field_41755,
                        Collections.<class_8089>emptySet(),
                        (int)(2.147483647E9 * Math.random())
                     )
                  );
               var3.method_3731("VClip'd to position " + (field_18219.field_9632.method_37309() + var2[0].method_24062()));
            }
         } else {
            throw new class_2900("Too many arguments");
         }
      } else {
         throw new class_2900();
      }
   }
}
