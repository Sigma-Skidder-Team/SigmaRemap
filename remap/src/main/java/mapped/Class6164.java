// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.world.World;

import java.util.Random;

public class Class6164 extends Class6159
{
    private static String[] field24918;
    private static final Random field24919;
    private final Class7805 field24920;
    
    private Class6164(final World class1847, final double n, final double n2, final double n3, final double n4, final double n5, final double n6, final Class7805 field24920) {
        super(class1847, n, n2, n3, 0.5 - Class6164.field24919.nextDouble(), n5, 0.5 - Class6164.field24919.nextDouble());
        this.field24920 = field24920;
        this.field24940 *= 0.20000000298023224;
        if (n4 == 0.0) {
            if (n6 == 0.0) {
                this.field24939 *= 0.10000000149011612;
                this.field24941 *= 0.10000000149011612;
            }
        }
        this.field24930 *= 0.75f;
        this.field24951 = (int)(8.0 / (Math.random() * 0.8 + 0.2));
        this.field24944 = false;
        this.method18429(field24920);
    }
    
    @Override
    public Class6451 method18418() {
        return Class6451.field25660;
    }
    
    @Override
    public void method18420() {
        this.field24933 = this.field24936;
        this.field24934 = this.field24937;
        this.field24935 = this.field24938;
        if (this.field24950++ < this.field24951) {
            this.method18429(this.field24920);
            this.field24940 += 0.004;
            this.method18431(this.field24939, this.field24940, this.field24941);
            if (this.field24937 == this.field24934) {
                this.field24939 *= 1.1;
                this.field24941 *= 1.1;
            }
            this.field24939 *= 0.9599999785423279;
            this.field24940 *= 0.9599999785423279;
            this.field24941 *= 0.9599999785423279;
            if (this.field24943) {
                this.field24939 *= 0.699999988079071;
                this.field24941 *= 0.699999988079071;
            }
        }
        else {
            this.method18439();
        }
    }
    
    static {
        field24919 = new Random();
    }
}
