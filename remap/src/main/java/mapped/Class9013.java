// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import okhttp3.Call;
import okhttp3.OkHttpClient;

import java.net.UnknownHostException;
import java.net.MalformedURLException;
import javax.net.ssl.SSLSocket;
import java.net.Socket;

public abstract class Class9013
{
    public static Class9013 field38043;
    
    public static void method32278() {
        new OkHttpClient();
    }
    
    public abstract void method32264(final Class8640 p0, final String p1);
    
    public abstract void method32265(final Class8640 p0, final String p1, final String p2);
    
    public abstract void method32266(final Class9176 p0, final Class8674 p1);
    
    public abstract Class5040 method32268(final Class8015 p0, final Class6353 p1, final StreamAllocation p2, final Class7465 p3);
    
    public abstract boolean method32269(final Class6353 p0, final Class6353 p1);
    
    public abstract Socket method32270(final Class8015 p0, final Class6353 p1, final StreamAllocation p2);
    
    public abstract void method32271(final Class8015 p0, final Class5040 p1);
    
    public abstract boolean method32267(final Class8015 p0, final Class5040 p1);
    
    public abstract Class9482 method32272(final Class8015 p0);
    
    public abstract int method32273(final Class9189 p0);
    
    public abstract void method32274(final Class8248 p0, final SSLSocket p1, final boolean p2);
    
    public abstract Class8846 method32275(final String p0) throws MalformedURLException, UnknownHostException;
    
    public abstract StreamAllocation method32276(final Call p0);
    
    public abstract Call method32277(final OkHttpClient p0, final Request p1);
}
