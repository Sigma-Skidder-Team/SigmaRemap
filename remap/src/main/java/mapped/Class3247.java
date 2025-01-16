// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import com.mentalfrostbyte.jello.mods.util.InDevelopment;

@InDevelopment
public class Class3247 extends Class3167
{
    public Class3167[] field15742;
    public Class3167 field15743;
    private List<String> field15744;
    public Class5001 field15745;
    private final List<Class8510> field15746;
    
    public Class3247(final Class8013 class8013, final String str, final String s, final Class3167... field15742) {
        super(class8013, str, s);
        this.field15744 = new ArrayList<String>();
        this.field15746 = new ArrayList<Class8510>();
        this.field15742 = field15742;
        for (final Class3167 class8014 : this.field15742) {
            Class9463.method35173().method35188().method21094(class8014);
            this.field15744.add(class8014.method9901());
            class8014.method9913(this);
        }
        this.method9881(this.field15745 = new Class5001("Type", str + " mode", 0, (String[])this.field15744.toArray(new String[0])));
        this.field15745.method15195(class4997 -> this.method10258());
        this.method10258();
    }
    
    public void method10258() {
        this.method10259();
        for (final Class3167 field15743 : this.field15742) {
            final boolean equals = this.method9887("Type").equals(field15743.field15515);
            if (this.method9906() && Class3247.field15514.player != null) {
                field15743.method9907(equals);
                if (equals) {
                    this.field15743 = field15743;
                }
            }
            else if (this.method9906()) {
                field15743.method9908(equals);
            }
            this.method10262(field15743, equals);
        }
    }
    
    private void method10259() {
        int n = 0;
        final Class3167[] field15742 = this.field15742;
        for (int length = field15742.length, i = 0; i < length; ++i) {
            if (this.method9887("Type").equals(field15742[i].field15515)) {
                n = 1;
            }
        }
        if (n == 0) {
            this.method9893("Type", this.field15742[0].field15515);
        }
    }
    
    public Class3167 method10260() {
        this.method10259();
        for (final Class3167 class3167 : this.field15742) {
            if (this.method9887("Type").equals(class3167.field15515)) {
                return class3167;
            }
        }
        return null;
    }
    
    @Override
    public boolean method9898() {
        if (this.field15743 == null) {
            this.method10258();
        }
        return (this.field15743 != null) ? this.field15743.method9898() : this.method9906();
    }
    
    @Override
    public Class4405 method9895(final Class4405 class4405) {
        final Class4405 method26637 = Class8105.method26637(class4405, "sub-options");
        if (method26637 != null) {
            for (final Class3167 class4406 : this.field15742) {
                final Class88 method26638 = Class8105.method26638(method26637, class4406.method9901());
                if (method26638 != null) {
                    for (int j = 0; j < method26638.method462(); ++j) {
                        final Class4405 method26639 = method26638.method457(j);
                        Object method26640 = null;
                        try {
                            method26640 = Class8105.method26636(method26639, "name", null);
                        }
                        catch (final Class2381 class4407) {}
                        for (final Class4997 class4408 : class4406.field15525.values()) {
                            if (class4408.method15204().equals(method26640)) {
                                try {
                                    class4408.method15186(method26639);
                                }
                                catch (final Class2381 class4409) {
                                    Class9463.method35173().method35187().method20241("Could not initialize settings of " + class4406.method9901() + "." + class4408.method15204() + " from config.");
                                }
                                break;
                            }
                        }
                    }
                }
            }
        }
        final Class4405 method26641 = super.method9895(class4405);
        if (this.field15518) {
            this.method10258();
        }
        return method26641;
    }
    
    @Override
    public Class4405 method9896(final Class4405 class4405) {
        final Class4405 class4406 = new Class4405();
        for (final Class3167 class4407 : this.field15742) {
            final Class88 class4408 = new Class88();
            final Iterator<Class4997> iterator = class4407.field15525.values().iterator();
            while (iterator.hasNext()) {
                class4408.method486(iterator.next().method15193(new Class4405()));
            }
            class4406.method13301(class4407.method9901(), class4408);
        }
        class4405.method13301("sub-options", class4406);
        return super.method9896(class4405);
    }
    
    @Override
    public void method9879() {
        this.method10258();
        if (this.field15743 instanceof Class3355) {
            if (!Class9463.method35173().method35201().method19352()) {
                this.method9908(false);
            }
        }
    }
    
    @Override
    public void method9897() {
        final Class3167[] field15742 = this.field15742;
        for (int length = field15742.length, i = 0; i < length; ++i) {
            field15742[i].method9909(false);
        }
    }
    
    @Override
    public void method9894() {
        final Class3167[] field15742 = this.field15742;
        for (int length = field15742.length, i = 0; i < length; ++i) {
            field15742[i].method9907(false);
        }
        super.method9894();
    }
    
    public final Class3247 method10261(final Class8510 class8510) {
        this.field15746.add(class8510);
        return this;
    }
    
    public final void method10262(final Class3167 class3167, final boolean b) {
        final Iterator<Class8510> iterator = this.field15746.iterator();
        while (iterator.hasNext()) {
            iterator.next().method28430(this, class3167, b);
        }
    }
    
    @Override
    public void method9917() {
        super.method9917();
        final Class3167[] field15742 = this.field15742;
        for (int length = field15742.length, i = 0; i < length; ++i) {
            field15742[i].method9917();
        }
    }
}
