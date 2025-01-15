// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;

public final class Class8084
{
    private final Class6063 field33292;
    private final Class8735 field33293;
    private boolean field33294;
    private boolean field33295;
    private Class2206 field33296;
    private Map<String, String> field33297;
    private Set<Class7576> field33298;
    private Map<Class7576, String> field33299;
    private Class7089 field33300;
    private Boolean field33301;
    private Class8542 field33302;
    
    public Class8084(final Class6063 field33292, final Class8735 field33293, final Class7902 class7902, final Class8542 field33294) {
        this.field33292 = field33292;
        this.field33293 = field33293;
        this.field33294 = class7902.method25595();
        this.field33295 = class7902.method25597();
        if (class7902.method25582() != null) {
            this.field33296 = class7902.method25582();
        }
        this.field33297 = class7902.method25599();
        this.field33298 = new HashSet<Class7576>();
        this.field33299 = new HashMap<Class7576, String>();
        this.field33300 = class7902.method25605();
        this.field33301 = null;
        this.field33302 = field33294;
    }
    
    public void method26540() throws IOException {
        if (this.field33301 == null) {
            this.field33292.method18052(new Class6286(null, null));
            this.field33301 = Boolean.FALSE;
            return;
        }
        if (!Boolean.TRUE.equals(this.field33301)) {
            throw new Class2388("serializer is already opened");
        }
        throw new Class2388("serializer is closed");
    }
    
    public void method26541() throws IOException {
        if (this.field33301 != null) {
            if (!Boolean.TRUE.equals(this.field33301)) {
                this.field33292.method18052(new Class6298(null, null));
                this.field33301 = Boolean.TRUE;
            }
            return;
        }
        throw new Class2388("serializer is not opened");
    }
    
    public void method26542(final Class7576 class7576) throws IOException {
        if (this.field33301 == null) {
            throw new Class2388("serializer is not opened");
        }
        if (!this.field33301) {
            this.field33292.method18052(new Class6291(null, null, this.field33294, this.field33296, this.field33297));
            this.method26543(class7576);
            if (this.field33302 != null) {
                class7576.method23848(this.field33302);
            }
            this.method26544(class7576, null);
            this.field33292.method18052(new Class6299(null, null, this.field33295));
            this.field33298.clear();
            this.field33299.clear();
            return;
        }
        throw new Class2388("serializer is closed");
    }
    
    private void method26543(Class7576 method23858) {
        if (method23858.method23834() == Class2085.field12058) {
            method23858 = ((Class7578)method23858).method23858();
        }
        if (this.field33299.containsKey(method23858)) {
            if (null == this.field33299.get(method23858)) {
                this.field33299.put(method23858, this.field33300.method21670(method23858));
            }
        }
        else {
            this.field33299.put(method23858, null);
            switch (Class8240.field33836[method23858.method23834().ordinal()]) {
                case 1: {
                    final Iterator<Class7576> iterator = ((Class7573)method23858).method23835().iterator();
                    while (iterator.hasNext()) {
                        this.method26543(iterator.next());
                    }
                    break;
                }
                case 2: {
                    for (final Class9474 class9474 : ((Class7575)method23858).method23835()) {
                        final Class7576 method23859 = class9474.method35260();
                        final Class7576 method23860 = class9474.method35261();
                        this.method26543(method23859);
                        this.method26543(method23860);
                    }
                    break;
                }
            }
        }
    }
    
    private void method26544(Class7576 method23858, final Class7576 class7576) throws IOException {
        if (method23858.method23834() == Class2085.field12058) {
            method23858 = ((Class7578)method23858).method23858();
        }
        final String s = this.field33299.get(method23858);
        if (this.field33298.contains(method23858)) {
            this.field33292.method18052(new Class6296(s, null, null));
        }
        else {
            this.field33298.add(method23858);
            switch (Class8240.field33836[method23858.method23834().ordinal()]) {
                case 3: {
                    final Class7577 class7577 = (Class7577)method23858;
                    this.field33292.method18052(new Class6297(s, method23858.method23845().method28657(), new Class9063(method23858.method23845().equals(this.field33293.method30183(Class2085.field12055, class7577.method23856(), true)), method23858.method23845().equals(this.field33293.method30183(Class2085.field12055, class7577.method23856(), false))), class7577.method23856(), null, null, class7577.method23855()));
                    break;
                }
                case 1: {
                    final Class7573 class7578 = (Class7573)method23858;
                    this.field33292.method18052(new Class6294(s, method23858.method23845().method28657(), method23858.method23845().equals(this.field33293.method30183(Class2085.field12056, null, true)), null, null, class7578.method23837()));
                    final Iterator<Class7576> iterator = class7578.method23835().iterator();
                    while (iterator.hasNext()) {
                        this.method26544(iterator.next(), method23858);
                    }
                    this.field33292.method18052(new Class6290(null, null));
                    break;
                }
                default: {
                    this.field33292.method18052(new Class6295(s, method23858.method23845().method28657(), method23858.method23845().equals(this.field33293.method30183(Class2085.field12057, null, true)), null, null, ((Class7574)method23858).method23837()));
                    final Class7575 class7579 = (Class7575)method23858;
                    for (final Class9474 class7580 : class7579.method23835()) {
                        final Class7576 method23859 = class7580.method35260();
                        final Class7576 method23860 = class7580.method35261();
                        this.method26544(method23859, class7579);
                        this.method26544(method23860, class7579);
                    }
                    this.field33292.method18052(new Class6289(null, null));
                    break;
                }
            }
        }
    }
}
