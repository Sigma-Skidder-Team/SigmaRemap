package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.NetherPortalBlock;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.server.TicketType;

import java.util.Comparator;
import java.util.Optional;

public class Teleporter {
    private static String[] field19667;
    private final ServerWorld world;

    public Teleporter(ServerWorld var1) {
        this.world = var1;
    }

    public Optional<TeleportationRepositioner> getExistingPortal(BlockPos pos, boolean isNether) {
        PointOfInterestManager pointofinterestmanager = this.world.getPointOfInterestManager();
        int i = !isNether ? 128 : 16;
        pointofinterestmanager.ensureLoadedAndValid(this.world, pos, i);
        Optional<PointOfInterest> optional = pointofinterestmanager.getInSquare((poiType) ->
        {
            return poiType == PointOfInterestType.NETHER_PORTAL;
        }, pos, i, PointOfInterestManager.Status.ANY).sorted(Comparator.<PointOfInterest>comparingDouble((poi) ->
        {
            return poi.getPos().distanceSq(pos);
        }).thenComparingInt((poi) ->
        {
            return poi.getPos().getY();
        })).filter((poi) ->
        {
            return this.world.getBlockState(poi.getPos()).hasProperty(BlockStateProperties.HORIZONTAL_AXIS);
        }).findFirst();

        return optional.<TeleportationRepositioner>map(
                var1x -> {
                    BlockPos var4 = var1x.getPos();
                    this.world.getChunkProvider().registerTicket(TicketType.PORTAL, new ChunkPos(var4), 3, var4);
                    BlockState var5x = this.world.getBlockState(var4);
                    return Class7215.method22658(
                            var4, var5x.<Direction.Axis>get(BlockStateProperties.HORIZONTAL_AXIS), 21, Direction.Axis.Y, 21, var2x -> this.world.getBlockState(var2x) == var5x
                    );
                }
        );
    }

    public Optional<TeleportationRepositioner> method12332(BlockPos var1, Direction.Axis var2) {
        Direction var5 = Direction.getFacingFromAxis(Direction.AxisDirection.POSITIVE, var2);
        double var6 = -1.0;
        BlockPos var8 = null;
        double var9 = -1.0;
        BlockPos var11 = null;
        WorldBorder var12 = this.world.getWorldBorder();
        int var13 = this.world.method6998() - 1;
        BlockPos.Mutable var14 = var1.method8354();

        for (BlockPos.Mutable var16 : BlockPos.method8365(var1, 16, Direction.EAST, Direction.SOUTH)) {
            int var17 = Math.min(var13, this.world.method6736(Heightmap.Type.MOTION_BLOCKING, var16.getX(), var16.getZ()));
            boolean var18 = true;
            if (var12.contains(var16) && var12.contains(var16.method8380(var5, 1))) {
                var16.method8380(var5.getOpposite(), 1);

                for (int var19 = var17; var19 >= 0; var19--) {
                    var16.setY(var19);
                    if (this.world.method7007(var16)) {
                        int var20 = var19;

                        while (var19 > 0 && this.world.method7007(var16.method8379(Direction.DOWN))) {
                            var19--;
                        }

                        if (var19 + 4 <= var13) {
                            int var21 = var20 - var19;
                            if (var21 <= 0 || var21 >= 3) {
                                var16.setY(var19);
                                if (this.method12333(var16, var14, var5, 0)) {
                                    double var22 = var1.distanceSq(var16);
                                    if (this.method12333(var16, var14, var5, -1) && this.method12333(var16, var14, var5, 1) && (var6 == -1.0 || var6 > var22)) {
                                        var6 = var22;
                                        var8 = var16.toImmutable();
                                    }

                                    if (var6 == -1.0 && (var9 == -1.0 || var9 > var22)) {
                                        var9 = var22;
                                        var11 = var16.toImmutable();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        if (var6 == -1.0 && var9 != -1.0) {
            var8 = var11;
            var6 = var9;
        }

        if (var6 == -1.0) {
            var8 = new BlockPos(var1.getX(), MathHelper.clamp(var1.getY(), 70, this.world.method6998() - 10), var1.getZ())
                    .toImmutable();
            Direction var24 = var5.rotateY();
            if (!var12.contains(var8)) {
                return Optional.<TeleportationRepositioner>empty();
            }

            for (int var27 = -1; var27 < 2; var27++) {
                for (int var30 = 0; var30 < 2; var30++) {
                    for (int var32 = -1; var32 < 3; var32++) {
                        BlockState var33 = var32 >= 0 ? Blocks.AIR.getDefaultState() : Blocks.OBSIDIAN.getDefaultState();
                        var14.method8378(var8, var30 * var5.getXOffset() + var27 * var24.getXOffset(), var32, var30 * var5.getZOffset() + var27 * var24.getZOffset());
                        this.world.setBlockState(var14, var33);
                    }
                }
            }
        }

        for (int var25 = -1; var25 < 3; var25++) {
            for (int var28 = -1; var28 < 4; var28++) {
                if (var25 == -1 || var25 == 2 || var28 == -1 || var28 == 3) {
                    var14.method8378(var8, var25 * var5.getXOffset(), var28, var25 * var5.getZOffset());
                    this.world.setBlockState(var14, Blocks.OBSIDIAN.getDefaultState(), 3);
                }
            }
        }

        BlockState var26 = Blocks.NETHER_PORTAL.getDefaultState().with(NetherPortalBlock.field19060, var2);

        for (int var29 = 0; var29 < 2; var29++) {
            for (int var31 = 0; var31 < 3; var31++) {
                var14.method8378(var8, var29 * var5.getXOffset(), var31, var29 * var5.getZOffset());
                this.world.setBlockState(var14, var26, 18);
            }
        }

        return Optional.<TeleportationRepositioner>of(new TeleportationRepositioner(var8.toImmutable(), 2, 3));
    }

    private boolean method12333(BlockPos var1, BlockPos.Mutable var2, Direction var3, int var4) {
        Direction var7 = var3.rotateY();

        for (int var8 = -1; var8 < 3; var8++) {
            for (int var9 = -1; var9 < 4; var9++) {
                var2.method8378(var1, var3.getXOffset() * var8 + var7.getXOffset() * var4, var9, var3.getZOffset() * var8 + var7.getZOffset() * var4);
                if (var9 < 0 && !this.world.getBlockState(var2).getMaterial().isSolid()) {
                    return false;
                }

                if (var9 >= 0 && !this.world.method7007(var2)) {
                    return false;
                }
            }
        }

        return true;
    }
}
