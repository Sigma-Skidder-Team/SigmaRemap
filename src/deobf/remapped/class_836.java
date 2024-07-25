package remapped;

import com.mentalfrostbyte.jello.commands.CommandException;
import java.util.Collections;

public class class_836 extends class_3720 {
   public class_836() {
      super("hclip", "Horizontal clip", "hc");
      this.method_17259(new String[]{"offset"});
   }

   @Override
   public void run(String var1, class_5273[] var2, class_860 var3) throws CommandException {
      if (var2.length != 0) {
         if (var2.length <= 1) {
            if (var2[0].method_24063() != class_1451.field_7814) {
               throw new class_2900("Invalid distance \"" + var2[0].method_24060() + "\"");
            } else {
               float var6 = (float)Math.toRadians((double)(field_18219.field_9632.field_41701 + 90.0F));
               double var7 = (double)class_9299.method_42840(var6) * var2[0].method_24062();
               double var9 = (double)class_9299.method_42818(var6) * var2[0].method_24062();
               field_18219.method_8614()
                  .method_1894(
                     new class_509(
                        field_18219.field_9632.method_37302() + var7,
                        field_18219.field_9632.method_37309(),
                        field_18219.field_9632.method_37156() + var9,
                        field_18219.field_9632.field_41701,
                        field_18219.field_9632.field_41755,
                        Collections.<class_8089>emptySet(),
                        0
                     )
                  );
               var3.method_3731("Successfully HClip'd");
            }
         } else {
            throw new class_2900("Too many arguments");
         }
      } else {
         throw new class_2900();
      }
   }
}
