// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

public enum Class189
{
    field610(0, "cape"), 
    field611(1, "jacket"), 
    field612(2, "left_sleeve"), 
    field613(3, "right_sleeve"), 
    field614(4, "left_pants_leg"), 
    field615(5, "right_pants_leg"), 
    field616(6, "hat");
    
    private final int field617;
    private final int field618;
    private final String field619;
    private final ITextComponent field620;
    
    Class189(final int field617, final String s) {
        this.field617 = field617;
        this.field618 = 1 << field617;
        this.field619 = s;
        this.field620 = new Class2259("options.modelPart." + s);
    }
    
    public int method828() {
        return this.field618;
    }
    
    public String method829() {
        return this.field619;
    }
    
    public ITextComponent method830() {
        return this.field620;
    }
}
