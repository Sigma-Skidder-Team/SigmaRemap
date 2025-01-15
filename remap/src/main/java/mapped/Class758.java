// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.hash.Hashing;
import java.io.File;
import javax.annotation.Nullable;
import com.mojang.authlib.GameProfile;

public class Class758 extends Class754
{
    public Class758(final Class1848 class1848, final GameProfile gameProfile) {
        super(class1848, gameProfile);
    }
    
    @Override
    public boolean method1639() {
        return false;
    }
    
    @Override
    public boolean method2889() {
        Class869.method5277().method5269().method17371(this.method2844().getId());
        return true;
    }
    
    @Override
    public boolean method4094() {
        return false;
    }
    
    @Nullable
    @Override
    public Class9081 method4095() {
        return null;
    }
    
    @Override
    public boolean method4096() {
        return false;
    }
    
    @Override
    public Class1932 method4097() {
        final Class9081 method4095 = this.method4095();
        return (method4095 != null) ? method4095.method32726() : Class7634.method24004(this.method1865());
    }
    
    @Nullable
    @Override
    public Class1932 method4098() {
        final Class9081 method4095 = this.method4095();
        return (method4095 != null) ? method4095.method32727() : null;
    }
    
    @Override
    public boolean method4099() {
        return this.method4095() != null;
    }
    
    @Nullable
    @Override
    public Class1932 method4100() {
        final Class9081 method4095 = this.method4095();
        return (method4095 != null) ? method4095.method32728() : null;
    }
    
    public static Class1768 method4101(final Class1932 class1932, final String s) {
        final Class1663 method5290 = Class869.method5277().method5290();
        Class1666 method5291 = method5290.method5853(class1932);
        if (method5291 == null) {
            method5291 = new Class1768(null, String.format("http://skins.minecraft.net/MinecraftSkins/%s.png", Class8272.method27499(s)), Class7634.method24004(Class512.method2894(s)), true, null);
            method5290.method5851(class1932, method5291);
        }
        return (Class1768)method5291;
    }
    
    public static Class1932 method4102(final String s) {
        return new Class1932("skins/" + Hashing.sha1().hashUnencodedChars((CharSequence)Class8272.method27499(s)));
    }
    
    @Override
    public String method4103() {
        return Class7634.method24005(this.method1865());
    }
    
    @Override
    public float method4104() {
        return 0.0f;
    }
}
