// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList$Builder;
import java.util.Arrays;
import com.google.common.collect.ImmutableList;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class Class5885<T extends Entity> extends Class5846<T>
{
    private static String[] field24156;
    private final Class6300[] field24157;
    private final Class6300 field24158;
    private final ImmutableList<Class6300> field24159;
    
    public Class5885() {
        (this.field24158 = new Class6300(this, 0, 0)).method18636(-4.0f, -4.0f, -4.0f, 8.0f, 8.0f, 8.0f);
        this.field24157 = new Class6300[12];
        for (int i = 0; i < this.field24157.length; ++i) {
            (this.field24157[i] = new Class6300(this, 0, 16)).method18636(0.0f, 0.0f, 0.0f, 2.0f, 8.0f, 2.0f);
        }
        final ImmutableList$Builder builder = ImmutableList.builder();
        builder.add((Object)this.field24158);
        builder.addAll((Iterable)Arrays.asList(this.field24157));
        this.field24159 = (ImmutableList<Class6300>)builder.build();
    }
    
    @Override
    public Iterable<Class6300> method17570() {
        return (Iterable<Class6300>)this.field24159;
    }
    
    @Override
    public void method17557(final T t, final float n, final float n2, final float n3, final float n4, final float n5) {
        float n6 = n3 * 3.1415927f * -0.1f;
        for (int i = 0; i < 4; ++i) {
            this.field24157[i].field25181 = -2.0f + MathHelper.cos((i * 2 + n3) * 0.25f);
            this.field24157[i].field25180 = MathHelper.cos(n6) * 9.0f;
            this.field24157[i].field25182 = MathHelper.sin(n6) * 9.0f;
            ++n6;
        }
        float n7 = 0.7853982f + n3 * 3.1415927f * 0.03f;
        for (int j = 4; j < 8; ++j) {
            this.field24157[j].field25181 = 2.0f + MathHelper.cos((j * 2 + n3) * 0.25f);
            this.field24157[j].field25180 = MathHelper.cos(n7) * 7.0f;
            this.field24157[j].field25182 = MathHelper.sin(n7) * 7.0f;
            ++n7;
        }
        float n8 = 0.47123894f + n3 * 3.1415927f * -0.05f;
        for (int k = 8; k < 12; ++k) {
            this.field24157[k].field25181 = 11.0f + MathHelper.cos((k * 1.5f + n3) * 0.5f);
            this.field24157[k].field25180 = MathHelper.cos(n8) * 5.0f;
            this.field24157[k].field25182 = MathHelper.sin(n8) * 5.0f;
            ++n8;
        }
        this.field24158.field25184 = n4 * 0.017453292f;
        this.field24158.field25183 = n5 * 0.017453292f;
    }
}
