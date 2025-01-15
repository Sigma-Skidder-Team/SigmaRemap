// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.authlib.GameProfile;

public class Class8499
{
    private static String[] field34892;
    private final int field34893;
    private final int field34894;
    private GameProfile[] field34895;
    
    public Class8499(final int field34893, final int field34894) {
        this.field34893 = field34893;
        this.field34894 = field34894;
    }
    
    public int method28397() {
        return this.field34893;
    }
    
    public int method28398() {
        return this.field34894;
    }
    
    public GameProfile[] method28399() {
        return this.field34895;
    }
    
    public void method28400(final GameProfile[] field34895) {
        this.field34895 = field34895;
    }
}
