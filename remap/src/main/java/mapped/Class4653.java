// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;

public class Class4653 extends Class4651
{
    private static String[] field20136;
    private float field20138;
    private float field20139;
    
    @Override
    public void method13900(final Class1854 class1854, final Class759 class1855) {
        super.method13900(class1854, class1855);
        class1855.method4145(Class257.field1211, 0.0f);
        this.field20138 = class1855.method4144(Class257.field1207);
        class1855.method4145(Class257.field1207, 6.0f);
        this.field20139 = class1855.method4144(Class257.field1212);
        class1855.method4145(Class257.field1212, 4.0f);
    }
    
    @Override
    public void method13901() {
        this.field20141.method4145(Class257.field1207, this.field20138);
        this.field20141.method4145(Class257.field1212, this.field20139);
        super.method13901();
    }
    
    @Override
    public Class6772 method13902() {
        return this.method13919(MathHelper.floor(this.field20141.getBoundingBox().minX), MathHelper.floor(this.field20141.getBoundingBox().minY + 0.5), MathHelper.floor(this.field20141.getBoundingBox().minZ));
    }
    
    @Override
    public Class6773 method13903(final double n, final double n2, final double n3) {
        return new Class6773(this.method13919(MathHelper.floor(n), MathHelper.floor(n2 + 0.5), MathHelper.floor(n3)));
    }
    
    @Override
    public int method13904(final Class6772[] array, final Class6772 class6772) {
        int n = 0;
        final double method13920 = this.method13920(new BlockPos(class6772.field26589, class6772.field26590, class6772.field26591));
        final Class6772 method13921 = this.method13921(class6772.field26589, class6772.field26590, class6772.field26591 + 1, 1, method13920);
        final Class6772 method13922 = this.method13921(class6772.field26589 - 1, class6772.field26590, class6772.field26591, 1, method13920);
        final Class6772 method13923 = this.method13921(class6772.field26589 + 1, class6772.field26590, class6772.field26591, 1, method13920);
        final Class6772 method13924 = this.method13921(class6772.field26589, class6772.field26590, class6772.field26591 - 1, 1, method13920);
        final Class6772 method13925 = this.method13921(class6772.field26589, class6772.field26590 + 1, class6772.field26591, 0, method13920);
        final Class6772 method13926 = this.method13921(class6772.field26589, class6772.field26590 - 1, class6772.field26591, 1, method13920);
        if (method13921 != null) {
            if (!method13921.field26598) {
                array[n++] = method13921;
            }
        }
        if (method13922 != null) {
            if (!method13922.field26598) {
                array[n++] = method13922;
            }
        }
        if (method13923 != null) {
            if (!method13923.field26598) {
                array[n++] = method13923;
            }
        }
        if (method13924 != null) {
            if (!method13924.field26598) {
                array[n++] = method13924;
            }
        }
        if (method13925 != null) {
            if (!method13925.field26598) {
                array[n++] = method13925;
            }
        }
        if (method13926 != null) {
            if (!method13926.field26598) {
                array[n++] = method13926;
            }
        }
        boolean b = false;
        Label_0397: {
            if (method13924 != null) {
                if (method13924.field26601 != Class257.field1206) {
                    if (method13924.field26600 == 0.0f) {
                        b = false;
                        break Label_0397;
                    }
                }
            }
            b = true;
        }
        final boolean b2 = b;
        boolean b3 = false;
        Label_0443: {
            if (method13921 != null) {
                if (method13921.field26601 != Class257.field1206) {
                    if (method13921.field26600 == 0.0f) {
                        b3 = false;
                        break Label_0443;
                    }
                }
            }
            b3 = true;
        }
        final boolean b4 = b3;
        boolean b5 = false;
        Label_0489: {
            if (method13923 != null) {
                if (method13923.field26601 != Class257.field1206) {
                    if (method13923.field26600 == 0.0f) {
                        b5 = false;
                        break Label_0489;
                    }
                }
            }
            b5 = true;
        }
        final boolean b6 = b5;
        boolean b7 = false;
        Label_0535: {
            if (method13922 != null) {
                if (method13922.field26601 != Class257.field1206) {
                    if (method13922.field26600 == 0.0f) {
                        b7 = false;
                        break Label_0535;
                    }
                }
            }
            b7 = true;
        }
        final boolean b8 = b7;
        if (b2) {
            if (b8) {
                final Class6772 method13927 = this.method13921(class6772.field26589 - 1, class6772.field26590, class6772.field26591 - 1, 1, method13920);
                if (method13927 != null) {
                    if (!method13927.field26598) {
                        array[n++] = method13927;
                    }
                }
            }
        }
        if (b2) {
            if (b6) {
                final Class6772 method13928 = this.method13921(class6772.field26589 + 1, class6772.field26590, class6772.field26591 - 1, 1, method13920);
                if (method13928 != null) {
                    if (!method13928.field26598) {
                        array[n++] = method13928;
                    }
                }
            }
        }
        if (b4) {
            if (b8) {
                final Class6772 method13929 = this.method13921(class6772.field26589 - 1, class6772.field26590, class6772.field26591 + 1, 1, method13920);
                if (method13929 != null) {
                    if (!method13929.field26598) {
                        array[n++] = method13929;
                    }
                }
            }
        }
        if (b4) {
            if (b6) {
                final Class6772 method13930 = this.method13921(class6772.field26589 + 1, class6772.field26590, class6772.field26591 + 1, 1, method13920);
                if (method13930 != null) {
                    if (!method13930.field26598) {
                        array[n++] = method13930;
                    }
                }
            }
        }
        return n;
    }
    
