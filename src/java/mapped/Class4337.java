// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.suggestion.Suggestion;
import com.google.common.collect.Lists;
import com.mojang.brigadier.context.StringRange;
import com.mojang.brigadier.suggestion.Suggestions;

public class Class4337 implements Class4252<Class5800>
{
    private static String[] field19418;
    private int field19419;
    private Suggestions field19420;
    
    public Class4337() {
    }
    
    public Class4337(final int field19419, final Suggestions field19420) {
        this.field19419 = field19419;
        this.field19420 = field19420;
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19419 = class8654.method29501();
        final int method29501 = class8654.method29501();
        final StringRange between = StringRange.between(method29501, method29501 + class8654.method29501());
        final int method29502 = class8654.method29501();
        final ArrayList arrayListWithCapacity = Lists.newArrayListWithCapacity(method29502);
        for (int i = 0; i < method29502; ++i) {
            arrayListWithCapacity.add(new Suggestion(between, class8654.method29513(32767), (Message)(class8654.readBoolean() ? class8654.method29497() : null)));
        }
        this.field19420 = new Suggestions(between, (List)arrayListWithCapacity);
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.method29505(this.field19419);
        class8654.method29505(this.field19420.getRange().getStart());
        class8654.method29505(this.field19420.getRange().getLength());
        class8654.method29505(this.field19420.getList().size());
        for (final Suggestion suggestion : this.field19420.getList()) {
            class8654.method29514(suggestion.getText());
            class8654.writeBoolean(suggestion.getTooltip() != null);
            if (suggestion.getTooltip() == null) {
                continue;
            }
            class8654.method29498(Class9479.method35300(suggestion.getTooltip()));
        }
    }
    
    public void method12764(final Class5800 class5800) {
        class5800.method17326(this);
    }
    
    public int method13020() {
        return this.field19419;
    }
    
    public Suggestions method13021() {
        return this.field19420;
    }
}
