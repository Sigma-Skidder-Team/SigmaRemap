// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftProfileTexture$Type;
import com.mojang.authlib.GameProfile;
import net.minecraft.util.text.ITextComponent;

public class Class6993 implements Class6991
{
    private static String[] field27283;
    private final GameProfile field27284;
    private final Class1932 field27285;
    
    public Class6993(final GameProfile field27284) {
        this.field27284 = field27284;
        final Class869 method5277 = Class869.method5277();
        final Map<MinecraftProfileTexture$Type, MinecraftProfileTexture> method5278 = method5277.method5302().method24295(field27284);
        if (!method5278.containsKey(MinecraftProfileTexture$Type.SKIN)) {
            this.field27285 = Class7634.method24004(Class512.method2893(field27284));
        }
        else {
            this.field27285 = method5277.method5302().method24292((MinecraftProfileTexture)method5278.get(MinecraftProfileTexture$Type.SKIN), MinecraftProfileTexture$Type.SKIN);
        }
    }
    
    @Override
    public void method21402(final Class9039 class9039) {
        Class869.method5277().method5269().method17292(new Class4294(this.field27284.getId()));
    }
    
    @Override
    public ITextComponent method21403() {
        return new Class2260(this.field27284.getName());
    }
    
    @Override
    public void method21404(final float n, final int n2) {
        Class869.method5277().method5290().method5849(this.field27285);
        Class8726.method30068(1.0f, 1.0f, 1.0f, n2 / 255.0f);
        Class565.method3300(2, 2, 12, 12, 8.0f, 8.0f, 8, 8, 64, 64);
        Class565.method3300(2, 2, 12, 12, 40.0f, 8.0f, 8, 8, 64, 64);
    }
    
    @Override
    public boolean method21405() {
        return true;
    }
}
