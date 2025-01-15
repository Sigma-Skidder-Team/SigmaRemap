// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.BitSet;
import java.util.stream.Stream;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import javax.annotation.Nullable;

public class Class1866 extends Class1865
{
    private static String[] field10189;
    private final Class1862 field10190;
    
    public Class1866(final Class1862 field10190) {
        super(field10190.method7019(), Class8288.field34078);
        this.field10190 = field10190;
    }
    
    @Nullable
    @Override
    public Class436 method6727(final Class354 class354) {
        return this.field10190.method6727(class354);
    }
    
    @Nullable
    @Override
    public Class7096 method6701(final Class354 class354) {
        return this.field10190.method6701(class354);
    }
    
    @Override
    public Class7099 method6702(final Class354 class354) {
        return this.field10190.method6702(class354);
    }
    
    @Override
    public int method6985() {
        return this.field10190.method6985();
    }
    
    @Nullable
    @Override
    public Class7096 method7008(final Class354 class354, final Class7096 class355, final boolean b) {
        return null;
    }
    
    @Override
    public void method7009(final Class354 class354, final Class436 class355) {
    }
    
    @Override
    public void method7010(final Class399 class399) {
    }
    
    @Override
    public void method7098(final Class9312 class9312) {
    }
    
    @Override
    public Class8199[] method7014() {
        return this.field10190.method7014();
    }
    
    @Nullable
    @Override
    public Class1886 method7099() {
        return this.field10190.method7052();
    }
    
    @Override
    public void method7016(final Class2020 class2020, final long[] array) {
    }
    
    private Class2020 method7113(final Class2020 class2020) {
        if (class2020 != Class2020.field11521) {
            return (class2020 != Class2020.field11523) ? class2020 : Class2020.field11524;
        }
        return Class2020.field11522;
    }
    
    @Override
    public int method7018(final Class2020 class2020, final int n, final int n2) {
        return this.field10190.method7018(this.method7113(class2020), n, n2);
    }
    
    @Override
    public Class7859 method7019() {
        return this.field10190.method7019();
    }
    
    @Override
    public void method7020(final long n) {
    }
    
    @Nullable
    @Override
    public Class5936 method7045(final String s) {
        return this.field10190.method7045(s);
    }
    
    @Override
    public void method7046(final String s, final Class5936 class5936) {
    }
    
    @Override
    public Map<String, Class5936> method7021() {
        return this.field10190.method7021();
    }
    
    @Override
    public void method7022(final Map<String, Class5936> map) {
    }
    
    @Override
    public LongSet method7047(final String s) {
        return this.field10190.method7047(s);
    }
    
    @Override
    public void method7048(final String s, final long n) {
    }
    
    @Override
    public Map<String, LongSet> method7049() {
        return this.field10190.method7049();
    }
    
    @Override
    public void method7050(final Map<String, LongSet> map) {
    }
    
    @Override
    public Class1873 method7024() {
        return this.field10190.method7024();
    }
    
    @Override
    public void method7025(final boolean b) {
    }
    
    @Override
    public boolean method7026() {
        return false;
    }
    
    @Override
    public Class9312 method7027() {
        return this.field10190.method7027();
    }
    
    @Override
    public void method7028(final Class354 class354) {
    }
    
    @Override
    public void method7029(final Class354 class354) {
    }
    
    @Override
    public void method7032(final Class51 class51) {
    }
    
    @Nullable
    @Override
    public Class51 method7033(final Class354 class354) {
        return this.field10190.method7033(class354);
    }
    
    @Nullable
    @Override
    public Class51 method7034(final Class354 class354) {
        return this.field10190.method7034(class354);
    }
    
    @Override
    public void method7097(final Class1873 class1873) {
    }
    
    @Override
    public Stream<Class354> method7035() {
        return this.field10190.method7035();
    }
    
    @Override
    public Class6951<Class3833> method7102() {
        return new Class6951<Class3833>(class3833 -> class3833.method11878().method21706(), this.method7019());
    }
    
    @Override
    public Class6951<Class7255> method7103() {
        return new Class6951<Class7255>(class7255 -> class7255 == Class7558.field29974, this.method7019());
    }
    
    @Override
    public BitSet method7038(final Class2126 class2126) {
        return this.field10190.method7038(class2126);
    }
    
    public Class1862 method7114() {
        return this.field10190;
    }
    
    @Override
    public boolean method7043() {
        return this.field10190.method7043();
    }
    
    @Override
    public void method7044(final boolean b) {
        this.field10190.method7044(b);
    }
}
