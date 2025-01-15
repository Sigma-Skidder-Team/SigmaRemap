// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.lang.annotation.Annotation;
import java.util.List;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.beans.PropertyDescriptor;

public class Class1938 extends Class1937
{
    private final PropertyDescriptor field10572;
    private final boolean field10573;
    private final boolean field10574;
    
    private static Type method7834(final PropertyDescriptor propertyDescriptor) {
        final Method readMethod = propertyDescriptor.getReadMethod();
        if (readMethod == null) {
            final Method writeMethod = propertyDescriptor.getWriteMethod();
            if (writeMethod != null) {
                final Type[] genericParameterTypes = writeMethod.getGenericParameterTypes();
                if (genericParameterTypes.length > 0) {
                    return genericParameterTypes[0];
                }
            }
            return null;
        }
        return readMethod.getGenericReturnType();
    }
    
    public Class1938(final PropertyDescriptor field10572) {
        super(field10572.getName(), field10572.getPropertyType(), method7834(field10572));
        this.field10572 = field10572;
        this.field10573 = (field10572.getReadMethod() != null);
        this.field10574 = (field10572.getWriteMethod() != null);
    }
    
    @Override
    public void method7826(final Object obj, final Object o) throws Exception {
        if (this.field10574) {
            this.field10572.getWriteMethod().invoke(obj, o);
            return;
        }
        throw new Class2386("No writable property '" + this.method7823() + "' on class: " + obj.getClass().getName());
    }
    
    @Override
    public Object method7827(final Object o) {
        try {
            this.field10572.getReadMethod().setAccessible(true);
            return this.field10572.getReadMethod().invoke(o, new Object[0]);
        }
        catch (final Exception obj) {
            throw new Class2386("Unable to find getter for property '" + this.field10572.getName() + "' on object " + o + ":" + obj);
        }
    }
    
    @Override
    public List<Annotation> method7828() {
        List<Annotation> list;
        if (this.method7825() && this.method7824()) {
            list = Class9150.method33411(this.field10572.getReadMethod().getAnnotations(), this.field10572.getWriteMethod().getAnnotations());
        }
        else if (!this.method7825()) {
            list = Class9150.method33410(this.field10572.getWriteMethod().getAnnotations());
        }
        else {
            list = Class9150.method33410(this.field10572.getReadMethod().getAnnotations());
        }
        return list;
    }
    
    @Override
    public <A extends Annotation> A method7829(final Class<A> clazz) {
        Annotation annotation = null;
        if (this.method7825()) {
            annotation = this.field10572.getReadMethod().getAnnotation(clazz);
        }
        if (annotation == null) {
            if (this.method7824()) {
                annotation = this.field10572.getWriteMethod().getAnnotation(clazz);
            }
        }
        return (A)annotation;
    }
    
    @Override
    public boolean method7824() {
        return this.field10574;
    }
    
    @Override
    public boolean method7825() {
        return this.field10573;
    }
}
