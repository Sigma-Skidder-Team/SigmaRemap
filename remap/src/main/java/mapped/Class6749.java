// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collection;
import com.google.common.collect.Sets;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;

import java.util.Set;

public class Class6749 extends Team
{
    private final Class6516 field26543;
    private final String field26544;
    private final Set<String> field26545;
    private ITextComponent field26546;
    private ITextComponent field26547;
    private ITextComponent field26548;
    private boolean field26549;
    private boolean field26550;
    private Class2097 field26551;
    private Class2097 field26552;
    private TextFormatting field26553;
    private Class343 field26554;
    
    public Class6749(final Class6516 field26543, final String field26544) {
        this.field26545 = Sets.newHashSet();
        this.field26547 = new StringTextComponent("");
        this.field26548 = new StringTextComponent("");
        this.field26549 = true;
        this.field26550 = true;
        this.field26551 = Class2097.field12147;
        this.field26552 = Class2097.field12147;
        this.field26553 = TextFormatting.RESET;
        this.field26554 = Class343.field2112;
        this.field26543 = field26543;
        this.field26544 = field26544;
        this.field26546 = new StringTextComponent(field26544);
    }
    
    @Override
    public String method20539() {
        return this.field26544;
    }
    
    public ITextComponent method20540() {
        return this.field26546;
    }
    
    public ITextComponent method20541() {
        final ITextComponent method35299 = Class9479.method35299(this.field26546.deepCopy().applyTextStyle(class8768 -> {
            class8768.method30421(this.field26544);
            new HoverEvent(HoverEvent.Action.field10697, new StringTextComponent(this.field26544));
            final HoverEvent class8769;
            final Object o;
            ((Style)o).method30420(class8769);
        }));
        final TextFormatting method35300 = this.getColor();
        if (method35300 != TextFormatting.RESET) {
            method35299.applyTextStyle(method35300);
        }
        return method35299;
    }
    
    public void method20542(final ITextComponent field26546) {
        if (field26546 != null) {
            this.field26546 = field26546;
            this.field26543.method19621(this);
            return;
        }
        throw new IllegalArgumentException("Name cannot be null");
    }
    
    public void method20543(final ITextComponent class2250) {
        this.field26547 = ((class2250 != null) ? class2250.deepCopy() : new StringTextComponent(""));
        this.field26543.method19621(this);
    }
    
    public ITextComponent method20544() {
        return this.field26547;
    }
    
    public void method20545(final ITextComponent class2250) {
        this.field26548 = ((class2250 != null) ? class2250.deepCopy() : new StringTextComponent(""));
        this.field26543.method19621(this);
    }
    
    public ITextComponent method20546() {
        return this.field26548;
    }
    
    @Override
    public Collection<String> method20547() {
        return this.field26545;
    }
    
    @Override
    public ITextComponent method20548(final ITextComponent class2250) {
        final ITextComponent method8458 = new StringTextComponent("").appendSibling(this.field26547).appendSibling(class2250).appendSibling(this.field26548);
        final TextFormatting method8459 = this.getColor();
        if (method8459 != TextFormatting.RESET) {
            method8458.applyTextStyle(method8459);
        }
        return method8458;
    }
    
    public static ITextComponent method20549(final Team class6750, final ITextComponent class6751) {
        return (class6750 != null) ? class6750.method20548(class6751) : class6751.deepCopy();
    }
    
    @Override
    public boolean method20550() {
        return this.field26549;
    }
    
    public void method20551(final boolean field26549) {
        this.field26549 = field26549;
        this.field26543.method19621(this);
    }
    
    @Override
    public boolean method20552() {
        return this.field26550;
    }
    
    public void method20553(final boolean field26550) {
        this.field26550 = field26550;
        this.field26543.method19621(this);
    }
    
    @Override
    public Class2097 method20554() {
        return this.field26551;
    }
    
    @Override
    public Class2097 method20555() {
        return this.field26552;
    }
    
    public void method20556(final Class2097 field26551) {
        this.field26551 = field26551;
        this.field26543.method19621(this);
    }
    
    public void method20557(final Class2097 field26552) {
        this.field26552 = field26552;
        this.field26543.method19621(this);
    }
    
    @Override
    public Class343 method20558() {
        return this.field26554;
    }
    
    public void method20559(final Class343 field26554) {
        this.field26554 = field26554;
        this.field26543.method19621(this);
    }
    
    public int method20560() {
        int n = 0;
        if (this.method20550()) {
            n |= 0x1;
        }
        if (this.method20552()) {
            n |= 0x2;
        }
        return n;
    }
    
    public void method20561(final int n) {
        Class6749 class6749 = this;
        Class6749 class6750 = this;
        final int n2;
        do {
            if ((n2 & 0x80000) != 0x0) {
                continue;
            }
            class6750.method20551(false);
            class6749 = this;
            class6750 = this;
        } while ((n2 & 0x80) == 0x0);
        class6749.method20553(false);
    }
    
    public void method20562(final TextFormatting field26553) {
        this.field26553 = field26553;
        this.field26543.method19621(this);
    }
    
    @Override
    public TextFormatting getColor() {
        return this.field26553;
    }
}
