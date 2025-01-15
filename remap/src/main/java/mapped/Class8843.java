// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

import java.util.Objects;
import javax.annotation.Nullable;

public class Class8843
{
    private final BlockPos field37167;
    private final Class181 field37168;
    private final ITextComponent field37169;
    
    public Class8843(final BlockPos field37167, final Class181 field37168, final ITextComponent field37169) {
        this.field37167 = field37167;
        this.field37168 = field37168;
        this.field37169 = field37169;
    }
    
    public static Class8843 method30895(final Class51 class51) {
        return new Class8843(Class9346.method34645(class51.method327("Pos")), Class181.method820(class51.method323("Color"), Class181.field537), class51.method315("Name") ? Class5953.method17871(class51.method323("Name")) : null);
    }
    
    @Nullable
    public static Class8843 method30896(final Class1855 class1855, final BlockPos class1856) {
        final TileEntity method6727 = class1855.method6727(class1856);
        if (!(method6727 instanceof Class465)) {
            return null;
        }
        final Class465 class1857 = (Class465)method6727;
        return new Class8843(class1856, class1857.method2390(() -> class1858.method6701(class1859)), class1857.hasCustomName() ? class1857.getCustomName() : null);
    }
    
    public BlockPos method30897() {
        return this.field37167;
    }
    
    public Class2095 method30898() {
        switch (Class7784.field31863[this.field37168.ordinal()]) {
            case 1: {
                return Class2095.field12121;
            }
            case 2: {
                return Class2095.field12122;
            }
            case 3: {
                return Class2095.field12123;
            }
            case 4: {
                return Class2095.field12124;
            }
            case 5: {
                return Class2095.field12125;
            }
            case 6: {
                return Class2095.field12126;
            }
            case 7: {
                return Class2095.field12127;
            }
            case 8: {
                return Class2095.field12128;
            }
            case 9: {
                return Class2095.field12129;
            }
            case 10: {
                return Class2095.field12130;
            }
            case 11: {
                return Class2095.field12131;
            }
            case 12: {
                return Class2095.field12132;
            }
            case 13: {
                return Class2095.field12133;
            }
            case 14: {
                return Class2095.field12134;
            }
            case 15: {
                return Class2095.field12135;
            }
            default: {
                return Class2095.field12136;
            }
        }
    }
    
    @Nullable
    public ITextComponent method30899() {
        return this.field37169;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final Class8843 class8843 = (Class8843)o;
            if (Objects.equals(this.field37167, class8843.field37167)) {
                if (this.field37168 == class8843.field37168) {
                    if (Objects.equals(this.field37169, class8843.field37169)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.field37167, this.field37168, this.field37169);
    }
    
    public Class51 method30900() {
        final Class51 class51 = new Class51();
        class51.method295("Pos", Class9346.method34646(this.field37167));
        class51.method306("Color", this.field37168.method814());
        if (this.field37169 != null) {
            class51.method306("Name", Class5953.method17869(this.field37169));
        }
        return class51;
    }
    
    public String method30901() {
        return "banner-" + this.field37167.getX() + "," + this.field37167.getY() + "," + this.field37167.getZ();
    }
}
