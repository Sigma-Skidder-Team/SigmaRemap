// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

public class Class6865 implements Class6866
{
    private static String[] field26895;
    private final Class2174 field26896;
    private String field26897;
    private String field26898;
    private long field26899;
    private boolean field26900;
    
    public Class6865(final Class2174 field26896, final ITextComponent class2250, final ITextComponent class2251) {
        this.field26896 = field26896;
        this.field26897 = class2250.getString();
        this.field26898 = ((class2251 != null) ? class2251.getString() : null);
    }
    
    @Override
    public Class2204 method20978(final Class690 class690, final long field26899) {
        if (this.field26900) {
            this.field26899 = field26899;
            this.field26900 = false;
        }
        class690.method3853().method5290().method5849(Class6865.field26901);
        RenderSystem.method30069(1.0f, 1.0f, 1.0f);
        class690.blit(0, 0, 0, 64, 160, 32);
        if (this.field26898 != null) {
            class690.method3853().fontRenderer.method6610(this.field26897, 18.0f, 7.0f, -256);
            class690.method3853().fontRenderer.method6610(this.field26898, 18.0f, 18.0f, -1);
        }
        else {
            class690.method3853().fontRenderer.method6610(this.field26897, 18.0f, 12.0f, -256);
        }
        return (field26899 - this.field26899 >= 5000L) ? Class2204.field13418 : Class2204.field13417;
    }
    
    public void method20979(final ITextComponent class2250, final ITextComponent class2251) {
        this.field26897 = class2250.getString();
        this.field26898 = ((class2251 != null) ? class2251.getString() : null);
        this.field26900 = true;
    }
    
    public Class2174 method20980() {
        return this.field26896;
    }
    
    public static void method20981(final Class690 class690, final Class2174 class691, final ITextComponent class692, final ITextComponent class693) {
        final Class6865 class694 = class690.method3850((Class<? extends Class6865>)Class6865.class, (Object)class691);
        if (class694 != null) {
            class694.method20979(class692, class693);
        }
        else {
            class690.method3852(new Class6865(class691, class692, class693));
        }
    }
}
