// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.TextComponent;

public class StringTextComponent extends TextComponent
{
    private final String text;
    
    public StringTextComponent(final String field13817) {
        this.text = field13817;
    }
    
    public String getText() {
        return this.text;
    }
    
    @Override
    public String getUnformattedComponentText() {
        return this.text;
    }
    
    public StringTextComponent shallowCopy() {
        return new StringTextComponent(this.text);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof StringTextComponent && this.text.equals(((StringTextComponent)o).getText()) && super.equals(o));
    }
    
    @Override
    public String toString() {
        return "TextComponent{text='" + this.text + '\'' + ", siblings=" + this.siblings + ", style=" + this.getStyle() + '}';
    }
}
