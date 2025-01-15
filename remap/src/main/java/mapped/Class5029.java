// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.time.Duration;
import org.apache.logging.log4j.LogManager;
import java.util.function.Supplier;
import java.util.function.IntSupplier;
import org.apache.logging.log4j.Logger;

public class Class5029 implements IProfiler
{
    private static final Logger field21550;
    private static final long field21551;
    private final IntSupplier field21552;
    private final Class6505 field21553;
    private final Class6505 field21554;
    private boolean field21555;
    private boolean field21556;
    private boolean field21557;
    private static final String field21558 = "scheduledExecutables";
    private static final String field21559 = "tick";
    private static final String field21560 = "sound";
    private static final String field21561 = "render";
    private static final String field21562 = "display";
    private static final int field21563;
    private static final int field21564;
    private static final int field21565;
    private static final int field21566;
    private static final int field21567;
    
    public Class5029(final IntSupplier field21552) {
        this.field21553 = new Class6505(this, null);
        this.field21554 = new Class6505(this, null);
        this.field21555 = false;
        this.field21556 = false;
        this.field21557 = false;
        this.field21552 = field21552;
    }
    
    public Class6504 method15305() {
        return this.field21553;
    }
    
    @Override
    public void method15295() {
        this.field21555 = (Class869.method5277().method5327() == this);
        this.field21556 = (this.field21555 && Class9036.method32483());
        this.field21557 = (this.field21555 && Class8571.method28953());
        this.field21553.field25880.method15295();
        this.field21554.field25880.method15295();
    }
    
    @Override
    public void method15296() {
        this.field21553.field25880.method15296();
        this.field21554.field25880.method15296();
    }
    
    @Override
    public void method15297(final String s) {
        if (this.field21556) {
            final int hashCode = s.hashCode();
            if (hashCode == Class5029.field21563 && s.equals("scheduledExecutables")) {
                Class9036.field38221.method26344();
            }
            else if (hashCode == Class5029.field21564) {
                if (s.equals("tick")) {
                    if (Class8571.method28834()) {
                        Class9036.field38221.method26345();
                        Class9036.field38220.method26344();
                    }
                }
            }
        }
        if (this.field21557) {
            final int hashCode2 = s.hashCode();
            if (hashCode2 == Class5029.field21566 && s.equals("render")) {
                Class8933.field37568 = false;
            }
            else if (hashCode2 == Class5029.field21567) {
                if (s.equals("display")) {
                    Class8933.field37568 = true;
                }
            }
        }
        this.field21553.field25880.method15297(s);
        this.field21554.field25880.method15297(s);
    }
    
    @Override
    public void method15298(final Supplier<String> supplier) {
        this.field21553.field25880.method15298(supplier);
        this.field21554.field25880.method15298(supplier);
    }
    
    @Override
    public void method15299() {
        this.field21553.field25880.method15299();
        this.field21554.field25880.method15299();
    }
    
    @Override
    public void method15300(final String s) {
        if (this.field21556) {
            if (s.hashCode() == Class5029.field21565) {
                if (s.equals("sound")) {
                    Class9036.field38220.method26345();
                }
            }
        }
        this.field21553.field25880.method15300(s);
        this.field21554.field25880.method15300(s);
    }
    
    @Override
    public void method15301(final Supplier<String> supplier) {
        this.field21553.field25880.method15301(supplier);
        this.field21554.field25880.method15301(supplier);
    }
    
    @Override
    public void method15302(final String s) {
        this.field21553.field25880.method15302(s);
        this.field21554.field25880.method15302(s);
    }
    
    @Override
    public void method15303(final Supplier<String> supplier) {
        this.field21553.field25880.method15303(supplier);
        this.field21554.field25880.method15303(supplier);
    }
    
    static {
        field21550 = LogManager.getLogger();
        field21551 = Duration.ofMillis(300L).toNanos();
        field21563 = Class5029.\ube7a\u707f\u3122\uf9ba\u5a21\u7998[0].hashCode();
        field21564 = Class5029.\ube7a\u707f\u3122\uf9ba\u5a21\u7998[1].hashCode();
        field21565 = Class5029.\ube7a\u707f\u3122\uf9ba\u5a21\u7998[4].hashCode();
        field21566 = Class5029.\ube7a\u707f\u3122\uf9ba\u5a21\u7998[2].hashCode();
        field21567 = Class5029.\ube7a\u707f\u3122\uf9ba\u5a21\u7998[3].hashCode();
    }
}
