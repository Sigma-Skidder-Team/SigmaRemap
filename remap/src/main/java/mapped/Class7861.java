// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

import com.mentalfrostbyte.Client;
import com.mojang.authlib.exceptions.AuthenticationException;
import java.util.Iterator;
import java.io.File;
import java.util.ArrayList;

public class Class7861
{
    public ArrayList<Class7971> field32296;
    public File field32297;
    private String field32298;
    private Class8327 field32299;
    
    public Class7861() {
        this.field32296 = new ArrayList<Class7971>();
        this.field32297 = new File(Client.method35173().method35208() + "/alts.json");
        this.field32299 = new Class8327();
        this.method25468();
    }
    
    public void method25457() {
        Client.method35173().method35188().method21094(this);
        Client.method35173().method35188().method21094(this.field32299);
    }
    
    @Deprecated
    public void method25458(final Class7971 e) {
        this.field32296.add(e);
    }
    
    public void method25459(final Class7971 class7971) {
        for (int i = 0; i < this.field32296.size(); ++i) {
            if (this.field32296.get(i).method25888().equals(class7971.method25888())) {
                this.field32296.set(i, class7971);
                return;
            }
        }
        this.field32296.add(class7971);
    }
    
    public void method25460(final Class7971 class7971) {
        for (int i = 0; i < this.field32296.size(); ++i) {
            if (this.field32296.get(i).method25888().equals(class7971.method25888())) {
                this.field32296.remove(i);
                return;
            }
        }
    }
    
    public boolean method25461(final Class7971 class7971) {
        for (int i = 0; i < this.field32296.size(); ++i) {
            if (this.field32296.get(i).method25888().equals(class7971.method25888())) {
                return true;
            }
        }
        return false;
    }
    
    public Class7971 method25462() {
        for (final Class7971 class7971 : this.field32296) {
            if (!class7971.method25888().equals(this.field32298)) {
                continue;
            }
            return class7971;
        }
        return null;
    }
    
    public boolean method25463(final Class7971 class7971) {
        try {
            Minecraft.method5277().field4642 = class7971.method25903();
            this.field32298 = class7971.method25888();
            return true;
        }
        catch (final AuthenticationException ex) {
            return false;
        }
    }
    
    public boolean method25464(final Class7971 class7971) {
        try {
            class7971.method25903();
            this.field32298 = class7971.method25888();
            return true;
        }
        catch (final AuthenticationException ex) {
            return false;
        }
    }
    
    public void method25465(final Class7971 o) {
        this.field32296.remove(o);
    }
    
    public ArrayList<Class7971> method25466() {
        return this.field32296;
    }
    
    public void method25467() {
        final JSONArray JSONArray = new JSONArray();
        final Iterator<Class7971> iterator = this.field32296.iterator();
        while (iterator.hasNext()) {
            JSONArray.method486(iterator.next().method25904());
        }
        final JSONObject class89 = new JSONObject();
        class89.method13301("alts", JSONArray);
        try {
            Class9532.method35585(class89, new File(Client.method35173().method35208() + "/alts.json"));
        }
        catch (final JSONException | IOException ex) {
            Client.method35173().method35187().method20242(((Throwable)ex).getMessage());
        }
    }
    
    private void method25468() {
        try {
            final JSONObject method35586 = Class9532.method35586(this.field32297);
            if (!method35586.has("alts")) {
                method35586.method13301("alts", new JSONArray());
            }
            final Iterator<Object> iterator = method35586.method13263("alts").iterator();
            while (iterator.hasNext()) {
                this.field32296.add(new Class7971(iterator.next()));
            }
        }
        catch (final IOException ex) {
            Client.method35173().method35187().method20242(ex.getMessage());
        }
    }
    
    public String method25469() {
        return this.field32298;
    }
    
    public boolean method25470(final Class7971 class7971) {
        if (this.method25469() != null) {
            return class7971.method25888().equals(this.method25469());
        }
        return class7971.method25889().equals(Minecraft.method5277().method5287().method33692());
    }
}
