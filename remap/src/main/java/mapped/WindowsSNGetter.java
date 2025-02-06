// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.auth.SerialNumberGetter;

import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.IOException;

public class WindowsSNGetter extends SerialNumberGetter
{
    public static String serialNumber;
    
    @Override
    public String getSerialNumber() {
        if (WindowsSNGetter.serialNumber != null) {
            return WindowsSNGetter.serialNumber;
        }
        try {
            final Runtime runtime = Runtime.getRuntime();
            Process exec = null;
            try {
                exec = runtime.exec(new String[] { "wmic", "bios", "get", "serialnumber" });
            }
            catch (final IOException ex) {
                WindowsSNGetter.serialNumber = "IOEXCEPTION";
            }
            exec.getOutputStream();
            final InputStream inputStream = exec.getInputStream();
            final Scanner scanner = new Scanner(inputStream);
            try {
                while (scanner.hasNext()) {
                    final String next = scanner.next();
                    try {
                        if ("SerialNumber".equals(next)) {
                            WindowsSNGetter.serialNumber = scanner.next().trim();
                            break;
                        }
                        continue;
                    }
                    catch (final NoSuchElementException ex2) {
                        WindowsSNGetter.serialNumber = "NoSuchElement";
                    }
                }
            }
            finally {
                inputStream.close();
            }
            if (WindowsSNGetter.serialNumber == null) {
                WindowsSNGetter.serialNumber = "Serial Number Failed";
            }
        }
        catch (final IOException ex3) {
            ex3.printStackTrace();
        }
        return WindowsSNGetter.serialNumber = WindowsSNGetter.serialNumber + " " + System.getProperty("user.name") + " " + System.getProperty("user.home");
    }
}
