// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import javax.annotation.Nullable;
import com.google.common.collect.Lists;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util2.Direction;
import net.minecraft.world.World;

import java.util.List;

public class Class8354
{
    private static String[] field34281;
    private final World field34282;
    private final BlockPos field34283;
    private final Class4017 field34284;
    private BlockState field34285;
    private final boolean field34286;
    private final List<BlockPos> field34287;
    
    public Class8354(final World field34282, final BlockPos field34283, final BlockState field34284) {
        this.field34287 = Lists.newArrayList();
        this.field34282 = field34282;
        this.field34283 = field34283;
        this.field34285 = field34284;
        this.field34284 = (Class4017)field34284.getBlock();
        final Class104 class104 = field34284.get(this.field34284.method12205());
        this.field34286 = this.field34284.method12202();
        this.method27878(class104);
    }
    
    public List<BlockPos> method27877() {
        return this.field34287;
    }
    
    private void method27878(final Class104 class104) {
        this.field34287.clear();
        switch (Class9440.field40507[class104.ordinal()]) {
            case 1: {
                this.field34287.add(this.field34283.method1141());
                this.field34287.add(this.field34283.method1143());
                break;
            }
            case 2: {
                this.field34287.add(this.field34283.method1145());
                this.field34287.add(this.field34283.method1147());
                break;
            }
            case 3: {
                this.field34287.add(this.field34283.method1145());
                this.field34287.add(this.field34283.method1147().method1137());
                break;
            }
            case 4: {
                this.field34287.add(this.field34283.method1145().method1137());
                this.field34287.add(this.field34283.method1147());
                break;
            }
            case 5: {
                this.field34287.add(this.field34283.method1141().method1137());
                this.field34287.add(this.field34283.method1143());
                break;
            }
            case 6: {
                this.field34287.add(this.field34283.method1141());
                this.field34287.add(this.field34283.method1143().method1137());
                break;
            }
            case 7: {
                this.field34287.add(this.field34283.method1147());
                this.field34287.add(this.field34283.method1143());
                break;
            }
            case 8: {
                this.field34287.add(this.field34283.method1145());
                this.field34287.add(this.field34283.method1143());
                break;
            }
            case 9: {
                this.field34287.add(this.field34283.method1145());
                this.field34287.add(this.field34283.method1141());
                break;
            }
            case 10: {
                this.field34287.add(this.field34283.method1147());
                this.field34287.add(this.field34283.method1141());
                break;
            }
        }
    }
    
    private void method27879() {
        for (int i = 0; i < this.field34287.size(); ++i) {
            final Class8354 method27881 = this.method27881(this.field34287.get(i));
            if (method27881 != null && method27881.method27882(this)) {
                this.field34287.set(i, method27881.field34283);
            }
            else {
                this.field34287.remove(i--);
            }
        }
    }
    
    private boolean method27880(final BlockPos class354) {
        if (!Class4017.method12200(this.field34282, class354)) {
            if (!Class4017.method12200(this.field34282, class354.method1137())) {
                if (!Class4017.method12200(this.field34282, class354.method1139())) {
                    return false;
                }
            }
        }
        return true;
    }
    
    @Nullable
    private Class8354 method27881(final BlockPos class354) {
        final BlockState method6701 = this.field34282.getBlockState(class354);
        if (Class4017.method12201(method6701)) {
            return new Class8354(this.field34282, class354, method6701);
        }
        final BlockPos method6702 = class354.method1137();
        final BlockState method6703 = this.field34282.getBlockState(method6702);
        if (!Class4017.method12201(method6703)) {
            final BlockPos method6704 = class354.method1139();
            final BlockState method6705 = this.field34282.getBlockState(method6704);
            return Class4017.method12201(method6705) ? new Class8354(this.field34282, method6704, method6705) : null;
        }
        return new Class8354(this.field34282, method6702, method6703);
    }
    
    private boolean method27882(final Class8354 class8354) {
        return this.method27883(class8354.field34283);
    }
    
    private boolean method27883(final BlockPos class354) {
        for (int i = 0; i < this.field34287.size(); ++i) {
            final BlockPos class355 = this.field34287.get(i);
            if (class355.getX() == class354.getX() && class355.getZ() == class354.getZ()) {
                return true;
            }
        }
        return false;
    }
    
    public int method27884() {
        int n = 0;
        final Iterator<Direction> iterator = Plane.HORIZONTAL.iterator();
        while (iterator.hasNext()) {
            if (!this.method27880(this.field34283.method1149(iterator.next()))) {
                continue;
            }
            ++n;
        }
        return n;
    }
    
    private boolean method27885(final Class8354 class8354) {
        return this.method27882(class8354) || this.field34287.size() != 2;
    }
    
