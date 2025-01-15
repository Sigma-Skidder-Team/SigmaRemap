// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.TimerTask;

public class Class1621 extends TimerTask
{
    private static String[] field9050;
    public final /* synthetic */ long field9051;
    public final /* synthetic */ Class4248 field9052;
    public final /* synthetic */ Class4968 field9053;
    public final /* synthetic */ Class4967 field9054;
    public final /* synthetic */ Class1040 field9055;
    
    public Class1621(final Class1040 field9055, final long field9056, final Class4248 field9057, final Class4968 field9058, final Class4967 field9059) {
        this.field9055 = field9055;
        this.field9051 = field9056;
        this.field9052 = field9057;
        this.field9053 = field9058;
        this.field9054 = field9059;
    }
    
    @Override
    public void run() {
        Class934.method5435(new Class1167(this));
    }
}
