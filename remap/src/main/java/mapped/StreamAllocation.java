// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import okhttp3.OkHttpClient;

import java.lang.ref.Reference;
import java.net.Socket;
import java.io.IOException;

public final class StreamAllocation {
    public final Class6353 field37430;
    private Class7465 field37431;
    private final Class8015 field37432;
    private final Object field37433;
    private final Class8194 field37434;
    private int field37435;
    private Class5040 field37436;
    private boolean field37437;
    private boolean field37438;
    private Class7811 field37439;
    public static final /* synthetic */ boolean field37440;

    public StreamAllocation(final Class8015 field37432, final Class6353 field37433, final Object field37434) {
        this.field37432 = field37432;
        this.field37430 = field37433;
        this.field37434 = new Class8194(field37433, this.method31370());
        this.field37433 = field37434;
    }

    public Class7811 method31365(final OkHttpClient okHttpClient, final boolean b) {
        final int method9389 = okHttpClient.method9389();
        final int method9390 = okHttpClient.method9390();
        final int method9391 = okHttpClient.method9391();
        final boolean method9392 = okHttpClient.method9408();
        try {
            final Class7811 method9393 = this.method31366(method9389, method9390, method9391, method9392, b).method15343(okHttpClient, this);
            synchronized (this.field37432) {
                return this.field37439 = method9393;
            }
        } catch (final IOException ex) {
            throw new Class2384(ex);
        }
    }

    private Class5040 method31366(final int n, final int n2, final int n3, final boolean b, final boolean b2) throws IOException {
        Class5040 method31367;
        while (true) {
            method31367 = this.method31367(n, n2, n3, b);
            synchronized (this.field37432) {
                if (method31367.field21592 == 0) {
                    return method31367;
                }
            }
            if (method31367.method15346(b2)) {
                break;
            }
            this.method31373();
        }
        return method31367;
    }

    private Class5040 method31367(final int n, final int n2, final int n3, final boolean b) throws IOException {
        Class7465 class7465;
        synchronized (this.field37432) {
            if (this.field37437) {
                throw new IllegalStateException("released");
            }
            if (this.field37439 != null) {
                throw new IllegalStateException("codec != null");
            }
            if (this.field37438) {
                throw new IOException("Canceled");
            }
            final Class5040 field37436 = this.field37436;
            if (field37436 != null && !field37436.field21591) {
                return field37436;
            }
            Class9013.field38043.method32268(this.field37432, this.field37430, this, null);
            if (this.field37436 != null) {
                return this.field37436;
            }
            class7465 = this.field37431;
        }
        if (class7465 == null) {
            class7465 = this.field37434.method27129();
        }
        Class5040 field37437;
        synchronized (this.field37432) {
            if (this.field37438) {
                throw new IOException("Canceled");
            }
            Class9013.field38043.method32268(this.field37432, this.field37430, this, class7465);
            if (this.field37436 != null) {
                this.field37431 = class7465;
                return this.field37436;
            }
            this.field37431 = class7465;
            this.field37435 = 0;
            field37437 = new Class5040(this.field37432, class7465);
            this.method31377(field37437);
        }
        field37437.method15334(n, n2, n3, b);
        this.method31370().method35306(field37437.method15329());
        Socket method32270 = null;
        synchronized (this.field37432) {
            Class9013.field38043.method32271(this.field37432, field37437);
            if (field37437.method15349()) {
                method32270 = Class9013.field38043.method32270(this.field37432, this.field37430, this);
                field37437 = this.field37436;
            }
        }
        Class7690.method24433(method32270);
        return field37437;
    }

    public void method31368(final boolean b, final Class7811 obj) {
        final Socket method31374;
        synchronized (this.field37432) {
            if (obj == null || obj != this.field37439) {
                throw new IllegalStateException("expected " + this.field37439 + " but was " + obj);
            }
            if (!b) {
                final Class5040 field37436 = this.field37436;
                ++field37436.field21592;
            }
            method31374 = this.method31374(b, false, true);
        }
        Class7690.method24433(method31374);
    }

    public Class7811 method31369() {
        synchronized (this.field37432) {
            return this.field37439;
        }
    }

