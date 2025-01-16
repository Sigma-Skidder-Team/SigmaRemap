// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Iterables;

import javax.annotation.Nullable;
import java.util.UUID;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.GameProfile;

public class Class493 extends TileEntity implements Class439
{
    private GameProfile field2835;
    private int field2836;
    private boolean field2837;
    private static Class8608 field2838;
    private static MinecraftSessionService field2839;
    
    public Class493() {
        super(Class5412.field22555);
    }
    
    public static void method2502(final Class8608 field2838) {
        Class493.field2838 = field2838;
    }
    
    public static void method2503(final MinecraftSessionService field2839) {
        Class493.field2839 = field2839;
    }
    
    @Override
    public Class51 method2180(final Class51 class51) {
        super.method2180(class51);
        if (this.field2835 != null) {
            final Class51 class52 = new Class51();
            Class9346.method34641(class52, this.field2835);
            class51.method295("Owner", class52);
        }
        return class51;
    }
    
    @Override
    public void method2179(final Class51 class51) {
        super.method2179(class51);
        if (!class51.method316("Owner", 10)) {
            if (class51.method316("ExtraType", 8)) {
                final String method323 = class51.method323("ExtraType");
                if (!Class8272.method27500(method323)) {
                    this.method2506(new GameProfile((UUID)null, method323));
                }
            }
        }
        else {
            this.method2506(Class9346.method34640(class51.method327("Owner")));
        }
    }
    
    @Override
    public void method2229() {
        final Block method21696 = this.method2194().getBlock();
        if (method21696 == Class7521.field29463 || method21696 == Class7521.field29464) {
            if (!this.field2656.method6749(this.field2657)) {
                this.field2837 = false;
            }
            else {
                this.field2837 = true;
                ++this.field2836;
            }
        }
    }
    
    public float method2504(final float n) {
        return this.field2837 ? (this.field2836 + n) : ((float)this.field2836);
    }
    
    @Nullable
    public GameProfile method2505() {
        return this.field2835;
    }
    
    @Nullable
    @Override
    public Class4357 method2195() {
        return new Class4357(this.field2657, 4, this.method2196());
    }
    
    @Override
    public Class51 method2196() {
        return this.method2180(new Class51());
    }
    
    public void method2506(final GameProfile field2835) {
        this.field2835 = field2835;
        this.method2507();
    }
    
    private void method2507() {
        this.field2835 = method2508(this.field2835);
        this.method2161();
    }
    
    public static GameProfile method2508(final GameProfile gameProfile) {
        if (gameProfile == null || Class8272.method27500(gameProfile.getName())) {
            return gameProfile;
        }
        if (gameProfile.isComplete() && gameProfile.getProperties().containsKey((Object)"textures")) {
            return gameProfile;
        }
        if (Class493.field2838 == null || Class493.field2839 == null) {
            return gameProfile;
        }
        GameProfile gameProfile2 = Class493.field2838.method29195(gameProfile.getName());
        if (gameProfile2 != null) {
            if (Iterables.getFirst((Iterable)gameProfile2.getProperties().get((Object)"textures"), (Object)null) == null) {
                gameProfile2 = Class493.field2839.fillProfileProperties(gameProfile2, true);
            }
            return gameProfile2;
        }
        return gameProfile;
    }
}
