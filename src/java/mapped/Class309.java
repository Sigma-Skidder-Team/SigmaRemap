// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class309
{
    field1837("NONE", 0) {
        public Class311(final String s, final int n) {
        }
        
        @Override
        public int method982(final int n, final int n2, final int n3, final Class111 class111) {
            return class111.method604(n, n2, n3);
        }
        
        @Override
        public Class111 method983(final Class111 class111) {
            return class111;
        }
        
        @Override
        public Class309 method984() {
            return this;
        }
    }, 
    field1838("FORWARD", 1) {
        public Class312(final String s, final int n) {
        }
        
        @Override
        public int method982(final int n, final int n2, final int n3, final Class111 class111) {
            return class111.method604(n3, n, n2);
        }
        
        @Override
        public Class111 method983(final Class111 class111) {
            return Class312.field1840[Math.floorMod(class111.ordinal() + 1, 3)];
        }
        
        @Override
        public Class309 method984() {
            return Class312.field1839;
        }
    }, 
    field1839("BACKWARD", 2) {
        public Class310(final String s, final int n) {
        }
        
        @Override
        public int method982(final int n, final int n2, final int n3, final Class111 class111) {
            return class111.method604(n2, n3, n);
        }
        
        @Override
        public Class111 method983(final Class111 class111) {
            return Class310.field1840[Math.floorMod(class111.ordinal() - 1, 3)];
        }
        
        @Override
        public Class309 method984() {
            return Class310.field1838;
        }
    };
    
    public static final Class111[] field1840;
    public static final Class309[] field1841;
    
    public abstract int method982(final int p0, final int p1, final int p2, final Class111 p3);
    
    public abstract Class111 method983(final Class111 p0);
    
    public abstract Class309 method984();
    
    public static Class309 method985(final Class111 class111, final Class111 class112) {
        return Class309.field1841[Math.floorMod(class112.ordinal() - class111.ordinal(), 3)];
    }
    
    static {
        field1840 = Class111.values();
        field1841 = values();
    }
}
