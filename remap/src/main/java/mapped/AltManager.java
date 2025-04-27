// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

import com.mentalfrostbyte.Client;
import com.mojang.authlib.exceptions.AuthenticationException;
import totalcross.json.JSONArray;
import totalcross.json.JSONObject;

import java.util.Iterator;
import java.io.File;
import java.util.ArrayList;

public class AltManager
{
    public ArrayList<Class7971> field32296;
    public File field32297;
    private String field32298;
    private final Class8327 field32299;
    
    public AltManager() {
        this.field32296 = new ArrayList<Class7971>();
        this.field32297 = new File(Client.getInstance().getFile() + "/alts.json");
        this.field32299 = new Class8327();
        this.method25468();
    }
    
    public void method25457() {
        Client.getInstance().getEventBus().registerInstance(this);
        Client.getInstance().getEventBus().registerInstance(this.field32299);
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
            Minecraft.getInstance().field4642 = class7971.method25903();
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
            JSONArray.put(iterator.next().method25904());
        }
        final JSONObject class89 = new JSONObject();
        class89.put("alts", JSONArray);
        try {
            ConfigJsonUtil.saveJSONToFile(class89, new File(Client.getInstance().getFile() + "/alts.json"));
        }
        catch (final JSONException | IOException ex) {
            Client.getInstance().getLogger().error(((Throwable)ex).getMessage());
        }
    }
    
    private void method25468() {
        try {
            final JSONObject method35586 = ConfigJsonUtil.method35586(this.field32297);
            if (!method35586.has("alts")) {
                method35586.put("alts", new JSONArray());
            }
            final Iterator<Object> iterator = method35586.getJSONArray("alts").iterator();
            while (iterator.hasNext()) {
                this.field32296.add(new Class7971(iterator.next()));
            }
        }
        catch (final IOException ex) {
            Client.getInstance().getLogger().error(ex.getMessage());
        }
    }
    
    public String method25469() {
        return this.field32298;
    }
    
    public boolean method25470(final Class7971 class7971) {
        if (this.method25469() != null) {
            return class7971.method25888().equals(this.method25469());
        }
        return class7971.method25889().equals(Minecraft.getInstance().method5287().method33692());
    }
}
