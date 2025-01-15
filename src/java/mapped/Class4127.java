// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.util.Iterator;
import java.util.Collection;
import java.util.TreeSet;
import java.util.Map;
import java.util.LinkedHashMap;

public class Class4127 implements Class4119
{
    private boolean field18248;
    public final /* synthetic */ Class6065 field18249;
    
    public Class4127(final Class6065 field18249, final boolean field18250) {
        this.field18249 = field18249;
        this.field18248 = field18250;
    }
    
    @Override
    public void method12368() throws IOException {
        if (!(Class6065.method18093(this.field18249) instanceof Class6291)) {
            if (!(Class6065.method18093(this.field18249) instanceof Class6298)) {
                throw new Class2395("expected DocumentStartEvent, but got " + Class6065.method18093(this.field18249));
            }
            this.field18249.method18080();
            Class6065.method18094(this.field18249, new Class4133(this.field18249, null));
        }
        else {
            final Class6291 class6291 = (Class6291)Class6065.method18093(this.field18249);
            if (class6291.method18619() != null || class6291.method18620() != null) {
                if (Class6065.method18095(this.field18249)) {
                    this.field18249.method18081("...", true, false, false);
                    this.field18249.method18082();
                }
            }
            if (class6291.method18619() != null) {
                this.field18249.method18085(Class6065.method18096(this.field18249, class6291.method18619()));
            }
            Class6065.method18097(this.field18249, new LinkedHashMap(Class6065.method18098()));
            if (class6291.method18620() != null) {
                for (final String s : new TreeSet(class6291.method18620().keySet())) {
                    final String s2 = class6291.method18620().get(s);
                    Class6065.method18099(this.field18249).put(s2, s);
                    this.field18249.method18086(Class6065.method18100(this.field18249, s), Class6065.method18101(this.field18249, s2));
                }
            }
            boolean b = false;
            Label_0400: {
                if (this.field18248) {
                    if (!class6291.method18618()) {
                        if (!Class6065.method18102(this.field18249)) {
                            if (class6291.method18619() == null) {
                                if (class6291.method18620() == null || class6291.method18620().isEmpty()) {
                                    if (!Class6065.method18103(this.field18249)) {
                                        b = true;
                                        break Label_0400;
                                    }
                                }
                            }
                        }
                    }
                }
                b = false;
            }
            if (!b) {
                this.field18249.method18082();
                this.field18249.method18081("---", true, false, false);
                if (Class6065.method18102(this.field18249)) {
                    this.field18249.method18082();
                }
            }
            Class6065.method18094(this.field18249, new Class4125(this.field18249, null));
        }
    }
}
