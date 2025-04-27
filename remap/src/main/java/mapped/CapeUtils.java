// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.regex.Pattern;

public class CapeUtils
{
    private static final Pattern field23376;
    
    public static void method17110(final AbstractClientPlayerEntity abstractClientPlayerEntity) {
        final String method4105 = abstractClientPlayerEntity.method4105();
        if (method4105 != null) {
            if (!method4105.isEmpty()) {
                if (!method4105.contains("\u0000")) {
                    if (CapeUtils.field23376.matcher(method4105).matches()) {
                        final String string = "http://s.optifine.net/capes/" + method4105 + ".png";
                        final ResourceLocation class755 = new ResourceLocation("capeof/" + method4105);
                        final Class1663 method4106 = Minecraft.getInstance().method5290();
                        final Class1666 method4107 = method4106.method5853(class755);
                        if (method4107 != null) {
                            if (method4107 instanceof Class1768) {
                                final Class1768 class756 = (Class1768)method4107;
                                if (class756.field9841 != null) {
                                    if (class756.field9841) {
                                        abstractClientPlayerEntity.method4107(class755);
                                        if (class756.method6307() instanceof Class1112) {
                                            abstractClientPlayerEntity.method4109(((Class1112)class756.method6307()).method5613());
                                        }
                                    }
                                    return;
                                }
                            }
                        }
                        final Class1768 class757 = new Class1768(null, string, new ResourceLocation("optifine/ctm/default/empty.png"), false, new Class1112(abstractClientPlayerEntity, class755));
                        class757.field9842 = true;
                        method4106.method5851(class755, class757);
                    }
                }
            }
        }
    }
    
    public static Class1846 method17111(final Class1846 class1846) {
        int n = 64;
        int n2 = 32;
        for (int method6644 = class1846.method6644(), method6645 = class1846.method6645(); n < method6644 || n2 < method6645; n *= 2, n2 *= 2) {}
        final Class1846 class1847 = new Class1846(n, n2, true);
        class1847.method6662(class1846);
        class1846.close();
        return class1847;
    }
    
    public static boolean method17112(final Class1846 class1846, final Class1846 class1847) {
        return class1846.method6644() > class1847.method6645();
    }
    
    public static void method17113(final AbstractClientPlayerEntity abstractClientPlayerEntity) {
        final ResourceLocation class755 = new ResourceLocation("capeof/" + abstractClientPlayerEntity.method4105());
        final Class1663 method28895 = Config.method28895();
        final Class1666 method28896 = method28895.method5853(class755);
        if (method28896 instanceof Class1767) {
            method28896.method5870();
            method28895.method5858(class755);
        }
        abstractClientPlayerEntity.method4107(null);
        abstractClientPlayerEntity.method4109(false);
        method17110(abstractClientPlayerEntity);
    }
    
    static {
        field23376 = Pattern.compile("[a-zA-Z0-9_]+");
    }
}
