// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import org.json.JSONException;

public class Class8241
{
    private Class4405 field33837;
    public Class4405 field33838;
    public String field33839;
    
    public Class8241() {
    }
    
    public Class8241(final String field33839, final Class4405 field33840) {
        this.field33839 = field33839;
        this.field33838 = field33840;
    }
    
    public Class8241(final String field33839, final Class8241 class8241) {
        this.field33839 = field33839;
        this.field33838 = class8241.field33838;
    }
    
    public Class8241 method27288(final Class4405 class4405) throws JSONException {
        this.field33838 = class4405.method13264("modConfig");
        this.field33839 = class4405.method13268("name");
        return this;
    }
    
    public Class4405 method27289(final Class4405 class4405) {
        class4405.method13301("modConfig", this.field33838);
        class4405.method13301("name", this.field33839);
        return class4405;
    }
    
    public Class4405 method27290() {
        return this.field33837;
    }
    
    public Class8241 method27291(final String s) {
        return new Class8241(s, this.field33838);
    }
    
    public void method27292() {
        Class88 method26638 = null;
        try {
            method26638 = Class8105.method26638(this.field33838, "mods");
        }
        catch (final Class2381 class2381) {}
        if (method26638 != null) {
            for (int i = 0; i < method26638.method462(); ++i) {
                final Class4405 method26639 = method26638.method457(i);
                Object method26640 = null;
                try {
                    method26640 = Class8105.method26636(method26639, "name", null);
                }
                catch (final Class2381 class2382) {
                    Class9463.method35173().method35187().method20241("Invalid name in mod list config");
                }
                for (final Class3167 class2383 : Class9463.method35173().method35189().method21553().values()) {
                    if (class2383.method9901().equals(method26640) && class2383.method9903() != Class8013.field32991 && class2383.method9903() != Class8013.field32984) {
                        method26639.method13301("enabled", "false");
                    }
                }
            }
        }
    }
    
    public void method27293(final Class4405 class4405, final Class3167 class4406) {
        Class88 method26638 = null;
        try {
            method26638 = Class8105.method26638(this.field33838, "mods");
        }
        catch (final Class2381 class4407) {}
        boolean b = false;
        if (method26638 != null) {
            for (int i = 0; i < method26638.method462(); ++i) {
                final Class4405 method26639 = method26638.method457(i);
                Object method26640 = null;
                try {
                    method26640 = Class8105.method26636(method26639, "name", null);
                }
                catch (final Class2381 class4408) {
                    Class9463.method35173().method35187().method20241("Invalid name in mod list config");
                }
                if (class4406.method9901().equals(method26640)) {
                    if (class4406.method9903() != Class8013.field32991 && class4406.method9903() != Class8013.field32984) {
                        method26638.method493(i, class4405);
                    }
                    b = true;
                }
            }
        }
        if (!b) {
            method26638.method486(class4405);
        }
    }
    
    public Class4405 method27294(final Class3167 class3167) {
        Class88 method26638 = null;
        try {
            method26638 = Class8105.method26638(this.field33838, "mods");
        }
        catch (final Class2381 class3168) {}
        if (method26638 != null) {
            for (int i = 0; i < method26638.method462(); ++i) {
                final Class4405 method26639 = method26638.method457(i);
                Object method26640 = null;
                try {
                    method26640 = Class8105.method26636(method26639, "name", null);
                }
                catch (final Class2381 class3169) {
                    Class9463.method35173().method35187().method20241("Invalid name in mod list config");
                }
                if (class3167.method9901().equals(method26640)) {
                    return method26639;
                }
            }
        }
        return null;
    }
}
