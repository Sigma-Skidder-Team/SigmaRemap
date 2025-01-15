// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.security.PrivateKey;
import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import javax.crypto.SecretKey;

public class Class4341 implements Class4252<Class5802>
{
    private static String[] field19446;
    private byte[] field19447;
    private byte[] field19448;
    
    public Class4341() {
        this.field19447 = new byte[0];
        this.field19448 = new byte[0];
    }
    
    public Class4341(final SecretKey secretKey, final PublicKey publicKey, final byte[] array) {
        this.field19447 = new byte[0];
        this.field19448 = new byte[0];
        this.field19447 = Class9359.method34703(publicKey, secretKey.getEncoded());
        this.field19448 = Class9359.method34703(publicKey, array);
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19447 = class8654.method29486();
        this.field19448 = class8654.method29486();
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.method29485(this.field19447);
        class8654.method29485(this.field19448);
    }
    
    public void method12990(final Class5802 class5802) {
        class5802.method17389(this);
    }
    
    public SecretKey method13036(final PrivateKey privateKey) {
        return Class9359.method34702(privateKey, this.field19447);
    }
    
    public byte[] method13037(final PrivateKey privateKey) {
        return (privateKey != null) ? Class9359.method34704(privateKey, this.field19448) : this.field19448;
    }
}