    private double method13920(final BlockPos class354) {
        if (this.field20141.method1706()) {
            return class354.getY() + 0.5;
        }
        final BlockPos method1139 = class354.method1139();
        final VoxelShape method1140 = this.field20140.getBlockState(method1139).getCollisionShape(this.field20140, method1139);
        return method1139.getY() + (method1140.isEmpty() ? 0.0 : method1140.getEnd(Direction.Axis.Y));
    }
    
    @Nullable
    private Class6772 method13921(final int n, int i, final int n2, final int n3, final double n4) {
        Class6772 class6772 = null;
        if (this.method13920(new BlockPos(n, i, n2)) - n4 > 1.125) {
            return null;
        }
        Class257 class6773 = this.method13908(this.field20140, n, i, n2, this.field20141, this.field20143, this.field20144, this.field20145, false, false);
        final float method4144 = this.field20141.method4144(class6773);
        final double n5 = this.field20141.method1930() / 2.0;
        if (method4144 >= 0.0f) {
            class6772 = this.method13919(n, i, n2);
            class6772.field26601 = class6773;
            class6772.field26600 = Math.max(class6772.field26600, method4144);
        }
        if (class6773 != Class257.field1211 && class6773 != Class257.field1207) {
            if (class6772 == null) {
                if (n3 > 0) {
                    if (class6773 != Class257.field1209) {
                        if (class6773 != Class257.field1208) {
                            class6772 = this.method13921(n, i + 1, n2, n3 - 1, n4);
                        }
                    }
                }
            }
            if (class6773 == Class257.field1206) {
                if (!this.field20141.world.method6978(this.field20141, new AxisAlignedBB(n - n5 + 0.5, i + 0.001, n2 - n5 + 0.5, n + n5 + 0.5, i + this.field20141.method1931(), n2 + n5 + 0.5))) {
                    return null;
                }
                final Class257 method4145 = this.method13908(this.field20140, n, i - 1, n2, this.field20141, this.field20143, this.field20144, this.field20145, false, false);
                if (method4145 == Class257.field1205) {
                    final Class6772 method4146 = this.method13919(n, i, n2);
                    method4146.field26601 = Class257.field1207;
                    method4146.field26600 = Math.max(method4146.field26600, method4144);
                    return method4146;
                }
                if (method4145 == Class257.field1211) {
                    final Class6772 method4147 = this.method13919(n, i, n2);
                    method4147.field26601 = Class257.field1211;
                    method4147.field26600 = Math.max(method4147.field26600, method4144);
                    return method4147;
                }
                int n6 = 0;
                while (i > 0) {
                    if (class6773 != Class257.field1206) {
                        break;
                    }
                    --i;
                    if (n6++ >= this.field20141.method1858()) {
                        return null;
                    }
                    class6773 = this.method13908(this.field20140, n, i, n2, this.field20141, this.field20143, this.field20144, this.field20145, false, false);
                    final float method4148 = this.field20141.method4144(class6773);
                    if (class6773 != Class257.field1206 && method4148 >= 0.0f) {
                        class6772 = this.method13919(n, i, n2);
                        class6772.field26601 = class6773;
                        class6772.field26600 = Math.max(class6772.field26600, method4148);
                        break;
                    }
                    if (method4148 >= 0.0f) {
                        continue;
                    }
                    return null;
                }
            }
            return class6772;
        }
        if (i < this.field20141.world.method6743() - 10) {
            if (class6772 != null) {
                final Class6772 class6774 = class6772;
                ++class6774.field26600;
            }
        }
        return class6772;
    }
    
