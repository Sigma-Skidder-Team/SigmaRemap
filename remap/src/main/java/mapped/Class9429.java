// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;

import net.minecraft.util.math.MathHelper;
import org.apache.commons.lang3.tuple.Triple;
import com.mojang.datafixers.util.Pair;

public final class Class9429
{
    private static final float field40438;
    private static final float field40439;
    private static final float field40440;
    private static final float field40441;
    public float field40442;
    public float field40443;
    public float field40444;
    public float field40445;
    public float field40446;
    public float field40447;
    public float field40448;
    public float field40449;
    public float field40450;
    
    public Class9429() {
    }
    
    public Class9429(final Quaternion class9389) {
        final float method34899 = class9389.method34899();
        final float method34900 = class9389.method34900();
        final float method34901 = class9389.method34901();
        final float method34902 = class9389.method34902();
        final float n = 2.0f * method34899 * method34899;
        final float n2 = 2.0f * method34900 * method34900;
        final float n3 = 2.0f * method34901 * method34901;
        this.field40442 = 1.0f - n2 - n3;
        this.field40446 = 1.0f - n3 - n;
        this.field40450 = 1.0f - n - n2;
        final float n4 = method34899 * method34900;
        final float n5 = method34900 * method34901;
        final float n6 = method34901 * method34899;
        final float n7 = method34899 * method34902;
        final float n8 = method34900 * method34902;
        final float n9 = method34901 * method34902;
        this.field40445 = 2.0f * (n4 + n9);
        this.field40443 = 2.0f * (n4 - n9);
        this.field40448 = 2.0f * (n6 - n8);
        this.field40444 = 2.0f * (n6 + n8);
        this.field40449 = 2.0f * (n5 + n7);
        this.field40447 = 2.0f * (n5 - n7);
    }
    
    public static Class9429 method35032(final float field40442, final float field40443, final float field40444) {
        final Class9429 class9429 = new Class9429();
        class9429.field40442 = field40442;
        class9429.field40446 = field40443;
        class9429.field40450 = field40444;
        return class9429;
    }
    
    public Class9429(final Class6789 class6789) {
        this.field40442 = class6789.field26689;
        this.field40443 = class6789.field26690;
        this.field40444 = class6789.field26691;
        this.field40445 = class6789.field26693;
        this.field40446 = class6789.field26694;
        this.field40447 = class6789.field26695;
        this.field40448 = class6789.field26697;
        this.field40449 = class6789.field26698;
        this.field40450 = class6789.field26699;
    }
    
    public Class9429(final Class9429 class9429) {
        this.field40442 = class9429.field40442;
        this.field40443 = class9429.field40443;
        this.field40444 = class9429.field40444;
        this.field40445 = class9429.field40445;
        this.field40446 = class9429.field40446;
        this.field40447 = class9429.field40447;
        this.field40448 = class9429.field40448;
        this.field40449 = class9429.field40449;
        this.field40450 = class9429.field40450;
    }
    
    private static Pair<Float, Float> method35033(final float n, final float n2, final float n3) {
        final float n4 = 2.0f * (n - n3);
        if (Class9429.field40438 * n2 * n2 >= n4 * n4) {
            return (Pair<Float, Float>)Pair.of((Object)Class9429.field40440, (Object)Class9429.field40439);
        }
        final float method35694 = MathHelper.method35694(n2 * n2 + n4 * n4);
        return (Pair<Float, Float>)Pair.of((Object)(method35694 * n2), (Object)(method35694 * n4));
    }
    
    private static Pair<Float, Float> method35034(final float a, final float n) {
        final float a2 = (float)Math.hypot(a, n);
        float n2 = (a2 <= 1.0E-6f) ? 0.0f : n;
        float n3 = Math.abs(a) + Math.max(a2, 1.0E-6f);
        if (a < 0.0f) {
            final float n4 = n2;
            n2 = n3;
            n3 = n4;
        }
        final float method35694 = MathHelper.method35694(n3 * n3 + n2 * n2);
        return (Pair<Float, Float>)Pair.of((Object)(n2 * method35694), (Object)(n3 * method35694));
    }
    
