// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.auth.SerialNumberGetter;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class LinuxSNGetter extends SerialNumberGetter
{
    public static String serialNumber;
    
    @Override
    public String getSerialNumber() {
        if (LinuxSNGetter.serialNumber == null) {
            method28420();
        }
        if (LinuxSNGetter.serialNumber == null) {
            method28419();
        }
        if (LinuxSNGetter.serialNumber != null) {
            return LinuxSNGetter.serialNumber;
        }
        throw new RuntimeException("Cannot find computer SN");
    }
    
    private static void method28419() {
        final String s = "system.hardware.serial =";
        BufferedReader method28421 = null;
        try {
            method28421 = method28421("lshal");
            String line;
            while ((line = method28421.readLine()) != null) {
                if (line.indexOf(s) != -1) {
                    LinuxSNGetter.serialNumber = line.split(s)[1].replaceAll("\\(string\\)|(\\')", "").trim();
                    break;
                }
            }
        }
        catch (final IOException cause) {
            throw new RuntimeException(cause);
        }
        finally {
            if (method28421 != null) {
                try {
                    method28421.close();
                }
                catch (final IOException cause2) {
                    throw new RuntimeException(cause2);
                }
            }
        }
    }
    
    private static void method28420() {
        final String s = "Serial Number:";
        BufferedReader method28421 = null;
        try {
            method28421 = method28421("dmidecode -t system");
            String line;
            while ((line = method28421.readLine()) != null) {
                if (line.indexOf(s) != -1) {
                    LinuxSNGetter.serialNumber = line.split(s)[1].trim();
                    break;
                }
            }
        }
        catch (final IOException cause) {
            throw new RuntimeException(cause);
        }
        finally {
            if (method28421 != null) {
                try {
                    method28421.close();
                }
                catch (final IOException cause2) {
                    throw new RuntimeException(cause2);
                }
            }
        }
    }
    
    private static BufferedReader method28421(final String s) {
        final Runtime runtime = Runtime.getRuntime();
        Process exec;
        try {
            exec = runtime.exec(s.split(" "));
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
        return new BufferedReader(new InputStreamReader(inputStream));
    }
}
