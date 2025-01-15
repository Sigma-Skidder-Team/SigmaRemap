// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;
import java.lang.reflect.Type;
import java.lang.reflect.ParameterizedType;

public final class Class8361 implements ParameterizedType
{
    private static String[] field34294;
    
    @Override
    public Type[] getActualTypeArguments() {
        return new Type[] { String.class };
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
