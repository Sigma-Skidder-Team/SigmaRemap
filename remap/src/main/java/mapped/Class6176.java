// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class Class6176 extends Class6175
{
    private int field24967;
    private final Class1793 field24968;
    private ListNBT field24969;
    private boolean field24970;
    
    public Class6176(final World class1847, final double n, final double n2, final double n3, final double field24939, final double field24940, final double field24941, final Class1793 field24942, final CompoundNBT class1848) {
        super(class1847, n, n2, n3);
        this.field24939 = field24939;
        this.field24940 = field24940;
        this.field24941 = field24941;
        this.field24968 = field24942;
        this.field24951 = 8;
        if (class1848 != null) {
            this.field24969 = class1848.getList("Explosions", 10);
            if (!this.field24969.isEmpty()) {
                this.field24951 = this.field24969.size() * 2 - 1;
                for (int i = 0; i < this.field24969.size(); ++i) {
                    if (this.field24969.method346(i).getBoolean("Flicker")) {
                        this.field24970 = true;
                        this.field24951 += 15;
                        break;
                    }
                }
            }
            else {
                this.field24969 = null;
            }
        }
    }
    
    @Override
    public void method18420() {
        if (this.field24967 == 0 && this.field24969 != null) {
            final boolean method18447 = this.method18447();
            boolean b = false;
            if (this.field24969.size() >= 3) {
                b = true;
            }
            else {
                for (int i = 0; i < this.field24969.size(); ++i) {
                    if (Class2141.method8302(this.field24969.method346(i).getByte("Type")) == Class2141.field12606) {
                        b = true;
                        break;
                    }
                }
            }
            Class7795 class7795;
            if (b) {
                class7795 = (method18447 ? Class8520.field35193 : Class8520.field35192);
            }
            else {
                class7795 = (method18447 ? Class8520.field35191 : Class8520.field35190);
            }
            this.field24932.method6708(this.field24936, this.field24937, this.field24938, class7795, Class286.field1586, 20.0f, 0.95f + this.field24949.nextFloat() * 0.1f, true);
        }
        if (this.field24967 % 2 == 0 && this.field24969 != null && this.field24967 / 2 < this.field24969.size()) {
            final CompoundNBT method18448 = this.field24969.method346(this.field24967 / 2);
            final Class2141 method18449 = Class2141.method8302(method18448.getByte("Type"));
            final boolean method18450 = method18448.getBoolean("Trail");
            final boolean method18451 = method18448.getBoolean("Flicker");
            int[] method18452 = method18448.getIntArray("Colors");
            final int[] method18453 = method18448.getIntArray("FadeColors");
            if (method18452.length == 0) {
                method18452 = new int[] { Class181.field552.method817() };
            }
            switch (Class7903.field32445[method18449.ordinal()]) {
                default: {
                    this.method18449(0.25, 2, method18452, method18453, method18450, method18451);
                    break;
                }
                case 2: {
                    this.method18449(0.5, 4, method18452, method18453, method18450, method18451);
                    break;
                }
                case 3: {
                    this.method18450(0.5, new double[][] { { 0.0, 1.0 }, { 0.3455, 0.309 }, { 0.9511, 0.309 }, { 0.3795918367346939, -0.12653061224489795 }, { 0.6122448979591837, -0.8040816326530612 }, { 0.0, -0.35918367346938773 } }, method18452, method18453, method18450, method18451, false);
                    break;
                }
                case 4: {
                    this.method18450(0.5, new double[][] { { 0.0, 0.2 }, { 0.2, 0.2 }, { 0.2, 0.6 }, { 0.6, 0.6 }, { 0.6, 0.2 }, { 0.2, 0.2 }, { 0.2, 0.0 }, { 0.4, 0.0 }, { 0.4, -0.6 }, { 0.2, -0.6 }, { 0.2, -0.4 }, { 0.0, -0.4 } }, method18452, method18453, method18450, method18451, true);
                    break;
                }
                case 5: {
                    this.method18451(method18452, method18453, method18450, method18451);
                    break;
                }
            }
            final int n = method18452[0];
            this.field24968.method6478(Class8432.field34624, this.field24936, this.field24937, this.field24938, 0.0, 0.0, 0.0).method18435(((n & 0xFF0000) >> 16) / 255.0f, ((n & 0xFF00) >> 8) / 255.0f, ((n & 0xFF) >> 0) / 255.0f);
        }
        ++this.field24967;
        if (this.field24967 > this.field24951) {
            if (this.field24970) {
                this.field24932.method6708(this.field24936, this.field24937, this.field24938, this.method18447() ? Class8520.field35197 : Class8520.field35196, Class286.field1586, 20.0f, 0.9f + this.field24949.nextFloat() * 0.15f, true);
            }
            this.method18439();
        }
    }
    
    private boolean method18447() {
        return Minecraft.method5277().field4644.method5833().method18161().squareDistanceTo(this.field24936, this.field24937, this.field24938) >= 256.0;
    }
    
    private void method18448(final double n, final double n2, final double n3, final double n4, final double n5, final double n6, final int[] array, final int[] array2, final boolean b, final boolean b2) {
        final Class6201 class6201 = (Class6201)this.field24968.method6478(Class8432.field34621, n, n2, n3, n4, n5, n6);
        class6201.method18458(b);
        class6201.method18459(b2);
        class6201.method18436(0.99f);
        class6201.method18455(array[this.field24949.nextInt(array.length)]);
        if (array2.length > 0) {
            class6201.method18456(array2[this.field24949.nextInt(array2.length)]);
        }
    }
    
    private void method18449(final double n, final int n2, final int[] array, final int[] array2, final boolean b, final boolean b2) {
        final double field24936 = this.field24936;
        final double field24937 = this.field24937;
        final double field24938 = this.field24938;
        for (int i = -n2; i <= n2; ++i) {
            for (int j = -n2; j <= n2; ++j) {
                for (int k = -n2; k <= n2; ++k) {
                    final double n3 = j + (this.field24949.nextDouble() - this.field24949.nextDouble()) * 0.5;
                    final double n4 = i + (this.field24949.nextDouble() - this.field24949.nextDouble()) * 0.5;
                    final double n5 = k + (this.field24949.nextDouble() - this.field24949.nextDouble()) * 0.5;
                    final double n6 = MathHelper.sqrt(n3 * n3 + n4 * n4 + n5 * n5) / n + this.field24949.nextGaussian() * 0.05;
                    this.method18448(field24936, field24937, field24938, n3 / n6, n4 / n6, n5 / n6, array, array2, b, b2);
                    if (i != -n2) {
                        if (i != n2) {
                            if (j != -n2) {
                                if (j != n2) {
                                    k += n2 * 2 - 1;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    private void method18450(final double n, final double[][] array, final int[] array2, final int[] array3, final boolean b, final boolean b2, final boolean b3) {
        final double n2 = array[0][0];
        final double n3 = array[0][1];
        this.method18448(this.field24936, this.field24937, this.field24938, n2 * n, n3 * n, 0.0, array2, array3, b, b2);
        final float n4 = this.field24949.nextFloat() * 3.1415927f;
        final double n5 = b3 ? 0.034 : 0.34;
        for (int i = 0; i < 3; ++i) {
            final double n6 = n4 + i * 3.1415927f * n5;
            double n7 = n2;
            double n8 = n3;
            for (int j = 1; j < array.length; ++j) {
                final double n9 = array[j][0];
                final double n10 = array[j][1];
                for (double n11 = 0.25; n11 <= 1.0; n11 += 0.25) {
                    final double n12 = MathHelper.lerp(n11, n7, n9) * n;
                    final double n13 = MathHelper.lerp(n11, n8, n10) * n;
                    final double n14 = n12 * Math.sin(n6);
                    final double n15 = n12 * Math.cos(n6);
                    for (double n16 = -1.0; n16 <= 1.0; n16 += 2.0) {
                        this.method18448(this.field24936, this.field24937, this.field24938, n15 * n16, n13, n14 * n16, array2, array3, b, b2);
                    }
                }
                n7 = n9;
                n8 = n10;
            }
        }
    }
    
    private void method18451(final int[] array, final int[] array2, final boolean b, final boolean b2) {
        final double n = this.field24949.nextGaussian() * 0.05;
        final double n2 = this.field24949.nextGaussian() * 0.05;
        for (int i = 0; i < 70; ++i) {
            this.method18448(this.field24936, this.field24937, this.field24938, this.field24939 * 0.5 + this.field24949.nextGaussian() * 0.15 + n, this.field24940 * 0.5 + this.field24949.nextDouble() * 0.5, this.field24941 * 0.5 + this.field24949.nextGaussian() * 0.15 + n2, array, array2, b, b2);
        }
    }
}
