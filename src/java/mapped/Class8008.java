// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import com.google.gson.JsonObject;
import java.io.File;
import com.mojang.authlib.GameProfile;

public class Class8008 extends Class8006<GameProfile, Class6023>
{
    private static String[] field32976;
    
    public Class8008(final File file) {
        super(file);
    }
    
    @Override
    public Class6022<GameProfile> method26215(final JsonObject jsonObject) {
        return new Class6023(jsonObject);
    }
    
    @Override
    public String[] method26210() {
        final String[] array = new String[((Class8006<K, Class6023>)this).method26216().size()];
        int n = 0;
        final Iterator<Class6023> iterator = ((Class8006<K, Class6023>)this).method26216().iterator();
        while (iterator.hasNext()) {
            array[n++] = iterator.next().method17942().getName();
        }
        return array;
    }
    
    public boolean method26221(final GameProfile gameProfile) {
        final Class6023 class6023 = this.method26207(gameProfile);
        return class6023 != null && class6023.method17946();
    }
    
    public String method26220(final GameProfile gameProfile) {
        return gameProfile.getId().toString();
    }
}
