// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import com.mojang.datafixers.util.Pair;

public class Class6601
{
    private static String[] field26171;
    private final int field26172;
    public final Class446 field26173;
    public int field26174;
    public final int field26175;
    public final int field26176;
    
    public Class6601(final Class446 field26173, final int field26174, final int field26175, final int field26176) {
        this.field26173 = field26173;
        this.field26172 = field26174;
        this.field26175 = field26175;
        this.field26176 = field26176;
    }
    
    public void method20049(final ItemStack class8321, final ItemStack class8322) {
        final int n = class8322.method27690() - class8321.method27690();
        if (n > 0) {
            this.method20050(class8322, n);
        }
    }
    
    public void method20050(final ItemStack class8321, final int n) {
    }
    
    public void method20051(final int n) {
    }
    
    public void method20052(final ItemStack class8321) {
    }
    
    public ItemStack method20047(final Class512 class512, final ItemStack class513) {
        this.method20056();
        return class513;
    }
    
    public boolean method20046(final ItemStack class8321) {
        return true;
    }
    
    public ItemStack method20053() {
        return this.field26173.method2157(this.field26172);
    }
    
    public boolean method20054() {
        return !this.method20053().method27620();
    }
    
    public void method20055(final ItemStack class8321) {
        this.field26173.method2160(this.field26172, class8321);
        this.method20056();
    }
    
    public void method20056() {
        this.field26173.method2161();
    }
    
    public int method20057() {
        return this.field26173.method2254();
    }
    
    public int method20058(final ItemStack class8321) {
        return this.method20057();
    }
    
    @Nullable
    public Pair<Class1932, Class1932> method20059() {
        return null;
    }
    
    public ItemStack method20060(final int n) {
        return this.field26173.method2158(this.field26172, n);
    }
    
    public boolean method20061(final Class512 class512) {
        return true;
    }
    
    public boolean method20062() {
        return true;
    }
}
