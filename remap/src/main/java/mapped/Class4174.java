// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftProfileTexture$Type;
import com.mojang.authlib.GameProfile;
import net.minecraft.util.Direction;

import java.util.Map;

public class Class4174 extends Class4158<Class493>
{
    private static final Map<Class299, Class5918> field18591;
    private static final Map<Class299, ResourceLocation> field18592;
    
    public Class4174(final Class9550 class9550) {
        super(class9550);
    }
    
    public void method12497(final Class493 class493, final float n, final MatrixStack class494, final IRenderTypeBuffer class495, final int n2, final int n3) {
        final float method2504 = class493.method2504(n);
        final BlockState method2505 = class493.method2194();
        final boolean b = method2505.getBlock() instanceof Class3933;
        final Direction class496 = b ? method2505.get(Class3933.field17814) : null;
        method12498(class496, 22.5f * (b ? ((2 + class496.getHorizontalIndex()) * 4) : method2505.get(Class3936.field17819)), ((Class3932)method2505.getBlock()).method12050(), class493.method2505(), method2504, class494, class495, n2);
    }
    
    public static void method12498(final Direction class179, final float n, final Class299 class180, final GameProfile gameProfile, final float n2, final MatrixStack class181, final IRenderTypeBuffer class182, final int n3) {
        final Class5918 class183 = Class4174.field18591.get(class180);
        class181.method22567();
        if (class179 == null) {
            class181.method22564(0.5, 0.0, 0.5);
        }
        else {
            switch (Class9443.field40513[class179.ordinal()]) {
                case 1: {
                    class181.method22564(0.5, 0.25, 0.7400000095367432);
                    break;
                }
                case 2: {
                    class181.method22564(0.5, 0.25, 0.25999999046325684);
                    break;
                }
                case 3: {
                    class181.method22564(0.7400000095367432, 0.25, 0.5);
                    break;
                }
                default: {
                    class181.method22564(0.25999999046325684, 0.25, 0.5);
                    break;
                }
            }
        }
        class181.method22565(-1.0f, -1.0f, 1.0f);
        final Class4150 method25214 = class182.method25214(method12499(class180, gameProfile));
        class183.method17790(n2, n, 0.0f);
        class183.method17564(class181, method25214, n3, Class1904.field10335, 1.0f, 1.0f, 1.0f, 1.0f);
        class181.method22568();
    }
    
    private static Class6332 method12499(final Class299 class299, final GameProfile gameProfile) {
        final ResourceLocation class300 = Class4174.field18592.get(class299);
        if (class299 == Class298.field1713 && gameProfile != null) {
            final Minecraft method5277 = Minecraft.getInstance();
            final Map<MinecraftProfileTexture$Type, MinecraftProfileTexture> method5278 = method5277.method5302().method24295(gameProfile);
            return method5278.containsKey(MinecraftProfileTexture$Type.SKIN) ? Class6332.method18773(method5277.method5302().method24292((MinecraftProfileTexture)method5278.get(MinecraftProfileTexture$Type.SKIN), MinecraftProfileTexture$Type.SKIN)) : Class6332.method18770(Class7634.method24004(PlayerEntity.method2893(gameProfile)));
        }
        return Class6332.method18770(class300);
    }
    
    static {
        field18591 = Util.method27851(Maps.newHashMap(), hashMap -> {
            final Class5918 value = new Class5918(0, 0, 64, 32);
            final Class5920 class5920 = new Class5920();
            final Class5919 value2 = new Class5919(0.0f);
            hashMap.put(Class298.field1711, value);
            hashMap.put(Class298.field1712, value);
            hashMap.put(Class298.field1713, class5920);
            hashMap.put(Class298.field1714, class5920);
            hashMap.put(Class298.field1715, value);
            hashMap.put(Class298.field1716, value2);
        });
        field18592 = Util.method27851(Maps.newHashMap(), hashMap2 -> {
            hashMap2.put(Class298.field1711, new ResourceLocation("textures/entity/skeleton/skeleton.png"));
            hashMap2.put(Class298.field1712, new ResourceLocation("textures/entity/skeleton/wither_skeleton.png"));
            hashMap2.put(Class298.field1714, new ResourceLocation("textures/entity/zombie/zombie.png"));
            hashMap2.put(Class298.field1715, new ResourceLocation("textures/entity/creeper/creeper.png"));
            hashMap2.put(Class298.field1716, new ResourceLocation("textures/entity/enderdragon/dragon.png"));
            hashMap2.put(Class298.field1713, Class7634.method24003());
        });
    }
}
