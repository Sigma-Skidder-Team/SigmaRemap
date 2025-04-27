// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.util.concurrent.CompletionException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.io.FileOutputStream;
import java.util.Date;
import java.text.SimpleDateFormat;
import org.apache.commons.io.IOUtils;
import java.io.Writer;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;
import org.apache.commons.lang3.ArrayUtils;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import com.google.common.collect.Lists;
import java.io.File;
import java.util.List;
import org.apache.logging.log4j.Logger;

public class CrashReport
{
    private static final Logger field30531;
    private final String field30532;
    private final Throwable field30533;
    private final CrashReportCategory field30534;
    private final List<CrashReportCategory> field30535;
    private File field30536;
    private boolean field30537;
    private StackTraceElement[] field30538;
    private boolean field30539;
    
    public CrashReport(final String field30532, final Throwable field30533) {
        this.field30534 = new CrashReportCategory(this, "System Details");
        this.field30535 = Lists.newArrayList();
        this.field30537 = true;
        this.field30538 = new StackTraceElement[0];
        this.field30539 = false;
        this.field30532 = field30532;
        this.field30533 = field30533;
        this.method24409();
    }
    
    private void method24409() {
        this.field30534.addDetail("Minecraft Version", () -> Class9528.method35579().getName());
        this.field30534.addDetail("Minecraft Version ID", () -> Class9528.method35579().getId());
        this.field30534.addDetail("Operating System", () -> System.getProperty("os.name") + " (" + System.getProperty("os.arch") + ") version " + System.getProperty("os.version"));
        this.field30534.addDetail("Java Version", () -> System.getProperty("java.version") + ", " + System.getProperty("java.vendor"));
        this.field30534.addDetail("Java VM Version", () -> System.getProperty("java.vm.name") + " (" + System.getProperty("java.vm.info") + "), " + System.getProperty("java.vm.vendor"));
        this.field30534.addDetail("Memory", () -> {
            Runtime.getRuntime();
            final Runtime runtime;
            runtime.maxMemory();
            runtime.totalMemory();
            runtime.freeMemory();
            final long lng;
            final long lng2;
            final long lng3;
            return lng + " bytes (" + lng / 1024L / 1024L + " MB) / " + lng2 + " bytes (" + lng2 / 1024L / 1024L + " MB) up to " + lng3 + " bytes (" + lng3 / 1024L / 1024L + " MB)";
        });
        this.field30534.addDetail("CPUs", Runtime.getRuntime().availableProcessors());
        this.field30534.addDetail("JVM Flags", () -> {
            final List<? super String> list = Util.method27846().collect((Collector<? super String, ?, List<? super String>>)Collectors.toList());
            return String.format("%d total; %s", list.size(), list.stream().collect(Collectors.joining(" ")));
        });
        if (Class9570.field41199 != null) {
            Class9570.field41199.method22608(this, this.field30534);
        }
    }
    
    public String method24410() {
        return this.field30532;
    }
    
    public Throwable method24411() {
        return this.field30533;
    }
    
    public void method24412(final StringBuilder sb) {
        if (this.field30538 == null || this.field30538.length <= 0) {
            if (!this.field30535.isEmpty()) {
                this.field30538 = (StackTraceElement[])ArrayUtils.subarray((Object[])this.field30535.get(0).method16303(), 0, 1);
            }
        }
        if (this.field30538 != null) {
            if (this.field30538.length > 0) {
                sb.append("-- Head --\n");
                sb.append("Thread: ").append(Thread.currentThread().getName()).append("\n");
                sb.append("Stacktrace:\n");
                final StackTraceElement[] field30538 = this.field30538;
                for (int length = field30538.length, i = 0; i < length; ++i) {
                    sb.append("\t").append("at ").append(field30538[i]);
                    sb.append("\n");
                }
                sb.append("\n");
            }
        }
        final Iterator<CrashReportCategory> iterator = this.field30535.iterator();
        while (iterator.hasNext()) {
            iterator.next().method16302(sb);
            sb.append("\n\n");
        }
        this.field30534.method16302(sb);
    }
    
    public String method24413() {
        StringWriter out = null;
        PrintWriter s = null;
        Throwable field30533 = this.field30533;
        if (field30533.getMessage() == null) {
            if (field30533 instanceof NullPointerException) {
                field30533 = new NullPointerException(this.field30532);
            }
            else if (field30533 instanceof StackOverflowError) {
                field30533 = new StackOverflowError(this.field30532);
            }
            else if (field30533 instanceof OutOfMemoryError) {
                field30533 = new OutOfMemoryError(this.field30532);
            }
            field30533.setStackTrace(this.field30533.getStackTrace());
        }
        if (Class9570.field41201.method22605()) {
            return Class9570.field41201.method22613(field30533);
        }
        String string;
        try {
            out = new StringWriter();
            s = new PrintWriter(out);
            field30533.printStackTrace(s);
            string = out.toString();
        }
        finally {
            IOUtils.closeQuietly(out);
            IOUtils.closeQuietly(s);
        }
        return string;
    }
    
