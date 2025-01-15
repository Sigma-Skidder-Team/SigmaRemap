// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

public class Class6274 extends Class6257
{
    private static final String[] field25137;
    private static final int[] field25138;
    private static final int[] field25139;
    private static final int[] field25140;
    public final int field25141;
    
    public Class6274(final Class2233 class2233, final int field25141, final Class2215... array) {
        super(class2233, Class242.field1196, array);
        this.field25141 = field25141;
    }
    
    @Override
    public int method18586(final int n) {
        return Class6274.field25138[this.field25141] + (n - 1) * Class6274.field25139[this.field25141];
    }
    
    @Override
    public int method18587(final int n) {
        return this.method18586(n) + Class6274.field25140[this.field25141];
    }
    
    @Override
    public int method18588() {
        return 5;
    }
    
    @Override
    public float method18595(final int n, final Class6363 class6363) {
        if (this.field25141 == 0) {
            return 1.0f + Math.max(0, n - 1) * 0.5f;
        }
        if (this.field25141 == 1 && class6363 == Class6363.field25461) {
            return n * 2.5f;
        }
        return (this.field25141 == 2 && class6363 == Class6363.field25462) ? (n * 2.5f) : 0.0f;
    }
    
    @Override
    public boolean method18589(final Class6257 class6257) {
        return !(class6257 instanceof Class6274);
    }
    
    @Override
    public boolean method18600(final Class8321 class8321) {
        return class8321.method27622() instanceof Class4075 || super.method18600(class8321);
    }
    
    @Override
    public void method18601(final Class511 class511, final Entity class512, final int n) {
        if (class512 instanceof Class511) {
            final Class511 class513 = (Class511)class512;
            if (this.field25141 == 2) {
                if (class513.method2712() == Class6363.field25462) {
                    class513.method2655(new Class1948(Class9439.field40475, 20 + class511.method2633().nextInt(10 * n), 3));
                }
            }
        }
    }
    
    static {
        field25137 = new String[] { "all", "undead", "arthropods" };
        field25138 = new int[] { 1, 5, 5 };
        field25139 = new int[] { 11, 8, 8 };
        field25140 = new int[] { 20, 20, 20 };
    }
}
