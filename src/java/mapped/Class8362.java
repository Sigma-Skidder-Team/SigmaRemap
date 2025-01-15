// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;
import java.lang.reflect.Type;
import java.lang.reflect.ParameterizedType;

public final class Class8362 implements ParameterizedType
{
    private static String[] field34295;
    
    @Override
    public Type[] getActualTypeArguments() {
        return new Type[] { Class6022.class };
    }
    
    @Override
    public Type getRawType() {
        return List.class;
    }
    
    @Override
    public Type getOwnerType() {
        return null;
    }
}
