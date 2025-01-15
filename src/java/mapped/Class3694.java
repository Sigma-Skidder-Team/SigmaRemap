// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import com.google.common.collect.Lists;
import java.util.Iterator;
import org.apache.logging.log4j.Logger;

public class Class3694 extends Class3693<Class3820>
{
    private static final Logger field17013;
    
    public Class3694(final Class7203 class7203) {
        super(class7203, Class90.field211);
    }
    
    @Override
    public void method11365() {
        this.method11373(Class7188.field27879, Class7855.field32236);
        this.method11373(Class7188.field27880, Class7855.field32237);
        this.method11373(Class7188.field27881, Class7855.field32238);
        this.method11373(Class7188.field27882, Class7855.field32239);
        this.method11373(Class7188.field27883, Class7855.field32240);
        this.method11373(Class7188.field27884, Class7855.field32241);
        this.method11373(Class7188.field27885, Class7855.field32242);
        this.method11373(Class7188.field27886, Class7855.field32243);
        this.method11373(Class7188.field27887, Class7855.field32244);
        this.method11373(Class7188.field27888, Class7855.field32245);
        this.method11373(Class7188.field27889, Class7855.field32246);
        this.method11373(Class7188.field27891, Class7855.field32248);
        this.method11373(Class7188.field27892, Class7855.field32249);
        this.method11373(Class7188.field27895, Class7855.field32252);
        this.method11373(Class7188.field27894, Class7855.field32251);
        this.method11373(Class7188.field27896, Class7855.field32253);
        this.method11373(Class7188.field27897, Class7855.field32254);
        this.method11373(Class7188.field27899, Class7855.field32256);
        this.method11373(Class7188.field27898, Class7855.field32255);
        this.method11373(Class7188.field27893, Class7855.field32250);
        this.method11373(Class7188.field27901, Class7855.field32258);
        this.method11373(Class7188.field27903, Class7855.field32260);
        this.method11373(Class7188.field27904, Class7855.field32261);
        this.method11373(Class7188.field27902, Class7855.field32259);
        this.method11373(Class7188.field27905, Class7855.field32262);
        this.method11373(Class7188.field27906, Class7855.field32263);
        this.method11373(Class7188.field27907, Class7855.field32264);
        this.method11373(Class7188.field27890, Class7855.field32247);
        this.method11373(Class7188.field27908, Class7855.field32265);
        this.method11373(Class7188.field27909, Class7855.field32266);
        this.method11373(Class7188.field27910, Class7855.field32267);
        this.method11373(Class7188.field27911, Class7855.field32268);
        this.method11373(Class7188.field27912, Class7855.field32269);
        this.method11373(Class7188.field27913, Class7855.field32270);
        this.method11368(Class7855.field32257).method26978(Class7739.field31556, Class7739.field31557, Class7739.field31558, Class7739.field31559, Class7739.field31560, Class7739.field31561, Class7739.field31562, Class7739.field31563, Class7739.field31564, Class7739.field31565, Class7739.field31566, Class7739.field31567, Class7739.field31568, Class7739.field31569, Class7739.field31570, Class7739.field31571);
        this.method11368(Class7855.field32271).method26978(Class7739.field31356, Class7739.field31585, Class7739.field31586, Class7739.field31587, Class7739.field31588, Class7739.field31589);
        this.method11368(Class7855.field32272).method26978(Class7739.field31379, Class7739.field31383, Class7739.field31380, Class7739.field31384, Class7739.field31382, Class7739.field31381);
        this.method11373(Class7188.field27926, Class7855.field32273);
        this.method11368(Class7855.field32274).method26978(Class7739.field31595, Class7739.field31596, Class7739.field31597, Class7739.field31598, Class7739.field31599, Class7739.field31600, Class7739.field31601, Class7739.field31602, Class7739.field31603, Class7739.field31604, Class7739.field31605, Class7739.field31606);
        this.method11368(Class7855.field32275).method26978(Class7739.field31281, Class7739.field31282);
        this.method11368(Class7855.field32276).method26978(Class7739.field31280, Class7739.field31581, Class7739.field31580);
        this.method11368(Class7855.field32277).method26978(Class7739.field31513, Class7739.field31512);
    }
    
    public void method11373(final Class7909<Class3833> class7909, final Class7909<Class3820> class7910) {
        final Class8162<Class3820> method11368 = this.method11368(class7910);
        final Iterator<Class6967<Class3833>> iterator = class7909.method25617().iterator();
        while (iterator.hasNext()) {
            method11368.method26976(this.method11374(iterator.next()));
        }
    }
    
    private Class6967<Class3820> method11374(final Class6967<Class3833> obj) {
        if (obj instanceof Class6966) {
            return new Class6966<Class3820>(((Class6966)obj).method21380());
        }
        if (!(obj instanceof Class6968)) {
            throw new UnsupportedOperationException("Unknown tag entry " + obj);
        }
        final ArrayList arrayList = Lists.newArrayList();
        for (final Class3833 class3833 : ((Class6968)obj).method21382()) {
            final Class3820 method11704 = class3833.method11704();
            if (method11704 != Class7739.field30754) {
                arrayList.add(method11704);
            }
            else {
                Class3694.field17013.warn("Itemless block copied to item tag: {}", (Object)Class90.field208.method503(class3833));
            }
        }
        return new Class6968<Class3820>(arrayList);
    }
    
    @Override
    public Path method11367(final Class1932 class1932) {
        return this.field17010.method22099().resolve("data/" + class1932.method7798() + "/tags/items/" + class1932.method7797() + ".json");
    }
    
    @Override
    public String method11338() {
        return "Item Tags";
    }
    
    @Override
    public void method11366(final Class6208<Class3820> class6208) {
        Class7855.method25401(class6208);
    }
    
    static {
        field17013 = LogManager.getLogger();
    }
}
