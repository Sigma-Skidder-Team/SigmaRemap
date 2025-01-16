// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.EnumSet;
import javax.annotation.Nullable;
import java.util.HashSet;
import com.google.common.collect.Sets;
import net.minecraft.util.math.MathHelper;

public class Class4652 extends Class4651
{
    private static String[] field20136;
    
    @Override
    public void method13900(final Class1854 class1854, final Class759 class1855) {
        super.method13900(class1854, class1855);
        this.field20137 = class1855.method4144(Class257.field1211);
    }
    
    @Override
    public void method13901() {
        this.field20141.method4145(Class257.field1211, this.field20137);
        super.method13901();
    }
    
    @Override
    public Class6772 method13902() {
        int n;
        if (this.method13927() && this.field20141.method1706()) {
            n = MathHelper.floor(this.field20141.getPosY());
            final Mutable class385 = new Mutable(this.field20141.getPosX(), n, this.field20141.getPosZ());
            for (Block class386 = this.field20140.getBlockState(class385).getBlock(); class386 == Class7521.field29173; class386 = this.field20140.getBlockState(class385).getBlock()) {
                ++n;
                class385.method1286(this.field20141.getPosX(), n, this.field20141.getPosZ());
            }
        }
        else {
            n = MathHelper.floor(this.field20141.getPosY() + 0.5);
        }
        final BlockPos class387 = new BlockPos(this.field20141);
        if (this.field20141.method4144(this.method13912(this.field20141, class387.getX(), n, class387.getZ())) < 0.0f) {
            final HashSet hashSet = Sets.newHashSet();
            hashSet.add(new BlockPos(this.field20141.getBoundingBox().minX, n, this.field20141.getBoundingBox().minZ));
            hashSet.add(new BlockPos(this.field20141.getBoundingBox().minX, n, this.field20141.getBoundingBox().maxZ));
            hashSet.add(new BlockPos(this.field20141.getBoundingBox().maxX, n, this.field20141.getBoundingBox().minZ));
            hashSet.add(new BlockPos(this.field20141.getBoundingBox().maxX, n, this.field20141.getBoundingBox().maxZ));
            for (final BlockPos class388 : hashSet) {
                if (this.field20141.method4144(this.method13911(this.field20141, class388)) < 0.0f) {
                    continue;
                }
                return super.method13919(class388.getX(), class388.getY(), class388.getZ());
            }
        }
        return super.method13919(class387.getX(), n, class387.getZ());
    }
    
    @Override
    public Class6773 method13903(final double n, final double n2, final double n3) {
        return new Class6773(super.method13919(MathHelper.floor(n), MathHelper.floor(n2), MathHelper.floor(n3)));
    }
    
