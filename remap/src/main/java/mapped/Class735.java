// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

import java.util.Iterator;
import java.util.List;

public class Class735 extends Class527
{
    private final ITextComponent field3992;
    private List<String> field3993;
    private final Class527 field3994;
    private int field3995;
    
    public Class735(final Class527 field3994, final String s, final ITextComponent field3995) {
        super(new Class2259(s, new Object[0]));
        this.field3994 = field3994;
        this.field3992 = field3995;
    }
    
    @Override
    public boolean method2989() {
        return false;
    }
    
    @Override
    public void method2969() {
        this.field3993 = this.field3156.method6626(this.field3992.getFormattedText(), this.field3152 - 50);
        this.field3995 = this.field3993.size() * 9;
        this.method3029(new Class654(this.field3152 / 2 - 100, Math.min(this.field3153 / 2 + this.field3995 / 2 + 9, this.field3153 - 30), 200, 20, Class8822.method30773("gui.toMenu", new Object[0]), class654 -> this.field3150.method5244(this.field3994)));
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        this.method3041();
        this.method3295(this.field3156, this.field3148.getFormattedText(), this.field3152 / 2, this.field3153 / 2 - this.field3995 / 2 - 18, 11184810);
        int n4 = this.field3153 / 2 - this.field3995 / 2;
        if (this.field3993 != null) {
            final Iterator<String> iterator = this.field3993.iterator();
            while (iterator.hasNext()) {
                this.method3295(this.field3156, iterator.next(), this.field3152 / 2, n4, 16777215);
                n4 += 9;
            }
        }
        super.method2975(n, n2, n3);
    }
}
