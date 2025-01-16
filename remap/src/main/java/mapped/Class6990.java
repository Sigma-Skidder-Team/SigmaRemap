// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import com.google.common.collect.Lists;
import net.minecraft.util.text.ITextComponent;

import java.util.List;

public class Class6990 implements Class6988, Class6991
{
    private final List<Class6991> field27282;
    
    public Class6990() {
        this.field27282 = Lists.newArrayList();
        final Iterator<Class6749> iterator = Minecraft.method5277().world.method6782().method19650().iterator();
        while (iterator.hasNext()) {
            this.field27282.add(new Class6994(this, iterator.next()));
        }
    }
    
    @Override
    public List<Class6991> method21400() {
        return this.field27282;
    }
    
    @Override
    public ITextComponent method21401() {
        return new Class2259("spectatorMenu.team_teleport.prompt", new Object[0]);
    }
    
    @Override
    public void method21402(final Class9039 class9039) {
        class9039.method32499(this);
    }
    
    @Override
    public ITextComponent method21403() {
        return new Class2259("spectatorMenu.team_teleport", new Object[0]);
    }
    
    @Override
    public void method21404(final float n, final int n2) {
        Minecraft.method5277().method5290().method5849(Class569.field3395);
        Class565.method3188(0, 0, 16.0f, 0.0f, 16, 16, 256, 256);
    }
    
    @Override
    public boolean method21405() {
        final Iterator<Class6991> iterator = this.field27282.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().method21405()) {
                continue;
            }
            return true;
        }
        return false;
    }
}
