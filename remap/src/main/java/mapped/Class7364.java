// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.lang.reflect.Field;

public class Class7364 implements Class7359
{
    private static String[] field28406;
    private Class6943 field28407;
    private boolean field28408;
    private Field field28409;
    
    public Class7364(final Class7363 class7363, final String s) {
        this(new Class6947(class7363, s));
    }
    
    public Class7364(final Class7363 class7363, final Class clazz) {
        this(class7363, clazz, 0);
    }
    
    public Class7364(final Class7363 class7363, final Class clazz, final int n) {
        this(new Class6945(class7363, clazz, n));
    }
    
    public Class7364(final Field field) {
        this(new Class6944(field));
    }
    
    public Class7364(final Class6943 field28407) {
        this.field28407 = null;
        this.field28408 = false;
        this.field28409 = null;
        this.field28407 = field28407;
        Class7462.method22986(this);
    }
    
    public Field method22629() {
        if (!this.field28408) {
            this.field28408 = true;
            this.field28409 = this.field28407.method21325();
            if (this.field28409 != null) {
                this.field28409.setAccessible(true);
            }
            return this.field28409;
        }
        return this.field28409;
    }
    
    public Object method22630() {
        return Class9570.method35828(null, this);
    }
    
    public Object method22631(final Object o) {
        return Class9570.method35828(o, this);
    }
    
    public void method22632(final Object o) {
        Class9570.method35837(null, this, o);
    }
    
    public void method22633(final Object o, final Object o2) {
        Class9570.method35837(o, this, o2);
    }
    
    public boolean method22634() {
        return this.method22629() != null;
    }
    
    @Override
    public void method22603() {
        this.method22629();
    }
}
