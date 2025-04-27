// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Class7266
{
    public Class7266 field28147;
    private Class300 field28148;
    private Boolean field28149;
    private Boolean field28150;
    private Boolean field28151;
    private Boolean field28152;
    private Boolean field28153;
    private String field28154;
    private List<Class7266> field28155;
    private Class8698 field28156;
    private Class7566 field28157;
    
    public Class7266(final Class7266 class7266) {
        this.method22225(class7266, Class1975.field10946, true);
        if (class7266.method22258() != null) {
            final Iterator<Class7266> iterator = class7266.method22258().iterator();
            while (iterator.hasNext()) {
                this.method22244(iterator.next().method22212());
            }
        }
    }
    
    public void method22223(final Class7266 class7266) {
        this.method22225(class7266, Class1975.field10946, true);
    }
    
    public void method22224(final Class7266 class7266, final boolean b) {
        this.method22225(class7266, Class1975.field10946, b);
    }
    
    public void method22225(final Class7266 class7266, final Class1975 class7267, final boolean b) {
        if (class7267 == Class1975.field10945 || class7267 == Class1975.field10946) {
            if (b || this.field28156 == null) {
                this.method22255(class7266.method22259());
            }
            if (b || this.field28157 == null) {
                this.method22256(class7266.method22260());
            }
        }
        if (class7267 == Class1975.field10944 || class7267 == Class1975.field10946) {
            if (b || this.field28148 == null) {
                this.method22248(class7266.method22231());
            }
            if (b || this.field28149 == null) {
                this.method22249(class7266.method22233());
            }
            if (b || this.field28150 == null) {
                this.method22250(class7266.method22235());
            }
            if (b || this.field28151 == null) {
                this.method22251(class7266.method22237());
            }
            if (b || this.field28152 == null) {
                this.method22252(class7266.method22239());
            }
            if (b || this.field28153 == null) {
                this.method22253(class7266.method22241());
            }
            if (b || this.field28154 == null) {
                this.method22254(class7266.method22257());
            }
        }
    }
    
    public void method22226(final Class1975 class1975) {
        if (class1975 == Class1975.field10944 || class1975 == Class1975.field10943) {
            this.method22255(null);
            this.method22256(null);
        }
        if (class1975 == Class1975.field10945 || class1975 == Class1975.field10943) {
            this.method22248(null);
            this.method22249(null);
            this.method22250(null);
            this.method22251(null);
            this.method22252(null);
            this.method22253(null);
            this.method22254(null);
        }
    }
    
    public abstract Class7266 method22212();
    
    @Deprecated
    public Class7266 method22227() {
        final Class7266 method22212 = this.method22212();
        method22212.method22226(Class1975.field10943);
        return method22212;
    }
    
    public static String method22228(final Class7266... array) {
        final StringBuilder sb = new StringBuilder();
        for (int length = array.length, i = 0; i < length; ++i) {
            sb.append(array[i].method22247());
        }
        return sb.toString();
    }
    
    public static String method22229(final Class7266... array) {
        final StringBuilder sb = new StringBuilder();
        for (int length = array.length, i = 0; i < length; ++i) {
            sb.append(array[i].method22246());
        }
        return sb.toString();
    }
    
    public Class300 method22230() {
        if (this.field28148 != null) {
            return this.field28148;
        }
        if (this.field28147 != null) {
            return this.field28147.method22230();
        }
        return Class300.field1733;
    }
    
    public Class300 method22231() {
        return this.field28148;
    }
    
    public boolean method22232() {
        if (this.field28149 != null) {
            return this.field28149;
        }
        return this.field28147 != null && this.field28147.method22232();
    }
    
    public Boolean method22233() {
        return this.field28149;
    }
    
    public boolean method22234() {
        if (this.field28150 != null) {
            return this.field28150;
        }
        return this.field28147 != null && this.field28147.method22234();
    }
    
    public Boolean method22235() {
        return this.field28150;
    }
    
    public boolean method22236() {
        if (this.field28151 != null) {
            return this.field28151;
        }
        return this.field28147 != null && this.field28147.method22236();
    }
    
    public Boolean method22237() {
        return this.field28151;
    }
    
    public boolean method22238() {
        if (this.field28152 != null) {
            return this.field28152;
        }
        return this.field28147 != null && this.field28147.method22238();
    }
    
    public Boolean method22239() {
        return this.field28152;
    }
    
    public boolean method22240() {
        if (this.field28153 != null) {
            return this.field28153;
        }
        return this.field28147 != null && this.field28147.method22240();
    }
    
    public Boolean method22241() {
        return this.field28153;
    }
    
    public void method22242(final List<Class7266> field28155) {
        final Iterator<Class7266> iterator = field28155.iterator();
        while (iterator.hasNext()) {
            iterator.next().field28147 = this;
        }
        this.field28155 = field28155;
    }
    
    public void method22243(final String s) {
        this.method22244(new Class7270(s));
    }
    
    public void method22244(final Class7266 class7266) {
        if (this.field28155 == null) {
            this.field28155 = new ArrayList<Class7266>();
        }
        class7266.field28147 = this;
        this.field28155.add(class7266);
    }
    
    public boolean method22245() {
        if (this.field28148 == null) {
            if (this.field28149 == null) {
                if (this.field28150 == null) {
                    if (this.field28151 == null) {
                        if (this.field28152 == null) {
                            if (this.field28153 == null) {
                                if (this.field28154 == null) {
                                    if (this.field28157 == null) {
                                        return this.field28156 != null;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
    
    public String method22246() {
        final StringBuilder sb = new StringBuilder();
        this.method22216(sb);
        return sb.toString();
    }
    
    public void method22216(final StringBuilder sb) {
        if (this.field28155 != null) {
            final Iterator<Class7266> iterator = this.field28155.iterator();
            while (iterator.hasNext()) {
                iterator.next().method22216(sb);
            }
        }
    }
    
    public String method22247() {
        final StringBuilder sb = new StringBuilder();
        this.method22217(sb);
        return sb.toString();
    }
    
    public void method22217(final StringBuilder sb) {
        if (this.field28155 != null) {
            final Iterator<Class7266> iterator = this.field28155.iterator();
            while (iterator.hasNext()) {
                iterator.next().method22217(sb);
            }
        }
    }
    
    public void method22248(final Class300 field28148) {
        this.field28148 = field28148;
    }
    
    public void method22249(final Boolean field28149) {
        this.field28149 = field28149;
    }
    
    public void method22250(final Boolean field28150) {
        this.field28150 = field28150;
    }
    
    public void method22251(final Boolean field28151) {
        this.field28151 = field28151;
    }
    
    public void method22252(final Boolean field28152) {
        this.field28152 = field28152;
    }
    
    public void method22253(final Boolean field28153) {
        this.field28153 = field28153;
    }
    
    public void method22254(final String field28154) {
        this.field28154 = field28154;
    }
    
    public void method22255(final Class8698 field28156) {
        this.field28156 = field28156;
    }
    
    public void method22256(final Class7566 field28157) {
        this.field28157 = field28157;
    }
    
    @Override
    public String toString() {
        return "BaseComponent(color=" + this.method22230() + ", bold=" + this.field28149 + ", italic=" + this.field28150 + ", underlined=" + this.field28151 + ", strikethrough=" + this.field28152 + ", obfuscated=" + this.field28153 + ", insertion=" + this.method22257() + ", extra=" + this.method22258() + ", clickEvent=" + this.method22259() + ", hoverEvent=" + this.method22260() + ")";
    }
    
    public Class7266() {
    }
    
    public String method22257() {
        return this.field28154;
    }
    
    public List<Class7266> method22258() {
        return this.field28155;
    }
    
    public Class8698 method22259() {
        return this.field28156;
    }
    
    public Class7566 method22260() {
        return this.field28157;
    }
}
