// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import com.google.common.collect.Ordering;
import net.minecraft.util.text.ITextComponent;

public class Class6987 implements Class6988, Class6991
{
    private static final Ordering<Class9081> field27279;
    private final List<Class6991> field27280;
    
    public Class6987() {
        this(Class6987.field27279.sortedCopy((Iterable) Minecraft.getInstance().method5269().method17370()));
    }
    
    public Class6987(final Collection<Class9081> collection) {
        this.field27280 = Lists.newArrayList();
        for (final Class9081 class9081 : Class6987.field27279.sortedCopy((Iterable)collection)) {
            if (class9081.method32720() == Class101.field301) {
                continue;
            }
            this.field27280.add(new Class6993(class9081.method32719()));
        }
    }
    
    @Override
    public List<Class6991> method21400() {
        return this.field27280;
    }
    
    @Override
    public ITextComponent method21401() {
        return new Class2259("spectatorMenu.teleport.prompt", new Object[0]);
    }
    
    @Override
    public void method21402(final Class9039 class9039) {
        class9039.method32499(this);
    }
    
    @Override
    public ITextComponent method21403() {
        return new Class2259("spectatorMenu.teleport", new Object[0]);
    }
    
    @Override
    public void method21404(final float n, final int n2) {
        Minecraft.getInstance().method5290().method5849(Class569.field3395);
        AbstractGui.blit(0, 0, 0.0f, 0.0f, 16, 16, 256, 256);
    }
    
    @Override
    public boolean method21405() {
        return !this.field27280.isEmpty();
    }
    
    static {
        field27279 = Ordering.from((class9081, class9082) -> ComparisonChain.start().compare((Comparable)class9081.method32719().getId(), (Comparable)class9082.method32719().getId()).result());
    }
}
