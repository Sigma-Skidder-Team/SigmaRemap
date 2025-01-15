// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collection;

public class Class7912 extends Class7909<Item>
{
    private static String[] field32489;
    private int field32490;
    private Class7909<Item> field32491;
    
    public Class7912(final Class1932 class1932) {
        super(class1932);
        this.field32490 = -1;
    }
    
    public boolean method25624(final Item class3820) {
        if (this.field32490 != Class7855.method25405()) {
            this.field32491 = Class7855.method25406().method18461(this.method25621());
            this.field32490 = Class7855.method25405();
        }
        return this.field32491.method25618(class3820);
    }
    
    @Override
    public Collection<Item> method25616() {
        if (this.field32490 != Class7855.method25405()) {
            this.field32491 = Class7855.method25406().method18461(this.method25621());
            this.field32490 = Class7855.method25405();
        }
        return this.field32491.method25616();
    }
    
    @Override
    public Collection<Class6967<Item>> method25617() {
        if (this.field32490 != Class7855.method25405()) {
            this.field32491 = Class7855.method25406().method18461(this.method25621());
            this.field32490 = Class7855.method25405();
        }
        return this.field32491.method25617();
    }
}
