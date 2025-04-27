// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL11;
import java.nio.ByteBuffer;

public class Class4116 implements Class4114
{
    private static String[] field18228;
    private final Class347 field18229;
    private final int field18230;
    private int field18231;
    
    public Class4116(final Class347 field18229, final Class2110 class2110, final int n, final int n2, final int n3, final Class2010 class2111, final Class2127 class2112, final ByteBuffer byteBuffer, final int field18230) {
        this.field18229 = field18229;
        this.field18230 = field18230;
        this.field18231 = GL11.glGenTextures();
        GL11.glBindTexture(this.method12364(), this.field18231);
        Class8969.method31850();
        switch (Class9137.field38714[field18229.ordinal()]) {
            case 1: {
                GL11.glTexImage1D(3552, 0, class2110.method8234(), n, 0, class2111.method8047(), class2112.method8283(), byteBuffer);
                GL11.glTexParameteri(3552, 10242, 33071);
                GL11.glTexParameteri(3552, 10240, 9729);
                GL11.glTexParameteri(3552, 10241, 9729);
                break;
            }
            case 2: {
                GL11.glTexImage2D(3553, 0, class2110.method8234(), n, n2, 0, class2111.method8047(), class2112.method8283(), byteBuffer);
                GL11.glTexParameteri(3553, 10242, 33071);
                GL11.glTexParameteri(3553, 10243, 33071);
                GL11.glTexParameteri(3553, 10240, 9729);
                GL11.glTexParameteri(3553, 10241, 9729);
                break;
            }
            case 3: {
                GL20.glTexImage3D(32879, 0, class2110.method8234(), n, n2, n3, 0, class2111.method8047(), class2112.method8283(), byteBuffer);
                GL11.glTexParameteri(32879, 10242, 33071);
                GL11.glTexParameteri(32879, 10243, 33071);
                GL11.glTexParameteri(32879, 32882, 33071);
                GL11.glTexParameteri(32879, 10240, 9729);
                GL11.glTexParameteri(32879, 10241, 9729);
                break;
            }
            case 4: {
                GL11.glTexImage2D(34037, 0, class2110.method8234(), n, n2, 0, class2111.method8047(), class2112.method8283(), byteBuffer);
                GL11.glTexParameteri(34037, 10242, 33071);
                GL11.glTexParameteri(34037, 10243, 33071);
                GL11.glTexParameteri(34037, 10240, 9729);
                GL11.glTexParameteri(34037, 10241, 9729);
                break;
            }
        }
        GL11.glBindTexture(this.method12364(), 0);
    }
    
    @Override
    public int method12364() {
        return this.field18229.method1029();
    }
    
    @Override
    public int method12362() {
        return this.field18231;
    }
    
    @Override
    public int method12363() {
        return this.field18230;
    }
    
    @Override
    public void method12358() {
        if (this.field18231 > 0) {
            GL11.glDeleteTextures(this.field18231);
            this.field18231 = 0;
        }
    }
}
