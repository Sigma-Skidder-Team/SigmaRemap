// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Lists;
import com.mentalfrostbyte.jello.mods.impl.render.XRay;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import net.minecraft.util.Direction;

import java.util.BitSet;
import java.util.List;
import java.util.Set;

public class Class9006
{
    public static final Class9006 field38022;
    private final Set<Class6332> field38023;
    private final Set<Class6332> field38024;
    private final boolean field38025;
    private final List<TileEntity> field38026;
    private final Class8336 field38027;
    private final BitSet[] field38029;
    
    public Class9006() {
        this.field38023 = new ObjectArraySet<>();
        this.field38024 = new ObjectArraySet<>();
        this.field38025 = true;
        this.field38026 = Lists.newArrayList();
        this.field38027 = new Class8336();
        this.field38029 = new BitSet[Class6332.field25344.length];
    }
    
    public boolean method32212() {
        return this.field38025;
    }
    
    public boolean method32213(final Class6332 class6332) {
        return !this.field38023.contains(class6332);
    }
    
    public List<TileEntity> method32214() {
        return this.field38026;
    }
    
    public boolean method32210(final Direction class179, final Direction class180) {
        return XRay.xrayModule.isEnabled() || this.field38027.method27782(class179, class180);
    }
    
    public BitSet method32215(final Class6332 class6332) {
        return this.field38029[class6332.method18759()];
    }
    
    public void method32211(final Class6332 class6332, final BitSet set) {
        this.field38029[class6332.method18759()] = set;
    }
    
    public boolean method32216(final Class6332 class6332) {
        return this.field38024.contains(class6332);
    }
    
    public void method32217(final Class6332 class6332) {
        this.field38024.add(class6332);
    }
    
    public void method32218(final Class6332 class6332) {
        this.field38023.add(class6332);
    }
    
    static {
        field38022 = new Class9005();
    }

    public static final class Class9005 extends Class9006
    {
        @Override
        public boolean method32210(final Direction class179, final Direction class180) {
            return false;
        }

        @Override
        public void method32211(final Class6332 class6332, final BitSet set) {
            throw new UnsupportedOperationException();
        }
    }
}
