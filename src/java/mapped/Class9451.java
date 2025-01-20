package mapped;

import net.minecraft.client.GameSettings;
import net.minecraft.util.MovementInput;

public class Class9451 extends MovementInput {
   private static String[] field43904;
   private final GameSettings field43905;

   public Class9451(GameSettings var1) {
      this.field43905 = var1;
   }

   @Override
   public void tickMovement(boolean var1) {
      this.forwardKeyDown = this.field43905.keyBindForward.isKeyDown();
      this.backKeyDown = this.field43905.keyBindBack.isKeyDown();
      this.leftKeyDown = this.field43905.keyBindLeft.isKeyDown();
      this.rightKeyDown = this.field43905.keyBindRight.isKeyDown();
      this.moveForward = this.forwardKeyDown != this.backKeyDown ? (!this.forwardKeyDown ? -1.0F : 1.0F) : 0.0F;
      this.moveStrafe = this.leftKeyDown != this.rightKeyDown ? (!this.leftKeyDown ? -1.0F : 1.0F) : 0.0F;
      this.jump = this.field43905.keyBindJump.isKeyDown();
      this.sneaking = this.field43905.keyBindSneak.isKeyDown();
      if (var1) {
         this.moveStrafe = (float)((double)this.moveStrafe * 0.3);
         this.moveForward = (float)((double)this.moveForward * 0.3);
      }
   }
}
