// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.opengl.ARBShaderObjects;
import java.util.function.BiConsumer;

public class Class8472<T>
{
    private static String[] field34779;
    public T field34780;
    public boolean field34781;
    public final BiConsumer<Integer, T> field34782;
    public int field34783;
    
    public Class8472(final Class9034 class9034, final T field34780, final String s, final BiConsumer<Integer, T> field34781) {
        this.field34782 = field34781;
        this.field34780 = field34780;
        this.field34781 = true;
        this.field34783 = ARBShaderObjects.glGetUniformLocationARB(class9034.field38208, (CharSequence)s);
    }
}
