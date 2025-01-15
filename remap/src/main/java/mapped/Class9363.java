// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import java.util.List;

public class Class9363
{
    private List<Class9023> field40157;
    private Class9023 field40158;
    
    public Class9363() {
        this.field40157 = new ArrayList<Class9023>();
        this.field40158 = this.method34727("", Class2219.field13625, true);
    }
    
    public Class9023 method34726(final String s, final Class2219 class2219, final Class9023 class2220) {
        final Class9023 class2221 = new Class9023(this.field40157.size(), s, class2219, class2220);
        this.field40157.add(class2221);
        return class2221;
    }
    
    private Class9023 method34727(final String s, final Class2219 class2219, final boolean b) {
        final Class9023 class2220 = new Class9023(this.field40157.size(), s, class2219, b);
        this.field40157.add(class2220);
        return class2220;
    }
    
    public Class9023 method34728(final String s, final Class9023 class9023) {
        return this.method34726(s, Class2219.field13627, class9023);
    }
    
    public Class9023 method34729(final String s) {
        return this.method34726(s, Class2219.field13629, this.field40158);
    }
    
    public Class9023 method34730(final String s) {
        return this.method34726(s, Class2219.field13628, this.field40158);
    }
    
    public Class9023 method34731(final String s, final Class9023 class9023) {
        return this.method34726(s, Class2219.field13626, class9023);
    }
    
    public Class9023 method34732(final String s) {
        return this.method34727(s, Class2219.field13625, true);
    }
    
    public Class9023[] method34733(final String str, final int n) {
        final Class9023[] array = new Class9023[n];
        for (int i = 0; i < n; ++i) {
            array[i] = this.method34729((i != 0) ? (str + i) : str);
        }
        return array;
    }
    
    public Class9023[] method34734(final String str, final int n) {
        final Class9023[] array = new Class9023[n];
        for (int i = 0; i < n; ++i) {
            array[i] = this.method34730((i != 0) ? (str + i) : str);
        }
        return array;
    }
    
    public Class9023 method34735() {
        return this.field40158;
    }
    
    public int method34736() {
        return this.field40157.size();
    }
    
    public Class9023 method34737(final String anObject) {
        if (anObject != null) {
            for (int i = 0; i < this.field40157.size(); ++i) {
                final Class9023 class9023 = this.field40157.get(i);
                if (class9023.method32326().equals(anObject)) {
                    return class9023;
                }
            }
            return null;
        }
        return null;
    }
    
    public String[] method34738() {
        final String[] array = new String[this.field40157.size()];
        for (int i = 0; i < array.length; ++i) {
            array[i] = this.field40157.get(i).method32326();
        }
        return array;
    }
    
    public Class9023[] method34739() {
        return this.field40157.toArray(new Class9023[this.field40157.size()]);
    }
    
    public Class9023[] method34740(final Class9023 class9023, final Class9023 class9024) {
        int method32325 = class9023.method32325();
        int method32326 = class9024.method32325();
        if (method32325 > method32326) {
            final int n = method32325;
            method32325 = method32326;
            method32326 = n;
        }
        final Class9023[] array = new Class9023[method32326 - method32325 + 1];
        for (int i = 0; i < array.length; ++i) {
            array[i] = this.field40157.get(method32325 + i);
        }
        return array;
    }
    
    @Override
    public String toString() {
        return this.field40157.toString();
    }
}
