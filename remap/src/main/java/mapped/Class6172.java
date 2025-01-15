// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Quaternion;
import net.minecraft.client.renderer.Vector3f;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public abstract class Class6172 extends Class6173
{
    public float field24930;
    
    public Class6172(final World class1847, final double n, final double n2, final double n3) {
        super(class1847, n, n2, n3);
        this.field24930 = 0.1f * (this.field24949.nextFloat() * 0.5f + 0.5f) * 2.0f;
    }
    
    public Class6172(final World class1847, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        super(class1847, n, n2, n3, n4, n5, n6);
        this.field24930 = 0.1f * (this.field24949.nextFloat() * 0.5f + 0.5f) * 2.0f;
    }
    
    @Override
    public void method18432(final Class4150 class4150, final Class6092 class4151, final float n) {
        final Vec3d method18161 = class4151.method18161();
        final float n2 = (float)(MathHelper.method35701(n, this.field24933, this.field24936) - method18161.getX());
        final float n3 = (float)(MathHelper.method35701(n, this.field24934, this.field24937) - method18161.getY());
        final float n4 = (float)(MathHelper.method35701(n, this.field24935, this.field24938) - method18161.getZ());
        Quaternion method18162;
        if (this.field24957 != 0.0f) {
            method18162 = new Quaternion(class4151.method18165());
            method18162.multiply(Vector3f.ZP.rotation(MathHelper.method35700(n, this.field24958, this.field24957)));
        }
        else {
            method18162 = class4151.method18165();
        }
        new Vector3f(-1.0f, -1.0f, 0.0f).transform(method18162);
        final Vector3f[] array = { new Vector3f(-1.0f, -1.0f, 0.0f), new Vector3f(-1.0f, 1.0f, 0.0f), new Vector3f(1.0f, 1.0f, 0.0f), new Vector3f(1.0f, -1.0f, 0.0f) };
        final float method18163 = this.method18430(n);
        for (int i = 0; i < 4; ++i) {
            final Vector3f class4152 = array[i];
            class4152.transform(method18162);
            class4152.mul(method18163);
            class4152.add(n2, n3, n4);
        }
        final float method18164 = this.method18424();
        final float method18165 = this.method18425();
        final float method18166 = this.method18426();
        final float method18167 = this.method18427();
        final int method18168 = this.method18419(n);
        class4150.method12432(array[0].getX(), array[0].getY(), array[0].getZ()).method12391(method18165, method18167).method12439(this.field24953, this.field24954, this.field24955, this.field24956).method12440(method18168).method12397();
        class4150.method12432(array[1].getX(), array[1].getY(), array[1].getZ()).method12391(method18165, method18166).method12439(this.field24953, this.field24954, this.field24955, this.field24956).method12440(method18168).method12397();
        class4150.method12432(array[2].getX(), array[2].getY(), array[2].getZ()).method12391(method18164, method18166).method12439(this.field24953, this.field24954, this.field24955, this.field24956).method12440(method18168).method12397();
        class4150.method12432(array[3].getX(), array[3].getY(), array[3].getZ()).method12391(method18164, method18167).method12439(this.field24953, this.field24954, this.field24955, this.field24956).method12440(method18168).method12397();
    }
    
    public float method18430(final float n) {
        return this.field24930;
    }
    
    @Override
    public Class6173 method18433(final float n) {
        this.field24930 *= n;
        return super.method18433(n);
    }
    
    public abstract float method18424();
    
    public abstract float method18425();
    
    public abstract float method18426();
    
    public abstract float method18427();
}
