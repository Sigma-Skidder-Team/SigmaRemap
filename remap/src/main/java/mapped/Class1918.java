// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.util.Pair;
import net.minecraft.client.renderer.Matrix4f;

import java.nio.ByteBuffer;
import java.util.concurrent.CompletableFuture;

public class Class1918 implements AutoCloseable
{
    private static String[] field10422;
    private int field10423;
    private final Class9272 field10424;
    private int field10425;
    private Class8871 field10426;
    private Class9009 field10427;
    private int field10428;
    
    public Class1918(final Class9272 field10424) {
        this.field10424 = field10424;
        RenderSystem.method30115(n -> this.field10423 = n);
    }
    
    public void method7587() {
        Class8933.method31551(34962, this.field10423);
    }
    
    public void method7588(final BufferBuilder class4148) {
        if (RenderSystem.method29984()) {
            this.method7590(class4148);
        }
        else {
            RenderSystem.method29991(() -> this.method7590(class4148));
        }
    }
    
    public CompletableFuture<Void> method7589(final BufferBuilder class4148) {
        if (RenderSystem.method29984()) {
            this.method7590(class4148);
            return CompletableFuture.completedFuture((Void)null);
        }
        return CompletableFuture.runAsync(() -> this.method7590(class4149), runnable -> RenderSystem.method29991(runnable::run));
    }
    
    private void method7590(final BufferBuilder class4148) {
        final Pair<Class8127, ByteBuffer> method12401 = class4148.method12401();
        if (this.field10426 == null) {
            if (this.field10423 != -1) {
                final ByteBuffer byteBuffer = (ByteBuffer)method12401.getSecond();
                this.field10425 = byteBuffer.remaining() / this.field10424.method34194();
                this.method7587();
                RenderSystem.method30089(34962, byteBuffer, 35044);
                method7592();
            }
        }
        else {
            this.field10426.method31167((ByteBuffer)method12401.getSecond(), this.field10427);
        }
    }
    
    public void method7591(final Matrix4f class6789, int field10428) {
        RenderSystem.pushMatrix();
        RenderSystem.method30058();
        RenderSystem.method30067(class6789);
        if (this.field10428 > 0) {
            field10428 = this.field10428;
        }
        if (this.field10426 == null) {
            RenderSystem.method30071(field10428, 0, this.field10425);
        }
        else {
            this.field10426.method31174(field10428, this.field10427);
        }
        RenderSystem.popMatrix();
    }
    
    public static void method7592() {
        Class8933.method31551(34962, 0);
    }
    
    @Override
    public void close() {
        if (this.field10423 >= 0) {
            RenderSystem.method30090(this.field10423);
            this.field10423 = -1;
        }
    }
    
    public void method7593(final Class8871 field10426) {
        if (field10426 != null) {
            this.close();
            this.field10426 = field10426;
            this.field10427 = new Class9009();
        }
    }
    
    public Class8871 method7594() {
        return this.field10426;
    }
    
    public Class9009 method7595() {
        return this.field10427;
    }
    
    public int method7596() {
        return this.field10428;
    }
    
    public void method7597(final int field10428) {
        this.field10428 = field10428;
    }
}
