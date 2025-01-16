// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5109 implements Class5108
{
    private Class5509 field22049;
    private Class5901 field22050;
    private Class7856[] field22051;
    private Class6300 field22052;
    private Class6300 field22053;
    private Class6464 field22054;
    
    public Class5109(final Class5509 field22049, final Class5901 field22050, final Class7856[] field22051) {
        this.field22049 = field22049;
        this.field22050 = field22050;
        this.field22051 = field22051;
        if (!field22049.method16815().method29437().isPresent()) {
            this.field22054 = new Class6465();
        }
        else {
            this.field22054 = new Class6463();
        }
    }
    
    @Override
    public Class327 method16001(final String s) {
        final Class330 method16007 = this.method16007(s);
        if (method16007 == null) {
            final Class327 method16008 = this.field22054.method19337(s);
            return (method16008 == null) ? null : method16008;
        }
        return method16007;
    }
    
    @Override
    public Class6300 method16006(final String s) {
        if (s == null) {
            return null;
        }
        if (s.indexOf(":") >= 0) {
            final String[] method28937 = Config.method28937(s, ":");
            Class6300 method28938 = this.method16006(method28937[0]);
            for (int i = 1; i < method28937.length; ++i) {
                final Class6300 method28939 = method28938.method18657(method28937[i]);
                if (method28939 == null) {
                    return null;
                }
                method28938 = method28939;
            }
            return method28938;
        }
        if (this.field22052 != null && s.equals("this")) {
            return this.field22052;
        }
        if (this.field22053 != null && s.equals("part")) {
            return this.field22053;
        }
        final Class6300 method28940 = this.field22049.method16812(this.field22050, s);
        if (method28940 == null) {
            for (int j = 0; j < this.field22051.length; ++j) {
                final Class6300 method28941 = this.field22051[j].method25407();
                if (s.equals(method28941.method18652())) {
                    return method28941;
                }
                final Class6300 method28942 = method28941.method18657(s);
                if (method28942 != null) {
                    return method28942;
                }
            }
            return null;
        }
        return method28940;
    }
    
    @Override
    public Class330 method16007(final String s) {
        final String[] method28937 = Config.method28937(s, ".");
        if (method28937.length != 2) {
            return null;
        }
        final String s2 = method28937[0];
        final String s3 = method28937[1];
        final Class6300 method28938 = this.method16006(s2);
        if (method28938 != null) {
            final Class2187 method28939 = Class2187.method8356(s3);
            return (method28939 != null) ? new Class330(s, method28938, method28939) : null;
        }
        return null;
    }
    
    public void method16008(final Class6300 field22053) {
        this.field22053 = field22053;
    }
    
    public void method16009(final Class6300 field22052) {
        this.field22052 = field22052;
    }
}
