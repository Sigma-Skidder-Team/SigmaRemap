package mapped;

import com.mentalfrostbyte.jello.util.world.BlockUtil;
import net.minecraft.entity.Entity;

import java.util.Comparator;

public final class NearestEntityComparator implements Comparator<Entity> {
    @Override
    public int compare(Entity first, Entity second) {
        float distanceFirst = BlockUtil.getMC().player.getDistance(first);
        float distanceSecond = BlockUtil.getMC().player.getDistance(second);

        if (distanceFirst < distanceSecond) {
            return -1; // nearer first
        } else if (distanceFirst > distanceSecond) {
            return 1; // nearer first
        }

        return 0;
    }
}
