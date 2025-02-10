package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.util.math.BlockPos;

public class Class8627 {
    private static final Minecraft mc = Minecraft.getInstance();

    public static boolean isAreaAir(Class9510 var0) {
        boolean allAir = true;

        for (long var5 : var0.field44281) {
            BlockPos var7 = BlockPos.fromLong(var5);
            if (!mc.world.getBlockState(var7).isAir()) {
                allAir = false;
                break;
            }
        }

        return allAir;
    }

    public static boolean canJump() {
        return mc.player.onGround
                && mc.world.getCollisionShapes(mc.player, mc.player.getBoundingBox().offset(0.0, 1.0, 0.0)).count() == 0L;
    }
}
