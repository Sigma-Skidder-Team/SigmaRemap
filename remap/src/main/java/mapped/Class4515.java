// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.Direction;
import org.apache.logging.log4j.LogManager;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.StringReader;
import java.util.Random;
import org.apache.logging.log4j.Logger;

public abstract class Class4515 extends Class4473
{
    private static final Logger field19917;
    public Class6585 field19918;
    public Class9092 field19919;
    public BlockPos field19920;
    
    public Class4515(final Class9520 class9520, final int n) {
        super(class9520, n);
    }
    
    public Class4515(final Class9520 class9520, final CompoundNBT class9521) {
        super(class9520, class9521);
        this.field19920 = new BlockPos(class9521.getInt("TPX"), class9521.getInt("TPY"), class9521.getInt("TPZ"));
    }
    
    public void method13510(final Class6585 field19918, final BlockPos field19919, final Class9092 field19920) {
        this.field19918 = field19918;
        this.method13456(Direction.NORTH);
        this.field19920 = field19919;
        this.field19919 = field19920;
        this.field19849 = field19918.method19966(field19920, field19919);
    }
    
    @Override
    public void method13415(final CompoundNBT class51) {
        class51.putInt("TPX", this.field19920.getX());
        class51.putInt("TPY", this.field19920.getY());
        class51.putInt("TPZ", this.field19920.getZ());
    }
    
    @Override
    public boolean method13421(final Class1851 class1851, final Class6346<?> class1852, final Random random, final MutableBoundingBox class1853, final ChunkPos class1854) {
        this.field19919.method32849(class1853);
        this.field19849 = this.field19918.method19966(this.field19919, this.field19920);
        if (this.field19918.method19956(class1851, this.field19920, this.field19919, 2)) {
            for (final Class9038 class1855 : this.field19918.method19950(this.field19920, this.field19919, Blocks.STRUCTURE_BLOCK)) {
                if (class1855.field38250 != null && Class102.valueOf(class1855.field38250.getString("mode")) == Class102.field308) {
                    this.method13511(class1855.field38250.getString("metadata"), class1855.field38248, class1851, random, class1853);
                }
            }
            for (final Class9038 class1856 : this.field19918.method19950(this.field19920, this.field19919, Blocks.JIGSAW)) {
                if (class1856.field38250 != null) {
                    final String method323 = class1856.field38250.getString("final_state");
                    final Class7572 class1857 = new Class7572(new StringReader(method323), false);
                    BlockState method324 = Blocks.AIR.getDefaultState();
                    try {
                        class1857.method23802(true);
                        final BlockState method325 = class1857.method23799();
                        if (method325 != null) {
                            method324 = method325;
                        }
                        else {
                            Class4515.field19917.error("Error while parsing blockstate {} in jigsaw block @ {}", method323, class1856.field38248);
                        }
                    }
                    catch (final CommandSyntaxException ex) {
                        Class4515.field19917.error("Error while parsing blockstate {} in jigsaw block @ {}", method323, class1856.field38248);
                    }
                    class1851.setBlockState(class1856.field38248, method324, 3);
                }
            }
        }
        return true;
    }
    
    public abstract void method13511(final String p0, final BlockPos p1, final Class1851 p2, final Random p3, final MutableBoundingBox p4);
    
    @Override
    public void method13454(final int n, final int n2, final int n3) {
        super.method13454(n, n2, n3);
        this.field19920 = this.field19920.add(n, n2, n3);
    }
    
    @Override
    public Class2052 method13457() {
        return this.field19919.method32856();
    }
    
    static {
        field19917 = LogManager.getLogger();
    }
}