    private static Quaternion method35035(final Class9429 class9429) {
        final Class9429 class9430 = new Class9429();
        final Quaternion method34910 = Quaternion.ONE.copy();
        if (class9429.field40443 * class9429.field40443 + class9429.field40445 * class9429.field40445 > 1.0E-6f) {
            final Pair<Float, Float> method34911 = method35033(class9429.field40442, 0.5f * (class9429.field40443 + class9429.field40445), class9429.field40446);
            final Float n = (Float)method34911.getFirst();
            final Float n2 = (Float)method34911.getSecond();
            final Quaternion class9431 = new Quaternion(0.0f, 0.0f, n, n2);
            final float n3 = n2 * n2 - n * n;
            final float field40443 = -2.0f * n * n2;
            final float field40444 = n2 * n2 + n * n;
            method34910.multiply(class9431);
            class9430.method35039();
            class9430.field40442 = n3;
            class9430.field40446 = n3;
            class9430.field40445 = -field40443;
            class9430.field40443 = field40443;
            class9430.field40450 = field40444;
            class9429.method35042(class9430);
            class9430.method35036();
            class9430.method35042(class9429);
            class9429.method35038(class9430);
        }
        if (class9429.field40444 * class9429.field40444 + class9429.field40448 * class9429.field40448 > 1.0E-6f) {
            final Pair<Float, Float> method34912 = method35033(class9429.field40442, 0.5f * (class9429.field40444 + class9429.field40448), class9429.field40450);
            final float n4 = -(float)method34912.getFirst();
            final Float n5 = (Float)method34912.getSecond();
            final Quaternion class9432 = new Quaternion(0.0f, n4, 0.0f, n5);
            final float n6 = n5 * n5 - n4 * n4;
            final float field40445 = -2.0f * n4 * n5;
            final float field40446 = n5 * n5 + n4 * n4;
            method34910.multiply(class9432);
            class9430.method35039();
            class9430.field40442 = n6;
            class9430.field40450 = n6;
            class9430.field40448 = field40445;
            class9430.field40444 = -field40445;
            class9430.field40446 = field40446;
            class9429.method35042(class9430);
            class9430.method35036();
            class9430.method35042(class9429);
            class9429.method35038(class9430);
        }
        if (class9429.field40447 * class9429.field40447 + class9429.field40449 * class9429.field40449 > 1.0E-6f) {
            final Pair<Float, Float> method34913 = method35033(class9429.field40446, 0.5f * (class9429.field40447 + class9429.field40449), class9429.field40450);
            final Float n7 = (Float)method34913.getFirst();
            final Float n8 = (Float)method34913.getSecond();
            final Quaternion class9433 = new Quaternion(n7, 0.0f, 0.0f, n8);
            final float n9 = n8 * n8 - n7 * n7;
            final float field40447 = -2.0f * n7 * n8;
            final float field40448 = n8 * n8 + n7 * n7;
            method34910.multiply(class9433);
            class9430.method35039();
            class9430.field40446 = n9;
            class9430.field40450 = n9;
            class9430.field40449 = -field40447;
            class9430.field40447 = field40447;
            class9430.field40442 = field40448;
            class9429.method35042(class9430);
            class9430.method35036();
            class9430.method35042(class9429);
            class9429.method35038(class9430);
        }
        return method34910;
    }
    
    public void method35036() {
        final float field40443 = this.field40443;
        this.field40443 = this.field40445;
        this.field40445 = field40443;
        final float field40444 = this.field40444;
        this.field40444 = this.field40448;
        this.field40448 = field40444;
        final float field40445 = this.field40447;
        this.field40447 = this.field40449;
        this.field40449 = field40445;
    }
    
