// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;

public class Class8081<T>
{
    private Class5835<T> field33274;
    private Class5835<T> field33275;
    private int field33276;
    
    public void method26503(final Class5835<T> field33275) {
        this.method26510(field33275);
        if (!this.method26516()) {
            final Class5835<T> field33276 = this.field33274;
            Class5835.method17543((Class5835<Object>)field33275, (Class5835<Object>)field33276);
            Class5835.method17544((Class5835<Object>)field33276, (Class5835<Object>)field33275);
            this.field33274 = field33275;
        }
        else {
            this.field33274 = field33275;
            this.field33275 = field33275;
        }
        Class5835.method17545((Class5835<Object>)field33275, this);
        ++this.field33276;
    }
    
    public void method26504(final Class5835<T> field33275) {
        this.method26510(field33275);
        if (!this.method26516()) {
            final Class5835<T> field33276 = this.field33275;
            Class5835.method17544((Class5835<Object>)field33275, (Class5835<Object>)field33276);
            Class5835.method17543((Class5835<Object>)field33276, (Class5835<Object>)field33275);
            this.field33275 = field33275;
        }
        else {
            this.field33274 = field33275;
            this.field33275 = field33275;
        }
        Class5835.method17545((Class5835<Object>)field33275, this);
        ++this.field33276;
    }
    
    public void method26505(final Class5835<T> class5835, final Class5835<T> class5836) {
        if (class5835 == null) {
            this.method26503(class5836);
            return;
        }
        if (class5835 != this.field33275) {
            this.method26509(class5835);
            this.method26510(class5836);
            final Class5835<Object> method17539 = class5835.method17539();
            Class5835.method17543((Class5835<Object>)class5835, (Class5835<Object>)class5836);
            Class5835.method17544((Class5835<Object>)class5836, (Class5835<Object>)class5835);
            Class5835.method17544(method17539, (Class5835<Object>)class5836);
            Class5835.method17543((Class5835<Object>)class5836, method17539);
            Class5835.method17545((Class5835<Object>)class5836, this);
            ++this.field33276;
            return;
        }
        this.method26504(class5836);
    }
    
    public Class5835<T> method26506(final Class5835<T> class5835) {
        this.method26509(class5835);
        final Class5835<Object> method17538 = (Class5835<Object>)class5835.method17538();
        final Class5835<Object> method17539 = (Class5835<Object>)class5835.method17539();
        if (method17538 == null) {
            this.field33274 = (Class5835<T>)method17539;
        }
        else {
            Class5835.method17543(method17538, method17539);
        }
        if (method17539 == null) {
            this.field33275 = (Class5835<T>)method17538;
        }
        else {
            Class5835.method17544(method17539, method17538);
        }
        Class5835.method17544((Class5835<Object>)class5835, null);
        Class5835.method17543((Class5835<Object>)class5835, null);
        Class5835.method17545((Class5835<Object>)class5835, null);
        --this.field33276;
        return class5835;
    }
    
    public void method26507(final Class5835<T> class5835, final Class5835<T> class5836) {
        this.method26506(class5836);
        this.method26505(class5835, class5836);
    }
    
    public boolean method26508(final Class5835<T> class5835, final Class5835<T> obj, final Class5835<T> obj2) {
        this.method26509(obj);
        if (obj2 != null) {
            this.method26509(obj2);
        }
        Class5835<T> method17539;
        for (method17539 = obj; method17539 != null && method17539 != obj2; method17539 = method17539.method17539()) {
            if (method17539 == class5835) {
                return true;
            }
        }
        if (method17539 == obj2) {
            return false;
        }
        throw new IllegalArgumentException("Sublist is not linked, from: " + obj + ", to: " + obj2);
    }
    
    private void method26509(final Class5835<T> obj) {
        if (Class5835.method17546((Class5835<Object>)obj) == this) {
            return;
        }
        throw new IllegalArgumentException("Node has different parent, node: " + obj + ", parent: " + Class5835.method17546((Class5835<Object>)obj) + ", this: " + this);
    }
    
    private void method26510(final Class5835<T> obj) {
        if (Class5835.method17546((Class5835<Object>)obj) == null) {
            return;
        }
        throw new IllegalArgumentException("Node has different parent, node: " + obj + ", parent: " + Class5835.method17546((Class5835<Object>)obj) + ", this: " + this);
    }
    
    public boolean method26511(final Class5835<T> class5835) {
        return Class5835.method17546((Class5835<Object>)class5835) == this;
    }
    
    public Iterator<Class5835<T>> method26512() {
        return (Iterator<Class5835<T>>)new Class7236(this);
    }
    
    public Class5835<T> method26513() {
        return this.field33274;
    }
    
    public Class5835<T> method26514() {
        return this.field33275;
    }
    
    public int method26515() {
        return this.field33276;
    }
    
    public boolean method26516() {
        return this.field33276 <= 0;
    }
    
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        final Iterator<Class5835<T>> method26512 = this.method26512();
        while (method26512.hasNext()) {
            final Class5835 class5835 = method26512.next();
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(class5835.method17537());
        }
        return "" + this.field33276 + " [" + sb.toString() + "]";
    }
}
