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
            Config.method28847("Checking for new version");
            final HttpURLConnection httpURLConnection = (HttpURLConnection)new URL("http://optifine.net/version/1.15.2/HD_U.txt").openConnection();
            if (Config.method28962().field23426) {
                httpURLConnection.setRequestProperty("OF-MC-Version", "1.15.2");
                httpURLConnection.setRequestProperty("OF-MC-Brand", "" + Class7932.method25729());
                httpURLConnection.setRequestProperty("OF-Edition", "HD_U");
                httpURLConnection.setRequestProperty("OF-Release", "G1_pre18");
                httpURLConnection.setRequestProperty("OF-Java-Version", "" + System.getProperty("java.version"));
                httpURLConnection.setRequestProperty("OF-CpuCount", "" + Config.method28969());
                httpURLConnection.setRequestProperty("OF-OpenGL-Version", "" + Config.field36018);
                httpURLConnection.setRequestProperty("OF-OpenGL-Vendor", "" + Config.field36020);
            }
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(false);
            httpURLConnection.connect();
            try {
                final InputStream inputStream = httpURLConnection.getInputStream();
                final String method28959 = Config.method28959(inputStream);
                inputStream.close();
                final String[] method28960 = Config.method28937(method28959, "\n\r");
                if (method28960.length >= 1) {
                    final String trim = method28960[0].trim();
                    Config.method28847("Version found: " + trim);
                    if (Config.method28965(trim, "G1_pre18") <= 0) {
                        return;
                    }
                    Config.method28964(trim);
                }
            }
            finally {
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            }
        }
        catch (final Exception ex) {
            Config.method28847(ex.getClass().getName() + ": " + ex.getMessage());
        }
    }
}
