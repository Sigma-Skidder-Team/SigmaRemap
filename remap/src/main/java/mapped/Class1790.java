// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;

public class Class1790 extends Class1776<Class7637> implements AutoCloseable
{
    private Map<Class1932, Class6313> field9906;
    private Class391 field9907;
    private final Class9509 field9908;
    private final Class1663 field9909;
    private final Class7860 field9910;
    private int field9911;
    private Class6313 field9912;
    private Object2IntMap<Class7096> field9913;
    
    public Class1790(final Class1663 field9909, final Class7860 field9910, final int field9911) {
        this.field9909 = field9909;
        this.field9910 = field9910;
        this.field9911 = field9911;
        this.field9908 = new Class9509(this);
    }
    
    public Class6313 method6451(final Class1933 key) {
        return this.field9906.getOrDefault(key, this.field9912);
    }
    
    public Class6313 method6452() {
        return this.field9912;
    }
    
    public Class9509 method6453() {
        return this.field9908;
    }
    
    public Class7637 method6454(final Class6582 class6582, final Class5028 class6583) {
        class6583.method15295();
        final Class7637 class6584 = new Class7637(class6582, this.field9910, class6583, this.field9911);
        class6583.method15296();
        return class6584;
    }
    
    public void method6455(final Class7637 class7637, final Class6582 class7638, final Class5028 class7639) {
        class7639.method15295();
        class7639.method15297("upload");
        if (this.field9907 != null) {
            this.field9907.close();
        }
        this.field9907 = class7637.method24011(this.field9909, class7639);
        this.field9906 = class7637.method24023();
        this.field9913 = class7637.method24024();
        this.field9912 = this.field9906.get(Class7637.field30250);
        class7639.method15300("cache");
        this.field9908.method35430();
        class7639.method15299();
        class7639.method15296();
    }
    
    public boolean method6456(final Class7096 class7096, final Class7096 class7097) {
        if (class7096 != class7097) {
            final int int1 = this.field9913.getInt((Object)class7096);
            return int1 == -1 || int1 != this.field9913.getInt((Object)class7097) || class7096.method21756() != class7097.method21756();
        }
        return false;
    }
    
    public Class1774 method6457(final Class1932 class1932) {
        return this.field9907.method1414(class1932);
    }
    
    @Override
    public void close() {
        this.field9907.close();
    }
    
    public void method6458(final int field9911) {
        this.field9911 = field9911;
    }
}
