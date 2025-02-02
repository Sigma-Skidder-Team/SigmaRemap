// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;

import java.util.UUID;
import java.util.List;

public abstract class Class7814 implements Class7813
{
    public static final Minecraft field32015;
    private boolean field32016;
    public String field32017;
    public String field32018;
    public Class304 field32019;
    
    public Class7814(final String field32017, final String field32018, final Class304 field32019) {
        this.field32016 = true;
        this.field32017 = field32017;
        this.field32018 = field32018;
        this.field32019 = field32019;
        Client.getInstance().method35188().method21094(this);
    }
    
    public String method25241() {
        return this.field32017;
    }
    
    public String method25242() {
        return this.field32018;
    }
    
    public void method25243() {
    }
    
    public void method25244() {
    }
    
    public void method25245(final boolean field32016) {
        if (!(this.field32016 = field32016)) {
            this.method25244();
        }
        else {
            this.method25243();
        }
    }
    
    public boolean method25246() {
        return this.field32016;
    }
    
    public List<Class754> method25247() {
        return Class7814.field32015.world.method6840();
    }
    
    public List<Class754> method25248() {
        return Class7814.field32015.world.method6840();
    }
    
    public PlayerEntity method25249(final String obj) {
        for (final PlayerEntity playerEntity : this.method25248()) {
            if (!playerEntity.getName().equals(obj)) {
                continue;
            }
            return playerEntity;
        }
        return null;
    }
    
    public PlayerEntity method25250(final UUID obj) {
        for (final PlayerEntity playerEntity : this.method25248()) {
            if (!playerEntity.method1865().equals(obj)) {
                continue;
            }
            return playerEntity;
        }
        return null;
    }
    
    static {
        field32015 = Minecraft.method5277();
    }
}
