// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import java.util.List;

public final class Class8714
{
    private final List<String> field36618;
    private final List<String> field36619;
    
    public Class8714() {
        this.field36618 = new ArrayList<String>();
        this.field36619 = new ArrayList<String>();
    }
    
    public Class8714 method29930(final String s, final String s2) {
        this.field36618.add(Class8846.method30973(s, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true));
        this.field36619.add(Class8846.method30973(s2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true));
        return this;
    }
    
    public Class8714 method29931(final String s, final String s2) {
        this.field36618.add(Class8846.method30973(s, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true));
        this.field36619.add(Class8846.method30973(s2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true));
        return this;
    }
    
    public Class7172 method29932() {
        return new Class7172(this.field36618, this.field36619);
    }
}