    @Override
    public int method13904(final Class6772[] array, final Class6772 class6772) {
        int n = 0;
        final Class6772 method13919 = this.method13919(class6772.field26589, class6772.field26590, class6772.field26591 + 1);
        if (this.method13918(method13919)) {
            array[n++] = method13919;
        }
        final Class6772 method13920 = this.method13919(class6772.field26589 - 1, class6772.field26590, class6772.field26591);
        if (this.method13918(method13920)) {
            array[n++] = method13920;
        }
        final Class6772 method13921 = this.method13919(class6772.field26589 + 1, class6772.field26590, class6772.field26591);
        if (this.method13918(method13921)) {
            array[n++] = method13921;
        }
        final Class6772 method13922 = this.method13919(class6772.field26589, class6772.field26590, class6772.field26591 - 1);
        if (this.method13918(method13922)) {
            array[n++] = method13922;
        }
        final Class6772 method13923 = this.method13919(class6772.field26589, class6772.field26590 + 1, class6772.field26591);
        if (this.method13918(method13923)) {
            array[n++] = method13923;
        }
        final Class6772 method13924 = this.method13919(class6772.field26589, class6772.field26590 - 1, class6772.field26591);
        if (this.method13918(method13924)) {
            array[n++] = method13924;
        }
        final Class6772 method13925 = this.method13919(class6772.field26589, class6772.field26590 + 1, class6772.field26591 + 1);
        if (this.method13918(method13925)) {
            if (this.method13917(method13919)) {
                if (this.method13917(method13923)) {
                    array[n++] = method13925;
                }
            }
        }
        final Class6772 method13926 = this.method13919(class6772.field26589 - 1, class6772.field26590 + 1, class6772.field26591);
        if (this.method13918(method13926)) {
            if (this.method13917(method13920)) {
                if (this.method13917(method13923)) {
                    array[n++] = method13926;
                }
            }
        }
        final Class6772 method13927 = this.method13919(class6772.field26589 + 1, class6772.field26590 + 1, class6772.field26591);
        if (this.method13918(method13927)) {
            if (this.method13917(method13921)) {
                if (this.method13917(method13923)) {
                    array[n++] = method13927;
                }
            }
        }
        final Class6772 method13928 = this.method13919(class6772.field26589, class6772.field26590 + 1, class6772.field26591 - 1);
        if (this.method13918(method13928)) {
            if (this.method13917(method13922)) {
                if (this.method13917(method13923)) {
                    array[n++] = method13928;
                }
            }
        }
        final Class6772 method13929 = this.method13919(class6772.field26589, class6772.field26590 - 1, class6772.field26591 + 1);
        if (this.method13918(method13929)) {
            if (this.method13917(method13919)) {
                if (this.method13917(method13924)) {
                    array[n++] = method13929;
                }
            }
        }
        final Class6772 method13930 = this.method13919(class6772.field26589 - 1, class6772.field26590 - 1, class6772.field26591);
        if (this.method13918(method13930)) {
            if (this.method13917(method13920)) {
                if (this.method13917(method13924)) {
                    array[n++] = method13930;
                }
            }
        }
        final Class6772 method13931 = this.method13919(class6772.field26589 + 1, class6772.field26590 - 1, class6772.field26591);
        if (this.method13918(method13931)) {
            if (this.method13917(method13921)) {
                if (this.method13917(method13924)) {
                    array[n++] = method13931;
                }
            }
        }
        final Class6772 method13932 = this.method13919(class6772.field26589, class6772.field26590 - 1, class6772.field26591 - 1);
        if (this.method13918(method13932)) {
            if (this.method13917(method13922)) {
                if (this.method13917(method13924)) {
                    array[n++] = method13932;
                }
            }
        }
        final Class6772 method13933 = this.method13919(class6772.field26589 + 1, class6772.field26590, class6772.field26591 - 1);
        if (this.method13918(method13933)) {
            if (this.method13917(method13922)) {
                if (this.method13917(method13921)) {
                    array[n++] = method13933;
                }
            }
        }
        final Class6772 method13934 = this.method13919(class6772.field26589 + 1, class6772.field26590, class6772.field26591 + 1);
        if (this.method13918(method13934)) {
            if (this.method13917(method13919)) {
                if (this.method13917(method13921)) {
                    array[n++] = method13934;
                }
            }
        }
        final Class6772 method13935 = this.method13919(class6772.field26589 - 1, class6772.field26590, class6772.field26591 - 1);
        if (this.method13918(method13935)) {
            if (this.method13917(method13922)) {
                if (this.method13917(method13920)) {
                    array[n++] = method13935;
                }
            }
        }
        final Class6772 method13936 = this.method13919(class6772.field26589 - 1, class6772.field26590, class6772.field26591 + 1);
        if (this.method13918(method13936)) {
            if (this.method13917(method13919)) {
                if (this.method13917(method13920)) {
                    array[n++] = method13936;
                }
            }
        }
        final Class6772 method13937 = this.method13919(class6772.field26589 + 1, class6772.field26590 + 1, class6772.field26591 - 1);
        if (this.method13918(method13937)) {
            if (this.method13917(method13933)) {
                if (this.method13917(method13928)) {
                    if (this.method13917(method13927)) {
                        array[n++] = method13937;
                    }
                }
            }
        }
        final Class6772 method13938 = this.method13919(class6772.field26589 + 1, class6772.field26590 + 1, class6772.field26591 + 1);
        if (this.method13918(method13938)) {
            if (this.method13917(method13934)) {
                if (this.method13917(method13925)) {
                    if (this.method13917(method13927)) {
                        array[n++] = method13938;
                    }
                }
            }
        }
        final Class6772 method13939 = this.method13919(class6772.field26589 - 1, class6772.field26590 + 1, class6772.field26591 - 1);
        if (this.method13918(method13939)) {
            if (this.method13917(method13935)) {
                if (this.method13917(method13928)) {
                    if (this.method13917(method13926)) {
                        array[n++] = method13939;
                    }
                }
            }
        }
        final Class6772 method13940 = this.method13919(class6772.field26589 - 1, class6772.field26590 + 1, class6772.field26591 + 1);
        if (this.method13918(method13940)) {
            if (this.method13917(method13936)) {
                if (this.method13917(method13925)) {
                    if (this.method13917(method13926)) {
                        array[n++] = method13940;
                    }
                }
            }
        }
        final Class6772 method13941 = this.method13919(class6772.field26589 + 1, class6772.field26590 - 1, class6772.field26591 - 1);
        if (this.method13918(method13941)) {
            if (this.method13917(method13933)) {
                if (this.method13917(method13932)) {
                    if (this.method13917(method13931)) {
                        array[n++] = method13941;
                    }
                }
            }
        }
        final Class6772 method13942 = this.method13919(class6772.field26589 + 1, class6772.field26590 - 1, class6772.field26591 + 1);
        if (this.method13918(method13942)) {
            if (this.method13917(method13934)) {
                if (this.method13917(method13929)) {
                    if (this.method13917(method13931)) {
                        array[n++] = method13942;
                    }
                }
            }
        }
        final Class6772 method13943 = this.method13919(class6772.field26589 - 1, class6772.field26590 - 1, class6772.field26591 - 1);
        if (this.method13918(method13943)) {
            if (this.method13917(method13935)) {
                if (this.method13917(method13932)) {
                    if (this.method13917(method13930)) {
                        array[n++] = method13943;
                    }
                }
            }
        }
        final Class6772 method13944 = this.method13919(class6772.field26589 - 1, class6772.field26590 - 1, class6772.field26591 + 1);
        if (this.method13918(method13944)) {
            if (this.method13917(method13936)) {
                if (this.method13917(method13929)) {
                    if (this.method13917(method13930)) {
                        array[n++] = method13944;
                    }
                }
            }
        }
        return n;
    }
    
