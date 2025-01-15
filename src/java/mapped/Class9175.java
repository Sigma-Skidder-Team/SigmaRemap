// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import java.util.List;

public class Class9175
{
    private static String[] field38862;
    public String field38863;
    public String field38864;
    public Class2057 field38865;
    public List<Class8681> field38866;
    public boolean field38867;
    
    public Class9175(final String field38863, final String field38864, final Class2057 field38865) {
        this.field38866 = new ArrayList<Class8681>();
        this.field38867 = false;
        this.field38863 = field38863;
        this.field38864 = field38864;
        this.field38865 = field38865;
    }
    
    public void method33499() {
        this.field38866 = new ArrayList<Class8681>();
        Class7357[] array = new Class7357[0];
        if (this.field38865 != Class2057.field11741) {
            if (this.field38865 == Class2057.field11740) {
                array = Class6109.method18249(this.field38864);
            }
        }
        else {
            array = Class6109.method18248(this.field38864);
        }
        for (final Class7357 class7357 : array) {
            this.field38866.add(new Class8681(class7357.field28389, class7357.field28390, class7357.field28391));
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        return o == this || (o instanceof Class9175 && ((Class9175)o).field38864.equals(this.field38864));
    }
}
