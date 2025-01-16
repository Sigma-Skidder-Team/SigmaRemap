// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.util.Iterator;
import com.google.common.collect.Lists;
import net.minecraft.util.text.ITextComponent;

import java.util.Random;
import java.util.List;

public class Class7833 implements Class7831<Class7832>
{
    private static String[] field32075;
    private final List<Class7831<Class7832>> field32076;
    private final Random field32077;
    private final ResourceLocation field32078;
    private final ITextComponent field32079;
    
    public Class7833(final ResourceLocation field32078, final String s) {
        this.field32076 = Lists.newArrayList();
        this.field32077 = new Random();
        this.field32078 = field32078;
        this.field32079 = ((s != null) ? new Class2259(s, new Object[0]) : null);
    }
    
    @Override
    public int method25300() {
        int n = 0;
        final Iterator<Class7831<Class7832>> iterator = this.field32076.iterator();
        while (iterator.hasNext()) {
            n += iterator.next().method25300();
        }
        return n;
    }
    
    public Class7832 method25301() {
        final int method25300 = this.method25300();
        if (!this.field32076.isEmpty() && method25300 != 0) {
            int nextInt = this.field32077.nextInt(method25300);
            for (final Class7831 class7831 : this.field32076) {
                nextInt -= class7831.method25300();
                if (nextInt >= 0) {
                    continue;
                }
                return (Class7832)class7831.method25303();
            }
            return Class1784.field9895;
        }
        return Class1784.field9895;
    }
    
    public void method25312(final Class7831<Class7832> class7831) {
        this.field32076.add(class7831);
    }
    
    @Nullable
    public ITextComponent method25313() {
        return this.field32079;
    }
    
    @Override
    public void method25302(final Class9382 class9382) {
        final Iterator<Class7831<Class7832>> iterator = this.field32076.iterator();
        while (iterator.hasNext()) {
            iterator.next().method25302(class9382);
        }
    }
}
