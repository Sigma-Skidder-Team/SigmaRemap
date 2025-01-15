// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import java.lang.reflect.Type;
import java.lang.reflect.ParameterizedType;

public final class Class8359 implements ParameterizedType
{
    private static String[] field34292;
    
    @Override
    public Type[] getActualTypeArguments() {
        return new Type[] { String.class, Class8722.class };
    }
    
    @Override
    public Type getRawType() {
        return Map.class;
    }
    
    @Override
    public Type getOwnerType() {
        return null;
    }
}
