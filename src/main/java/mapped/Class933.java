// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.InputStream;
import java.net.URL;
import java.net.HttpURLConnection;

public class Class933 extends Thread
{
    public Class933() {
        super("VersionCheck");
    }
    
    @Override
    public void run() {
        try {
            Class8571.method28847("Checking for new version");
            final HttpURLConnection httpURLConnection = (HttpURLConnection)new URL("http://optifine.net/version/1.15.2/HD_U.txt").openConnection();
            if (Class8571.method28962().field23426) {
                httpURLConnection.setRequestProperty("OF-MC-Version", "1.15.2");
                httpURLConnection.setRequestProperty("OF-MC-Brand", "" + Class7932.method25729());
                httpURLConnection.setRequestProperty("OF-Edition", "HD_U");
                httpURLConnection.setRequestProperty("OF-Release", "G1_pre18");
                httpURLConnection.setRequestProperty("OF-Java-Version", "" + System.getProperty("java.version"));
                httpURLConnection.setRequestProperty("OF-CpuCount", "" + Class8571.method28969());
                httpURLConnection.setRequestProperty("OF-OpenGL-Version", "" + Class8571.field36018);
                httpURLConnection.setRequestProperty("OF-OpenGL-Vendor", "" + Class8571.field36020);
            }
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(false);
            httpURLConnection.connect();
            try {
                final InputStream inputStream = httpURLConnection.getInputStream();
                final String method28959 = Class8571.method28959(inputStream);
                inputStream.close();
                final String[] method28960 = Class8571.method28937(method28959, "\n\r");
                if (method28960.length >= 1) {
                    final String trim = method28960[0].trim();
                    Class8571.method28847("Version found: " + trim);
                    if (Class8571.method28965(trim, "G1_pre18") <= 0) {
                        return;
                    }
                    Class8571.method28964(trim);
                }
            }
            finally {
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            }
        }
        catch (final Exception ex) {
            Class8571.method28847(ex.getClass().getName() + ": " + ex.getMessage());
        }
    }
}
