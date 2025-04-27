// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import com.google.gson.JsonObject;
import java.io.File;
import com.mojang.authlib.GameProfile;

public class Class8007 extends Class8006<GameProfile, Class6025>
{
    private static String[] field32975;
    
    public Class8007(final File file) {
        super(file);
    }
    
    @Override
    public Class6022<GameProfile> method26215(final JsonObject jsonObject) {
        return new Class6025(jsonObject);
    }
    
    public boolean method26219(final GameProfile gameProfile) {
        return this.method26213(gameProfile);
    }
    
    @Override
    public String[] method26210() {
        final String[] array = new String[this.method26216().size()];
        int n = 0;
        final Iterator<Class6025> iterator = this.method26216().iterator();
        while (iterator.hasNext()) {
            array[n++] = iterator.next().method17942().getName();
        }
        return array;
    }
    
    public String method26220(final GameProfile gameProfile) {
        return gameProfile.getId().toString();
    }
}
