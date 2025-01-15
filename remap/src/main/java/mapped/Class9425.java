// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Lists;
import java.util.List;

public class Class9425
{
    private static String[] field40425;
    private final List<Class9167> field40426;
    private final List<Class9167> field40427;
    private Item field40428;
    private Class7909<Item> field40429;
    private Class8685 field40430;
    private Class8685 field40431;
    private Class8061 field40432;
    private Class7103 field40433;
    
    private Class9425() {
        this.field40426 = Lists.newArrayList();
        this.field40427 = Lists.newArrayList();
        this.field40430 = Class8685.field36500;
        this.field40431 = Class8685.field36500;
        this.field40433 = Class7103.field27707;
    }
    
    public static Class9425 method35024() {
        return new Class9425();
    }
    
    public Class9425 method35025(final Class3832 class3832) {
        this.field40428 = class3832.method11704();
        return this;
    }
    
    public Class9425 method35026(final Class7909<Item> field40429) {
        this.field40429 = field40429;
        return this;
    }
    
    public Class9425 method35027(final Class51 class51) {
        this.field40433 = new Class7103(class51);
        return this;
    }
    
    public Class9425 method35028(final Class9167 class9167) {
        this.field40426.add(class9167);
        return this;
    }
    
    public Class9342 method35029() {
        return new Class9342(this.field40429, this.field40428, this.field40430, this.field40431, this.field40426.toArray(Class9167.field38835), this.field40427.toArray(Class9167.field38835), this.field40432, this.field40433);
    }
}
