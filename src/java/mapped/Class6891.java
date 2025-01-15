// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Map;

public class Class6891
{
    private static String[] field27026;
    private Class8541[] field27027;
    private Class333[] field27028;
    
    public Class6891(final Class8541[] field27027, final Map<String, Class327> map) {
        this.field27027 = field27027;
        final ArrayList list = new ArrayList();
        final Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            final Class327 class327 = map.get(iterator.next());
            if (!(class327 instanceof Class333)) {
                continue;
            }
            list.add(class327);
        }
        this.field27028 = (Class333[])list.toArray(new Class333[list.size()]);
    }
    
    public void method21191(final int n) {
        for (int i = 0; i < this.field27027.length; ++i) {
            this.field27027[i].method28649(n);
        }
    }
    
    public void method21192() {
        this.method21193();
        for (int i = 0; i < this.field27027.length; ++i) {
            this.field27027[i].method28650();
        }
    }
    
    private void method21193() {
        for (int i = 0; i < this.field27028.length; ++i) {
            this.field27028[i].method1013();
        }
    }
    
    public void method21194() {
        for (int i = 0; i < this.field27027.length; ++i) {
            this.field27027[i].method28651();
        }
    }
}
