// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;

public enum Class2130
{
    field12433("GRANT", 0, "grant") {
        public Class2132(final String s, final int n, final String s2) {
        }
        
        @Override
        public boolean method8285(final Class513 class513, final Class8863 class514) {
            final Class348 method21470 = class513.method2957().method21470(class514);
            if (!method21470.method1031()) {
                final Iterator<String> iterator = method21470.method1041().iterator();
                while (iterator.hasNext()) {
                    class513.method2957().method21464(class514, iterator.next());
                }
                return true;
            }
            return false;
        }
        
        @Override
        public boolean method8286(final Class513 class513, final Class8863 class514, final String s) {
            return class513.method2957().method21464(class514, s);
        }
    }, 
    field12434("REVOKE", 1, "revoke") {
        public Class2131(final String s, final int n, final String s2) {
        }
        
        @Override
        public boolean method8285(final Class513 class513, final Class8863 class514) {
            final Class348 method21470 = class513.method2957().method21470(class514);
            if (method21470.method1032()) {
                final Iterator<String> iterator = method21470.method1042().iterator();
                while (iterator.hasNext()) {
                    class513.method2957().method21465(class514, iterator.next());
                }
                return true;
            }
            return false;
        }
        
        @Override
        public boolean method8286(final Class513 class513, final Class8863 class514, final String s) {
            return class513.method2957().method21465(class514, s);
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