    private void method27886(final Class8354 class8354) {
        this.field34287.add(class8354.field34283);
        final BlockPos method1141 = this.field34283.method1141();
        final BlockPos method1142 = this.field34283.method1143();
        final BlockPos method1143 = this.field34283.method1145();
        final BlockPos method1144 = this.field34283.method1147();
        final boolean method1145 = this.method27883(method1141);
        final boolean method1146 = this.method27883(method1142);
        final boolean method1147 = this.method27883(method1143);
        final boolean method1148 = this.method27883(method1144);
        Class104 class8355 = null;
        if (method1145 || method1146) {
            class8355 = Class104.field311;
        }
        if (method1147 || method1148) {
            class8355 = Class104.field312;
        }
        if (!this.field34286) {
            if (method1146) {
                if (method1148) {
                    if (!method1145) {
                        if (!method1147) {
                            class8355 = Class104.field317;
                        }
                    }
                }
            }
            if (method1146) {
                if (method1147) {
                    if (!method1145) {
                        if (!method1148) {
                            class8355 = Class104.field318;
                        }
                    }
                }
            }
            if (method1145) {
                if (method1147) {
                    if (!method1146) {
                        if (!method1148) {
                            class8355 = Class104.field319;
                        }
                    }
                }
            }
            if (method1145) {
                if (method1148) {
                    if (!method1146) {
                        if (!method1147) {
                            class8355 = Class104.field320;
                        }
                    }
                }
            }
        }
        if (class8355 == Class104.field311) {
            if (Class4017.method12200(this.field34282, method1141.method1137())) {
                class8355 = Class104.field315;
            }
            if (Class4017.method12200(this.field34282, method1142.method1137())) {
                class8355 = Class104.field316;
            }
        }
        if (class8355 == Class104.field312) {
            if (Class4017.method12200(this.field34282, method1144.method1137())) {
                class8355 = Class104.field313;
            }
            if (Class4017.method12200(this.field34282, method1143.method1137())) {
                class8355 = Class104.field314;
            }
        }
        if (class8355 == null) {
            class8355 = Class104.field311;
        }
        this.field34285 = (BlockState)((StateHolder<Object, Object>)this.field34285).with(this.field34284.method12205(), class8355);
        this.field34282.setBlockState(this.field34283, this.field34285, 3);
    }
    
    private boolean method27887(final BlockPos class354) {
        final Class8354 method27881 = this.method27881(class354);
        if (method27881 != null) {
            method27881.method27879();
            return method27881.method27885(this);
        }
        return false;
    }
    
    public Class8354 method27888(final boolean b, final boolean b2, final Class104 class104) {
        final BlockPos method1141 = this.field34283.method1141();
        final BlockPos method1142 = this.field34283.method1143();
        final BlockPos method1143 = this.field34283.method1145();
        final BlockPos method1144 = this.field34283.method1147();
        final boolean method1145 = this.method27887(method1141);
        final boolean method1146 = this.method27887(method1142);
        final boolean method1147 = this.method27887(method1143);
        final boolean method1148 = this.method27887(method1144);
        Class104 class105 = null;
        final boolean b3 = method1145 || method1146;
        final boolean b4 = method1147 || method1148;
        if (b3) {
            if (!b4) {
                class105 = Class104.field311;
            }
        }
        if (b4) {
            if (!b3) {
                class105 = Class104.field312;
            }
        }
        final boolean b5 = method1146 && method1148;
        final boolean b6 = method1146 && method1147;
        final boolean b7 = method1145 && method1148;
        final boolean b8 = method1145 && method1147;
        if (!this.field34286) {
            if (b5) {
                if (!method1145) {
                    if (!method1147) {
                        class105 = Class104.field317;
                    }
                }
            }
            if (b6) {
                if (!method1145) {
                    if (!method1148) {
                        class105 = Class104.field318;
                    }
                }
            }
            if (b8) {
                if (!method1146) {
                    if (!method1148) {
                        class105 = Class104.field319;
                    }
                }
            }
            if (b7) {
                if (!method1146) {
                    if (!method1147) {
                        class105 = Class104.field320;
                    }
                }
            }
        }
        if (class105 == null) {
            if (b3 && b4) {
                class105 = class104;
            }
            else if (!b3) {
                if (b4) {
                    class105 = Class104.field312;
                }
            }
            else {
                class105 = Class104.field311;
            }
            if (!this.field34286) {
                if (!b) {
                    if (b8) {
                        class105 = Class104.field319;
                    }
                    if (b7) {
                        class105 = Class104.field320;
                    }
                    if (b6) {
                        class105 = Class104.field318;
                    }
                    if (b5) {
                        class105 = Class104.field317;
                    }
                }
                else {
                    if (b5) {
                        class105 = Class104.field317;
                    }
                    if (b6) {
                        class105 = Class104.field318;
                    }
                    if (b7) {
                        class105 = Class104.field320;
                    }
                    if (b8) {
                        class105 = Class104.field319;
                    }
                }
            }
        }
        if (class105 == Class104.field311) {
            if (Class4017.method12200(this.field34282, method1141.method1137())) {
                class105 = Class104.field315;
            }
            if (Class4017.method12200(this.field34282, method1142.method1137())) {
                class105 = Class104.field316;
            }
        }
        if (class105 == Class104.field312) {
            if (Class4017.method12200(this.field34282, method1144.method1137())) {
                class105 = Class104.field313;
            }
            if (Class4017.method12200(this.field34282, method1143.method1137())) {
                class105 = Class104.field314;
            }
        }
        if (class105 == null) {
            class105 = class104;
        }
        this.method27878(class105);
        this.field34285 = (BlockState)((StateHolder<Object, Object>)this.field34285).with(this.field34284.method12205(), class105);
        if (b2 || this.field34282.getBlockState(this.field34283) != this.field34285) {
            this.field34282.setBlockState(this.field34283, this.field34285, 3);
            for (int i = 0; i < this.field34287.size(); ++i) {
                final Class8354 method1149 = this.method27881(this.field34287.get(i));
                if (method1149 != null) {
                    method1149.method27879();
                    if (method1149.method27885(this)) {
                        method1149.method27886(this);
                    }
                }
            }
        }
        return this;
    }
    
    public BlockState method27889() {
        return this.field34285;
    }
}
