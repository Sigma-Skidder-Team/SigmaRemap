// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

import java.lang.reflect.InvocationTargetException;

public class Class8004
{
    private static String[] field32965;
    private static final Class869 field32966;
    
    public static void method26199(final int n) {
        if (Class9463.method35173().method35209() == Class2209.field13466) {
            return;
        }
        if (n == -1) {
            return;
        }
        for (final Class8879 class8879 : Class9463.method35173().method35189().method21557().method21964(n)) {
            if (class8879 != null && class8879.method31228()) {
                switch (Class9204.field38998[class8879.method31231().ordinal()]) {
                    case 1: {
                        class8879.method31234().method9910();
                        continue;
                    }
                    case 2: {
                        try {
                            final Class527 class8880 = (Class527)class8879.method31233().getDeclaredConstructor(ITextComponent.class).newInstance(new Class2260(Class9000.field37983.get(class8879.method31233())));
                            if (!Class9463.method35173().method35193().method32158(class8880)) {
                                continue;
                            }
                            Class8004.field32966.method5244(class8880);
                        }
                        catch (final InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException ex) {
                            ((Throwable)ex).printStackTrace();
                        }
                        continue;
                    }
                }
            }
        }
    }
    
    public static void method26200(final int n) {
        Class9463.method35173().method35188().method21097(new Class5715(n));
    }
    
    static {
        field32966 = Class869.method5277();
    }
}
