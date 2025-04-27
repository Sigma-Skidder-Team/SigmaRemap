// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;

public enum Class2130
{
    field12433("") {
        @Override
        public boolean method8285(Class513 p0, Class8863 p1) {
            return false;
        }

        @Override
        public boolean method8286(Class513 p0, Class8863 p1, String p2) {
            return false;
        }
    },
    field12434("") {
        @Override
        public boolean method8285(Class513 p0, Class8863 p1) {
            return false;
        }

        @Override
        public boolean method8286(Class513 p0, Class8863 p1, String p2) {
            return false;
        }
    };
    
    private final String field12435;
    
    Class2130(final String str) {
        this.field12435 = "commands.advancement." + str;
    }

    public int method8284(final Class513 class513, final Iterable<Class8863> iterable) {
        int n = 0;
        final Iterator<Class8863> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            if (!this.method8285(class513, iterator.next())) {
                continue;
            }
            ++n;
        }
        return n;
    }
    
    public abstract boolean method8285(final Class513 p0, final Class8863 p1);
    
    public abstract boolean method8286(final Class513 p0, final Class8863 p1, final String p2);
    
    public String method8287() {
        return this.field12435;
    }
}
