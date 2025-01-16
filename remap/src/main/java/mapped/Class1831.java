// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.authlib.GameProfile;
import java.util.UUID;

import net.minecraft.client.renderer.Vector3f;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import org.apache.commons.lang3.StringUtils;

public class Class1831<T extends LivingEntity, M extends Class5845<T> & Class5855> extends Class1799<T, M>
{
    public Class1831(final Class4778<T, M> class4778) {
        super(class4778);
    }
    
    public void method6551(final Class7351 class7351, final Class7807 class7352, final int n, final T t, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        final ItemStack method2718 = t.method2718(Class2215.field13605);
        if (!method2718.method27620()) {
            final Item method2719 = method2718.getItem();
            class7351.method22567();
            final boolean b = t instanceof Class824 || t instanceof Class826;
            if (t.method2625()) {
                if (!(t instanceof Class824)) {
                    class7351.method22564(0.0, 0.03125, 0.0);
                    class7351.method22565(0.7f, 0.7f, 0.7f);
                    class7351.method22564(0.0, 1.0, 0.0);
                }
            }
            this.method6559().method17577().method18645(class7351);
            if (method2719 instanceof Class4036 && ((Class4036)method2719).method12240() instanceof Class3932) {
                class7351.method22565(1.1875f, -1.1875f, -1.1875f);
                if (b) {
                    class7351.method22564(0.0, 0.0625, 0.0);
                }
                GameProfile gameProfile = null;
                if (method2718.method27656()) {
                    final CompoundNBT method2720 = method2718.method27657();
                    if (!method2720.contains("SkullOwner", 10)) {
                        if (method2720.contains("SkullOwner", 8)) {
                            final String method2721 = method2720.getString("SkullOwner");
                            if (!StringUtils.isBlank((CharSequence)method2721)) {
                                gameProfile = Class493.method2508(new GameProfile((UUID)null, method2721));
                                method2720.put("SkullOwner", Class9346.method34641(new CompoundNBT(), gameProfile));
                            }
                        }
                    }
                    else {
                        gameProfile = Class9346.method34640(method2720.getCompound("SkullOwner"));
                    }
                }
                class7351.method22564(-0.5, 0.0, -0.5);
                Class4174.method12498(null, 180.0f, ((Class3932)((Class4036)method2719).method12240()).method12050(), gameProfile, n2, class7351, class7352, n);
            }
            else if (!(method2719 instanceof Class4055) || ((Class4055)method2719).method12257() != Class2215.field13605) {
                class7351.method22564(0.0, -0.25, 0.0);
                class7351.method22566(Vector3f.YP.rotationDegrees(180.0f));
                class7351.method22565(0.625f, -0.625f, -0.625f);
                if (b) {
                    class7351.method22564(0.0, 0.1875, 0.0);
                }
                Minecraft.method5277().method5308().method35143(t, method2718, Class2016.field11491, false, class7351, class7352, n);
            }
            class7351.method22568();
        }
    }
}
