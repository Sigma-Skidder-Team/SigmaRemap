// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.util.Date;
import java.util.Collections;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class Class6476
{
    private static String[] field25831;
    private final Class9131 field25832;
    private final Class3715 field25833;
    private final List<Class6889> field25834;
    private final Class9245 field25835;
    private final List<Class6915> field25836;
    
    public Class6476(final Class3746 class3746, final Class9131 field25832) {
        this.field25832 = field25832;
        this.field25833 = (Class3715)class3746.method11499(1836476516L);
        final List<Class3746> method11501 = class3746.method11501(1953653099L);
        this.field25834 = new ArrayList<Class6889>(method11501.size());
        for (int i = 0; i < method11501.size(); ++i) {
            final Class6889 method11502 = this.method19490(method11501.get(i));
            if (method11502 != null) {
                this.field25834.add(method11502);
            }
        }
        this.field25835 = new Class9245();
        if (!class3746.method11498(1835365473L)) {
            if (class3746.method11498(1969517665L)) {
                final Class3746 method11503 = class3746.method11499(1969517665L);
                if (method11503.method11498(1835365473L)) {
                    this.field25835.method34086(method11503, method11503.method11499(1835365473L));
                }
            }
        }
        else {
            this.field25835.method34086(null, class3746.method11499(1835365473L));
        }
        this.field25836 = new ArrayList<Class6915>();
        if (class3746.method11498(1768977007L)) {
            final Iterator<Class3746> iterator = class3746.method11499(1768977007L).method11501(1936289382L).iterator();
            while (iterator.hasNext()) {
                this.field25836.add(Class6915.method21283(iterator.next()));
            }
        }
    }
    
    private Class6889 method19490(final Class3746 class3746) {
        Class6889 class3747 = null;
        switch ((int)((Class3775)class3746.method11499(1835297121L).method11499(1751411826L)).method11580()) {
            case 1986618469: {
                class3747 = new Class6888(class3746, this.field25832);
                break;
            }
            case 1936684398: {
                class3747 = new Class6890(class3746, this.field25832);
                break;
            }
            default: {
                class3747 = null;
                break;
            }
        }
        return class3747;
    }
    
    public List<Class6889> method19491() {
        return Collections.unmodifiableList((List<? extends Class6889>)this.field25834);
    }
    
    public List<Class6889> method19492(final Class2071 other) {
        final ArrayList list = new ArrayList();
        for (final Class6889 class6889 : this.field25834) {
            if (!class6889.method21157().equals(other)) {
                continue;
            }
            list.add(class6889);
        }
        return (List<Class6889>)Collections.unmodifiableList((List<?>)list);
    }
    
    public List<Class6889> method19493(final Class2237 obj) {
        final ArrayList list = new ArrayList();
        for (final Class6889 class6889 : this.field25834) {
            if (!class6889.method21158().equals(obj)) {
                continue;
            }
            list.add(class6889);
        }
        return (List<Class6889>)Collections.unmodifiableList((List<?>)list);
    }
    
    public boolean method19494() {
        return this.field25835.method34092();
    }
    
    public Class9245 method19495() {
        return this.field25835;
    }
    
    public List<Class6915> method19496() {
        return Collections.unmodifiableList((List<? extends Class6915>)this.field25836);
    }
    
    public Date method19497() {
        return Class7804.method25208(this.field25833.method11428());
    }
    
    public Date method19498() {
        return Class7804.method25208(this.field25833.method11429());
    }
    
    public double method19499() {
        return this.field25833.method11431() / (double)this.field25833.method11430();
    }
    
    public boolean method19500() {
        final Iterator<Class6889> iterator = this.field25834.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().method21181()) {
                continue;
            }
            return true;
        }
        return false;
    }
    
    public Class1950 method19501() throws IOException {
        Class6889 class6889 = null;
        for (final Class6889 class6890 : this.field25834) {
            if (!class6890.method21181()) {
                continue;
            }
            if (class6889 != null && class6890.method21185() >= class6889.method21185()) {
                continue;
            }
            class6889 = class6890;
        }
        return (class6889 != null) ? class6889.method21182() : null;
    }
}
