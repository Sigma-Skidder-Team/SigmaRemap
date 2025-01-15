// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

import java.io.IOException;

public class Class4370 implements Class4252<Class5800>
{
    public int field19569;
    public short field19570;
    public short field19571;
    public short field19572;
    public byte field19573;
    public byte field19574;
    public boolean field19575;
    public boolean field19576;
    public boolean field19577;
    
    public static long method13140(final double n) {
        return MathHelper.method35645(n * 4096.0);
    }
    
    public static Class5487 method13141(final long n, final long n2, final long n3) {
        return new Class5487((double)n, (double)n2, (double)n3).method16748(2.44140625E-4);
    }
    
    public Class4370() {
    }
    
    public Class4370(final int field19569) {
        this.field19569 = field19569;
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19569 = class8654.method29501();
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.method29505(this.field19569);
    }
    
    public void method12764(final Class5800 class5800) {
        class5800.method17282(this);
    }
    
    @Override
    public String toString() {
        return "Entity_" + super.toString();
    }
    
    public Entity method13142(final Class1847 class1847) {
        return class1847.method6741(this.field19569);
    }
    
    public short method13143() {
        return this.field19570;
    }
    
    public short method13144() {
        return this.field19571;
    }
    
    public short method13145() {
        return this.field19572;
    }
    
    public byte method13146() {
        return this.field19573;
    }
    
    public byte method13147() {
        return this.field19574;
    }
    
    public boolean method13148() {
        return this.field19576;
    }
    
    public boolean method13149() {
        return this.field19577;
    }
    
    public boolean method13150() {
        return this.field19575;
    }
}
