// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.net.UnknownHostException;
import java.net.MalformedURLException;
import javax.net.ssl.SSLSocket;
import java.net.Socket;

public final class Class9012 extends Class9013
{
    private static String[] field38042;
    
    @Override
    public void method32264(final Class8640 class8640, final String s) {
        class8640.method29376(s);
    }
    
    @Override
    public void method32265(final Class8640 class8640, final String s, final String s2) {
        class8640.method29379(s, s2);
    }
    
    @Override
    public void method32266(final Class9176 class9176, final Class8674 class9177) {
        class9176.method33508(class9177);
    }
    
    @Override
    public boolean method32267(final Class8015 class8015, final Class5040 class8016) {
        return class8015.method26267(class8016);
    }
    
    @Override
    public Class5040 method32268(final Class8015 class8015, final Class6353 class8016, final Class8904 class8017, final Class7465 class8018) {
        return class8015.method26264(class8016, class8017, class8018);
    }
    
    @Override
    public boolean method32269(final Class6353 class6353, final Class6353 class6354) {
        return class6353.method18900(class6354);
    }
    
    @Override
    public Socket method32270(final Class8015 class8015, final Class6353 class8016, final Class8904 class8017) {
        return class8015.method26265(class8016, class8017);
    }
    
    @Override
    public void method32271(final Class8015 class8015, final Class5040 class8016) {
        class8015.method26266(class8016);
    }
    
    @Override
    public Class9482 method32272(final Class8015 class8015) {
        return class8015.field33018;
    }
    
    @Override
    public int method32273(final Class9189 class9189) {
        return class9189.field38934;
    }
    
    @Override
    public void method32274(final Class8248 class8248, final SSLSocket sslSocket, final boolean b) {
        class8248.method27348(sslSocket, b);
    }
    
    @Override
    public Class8846 method32275(final String s) throws MalformedURLException, UnknownHostException {
        return Class8846.method30962(s);
    }
    
    @Override
    public Class8904 method32276(final Class2305 class2305) {
        return ((Class2306)class2305).method9350();
    }
    
    @Override
    public Class2305 method32277(final Class2309 class2309, final Class8596 class2310) {
        return new Class2306(class2309, class2310, true);
    }
}
