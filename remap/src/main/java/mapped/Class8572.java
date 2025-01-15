// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import java.util.List;

public class Class8572
{
    private static String[] field36044;
    public Class9041 field36045;
    public List<byte[]> field36046;
    
    public Class8572(final Class9041 field36045) {
        this.field36045 = field36045;
        this.field36046 = new ArrayList<byte[]>();
    }
    
    public Class9041 method29022(final byte[] array) {
        this.field36046.add(array);
        if (this.field36046.size() != this.field36045.field38267) {
            return null;
        }
        final Class9041 method16360 = Class5255.method16360(this.field36045, this.field36046.toArray(new byte[this.field36046.size()][]));
        this.method29023();
        return method16360;
    }
    
    public void method29023() {
        this.field36045 = null;
        this.field36046 = new ArrayList<byte[]>();
    }
}
