// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;

public class Class8949
{
    private static String[] field37637;
    public Class7814 field37638;
    public List<Class399> field37639;
    
    public Class8949() {
        this.field37639 = new CopyOnWriteArrayList<Class399>();
    }
    
    public void method31750() {
        Class9463.method35173().method35188().method21094(this);
    }
    
    public boolean method31751(final Class399 class399) {
        return this.field37639.contains(class399);
    }
    
    public void method31752() {
        this.field37639.clear();
    }
    
    @Class6753
    @Class6763
    private void method31753(final Class5732 class5732) {
        this.field37639.clear();
    }
    
    @Class6753
    @Class6763
    private void method31754(final Class5743 class5743) {
        if (this.field37638 != null) {
            for (final Class512 class5744 : Class6430.method19108()) {
                if (!this.field37638.method25239(class5744)) {
                    if (!this.field37638.method25240(class5744)) {
                        continue;
                    }
                    if (!this.field37639.contains(class5744)) {
                        continue;
                    }
                    this.field37639.remove(class5744);
                }
                else {
                    if (this.field37639.contains(class5744)) {
                        continue;
                    }
                    this.field37639.add(class5744);
                }
            }
        }
    }
}
