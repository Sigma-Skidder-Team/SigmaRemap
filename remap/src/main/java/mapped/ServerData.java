// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;

public class ServerData
{
    public String field41612;
    public String field41613;
    public String field41614;
    public String field41615;
    public long field41616;
    public int field41617;
    public String field41618;
    public boolean field41619;
    public String field41620;
    private Class2203 field41621;
    private String field41622;
    private boolean field41623;
    
    public ServerData(final String field41612, final String field41613, final boolean field41614) {
        this.field41617 = Class9528.method35579().getProtocolVersion();
        this.field41618 = Class9528.method35579().getName();
        this.field41621 = Class2203.field13414;
        this.field41612 = field41612;
        this.field41613 = field41613;
        this.field41623 = field41614;
    }
    
    public CompoundNBT method35865() {
        final CompoundNBT class51 = new CompoundNBT();
        class51.putString("name", this.field41612);
        class51.putString("ip", this.field41613);
        if (this.field41622 != null) {
            class51.putString("icon", this.field41622);
        }
        if (this.field41621 != Class2203.field13412) {
            if (this.field41621 == Class2203.field13413) {
                class51.putBoolean("acceptTextures", false);
            }
        }
        else {
            class51.putBoolean("acceptTextures", true);
        }
        return class51;
    }
    
    public Class2203 method35866() {
        return this.field41621;
    }
    
    public void method35867(final Class2203 field41621) {
        this.field41621 = field41621;
    }
    
    public static ServerData method35868(final CompoundNBT class51) {
        final ServerData class52 = new ServerData(class51.getString("name"), class51.getString("ip"), false);
        if (class51.contains("icon", 8)) {
            class52.method35870(class51.getString("icon"));
        }
        if (!class51.contains("acceptTextures", 1)) {
            class52.method35867(Class2203.field13414);
        }
        else if (!class51.getBoolean("acceptTextures")) {
            class52.method35867(Class2203.field13413);
        }
        else {
            class52.method35867(Class2203.field13412);
        }
        return class52;
    }
    
    @Nullable
    public String method35869() {
        return this.field41622;
    }
    
    public void method35870(final String field41622) {
        this.field41622 = field41622;
    }
    
    public boolean method35871() {
        return this.field41623;
    }
    
    public void method35872(final ServerData class9575) {
        this.field41613 = class9575.field41613;
        this.field41612 = class9575.field41612;
        this.method35867(class9575.method35866());
        this.field41622 = class9575.field41622;
        this.field41623 = class9575.field41623;
    }
}
