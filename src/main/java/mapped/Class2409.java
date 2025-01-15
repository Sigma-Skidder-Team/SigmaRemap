// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;

public class Class2409 extends Class2400
{
    private static String[] field14264;
    private ArrayList field14265;
    private float field14266;
    private float field14267;
    private boolean field14268;
    private ArrayList field14269;
    private ArrayList field14270;
    
    public Class2409(final float field14266, final float field14267) {
        this.field14265 = new ArrayList();
        this.field14269 = new ArrayList();
        this.field14265.add(new float[] { field14266, field14267 });
        this.field14266 = field14266;
        this.field14267 = field14267;
        this.field14221 = true;
    }
    
    public void method9610(final float n, final float n2) {
        this.field14270 = new ArrayList();
        this.field14269.add(this.field14270);
    }
    
    public void method9611(final float field14266, final float field14267) {
        if (this.field14270 == null) {
            this.field14265.add(new float[] { field14266, field14267 });
        }
        else {
            this.field14270.add(new float[] { field14266, field14267 });
        }
        this.field14266 = field14266;
        this.field14267 = field14267;
        this.field14221 = true;
    }
    
    public void method9612() {
        this.field14268 = true;
    }
    
    public void method9613(final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        this.method9614(n, n2, n3, n4, n5, n6, 10);
    }
    
    public void method9614(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final int n7) {
        if (this.field14266 == n && this.field14267 == n2) {
            return;
        }
        final Class2405 class2405 = new Class2405(new Class2412(this.field14266, this.field14267), new Class2412(n3, n4), new Class2412(n5, n6), new Class2412(n, n2));
        final float n8 = 1.0f / n7;
        for (int i = 1; i < n7 + 1; ++i) {
            final Class2412 method9599 = class2405.method9599(i * n8);
            if (this.field14270 == null) {
                this.field14265.add(new float[] { method9599.field14278, method9599.field14279 });
            }
            else {
                this.field14270.add(new float[] { method9599.field14278, method9599.field14279 });
            }
            this.field14266 = method9599.field14278;
            this.field14267 = method9599.field14279;
        }
        this.field14221 = true;
    }
    
    @Override
    public void method9520() {
        this.field14212 = new float[this.field14265.size() * 2];
        for (int i = 0; i < this.field14265.size(); ++i) {
            final float[] array = this.field14265.get(i);
            this.field14212[i * 2] = array[0];
            this.field14212[i * 2 + 1] = array[1];
        }
    }
    
    @Override
    public Class2400 method9519(final Class7310 class7310) {
        final Class2409 class7311 = new Class2409(this.field14266, this.field14267);
        class7311.field14265 = this.method9615(this.field14265, class7310);
        for (int i = 0; i < this.field14269.size(); ++i) {
            class7311.field14269.add(this.method9615((ArrayList)this.field14269.get(i), class7310));
        }
        class7311.field14268 = this.field14268;
        return class7311;
    }
    
    private ArrayList method9615(final ArrayList list, final Class7310 class7310) {
        final float[] array = new float[list.size() * 2];
        final float[] array2 = new float[list.size() * 2];
        for (int i = 0; i < list.size(); ++i) {
            array[i * 2] = ((float[])list.get(i))[0];
            array[i * 2 + 1] = ((float[])list.get(i))[1];
        }
        class7310.method22419(array, 0, array2, 0, list.size());
        final ArrayList list2 = new ArrayList();
        for (int j = 0; j < list.size(); ++j) {
            list2.add(new float[] { array2[j * 2], array2[j * 2 + 1] });
        }
        return list2;
    }
    
    @Override
    public boolean method9554() {
        return this.field14268;
    }
}
