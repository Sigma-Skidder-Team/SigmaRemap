// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Vector3f;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.openal.AL10;

public class Class6379
{
    private static String[] field25489;
    private float field25490;
    
    public Class6379() {
        this.field25490 = 1.0f;
    }
    
    public void method19049(final Vec3d class5487) {
        AL10.alListener3f(4100, (float)class5487.x, (float)class5487.y, (float)class5487.z);
    }
    
    public void method19050(final Vector3f class9138, final Vector3f class9139) {
        AL10.alListenerfv(4111, new float[] { class9138.getX(), class9138.getY(), class9138.getZ(), class9139.getX(), class9139.getY(), class9139.getZ() });
    }
    
    public void method19051(final float field25490) {
        AL10.alListenerf(4106, field25490);
        this.field25490 = field25490;
    }
    
    public float method19052() {
        return this.field25490;
    }
    
    public void method19053() {
        this.method19049(Vec3d.ZERO);
        this.method19050(Vector3f.ZN, Vector3f.YP);
    }
}