    public Triple<Quaternion, Vector3f, Quaternion> method35037() {
        final Quaternion method34910 = Quaternion.ONE.copy();
        final Quaternion method34911 = Quaternion.ONE.copy();
        final Class9429 method34912 = this.method35045();
        method34912.method35036();
        method34912.method35042(this);
        for (int i = 0; i < 5; ++i) {
            method34911.multiply(method35035(method34912));
        }
        method34911.method34909();
        final Class9429 class9429 = new Class9429(this);
        class9429.method35042(new Class9429(method34911));
        final float n = 1.0f;
        final Pair<Float, Float> method34913 = method35034(class9429.field40442, class9429.field40445);
        final Float n2 = (Float)method34913.getFirst();
        final Float n3 = (Float)method34913.getSecond();
        final float n4 = n3 * n3 - n2 * n2;
        final float field40445 = -2.0f * n2 * n3;
        final float field40446 = n3 * n3 + n2 * n2;
        method34910.multiply(new Quaternion(0.0f, 0.0f, n2, n3));
        final Class9429 class9430 = new Class9429();
        class9430.method35039();
        class9430.field40442 = n4;
        class9430.field40446 = n4;
        class9430.field40445 = field40445;
        class9430.field40443 = -field40445;
        class9430.field40450 = field40446;
        final float n5 = n * field40446;
        class9430.method35042(class9429);
        final Pair<Float, Float> method34914 = method35034(class9430.field40442, class9430.field40448);
        final float n6 = -(float)method34914.getFirst();
        final Float n7 = (Float)method34914.getSecond();
        final float n8 = n7 * n7 - n6 * n6;
        final float field40447 = -2.0f * n6 * n7;
        final float field40448 = n7 * n7 + n6 * n6;
        method34910.multiply(new Quaternion(0.0f, n6, 0.0f, n7));
        final Class9429 class9431 = new Class9429();
        class9431.method35039();
        class9431.field40442 = n8;
        class9431.field40450 = n8;
        class9431.field40448 = -field40447;
        class9431.field40444 = field40447;
        class9431.field40446 = field40448;
        final float n9 = n5 * field40448;
        class9431.method35042(class9430);
        final Pair<Float, Float> method34915 = method35034(class9431.field40446, class9431.field40449);
        final Float n10 = (Float)method34915.getFirst();
        final Float n11 = (Float)method34915.getSecond();
        final float n12 = n11 * n11 - n10 * n10;
        final float field40449 = -2.0f * n10 * n11;
        final float field40450 = n11 * n11 + n10 * n10;
        method34910.multiply(new Quaternion(n10, 0.0f, 0.0f, n11));
        final Class9429 class9432 = new Class9429();
        class9432.method35039();
        class9432.field40446 = n12;
        class9432.field40450 = n12;
        class9432.field40449 = field40449;
        class9432.field40447 = -field40449;
        class9432.field40442 = field40450;
        final float n13 = n9 * field40450;
        class9432.method35042(class9431);
        final float n14 = 1.0f / n13;
        method34910.method34904((float)Math.sqrt(n14));
        return (Triple<Quaternion, Vector3f, Quaternion>)Triple.of((Object)method34910, (Object)new Vector3f(class9432.field40442 * n14, class9432.field40446 * n14, class9432.field40450 * n14), (Object)method34911);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final Class9429 class9429 = (Class9429)o;
            if (Float.compare(class9429.field40442, this.field40442) == 0) {
                if (Float.compare(class9429.field40443, this.field40443) == 0) {
                    if (Float.compare(class9429.field40444, this.field40444) == 0) {
                        if (Float.compare(class9429.field40445, this.field40445) == 0) {
                            if (Float.compare(class9429.field40446, this.field40446) == 0) {
                                if (Float.compare(class9429.field40447, this.field40447) == 0) {
                                    if (Float.compare(class9429.field40448, this.field40448) == 0) {
                                        if (Float.compare(class9429.field40449, this.field40449) == 0) {
                                            if (Float.compare(class9429.field40450, this.field40450) == 0) {
                                                return true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * ((this.field40442 == 0.0f) ? 0 : Float.floatToIntBits(this.field40442)) + ((this.field40443 == 0.0f) ? 0 : Float.floatToIntBits(this.field40443))) + ((this.field40444 == 0.0f) ? 0 : Float.floatToIntBits(this.field40444))) + ((this.field40445 == 0.0f) ? 0 : Float.floatToIntBits(this.field40445))) + ((this.field40446 == 0.0f) ? 0 : Float.floatToIntBits(this.field40446))) + ((this.field40447 == 0.0f) ? 0 : Float.floatToIntBits(this.field40447))) + ((this.field40448 == 0.0f) ? 0 : Float.floatToIntBits(this.field40448))) + ((this.field40449 == 0.0f) ? 0 : Float.floatToIntBits(this.field40449))) + ((this.field40450 == 0.0f) ? 0 : Float.floatToIntBits(this.field40450));
    }
    
    public void method35038(final Class9429 class9429) {
        this.field40442 = class9429.field40442;
        this.field40443 = class9429.field40443;
        this.field40444 = class9429.field40444;
        this.field40445 = class9429.field40445;
        this.field40446 = class9429.field40446;
        this.field40447 = class9429.field40447;
        this.field40448 = class9429.field40448;
        this.field40449 = class9429.field40449;
        this.field40450 = class9429.field40450;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Matrix3f:\n");
        sb.append(this.field40442);
        sb.append(" ");
        sb.append(this.field40443);
        sb.append(" ");
        sb.append(this.field40444);
        sb.append("\n");
        sb.append(this.field40445);
        sb.append(" ");
        sb.append(this.field40446);
        sb.append(" ");
        sb.append(this.field40447);
        sb.append("\n");
        sb.append(this.field40448);
        sb.append(" ");
        sb.append(this.field40449);
        sb.append(" ");
        sb.append(this.field40450);
        sb.append("\n");
        return sb.toString();
    }
    
    public void method35039() {
        this.field40442 = 1.0f;
        this.field40443 = 0.0f;
        this.field40444 = 0.0f;
        this.field40445 = 0.0f;
        this.field40446 = 1.0f;
        this.field40447 = 0.0f;
        this.field40448 = 0.0f;
        this.field40449 = 0.0f;
        this.field40450 = 1.0f;
    }
    
    public float method35040() {
        final float field40442 = this.field40446 * this.field40450 - this.field40447 * this.field40449;
        final float field40443 = -(this.field40445 * this.field40450 - this.field40447 * this.field40448);
        final float field40444 = this.field40445 * this.field40449 - this.field40446 * this.field40448;
        final float field40445 = -(this.field40443 * this.field40450 - this.field40444 * this.field40449);
        final float field40446 = this.field40442 * this.field40450 - this.field40444 * this.field40448;
        final float field40447 = -(this.field40442 * this.field40449 - this.field40443 * this.field40448);
        final float field40448 = this.field40443 * this.field40447 - this.field40444 * this.field40446;
        final float field40449 = -(this.field40442 * this.field40447 - this.field40444 * this.field40445);
        final float field40450 = this.field40442 * this.field40446 - this.field40443 * this.field40445;
        final float n = this.field40442 * field40442 + this.field40443 * field40443 + this.field40444 * field40444;
        this.field40442 = field40442;
        this.field40445 = field40443;
        this.field40448 = field40444;
        this.field40443 = field40445;
        this.field40446 = field40446;
        this.field40449 = field40447;
        this.field40444 = field40448;
        this.field40447 = field40449;
        this.field40450 = field40450;
        return n;
    }
    
    public boolean method35041() {
        final float method35040 = this.method35040();
        if (Math.abs(method35040) <= 1.0E-6f) {
            return false;
        }
        this.method35044(method35040);
        return true;
    }
    
    public void method35042(final Class9429 class9429) {
        final float field40442 = this.field40442 * class9429.field40442 + this.field40443 * class9429.field40445 + this.field40444 * class9429.field40448;
        final float field40443 = this.field40442 * class9429.field40443 + this.field40443 * class9429.field40446 + this.field40444 * class9429.field40449;
        final float field40444 = this.field40442 * class9429.field40444 + this.field40443 * class9429.field40447 + this.field40444 * class9429.field40450;
        final float field40445 = this.field40445 * class9429.field40442 + this.field40446 * class9429.field40445 + this.field40447 * class9429.field40448;
        final float field40446 = this.field40445 * class9429.field40443 + this.field40446 * class9429.field40446 + this.field40447 * class9429.field40449;
        final float field40447 = this.field40445 * class9429.field40444 + this.field40446 * class9429.field40447 + this.field40447 * class9429.field40450;
        final float field40448 = this.field40448 * class9429.field40442 + this.field40449 * class9429.field40445 + this.field40450 * class9429.field40448;
        final float field40449 = this.field40448 * class9429.field40443 + this.field40449 * class9429.field40446 + this.field40450 * class9429.field40449;
        final float field40450 = this.field40448 * class9429.field40444 + this.field40449 * class9429.field40447 + this.field40450 * class9429.field40450;
        this.field40442 = field40442;
        this.field40443 = field40443;
        this.field40444 = field40444;
        this.field40445 = field40445;
        this.field40446 = field40446;
        this.field40447 = field40447;
        this.field40448 = field40448;
        this.field40449 = field40449;
        this.field40450 = field40450;
    }
    
    public void method35043(final Quaternion class9389) {
        final float method34899 = class9389.method34899();
        final float method34900 = class9389.method34900();
        final float method34901 = class9389.method34901();
        final float method34902 = class9389.method34902();
        final float n = 2.0f * method34899 * method34899;
        final float n2 = 2.0f * method34900 * method34900;
        final float n3 = 2.0f * method34901 * method34901;
        final float n4 = method34899 * method34900;
        final float n5 = method34900 * method34901;
        final float n6 = method34901 * method34899;
        final float n7 = method34899 * method34902;
        final float n8 = method34900 * method34902;
        final float n9 = method34901 * method34902;
        final float n10 = 1.0f - n2 - n3;
        final float n11 = 2.0f * (n4 - n9);
        final float n12 = 2.0f * (n6 + n8);
        final float n13 = 2.0f * (n4 + n9);
        final float n14 = 1.0f - n3 - n;
        final float n15 = 2.0f * (n5 - n7);
        final float n16 = 2.0f * (n6 - n8);
        final float n17 = 2.0f * (n5 + n7);
        final float n18 = 1.0f - n - n2;
        final float field40442 = this.field40442 * n10 + this.field40443 * n13 + this.field40444 * n16;
        final float field40443 = this.field40442 * n11 + this.field40443 * n14 + this.field40444 * n17;
        final float field40444 = this.field40442 * n12 + this.field40443 * n15 + this.field40444 * n18;
        final float field40445 = this.field40445 * n10 + this.field40446 * n13 + this.field40447 * n16;
        final float field40446 = this.field40445 * n11 + this.field40446 * n14 + this.field40447 * n17;
        final float field40447 = this.field40445 * n12 + this.field40446 * n15 + this.field40447 * n18;
        final float field40448 = this.field40448 * n10 + this.field40449 * n13 + this.field40450 * n16;
        final float field40449 = this.field40448 * n11 + this.field40449 * n14 + this.field40450 * n17;
        final float field40450 = this.field40448 * n12 + this.field40449 * n15 + this.field40450 * n18;
        this.field40442 = field40442;
        this.field40443 = field40443;
        this.field40444 = field40444;
        this.field40445 = field40445;
        this.field40446 = field40446;
        this.field40447 = field40447;
        this.field40448 = field40448;
        this.field40449 = field40449;
        this.field40450 = field40450;
    }
    
    public void method35044(final float n) {
        this.field40442 *= n;
        this.field40443 *= n;
        this.field40444 *= n;
        this.field40445 *= n;
        this.field40446 *= n;
        this.field40447 *= n;
        this.field40448 *= n;
        this.field40449 *= n;
        this.field40450 *= n;
    }
    
    public Class9429 method35045() {
        return new Class9429(this);
    }
    
    public float method35046(final float n, final float n2, final float n3) {
        return this.field40442 * n + this.field40443 * n2 + this.field40444 * n3;
    }
    
    public float method35047(final float n, final float n2, final float n3) {
        return this.field40445 * n + this.field40446 * n2 + this.field40447 * n3;
    }
    
    public float method35048(final float n, final float n2, final float n3) {
        return this.field40448 * n + this.field40449 * n2 + this.field40450 * n3;
    }
    
    public void method35049(final Random random) {
        this.field40442 = random.nextFloat();
        this.field40443 = random.nextFloat();
        this.field40444 = random.nextFloat();
        this.field40445 = random.nextFloat();
        this.field40446 = random.nextFloat();
        this.field40447 = random.nextFloat();
        this.field40448 = random.nextFloat();
        this.field40449 = random.nextFloat();
        this.field40450 = random.nextFloat();
    }
    
    public void method35050(final Class9429 class9429) {
        final Class9429 method35045 = class9429.method35045();
        method35045.method35042(this);
        this.method35038(method35045);
    }
    
    static {
        field40438 = 3.0f + 2.0f * (float)Math.sqrt(2.0);
        field40439 = (float)Math.cos(0.39269908169872414);
        field40440 = (float)Math.sin(0.39269908169872414);
        field40441 = 1.0f / (float)Math.sqrt(2.0);
    }
}
