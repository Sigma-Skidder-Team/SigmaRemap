// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Spliterator;
import java.util.stream.StreamSupport;
import com.google.common.collect.Streams;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.CubeCoordinateIterator;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

import java.util.stream.Stream;
import java.util.Set;
import java.util.Collections;
import javax.annotation.Nullable;

public interface Class1853 extends IBlockReader
{
    WorldBorder getWorldBorder();
    
    @Nullable
    IBlockReader method6736(final int p0, final int p1);
    
    default boolean method6957(final Entity class399, final VoxelShape class400) {
        return true;
    }
    
    default boolean method6974(final BlockState class7096, final BlockPos class7097, final ISelectionContext class7098) {
        final VoxelShape method21728 = class7096.getCollisionShape(this, class7097, class7098);
        return method21728.isEmpty() || this.method6957(null, method21728.withOffset(class7097.getX(), class7097.getY(), class7097.getZ()));
    }
    
    default boolean method6975(final Entity class399) {
        return this.method6957(class399, VoxelShapes.method24489(class399.getBoundingBox()));
    }
    
    default boolean method6976(final AxisAlignedBB class6221) {
        return this.method6979(null, class6221, Collections.emptySet());
    }
    
    default boolean method6977(final Entity class399) {
        return this.method6979(class399, class399.getBoundingBox(), Collections.emptySet());
    }
    
    default boolean method6978(final Entity class399, final AxisAlignedBB class400) {
        return this.method6979(class399, class400, Collections.emptySet());
    }
    
    default boolean method6979(final Entity class399, final AxisAlignedBB class400, final Set<Entity> set) {
        return this.method6980(class399, class400, set).allMatch(VoxelShape::isEmpty);
    }
    
    default Stream<VoxelShape> method6956(final Entity class399, final AxisAlignedBB class400, final Set<Entity> set) {
        return Stream.empty();
    }
    
    default Stream<VoxelShape> method6980(final Entity class399, final AxisAlignedBB class400, final Set<Entity> set) {
        return Streams.concat(this.method6981(class399, class400), this.method6956(class399, class400, set));
    }
    
    default Stream<VoxelShape> method6981(final Entity class399, final AxisAlignedBB class400) {
        return StreamSupport.stream((Spliterator<VoxelShape>)new Class7583(this, Long.MAX_VALUE, 1280, class399, new CubeCoordinateIterator(MathHelper.floor(class400.minX - 1.0E-7) - 1, MathHelper.floor(class400.minY - 1.0E-7) - 1, MathHelper.floor(class400.minZ - 1.0E-7) - 1, MathHelper.floor(class400.maxX + 1.0E-7) + 1, MathHelper.floor(class400.maxY + 1.0E-7) + 1, MathHelper.floor(class400.maxZ + 1.0E-7) + 1), new Mutable(), (class399 != null) ? ISelectionContext.forEntity(class399) : ISelectionContext.dummy(), VoxelShapes.method24489(class400)), false);
    }
}
