// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Class7508 implements Class7509
{
    private static final Map<String, String> field29104;
    public final Class7545 field29105;
    private Class6287 field29106;
    private final Class7653<Class4974> field29107;
    private final Class7653<Class2314> field29108;
    private Class4974 field29109;
    private Class8342 field29110;
    
    public Class7508(final Class8028 class8028) {
        this(new Class7544(class8028));
    }
    
    public Class7508(final Class7545 field29105) {
        this.field29105 = field29105;
        this.field29106 = null;
        this.field29110 = new Class8342(null, new HashMap<String, String>(Class7508.field29104));
        this.field29107 = new Class7653<Class4974>(100);
        this.field29108 = new Class7653<Class2314>(10);
        this.field29109 = new Class4976(this, null);
    }
    
    @Override
    public boolean method23422(final Class2211 class2211) {
        this.method23423();
        return this.field29106 != null && this.field29106.method18614(class2211);
    }
    
    @Override
    public Class6287 method23423() {
        if (this.field29106 == null) {
            if (this.field29109 != null) {
                this.field29106 = this.field29109.method15159();
            }
        }
        return this.field29106;
    }
    
    @Override
    public Class6287 method23424() {
        this.method23423();
        final Class6287 field29106 = this.field29106;
        this.field29106 = null;
        return field29106;
    }
    
    private Class8342 method23425() {
        Class2206 class2206 = null;
        final HashMap hashMap = new HashMap();
        while (this.field29105.method23631(Class2207.field13435)) {
            final Class5238 class2207 = (Class5238)this.field29105.method23633();
            if (class2207.method16350().equals("YAML")) {
                if (class2206 != null) {
                    throw new Class2394(null, null, "found duplicate YAML directive", class2207.method16348());
                }
                final List method16351 = class2207.method16351();
                if ((int)method16351.get(0) != 1) {
                    throw new Class2394(null, null, "found incompatible YAML document (version 1.* is required)", class2207.method16348());
                }
                switch ((int)method16351.get(1)) {
                    case 0: {
                        class2206 = Class2206.field13425;
                        continue;
                    }
                    default: {
                        class2206 = Class2206.field13426;
                        continue;
                    }
                }
            }
            else {
                if (!class2207.method16350().equals("TAG")) {
                    continue;
                }
                final List method16352 = class2207.method16351();
                final String key = (String)method16352.get(0);
                final String value = (String)method16352.get(1);
                if (hashMap.containsKey(key)) {
                    throw new Class2394(null, null, "duplicate tag handle " + key, class2207.method16348());
                }
                hashMap.put(key, value);
            }
        }
        if (class2206 != null || !hashMap.isEmpty()) {
            for (final String s : Class7508.field29104.keySet()) {
                if (!hashMap.containsKey(s)) {
                    hashMap.put(s, Class7508.field29104.get(s));
                }
            }
            this.field29110 = new Class8342(class2206, hashMap);
        }
        return this.field29110;
    }
    
    private Class6287 method23426() {
        return this.method23428(false, false);
    }
    
    private Class6287 method23427() {
        return this.method23428(true, true);
    }
    
    private Class6287 method23428(final boolean b, final boolean b2) {
        Class2314 method16348 = null;
        Class2314 class2314 = null;
        Class2314 class2315 = null;
        Class6292 class2321;
        if (!this.field29105.method23631(Class2207.field13429)) {
            String s = null;
            Class8352 class2316 = null;
            if (!this.field29105.method23631(Class2207.field13430)) {
                if (this.field29105.method23631(Class2207.field13447)) {
                    final Class5254 class2317 = (Class5254)this.field29105.method23633();
                    method16348 = (class2315 = class2317.method16348());
                    class2314 = class2317.method16349();
                    class2316 = class2317.method16357();
                    if (this.field29105.method23631(Class2207.field13430)) {
                        final Class5249 class2318 = (Class5249)this.field29105.method23633();
                        class2314 = class2318.method16349();
                        s = class2318.method16353();
                    }
                }
            }
            else {
                final Class5249 class2319 = (Class5249)this.field29105.method23633();
                method16348 = class2319.method16348();
                class2314 = class2319.method16349();
                s = class2319.method16353();
                if (this.field29105.method23631(Class2207.field13447)) {
                    final Class5254 class2320 = (Class5254)this.field29105.method23633();
                    class2315 = class2320.method16348();
                    class2314 = class2320.method16349();
                    class2316 = class2320.method16357();
                }
            }
            String string = null;
            if (class2316 != null) {
                final String method16349 = class2316.method27873();
                final String method16350 = class2316.method27874();
                if (method16349 == null) {
                    string = method16350;
                }
                else {
                    if (!this.field29110.method27807().containsKey(method16349)) {
                        throw new Class2394("while parsing a node", method16348, "found undefined tag handle " + method16349, class2315);
                    }
                    string = this.field29110.method27807().get(method16349) + method16350;
                }
            }
            if (method16348 == null) {
                method16348 = (class2314 = this.field29105.method23632().method16348());
            }
            final boolean b3 = string == null || string.equals("!");
            if (b2 && this.field29105.method23631(Class2207.field13432)) {
                class2321 = new Class6294(s, string, b3, method16348, this.field29105.method23632().method16349(), Class227.field801);
                this.field29109 = new Class4983(this, null);
            }
            else if (!this.field29105.method23631(Class2207.field13444)) {
                if (!this.field29105.method23631(Class2207.field13442)) {
                    if (!this.field29105.method23631(Class2207.field13440)) {
                        if (b && this.field29105.method23631(Class2207.field13434)) {
                            class2321 = new Class6294(s, string, b3, method16348, this.field29105.method23632().method16348(), Class227.field801);
                            this.field29109 = new Class4984(this, null);
                        }
                        else if (b && this.field29105.method23631(Class2207.field13433)) {
                            class2321 = new Class6295(s, string, b3, method16348, this.field29105.method23632().method16348(), Class227.field801);
                            this.field29109 = new Class4993(this, null);
                        }
                        else {
                            if (s == null && string == null) {
                                String str;
                                if (!b) {
                                    str = "flow";
                                }
                                else {
                                    str = "block";
                                }
                                final Class5233 method16351 = this.field29105.method23632();
                                throw new Class2394("while parsing a " + str + " node", method16348, "expected the node content, but found '" + method16351.method16347() + "'", method16351.method16348());
                            }
                            class2321 = new Class6297(s, string, new Class9063(b3, false), "", method16348, class2314, Class2031.field11579);
                            this.field29109 = this.field29107.method24254();
                        }
                    }
                    else {
                        class2321 = new Class6295(s, string, b3, method16348, this.field29105.method23632().method16349(), Class227.field800);
                        this.field29109 = new Class4980(this, null);
                    }
                }
                else {
                    class2321 = new Class6294(s, string, b3, method16348, this.field29105.method23632().method16349(), Class227.field800);
                    this.field29109 = new Class4989(this, null);
                }
            }
            else {
                final Class5250 class2322 = (Class5250)this.field29105.method23633();
                final Class2314 method16352 = class2322.method16349();
                Class9063 class2323;
                if ((!class2322.method16354() || string != null) && !"!".equals(string)) {
                    if (string != null) {
                        class2323 = new Class9063(false, false);
                    }
                    else {
                        class2323 = new Class9063(false, true);
                    }
                }
                else {
                    class2323 = new Class9063(true, false);
                }
                class2321 = new Class6297(s, string, class2323, class2322.method16355(), method16348, method16352, class2322.method16356());
                this.field29109 = this.field29107.method24254();
            }
        }
        else {
            final Class5242 class2324 = (Class5242)this.field29105.method23633();
            class2321 = new Class6296(class2324.method16352(), class2324.method16348(), class2324.method16349());
            this.field29109 = this.field29107.method24254();
        }
        return class2321;
    }
    
    private Class6287 method23429(final Class2314 class2314) {
        return new Class6297(null, null, new Class9063(true, false), "", class2314, class2314, Class2031.field11579);
    }
    
    static {
        (field29104 = new HashMap<String, String>()).put(Class7508.\u5ad7\uc10a\u8ca9\u54f3\u2ca2\u65ed[7], Class7508.\u5ad7\uc10a\u8ca9\u54f3\u2ca2\u65ed[7]);
        Class7508.field29104.put("!!", "tag:yaml.org,2002:");
    }
}
