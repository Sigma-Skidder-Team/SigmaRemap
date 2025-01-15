// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList;

public final class Class6304
{
    private static String[] field25200;
    private final Class6340 field25201;
    private final Class6331 field25202;
    private final Class6335 field25203;
    private final Class6339 field25204;
    private final Class6321 field25205;
    private final Class6328 field25206;
    private final Class6338 field25207;
    private final Class6337 field25208;
    private final Class6336 field25209;
    private final Class6329 field25210;
    private final Class6330 field25211;
    private final Class6341 field25212;
    private final Class6323 field25213;
    private final Class6326 field25214;
    private final Class6327 field25215;
    private final Class2017 field25216;
    private final ImmutableList<Class6322> field25217;
    
    private Class6304(final Class6340 field25201, final Class6331 field25202, final Class6335 field25203, final Class6339 field25204, final Class6321 field25205, final Class6328 field25206, final Class6338 field25207, final Class6337 field25208, final Class6336 field25209, final Class6329 field25210, final Class6330 field25211, final Class6341 field25212, final Class6323 field25213, final Class6326 field25214, final Class6327 field25215, final Class2017 field25216) {
        this.field25201 = field25201;
        this.field25202 = field25202;
        this.field25203 = field25203;
        this.field25204 = field25204;
        this.field25205 = field25205;
        this.field25206 = field25206;
        this.field25207 = field25207;
        this.field25208 = field25208;
        this.field25209 = field25209;
        this.field25210 = field25210;
        this.field25211 = field25211;
        this.field25212 = field25212;
        this.field25213 = field25213;
        this.field25214 = field25214;
        this.field25215 = field25215;
        this.field25216 = field25216;
        this.field25217 = (ImmutableList<Class6322>)ImmutableList.of((Object)this.field25201, (Object)this.field25202, (Object)this.field25203, (Object)this.field25204, (Object)this.field25205, (Object)this.field25206, (Object)this.field25207, (Object)this.field25208, (Object)this.field25209, (Object)this.field25210, (Object)this.field25211, (Object)this.field25212, (Object[])new Class6322[] { this.field25213, this.field25214, this.field25215 });
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final Class6304 class6304 = (Class6304)o;
            return this.field25216 == class6304.field25216 && this.field25217.equals((Object)class6304.field25217);
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return Class7827.method25285(this.field25217, this.field25216);
    }
    
    public static Class8484 method18666() {
        return new Class8484(null);
    }
}