    public String method24414() {
        if (!this.field30539) {
            this.field30539 = true;
            Class7651.method24236(this, this.field30534);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("---- Minecraft Crash Report ----\n");
        if (Class9570.field41200 != null) {
            if (Class9570.field41200.method22605()) {
                Class9570.field41200.method22608(sb, this);
            }
        }
        sb.append("// ");
        sb.append(method24420());
        sb.append("\n\n");
        sb.append("Time: ");
        sb.append(new SimpleDateFormat().format(new Date()));
        sb.append("\n");
        sb.append("Description: ");
        sb.append(this.field30532);
        sb.append("\n\n");
        sb.append(this.method24413());
        sb.append("\n\nA detailed walkthrough of the error, its code path and all known details is as follows:\n");
        for (int i = 0; i < 87; ++i) {
            sb.append("-");
        }
        sb.append("\n\n");
        this.method24412(sb);
        return sb.toString();
    }
    
    public File method24415() {
        return this.field30536;
    }
    
    public boolean method24416(final File file) {
        if (this.field30536 != null) {
            return false;
        }
        if (file.getParentFile() != null) {
            file.getParentFile().mkdirs();
        }
        Writer writer = null;
        boolean b;
        try {
            writer = new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8);
            writer.write(this.method24414());
            this.field30536 = file;
            return true;
        }
        catch (final Throwable t) {
            CrashReport.field30531.error("Could not save crash report to {}", file, t);
            b = false;
        }
        finally {
            IOUtils.closeQuietly(writer);
        }
        return b;
    }
    
    public CrashReportCategory method24417() {
        return this.field30534;
    }
    
    public CrashReportCategory makeCategory(final String s) {
        return this.makeCategoryDepth(s, 1);
    }
    
    public CrashReportCategory makeCategoryDepth(final String s, final int n) {
        final CrashReportCategory class5204 = new CrashReportCategory(this, s);
        try {
            if (this.field30537) {
                final int method16299 = class5204.method16299(n);
                final StackTraceElement[] stackTrace = this.field30533.getStackTrace();
                StackTraceElement stackTraceElement = null;
                StackTraceElement stackTraceElement2 = null;
                final int n2 = stackTrace.length - method16299;
                if (n2 < 0) {
                    System.out.println("Negative index in crash report handler (" + stackTrace.length + "/" + method16299 + ")");
                }
                if (stackTrace != null && 0 <= n2 && n2 < stackTrace.length) {
                    stackTraceElement = stackTrace[n2];
                    if (stackTrace.length + 1 - method16299 < stackTrace.length) {
                        stackTraceElement2 = stackTrace[stackTrace.length + 1 - method16299];
                    }
                }
                this.field30537 = class5204.method16300(stackTraceElement, stackTraceElement2);
                if (method16299 > 0 && !this.field30535.isEmpty()) {
                    this.field30535.get(this.field30535.size() - 1).method16301(method16299);
                }
                else if (stackTrace != null && stackTrace.length >= method16299 && 0 <= n2 && n2 < stackTrace.length) {
                    System.arraycopy(stackTrace, 0, this.field30538 = new StackTraceElement[n2], 0, this.field30538.length);
                }
                else {
                    this.field30537 = false;
                }
            }
        }
        catch (final Throwable t) {
            t.printStackTrace();
        }
        this.field30535.add(class5204);
        return class5204;
    }
    
    private static String method24420() {
        final String[] array = { "Who set us up the TNT?", "Everything's going to plan. No, really, that was supposed to happen.", "Uh... Did I do that?", "Oops.", "Why did you do that?", "I feel sad now :(", "My bad.", "I'm sorry, Dave.", "I let you down. Sorry :(", "On the bright side, I bought you a teddy bear!", "Daisy, daisy...", "Oh - I know what I did wrong!", "Hey, that tickles! Hehehe!", "I blame Dinnerbone.", "You should try our sister game, Minceraft!", "Don't be sad. I'll do better next time, I promise!", "Don't be sad, have a hug! <3", "I just don't know what went wrong :(", "Shall we play a game?", "Quite honestly, I wouldn't worry myself about that.", "I bet Cylons wouldn't have this problem.", "Sorry :(", "Surprise! Haha. Well, this is awkward.", "Would you like a cupcake?", "Hi. I'm Minecraft, and I'm a crashaholic.", "Ooh. Shiny.", "This doesn't make any sense!", "Why is it breaking :(", "Don't do that.", "Ouch. That hurt :(", "You're mean.", "This is a token for 1 free hug. Redeem at your nearest Mojangsta: [~~HUG~~]", "There are four lights!", "But it works on my machine." };
        try {
            return array[(int)(Util.method27838() % array.length)];
        }
        catch (final Throwable t) {
            return "Witty comment unavailable :(";
        }
    }
    
    public static CrashReport makeCrashReport(Throwable cause, final String s) {
        while (cause instanceof CompletionException && cause.getCause() != null) {
            cause = cause.getCause();
        }
        CrashReport method9500;
        if (!(cause instanceof ReportedException)) {
            method9500 = new CrashReport(s, cause);
        }
        else {
            method9500 = ((ReportedException)cause).method9500();
        }
        return method9500;
    }
    
    public static void method24422() {
        new CrashReport("Don't panic!", new Throwable()).method24414();
    }
    
    static {
        field30531 = LogManager.getLogger();
    }
}
