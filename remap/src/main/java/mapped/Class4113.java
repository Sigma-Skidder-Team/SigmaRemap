// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class Class4113 implements Class4114
{
    private static String[] field18218;
    private int field18219;
    private final int field18220;
    
    public Class4113(final int n, final int n2) {
        this.field18219 = GL11.glGenTextures();
        this.field18220 = 15;
        final byte[] method12361 = this.method12361(n, n2);
        final ByteBuffer byteBuffer = BufferUtils.createByteBuffer(method12361.length);
        byteBuffer.put(method12361);
        byteBuffer.flip();
        Class8933.method31617(this.field18219);
        Class8969.method31850();
        GL11.glTexImage2D(3553, 0, 6407, n, n2, 0, 6407, 5121, byteBuffer);
        GL11.glTexParameteri(3553, 10242, 10497);
        GL11.glTexParameteri(3553, 10243, 10497);
        GL11.glTexParameteri(3553, 10240, 9729);
        GL11.glTexParameteri(3553, 10241, 9729);
        Class8933.method31617(0);
    }
    
    public int method12357() {
        return this.field18219;
    }
    
    @Override
    public void method12358() {
        Class8933.method31616(this.field18219);
        this.field18219 = 0;
    }
    
    private int method12359(int n) {
        n ^= n << 13;
        n ^= n >> 17;
        n ^= n << 5;
        return n;
    }
    
    private byte method12360(final int n, final int n2, final int n3) {
        return (byte)(this.method12359((this.method12359(n) + this.method12359(n2 * 19)) * this.method12359(n3 * 23) - n3) % 128);
    }
    
    private byte[] method12361(final int n, final int n2) {
        final byte[] array = new byte[n * n2 * 3];
        int n3 = 0;
        for (int i = 0; i < n2; ++i) {
            for (int j = 0; j < n; ++j) {
                for (int k = 1; k < 4; ++k) {
                    array[n3++] = this.method12360(j, i, k);
                }
            }
        }
        return array;
    }
    
    @Override
    public int method12362() {
        return this.field18219;
    }
    
    @Override
    public int method12363() {
        return this.field18220;
    }
}
