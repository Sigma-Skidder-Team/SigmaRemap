// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

import java.util.Locale;

public class Class6912 implements Class6909
{
    public static final Class6912 field27101;
    public static final Class6382<Class6912> field27102;
    private final float field27103;
    private final float field27104;
    private final float field27105;
    private final float field27106;
    
    public Class6912(final float field27103, final float field27104, final float field27105, final float n) {
        this.field27103 = field27103;
        this.field27104 = field27104;
        this.field27105 = field27105;
        this.field27106 = MathHelper.clamp(n, 0.01f, 4.0f);
    }
    
    @Override
    public void method21273(final PacketBuffer class8654) {
        class8654.writeFloat(this.field27103);
        class8654.writeFloat(this.field27104);
        class8654.writeFloat(this.field27105);
        class8654.writeFloat(this.field27106);
    }
    
    @Override
    public String method21274() {
        return String.format(Locale.ROOT, "%s %.2f %.2f %.2f %.2f", Registry.field222.getKey(this.method21272()), this.field27103, this.field27104, this.field27105, this.field27106);
    }
    
    @Override
    public Class6907<Class6912> method21272() {
        return Class8432.field34611;
    }
    
    public float method21277() {
        return this.field27103;
    }
    
    public float method21278() {
        return this.field27104;
    }
    
    public float method21279() {
        return this.field27105;
    }
    
    public float method21280() {
        return this.field27106;
    }
    
    static {
        field27101 = new Class6912(1.0f, 0.0f, 0.0f, 1.0f);
        field27102 = new Class6384();
    }
}
