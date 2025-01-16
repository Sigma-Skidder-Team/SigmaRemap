// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Class8040
{
    private static String[] field33103;
    private List<Class8754> field33104;
    private List<BlockState> field33105;
    private List<Class8754> field33106;
    
    public Class8040() {
        this.field33104 = new ArrayList<Class8754>();
        this.field33105 = new ArrayList<BlockState>();
        this.field33106 = Arrays.asList(new Class8754[0]);
    }
    
    public void method26376(final Class8754 class8754, final BlockState class8755) {
        if (class8754 != null) {
            this.field33104.add(class8754);
            this.field33105.add(class8755);
        }
    }
    
    public int method26377() {
        return this.field33104.size();
    }
    
    public Class8754 method26378(final int n) {
        return this.field33104.get(n);
    }
    
    public BlockState method26379(final int n) {
        return (n >= 0 && n < this.field33105.size()) ? this.field33105.get(n) : Blocks.AIR.getDefaultState();
    }
    
    public List<Class8754> method26380(final Class8754 class8754) {
        this.field33106.set(0, class8754);
        return this.field33106;
    }
    
    public void method26381() {
        this.field33104.clear();
        this.field33105.clear();
    }
}
