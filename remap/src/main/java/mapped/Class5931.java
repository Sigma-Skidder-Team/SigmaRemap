// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

public class Class5931<T extends Entity> extends Class5839<T>
{
    private static String[] field24400;
    
    public Class5931() {
        super(12, 0.0f, false, 10.0f, 4.0f, 2.0f, 2.0f, 24);
        (this.field23936 = new Class6300(this, 0, 0)).method18638(-4.0f, -4.0f, -6.0f, 8.0f, 8.0f, 6.0f, 0.0f);
        this.field23936.method18642(0.0f, 4.0f, -8.0f);
        this.field23936.method18634(22, 0).method18638(-5.0f, -5.0f, -4.0f, 1.0f, 3.0f, 1.0f, 0.0f);
        this.field23936.method18634(22, 0).method18638(4.0f, -5.0f, -4.0f, 1.0f, 3.0f, 1.0f, 0.0f);
        (this.field23937 = new Class6300(this, 18, 4)).method18638(-6.0f, -10.0f, -7.0f, 12.0f, 18.0f, 10.0f, 0.0f);
        this.field23937.method18642(0.0f, 5.0f, 2.0f);
        this.field23937.method18634(52, 0).method18636(-2.0f, 2.0f, -8.0f, 4.0f, 6.0f, 1.0f);
        final Class6300 field23938 = this.field23938;
        --field23938.field25180;
        final Class6300 field23939 = this.field23939;
        ++field23939.field25180;
        final Class6300 field23940 = this.field23938;
        field23940.field25182 += 0.0f;
        final Class6300 field23941 = this.field23939;
        field23941.field25182 += 0.0f;
        final Class6300 field23942 = this.field23940;
        --field23942.field25180;
        final Class6300 field23943 = this.field23941;
        ++field23943.field25180;
        final Class6300 field23944 = this.field23940;
        --field23944.field25182;
        final Class6300 field23945 = this.field23941;
        --field23945.field25182;
    }
    
    public Class6300 method17803() {
        return this.field23936;
    }
}
