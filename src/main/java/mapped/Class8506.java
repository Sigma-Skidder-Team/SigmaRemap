// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Class8506 extends Class8505
{
    public static String field34905;
    
    @Override
    public String method28418() {
        if (Class8506.field34905 != null) {
            return Class8506.field34905;
        }
        final Runtime runtime = Runtime.getRuntime();
        Process exec;
        try {
            exec = runtime.exec(new String[] { "/usr/sbin/system_profiler", "SPHardwareDataType" });
        }
        catch (final IOException cause) {
            throw new RuntimeException(cause);
        }
        final OutputStream outputStream = exec.getOutputStream();
        final InputStream inputStream = exec.getInputStream();
        try {
            outputStream.close();
        }
        catch (final IOException cause2) {
            throw new RuntimeException(cause2);
        }
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        final String s = "Serial Number";
        try {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains(s)) {
                    Class8506.field34905 = line.split(":")[1].trim();
                    break;
                }
            }
        }
        catch (final IOException cause3) {
            throw new RuntimeException(cause3);
        }
        finally {
            try {
                inputStream.close();
            }
            catch (final IOException cause4) {
                throw new RuntimeException(cause4);
            }
        }
        if (Class8506.field34905 == null) {
            throw new RuntimeException("Cannot find computer SN");
        }
        return Class8506.field34905;
    }
}
