// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Lists;
import net.minecraft.util.text.ITextComponent;

import java.util.List;

public class Class6989 implements Class6988
{
    private final List<Class6991> field27281;
    
    public Class6989() {
        (this.field27281 = Lists.newArrayList()).add(new Class6987());
        this.field27281.add(new Class6990());
    }
    
    @Override
    public List<Class6991> method21400() {
        return this.field27281;
    }
    
    @Override
    public ITextComponent method21401() {
        return new Class2259("spectatorMenu.root.prompt");
    }
}
