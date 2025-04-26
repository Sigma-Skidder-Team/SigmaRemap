// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3;

import mapped.*;

import java.util.ArrayList;
import java.io.IOException;

public final class RealCall implements Call {
    public final OkHttpClient client;
    public final RetryAndFollowUpInterceptor retryAndFollowUpInterceptor;
    public final Class8648 field13980;
    public final Request originalRequest;
    public final boolean forWebSocket;
    private boolean executed;

    public RealCall(final OkHttpClient okHttpClient, final Request retryAndFollowUpInterceptor, final boolean z) {
        final Class8856 clazz = okHttpClient.method9414();
        this.client = okHttpClient;
        this.originalRequest = retryAndFollowUpInterceptor;
        this.forWebSocket = z;
        this.retryAndFollowUpInterceptor = new RetryAndFollowUpInterceptor(okHttpClient, z);
        this.field13980 = clazz.method31009(this);
    }

    @Override
    public Request request() {
        return this.originalRequest;
    }

    @Override
    public Response execute() throws IOException {
        synchronized (this) {
            if (this.executed) {
                throw new IllegalStateException("Already Executed");
            }
            this.executed = true;
        }
        this.captureCallStackTrace();
        try {
            this.client.dispatcher().executed(this);
            final Response responseWithInterceptorChain = this.getResponseWithInterceptorChain();
            if (responseWithInterceptorChain == null) {
                throw new IOException("Canceled");
            }
            return responseWithInterceptorChain;
        } finally {
            this.client.dispatcher().finished(this);
        }
    }

    private void captureCallStackTrace() {
        this.retryAndFollowUpInterceptor.method20864(Class6550.method19842().method19848("response.body().close()"));
    }

    @Override
    public void enqueue(final Callback callback) {
        synchronized (this) {
            if (this.executed) {
                throw new IllegalStateException("Already Executed");
            }
            this.executed = true;
        }
        this.captureCallStackTrace();
        this.client.dispatcher().enqueue(new AsyncCall(this, callback));
    }

    @Override
    public void cancel() {
        this.retryAndFollowUpInterceptor.cancel();
    }

    @Override
    public synchronized boolean method9347() {
        return this.executed;
    }

    @Override
    public boolean isCanceled() {
        return this.retryAndFollowUpInterceptor.isCanceled();
    }

    @Override
    public RealCall clone() {
        return new RealCall(this.client, this.originalRequest, this.forWebSocket);
    }

    public StreamAllocation method9350() {
        return this.retryAndFollowUpInterceptor.streamAllocation();
    }

    public String toLoggableString() {
        return (this.isCanceled() ? "canceled " : "") + (this.forWebSocket ? "web socket" : "call") + " to " + this.redactedUrl();
    }

    public String redactedUrl() {
        return this.originalRequest.url().redact();
    }

    public Response getResponseWithInterceptorChain() throws IOException {
        final ArrayList list = new ArrayList();
        list.addAll(this.client.interceptors());
        list.add(this.retryAndFollowUpInterceptor);
        list.add(new BridgeInterceptor(this.client.cookieJar()));
        list.add(new CacheInterceptor(this.client.internalCache()));
        list.add(new ConnectInterceptor(this.client));
        if (!this.forWebSocket) {
            list.addAll(this.client.networkInterceptors());
        }
        list.add(new CallServerInterceptor(this.forWebSocket));
        return new RealInterceptorChain(list, null, null, null, 0, this.originalRequest).proceed(this.originalRequest);
    }

    public final class AsyncCall extends NamedRunnable
    {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final Callback responseCallback;

        AsyncCall(Callback callback) {
            super("OkHttp %s", RealCall.this.redactedUrl());
            this.responseCallback = callback;
        }

        public String host() {
            return RealCall.this.originalRequest.url().host();
        }

        public Request request() {
            return RealCall.this.originalRequest;
        }

        public RealCall get() {
            return RealCall.this;
        }

        @Override
        public void execute() {
            boolean b = false;
            try {
                final Response method9353 = RealCall.this.originalRequest.getResponseWithInterceptorChain();
                if (RealCall.this.originalRequest.retryAndFollowUpInterceptor.isCanceled()) {
                    b = true;
                    this.responseCallback.method19086(RealCall.this.originalRequest, new IOException("Canceled"));
                }
                else {
                    b = true;
                    this.responseCallback.method19085(RealCall.this.originalRequest, method9353);
                }
            }
            catch (final IOException ex) {
                if (b) {
                    Class6550.method19842().method19846(4, "Callback failure for " + RealCall.this.originalRequest.toLoggableString(), ex);
                }
                else {
                    this.responseCallback.method19086(RealCall.this.originalRequest, ex);
                }
            }
            finally {
                RealCall.this.originalRequest.client.dispatcher().method32094(this);
            }
        }
    }
}
