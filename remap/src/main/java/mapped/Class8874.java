// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

public class Class8874
{
    private static String[] field37302;
    private final Class1851 field37303;
    private final Axis field37304;
    private final Direction field37305;
    private final Direction field37306;
    private int field37307;
    private BlockPos field37308;
    private int field37309;
    private int field37310;
    
    public Class8874(final Class1851 field37303, BlockPos method1139, final Axis field37304) {
        this.field37303 = field37303;
        this.field37304 = field37304;
        if (field37304 != Axis.X) {
            this.field37306 = Direction.NORTH;
            this.field37305 = Direction.SOUTH;
        }
        else {
            this.field37306 = Direction.EAST;
            this.field37305 = Direction.WEST;
        }
        while (method1139.getY() > method1139.getY() - 21) {
            if (method1139.getY() <= 0) {
                break;
            }
            if (!this.method31194(field37303.getBlockState(method1139.method1139()))) {
                break;
            }
            method1139 = method1139.method1139();
        }
        final int n = this.method31190(method1139, this.field37306) - 1;
        if (n >= 0) {
            this.field37308 = method1139.method1150(this.field37306, n);
            this.field37310 = this.method31190(this.field37308, this.field37305);
            if (this.field37310 < 2 || this.field37310 > 21) {
                this.field37308 = null;
                this.field37310 = 0;
            }
        }
        if (this.field37308 != null) {
            this.field37309 = this.method31193();
        }
    }
    
    public int method31190(final BlockPos class354, final Direction class355) {
        int i;
        for (i = 0; i < 22; ++i) {
            final BlockPos method1150 = class354.method1150(class355, i);
            if (!this.method31194(this.field37303.getBlockState(method1150))) {
                break;
            }
            if (this.field37303.getBlockState(method1150.method1139()).getBlock() != Class7521.field29286) {
                break;
            }
        }
        return (this.field37303.getBlockState(class354.method1150(class355, i)).getBlock() != Class7521.field29286) ? 0 : i;
    }
    
    public int method31191() {
        return this.field37309;
    }
    
    public int method31192() {
        return this.field37310;
    }
    
    public int method31193() {
        this.field37309 = 0;
    Label_0014:
        while (this.field37309 < 21) {
            for (int i = 0; i < this.field37310; ++i) {
                final BlockPos method1138 = this.field37308.method1150(this.field37305, i).method1138(this.field37309);
                final BlockState method1139 = this.field37303.getBlockState(method1138);
                if (!this.method31194(method1139)) {
                    break Label_0014;
                }
                if (method1139.getBlock() == Class7521.field29341) {
                    ++this.field37307;
                }
                if (i != 0) {
                    if (i == this.field37310 - 1) {
                        if (this.field37303.getBlockState(method1138.method1149(this.field37305)).getBlock() != Class7521.field29286) {
                            break Label_0014;
                        }
                    }
                }
                else if (this.field37303.getBlockState(method1138.method1149(this.field37306)).getBlock() != Class7521.field29286) {
                    break Label_0014;
                }
            }
            ++this.field37309;
        }
        for (int j = 0; j < this.field37310; ++j) {
            if (this.field37303.getBlockState(this.field37308.method1150(this.field37305, j).method1138(this.field37309)).getBlock() != Class7521.field29286) {
                this.field37309 = 0;
                break;
            }
        }
        if (this.field37309 <= 21 && this.field37309 >= 3) {
            return this.field37309;
        }
        this.field37308 = null;
        this.field37310 = 0;
        return this.field37309 = 0;
    }
    
    public boolean method31194(final BlockState class7096) {
        final Block method21696 = class7096.getBlock();
        if (!class7096.method21706()) {
            if (method21696 != Class7521.field29289) {
                if (method21696 != Class7521.field29341) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean method31195() {
        if (this.field37308 != null) {
            if (this.field37310 >= 2) {
                if (this.field37310 <= 21) {
                    if (this.field37309 >= 3) {
                        if (this.field37309 <= 21) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    public void method31196() {
        for (int i = 0; i < this.field37310; ++i) {
            final BlockPos method1150 = this.field37308.method1150(this.field37305, i);
            for (int j = 0; j < this.field37309; ++j) {
                this.field37303.setBlockState(method1150.method1138(j), ((StateHolder<O, BlockState>)Class7521.field29341.getDefaultState()).with(Class3998.field18018, this.field37304), 18);
            }
        }
    }
    
    private boolean method31197() {
        return this.field37307 >= this.field37310 * this.field37309;
    }
    
    public boolean method31198() {
        return this.method31195() && this.method31197();
    }
}
