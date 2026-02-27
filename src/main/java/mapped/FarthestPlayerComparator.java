package mapped;

import com.mentalfrostbyte.jello.util.world.BlockUtil;
import net.minecraft.entity.player.PlayerEntity;

import java.util.Comparator;

public final class FarthestPlayerComparator implements Comparator<PlayerEntity> {
    @Override
    public int compare(PlayerEntity first, PlayerEntity second) {
        float distanceFirst = BlockUtil.getMC().player.getDistance(first);
        float distanceSecond = BlockUtil.getMC().player.getDistance(second);

        if (distanceFirst < distanceSecond) {
            return 1; // farther first
        } else if (distanceFirst > distanceSecond) {
            return -1; // farther first
        }

        return 0;
    }
}
