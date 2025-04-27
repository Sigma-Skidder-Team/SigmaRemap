// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class Class5883<T extends Entity> extends Class5846<T>
{
    private static String[] field24135;
    private final Class6300 field24136;
    private final Class6300 field24137;
    private final Class6300 field24138;
    private final Class6300 field24139;
    private final Class6300 field24140;
    private final Class6300 field24141;
    private final Class6300 field24142;
    private final Class6300 field24143;
    private final Class6300 field24144;
    private final Class6300 field24145;
    private final Class6300 field24146;
    
    public Class5883() {
        this.field24269 = 32;
        this.field24270 = 32;
        (this.field24136 = new Class6300(this, 12, 22)).method18636(-2.5f, -5.0f, -2.5f, 5.0f, 5.0f, 5.0f);
        this.field24136.method18642(0.0f, 22.0f, 0.0f);
        (this.field24137 = new Class6300(this, 24, 0)).method18636(-2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 2.0f);
        this.field24137.method18642(-2.5f, 17.0f, -1.5f);
        (this.field24138 = new Class6300(this, 24, 3)).method18636(0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 2.0f);
        this.field24138.method18642(2.5f, 17.0f, -1.5f);
        (this.field24139 = new Class6300(this, 15, 16)).method18636(-2.5f, -1.0f, 0.0f, 5.0f, 1.0f, 1.0f);
        this.field24139.method18642(0.0f, 17.0f, -2.5f);
        this.field24139.field25183 = 0.7853982f;
        (this.field24140 = new Class6300(this, 10, 16)).method18636(-2.5f, -1.0f, -1.0f, 5.0f, 1.0f, 1.0f);
        this.field24140.method18642(0.0f, 17.0f, 2.5f);
        this.field24140.field25183 = -0.7853982f;
        (this.field24141 = new Class6300(this, 8, 16)).method18636(-1.0f, -5.0f, 0.0f, 1.0f, 5.0f, 1.0f);
        this.field24141.method18642(-2.5f, 22.0f, -2.5f);
        this.field24141.field25184 = -0.7853982f;
        (this.field24142 = new Class6300(this, 8, 16)).method18636(-1.0f, -5.0f, 0.0f, 1.0f, 5.0f, 1.0f);
        this.field24142.method18642(-2.5f, 22.0f, 2.5f);
        this.field24142.field25184 = 0.7853982f;
        (this.field24143 = new Class6300(this, 4, 16)).method18636(0.0f, -5.0f, 0.0f, 1.0f, 5.0f, 1.0f);
        this.field24143.method18642(2.5f, 22.0f, 2.5f);
        this.field24143.field25184 = -0.7853982f;
        (this.field24144 = new Class6300(this, 0, 16)).method18636(0.0f, -5.0f, 0.0f, 1.0f, 5.0f, 1.0f);
        this.field24144.method18642(2.5f, 22.0f, -2.5f);
        this.field24144.field25184 = 0.7853982f;
        (this.field24145 = new Class6300(this, 8, 22)).method18636(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        this.field24145.method18642(0.5f, 22.0f, 2.5f);
        this.field24145.field25183 = 0.7853982f;
        (this.field24146 = new Class6300(this, 17, 21)).method18636(-2.5f, 0.0f, 0.0f, 5.0f, 1.0f, 1.0f);
        this.field24146.method18642(0.0f, 22.0f, -2.5f);
        this.field24146.field25183 = -0.7853982f;
    }
    
    @Override
    public Iterable<Class6300> method17570() {
        return (Iterable<Class6300>)ImmutableList.of(this.field24136, this.field24137, this.field24138, this.field24139, this.field24140, this.field24141, this.field24142, this.field24143, this.field24144, this.field24145, (Object)this.field24146);
    }
    
    @Override
    public void method17557(final T t, final float n, final float n2, final float n3, final float n4, final float n5) {
        this.field24137.field25185 = -0.2f + 0.4f * MathHelper.sin(n3 * 0.2f);
        this.field24138.field25185 = 0.2f - 0.4f * MathHelper.sin(n3 * 0.2f);
    }
}
