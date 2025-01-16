// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Comparator;

public class Class621 extends Class608<Class642>
{
    public final /* synthetic */ Class534 field3600;
    
    private Class621(final Class534 field3600) {
        this.field3600 = field3600;
        super(field3600.minecraft, field3600.width, field3600.height, 80, field3600.height - 37, 16);
        Registry.field217.method507().stream().sorted(Comparator.comparing(class1932 -> Registry.field217.getOrDefault(class1932).method9864().getString())).forEach(class1933 -> this.method3536(new Class642(this, class1933)));
    }
    
    @Override
    public boolean method3561() {
        return this.field3600.method3471() == this;
    }
    
    public void method3617(final Class642 class642) {
        super.method3531(class642);
        if (class642 != null) {
            NarratorChatListener.field32404.method25556(new Class2259("narrator.select", new Object[] { Registry.field217.getOrDefault(Class642.method3685(class642)).method9864().getString() }).getString());
        }
    }
    
    @Override
    public void method3556(final int n) {
        super.method3556(n);
        this.field3600.method3083();
    }
}
