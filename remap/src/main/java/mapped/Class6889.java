// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.EOFException;
import java.io.IOException;
import java.util.Locale;
import java.util.Date;
import java.util.Iterator;
import java.util.Collections;
import java.util.ArrayList;
import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.net.URL;
import java.util.List;

public abstract class Class6889
{
    private final Class9131 field27012;
    public final Class3706 field27013;
    private final Class3725 field27014;
    private final boolean field27015;
    private final List<Class1950> field27016;
    private URL field27017;
    private int field27018;
    public Class5778 field27019;
    public Class7398 field27020;
    public Class6915 field27021;
    
    public Class6889(final Class3746 class3746, final Class9131 field27012) {
        this.field27012 = field27012;
        this.field27013 = (Class3706)class3746.method11499(1953196132L);
        final Class3746 method11499 = class3746.method11499(1835297121L);
        this.field27014 = (Class3725)method11499.method11499(1835296868L);
        final Class3746 method11500 = method11499.method11499(1835626086L);
        final Class3798 class3747 = (Class3798)method11500.method11499(1684631142L).method11499(1685218662L);
        if (class3747.method11498(1970433056L)) {
            final Class3784 class3748 = (Class3784)class3747.method11499(1970433056L);
            if (!(this.field27015 = class3748.method11607())) {
                try {
                    this.field27017 = new URL(class3748.method11608());
                }
                catch (final MalformedURLException ex) {
                    Logger.getLogger("MP4 API").log(Level.WARNING, "Parsing URL-Box failed: {0}, url: {1}", new String[] { ex.toString(), class3748.method11608() });
                    this.field27017 = null;
                }
            }
        }
        else {
            this.field27015 = true;
            this.field27017 = null;
        }
        final Class3746 method11501 = method11500.method11499(1937007212L);
        if (method11501.method11497()) {
            this.field27016 = new ArrayList<Class1950>();
            this.method21167(method11501);
        }
        else {
            this.field27016 = Collections.emptyList();
        }
        this.field27018 = 0;
    }
    
    private void method21167(final Class3746 class3746) {
        final double n = (double)this.field27014.method11459();
        final Class2071 method21157 = this.method21157();
        final long[] method21158 = ((Class3815)class3746.method11499(1937011578L)).method11689();
        Class3813 class3747;
        if (!class3746.method11498(1937007471L)) {
            class3747 = (Class3813)class3746.method11499(1668232756L);
        }
        else {
            class3747 = (Class3813)class3746.method11499(1937007471L);
        }
        final long[] method21159 = class3747.method11684();
        final Class3791 class3748 = (Class3791)class3746.method11499(1937011555L);
        final long[] method21160 = class3748.method11627();
        final long[] method21161 = class3748.method11628();
        final Class3721 class3749 = (Class3721)class3746.method11499(1937011827L);
        final long[] method21162 = class3749.method11447();
        final long[] method21163 = class3749.method11448();
        final long[] array = new long[method21158.length];
        long n2 = 0L;
        int n3 = 0;
        for (int i = 0; i < method21162.length; ++i) {
            for (int n4 = 0; n4 < method21162[i]; ++n4) {
                array[n3 + n4] = n2;
                n2 += method21163[i];
            }
            n3 += (int)method21162[i];
        }
        int n5 = 0;
        for (int j = 0; j < method21160.length; ++j) {
            int length;
            if (j >= method21160.length - 1) {
                length = method21159.length;
            }
            else {
                length = (int)method21160[j + 1] - 1;
            }
            for (int k = (int)method21160[j] - 1; k < length; ++k) {
                long n6 = method21159[k];
                for (int n7 = 0; n7 < method21161[j]; ++n7) {
                    this.field27016.add(new Class1950(method21157, n6, method21158[n5], array[n5] / n));
                    n6 += method21158[n5];
                    ++n5;
                }
            }
        }
        Collections.sort(this.field27016);
    }
    
