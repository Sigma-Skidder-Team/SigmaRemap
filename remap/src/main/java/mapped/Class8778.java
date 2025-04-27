// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public final class Class8778
{
    private Class7266 field36912;
    private final List<Class7266> field36913;
    
    public Class8778(final Class8778 class8778) {
        this.field36913 = new ArrayList<Class7266>();
        this.field36912 = class8778.field36912.method22212();
        final Iterator<Class7266> iterator = class8778.field36913.iterator();
        while (iterator.hasNext()) {
            this.field36913.add(iterator.next().method22212());
        }
    }
    
    public Class8778(final String s) {
        this.field36913 = new ArrayList<Class7266>();
        this.field36912 = new Class7270(s);
    }
    
    public Class8778(final Class7266 class7266) {
        this.field36913 = new ArrayList<Class7266>();
        this.field36912 = class7266.method22212();
    }
    
    public Class8778 method30516(final Class7266 class7266) {
        return this.method30517(class7266, Class1975.field10946);
    }
    
    public Class8778 method30517(final Class7266 class7266, final Class1975 class7267) {
        this.field36913.add(this.field36912);
        (this.field36912 = class7266.method22212()).method22225(this.field36912, class7267, false);
        return this;
    }
    
    public Class8778 method30518(final Class7266[] array) {
        return this.method30519(array, Class1975.field10946);
    }
    
    public Class8778 method30519(final Class7266[] array, final Class1975 class1975) {
        Preconditions.checkArgument(array.length != 0, "No components to append");
        final Class7266 field36912 = this.field36912;
        for (final Class7266 class1976 : array) {
            this.field36913.add(this.field36912);
            (this.field36912 = class1976.method22212()).method22225(field36912, class1975, false);
        }
        return this;
    }
    
    public Class8778 method30520(final String s) {
        return this.method30522(s, Class1975.field10946);
    }
    
    public Class8778 method30521(final String s) {
        return this.method30518(Class7270.method22273(s));
    }
    
    public Class8778 method30522(final String s, final Class1975 class1975) {
        this.field36913.add(this.field36912);
        (this.field36912 = new Class7270(s)).method22225(this.field36912, class1975, false);
        return this;
    }
    
    public Class8778 method30523(final Class9556 class9556) {
        return class9556.method35750(this, Class1975.field10946);
    }
    
    public Class8778 method30524(final Class9556 class9556, final Class1975 class9557) {
        return class9556.method35750(this, class9557);
    }
    
    public Class8778 method30525(final Class300 class300) {
        this.field36912.method22248(class300);
        return this;
    }
    
    public Class8778 method30526(final boolean b) {
        this.field36912.method22249(b);
        return this;
    }
    
    public Class8778 method30527(final boolean b) {
        this.field36912.method22250(b);
        return this;
    }
    
    public Class8778 method30528(final boolean b) {
        this.field36912.method22251(b);
        return this;
    }
    
    public Class8778 method30529(final boolean b) {
        this.field36912.method22252(b);
        return this;
    }
    
    public Class8778 method30530(final boolean b) {
        this.field36912.method22253(b);
        return this;
    }
    
    public Class8778 method30531(final String s) {
        this.field36912.method22254(s);
        return this;
    }
    
    public Class8778 method30532(final Class8698 class8698) {
        this.field36912.method22255(class8698);
        return this;
    }
    
    public Class8778 method30533(final Class7566 class7566) {
        this.field36912.method22256(class7566);
        return this;
    }
    
    public Class8778 method30534() {
        return this.method30535(Class1975.field10943);
    }
    
    public Class8778 method30535(final Class1975 class1975) {
        this.field36912.method22226(class1975);
        return this;
    }
    
    public Class7266[] method30536() {
        final Class7266[] array = this.field36913.toArray(new Class7266[this.field36913.size() + 1]);
        array[this.field36913.size()] = this.field36912;
        return array;
    }
}