    private Class9482 method31370() {
        return Class9013.field38043.method32272(this.field37432);
    }

    public synchronized Class5040 method31371() {
        return this.field37436;
    }

    public void method31372() {
        final Socket method31374;
        synchronized (this.field37432) {
            method31374 = this.method31374(false, true, false);
        }
        Class7690.method24433(method31374);
    }

    public void method31373() {
        final Socket method31374;
        synchronized (this.field37432) {
            method31374 = this.method31374(true, false, false);
        }
        Class7690.method24433(method31374);
    }

    private Socket method31374(final boolean b, final boolean b2, final boolean b3) {
        if (!StreamAllocation.field37440 && !Thread.holdsLock(this.field37432)) {
            throw new AssertionError();
        }
        if (b3) {
            this.field37439 = null;
        }
        if (b2) {
            this.field37437 = true;
        }
        Socket method15330 = null;
        if (this.field37436 != null) {
            if (b) {
                this.field37436.field21591 = true;
            }
            if (this.field37439 == null) {
                if (this.field37437 || this.field37436.field21591) {
                    this.method31378(this.field37436);
                    if (this.field37436.field21594.isEmpty()) {
                        this.field37436.field21595 = System.nanoTime();
                        if (Class9013.field38043.method32267(this.field37432, this.field37436)) {
                            method15330 = this.field37436.method15330();
                        }
                    }
                    this.field37436 = null;
                }
            }
        }
        return method15330;
    }

    public void method31375() {
        final Class7811 field37439;
        final Class5040 field37440;
        synchronized (this.field37432) {
            this.field37438 = true;
            field37439 = this.field37439;
            field37440 = this.field37436;
        }
        if (field37439 != null) {
            field37439.method25228();
        } else if (field37440 != null) {
            field37440.method15345();
        }
    }

    public void method31376(final IOException ex) {
        boolean b = false;
        final Socket method31374;
        synchronized (this.field37432) {
            if (ex instanceof Class2353) {
                final Class2353 class2353 = (Class2353) ex;
                if (class2353.field14137 == Class2082.field12043) {
                    ++this.field37435;
                }
                if (class2353.field14137 != Class2082.field12043 || this.field37435 > 1) {
                    b = true;
                    this.field37431 = null;
                }
            } else if (this.field37436 != null && (!this.field37436.method15349() || ex instanceof Class2352)) {
                b = true;
                if (this.field37436.field21592 == 0) {
                    if (this.field37431 != null && ex != null) {
                        this.field37434.method27130(this.field37431, ex);
                    }
                    this.field37431 = null;
                }
            }
            method31374 = this.method31374(b, false, true);
        }
        Class7690.method24433(method31374);
    }

    public void method31377(final Class5040 field37436) {
        if (!StreamAllocation.field37440 && !Thread.holdsLock(this.field37432)) {
            throw new AssertionError();
        }
        if (this.field37436 == null) {
            this.field37436 = field37436;
            field37436.field21594.add(new Class2(this, this.field37433));
            return;
        }
        throw new IllegalStateException();
    }

    private void method31378(final Class5040 class5040) {
        for (int i = 0; i < class5040.field21594.size(); ++i) {
            if (class5040.field21594.get(i).get() == this) {
                class5040.field21594.remove(i);
                return;
            }
        }
        throw new IllegalStateException();
    }

    public Socket method31379(final Class5040 field37436) {
        if (!StreamAllocation.field37440 && !Thread.holdsLock(this.field37432)) {
            throw new AssertionError();
        }
        if (this.field37439 == null && this.field37436.field21594.size() == 1) {
            final Reference reference = this.field37436.field21594.get(0);
            final Socket method31374 = this.method31374(true, false, false);
            this.field37436 = field37436;
            field37436.field21594.add(reference);
            return method31374;
        }
        throw new IllegalStateException();
    }

    public boolean method31380() {
        return this.field37431 != null || this.field37434.method27128();
    }

    @Override
    public String toString() {
        final Class5040 method31371 = this.method31371();
        return (method31371 == null) ? this.field37430.toString() : method31371.toString();
    }

    static {
        field37440 = !StreamAllocation.class.desiredAssertionStatus();
    }
}
