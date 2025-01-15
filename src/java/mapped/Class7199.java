// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;

public class Class7199 implements Class7198
{
    private static String[] field27968;
    private ArrayList field27969;
    private boolean field27970;
    private int field27971;
    private int field27972;
    public final /* synthetic */ Class7395 field27973;
    
    public Class7199(final Class7395 field27973, final ArrayList field27974, final int field27975, final int field27976) {
        this.field27973 = field27973;
        this.field27969 = field27974;
        this.field27971 = field27975;
        this.field27972 = field27976;
        this.field27970 = false;
    }
    
    public void method22085(final ArrayList field27969) {
        this.field27969 = field27969;
    }
    
    public ArrayList method22086() {
        return this.field27969;
    }
    
    @Override
    public float method22084(final float n) {
        Class2412 class2412 = this.field27969.get(0);
        for (int i = 1; i < this.field27969.size(); ++i) {
            final Class2412 class2413 = this.field27969.get(i);
            if (n >= class2412.method9631() && n <= class2413.method9631()) {
                return class2412.method9632() + (n - class2412.method9631()) / (class2413.method9631() - class2412.method9631()) * (class2413.method9632() - class2412.method9632());
            }
            class2412 = class2413;
        }
        return 0.0f;
    }
    
    public boolean method22087() {
        return this.field27970;
    }
    
    public void method22088(final boolean field27970) {
        this.field27970 = field27970;
    }
    
    public int method22089() {
        return this.field27972;
    }
    
    public void method22090(final int field27972) {
        this.field27972 = field27972;
    }
    
    public int method22091() {
        return this.field27971;
    }
    
    public void method22092(final int field27971) {
        this.field27971 = field27971;
    }
}
