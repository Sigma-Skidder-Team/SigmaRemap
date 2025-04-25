// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public abstract class Class7679 {
    public String field30506;

    public Class7679(final String field30506) {
        this.field30506 = field30506;
    }

    public String method24378() {
        return this.field30506;
    }

    public abstract boolean method24377();

    public static Class7679 method24379(final String s) {
        switch (s) {
            case "true": {
                return new Class7678(s);
            }
            case "false": {
                return new Class7680(s);
            }
            default: {
                return null;
            }
        }
    }
}
