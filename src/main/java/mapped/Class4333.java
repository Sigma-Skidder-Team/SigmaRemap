// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.util.Collection;

public class Class4333 implements Class4252<Class5800>
{
    private int field19399;
    private byte field19400;
    private boolean field19401;
    private boolean field19402;
    private Class9323[] field19403;
    private int field19404;
    private int field19405;
    private int field19406;
    private int field19407;
    private byte[] field19408;
    
    public Class4333() {
    }
    
    public Class4333(final int field19399, final byte field19400, final boolean field19401, final boolean field19402, final Collection<Class9323> collection, final byte[] array, final int field19403, final int field19404, final int field19405, final int field19406) {
        this.field19399 = field19399;
        this.field19400 = field19400;
        this.field19401 = field19401;
        this.field19402 = field19402;
        this.field19403 = collection.toArray(new Class9323[collection.size()]);
        this.field19404 = field19403;
        this.field19405 = field19404;
        this.field19406 = field19405;
        this.field19407 = field19406;
        this.field19408 = new byte[field19405 * field19406];
        for (int i = 0; i < field19405; ++i) {
            for (int j = 0; j < field19406; ++j) {
                this.field19408[i + j * field19405] = array[field19403 + i + (field19404 + j) * 128];
            }
        }
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19399 = class8654.method29501();
        this.field19400 = class8654.readByte();
        this.field19401 = class8654.readBoolean();
        this.field19402 = class8654.readBoolean();
        this.field19403 = new Class9323[class8654.method29501()];
        for (int i = 0; i < this.field19403.length; ++i) {
            this.field19403[i] = new Class9323(class8654.method29499(Class2095.class), class8654.readByte(), class8654.readByte(), (byte)(class8654.readByte() & 0xF), class8654.readBoolean() ? class8654.method29497() : null);
        }
        this.field19406 = class8654.readUnsignedByte();
        if (this.field19406 > 0) {
            this.field19407 = class8654.readUnsignedByte();
            this.field19404 = class8654.readUnsignedByte();
            this.field19405 = class8654.readUnsignedByte();
            this.field19408 = class8654.method29486();
        }
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.method29505(this.field19399);
        class8654.writeByte(this.field19400);
        class8654.writeBoolean(this.field19401);
        class8654.writeBoolean(this.field19402);
        class8654.method29505(this.field19403.length);
        for (final Class9323 class8655 : this.field19403) {
            class8654.method29500(class8655.method34523());
            class8654.writeByte(class8655.method34524());
            class8654.writeByte(class8655.method34525());
            class8654.writeByte(class8655.method34526() & 0xF);
            if (class8655.method34528() == null) {
                class8654.writeBoolean(false);
            }
            else {
                class8654.writeBoolean(true);
                class8654.method29498(class8655.method34528());
            }
        }
        class8654.writeByte(this.field19406);
        if (this.field19406 > 0) {
            class8654.writeByte(this.field19407);
            class8654.writeByte(this.field19404);
            class8654.writeByte(this.field19405);
            class8654.method29485(this.field19408);
        }
    }
    
    public void method12764(final Class5800 class5800) {
        class5800.method17320(this);
    }
    
    public int method13011() {
        return this.field19399;
    }
    
    public void method13012(final Class6356 class6356) {
        class6356.field25425 = this.field19400;
        class6356.field25423 = this.field19401;
        class6356.field25427 = this.field19402;
        class6356.field25431.clear();
        for (int i = 0; i < this.field19403.length; ++i) {
            class6356.field25431.put("icon-" + i, this.field19403[i]);
        }
        for (int j = 0; j < this.field19406; ++j) {
            for (int k = 0; k < this.field19407; ++k) {
                class6356.field25426[this.field19404 + j + (this.field19405 + k) * 128] = this.field19408[j + k * this.field19406];
            }
        }
    }
}
