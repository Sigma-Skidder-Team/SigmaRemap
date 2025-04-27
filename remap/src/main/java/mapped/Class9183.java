// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.ConcurrentHashMap;
import java.util.UUID;
import java.util.Map;

public class Class9183
{
    private final Map<UUID, Class6108> field38907;
    private final Class9366 field38908;
    private final Class8720 field38909;
    private boolean field38910;
    private final Class8750 field38911;
    private final Class6791 field38912;
    private final Class7091 field38913;
    
    public Class9183(final Class9366 field38908, final Class8750 field38909, final Class6791 field38910, final Class7091 field38911) {
        this.field38907 = new ConcurrentHashMap<UUID, Class6108>();
        this.field38909 = new Class8720();
        this.field38910 = false;
        this.field38908 = field38908;
        this.field38911 = field38909;
        this.field38912 = field38910;
        this.field38913 = field38911;
    }
    
    public Class8720 method33549() {
        return this.field38909;
    }
    
    public void method33550() {
        if (System.getProperty("ViaVersion") != null) {
            this.field38908.method34758();
        }
        Class8626.method29276();
        try {
            this.field38911.method30249();
        }
        catch (final Exception ex) {
            this.method33558().method34742().severe("ViaVersion failed to inject:");
            ex.printStackTrace();
            return;
        }
        System.setProperty("ViaVersion", this.method33558().method34745());
        this.field38908.method34747(new Class1423(this));
    }
    
    public void method33551() {
        try {
            Class8626.field36206 = this.field38911.method30251();
        }
        catch (final Exception ex) {
            this.method33558().method34742().severe("ViaVersion failed to get the server protocol!");
            ex.printStackTrace();
        }
        if (Class8626.field36206 != -1) {
            this.method33558().method34742().info("ViaVersion detected server version: " + Class7906.method25609(Class8626.field36206));
            if (!Class8626.method29277()) {
                this.method33558().method34742().warning("ViaVersion does not have any compatible versions for this server version, please read our resource page carefully.");
            }
        }
        Class8626.method29278();
        this.field38913.method21671();
        Class8626.method29275();
    }
    
    public void method33552() {
        this.method33558().method34742().info("ViaVersion is disabling, if this is a reload and you experience issues consider rebooting.");
        try {
            this.field38911.method30250();
        }
        catch (final Exception ex) {
            this.method33558().method34742().severe("ViaVersion failed to uninject:");
            ex.printStackTrace();
        }
        this.field38913.method21672();
    }
    
    public void method33553(final Class6108 class6108) {
        this.field38907.put(class6108.method18207(Class6651.class).method20210(), class6108);
    }
    
    public void method33554(final UUID uuid) {
        this.field38907.remove(uuid);
    }
    
    public Class6108 method33555(final UUID uuid) {
        return this.field38907.get(uuid);
    }
    
    public static Class9284 method33556() {
        return new Class9284();
    }
    
    public Map<UUID, Class6108> method33557() {
        return this.field38907;
    }
    
    public Class9366 method33558() {
        return this.field38908;
    }
    
    public boolean method33559() {
        return this.field38910;
    }
    
    public Class8750 method33560() {
        return this.field38911;
    }
    
    public Class6791 method33561() {
        return this.field38912;
    }
    
    public Class7091 method33562() {
        return this.field38913;
    }
    
    public void method33563(final boolean field38910) {
        this.field38910 = field38910;
    }
}