    private boolean method13917(final Class6772 class6772) {
        return class6772 != null && class6772.field26600 >= 0.0f;
    }
    
    private boolean method13918(final Class6772 class6772) {
        return class6772 != null && !class6772.field26598;
    }
    
    @Nullable
    @Override
    public Class6772 method13919(final int n, final int n2, final int n3) {
        Class6772 method13919 = null;
        final Class257 method13920 = this.method13912(this.field20141, n, n2, n3);
        final float method13921 = this.field20141.method4144(method13920);
        if (method13921 >= 0.0f) {
            method13919 = super.method13919(n, n2, n3);
            method13919.field26601 = method13920;
            method13919.field26600 = Math.max(method13919.field26600, method13921);
            if (method13920 == Class257.field1207) {
                final Class6772 class6772 = method13919;
                ++class6772.field26600;
            }
        }
        return (method13920 != Class257.field1206 && method13920 != Class257.field1207) ? method13919 : method13919;
    }
    
    @Override
    public Class257 method13908(final IBlockReader class1855, final int n, final int n2, final int n3, final Class759 class1856, final int n4, final int n5, final int n6, final boolean b, final boolean b2) {
        final EnumSet<Class257> none = EnumSet.noneOf(Class257.class);
        final Class257 method13909 = this.method13909(class1855, n, n2, n3, n4, n5, n6, b, b2, none, Class257.field1205, new BlockPos(class1856));
        if (!none.contains(Class257.field1209)) {
            Class257 field1205 = Class257.field1205;
            for (final Class257 class1857 : none) {
                if (class1856.method4144(class1857) < 0.0f) {
                    return class1857;
                }
                if (class1856.method4144(class1857) < class1856.method4144(field1205)) {
                    continue;
                }
                field1205 = class1857;
            }
            return (method13909 == Class257.field1206 && class1856.method4144(field1205) == 0.0f) ? Class257.field1206 : field1205;
        }
        return Class257.field1209;
    }
    
    @Override
    public Class257 method13913(final IBlockReader class1855, final int n, final int n2, final int n3) {
        Class257 class1856 = Class4651.method13916(class1855, n, n2, n3);
        Label_0018: {
            if (class1856 == Class257.field1206) {
                if (n2 >= 1) {
                    final Block method21696 = class1855.getBlockState(new BlockPos(n, n2 - 1, n3)).getBlock();
                    final Class257 method21697 = Class4651.method13916(class1855, n, n2 - 1, n3);
                    if (method21697 != Class257.field1215) {
                        if (method21696 != Class7521.field29642) {
                            if (method21697 != Class257.field1210) {
                                if (method21696 != Class7521.field29818) {
                                    if (method21697 == Class257.field1217) {
                                        class1856 = Class257.field1217;
                                        break Label_0018;
                                    }
                                    if (method21697 == Class257.field1219) {
                                        class1856 = Class257.field1219;
                                        break Label_0018;
                                    }
                                    if (method21697 == Class257.field1226) {
                                        class1856 = Class257.field1226;
                                        break Label_0018;
                                    }
                                    if (method21697 != Class257.field1209) {
                                        Class257 class1857 = null;
                                        Label_0250: {
                                            if (method21697 != Class257.field1207) {
                                                if (method21697 != Class257.field1206) {
                                                    if (method21697 != Class257.field1211) {
                                                        class1857 = Class257.field1207;
                                                        break Label_0250;
                                                    }
                                                }
                                            }
                                            class1857 = Class257.field1206;
                                        }
                                        class1856 = class1857;
                                        break Label_0018;
                                    }
                                    class1856 = Class257.field1209;
                                    break Label_0018;
                                }
                            }
                        }
                    }
                    class1856 = Class257.field1215;
                }
            }
        }
        if (class1856 == Class257.field1207 || class1856 == Class257.field1206) {
            class1856 = Class4651.method13915(class1855, n, n2, n3, class1856);
        }
        return class1856;
    }
    
    private Class257 method13911(final Class759 class759, final BlockPos class760) {
        return this.method13912(class759, class760.getX(), class760.getY(), class760.getZ());
    }
    
    private Class257 method13912(final Class759 class759, final int n, final int n2, final int n3) {
        return this.method13908(this.field20140, n, n2, n3, class759, this.field20143, this.field20144, this.field20145, this.method13926(), this.method13925());
    }
}
