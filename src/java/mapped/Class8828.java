// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class Class8828
{
    public final Class7509 field37114;
    private final Class8735 field37115;
    private final Map<String, Class7576> field37116;
    private final Set<Class7576> field37117;
    
    public Class8828(final Class7509 field37114, final Class8735 field37115) {
        this.field37114 = field37114;
        this.field37115 = field37115;
        this.field37116 = new HashMap<String, Class7576>();
        this.field37117 = new HashSet<Class7576>();
    }
    
    public boolean method30801() {
        if (this.field37114.method23422(Class2211.field13481)) {
            this.field37114.method23424();
        }
        return !this.field37114.method23422(Class2211.field13480);
    }
    
    public Class7576 method30802() {
        this.field37114.method23424();
        final Class7576 method30804 = this.method30804(null);
        this.field37114.method23424();
        this.field37116.clear();
        this.field37117.clear();
        return method30804;
    }
    
    public Class7576 method30803() {
        this.field37114.method23424();
        Class7576 method30802 = null;
        if (!this.field37114.method23422(Class2211.field13480)) {
            method30802 = this.method30802();
        }
        if (this.field37114.method23422(Class2211.field13480)) {
            this.field37114.method23424();
            return method30802;
        }
        throw new Class2393("expected a single document in the stream", method30802.method23847(), "but found another document", this.field37114.method23424().method18615());
    }
    
    private Class7576 method30804(final Class7576 class7576) {
        if (class7576 != null) {
            this.field37117.add(class7576);
        }
        Class7576 class7577;
        if (!this.field37114.method23422(Class2211.field13472)) {
            final String method18621 = ((Class6292)this.field37114.method23423()).method18621();
            if (!this.field37114.method23422(Class2211.field13477)) {
                if (!this.field37114.method23422(Class2211.field13479)) {
                    class7577 = this.method30807(method18621);
                }
                else {
                    class7577 = this.method30806(method18621);
                }
            }
            else {
                class7577 = this.method30805(method18621);
            }
        }
        else {
            final Class6296 class7578 = (Class6296)this.field37114.method23424();
            final String method18622 = class7578.method18621();
            if (!this.field37116.containsKey(method18622)) {
                throw new Class2393(null, null, "found undefined alias " + method18622, class7578.method18615());
            }
            class7577 = this.field37116.get(method18622);
            if (this.field37117.remove(class7577)) {
                class7577.method23851(true);
            }
        }
        this.field37117.remove(class7576);
        return class7577;
    }
    
    public Class7576 method30805(final String s) {
        final Class6297 class6297 = (Class6297)this.field37114.method23424();
        final String method18626 = class6297.method18626();
        boolean b = false;
        Class8542 method18627;
        if (method18626 != null && !method18626.equals("!")) {
            method18627 = new Class8542(method18626);
        }
        else {
            method18627 = this.field37115.method30183(Class2085.field12055, class6297.method18628(), class6297.method18629().method32636());
            b = true;
        }
        final Class7577 class6298 = new Class7577(method18627, b, class6297.method18628(), class6297.method18615(), class6297.method18616(), class6297.method18627());
        if (s != null) {
            this.field37116.put(s, class6298);
        }
        return class6298;
    }
    
    public Class7576 method30806(final String s) {
        final Class6294 class6294 = (Class6294)this.field37114.method23424();
        final String method18622 = class6294.method18622();
        boolean b = false;
        Class8542 method18623;
        if (method18622 != null && !method18622.equals("!")) {
            method18623 = new Class8542(method18622);
        }
        else {
            method18623 = this.field37115.method30183(Class2085.field12056, null, class6294.method18623());
            b = true;
        }
        final ArrayList<Class7576> list = new ArrayList<Class7576>();
        final Class7573 class6295 = new Class7573(method18623, b, list, class6294.method18615(), null, class6294.method18624());
        if (s != null) {
            this.field37116.put(s, class6295);
        }
        while (!this.field37114.method23422(Class2211.field13478)) {
            list.add(this.method30804(class6295));
        }
        class6295.method23839(this.field37114.method23424().method18616());
        return class6295;
    }
    
    public Class7576 method30807(final String s) {
        final Class6295 class6295 = (Class6295)this.field37114.method23424();
        final String method18622 = class6295.method18622();
        boolean b = false;
        Class8542 method18623;
        if (method18622 != null && !method18622.equals("!")) {
            method18623 = new Class8542(method18622);
        }
        else {
            method18623 = this.field37115.method30183(Class2085.field12057, null, class6295.method18623());
            b = true;
        }
        final ArrayList<Class9474> list = new ArrayList<Class9474>();
        final Class7575 class6296 = new Class7575(method18623, b, list, class6295.method18615(), null, class6295.method18624());
        if (s != null) {
            this.field37116.put(s, class6296);
        }
        while (!this.field37114.method23422(Class2211.field13475)) {
            this.method30808(list, class6296);
        }
        class6296.method23839(this.field37114.method23424().method18616());
        return class6296;
    }
    
    public void method30808(final List<Class9474> list, final Class7575 class7575) {
        final Class7576 method30809 = this.method30809(class7575);
        if (method30809.method23845().equals(Class8542.field35865)) {
            class7575.method23843(true);
        }
        list.add(new Class9474(method30809, this.method30810(class7575)));
    }
    
    public Class7576 method30809(final Class7575 class7575) {
        return this.method30804(class7575);
    }
    
    public Class7576 method30810(final Class7575 class7575) {
        return this.method30804(class7575);
    }
}
