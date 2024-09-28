package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.util.HandSide;

public interface IHasArm {
   void translateHand(HandSide var1, MatrixStack var2);
}