    public void method21168(final Class3726 class3726) {
        final Iterator<Class5775> iterator = class3726.method11462().method17222().iterator();
        while (iterator.hasNext()) {
            for (final Class5775 class3727 : iterator.next().method17222()) {
                switch (class3727.method17223()) {
                    case 5: {
                        this.field27019 = (Class5778)class3727;
                        continue;
                    }
                }
            }
        }
    }
    
    public <T> void method21169(final Class3746 class3746, final Class<T> clazz) {
        try {
            if (class3746.getClass().isInstance(clazz.newInstance())) {
                System.out.println("true");
            }
        }
        catch (final InstantiationException ex) {
            ex.printStackTrace();
        }
        catch (final IllegalAccessException ex2) {
            ex2.printStackTrace();
        }
    }
    
    public abstract Class2071 method21157();
    
    public abstract Class2237 method21158();
    
    public boolean method21170() {
        return this.field27013.method11396();
    }
    
    public boolean method21171() {
        return this.field27013.method11397();
    }
    
    public boolean method21172() {
        return this.field27013.method11398();
    }
    
    public Date method21173() {
        return Class7804.method25208(this.field27013.method11399());
    }
    
    public Date method21174() {
        return Class7804.method25208(this.field27013.method11400());
    }
    
    public Locale method21175() {
        return new Locale(this.field27014.method11461());
    }
    
    public boolean method21176() {
        return this.field27015;
    }
    
    public URL method21177() {
        return this.field27017;
    }
    
    public byte[] method21178() {
        return this.field27019.method17235();
    }
    
    public Class7398 method21179() {
        return this.field27020;
    }
    
    public Class6915 method21180() {
        return this.field27021;
    }
    
    public boolean method21181() {
        return this.field27018 < this.field27016.size();
    }
    
    public Class1950 method21182() throws IOException {
        Class1950 class1950 = null;
        if (this.method21181()) {
            class1950 = this.field27016.get(this.field27018);
            if (class1950.method7927() < this.field27012.method33145()) {
                this.field27012.method33151();
            }
            final long n = class1950.method7927() - this.field27012.method33145();
            if (n > 0L) {
                this.field27012.method33144(n);
            }
            else if (n < 0L) {
                if (!this.field27012.method33148()) {
                    Logger.getLogger("MP4 API").log(Level.WARNING, "readNextFrame failed: frame {0} already skipped, offset:{1}, stream:{2}", new Object[] { this.field27018, class1950.method7927(), this.field27012.method33145() });
                    throw new IOException("frame already skipped and no random access");
                }
                this.field27012.method33147(class1950.method7927());
            }
            final byte[] array = new byte[(int)class1950.method7928()];
            try {
                this.field27012.method33138(array);
            }
            catch (final EOFException ex) {
                Logger.getLogger("MP4 API").log(Level.WARNING, "readNextFrame failed: tried to read {0} bytes at {1}", new Long[] { class1950.method7928(), this.field27012.method33145() });
                throw ex;
            }
            class1950.method7930(array);
            ++this.field27018;
        }
        return class1950;
    }
    
    public double method21183(final double n) {
        if (n <= this.method21184()) {
            Class1950 class1950 = null;
            for (int i = 0; i < this.field27016.size(); ++i) {
                class1950 = this.field27016.get(i++);
                if (class1950.method7929() > n) {
                    this.field27018 = i;
                    break;
                }
            }
            return (class1950 != null) ? class1950.method7929() : -1.0;
        }
        return this.method21185();
    }
    
    public double method21184() {
        double max = 0.0;
        for (int i = 0; i < this.field27016.size(); ++i) {
            final Class1950 class1950 = this.field27016.get(i++);
            try {
                if (class1950.method7927() <= this.field27012.method33145() + this.field27012.method33146()) {
                    max = Math.max(class1950.method7929(), max);
                }
            }
            catch (final IOException ex) {
                ex.printStackTrace();
            }
        }
        return max;
    }
    
    public double method21185() {
        return this.field27016.get(Math.min(this.field27018, this.field27016.size() - 1)).method7929();
    }
}
