// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.UUID;
import com.mojang.util.UUIDTypeAdapter;
import com.mojang.authlib.GameProfile;

public class Class9212
{
    private final String field39021;
    private final String field39022;
    private final String field39023;
    private final Class2105 field39024;
    
    public Class9212(final String field39021, final String field39022, final String field39023, final String s) {
        this.field39021 = field39021;
        this.field39022 = field39022;
        this.field39023 = field39023;
        this.field39024 = Class2105.method8225(s);
    }
    
    public String method33690() {
        return "token:" + this.field39023 + ":" + this.field39022;
    }
    
    public String method33691() {
        return this.field39022;
    }
    
    public String method33692() {
        return this.field39021;
    }
    
    public String method33693() {
        return this.field39023;
    }
    
    public GameProfile method33694() {
        try {
            return new GameProfile(UUIDTypeAdapter.fromString(this.method33691()), this.method33692());
        }
        catch (final IllegalArgumentException ex) {
            return new GameProfile((UUID)null, this.method33692());
        }
    }
}
