package mapped;

import net.minecraft.client.GameSettings;
import net.minecraft.util.MovementInput;

public class MovementInputFromOptions extends MovementInput {
   private final GameSettings settings;

   public MovementInputFromOptions(GameSettings var1) {
      this.settings = var1;
   }

   @Override
   public void tickMovement(boolean var1) {
      this.forwardKeyDown = this.settings.keyBindForward.isKeyDown();
      this.backKeyDown = this.settings.keyBindBack.isKeyDown();
      this.leftKeyDown = this.settings.keyBindLeft.isKeyDown();
      this.rightKeyDown = this.settings.keyBindRight.isKeyDown();
      this.moveForward = this.forwardKeyDown != this.backKeyDown ? (!this.forwardKeyDown ? -1.0F : 1.0F) : 0.0F;
      this.moveStrafe = this.leftKeyDown != this.rightKeyDown ? (!this.leftKeyDown ? -1.0F : 1.0F) : 0.0F;
      this.jump = this.settings.keyBindJump.isKeyDown();
      this.sneaking = this.settings.keyBindSneak.isKeyDown();
      if (var1) {
         this.moveStrafe = (float)((double)this.moveStrafe * 0.3);
         this.moveForward = (float)((double)this.moveForward * 0.3);
      }
   }
}
