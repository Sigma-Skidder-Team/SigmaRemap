package mapped;

import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.math.ChunkPos;

import java.util.stream.Stream;

public interface Class1650 {
   Stream<ServerPlayerEntity> getTrackingPlayers(ChunkPos var1, boolean var2);
}
