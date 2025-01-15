// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public abstract class Class1937 extends Class1935
{
    private Type field10569;
    private boolean field10570;
    private Class<?>[] field10571;
    
    public Class1937(final String s, final Class<?> clazz, final Type field10569) {
        super(s, clazz);
        this.field10569 = field10569;
        this.field10570 = (field10569 == null);
    }
    
    @Override
    public Class<?>[] method7822() {
        if (!this.field10570) {
            if (!(this.field10569 instanceof ParameterizedType)) {
                if (!(this.field10569 instanceof GenericArrayType)) {
                    if (this.field10569 instanceof Class) {
                        if (((Class)this.field10569).isArray()) {
                            (this.field10571 = new Class[1])[0] = this.method7821().getComponentType();
                        }
                    }
                }
                else {
                    final Type genericComponentType = ((GenericArrayType)this.field10569).getGenericComponentType();
                    if (genericComponentType instanceof Class) {
                        this.field10571 = new Class[] { (Class)genericComponentType };
                    }
                }
            }
            else {
                final Type[] actualTypeArguments = ((ParameterizedType)this.field10569).getActualTypeArguments();
                if (actualTypeArguments.length > 0) {
                    this.field10571 = new Class[actualTypeArguments.length];
                    for (int i = 0; i < actualTypeArguments.length; ++i) {
                        if (!(actualTypeArguments[i] instanceof Class)) {
                            if (!(actualTypeArguments[i] instanceof ParameterizedType)) {
                                if (!(actualTypeArguments[i] instanceof GenericArrayType)) {
                                    this.field10571 = null;
                                    break;
                                }
                                final Type genericComponentType2 = ((GenericArrayType)actualTypeArguments[i]).getGenericComponentType();
                                if (!(genericComponentType2 instanceof Class)) {
                                    this.field10571 = null;
                                    break;
                                }
                                this.field10571[i] = Array.newInstance((Class<?>)genericComponentType2, 0).getClass();
                            }
                            else {
                                this.field10571[i] = (Class)((ParameterizedType)actualTypeArguments[i]).getRawType();
                            }
                        }
                        else {
                            this.field10571[i] = (Class)actualTypeArguments[i];
                        }
                    }
                }
            }
            this.field10570 = true;
        }
        return this.field10571;
    }
}
