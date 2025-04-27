// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.BoolArgumentType;
import java.util.function.BiConsumer;

public class Class8119 extends Class8117<Class8119>
{
    private static String[] field33455;
    private boolean field33456;
    
    private static Class8455<Class8119> method26721(final boolean b, final BiConsumer<MinecraftServer, Class8119> biConsumer) {
        return new Class8455<Class8119>(BoolArgumentType::bool, class8455 -> new Class8119(class8455, b2), biConsumer, null);
    }
    
    private static Class8455<Class8119> method26722(final boolean b) {
        return method26721(b, (p0, p1) -> {});
    }
    
    public Class8119(final Class8455<Class8119> class8455, final boolean field33456) {
        super(class8455);
        this.field33456 = field33456;
    }
    
    @Override
    public void method26706(final CommandContext<Class7492> commandContext, final String s) {
        this.field33456 = BoolArgumentType.getBool(commandContext, s);
    }
    
    public boolean method26723() {
        return this.field33456;
    }
    
    public void method26724(final boolean field33456, final MinecraftServer class394) {
        this.field33456 = field33456;
        this.method26708(class394);
    }
    
    @Override
    public String method26710() {
        return Boolean.toString(this.field33456);
    }
    
    @Override
    public void method26709(final String s) {
        this.field33456 = Boolean.parseBoolean(s);
    }
    
    @Override
    public int method26711() {
        return this.field33456 ? 1 : 0;
    }
    
    public Class8119 method26725() {
        return this;
    }
}
