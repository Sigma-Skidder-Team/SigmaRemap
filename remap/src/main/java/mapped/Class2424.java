// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Class2424 implements Class2422
{
    private static String[] field14331;
    private static final double field14332 = 1.0E-5;
    public Class2313 field14333;
    public Class2313 field14334;
    private Class2313 field14335;
    private Class2421 field14336;
    private final List field14337;
    
    public Class2424() {
        this.field14337 = new ArrayList();
        this.field14333 = this.method9741();
    }
    
    @Override
    public void method9735(final float n, final float n2) {
        this.method9739(new Class2412(n, n2));
    }
    
    public void method9738() {
        while (this.field14334 != null) {
            this.field14334 = this.method9742(this.field14334);
        }
        this.field14333.method9420();
        this.field14334 = null;
    }
    
    @Override
    public void method9736() {
        final Class2313 method9741 = this.method9741();
        method9741.field14034 = this.field14334;
        this.field14334 = method9741;
    }
    
    private void method9739(final Class2412 class2412) {
        if (this.field14334 != null) {
            this.field14334.method9421(this.method9743(class2412));
        }
        else {
            this.field14333.method9421(this.method9743(class2412));
        }
    }
    
    private Class2412[] method9740(Class2412[] array) {
        this.field14333.method9422();
        for (Class2313 class2313 = this.field14334; class2313 != null; class2313 = class2313.field14034) {
            class2313.method9422();
        }
        while (this.field14334 != null) {
            Class2421 field14324 = this.field14334.field14033;
        Label_0337:
            while (true) {
                if (field14324.field14327 <= 0.0) {
                    Class2421 field14325 = this.field14333.field14033;
                    while (true) {
                        if (field14324.method9732(field14325)) {
                            if (field14325.method9732(field14324)) {
                                if (!this.field14333.method9423(field14324.field14322, field14325.field14322)) {
                                    Class2313 class2314 = this.field14334;
                                    while (!class2314.method9423(field14324.field14322, field14325.field14322)) {
                                        if ((class2314 = class2314.field14034) != null) {
                                            continue;
                                        }
                                        final Class2421 method9743 = this.method9743(field14325.field14322);
                                        field14325.method9726(method9743);
                                        final Class2421 method9744 = this.method9743(field14324.field14322);
                                        field14324.method9725(method9744);
                                        field14325.field14324 = field14324;
                                        field14324.field14323 = field14325;
                                        method9744.field14324 = method9743;
                                        method9743.field14323 = method9744;
                                        field14325.method9728();
                                        field14324.method9728();
                                        method9743.method9728();
                                        method9744.method9728();
                                        this.field14334.field14033 = null;
                                        break Label_0337;
                                    }
                                }
                            }
                        }
                        if ((field14325 = field14325.field14324) != this.field14333.field14033) {
                            continue;
                        }
                        break;
                    }
                }
                if ((field14324 = field14324.field14324) != this.field14334.field14033) {
                    continue;
                }
                break;
            }
            this.field14334 = this.method9742(this.field14334);
        }
        final int length = (this.field14333.method9424() - 2) * 3 + 1;
        if (array.length < length) {
            array = (Class2412[])Array.newInstance(array.getClass().getComponentType(), length);
        }
        int n = 0;
        while (true) {
            Class2421 class2315 = this.field14333.field14033;
            if (class2315 == null) {
                break;
            }
            if (class2315.field14324 == class2315.field14323) {
                break;
            }
            do {
                if (class2315.field14327 > 0.0) {
                    final Class2421 field14326 = class2315.field14323;
                    final Class2421 field14327 = class2315.field14324;
                    if (field14327.field14324 != field14326) {
                        if (!field14326.method9732(field14327)) {
                            continue;
                        }
                        if (!field14327.method9732(field14326)) {
                            continue;
                        }
                    }
                    if (!this.field14333.method9423(field14326.field14322, field14327.field14322)) {
                        array[n++] = class2315.field14322;
                        array[n++] = field14327.field14322;
                        array[n++] = field14326.field14322;
                        break;
                    }
                }
            } while ((class2315 = class2315.field14324) != this.field14333.field14033);
            final Class2421 field14328 = class2315.field14323;
            final Class2421 field14329 = class2315.field14324;
            this.field14333.field14033 = field14328;
            class2315.method9724();
            this.method9744(class2315);
            field14329.method9728();
            field14328.method9728();
        }
        array[n] = null;
        this.field14333.method9420();
        return array;
    }
    
    private Class2313 method9741() {
        final Class2313 field14335 = this.field14335;
        if (field14335 == null) {
            return new Class2313(this);
        }
        this.field14335 = field14335.field14034;
        field14335.field14034 = null;
        return field14335;
    }
    
    private Class2313 method9742(final Class2313 field14335) {
        final Class2313 field14336 = field14335.field14034;
        field14335.method9420();
        field14335.field14034 = this.field14335;
        this.field14335 = field14335;
        return field14336;
    }
    
    private Class2421 method9743(final Class2412 field14322) {
        final Class2421 field14323 = this.field14336;
        if (field14323 == null) {
            return new Class2421(field14322);
        }
        this.field14336 = field14323.field14324;
        field14323.field14324 = null;
        field14323.field14323 = null;
        field14323.field14322 = field14322;
        return field14323;
    }
    
    private void method9744(final Class2421 field14336) {
        field14336.field14324 = this.field14336;
        this.field14336 = field14336;
    }
    
    private void method9745(final Class2421 field14336) {
        field14336.field14323.field14324 = this.field14336;
        field14336.field14323 = null;
        this.field14336 = field14336;
    }
    
    @Override
    public boolean method9737() {
        final Class2412[] method9740 = this.method9740(new Class2412[0]);
        for (int n = 0; n < method9740.length && method9740[n] != null; ++n) {
            this.field14337.add(method9740[n]);
        }
        return true;
    }
    
    @Override
    public int method9733() {
        return this.field14337.size() / 3;
    }
    
    @Override
    public float[] method9734(final int n, final int n2) {
        final Class2412 class2412 = this.field14337.get(n * 3 + n2);
        return new float[] { class2412.field14278, class2412.field14279 };
    }
}
