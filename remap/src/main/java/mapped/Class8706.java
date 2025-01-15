// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;

public class Class8706
{
    public List<String> field36582;
    public List<String> field36583;
    public int field36584;
    private Class869 field36585;
    
    public Class8706() {
        this.field36582 = new CopyOnWriteArrayList<String>();
        this.field36583 = new CopyOnWriteArrayList<String>();
        this.field36584 = 0;
        this.field36585 = Class869.method5277();
    }
    
    public void method29876() {
        Class9463.method35173().method35188().method21094(this);
        this.method29892();
    }
    
    @Class6753
    private void method29877(final Class5752 class5752) {
        if (class5752.method17061() == this.field36585.field4648.field23447.field2161.field32860) {
            if (this.field36585.field4690 != null) {
                if (this.field36585.field4690.getName() != null) {
                    final Class9070 method35204 = Class9463.method35173().method35204();
                    method35204.method32672();
                    if (this.method29878(this.field36585.field4690)) {
                        this.method29886(this.field36585.field4690.getName().method8459());
                        Class9274.method34209("" + method35204.method32671() + " " + this.field36585.field4690.getName().method8459() + " is no longer your friend.");
                    }
                    else {
                        this.method29882(this.field36585.field4690.getName().method8459());
                        Class9274.method34209("" + method35204.method32671() + " " + this.field36585.field4690.getName().method8459() + " is now your friend.");
                    }
                    this.method29890();
                }
            }
        }
    }
    
    public boolean method29878(final Entity class399) {
        return this.field36582.contains(class399.getName().method8459().toLowerCase());
    }
    
    public boolean method29879(final String s) {
        return this.field36582.contains(s.toLowerCase());
    }
    
    public boolean method29880(final Entity class399) {
        return this.field36583.contains(class399.getName().method8459().toLowerCase());
    }
    
    public boolean method29881(final String s) {
        return this.field36583.contains(s.toLowerCase());
    }
    
    public boolean method29882(final String s) {
        if (this.method29879(s)) {
            return false;
        }
        this.field36582.add(s.toLowerCase());
        this.method29890();
        return true;
    }
    
    public boolean method29883(final String s) {
        if (this.method29881(s)) {
            return false;
        }
        this.field36583.add(s.toLowerCase());
        this.method29891();
        return true;
    }
    
    public List<String> method29884() {
        return this.field36582;
    }
    
    public List<String> method29885() {
        return this.field36583;
    }
    
    public boolean method29886(final String s) {
        final boolean remove = this.field36582.remove(s.toLowerCase());
        if (remove) {
            this.method29890();
        }
        return remove;
    }
    
    public boolean method29887(final String s) {
        final boolean remove = this.field36583.remove(s.toLowerCase());
        if (remove) {
            this.method29891();
        }
        return remove;
    }
    
    public boolean method29888() {
        if (!this.field36582.isEmpty()) {
            this.field36582.clear();
            this.method29890();
            return true;
        }
        return false;
    }
    
    public boolean method29889() {
        if (!this.field36583.isEmpty()) {
            this.field36583.clear();
            this.method29891();
            return true;
        }
        return false;
    }
    
    public void method29890() {
        Class9463.method35173().method35206().method13296("friends", this.field36582);
    }
    
    public void method29891() {
        Class9463.method35173().method35206().method13296("enemies", this.field36583);
    }
    
    private void method29892() {
        if (Class9463.method35173().method35206().method13269("friends")) {
            final Class88 method13263 = Class9463.method35173().method35206().method13263("friends");
            if (method13263 != null) {
                method13263.forEach(o -> this.field36582.add((String)o));
            }
        }
        if (Class9463.method35173().method35206().method13269("enemies")) {
            final Class88 method13264 = Class9463.method35173().method35206().method13263("enemies");
            if (method13264 != null) {
                method13264.forEach(o2 -> this.field36583.add((String)o2));
            }
        }
    }
}
