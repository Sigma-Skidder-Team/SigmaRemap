// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import java.util.List;

public class Class9114
{
    private static String[] field38614;
    private final List<Class5147> field38615;
    
    public Class9114() {
        this.field38615 = new ArrayList<Class5147>();
    }
    
    public void method32967(final int n) {
        for (int i = 0; i < this.field38615.size(); ++i) {
            this.field38615.get(i).method16078(n);
        }
    }
    
    public void method32968() {
        for (int i = 0; i < this.field38615.size(); ++i) {
            this.field38615.get(i).method16086();
        }
    }
    
    public Class5153 method32969(final String s) {
        final Class5153 class5153 = new Class5153(s);
        this.field38615.add(class5153);
        return class5153;
    }
    
    public Class5148 method32970(final String s) {
        final Class5148 class5148 = new Class5148(s);
        this.field38615.add(class5148);
        return class5148;
    }
    
    public Class5152 method32971(final String s) {
        final Class5152 class5152 = new Class5152(s);
        this.field38615.add(class5152);
        return class5152;
    }
    
    public Class5154 method32972(final String s) {
        final Class5154 class5154 = new Class5154(s);
        this.field38615.add(class5154);
        return class5154;
    }
    
    public Class5151 method32973(final String s) {
        final Class5151 class5151 = new Class5151(s);
        this.field38615.add(class5151);
        return class5151;
    }
    
    public Class5155 method32974(final String s) {
        final Class5155 class5155 = new Class5155(s);
        this.field38615.add(class5155);
        return class5155;
    }
    
    public Class5150 method32975(final String s) {
        final Class5150 class5150 = new Class5150(s);
        this.field38615.add(class5150);
        return class5150;
    }
}
