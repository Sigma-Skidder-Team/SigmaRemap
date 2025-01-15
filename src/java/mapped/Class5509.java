// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;

public abstract class Class5509
{
    private Class8651<Class7499, Class5412> field22809;
    private String field22810;
    private float field22811;
    private String[] field22812;
    
    public Class5509(final Class7499 class7499, final String s, final float n) {
        this((Class8651<Class7499, Class5412>)Class8651.method29438(class7499), s, n, null);
    }
    
    public Class5509(final Class7499 class7499, final String s, final float n, final String[] array) {
        this((Class8651<Class7499, Class5412>)Class8651.method29438(class7499), s, n, array);
    }
    
    public Class5509(final Class5412 class5412, final String s, final float n) {
        this((Class8651<Class7499, Class5412>)Class8651.method29439(class5412), s, n, null);
    }
    
    public Class5509(final Class8651<Class7499, Class5412> field22809, final String field22810, final float field22811, final String[] field22812) {
        this.field22809 = field22809;
        this.field22810 = field22810;
        this.field22811 = field22811;
        this.field22812 = field22812;
    }
    
    public Class8651<Class7499, Class5412> method16815() {
        return this.field22809;
    }
    
    public String method16816() {
        return this.field22810;
    }
    
    public String[] method16817() {
        return this.field22812;
    }
    
    public float method16818() {
        return this.field22811;
    }
    
    public abstract Class5901 method16811();
    
    public abstract Class6300 method16812(final Class5901 p0, final String p1);
    
    public abstract String[] method16813();
    
    public abstract Class9559 method16814(final Class5901 p0, final float p1);
    
    public Class6300[] method16819(final Class5901 class5901) {
        final String[] method16813 = this.method16813();
        final ArrayList list = new ArrayList();
        for (int i = 0; i < method16813.length; ++i) {
            final Class6300 method16814 = this.method16812(class5901, method16813[i]);
            if (method16814 != null) {
                list.add(method16814);
            }
        }
        return (Class6300[])list.toArray(new Class6300[list.size()]);
    }
}
