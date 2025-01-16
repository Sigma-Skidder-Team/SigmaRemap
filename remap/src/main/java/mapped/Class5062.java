// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Class5062 extends Class5056<Class628>
{
    public final /* synthetic */ Class5045 field21711;
    
    public Class5062(final Class5045 class5045) {
        this((Iterable<Class7430>)Collections.emptyList());
    }
    
    public Class5062(final Class5045 field21711, final Iterable<Class7430> iterable) {
        this.field21711 = field21711;
        super(field21711.width(), field21711.height(), Class5045.method15397(field21711) ? Class7869.method25488(1) : 32, field21711.height() - 40, 46);
        iterable.forEach(this::method15546);
    }
    
    public void method15546(final Class7430 class7430) {
        final Class5045 field21711 = this.field21711;
        field21711.getClass();
        this.method15511(new Class628(field21711, class7430));
    }
    
    @Override
    public boolean mouseClicked(final double n, final double n2, final int n3) {
        if (n3 == 0) {
            if (n2 >= this.method15525()) {
                if (n2 <= this.method15526()) {
                    final int n4 = this.method15515() / 2 - 150;
                    if (Class5045.method15398(this.field21711) != null) {
                        Class8428.method28148(Class5045.method15398(this.field21711));
                    }
                    final int n5 = (int)Math.floor(n2 - this.method15525()) - this.method15527() + this.method15530() - 4;
                    final int n6 = n5 / this.method15528();
                    if (n >= n4) {
                        if (n < this.method15524()) {
                            if (n6 >= 0) {
                                if (n5 >= 0) {
                                    if (n6 < this.method15521()) {
                                        this.method15533(n6);
                                        this.method15520(n5, n6, n, n2, this.method15515());
                                        if (n6 < Class5045.method15393(this.field21711).method15521()) {
                                            Class5045.method15399(this.field21711, n6);
                                            Class5045.method15400(this.field21711);
                                            Class5045.method15401(this.field21711, Class5045.method15402(this.field21711) + 7);
                                            if (Class5045.method15402(this.field21711) >= 10) {
                                                Class5045.method15388(this.field21711);
                                            }
                                            return true;
                                        }
                                        return super.mouseClicked(n, n2, n3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return super.mouseClicked(n, n2, n3);
    }
    
    @Override
    public void method15533(final int n) {
        Class5045.method15399(this.field21711, n);
        this.method15519(n);
        if (n != -1) {
            final Class7430 method15548 = Class5045.method15393(this.field21711).method15548(n);
            Realms.narrateNow(RealmsScreen.method15439("narrator.select", Realms.method25385(Arrays.asList(method15548.field28650, RealmsScreen.method15439("mco.template.select.narrate.authors", method15548.field28652), method15548.field28656, RealmsScreen.method15439("mco.template.select.narrate.version", method15548.field28651), RealmsScreen.method15439("narrator.select.list.position", n + 1, Class5045.method15393(this.field21711).method15521())))));
        }
        Class5045.method15400(this.field21711);
    }
    
    @Override
    public void method15520(final int n, final int n2, final double n3, final double n4, final int n5) {
        if (n2 >= Class5045.method15393(this.field21711).method15521()) {}
    }
    
    @Override
    public int method15523() {
        return this.method15521() * 46;
    }
    
    @Override
    public int method15531() {
        return 300;
    }
    
    @Override
    public void method15522() {
        this.field21711.method15413();
    }
    
    @Override
    public boolean method15532() {
        return this.field21711.method15447(this);
    }
    
    public boolean method15547() {
        return this.method15521() == 0;
    }
    
    public Class7430 method15548(final int n) {
        return this.method15535().get(n).field3611;
    }
    
    public List<Class7430> method15549() {
        return this.method15535().stream().map(class628 -> class628.field3611).collect((Collector<? super Object, ?, List<Class7430>>)Collectors.toList());
    }
}
