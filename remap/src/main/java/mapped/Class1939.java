// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.lang.annotation.Annotation;
import java.util.List;
import java.lang.reflect.Field;

public class Class1939 extends Class1937
{
    private final Field field10575;
    
    public Class1939(final Field field10575) {
        super(field10575.getName(), field10575.getType(), field10575.getGenericType());
        (this.field10575 = field10575).setAccessible(true);
    }
    
    @Override
    public void method7826(final Object obj, final Object value) throws Exception {
        this.field10575.set(obj, value);
    }
    
    @Override
    public Object method7827(final Object o) {
        try {
            return this.field10575.get(o);
        }
        catch (final Exception obj) {
            throw new Class2386("Unable to access field " + this.field10575.getName() + " on object " + o + " : " + obj);
        }
    }
    
    @Override
    public List<Annotation> method7828() {
        return Class9150.method33410(this.field10575.getAnnotations());
    }
    
    @Override
    public <A extends Annotation> A method7829(final Class<A> annotationClass) {
        return this.field10575.getAnnotation(annotationClass);
    }
}
