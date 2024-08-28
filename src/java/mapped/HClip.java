package mapped;

import com.mentalfrostbyte.jello.command.Command;
import com.mentalfrostbyte.jello.command.CommandException;
import java.util.Collections;

public class HClip extends Command {
   public HClip() {
      super("hclip", "Horizontal clip", "hc");
      this.registerSubCommands(new String[]{"offset"});
   }

   @Override
   public void run(String var1, Class8623[] var2, Class6669 var3) throws CommandException {
      if (var2.length != 0) {
         if (var2.length <= 1) {
            if (var2[0].method30895() != Class2193.field14336) {
               throw new CommandException("Invalid distance \"" + var2[0].method30899() + "\"");
            } else {
               float var6 = (float)Math.toRadians((double)(mc.player.field5031 + 90.0F));
               double var7 = (double) MathHelper.method37764(var6) * var2[0].method30896();
               double var9 = (double) MathHelper.method37763(var6) * var2[0].method30896();
               mc.getClientPlayNetHandler()
                  .method15728(
                     new Class5473(
                        mc.player.getPosX() + var7,
                        mc.player.getPosY(),
                        mc.player.getPosZ() + var9,
                        mc.player.field5031,
                        mc.player.field5032,
                        Collections.<Class2033>emptySet(),
                        0
                     )
                  );
               var3.method20327("Successfully HClip'd");
            }
         } else {
            throw new CommandException("Too many arguments");
         }
      } else {
         throw new CommandException();
      }
   }
}
