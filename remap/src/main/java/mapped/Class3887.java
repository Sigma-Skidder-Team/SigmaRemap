// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class Class3887 extends Class3874
{
    private static String[] field17519;
    public static final VoxelShape field17549;
    
    public Class3887(final Properties class9288) {
        super(class9288);
    }
    
    @Override
    public VoxelShape method11808(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return Class3887.field17549;
    }
    
    @Override
    public boolean method11943(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098) {
        final Block method21696 = class7096.getBlock();
        if (method21696 != Blocks.field29175) {
            if (method21696 != Blocks.field29176) {
                if (method21696 != Blocks.field29546) {
                    if (method21696 != Blocks.field29482) {
                        if (method21696 != Blocks.field29483) {
                            if (method21696 != Blocks.field29484) {
                                if (method21696 != Blocks.field29485) {
                                    if (method21696 != Blocks.field29486) {
                                        if (method21696 != Blocks.field29487) {
                                            if (method21696 != Blocks.field29488) {
                                                if (method21696 != Blocks.field29489) {
                                                    if (method21696 != Blocks.field29490) {
                                                        if (method21696 != Blocks.field29491) {
                                                            if (method21696 != Blocks.field29492) {
                                                                if (method21696 != Blocks.field29493) {
                                                                    if (method21696 != Blocks.field29494) {
                                                                        if (method21696 != Blocks.field29495) {
                                                                            if (method21696 != Blocks.field29496) {
                                                                                if (method21696 != Blocks.field29497) {
                                                                                    if (method21696 != Blocks.DIRT) {
                                                                                        if (method21696 != Blocks.COARSE_DIRT) {
                                                                                            return method21696 == Blocks.PODZOL;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
    
    static {
        field17549 = Block.method11778(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);
    }
}
