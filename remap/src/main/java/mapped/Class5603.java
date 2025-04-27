// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;

public class Class5603 extends Class5601
{
    private Class9319[] field22964;
    private Class5601[] field22965;
    private static final String field22966 = "<profile>";
    private static final String field22967 = "<custom>";
    
    public Class5603(final Class9319[] field22964, final Class5601[] field22965) {
        super("<profile>", "", method16891(field22964, field22965), method16893(field22964), method16892(field22964, field22965, true), null);
        this.field22964 = null;
        this.field22965 = null;
        this.field22964 = field22964;
        this.field22965 = field22965;
    }
    
    @Override
    public void method16867() {
        super.method16867();
        if (this.method16863().equals("<custom>")) {
            super.method16867();
        }
        this.method16888();
    }
    
    public void method16887() {
        final Class9319 method16890 = this.method16890(this.method16863());
        if (!Class7510.method23442(method16890, this.field22965, false)) {
            this.method16864(method16891(this.field22964, this.field22965));
        }
    }
    
    private void method16888() {
        final Class9319 method16890 = this.method16890(this.method16863());
        if (method16890 != null) {
            final String[] method16891 = method16890.method34504();
            for (int i = 0; i < method16891.length; ++i) {
                final String s = method16891[i];
                final Class5601 method16892 = this.method16889(s);
                if (method16892 != null) {
                    method16892.method16864(method16890.method34505(s));
                }
            }
        }
    }
    
    private Class5601 method16889(final String anObject) {
        for (int i = 0; i < this.field22965.length; ++i) {
            final Class5601 class5601 = this.field22965[i];
            if (class5601.method16860().equals(anObject)) {
                return class5601;
            }
        }
        return null;
    }
    
    private Class9319 method16890(final String anObject) {
        for (int i = 0; i < this.field22964.length; ++i) {
            final Class9319 class9319 = this.field22964[i];
            if (class9319.method34500().equals(anObject)) {
                return class9319;
            }
        }
        return null;
    }
    
    @Override
    public String method16858() {
        return Class4647.method13876("of.shaders.profile");
    }
    
    @Override
    public String method16878(final String str) {
        return str.equals("<custom>") ? Class4647.method13877("of.general.custom", "<custom>") : Class9216.method33898("profile." + str, str);
    }
    
    @Override
    public String method16879(final String s) {
        return s.equals("<custom>") ? "§c" : "§a";
    }
    
    @Override
    public String method16859() {
        final String method33898 = Class9216.method33898("profile.comment", null);
        if (method33898 == null) {
            final StringBuffer sb = new StringBuffer();
            for (int i = 0; i < this.field22964.length; ++i) {
                final String method33899 = this.field22964[i].method34500();
                if (method33899 != null) {
                    final String method33900 = Class9216.method33898("profile." + method33899 + ".comment", null);
                    if (method33900 != null) {
                        sb.append(method33900);
                        if (!method33900.endsWith(". ")) {
                            sb.append(". ");
                        }
                    }
                }
            }
            return sb.toString();
        }
        return method33898;
    }
    
    private static String method16891(final Class9319[] array, final Class5601[] array2) {
        return method16892(array, array2, false);
    }
    
    private static String method16892(final Class9319[] array, final Class5601[] array2, final boolean b) {
        final Class9319 method23441 = Class7510.method23441(array, array2, b);
        return (method23441 != null) ? method23441.method34500() : "<custom>";
    }
    
    private static String[] method16893(final Class9319[] array) {
        final ArrayList list = new ArrayList();
        for (int i = 0; i < array.length; ++i) {
            list.add(array[i].method34500());
        }
        list.add("<custom>");
        return (String[])list.toArray(new String[list.size()]);
    }
}