    @Override
    public Class257 method13910(final IBlockReader class1855, final boolean b, final boolean b2, final BlockPos class1856, Class257 class1857) {
        if (class1857 == Class257.field1213) {
            if (!(class1855.getBlockState(class1856).getBlock() instanceof Class4017)) {
                if (!(class1855.getBlockState(class1856.method1139()).getBlock() instanceof Class4017)) {
                    class1857 = Class257.field1209;
                }
            }
        }
        Label_0099: {
            if (class1857 != Class257.field1220) {
                if (class1857 != Class257.field1221) {
                    if (class1857 != Class257.field1222) {
                        break Label_0099;
                    }
                }
            }
            class1857 = Class257.field1205;
        }
        if (class1857 == Class257.field1224) {
            class1857 = Class257.field1205;
        }
        return class1857;
    }
    
    @Override
    public Class257 method13913(final IBlockReader class1855, final int n, final int n2, final int n3) {
        Class257 class1856 = Class4651.method13916(class1855, n, n2, n3);
        if (class1856 != Class257.field1211) {
            if (class1856 == Class257.field1206) {
                if (n2 >= 1) {
                    final Block method21696 = class1855.getBlockState(new BlockPos(n, n2 - 1, n3)).getBlock();
                    final Class257 method21697 = Class4651.method13916(class1855, n, n2 - 1, n3);
                    Label_0209: {
                        if (method21697 != Class257.field1207) {
                            if (method21697 != Class257.field1206) {
                                if (method21697 != Class257.field1210) {
                                    class1856 = Class257.field1207;
                                    break Label_0209;
                                }
                            }
                        }
                        class1856 = Class257.field1206;
                    }
                    Label_0246: {
                        if (method21697 != Class257.field1215) {
                            if (method21696 != Class7521.field29642) {
                                if (method21696 != Class7521.field29818) {
                                    break Label_0246;
                                }
                            }
                        }
                        class1856 = Class257.field1215;
                    }
                    if (method21697 == Class257.field1217) {
                        class1856 = Class257.field1217;
                    }
                    if (method21697 == Class257.field1219) {
                        class1856 = Class257.field1219;
                    }
                }
            }
            if (class1856 == Class257.field1207) {
                class1856 = Class4651.method13915(class1855, n, n2, n3, class1856);
            }
            return class1856;
        }
        for (final Direction class1857 : Direction.values()) {
            if (Class4651.method13916(class1855, n + class1857.getXOffset(), n2 + class1857.getYOffset(), n3 + class1857.getZOffset()) == Class257.field1205) {
                return Class257.field1212;
            }
        }
        return Class257.field1211;
    }
}
