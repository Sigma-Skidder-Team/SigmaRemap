package mapped;

import com.mentalfrostbyte.jello.util.world.BlockUtil;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;

import java.util.ArrayList;
import java.util.List;

public class BlockUtils {

    public static boolean hasAnySolidNeighbor(List<PositionFacing> placePath) {
        if (placePath.size() <= 0) {
            return false;
        } else {
            BlockPos basePos = placePath.get(0).blockPos;
            PositionFacing[] neighbors = new PositionFacing[]{
                    new PositionFacing(basePos.north(), Direction.SOUTH),
                    new PositionFacing(basePos.east(), Direction.WEST),
                    new PositionFacing(basePos.south(), Direction.NORTH),
                    new PositionFacing(basePos.west(), Direction.EAST),
                    new PositionFacing(basePos.down(), Direction.UP),
                    new PositionFacing(basePos.up(), Direction.DOWN)
            };

            for (PositionFacing neighbor : neighbors) {
                if (BlockUtil.getBlockAt(neighbor.blockPos) != Blocks.AIR) {
                    return true;
                }
            }

            return false;
        }
    }

    public static List<PositionFacing> reversePath(List<PositionFacing> path) {
        List<PositionFacing> reversed = new ArrayList<>();

        for (int i = path.size() - 1; i >= 0; i--) {
            reversed.add(path.get(i));
        }

        return reversed;
    }

    public static List<PositionFacing> findPlacementPath(Block expectedBlock, BlockPos startPos, int maxDepth) {
        List<PositionFacing> path = new ArrayList<>();
        if (startPos != null && maxDepth >= 0) {
            if (!BlockUtil.isBlockedPlacementPosition(expectedBlock, startPos)) {
                return path;
            } else {
                PositionFacing[] candidates = new PositionFacing[]{
                        new PositionFacing(startPos.up(), Direction.DOWN),
                        new PositionFacing(startPos.north(), Direction.SOUTH),
                        new PositionFacing(startPos.east(), Direction.WEST),
                        new PositionFacing(startPos.south(), Direction.NORTH),
                        new PositionFacing(startPos.west(), Direction.EAST),
                        new PositionFacing(startPos.down(), Direction.UP)
                };

                for (PositionFacing candidate : candidates) {
                    if (!BlockUtil.isBlockedPlacementPosition(expectedBlock, candidate.blockPos)) {
                        path.add(candidate);
                        return path;
                    }
                }

                for (int depth = 1; depth < maxDepth; depth++) {
                    for (PositionFacing candidate : candidates) {
                        List<PositionFacing> childPath = findPlacementPath(expectedBlock, candidate.blockPos, depth);
                        if (hasAnySolidNeighbor(reversePath(childPath))) {
                            path.addAll(childPath);
                            return path.size() <= 1 ? path : reversePath(path);
                        }
                    }
                }

                return path;
            }
        } else {
            return path;
        }
    }
}
