// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import java.util.List;

public class Class9128
{
    private static String[] field38684;
    private List<Class9469> field38685;
    private Class2067 field38686;
    private boolean field38687;
    private boolean field38688;
    private boolean field38689;
    
    public Class9128(final Class9469 class9469) {
        this.field38685 = new ArrayList<Class9469>();
        this.field38686 = Class2067.field11835;
        this.field38687 = false;
        this.field38688 = false;
        this.field38689 = false;
        this.field38685.add(class9469.method35235(this.method33118().method35235(this.method33118())));
        this.field38685.add(class9469.method35235(this.method33118()));
        this.field38685.add(class9469);
    }
    
    private Class9469 method33118() {
        return Class9394.method34925(this.field38686);
    }
    
    public void method33119() {
        final Class9469 method35235 = this.field38685.get(0).method35235(this.method33118());
        this.field38689 = this.field38685.contains(method35235);
        this.field38685.add(0, method35235);
        if (!this.field38688) {
            this.field38685.remove(this.field38685.size() - 1);
        }
        this.field38687 = false;
        this.field38688 = false;
    }
    
    public void method33120() {
        this.field38688 = true;
    }
    
    public void method33121(final Class2067 field38686) {
        final Class9469 method35235 = Class9394.method34925(field38686).method35235(Class9394.method34925(this.field38686));
        if (method35235.field40723 != 0 || method35235.field40724 != 0) {
            if (field38686 != this.field38686) {
                if (!this.field38687) {
                    this.field38686 = field38686;
                    this.field38687 = true;
                }
            }
        }
    }
    
    public boolean method33122() {
        return this.field38689;
    }
    
    public List<Class9469> method33123() {
        return this.field38685;
    }
    
    public boolean method33124(final Class9469 class9469) {
        return class9469 == null || this.field38685.contains(class9469);
    }
}
